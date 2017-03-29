# ∞ Loop solver
<div class="md"><h1>Description</h1>
<p>∞ Loop is a mobile game that consists of n*m tiles, placed in a n*m grid. There are 16 different tiles:</p>
<p>┃, ━, ┏, ┓, ┛, ┗, ┣, ┳, ┫, ┻, ╋, ╹, ╺, ╻, ╸, and the empty tile.</p>
<p>(If some of the Unicode characters aren't shown, <a href="http://i.imgur.com/PWyeW5r.png">here</a> is a screenshot of this paragraph).</p>
<p>In other words, every tile may or may not have a "pipe" going up, a "pipe" going right, a "pipe" going down, and a "pipe" going left. All combinations of those are valid, legal tiles.</p>
<p>At the beginning of the game, the grid is filled with those tiles. The player may then choose some tile and rotate it 90 degrees to the right. The player may do this an unlimited amount of times. For example, ┣ becomes ┳ and ┛ becomes ┗, but ╋ stays ╋.</p>
<p>The objective is to create a closed loop: every pipe must have another tile facing it in the adjacent tile — for example if some tile has a pipe going right, its adjacent tile to the right must have a pipe going left. </p>
<p>In case you need clarification, <a href="https://www.youtube.com/watch?v=TlR1hfiIk10">here's</a> some random guy playing it.</p>
<p>Your task is to write a program that, given an initial grid of tiles, outputs a solution to that grid.</p>
<h1>Formal Inputs &amp; Outputs</h1>
<p>An easy way to represent tiles without having to deal with Unicode (or ASCII art) is to use the bitmask technique to encode the tiles as numbers 0...15. </p>
<p>To encode a tile:  </p>
<ul>
<li><p>Start with 0.  </p></li>
<li><p>If the tile has a pipe going up, add 1.  </p></li>
<li><p>If the tile has a pipe going right, add 2.  </p></li>
<li><p>If the tile has a pipe going down, add 4.  </p></li>
<li><p>If the tile has a pipe going left, add 8.  </p></li>
</ul>
<p>For example, ┫ becomes 1+4+8=13.</p>
<p>If we look at the binary representation of that number, we see that:  </p>
<ul>
<li><p>The first digit from the right shows whether the tile has a pipe going up;  </p></li>
<li><p>The second digit from the right shows whether the tile has a pipe going right;   </p></li>
<li><p>The third digit from the right shows whether the tile has a pipe going down;  </p></li>
<li><p>The fourth digit from the right shows whether the tile has a pipe going left.  </p></li>
</ul>
<p>13 in binary is 1101, from which it is evident that all pipes are present except the pipe going right.</p>
<h2>Input description</h2>
<p>The input consists of n rows, each row having m space-separated numbers in it. Those numbers are the tiles, encoded in the bitmask technique discussed above.</p>
<p>You may also include the number of rows and columns in the input, if that makes it easier to read the input.</p>
<h2>Output description</h2>
<p>Output a similar grid which is obtained by rotating some or all tiles in the input grid. A tile may be rotated multiple times. The output grid must be a closed loop.</p>
<h2>Sample input 1</h2>
<pre><code>9 12 12 6
10 13 13 5
3 3 9 3
</code></pre>
<h2>Sample output 1</h2>
<pre><code>6 12 6 12
5 7 13 5
3 9 3 9
</code></pre>
<p>The sample input corresponds to:</p>
<pre><code>┛┓┓┏
━┫┫┃
┗┗┛┗
</code></pre>
<p>By rotating some tiles, we get:</p>
<pre><code>┏┓┏┓
┃┣┫┃
┗┛┗┛,
</code></pre>
<p>which corresponds to the sample output and is a closed loop.</p>
<p>(Again, if Unicode characters don't load, <a href="http://i.imgur.com/lqCGY3e.png">here</a> is the first sample input).</p>
<h2>Sample input 2</h2>
<pre><code>0 8 8 0
</code></pre>
<h2>Sample output 2</h2>
<pre><code>0 2 8 0
</code></pre>
<p>The input corresponds to ╸╸, surrounded by two empty tiles.<br/>
The corresponding output is ╺╸.</p>
<h1>Notes</h1>
<p>It is easiest to use the bitwise and/or/xor operators to rotate and check for pipes. Most programming languages have such operators. The bitwise shift operators may also be helpful to rotate the tiles. <a href="https://en.wikipedia.org/wiki/Mask_(computing)">Here's</a> a Wikipedia article on using them on bitmasks.</p>
<h1>Finally</h1>
<p>This challenge was suggested by <a href="/u/A858DE57B86C2F16F">/u/A858DE57B86C2F16F</a>, many thanks! Have a good challenge idea?   Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
</div>
