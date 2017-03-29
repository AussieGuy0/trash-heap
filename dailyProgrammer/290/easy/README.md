# Kaprekar Numbers
<div class="md"><h1>Description</h1>
<p>In mathematics, a <a href="https://en.wikipedia.org/wiki/Kaprekar_number">Kaprekar number</a> for a given base is a non-negative integer, the representation of whose square in that base can be split into two parts that add up to the original number again. For instance, 45 is a Kaprekar number, because 45<sup>2</sup> = 2025 and 20+25 = 45. The Kaprekar numbers are named after D. R. Kaprekar. </p>
<p>I was introduced to this after the recent <a href="https://www.reddit.com/r/dailyprogrammer/comments/56tbds/20161010_challenge_287_easy_kaprekars_routine/">Kaprekar constant challenge</a>. </p>
<p>For the main challenge we'll only focus on base 10 numbers. For a bonus, see if you can make it work in arbitrary bases.</p>
<h1>Input Description</h1>
<p>Your program will receive two integers per line telling you the start and end of the range to scan, inclusively. Example:</p>
<pre><code>1 50
</code></pre>
<h1>Output Description</h1>
<p>Your program should emit the Kaprekar numbers in that range. From our example:</p>
<pre><code>45
</code></pre>
<h1>Challenge Input</h1>
<pre><code>2 100
101 9000
</code></pre>
<h1>Challenge Output</h1>
<p><em>Updated the output as per <a href="https://www.reddit.com/r/dailyprogrammer/comments/5aemnn/20161031_challenge_290_easy_kaprekar_numbers/d9fx1hf/">this comment</a></em></p>
<pre><code>9 45 55 99
297 703 999 2223 2728 4879 5050 5292 7272 7777
</code></pre>
</div>
