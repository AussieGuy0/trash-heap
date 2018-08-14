# New York Street Sweeper Paths
<div class="md"><h1>Description</h1>
<p>In graph theory, various walks and cycles occupy a number of theorems, lemmas, and papers. They have practical value, it turns out, in a wide variety of applications: computer networking and street sweepers among them. </p>
<p>For this challenge you're the commissioner of NYC street sweeping. You have to keep costs down and keep the streets clean, so you'll minimize the number of streets swept twice while respecting traffic directionality. The goal of this challenge is to visit all edges (aka streets) at least one while minimizing the number of streets swept to the bare minimum. </p>
<p>Can you find a route to give your drivers? </p>
<h1>Input Description</h1>
<p>Your program will be given two integers <em>h</em> and <em>w</em> on one line which tell you how tall and wide the street map is. On the next line will be a single uppercase letter <em>n</em> telling you where to begin. Then the ASCII map will begin using the dimensions you were given <em>h</em>x<em>w</em>). Your tour should end the day at the starting point (<em>n</em>).</p>
<p>You'll be given an ASCII art graph. Intersections will be named as uppercase letters <code>A</code>-<code>Z</code>. Streets will connect them. The streets may be bi-directional (<code>-</code> or <code>|</code>) or one-way (one of <code>^</code> for up only, <code>v</code> for down only, <code>&lt;</code> for left only, and <code>&gt;</code> for right only) and you may not violate the rules of the road as the commissioner by driving down a one way street the wrong way. Bi-directional streets (<code>-</code> or <code>|</code>) need only be visited in one direction, not both. <del>You don't need to return to the starting point.</del> *<em>Resolved the conflict in favor of doing a cycle. *</em></p>
<h1>Output Description</h1>
<p>Your program should emit the intersections visited in order and the number of street segments you swept. </p>
<h1>Challenge Input</h1>
<pre><code>3 3
F 
A - B - C
|   |   v
D &gt; E - F
^   v   v
G - H &lt; I
</code></pre>
<h1>Challenge Output</h1>
<p>Manually inspecting the map, the shortest walk of all streets at least once I've been able to come up with is <code>F-I-H-G-D-E-H-G-D-A-B-C-F-E-B-C-F</code>, but there may be shorter ones.</p>
</div>
