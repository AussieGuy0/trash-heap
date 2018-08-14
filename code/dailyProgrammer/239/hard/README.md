# An Encoding of Threes
<div class="md"><p>Are you ready to take the <a href="https://www.reddit.com/r/dailyprogrammer/comments/3rhzdj/20151104_challenge_239_intermediate_a_zerosum/">Game of Threes</a> to the next level? </p>
<h1>Background</h1>
<p>As it turns out, if we chain the steps of a Threes solution into a sequence (ignoring their signs), the sequence becomes a <a href="https://en.wikipedia.org/wiki/Ternary_numeral_system">ternary</a> representation of numeric data. In other words, we can use base 3 (instead of decimal or binary) to store numbers! </p>
<p>For example, if we were to use <a href="https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/ASCII-Table-wide.svg/2000px-ASCII-Table-wide.svg.png">ASCII character values</a> as our "data", then we could encode the letter <code>a</code> into a Threes solution like this:</p>
<ul>
<li><code>a</code> is <code>97</code> in decimal</li>
<li><code>97</code> in base 3 (ternary) is <code>10121</code></li>
<li>We can "reverse" the Threes process in order to come up with a number that has a threes solution containing the numbers <code>[1, 0, 1, 2, 1]</code> in that order.

<ul>
<li>Start at 1 (where Threes ends)</li>
<li><code>1 * 3 + 1</code> = <code>4</code></li>
<li><code>4 * 3 - 2</code> = <code>10</code></li>
<li><code>10 * 3 - 1</code> = <code>29</code></li>
<li><code>29 * 3 + 0</code> = <code>87</code></li>
<li><code>87 * 3 + 1</code> = <code>262</code></li>
</ul></li>
<li>A "Threes-encoded" <code>a</code> is then the number <code>262</code>. </li>
</ul>
<p>Note that at a couple steps, we subtracted instead of adding. Since the sign in the solution is not significant, additions can be flipped for subtractions to achieve different results. That means that <code>a</code> could actually be encoded as: <code>260</code>, <code>278</code>, <code>386</code>, <code>388</code>, or others. For example, <code>260</code> could be decoded like this:</p>
<pre><code>260 1
87 0
29 1
10 2
4 -1
1
</code></pre>
<p>That still results in <code>10121</code>, in base 10 is <code>97</code>, or ASCII <code>a</code>. However, there is now the possibility to go wrong in the decoding!</p>
<pre><code>262 2
88 2
30 0
10 -1
3 0
1
1
</code></pre>
<p>That decoding resulted in <code>22010</code>, which is base 10 <code>219</code>, or ASCII <code>Û</code>. Oops!</p>
<h1>The Problem</h1>
<p>Now that we have a way to encode/decode characters into "Threes", let's encode words:</p>
<ul>
<li><code>three</code> -&gt; <code>[11022, 10212, 11020, 10202, 10202]</code> (ternary)</li>
<li>Concatenate them all into: <code>1102210212110201020210202</code></li>
<li>Encode that string by working Threes backwards so it becomes: <code>1343814725227</code></li>
</ul>
<p>Where is this all going? Your mission for this challenge is to take a Threes-encoded English word as input, and output the original, un-encoded word. You may want to use a dictionary file containing a list of valid words. See: <a href="https://raw.githubusercontent.com/fsufitch/dailyprogrammer/master/common/enable1.txt">enable1.txt</a>. Since enable1.txt is all lowercase, you should make your word checking case-insensitive (e.g. "ExtrapOlation" is a word). Just remember that encoded upper and lower case letters have very different codes.</p>
<p><em>Note:</em> Some encoded numbers have multiple possible word solutions. If you get a slightly different word, that's okay. Alternatively, you could make your solution output <em>all</em> possible word solutions!</p>
<h2>Sample Input 1</h2>
<pre><code>1343814725227
</code></pre>
<h2>Sample Output 1</h2>
<pre><code>three
</code></pre>
<h2>Sample Input 2</h2>
<pre><code>66364005622431677379166556
</code></pre>
<h2>Sample Output 2</h2>
<pre><code>Programming
</code></pre>
<h2>Challenge Input</h2>
<pre><code>1023141284209081472421723187973153755941662449
</code></pre>
<h1>Bonus Points</h1>
<p>Solve the problem without using a words file (like "enable1.txt"). <em>Note:</em> This may or may not be possible; I'm not actually sure. <strong>Update:</strong> The bonus is actually impossible. As <a href="https://www.reddit.com/r/dailyprogrammer/comments/3rrtxh/20151106_challenge_239_hard_an_encoding_of_threes/cwqwn5s">others</a> and <a href="https://www.reddit.com/r/dailyprogrammer/comments/3rrtxh/20151106_challenge_239_hard_an_encoding_of_threes/cwr5cnt">I</a> remarked, there are just too many possible solutions/combinations. A dictionary or other language guide is necessary.</p>
<h1>Fluff</h1>
<p>This concludes the Game of Threes series. Since this was my (<a href="/u/Blackshell">/u/Blackshell</a>'s) first series of posted problems, I would really appreciate feedback on how it went. Thanks for playing!</p>
</div>
