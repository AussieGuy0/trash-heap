# Winning the Tournament
<div class="md"><h1>Description</h1>
<p>The basket weaving world championships are finally about to begin, and
everybody is bubbling with excitement. The tournament will be an intense
battle between <strong>16</strong> people. Each competitor has a weaving skill level,
a positive integer below 10<sup>6</sup>. We'll denote the n<sup>th</sup> person's skill level
as <code>A[n]</code>.</p>
<p>Here’s how the winner of the championship will be decided:</p>
<ol>
<li><p>The <em>remaining</em> competitors are randomly paired off with each other (a
pairing is chosen uniformly from all possible pairings at random).</p></li>
<li><p>Each pair has an intense one-on-one weaving battle! The probability that
person <code>n</code> wins a battle against person <code>k</code> is <code>A[n] / (A[n] + A[k])</code>.</p></li>
<li><p>The loser of each one-on-one battle is ejected from the tournament.</p></li>
<li><p>Repeat steps 1-3 until only one competitor remains. That remaining person
wins! (Note that with 16 people there will always be exactly four rounds of
pairings)</p></li>
</ol>
<p>You can hardly wait for the matches to begin, so you would like to know
beforehand the probability that each competitor will win the tournament given
all their skill levels.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input description</h2>
<p>Your input will be a space separated list of 16 integers in the range 1 to
10<sup>6</sup>-1 inclusive.</p>
<h2>Output description</h2>
<p>Output 16 real numbers between 0 and 1, where the n<sup>th</sup> value is the
probability that the n<sup>th</sup> person will win the tournament. Make sure each
number has at least 6 places after the decimal point.</p>
<h2>Sample Inputs and Outputs</h2>
<h3>Sample 1 Input</h3>
<pre><code>1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
</code></pre>
<h3>Sample 1 Output</h3>
<pre><code>0.000106 0.001101 0.003752 0.008352 0.014896 0.023237 0.033171 0.044485
0.056975 0.070457 0.084769 0.099768 0.115334 0.131363 0.147766 0.164466
</code></pre>
<h3>Sample 1 Input</h3>
<pre><code>5 10 13 88 45 21 79 9 56 21 90 55 17 35 85 34
</code></pre>
<h3>Sample 1 Output</h3>
<pre><code>0.000124 0.001200 0.002616 0.180212 0.054654 0.009631 0.151723 0.000867
0.083360 0.009631 0.186620 0.080611 0.005531 0.032281 0.170648 0.030291
</code></pre>
<h1>Bonus</h1>
<p>If you're stuck, try these easier versions of the same problem:</p>
<h2>Intermediate Sample Input</h2>
<pre><code>1 2 3 4 5 6 7 8
</code></pre>
<h2>Intermediate Sample Output</h2>
<pre><code>0.004884 0.024842 0.056171 0.094499 0.136913 0.181597 0.227421 0.273674
</code></pre>
<h2>Easy Sample Input</h2>
<pre><code>1 2 3 4
</code></pre>
<h2>Easy Sample Output</h2>
<pre><code>0.063862 0.185608 0.312857 0.437672
</code></pre>
<h1>Challenge</h1>
<p>Get your code to run as quickly as possible. For languages with a speed
comparable to C++, try to get it to run in under 10 seconds.</p>
<h1>Credit</h1>
<p>This challenge <a href="https://redd.it/3drz14">was suggested</a> by <a href="/u/Cephian">/u/Cephian</a>. If you
have a challenge idea, please share it in <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and there's
a good chance we'll use it.</p>
</div>
