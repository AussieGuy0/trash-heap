# Repulsion-Force
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Easy)</em>: Repulsion-Force</h1>
<p><a href="http://en.wikipedia.org/wiki/Coulomb%27s_law">Colomb's Law</a> describes the repulsion force for two electrically charged particles. In <em>very</em> general terms, it describes the rate at which particles move away from each-other based on each particle's mass and distance from one another.</p>
<p>Your goal is to compute the repulsion force for two electrons in 2D space. Assume that the two particles have the same mass and charge. The function that computes force is as follows:</p>
<pre><code>Force = (Particle 1's mass x Particle 2's mass) / Distance^2
</code></pre>
<p>Note that Colomb's Law uses a constant, but we choose to omit that for the sake of simplicity. For those not familiar with vector math, you can compute the distance between two points in 2D space using the following formula:</p>
<pre><code>deltaX = (Particle 1's x-position - Particle 2's x-position)
deltaY = (Particle 1's y-position - Particle 2's y-position)
Distance = Square-root( deltaX * deltaX + deltaY * deltaY )
</code></pre>
<p><em>Author:</em> nint22</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>On standard console input, you will be given two rows of numbers: first row represents the first particle, with the second row representing the second particle. Each row will have three space-delimited real-numbers (floats), representing mass, x-position, and y-position. The mass will range, inclusively, from 0.001 to 100.0. The x and y positions will range inclusively from -100.0 to 100.0.</p>
<h2>Output Description</h2>
<p>Print the force as a float at a minimum three decimal places precision.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input 1</h2>
<pre><code>1 -5.2 3.8
1 8.7 -4.1
</code></pre>
<h2>Sample Output 1</h2>
<pre><code>0.0039
</code></pre>
<h2>Sample Input 2</h2>
<pre><code>4 0.04 -0.02
4 -0.02 -0.03
</code></pre>
<h2>Sample Output 2</h2>
<pre><code>4324.3279
</code></pre>
</div>
