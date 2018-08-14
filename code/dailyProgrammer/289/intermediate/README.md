# Metro trip planner
<div class="md"><h1>Description</h1>
<p>The prupose of this challenge is to help user to find the quickest way to go from a metro station to another.
The metro map is the following: <a href="http://imgur.com/9K060Fr">http://imgur.com/9K060Fr</a> (blacks numbers are the time between stations)</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Metro map input description</h2>
<p>As an input you will use the following table wich provide connexions between stations and the time associated.</p>
<pre><code>Z, VIOLET, N, VIOLET, 6
A, BLUE, N, BLUE, 5
N, BLUE, M, BLUE, 5
A, GREEN, B, GREEN, 2
B, GREEN, C, GREEN, 2
C, GREEN, D, GREEN, 1
D, GREEN, E, GREEN, 1
E, GREEN, F, GREEN, 2
F, GREEN, G, GREEN, 2
G, GREEN, J, GREEN, 3
J, GREEN, M, GREEN, 3
A, YELLOW, D, YELLOW, 3
D, YELLOW, G, YELLOW, 3
G, YELLOW, H, YELLOW, 2
H, YELLOW, I, YELLOW, 2
I, YELLOW, J, YELLOW, 1
J, YELLOW, K, YELLOW, 2
K, YELLOW, L, YELLOW, 2
L, YELLOW, M, YELLOW, 1
A, YELLOW, A, GREEN, 2
A, GREEN, A, BLUE, 3
A, YELLOW, A, BLUE, 2.5
D, YELLOW, D, GREEN, 1.5
G, YELLOW, G, GREEN, 1.5
J, YELLOW, J, GREEN, 1.5
M, YELLOW, M, GREEN, 1.5
M, GREEN, M, BLUE, 2
M, YELLOW, M, BLUE, 1
N, VIOLET, N, BLUE, 2
</code></pre>
<p>Lines with the pattern <strong>X, COLOR1, Y, COLOR1, Z</strong> mean that with the COLOR1 metro line you can go from station X to station Y in Z minutes.
Lines with the pattern <strong>X, COLOR1, X, COLOR2, Z</strong> mean than to change from line COLOR1 to line COLOR2 in station X, it takes Z minutes.</p>
<h2>Challenge Input description</h2>
<p>You will given 2 stops. The first is where the user is at. The second is where the users wants to go.</p>
<pre><code>A
B
</code></pre>
<h2>Output description</h2>
<p>All options given that you can only have 1 change of line.</p>
<pre><code>Option 0 : At A, take GREEN line exit at B
Option 1 : At A, take YELLOW line, change at D and take GREEN line exit at B
Option 2  : At A, take YELLOW line, change at G and take GREEN line exit at B
Option 3  : At A, take YELLOW line, change at J and take GREEN line exit at B
Option 4  : At A, take BLUE line, change at M and take GREEN line exit at B
Option 5  : At A, take YELLOW line, change at M and take GREEN line exit at B
...
</code></pre>
<h2>Challenges</h2>
<h3>Input 1</h3>
<pre><code>M
Z
</code></pre>
<h3>Output 1</h3>
<pre><code>Option 0 : At M, take BLUE line, change at N and take VIOLET line exit at Z
</code></pre>
<h3>input 2</h3>
<pre><code>Z
B
</code></pre>
<h3>Output 2</h3>
<pre><code>No options found to go from Z to B with maximum one change
</code></pre>
<h1>Bonus</h1>
<p>Add direction and duration to the discription</p>
<h2>Input</h2>
<pre><code>A
Z
</code></pre>
<h2>Output</h2>
<pre><code>Option 0 (2mn) : At A, take GREEN line in direction of M exit at B
Option 1 (7.5mn) : At A, take YELLOW line in direction of M, change at D and take GREEN in direction of A line exit at B
Option 2 (15.5mn) : At A, take YELLOW line in direction of M, change at G and take GREEN in direction of A line exit at B
Option 3 (23.5mn) : At A, take YELLOW line in direction of M, change at J and take GREEN in direction of A line exit at B
Option 4 (26.0mn) : At A, take BLUE line in direction of M, change at M and take GREEN line in direction of A exit at B
Option 5 (31.5mn) : At A, take YELLOW line in direction of M, change at M and take GREEN line in direction of A exit at B
...
</code></pre>
<h1>Finally</h1>
<p>Have a good challenge idea like <a href="/u/urbainvi">/u/urbainvi</a> did?</p>
<p>Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
</div>
