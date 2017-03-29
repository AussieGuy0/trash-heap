# Calculating the standard deviation
<div class="md"><h1>Description</h1>
<p><strong>Standard deviation</strong> is one of the most basic measurments in statistics. For some collection of values (known as a "population" in statistics), it measures how dispersed those values are. If the standard deviation is high, it means that the values in the population are very spread out; if it's low, it means that the values are tightly clustered around the mean value.</p>
<p>For today's challenge, you will get a list of numbers as input which will serve as your statistical population, and you are then going to calculate the standard deviation of that population. There are statistical packages for many programming languages that can do this for you, but you are highly encouraged not to use them: the spirit of today's challenge is to implement the standard deviation function yourself. </p>
<p>The following steps describe how to calculate standard deviation for a collection of numbers. For this example, we will use the following values: </p>
<pre><code>5 6 11 13 19 20 25 26 28 37
</code></pre>
<ol>
<li><p>First, calculate the average (or <strong>mean</strong>) of all your values, which is defined as the sum of all the values divided by the total number of values in the population. For our example, the sum of the values is 190 and since there are 10 different values, the mean value is 190/10 = 19</p></li>
<li><p>Next, for each value in the population, calculate the difference between it and the mean value, and square that difference. So, in our example, the first value is 5 and the mean 19, so you calculate (5 - 19)<sup>2</sup> which is equal to 196.  For the second value (which is 6), you calculate (6 - 19)<sup>2</sup> which is equal to 169, and so on. </p></li>
<li><p>Calculate the sum of all the values from the previous step. For our example, it will be equal to 196 + 169 + 64 + ... = 956.</p></li>
<li><p>Divide that sum by the number of values in your population. The result is known as the <strong>variance</strong> of the population, and is equal to the square of the standard deviation. For our example, the number of values in the population is 10, so the variance is equal to 956/10 = 95.6.</p></li>
<li><p>Finally, to get standard deviation, take the square root of the variance. For our example, sqrt(95.6) ≈ 9.7775. </p></li>
</ol>
<h1>Formal inputs &amp; outputs</h1>
<h1>Input</h1>
<p>The input will consist of a single line of numbers separated by spaces. The numbers will all be positive integers.</p>
<h1>Output</h1>
<p>Your output should consist of a single line with the standard deviation rounded off to at most 4 digits after the decimal point.</p>
<h1>Sample inputs &amp; outputs</h1>
<h2>Input 1</h2>
<pre><code>5 6 11 13 19 20 25 26 28 37
</code></pre>
<h2>Output 1</h2>
<pre><code>9.7775
</code></pre>
<h2>Input 2</h2>
<pre><code>37 81 86 91 97 108 109 112 112 114 115 117 121 123 141
</code></pre>
<h2>Output 2</h2>
<pre><code>23.2908
</code></pre>
<h1>Challenge inputs</h1>
<h2>Challenge input 1</h2>
<pre><code>266 344 375 399 409 433 436 440 449 476 502 504 530 584 587
</code></pre>
<h2>Challenge input 2</h2>
<pre><code>809 816 833 849 851 961 976 1009 1069 1125 1161 1172 1178 1187 1208 1215 1229 1241 1260 1373
</code></pre>
<h1>Notes</h1>
<p>For you statistics nerds out there, note that this is the <em>population</em> standard deviation, not the <em>sample</em> standard deviation. We are, after all, given the entire population and not just a sample.</p>
<p>If you have a suggestion for a future problem, head on over to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and let us know about it!</p>
</div>
