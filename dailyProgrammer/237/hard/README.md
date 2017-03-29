# Takuzu Solver
<div class="md"><h1>Description</h1>
<p>Takuzu is a simple and fairly unknown logic game similar to Sudoku. The objective is to fill a square grid with either a "1" or a "0". There are a couple of rules you must follow:</p>
<ul>
<li>You can't put more than two identical numbers next to each other in a line (i.e. you can't have a "111" or "000").</li>
<li>The number of 1s and 0s on each row and column must match.</li>
<li>You can't have two identical rows or columns.</li>
</ul>
<p>To get a better hang of the rules you can play an online version of this game (which inspired this challenge) <a href="http://0hh1.com/">here</a>.</p>
<h1>Input Description</h1>
<p>You'll be given a square grid representing the game board. Some cells have already been filled; the remaining ones are represented by a dot. Example:</p>
<pre><code>....
0.0.
..0.
...1
</code></pre>
<h1>Output Description</h1>
<p>Your program should display the filled game board. Example:</p>
<pre><code>1010
0101
1100
0011
</code></pre>
<p>Inputs used here (and available at the online version of the game) have only one solution. For extra challenge, you can make your program output all possible solutions, if there are more of them.</p>
<h1>Challenge Input 1</h1>
<pre><code>110...
1...0.
..0...
11..10
....0.
......
</code></pre>
<h1>Challenge Output 1</h1>
<pre><code>110100
101100
010011
110010
001101
001011
</code></pre>
<h1>Challenge Input 2</h1>
<pre><code>0....11..0..
...1...0....
.0....1...00
1..1..11...1
.........1..
0.0...1.....
....0.......
....01.0....
..00..0.0..0
.....1....1.
10.0........
..1....1..00
</code></pre>
<h1>Challenge Output 2</h1>
<pre><code>010101101001
010101001011
101010110100
100100110011
011011001100
010010110011
101100101010
001101001101
110010010110
010101101010
101010010101
101011010100
</code></pre>
<h1>Credit</h1>
<p>This challenge was submitted by <a href="/u/adrian17">/u/adrian17</a>. If you have any challenge ideas, please share them on <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a>, there's a good chance we'll use them.</p>
</div>
