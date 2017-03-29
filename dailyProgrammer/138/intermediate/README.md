# Overlapping Circles
<div class="md"><h1><a href="#IntermediateIcon"></a> <em>(Intermediate)</em>: Overlapping Circles</h1>
<p>Computing the volume of a circle is pretty straight-forward: Pi x Radius x Radius, or simply Pi x r <sup>2.</sup></p>
<p>What if we wanted to computer the volume of two circles? Easy, just sum it! Yet, what about two intersecting circles, much like the classic <a href="http://en.wikipedia.org/wiki/File:Venn0111.svg">Venn diagram</a>?</p>
<p>Your goal is to write a program that takes two unit-circles (radius of one) at given locations, and compute that shape's volume. You must make sure to <em>not</em> double-count the intersecting volume! (i.e. you must not sum this <a href="http://en.wikipedia.org/wiki/File:Venn0001.svg">red area</a> twice).</p>
<p>As a starting point, check out how to compute <a href="http://en.wikipedia.org/wiki/Circular_segment">circle segments</a>.</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>On standard input you will be given four floating-point space-delimited values: x y u w. x and y are the first circle's position in <a href="http://en.wikipedia.org/wiki/Cartesian_coordinate_system">Cartesian coordinates</a>. The second pair u and w are the second circle's position.</p>
<p>Note that the given circles may not actually intersect. If this is the case, return the sum of both circles (which will always be Pi x 2 since our circles are unit-circles).</p>
<h2>Output Description</h2>
<p>Print the summed volume of the two circles, up to an accuracy of 4 digits after the decimal place.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<pre><code>-0.5 0 0.5 0
</code></pre>
<h2>Sample Output</h2>
<pre><code>5.0548
</code></pre>
</div>
