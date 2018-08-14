# N-Divisible Digits
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Easy)</em>: N-Divisible Digits</h1>
<p>Write a program that takes two integers, N and M, and find the largest integer composed of N-digits that is evenly divisible by M. N will always be 1 or greater, with M being 2 or greater. Note that some combinations of N and M will not have a solution.</p>
<p>Example: if you are given an N of 3 and M of 2, the largest integer with 3-digits is 999, but the largest 3-digit number that is evenly divisible by 2 is 998, since 998 <a href="https://en.wikipedia.org/wiki/Modular_arithmetic">Modulo</a> 2 is 0. Another example is where N is 2 and M is 101. Since the largest 2-digit integer is 99, and no integers between 1 and 99 are divisible by 101, there is no solution.</p>
<p><em>Author:</em> nint22. <em>Note:</em> Sorry for the absence of challenges; I've been away for the last two weeks, and am getting back into the grove of things.</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>You will be given two integers, N and M, on standard console input. They will be space delimited values where N will range from 1 to 9, and M will range from 2 to 999,999,999.</p>
<h2>Output Description</h2>
<p>Print the largest integer within the range of 1 to the largest integer formed by N-digits, that is evenly-divisible by the integer M. You only need to print the largest integer, not the set of evenly-divisible integers. If there is no solution, print "No solution found".</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input 1</h2>
<pre><code>3 2
</code></pre>
<h2>Sample Output 1</h2>
<pre><code>998
</code></pre>
<h2>Sample Input 2</h2>
<pre><code>7 4241275
</code></pre>
<h2>Sample Output 2</h2>
<pre><code>8482550
</code></pre>
</div>
