# Regular Expression Fractals
<div class="md"><h1>Description:</h1>
<p>For today's challenge you will be generating fractal images from regular expressions. This album describes visually how it works:</p>
<ul>
<li>[<a href="https://imgur.com/a/QWMGi">https://imgur.com/a/QWMGi</a>]</li>
</ul>
<p>For the challenge you don't need to worry about color, just inclusion in the set selected by the regular expression. Also, don't implicitly wrap the regexp in ^...$. This removes the need to use .* all the time.</p>
<h1>Input:</h1>
<p>On standard input you will receive two lines. The first line is an integer n that defines the size of the output image (nxn). This number will be a power of 2 (8, 16, 32, 64, 128, etc.).
The second line will be a regular expression with literals limited to the digits 1-4. That means you don't need to worry about whitespace.</p>
<h1>Output:</h1>
<p>Output a binary image of the regexp fractal according to the specification. You could print this out in the terminal with characters or you could produce an image file. Be creative! Feel free to share your outputs along with your submission.</p>
<h1>Example Input &amp; Output:</h1>
<h2>Input Example 1:</h2>
<pre><code> 256
 [13][24][^1][^2][^3][^4]
</code></pre>
<h2>Output Example 1:</h2>
<ul>
<li>[<a href="http://i.imgur.com/zhSr365.png">http://i.imgur.com/zhSr365.png</a>]</li>
</ul>
<h2>Input Example 2 (Bracktracing) :</h2>
<pre><code> 256
 (.)\1..\1
</code></pre>
<h2>Output Example 2:</h2>
<ul>
<li>[<a href="http://i.imgur.com/iLu7Pq4.png">http://i.imgur.com/iLu7Pq4.png</a>]</li>
</ul>
<h1>Extra Challenge:</h1>
<p>Add color based on the length of each capture group.</p>
<h1>Challenge Credit:</h1>
<p>Huge thanks to <a href="/u/skeeto">/u/skeeto</a> for <a href="http://www.reddit.com/r/dailyprogrammer_ideas/comments/24ykjs/intermediatehard_regexp_fractals/">his idea posted on our idea subreddit</a></p>
</div>
