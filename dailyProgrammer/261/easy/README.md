# verifying 3x3 magic squares
<div class="md"><h1>Description</h1>
<p>A 3x3 magic square is a 3x3 grid of the numbers 1-9 such that each row, column, and major diagonal adds up to 15. Here's an example:</p>
<pre><code>8 1 6
3 5 7
4 9 2
</code></pre>
<p>The major diagonals in this example are 8 + 5 + 2 and 6 + 5 + 4. (Magic squares have appeared here on <a href="/r/dailyprogrammer">r/dailyprogrammer</a> before, in <a href="https://www.reddit.com/r/dailyprogrammer/comments/v3agk/6152012_challenge_65_difficult/">#65 [Difficult]</a> in 2012.)</p>
<p>Write a function that, given a grid containing the numbers 1-9, determines whether it's a magic square. Use whatever format you want for the grid, such as a 2-dimensional array, or a 1-dimensional array of length 9, or a function that takes 9 arguments. You do not need to parse the grid from the program's input, but you can if you want to. You don't need to check that each of the 9 numbers appears in the grid: assume this to be true.</p>
<h1>Example inputs/outputs</h1>
<pre><code>[8, 1, 6, 3, 5, 7, 4, 9, 2] =&gt; true
[2, 7, 6, 9, 5, 1, 4, 3, 8] =&gt; true
[3, 5, 7, 8, 1, 6, 4, 9, 2] =&gt; false
[8, 1, 6, 7, 5, 3, 4, 9, 2] =&gt; false
</code></pre>
<h1>Optional bonus 1</h1>
<p>Verify magic squares of any size, not just 3x3.</p>
<h1>Optional bonus 2</h1>
<p>Write another function that takes a grid whose bottom row is missing, so it only has the first 2 rows (6 values). This function should return true if it's <em>possible</em> to fill in the bottom row to make a magic square. You may assume that the numbers given are all within the range 1-9 and no number is repeated. Examples:</p>
<pre><code>[8, 1, 6, 3, 5, 7] =&gt; true
[3, 5, 7, 8, 1, 6] =&gt; false
</code></pre>
<p>Hint: it's okay for this function to call your function from the main challenge.</p>
<p>This bonus can also be combined with optional bonus 1. (i.e. verify larger magic squares that are missing their bottom row.)</p>
</div>
