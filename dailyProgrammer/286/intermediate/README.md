# Zeckendorf Representations of Positive Integers
<div class="md"><h1>Description</h1>
<p>Zeckendorf's theorem, named after Belgian mathematician Edouard Zeckendorf, is a theorem about the representation of integers as sums of Fibonacci numbers.</p>
<p>Zeckendorf's theorem states that every positive integer can be represented uniquely as the sum of one or more distinct Fibonacci numbers in such a way that the sum does not include any two consecutive Fibonacci numbers. </p>
<p>For example, the Zeckendorf representation of 100 is</p>
<pre><code>100 = 89 + 8 + 3
</code></pre>
<p>There are other ways of representing 100 as the sum of Fibonacci numbers – for example</p>
<pre><code>100 = 89 + 8 + 2 + 1
100 = 55 + 34 + 8 + 3
</code></pre>
<p>but these are not Zeckendorf representations because 1 and 2 are consecutive Fibonacci numbers, as are 34 and 55.</p>
<p>Your challenge today is to write a program that can decompose a positive integer into its Zeckendorf representation.</p>
<h1>Sample Input</h1>
<p>You'll be given a number <em>N</em> on the first line, telling you how many lines to read. You'll be given a list of <em>N</em> positive integers, one per line. Example:</p>
<pre><code>3
4
100
30
</code></pre>
<h1>Sample Output</h1>
<p>Your program should emit the Zeckendorf representation for each of the numbers. Example:</p>
<pre><code>4 = 3 + 1
100 = 89 + 8 + 3 
30 = 21 + 8 + 1
</code></pre>
<h1>Challenge Input</h1>
<pre><code>5
120
34
88
90
320
</code></pre>
</div>
