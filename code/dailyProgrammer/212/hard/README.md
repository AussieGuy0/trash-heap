# Reverse Maze Pathfinding
<div class="md"><h1><a href="#HardIcon"></a> <em>(Hard)</em>: Reverse Maze Pathfinding</h1>
<p>We recently saw a maze traversal challenge, where the aim is to find the path through the maze, given the start and end point. Today, however, we're going to do the reverse. You'll be given the maze, and the path from point A to point B as a series of steps and turns, and you'll need to find all the potential candidates for points A and B.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>You'll first be given a number <strong>N</strong>, which is the number of lines of maze to read. Next, read a further <strong>N</strong> lines of input, containing the maze - a space character describes a place in the maze, and any other non-whitespace character describes a wall. For example:</p>
<pre><code>6
xxxxxxxxx
x   x   x
x x x x x
x x x x x
x x   x x
xxxxxxxxx
</code></pre>
<p>Is exactly equivalent to:</p>
<pre><code>6
ERTY*$TW*
f   &amp;   q
@ " @ ` w
' : ; { e
# ^   m r
topkektop
</code></pre>
<p>(the width of the maze might be anything - you might want to detect this by looking at the width of the first line.)</p>
<p>Finally, you'll be given the path through the maze. The path is contained on a single line, and consists of three possible moves:</p>
<ul>
<li>Turn left, represented by the letter <code>l</code>.</li>
<li>Turn right, represented by the letter <code>r</code>.</li>
<li>Move forward <em>n</em> spaces, represented by <em>n</em>.</li>
</ul>
<p>An example path might look like <code>3r11r9l2rr5</code>, which means to move forward 3 times, turn right, move forward 11 times, turn right, move forward 9 times, turn left, move forward twice, turn right twice and then move forward 5 times. <strong>This path may start pointing in any direction.</strong></p>
<h2>Output Description</h2>
<p>Output the set of possible start and end points, like so: (this example doesn't correspond to the above sample maze.)</p>
<pre><code>From (0, 0) to (2, 4)
From (2, 4) to (0, 0)
From (3, 1) to (5, 5)
</code></pre>
<p>This means that, if you were to travel from any of the given start points to the corresponding end point, the path you take (with the correct initial facing direction) will be the one given in the input.</p>
<p>(Where <code>(0, 0)</code> is the top-left corner of the maze.)</p>
<h1>Sample Inputs and Outputs</h1>
<h2>Sample 1</h2>
<h3>Input</h3>
<pre><code>5
xxx
x x
x x
x x
xxx
2rr2ll2
</code></pre>
<h3>Output</h3>
<pre><code>From (1, 3) to (1, 1)
From (1, 1) to (1, 3)
</code></pre>
<h2>Sample 2</h2>
<h3>Input</h3>
<pre><code>9
xxxxxxxxx
x       x
xxx x x x
x   x x x
xxx xxx x
x     x x
x xxx x x
x       x
xxxxxxxxx
2r2r2
</code></pre>
<h3>Output</h3>
<pre><code>From (3, 7) to (3, 5)
From (7, 5) to (5, 5)
From (3, 5) to (3, 7)
From (5, 3) to (7, 3)
From (3, 3) to (5, 3)
From (1, 3) to (1, 5)
From (1, 1) to (1, 3)
</code></pre>
<h2>Sample 3</h2>
<h3>Input</h3>
<pre><code>5
xxxxxxxxx
x   x   x
x x x x x
x   x   x
xxxxxxxxx
2r2r2
</code></pre>
<h3>Output</h3>
<pre><code>From (7, 3) to (7, 1)
From (5, 3) to (7, 3)
From (3, 3) to (3, 1)
From (1, 3) to (3, 3)
From (7, 1) to (5, 1)
From (5, 1) to (5, 3)
From (3, 1) to (1, 1)
From (1, 1) to (1, 3)
</code></pre>
<h2>Sample 4</h2>
<h3>Input</h3>
<pre><code>5
xxxxxxx
x   x x
x x x x
x x   x
xxxxxxx
1l2l2
</code></pre>
<h3>Output</h3>
<pre><code>From (3, 2) to (1, 3)
From (3, 2) to (5, 1)
</code></pre>
<h2>Sample 5</h2>
<p>This is a large maze, so the input's on Gist instead.</p>
<h3><a href="https://gist.githubusercontent.com/Quackmatic/6119dc82b3cfda54f072/raw/maze-mega.txt">Input</a></h3>
<h3>Output</h3>
<pre><code>From (1, 9) to (9, 5)
From (137, 101) to (145, 97)
From (169, 53) to (173, 61)
From (211, 121) to (207, 113)
From (227, 33) to (219, 37)
</code></pre>
<h2>Sample 6</h2>
<p>This is another large one.</p>
<h3><a href="https://gist.githubusercontent.com/Quackmatic/7c548fbe4ccff2c08b5f/raw/maze-long.txt">Input</a></h3>
<h3><a href="https://gist.githubusercontent.com/Quackmatic/c1361bcebfdd50874f20/raw/maze-long-out.txt">Output</a></h3>
<p>Each line of your solution's output for this input should be repeated 4 times, as the path is fully symmetrical.</p>
<h1>Notes</h1>
<p>Remember that you can start a path facing in any of four directions, so one starting point might lead to multiple ending points if you start facing different directions - see sample four.</p>
</div>
