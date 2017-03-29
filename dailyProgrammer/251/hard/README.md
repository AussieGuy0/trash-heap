# Solve a Nonogram + Bonus
<div class="md"><h1>Description</h1>
<p>This week we are doing a challenge involving <a href="https://en.wikipedia.org/wiki/Nonogram">Nonograms</a></p>
<p>It is going to be a three parter:</p>
<ul>
<li><a href="https://www.reddit.com/r/dailyprogrammer/comments/42lhem/20160125_challenge_251_easy_create_nonogram/">Create Nonogram description ([Easy])</a></li>
<li><a href="https://www.reddit.com/r/dailyprogrammer/comments/42x90t/20160127_challenge_251_hard_solve_a_nonogram_bonus/">Solve Nonogram ([Intermediate/Hard])</a></li>
<li>Working with multiple colors/characters ([Hard])</li>
<li><a href="https://www.reddit.com/r/dailyprogrammer/comments/42x90t/20160127_challenge_251_hard_solve_a_nonogram_bonus/">Bonus: Make it an interactive game ([Intermediate])</a></li>
</ul>
<h2>What is a Nonogram?</h2>
<blockquote>
<p>Nonograms, also known as Hanjie, Picross or Griddlers, are picture logic puzzles in which cells in a grid must be colored or left blank according to numbers at the side of the grid to reveal a hidden picture. In this puzzle type, the numbers are a form of discrete tomography that measures how many unbroken lines of filled-in squares there are in any given row or column.</p>
</blockquote>
<p>In a Nonogram you are given the number of elements in the rows and columns. A row/column where containing no element has a '0' all other rows/columns will have at least one number.</p>
<p>Each number in a row/column represent sets of elements next to each other. </p>
<p>If a row/column have multiple sets, the declaration of that row/column will have multiple numbers. These sets will always be at least 1 cell apart.</p>
<p><em>An example</em></p>
<table><thead>
<tr>
<th></th>
<th></th>
<th></th>
<th>2</th>
<th>1</th>
<th>1</th>
<th></th>
</tr>
</thead><tbody>
<tr>
<td></td>
<td></td>
<td>1</td>
<td>1</td>
<td>1</td>
<td>2</td>
<td>1</td>
</tr>
<tr>
<td></td>
<td>2</td>
<td></td>
<td>*</td>
<td>*</td>
<td></td>
<td></td>
</tr>
<tr>
<td>1</td>
<td>2</td>
<td></td>
<td>*</td>
<td></td>
<td>*</td>
<td>*</td>
</tr>
<tr>
<td></td>
<td>0</td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td>2</td>
<td>1</td>
<td>*</td>
<td>*</td>
<td></td>
<td>*</td>
<td></td>
</tr>
<tr>
<td></td>
<td>2</td>
<td></td>
<td></td>
<td>*</td>
<td>*</td>
<td></td>
</tr>
</tbody></table>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input description</h2>
<p>Today you will recieve the columns and rows of a Nonogram seperated by a <code>-</code></p>
<pre><code>0 0 1 1 0
1 2 1 1 5
-
0 1
0 2
1 1
1 1
0 5
</code></pre>
<h2>Output description</h2>
<p>The Nonogram solved like this:</p>
<pre><code>    *
   **
  * *
 *  *
*****
</code></pre>
<h2>Ins</h2>
<p><em>1</em></p>
<pre><code>0 0 1 1 0
1 2 1 1 5
-
0 1
0 2
1 1
1 1
0 5
</code></pre>
<p><em>2</em></p>
<pre><code> 0  0  0  0  0  0  4  0  0  0
 0  0  3  4  5  5  2  5  0  0
 1  7  1  4  4  1  1  1  7  1
-
 0  0  2  1
 0  0  0  5
 0  0  0  6
 0  0  0  8
 0  0  0 10
 0  0  1  1
 1  2  1  1
 1  2  1  1
 0  1  2  1
 0  0  0  8
</code></pre>
<p><em>3</em></p>
<pre><code> 0  0  2  0  0  0  1  0  0  0  0  0  0  0  0
 0  0  3  6  0  0  4  2  0  0  1  1  1  1  0
 1 10  1  2  6 15  8  9 14  8  6 10 10 11 12
-
 0  0  0  3
 0  0  4  2
 0  0  6  6
 1  4  2  1
 0  6  3  2
 0  0  6  7
 0  0  6  8
 0  0  1 10
 0  0  1 10
 0  0  1 10
 1  1  4  4
 0  3  4  4
 0  0  4  4
 0  0  4  4
 0  0  4  4
</code></pre>
<h2>Notes/hints</h2>
<p>This is a hard challenge. In the <a href="https://en.wikipedia.org/wiki/Nonogram">wikipage</a> you'll find ways to find what cell you can fill and how you can exclude cells.</p>
<h1>Bonus challenge</h1>
<p>Use the inputs and output from the first challenge <a href="https://www.reddit.com/r/dailyprogrammer/comments/42lhem/20160125_challenge_251_easy_create_nonogram/">Create Nonogram description ([Easy])</a> to create a game.</p>
<p>Create the nonogram description fron a library (the inputs) and let the user choose a difficulty:</p>
<ul>
<li>Easy, the user can keep on playing, even if he makes wrong calls</li>
<li>Normal, give the user some 'lives'. Everytime the user gives an incorrect guess, she/he loses a life. I would say the user would have about number of colums added up to the number of rows lives.</li>
<li>Hard, the user can't make any mistake</li>
</ul>
<p>Now make it something beautifull, or at least playable</p>
<h1>Finally</h1>
<p>Have a good challenge idea?</p>
<p>Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
</div>
