# ASCII Bird
<div class="md"><h1>Description:</h1>
<p>In the news lately there has been a lot of press about a game called Flappy Bird. I have noticed many people have rushed to make clones of this game. </p>
<p>For those who want to know more about the game <a href="http://en.wikipedia.org/wiki/Flappy_Bird">Click here for wikipedia</a></p>
<p>So I thought we need to join in on the craze and come up with our own version of Flappy Bird. ASCII Bird. It is flappy bird with ASCII.</p>
<p>More or less you control a bird flying through randomly generated obstacles scrolling right to left at you. You decide when the bird flaps to gain height and if you don't do anything he will fall. If he falls to the ground or hits an obstacle the game is over. For every obstacle he flys over or under with success he gains a point. </p>
<h1>Input:</h1>
<p>We will take a single input from the player of the game. A number between 0-4. This represents the "flap" for our bird. The value would represent how high we like our bird to move. </p>
<h1>Output:</h1>
<p>This is mostly a visual challenge. After we get the input we have to show the map. </p>
<ul>
<li>@ = our bird</li>
<li>. = empty space</li>
<li># = obstacle.</li>
</ul>
<p>The board will be 10 rows high by 20 columns.</p>
<h2>example:</h2>
<pre><code>..........#.......#.
..........#.......#.
..........#.........
..........#.........
.@........#.........
....................
......#.............
......#........#....
......#........#....
......#........#....

(score 0) 0-4?
</code></pre>
<p>After you enter a number the forward velocity of the bird will be 2 columns. In those 2 columns you must move the bird based on the velocity. If you typed 1-4 then the board shifts over 2 columns and the bird will go up that many (if it wants to go above the top row it will not) </p>
<p>If you type a 0 instead our bird will decay his flight by 2 rows down. </p>
<p>If flappy bird flys over or under an obstacle he will advance his score by 1 point. If he goes below the bottom row on  a decay or makes contact with a obstacle he will die and the game is over (display the final score - maybe ask to play again)</p>
<p>The board is updated 2 columns at a time. You have to keep track of it. Randomly every 7-10 columns on either top or bottom you will generate an obstacle that is 2-4 in height hanging from the top or coming up from the bottom. Once you spawn an obstacle the next will spawn 7-10 columns away. (note each top and bottom needs to be tracked separate and are not related. This can create for some interesting maps)</p>
<h2>example after typing a 2 for our move with above then 2 moves of a 0</h2>
<pre><code>........#.......#...
........#.......#...
.@......#...........
........#...........
........#...........
....................
....#...............
....#........#......
....#........#......
....#........#......

(score 0) 0-4?

......#.......#...
......#.......#...
......#...........
......#...........
.@....#...........
..................
..#...............
..#........#......
..#........#......
..#........#......

(score 0) 0-4?


....#.......#.....
....#.......#.....
....#.............
....#.............
....#.............
..................
#@...............#
#........#.......#
#........#.......#
#........#.......#

(score 1) 0-4?
</code></pre>
<p>Our bird spawns in the middle of the rows in height and as above should have 1 column behind him. He will pretty much just move up or down in that column as the board "shifts" its display right to left and generating the obstacles as needed.</p>
<h1>Notes:</h1>
<p>As always if you got questions/concerns post away and we can tackle it.</p>
<h1>Extra Challenge:</h1>
<p>Make it graphical and go from ASCII Bird to Flappy Bird.</p>
</div>