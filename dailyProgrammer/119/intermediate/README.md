# Find the shortest path
<div class="md"><h1><a href="#IntermediateIcon"></a> <em>(Intermediate)</em>: Find the shortest path</h1>
<p>Given an ASCII grid through standard console input, you must find the shortest path from the start to the exit (without walking through any walls). You may only move up, down, left, and right; never diagonally.</p>
<p><em>Author: liloboy</em></p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>The first line of input is an integer, which specifies the size of the grid in both dimensions. For example, a 5 would indicate a 5 x 5 grid. The grid then follows on the next line. A grid is simply a series of ASCII characters, in the given size. You start at the 'S' character (for Start) and have to walk to the 'E' character (for Exit), without walking through any walls (indicated by the 'W' character). Dots / periods indicate open, walk-able space.</p>
<h2>Output Description</h2>
<p>The output should simply print "False" if the end could not possibly be reached or "True", followed by an integer. This integer indicates the shortest path to the exit.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<pre><code>5
S....
WWWW.
.....
.WWWW
....E
</code></pre>
<p>Check out this link for many more examples! <a href="http://pastebin.com/QFmPzgaU">http://pastebin.com/QFmPzgaU</a></p>
<h2>Sample Output</h2>
<pre><code>True, 16
</code></pre>
<h1>Challenge Input</h1>
<pre><code>8
S...W...
.WW.W.W.
.W..W.W.
......W.
WWWWWWW.
E...W...
WW..WWW.
........
</code></pre>
<h2>Challenge Input Solution</h2>
<p>True, 29</p>
<h1>Note</h1>
<p>As a bonus, list all possible shortest paths, if there are multiple same-length paths.</p>
</div>
