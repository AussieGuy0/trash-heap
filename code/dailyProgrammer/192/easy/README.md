# Carry Adding
<div class="md"><h1><a href="#EasyIcon"></a> <strong>(Easy)</strong>: Carry Adding</h1>
<p>When you were first learning arithmetic, the way most people were tought to set out addition problems was like follows:</p>
<pre><code>23+456=

  23
+456
 ---
 479
 ---
</code></pre>
<p>Look familiar? And remember how, if the number went above 10, you put the number below the line:</p>
<pre><code> 559
+447
 ---
1006
 ---
 11
</code></pre>
<p>Those <code>1</code>s under the line are called the <em>carry</em> values - they are 'carried' from one column into the next. In today's challenge, you will take some numbers, add them up and (most importantly) display the output like it is shown above.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>You will accept a list of non-negative integers in the format:</p>
<pre><code>559+447+13+102
</code></pre>
<p>Such that the carry value will never be greater than 9.</p>
<h2>Output Description</h2>
<p>You are to output the result of the addition of the input numbers, in the format shown above.</p>
<h1>Sample Inputs and Outputs</h1>
<h2>Sample Input</h2>
<pre><code>23+9+66
</code></pre>
<h2>Sample Output</h2>
<pre><code>23
 9
66
--
98
--
1
</code></pre>
<h2>Sample Input</h2>
<pre><code>8765+305
</code></pre>
<h2>Sample Output</h2>
<pre><code>8765
 305
----
9070
 ---
1 1
</code></pre>
<h2>Sample Input</h2>
<pre><code>12+34+56+78+90
</code></pre>
<h2>Sample Output</h2>
<pre><code> 12
 34
 56
 78
 90
---
270
---
22
</code></pre>
<h2>Sample Input</h2>
<pre><code>999999+1
</code></pre>
<h2>Sample Output</h2>
<pre><code> 999999
      1
-------
1000000
-------
111111
</code></pre>
<h1>Extension</h1>
<p>Extend your program to handle non-integer (ie. decimal) numbers.</p>
</div>
