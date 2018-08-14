# Convex Hull Problem
<div class="md"><h1><a href="#HardIcon"></a> <em>(Hard)</em>: Convex Hull Problem</h1>
<p>I have <a href="http://i.imgur.com/yDhKB22.png">a collection of points, called <strong>P</strong></a>. For this challenge the points will all be on a 2D plane. The Convex Hull problem is to find a convex polygon made from points in <strong>P</strong> which contains all of the points in <strong>P</strong>. There are several approaches to this problem, including brute-force (not good) and several O(n<sup>2</sup>) solutions (naive, not brilliant) and some fairly in-depth algorithms. </p>
<p>Some such algorithms are described <a href="http://www.cse.unsw.edu.au/%7Elambert/java/3d/hull.html">here (a Java applet, be warned - change the display to 2d first)</a> or on <a href="http://en.wikipedia.org/wiki/Convex_hull_algorithms#Algorithms">Wikipedia</a>. The choice is yours, but because you're in <a href="/r/DailyProgrammer">/r/DailyProgrammer</a> try and challenge yourself! Try and implement one of the more interesting algorithms.</p>
<p>For example, a convex hull of P:</p>
<ul>
<li><p><a href="http://i.imgur.com/VCmqplP.png">Cannot be this</a> because a point is excluded from the selection</p></li>
<li><p><a href="http://i.imgur.com/C4IhIxa.png">Also cannot be this</a> because the shape is not convex - the triangles enclosed in green are missing</p></li>
<li><p><a href="http://i.imgur.com/rbvhJZa.png">Looks like this</a>. The shape is convex and contains all of the points in the image - either inside it or as a boundary.</p></li>
</ul>
<h2>Input Description</h2>
<p>First you will be given a number, <strong>N</strong>. This number is how many points are in our collection <strong>P</strong>.</p>
<p>You will then be given <strong>N</strong> further lines of input in the format:</p>
<pre><code>X,Y
</code></pre>
<p>Where X and Y are the co-ordinates of the point on the image. Assume the points are named in alphabetical order as A, B, C, D, ... in the order that they are input.</p>
<h2>Output Description</h2>
<p>You must give the convex hull of the shape in the format:</p>
<pre><code>ACFGKLO
</code></pre>
<p>Where the points are described in no particular order. (as an extra challenge, make them go in order around the shape.)</p>
<h1>Notes</h1>
<p>In the past we've had some very pretty images and graphs from people's solutions. If you feel up to it, add an image output from your challenge which displays the convex hull of the collection of points.</p>
</div>
