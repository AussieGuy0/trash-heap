# Snake-Fill
<div class="md"><h1><a href="#HardIcon"></a> <em>(Hard)</em>: Snake-Fill</h1>
<p>The snake-fill algorithm is a "fictional" algorithm where you must fill a given 2D board, with some minimal obstacles, with a "snake". This "snake" always starts in the top-left corner and can move in any directly-adjacent direction (north, east, south, west) one step at a time. This snake is also infinitely long: once it has moved over a tile on the board, the tile is "filled" with the snakes body. A snake cannot revisit a tile: it is unable to traverse a tile that it has already traversed. Essentially this is the same logic that controls a snake during a <a href="http://en.wikipedia.org/wiki/Snake_(video_game)">game of snake</a>.</p>
<p>Your goal is to take a board definition, as described below, and then attempt to fill it as best as possible with a snake's body while respecting the snake's movement rules!</p>
<p><em>Author: nint22</em></p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>You will be first given two integers on a single line through standard input. They represent the width and height, respectively, of the board you are to attempt to fill. On the next line, you will be given an integer N, which represents the following N lines of obstacle definitions. Obstacles are pairs of integers that represent the X and Y coordinate, respectively, of an impassable (blocked) tile. Any impassable block does not allow snake movement over it. Note that the origin (0, 0) is in the top-left of the board, and positive X grows to the right while positive Y grows to the bottom. Thus, the biggest valid coordinate would be (Width - 1, Height - 1).</p>
<h2>Output Description</h2>
<p>First, print the number of tiles filled and then the number of tiles total: do <em>not</em> count occluded (blocked) tiles. Remember, the more tiles filled by your snake, the more correct your solution is. Then, for each movement your snake has done in its attempt to fill the board, print the position is has moved to. This has to be listed in correct and logical order: one should be able to verify your solution by just running through this data again.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<p><a href="http://i.imgur.com/WclGAwX.png">The following inputs generates this board configuration</a>. Note that the darker blocks are occluded (blocked) tiles.</p>
<pre><code>10 10
5
3 0
3 1
3 2
4 1
5 1
</code></pre>
<h2>Sample Output</h2>
<p>Note: The following is dummy-data: it is NOT the correct solution from the above sample input. Blame nint22: he is a gentlemen whom is short on time.</p>
<pre><code>95 / 95
0 0
0 1
1 1
... (See note)
</code></pre>
<h1>Challenge Input</h1>
<p>None given</p>
<h2>Challenge Input Solution</h2>
<p>None given</p>
<h1>Note</h1>
<p>As per usual: this challenge may seem easy, but is quite complex as the movement rules limit any sort of "tricks" one could do for optimizations. Anyone who does some sort of graphical <strong>and</strong> animated version of their results get a +1 silver for their flair!</p>
</div>
