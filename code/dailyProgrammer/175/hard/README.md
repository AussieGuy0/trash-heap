# Hall of Mirror[]
<div class="md"><h1><a href="#HardIcon"></a> <em>(Hard)</em>: Hall of <code>Mirror[]</code></h1>
<p>Today we're going to embark on some advanced geometry. You'll want to freshen up your angles and vectors because there will be a lot of them today!</p>
<p>We're going to be simulating the path of a light ray in 2D space through a hall of mirrors - a mirror being a plane of finite length that, upon the light ray hitting it, will reflect the light ray with the same angle of incidence like <a href="http://i.imgur.com/NcJrpRT.png">this image here</a>. The mirrors are double-sided and have zero thickness.</p>
<p>You will be given a set of mirrors, defined by a start and end point, and a light ray, represented by a starting position, a starting vector (that may or may not be normalized) and a distance. You will have to simulate the light ray travelling for the given distance accounting for any reflections on the mirrors, assuming Euclidan geometry and <em>no</em> fancy stuff like refraction, special relativity or similar.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>You will be given a number <strong>N</strong>, which is the number of mirrors in the world. You will then be given <strong>N</strong> lines of input in the format:</p>
<pre><code>X1 Y1 X2 Y2
</code></pre>
<p>Where (X1,Y1) and (X2,Y2) represent the start and end points of a mirror.</p>
<p>After that you will be given one last line of input in the format:</p>
<pre><code>PX PY VX VY D
</code></pre>
<p>Where (PX,PY) represents the starting position of the light ray in the world, (VX,VY) is the vector representing the light ray's direction in the world (be sure to normalize this beforehand) and D is the distance it will travel.</p>
<h2>Output Description</h2>
<p>You will print a line in the format:</p>
<pre><code>PX PY
</code></pre>
<p>Where (PX,PY) is the final position of the vector in the world.</p>
<h1>Sample Inputs &amp; Output</h1>
<h2>Sample Input</h2>
<pre><code>1
-1 0 1 0
-1 -1 1 1 2.828427
</code></pre>
<h2>Sample Output</h2>
<pre><code>1 -1
</code></pre>
<h1>Notes</h1>
<p>You will need to have knowledge of the following things to solve this challenge:</p>
<ul>
<li>Vectors</li>
<li>Matrices, depending on how you solve the challenge</li>
<li>Angles and line geometry</li>
</ul>
</div>
