# Intersecting Lines in 2-D space
<div class="md"><h1>Descripton:</h1>
<p>Given a typical x/y coordinate system we can plot lines. It would be interesting to know which lines intersect.</p>
<h1>Input:</h1>
<p>A series of lines from 1 to many to put in our 2-D space. The data will be in the form:</p>
<pre><code>(label) (x1 y1) (x2 y2)
</code></pre>
<ul>
<li>(label) will be a letter A-Z</li>
<li>(x1 y1) will be the coordinates of the starting point on line</li>
<li>(x2 y2) will be the coordinates of the ending point on line</li>
</ul>
<h2>example input:</h2>
<pre><code>A -2.5 .5 3.5 .5
B -2.23 99.99 -2.10 -56.23
C -1.23 99.99 -1.10 -56.23
D 100.1 1000.34 2000.23 2100.23
E 1.5 -1 1.5 1.0
F 2.0 2.0 3.0 2.0
G 2.5 .5 2.5 2.0
</code></pre>
<ul>
<li>Max X can be 1,000,000,000.00</li>
<li>Max Y can be 1,000,000,000.00</li>
</ul>
<h1>Output:</h1>
<p>The program will list which lines intersect. And which have 0 intersects.</p>
<h2>Example Output:</h2>
<pre><code>Intersecting Lines:
A B
A C
A E
A G
F G
No intersections:
D
</code></pre>
<h1>Difficulty:</h1>
<p>This is a coder_d00d(tm) unknown difficulty challenge. It could be easy. Could be hard. But it seems cool for a Friday.</p>
<ul>
<li>If you want to make it <strong>easier</strong>: input is only 2 lines and you return yes/no</li>
<li>If you want to make it <strong>harder</strong>: output is the 2 lines and the (x y) point they intersect at.</li>
</ul>
</div>
