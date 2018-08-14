# The First Sudoku
<div class="md"><p>Find the lexicographically first valid sudoku. A valid sudoku consists of a 9x9 grid of the numbers 1-9 such that no number appears twice in any row or column, or in any of the 9 major 3x3 sub-grids. Two sudokus can be compared to determine which is lexicographically first like this: append the rows for each of the two sudokus together. Find the <em>first</em> number where they differ. Whichever sudoku has a smaller number in that position is lexicographically first.</p>
<p>Here's the solution you should get:</p>
<p><code>[1, 2, 3, 4, 5, 6, 7, 8, 9]</code><br/>
<code>[4, 5, 6, 7, 8, 9, 1, 2, 3]</code><br/>
<code>[7, 8, 9, 1, 2, 3, 4, 5, 6]</code><br/>
<code>[2, 1, 4, 3, 6, 5, 8, 9, 7]</code><br/>
<code>[3, 6, 5, 8, 9, 7, 2, 1, 4]</code><br/>
<code>[8, 9, 7, 2, 1, 4, 3, 6, 5]</code><br/>
<code>[5, 3, 1, 6, 4, 2, 9, 7, 8]</code><br/>
<code>[6, 4, 2, 9, 7, 8, 5, 3, 1]</code><br/>
<code>[9, 7, 8, 5, 3, 1, 6, 4, 2]</code> </p>
<p>If you want more of a challenge, find the lexicographically first valid 16x16 sudoku, or even larger.</p>
<p>Thanks to user <strong>Thomas1122</strong> for suggesting this problem in <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a>!</p>
</div>
