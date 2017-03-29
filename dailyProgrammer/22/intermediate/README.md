<div class="md"><p>Orginal post by somebody from reddit.com/cpp</p>
<p>I always found that games make for fun learning projects.</p>
<p>One of my favorite projects for beginners is to make a 2D (top down) maze style game using text to represent the map and the player. Print out a 20x20 (or whatever size floats your boat) grid of characters where '#' characters represent impassible walls, and spaces or '.' characters represent empty passable spaces. Draw the player in place of one of the passable characters as a + sign, or some other distinct character. Every time the player presses an arrow key, check and see if the adjacent grid square is a passable square. If so, update the player's position and reprint the 20x20 map with the + sign in the new position.</p>
<p>What makes this project great is you can get more and more advanced with it as you progress:</p>
<p>*Come up with an initial victory condition. Maybe if the player moves from a starting square to a ending square on the map, he wins</p>
<p>*Maybe you can add some monsters (^ characters or something) which will kill the player if they land on the same square. Every time you reprint the map update the monster positions so that they try to move into the player's square.</p>
<p>*If you want to get more advanced, build in a loop that will keep printing the map and let the monsters update position even if the player hasn't pressed a key</p>
<p>*Maybe you want to add more levels so that when the player reaches the end point on the map, a new map loads</p>
<p>*Maybe you want to make the map bigger than 20x20 characters, but you only want to display 20x20 characters of the map at a time and simply change what portion of the larger map is printed as the player moves around</p>
<p>*Maybe you want the player to be able to shoot some kind of projectile (maybe a '@' character) at the monsters</p>
<p>for a bonus use file IO learning by creating the maps in text files and then reading them in when loading too.</p>
<ul>
<li>thanks to Keslol for todays challenge!</li>
</ul>
</div>
