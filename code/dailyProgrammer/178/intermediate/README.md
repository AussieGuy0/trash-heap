# Jumping through Hyperspace ain't like dusting Crops
<div class="md"><h1>Description:</h1>
<p>You are navigator aboard the Space Pirate Bob's spaceship the Centennial Condor. Operation of the spaceship requires fuel. Bob wants to calculate a round trip to the deepest planet from his given amount of fuel he is willing to buy for a smuggling run to earn some space credits.</p>
<p>As navigator you need to compute the deepest planet you can make a jump to and back. Space Pirate Bob was too cheap to buy the Mark 2 spaceship navigation package for you. So you will have to improvise and code your own program to solve his problem.</p>
<p>Oh and by the way, the Space Pirate does not like to brack track on his routes. So the jump route to the planet cannot be the same one you take back (The Federation of Good Guy Planets will be patrolling the route you take to the planet to smuggle goods to catch you)</p>
<p>Good Luck, may the Code be with you.</p>
<h1>Star Map:</h1>
<p>You will be given a star map in the series of planet letters and fuel cost. If you take the jump route (in any direction) between these planets your spaceship will expend that many units of full. The star map has you start off on Planet A. You will need to see how far from A you can get given your below input of fuel.</p>
<p>The star map has the follow pairs of planets with a jump route between them and the number represents how much fuel you spend if you use it.</p>
<pre><code>A B 1
A C 1
B C 2
B D 2
C D 1
C E 2
D E 2
D F 2
D G 1
E G 1
E H 1
F I 4 
F G 3
G J 2
G H 3
H K 3
I J 2
I K 2
</code></pre>
<h1>input:</h1>
<p>A value N that represents how many units the Space Pirate Bob is willing to spend his space credits on to fuel the Centennial Condor for its smuggling run. </p>
<h2>Example:</h2>
<p>5</p>
<h1>Output:</h1>
<p>The deepest route from A to a planet and back not using the same jump route (planets could be duplicated but the route back has to be unique as the one you use to get to the destination is patrolled) Display the planet and then the To route and Back route. </p>
<p>If no route is found - print an error message. If there is a tie, have your program decide which one to show (only 1 is needed not all)</p>
<h2>example (using the input of 5 above):</h2>
<pre><code>Planet D
To: A-C-D
Back: D-B-A
</code></pre>
<h1>Challenge Inputs:</h1>
<p>Look for routes for these fuel amounts:</p>
<ul>
<li>5 </li>
<li>8</li>
<li>16</li>
</ul>
</div>
