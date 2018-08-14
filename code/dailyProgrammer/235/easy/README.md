# Ruth-Aaron Pairs
<div class="md"><h1>Description</h1>
<p>In mathematics, a Ruth–Aaron pair consists of two consecutive integers (e.g. 714 and 715) for which the sums of the <em>distinct</em> prime factors of each integer are equal. For example, we know that (714, 715) is a valid Ruth-Aaron pair because its distinct prime factors are:</p>
<pre><code>714 = 2 * 3 * 7 * 17
715 = 5 * 11 * 13
</code></pre>
<p>and the sum of those is both 29:</p>
<pre><code>2 + 3 + 7 + 17 = 5 + 11 + 13 = 29
</code></pre>
<p>The name was given by Carl Pomerance, a mathematician at the University of Georgia, for Babe Ruth and Hank Aaron, as Ruth's career regular-season home run total was 714, a record which Aaron eclipsed on April 8, 1974, when he hit his 715th career home run. A student of one of Pomerance's colleagues noticed that the sums of the distinct prime factors of 714 and 715 were equal.</p>
<p>For a little more on it, see MathWorld - <a href="http://mathworld.wolfram.com/Ruth-AaronPair.html">http://mathworld.wolfram.com/Ruth-AaronPair.html</a></p>
<p>Your task today is to determine if a pair of numbers is indeed a valid Ruth-Aaron pair.</p>
<h1>Input Description</h1>
<p>You'll be given a single integer <em>N</em> on one line to tell you how many pairs to read, and then that many pairs as two-tuples. For example:</p>
<pre><code>3
(714,715)
(77,78)
(20,21)
</code></pre>
<h1>Output Description</h1>
<p>Your program should emit if the numbers are valid Ruth-Aaron pairs. Example:</p>
<pre><code>(714,715) VALID
(77,78) VALID
(20,21) NOT VALID
</code></pre>
<h1>Chalenge Input</h1>
<pre><code>4
(5,6) 
(2107,2108) 
(492,493) 
(128,129) 
</code></pre>
<h1>Challenge Output</h1>
<pre><code>(5,6) VALID
(2107,2108) VALID
(492,493) VALID
(128,129) NOT VALID
</code></pre>
</div>
