# Kakuro Solver
<div class="md"><h1>Description</h1>
<p>Kakuro is a popular Japanese logic puzzle sometimes called a mathematical crossword. The objective of the puzzle is to insert a digit from 1 to 9 inclusive into each white cell such that the sum of the numbers in each entry matches the clue associated with it and that no digit is duplicated in any contiguous row or column. It is that lack of duplication that makes creating Kakuro puzzles with unique solutions possible. Numbers in cells elsewhere in the grid may be reused.</p>
<p>More background on Kakuro can be found on <a href="https://en.wikipedia.org/wiki/Kakuro">Wikipedia</a>. There's an <a href="http://www.kakuroconquest.com/">online version</a> you can play as well. </p>
<h1>Input Description</h1>
<p>You'll be given a pair of integers showing you the number of columns and rows (respectively) for the game puzzle. Then you'll be given <em>col</em> + <em>row</em> lines with the sum and the cell identifiers as <em>col id</em> and <em>row number</em>. Example:</p>
<pre><code>1 2
3 A1 A2
</code></pre>
<p>This example means that the sum of two values in A1 and A2 should equal 3. </p>
<h1>Challenge Output</h1>
<p>Your program should emit the puzzle as a 2D grid of numbers, with columns as letters (e.g. A, B, C) and rows as numbers (1, 2, 3). Example:</p>
<pre><code>  A
1 1
2 2
</code></pre>
<h1>Challenge Input</h1>
<p>This puzzle is a 2x3 matrix. Note that it has non-unique solutions.</p>
<pre><code>2 3 
13 A1 A2 A3
8 B1 B2 B3
6 A1 B1
6 A2 B2
9 A3 B3
</code></pre>
<h1>Challenge Output</h1>
<p>One possible solution for the above puzzle is</p>
<pre><code>  A  B 
1 5  1
2 2  4
3 6  3
</code></pre>
</div>
