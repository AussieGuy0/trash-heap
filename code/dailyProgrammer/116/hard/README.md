# Maximum Random Walk
<div class="md"><h1><a href="#HardIcon"></a> <em>(Hard)</em>: Maximum Random Walk</h1>
<p>Consider the classic random walk: at each step, you have a 1/2 chance of taking a step to the left and a 1/2 chance of taking a step to the right. Your expected position after a period of time is zero; that is the average over many such random walks is that you end up where you started. A more interesting question is what is the expected rightmost position you will attain during the walk.</p>
<p><em>Author: thePersonCSC</em></p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>The input consists of an integer n, which is the number of steps to take (1 &lt;= n &lt;= 1000). The final two are double precision floating-point values L and R which are the probabilities of taking a step left or right respectively at each step (0 &lt;= L &lt;= 1, 0 &lt;= R &lt;= 1, 0 &lt;= L + R &lt;= 1). Note: the probability of not taking a step would be 1-L-R.</p>
<h2>Output Description</h2>
<p>A single double precision floating-point value which is the expected rightmost position you will obtain during the walk (to, at least, four decimal places).</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<p>walk(1,.5,.5)
walk(4,.5,.5)
walk(10,.5,.4)</p>
<h2>Sample Output</h2>
<p>walk(1,.5,.5) returns 0.5000
walk(4,.5,.5) returns 1.1875
walk(10,.5,.4) returns 1.4965</p>
<h1>Challenge Input</h1>
<p>What is walk(1000,.5,.4)?</p>
<h2>Challenge Input Solution</h2>
<p>(No solution provided by author)</p>
<h1>Note</h1>
<ul>
<li><p>Have your code execute in less that 2 minutes with any input where n &lt;= 1000</p></li>
<li><p>I took this problem from the regional ACM ICPC of Greater New York.</p></li>
</ul>
</div>
