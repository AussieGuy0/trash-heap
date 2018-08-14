# Basic Equations
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Easy)</em>: Basic Equations</h1>
<p>Today, we'll be creating a simple calculator, that we may extend in later challenges. Assuming you have done basic algebra, you may have seen equations in the form <a href="http://latex.codecogs.com/gif.latex?y%3Dax&amp;plus;b"><code>y=ax+b</code></a>, where <code>a</code> and <code>b</code> are constants. This forms a graph of a straight line, when you plot <code>y</code> in respect to <code>x</code>. If you have not explored this concept yet, you can visualise a linear equation such as this using <a href="http://www.mathopenref.com/linearexplorer.html">this online tool</a>, which will plot it for you.</p>
<p>The question is, how can you find out where two such 'lines' intersect when plotted - ie. when the lines cross? Using algebra, you can solve this problem easily. For example, given <a href="http://latex.codecogs.com/gif.latex?y%3D2x&amp;plus;2"><code>y=2x+2</code></a> and <a href="http://latex.codecogs.com/gif.latex?y%3D5x-4"><code>y=5x-4</code></a>, how would you find out where they intersect? This situation would look like <a href="http://i.imgur.com/wLr5Aei.png">this</a>. Where do the red and blue lines meet? You would substitute <code>y</code>, forming one equation, <a href="http://latex.codecogs.com/gif.latex?2x&amp;plus;2%3D5x-4"><code>2x+2=5x-4</code></a>, as they both refer to the same variable <code>y</code>. Then, subtract one of the sides of the equation from the other side - like <a href="http://latex.codecogs.com/gif.latex?2x&amp;plus;2-%282x&amp;plus;2%29%3D5x-4-%282x&amp;plus;2%29"><code>2x+2-(2x+2)=5x-4-(2x+2)</code></a> which is the same as <a href="http://latex.codecogs.com/gif.latex?3x-6%3D0"><code>3x-6=0</code></a> - to solve, move the -6 to the other side of the <code>=</code> sign by adding 6 to both sides, and divide both sides by 3: <a href="http://latex.codecogs.com/gif.latex?x%3D2"><code>x=2</code></a>. You now have the <code>x</code> value of the co-ordinate at where they meet, and as <code>y</code> is the same for both equations at this point (hence why they intersect) you can use either equation to find the <code>y</code> value, <a href="http://latex.codecogs.com/gif.latex?%282x&amp;plus;2%5C%3B%20%5Ctextup%7Bwhere%7D%5C%3B%20x%3D2%29%3D2%282%29&amp;plus;2%3D4&amp;plus;2%3D6">like so</a>. So the co-ordinate where they insersect is <code>(2, 6)</code>. Fairly simple.</p>
<p>Your task is, given two such linear-style equations, find out the point at which they intersect.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>You will be given 2 equations, in the form <code>y=ax+b</code>, on 2 separate lines, where <code>a</code> and <code>b</code> are constants and <code>y</code> and <code>x</code> are variables.</p>
<h2>Output Description</h2>
<p>You will print a point in the format <code>(x, y)</code>, which is the point at which the two lines intersect.</p>
<h1>Sample Inputs and Outputs</h1>
<h2>Sample Input</h2>
<pre><code>y=2x+2
y=5x-4
</code></pre>
<h2>Sample Output</h2>
<pre><code>(2, 6)
</code></pre>
<h2>Sample Input</h2>
<pre><code>y=-5x
y=-4x+1
</code></pre>
<h2>Sample Output</h2>
<pre><code>(-1, 5)
</code></pre>
<h2>Sample Input</h2>
<pre><code>y=0.5x+1.3
y=-1.4x-0.2
</code></pre>
<h2>Sample Output</h2>
<pre><code>(-0.7895, 0.9053)
</code></pre>
<h1>Notes</h1>
<p>If you are new to the concept, this might be a good time to learn <a href="http://www.regular-expressions.info/tutorial.html">regular expressions</a>. If you're feeling more adventurous, write a little parser.</p>
<h1>Extension</h1>
<p>Draw a graph with 2 lines to represent the inputted equations - preferably with 2 different colours. Draw a point or dot representing the point of intersection.</p>
</div>
