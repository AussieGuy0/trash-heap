# Code or Treat - Halloween 2014
<div class="md"><h1>Description:</h1>
<p>Happy Halloween. For Today's challenge we will go off our typical path and do a special challenge posting. I have come up with 2 challenges. One will be [Easy] the other [Intermediate]. They do have a Halloween theme and it is intended to be a bit light hearted in our typical approach to challenges. Have fun :)</p>
<h1>[Easy] Bag Inventory:</h1>
<h2>Description:</h2>
<p>So to help out all the trick or treaters we need to develop a tool to help inventory their candy haul for the night. You will be given a text file that contains a listing of every piece of candy in the bag. Your challenge is to develop a solution to inventory the candy and print out a summary of how much candy you got.</p>
<p>You must answer these basic questions</p>
<ul>
<li>How many pieces of candy did you get</li>
<li>How much of each type</li>
<li>What percentage of total candy does that type occupy</li>
</ul>
<h2>Input:</h2>
<p>Use this gist listing as your text file to represent your bag of candy.
<a href="https://gist.github.com/coderd00d/54215798871d0c356cfb">Candy Bag Link</a></p>
<h2>Output:</h2>
<p>You must answer the basic questions. How you display it and present it we leave to the programmer to decide. Some suggestions could be a text output. Perhaps you do a histogram or pie chart. Maybe show a real time tally as you go through the bag counting the candy and display it as a gif for all to enjoy.</p>
<h1>[Intermediate] - The Coding Dead</h1>
<h2>Description:</h2>
<p>Zombie lore has been very popular in the recent years. We are entertained by the stories of the dead coming back to life as a zombie and the struggle of human to survive the zombie horde. In Zombie lore it is common that if you are bitten by a zombie you become a zombie. This behavior works much like a plague. The zombie grow in numbers and the living must deal with them by usually do a fatal wound to the zombie's brain/spinal cord. </p>
<p>We will explore this plague of zombies by creating  zombie simulator. This simulator will randomly populate a map and have 3 types of entities: Zombies, Victims and hunters.</p>
<ul>
<li>Zombies -- The walking dead back to life. They will roam looking to bite victims to turn them into zombies.</li>
<li>Victims -- Innocent humans who are not trained in Zombie lore and have no skills or knowledge to fight back.</li>
<li>Hunters -- Trained humans in Zombie lore who seek out to destroy Zombies to save the planet.</li>
</ul>
<h2>Simulation Map</h2>
<p>Our simulation will run on a 20x20 Map. Each spot can occupy Either a Zombie, Victim, Hunter or be an empty space. You need to develop a way to support this map and to be able to create the map by randomly placing a set amount of starting Zombies, Victims or Hunters. Only 1 entity per a space.</p>
<h2>Input</h2>
<p>You will feed your simulation 4 numbers. x y z t</p>
<ul>
<li>x - how many zombies to randomly spawn</li>
<li>y - how many victims to randomly spawn</li>
<li>z - how many hunters to randomly spawn.</li>
<li>t - how many "ticks" of time to run the simulation</li>
</ul>
<h2>Map Error Checking:</h2>
<p>So on a 20x20 map you have 400 spots. If x+y+z &gt; 400 you will return an error. You cannot create a map that holds more than it can hold.</p>
<h2>Simulation</h2>
<p>Our simulation will have a "tick". This is a unknown unit of time. But in this time actions occur as follows to define our simulation.</p>
<ul>
<li>Movement</li>
<li>Zombie slaying</li>
<li>Bite</li>
</ul>
<h2>Movement</h2>
<p>Movement occurs for all our life forms. If the life forms try to move and the space is occupied they will just continue to occupy their current location.</p>
<ul>
<li><p>Zombies -- will try to move 1 space. They will either move up, down, left or right. Zombies are not able to move diagonal. They just cannot handle such a movement.</p></li>
<li><p>Victims -- typically do not move. However, if they are next to a zombie (up, down, left, right or diagonal) they will try to move 1 square. Note they might end up in a square next to the zombie again or a new zombie. The panic of movement and being a "victim" does not mean they make the optimal move.</p></li>
<li><p>Hunters - Will move to 1 new spot in any direction (up, down, left, right, diagonal) to seek and find a zombie to destroy.</p></li>
</ul>
<h2>Zombie Slaying</h2>
<p>Once movement occurs if a hunter is next to in any direction (up, down, left, right, diagonal) to a zombie he will slay a zombie. If the hunter is next to two zombies he will slay two zombies. However if the hunter is next to three or more zombies he will only be able to slay two of them. Just not enough time to kill more than two. When you slay a zombie you remove it off our map.</p>
<h2>Bite</h2>
<p>Zombies will bite a non-zombie if they are (up, down, left, right) of a non-zombie. They will not be able to bite at a diagonal to represent the simple mind of the zombie. Victims or Hunters can be bitten. Once bitten the Victim or Hunter becomes a zombie. You will change them into a Zombie. </p>
<h2>Data</h2>
<p>We want to gather data during the simulation. Each time an entity changes spots in movement we record this distance by entity.</p>
<ul>
<li>Zombie Stumble Units - number of spots zombies moved too</li>
<li>Victim Flee Units - number of spots victims moved too</li>
<li>Hunter Seek Units - number of spots hunters moved too.</li>
</ul>
<p>We will maintain a population number. We will know our original population because we are given those numbers.
As time goes on we want to record the final population of all 3 entities. Also we want to record some basic events.</p>
<ul>
<li>Number of "Single" kills by hunter (killing only 1 zombie a turn)</li>
<li>Number of "Double" kills by a hunter (killing 2 zombies a turn)</li>
<li>Total zombies killed by Hunters</li>
<li>Number of Victims bitten</li>
<li>Number of Hunters bitten</li>
<li>Total number of non-zombies bitten</li>
</ul>
<h2>Output</h2>
<p>The programmer should output at the end of the simulation a report of what happened.</p>
<ul>
<li>Output the x y z t values. So your starting populations and how many ticks the simulator ran</li>
<li>Output all the Data above in the data</li>
<li>You will show the final population counts of your entities. </li>
</ul>
<h2>Final</h2>
<p>With all this data we can compute a decay rate. Either the zombie population is decaying or the non-zombie population is decaying. If the decay difference is within 5 then the population is a balance. So for example if 100 zombies are killed but 95 are created it is a balance. (The difference between killed zombies and bites was 5 or less) However if the decay difference is more than 5 in favor of bites the Zombies Win. If the decay difference is more than 5 in favor of the Hunters then the Humans win. </p>
<p>You will decide who wins the simulation. Humans, Zombies or a tie.</p>
<h2>Now have fun</h2>
<p>Using different x y z and t values try to see if you can get a balance For a total population (x + y + z) for the following numbers of (x + y + z)</p>
<ul>
<li>100</li>
<li>200</li>
<li>300</li>
</ul>
<h1>Message From the Mods</h1>
<p>From the Moderator Staff of <a href="/r/dailyprogrammer">/r/dailyprogrammer</a> enjoy your 2014 Halloween :) Thank you for your participation in our subreddit.</p>
</div>
