# Convex Polygon Area
<div class="md"><h1><a href="#HardIcon"></a> <em>(Hard)</em>: Convex Polygon Area</h1>
<p>A convex polygon is a geometric polygon (ie. sides are straight edges), where all of the interior angles are less than 180'. For a more rigorous definition of this, see <a href="http://www.mathopenref.com/polygonconvex.html">this page</a>.</p>
<p>The challenge today is, given the points defining the boundaries of a convex polygon, find the area contained within it. </p>
<h2>Input Description</h2>
<p>First you will be given a number, <strong>N</strong>. This is the number of vertices on the convex polygon.<br/>
Next you will be given the points defining the polygon, in no particular order. The points will be a 2-D location on a flat plane of infinite size. These will always form a convex shape so don't worry about checking that </p>
<p>in your program. These will be in the form <code>x,y</code> where <code>x</code> and <code>y</code> are real numbers.</p>
<h2>Output Description</h2>
<p>Print the area of the shape.</p>
<h1>Example Inputs and Outputs</h1>
<h2>Example Input 1</h2>
<pre><code>5
1,1
0,2
1,4
4,3
3,2
</code></pre>
<h2>Example Output 1</h2>
<pre><code>6.5
</code></pre>
<h2>Example Input 2</h2>
<pre><code>7
1,2
2,4
3,5
5,5
5,3
4,2
2.5,1.5
</code></pre>
<h2>Example Output 2</h2>
<pre><code>9.75
</code></pre>
<h1>Challenge</h1>
<h2>Challenge Input</h2>
<pre><code>8
-4,3
1,3
2,2
2,0
1.5,-1
0,-2
-3,-1
-3.5,0
</code></pre>
<h2>Challenge Output</h2>
<pre><code>24
</code></pre>
<h1>Notes</h1>
<p>Dividing the shape up into smaller segments, eg. triangles/squares, may be crucial here.</p>
<h1>Extension</h1>
<p>I quickly realised this problem could be solved much more trivially than I thought, so complete this too. Extend your program to accept 2 convex shapes as input, and calculate the combined area of the resulting intersected shape, similar to how is described <a href="http://www.reddit.com/r/dailyprogrammer/comments/23b1pr/4182014_challenge_158_hard_intersecting_rectangles/">in this challenge</a>.</p>
</div>
