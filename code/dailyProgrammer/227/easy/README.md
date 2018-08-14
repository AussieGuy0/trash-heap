# Square Spirals
<div class="md"><h1><a href="#EasyIcon"></a> <strong>(Easy)</strong>: Square Spirals</h1>
<p>Take a square grid, and put a cross on the center point, like this:</p>
<pre><code>+ + + + +

+ + + + +

+ + X + +

+ + + + +

+ + + + +
</code></pre>
<p>The grid is 5-by-5, and the cross indicates point 1. Let's call the top-left corner location (1, 1), so the center point is at location (3, 3). Now, place another cross to the right, and trace the path:</p>
<pre><code>+ + + + +

+ + + + +

+ + X-X +

+ + + + +

+ + + + +
</code></pre>
<p>This second point (point 2) is now at location (4, 3). If you continually move around anticlockwise as much as you can from this point, you will form a square spiral, as this diagram shows the beginning of:</p>
<pre><code>+ + + + +

+ X-X-X .
  |   | .
+ X X-X .
  |     |
+ X-X-X-X

+ + + + +
</code></pre>
<p>Your challenge today is to do two things: convert a point number to its location on the spiral, and vice versa.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Specification</h2>
<p>On the first line, you'll be given a number <strong>S</strong>. This is the size of the spiral. If <strong>S</strong> equals 5, then the grid is a 5-by-5 grid, as shown in the demonstration above. <strong>S</strong> will always be an odd number.</p>
<p>You will then be given one of two inputs on the next line:</p>
<ul>
<li><p>You'll be given a single number <strong>N</strong> - this is the point number of a point on the spiral.</p></li>
<li><p>You'll be given two numbers <strong>X</strong> and <strong>Y</strong> (on the same line, separated by a space) - this is the location of a point on the spiral.</p></li>
</ul>
<h2>Output Description</h2>
<p>If you're given the point number of a point, work out its location. If you're given a location, find out its point number.</p>
<h1>Sample Inputs and Outputs</h1>
<h2>Example 1</h2>
<p>(Where is 8 on this spiral?)</p>
<pre><code>5-4-3
|   |
6 1-2
|    
7-8-9
</code></pre>
<h3>Input</h3>
<pre><code>3
8
</code></pre>
<h3>Output</h3>
<pre><code>(2, 3)
</code></pre>
<h2>Example 2</h2>
<p>This corresponds to the top-left point (1, 1) in <a href="https://upload.wikimedia.org/wikipedia/commons/thumb/1/1d/Ulam_spiral_howto_all_numbers.svg/811px-Ulam_spiral_howto_all_numbers.svg.png">this 7-by-7 grid</a>.</p>
<h3>Input</h3>
<pre><code>7
1 1
</code></pre>
<h3>Output</h3>
<pre><code>37
</code></pre>
<h2>Example 3</h2>
<h3>Input</h3>
<pre><code>11
50
</code></pre>
<h3>Output</h3>
<pre><code>(10, 9)
</code></pre>
<h2>Example 4</h2>
<h3>Input</h3>
<pre><code>9
6 8
</code></pre>
<h3>Output</h3>
<pre><code>47
</code></pre>
<p>If your solution can't solve the next two inputs before the heat death of the universe, don't worry.</p>
<h2>Example 5</h2>
<p>Let's test how fast your solution is!</p>
<h3>Input</h3>
<pre><code>1024716039
557614022
</code></pre>
<h3>Output</h3>
<pre><code>(512353188, 512346213)
</code></pre>
<h2>Example 6</h2>
<p>:D</p>
<h3>Input</h3>
<pre><code>234653477
11777272 289722
</code></pre>
<h3>Output</h3>
<pre><code>54790653381545607
</code></pre>
<h1>Finally</h1>
<p>Got any cool challenge ideas? Submit them to <a href="/r/DailyProgrammer_Ideas">/r/DailyProgrammer_Ideas</a>!</p>
</div>
