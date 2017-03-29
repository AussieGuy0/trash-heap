# Free Flow Solver
<div class="md"><h1>Description</h1>
<p>Flow Free is a game that consists of an n*m grid with some cells that have a color (the other cells are initially empty). For every colored cell, there is exactly one other cell on the grid that has the same color -- there can't be 3 cells with the same color, or a cell that is unique in its color.</p>
<p>The objective of the player is to connect all the matching colors in the grid, by making "pipes" between them, that go through empty cells.</p>
<p>The pipes must not cross or overlap, and they have to cover the whole board.</p>
<p><a href="http://i.imgur.com/xLQXz.jpg">Here</a>'s an example of a Flow Free puzzle (to the left) and its solution (right). For additional clarification, <a href="https://www.youtube.com/watch?v=83g8pDQg_Ng">Here</a>'s somebody solving some puzzles.</p>
<p>Your objective is to write a program that, given a Flow Free puzzle, outputs its solution.</p>
<h1>Formal Inputs and Outputs</h1>
<p>We will represent the positions of the grid using Cartesian coordinates: the upper leftmost cell is (0, 0), and the cell that is located n cells to the right of it and m cells underneath it, is called (n, m).</p>
<h2>Input Description</h2>
<p>The first line consists 3 numbers, <em>A</em>, <em>N</em>, and <em>M</em>, separated by space. <em>A</em> is the number of colors, <em>N</em> is the width of the grid and <em>M</em> is its height.
The next <em>A</em> lines specify the matching cells - each line contains two cartesian coordinates (for matching cells), separated by a space <code>(x1, y1) (x2, y2)</code>.</p>
<p>Example (for <a href="http://i.imgur.com/xLQXz.jpg">the puzzle</a> that was previously given as an example):</p>
<pre><code>5 5 5
(1, 0) (0, 3)
(2, 0) (0, 4)
(3, 0) (3, 4)
(3, 1) (2, 2)
(2, 4) (3, 3)
</code></pre>
<h2>Output Description</h2>
<p>The output consists of <em>A</em> lines, each line is a sequence of some cartesian coordinates (separated by a space), that specifies the path of a pipe between two matching cells.</p>
<p>The first and last cells of an output line are the matching cells that were initially colored, everything between them consists of the cells of the pipe. The order of the output's lines doesn't matter - it doesn't have to correspond to the input.</p>
<p>Possible example output (Again, the lines don't have to be sorted in a certain way):</p>
<pre><code>(2, 0) (2, 1) (1, 1) (1, 2) (1, 3) (1, 4) (0, 4)
(1, 0) (0, 0) (0, 1) (0, 2) (0, 3)
(3, 0) (4, 0) (4, 1) (4, 2) (4, 3) (4, 4) (3, 4)
(2, 4) (2, 3) (3, 3)
(3, 1) (3, 2) (2, 2)
</code></pre>
<h1>Credit</h1>
<p>This challenge was suggested by <a href="/u/Avnerium">/u/Avnerium</a>. If you have a challenge idea, please share it in <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and there's a good chance we'll use it.</p>
</div>
