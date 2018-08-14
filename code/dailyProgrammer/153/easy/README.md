# Pascal's Pyramid
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Easy)</em>: Pascal's Pyramid</h1>
<p>You may have seen Pascal's Triangle before. It has been known about for a long time now and is a very simple concept - it makes several appearances in mathematics, one of which is when you calculate the <a href="http://en.wikipedia.org/wiki/Binomial_theorem">binomial expansion</a>.<br/>
If you've not seen it before, you can calculate it by first putting <strong>1</strong> on the outermost numbers:</p>
<pre><code>    1
   1 1
  1 _ 1
 1 _ _ 1
1 _ _ _ 1
</code></pre>
<p>And then each number within the triangle can be calculated by adding the two numbers above it, to form this:</p>
<pre><code>     1
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1
</code></pre>
<p>It has several interesting properties, however what we're interested in is the <strong>3-dimensional</strong> version of this triangle - <strong>Pascal's Pyramid.</strong><br/>
It works in much the same way - the corner numbers are all <strong>1</strong>s. However the edges are all layers of Pascal's triangle, and each inner number is the sum of the 3 numbers above it. Besides that there is nothing else to it.</p>
<p>Here are the first 5 cross-sectional 'layers', top to bottom:</p>
<pre><code>1

 1
1 1

  1
 2 2
1 2 1

   1
  3 3
 3 6 3
1 3 3 1

      1
    4  4
   6  12 6
 4  12 12 4
1  4  6  4  1
</code></pre>
<p>See how the outermost 'rows' or 'edges' of numbers on all of the above are layers of Pascal's Triangle, as we saw above. Therefore, The faces of Pascal's Pyramid, were it a 3D object, would have Pascal's Triangle on them!</p>
<p>Your challenge is, given a number <strong>N</strong>, to calculate and display the <strong>N</strong>th layer of Pascal's Pyramid.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>On the console, you will be given a number <strong>N</strong> where <code>N &gt; 0</code>.</p>
<h2>Output Description</h2>
<p>You must print out layer <strong>N</strong> of Pascal's Pyramid. The triangle cross-section must be presented so the point is at the top. Each row shall be separated by newlines, and each number shall be separated by spaces. Spacing is not important but your submission would be even cooler if it were displayed properly. For example, for the 3rd layer, a valid output would be as so:</p>
<pre><code>1
2 2
1 2 1
</code></pre>
<p>Or, better:</p>
<pre><code>  1
 2 2
1 2 1
</code></pre>
<p>Or even:</p>
<pre><code>   1
     2   2
1   2 1
</code></pre>
<p>But why you'd do the latter is beyond me.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<pre><code>6
</code></pre>
<h2>Sample Output</h2>
<pre><code>1
5 5
10 20 10
10 30 30 10
5 20 30 20 5
1 5 10 10 5 1
</code></pre>
<h1>Challenge</h1>
<h2>Challenge Input</h2>
<pre><code>14
</code></pre>
<h1>Notes</h1>
<p>There are ways to quickly do this that use the <a href="http://en.wikipedia.org/wiki/Factorial">Factorial function</a>. Also, look at the pattern the 'rows' make in relation to the leftmost and rightmost number and Pascal's triangle.<br/>
Reading material on Pascal's Pyramid <a href="http://en.wikipedia.org/wiki/Pascal%27s_pyramid">can be found here</a>.</p>
<p>Jagged multidimensional arrays will come in handy here.</p>
<p>I'm still trying to gauge relative challenge difficulty, so please excuse me and let me know if this is too challenging for an Easy rating.</p>
</div>
