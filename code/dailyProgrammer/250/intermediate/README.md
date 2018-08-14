# Self-descriptive numbers
<div class="md"><h1>Description</h1>
<p>A descriptive number tells us how many digits we have depending on its index.</p>
<p>For a number with n digits in it, the most significant digit stands for the '0's and the least significant stands for (n - 1) digit.</p>
<p>As example the descriptive number of 101 is 120 meaning:</p>
<ul>
<li>It contains 1 at index 0, indicating that there is one '0' in 101;</li>
<li>It contains 2 at index 1, indicating that there are two '1' in 101;</li>
<li>It contains 0 at index 2, indicating that there are no '2's in 101;</li>
</ul>
<p>Today we are looking for numbers that describe themself:</p>
<blockquote>
<p>In mathematics, a self-descriptive number is an integer m that in a given base b is b digits long in which each digit d at position n (the most significant digit being at position 0 and the least significant at position b - 1) counts how many instances of digit n are in m.</p>
</blockquote>
<p><a href="https://en.wikipedia.org/wiki/Self-descriptive_number">Source</a></p>
<p>As example we are looking for a 5 digit number that describes itself. This would be <code>21200</code>:</p>
<ul>
<li>It contains 2 at index 0, indicating that there are two '0's in 21200;</li>
<li>It contains 1 at index 1, indicating that there is one '1' in 21200;</li>
<li>It contains 2 at index 2, indicating that there are two '2's in 21200;</li>
<li>It contains 0 at index 3, indicating that there are no '3's in 21200;</li>
<li>It contains 0 at index 4, indicating that there are no '4's in 21200;</li>
</ul>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input description</h2>
<p>We will search for self descriptive numbers in a range.
As input you will be given the number of digits for that range.</p>
<p>As example <code>3</code> will give us a range between <code>100</code> and <code>999</code></p>
<h2>Output description</h2>
<p>Print out all the self descriptive numbers for that range like this:</p>
<pre><code>1210
2020
</code></pre>
<p>Or when none is found (this is very much possible), you can write something like this:</p>
<pre><code>No self-descriptive number found
</code></pre>
<h2>In and outs</h2>
<p>Sample 1</p>
<p>In</p>
<pre><code>3
</code></pre>
<p>Out</p>
<pre><code>No self-descriptive number found
</code></pre>
<p>Sample 2</p>
<p>In</p>
<pre><code>4
</code></pre>
<p>Out</p>
<pre><code>1210
2020
</code></pre>
<p>Sample 3</p>
<p>In</p>
<pre><code>5
</code></pre>
<p>Out</p>
<pre><code>21200
</code></pre>
<h2>Challenge input</h2>
<pre><code>8
10
13
15
</code></pre>
<h1>Notes/Hints</h1>
<p>When the number digits go beyond 10 you know the descriptive number will have trailing zero's.</p>
<p><a href="https://www.youtube.com/watch?v=1GKfEDvhWdY">You can watch this for a good solution if you get stuck</a></p>
<h1>Bonus</h1>
<p>You can easily do this by bruteforcing this, but from 10 or more digit's on, this will take ages.</p>
<p>The bonus challenge is to make it run for the large numbers under 50 ms, here you have my <code>time</code> for 15 digits</p>
<pre><code>real    0m0.018s
user    0m0.001s
sys     0m0.004s
</code></pre>
<h1>Finally</h1>
<p>Have a good challenge idea?</p>
<p>Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
<p>And special thanks to <a href="/u/Vacster">/u/Vacster</a> for the idea.</p>
<p><strong>EDIT</strong></p>
<p>Thanks to <a href="/u/wboehme">/u/wboehme</a> to point out some typos</p>
</div>
