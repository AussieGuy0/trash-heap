# Mahjong Hands
<div class="md"><h1>Description</h1>
<p>You are the biggest, baddest mahjong player around. Your enemies tremble at your presence on the battlefield, and you can barely walk ten steps before a fan begs you for an autograph.</p>
<p>However, you have a dark secret that would ruin you if it ever came to light. You're terrible at determining whether a hand is a winning hand. For now, you've been able to bluff and bluster your way, but you know that one day you won't be able to get away with it.</p>
<p>As such, you've decided to write a program to assist you!</p>
<h2>Further Details</h2>
<p>Mahjong (not to be confused with <a href="http://en.wikipedia.org/wiki/Mahjong_solitaire">mahjong solitaire</a>) is a game where hands are composed from combinations of tiles. There are a number of variants of mahjong, but for this challenge, we will consider a simplified variant of Japanese Mahjong which is also known as Riichi Mahjong.</p>
<h2>Basic Version</h2>
<p>There are three suits in this variant, "Bamboo", "Circle" and "Character". Every tile that belongs to these suits has a value that ranges from 1 - 9.</p>
<p>To complete a hand, tiles are organised into groups. If every tile in a hand belongs to a single group (and each tile can only be used once), the hand is a winning hand.</p>
<p>For now, we shall consider the groups "Pair", "Set" and "Sequence". They are composed as follows:</p>
<p>Pair - Two tiles with the same suit and value</p>
<p>Set - Three tiles with the same suit and value</p>
<p>Sequence - Three tiles with the same suit, and which increment in value, such as "Circle 2, Circle 3, Circle 4". There is no value wrapping so "Circle 9, Circle 1, Circle 2" would not be considered valid.</p>
<p>A hand is composed of 14 tiles.</p>
<h2>Bonus 1 - Adding Quads</h2>
<p>There is actually a fourth group called a "Quad". It is just like a pair and a set, except it is composed of four tiles.</p>
<p>What makes this group special is that a hand containing quads will actually have a hand larger than 14, 1 for every quad. This is fine, as long as there is <em>1, and only 1 pair</em>.</p>
<h2>Bonus 2 - Adding Honour Tiles</h2>
<p>In addition to the tiles belonging to the three suits, there are 7 additional tiles. These tiles have no value, and are collectively known as "honour" tiles.</p>
<p>As they have no value, they cannot be members of a sequence. Furthermore, they can only be part of a set or pair with tiles that are exactly the same. For example, "Red Dragon, Red Dragon, Red Dragon" would be a valid set, but "Red Dragon, Green Dragon, Red Dragon" would not.</p>
<p>These additional tiles are:</p>
<ul>
<li>Green Dragon</li>
<li>Red Dragon</li>
<li>White Dragon</li>
<li>North Wind</li>
<li>East Wind</li>
<li>South Wind</li>
<li>West Wind</li>
</ul>
<h2>Bonus 3 - Seven Pairs</h2>
<p>There are a number of special hands that are an exception to the above rules. One such hand is "Seven Pairs". As the name suggests, it is a hand composed of seven pairs.</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input description</h2>
<h3>Basic</h3>
<p>You will be provided with N on a single line, followed by N lines of the following format:</p>
<p>&lt;tile suit&gt;,&lt;value&gt;</p>
<h3>Bonus 2</h3>
<p>In addition, the lines may be of the format:</p>
<p>&lt;honour tile&gt;</p>
<h2>Output description</h2>
<p>You should output whether the hand is a winning hand or not.</p>
<h1>Sample Inputs and Outputs</h1>
<h2>Sample Input (Standard)</h2>
<pre><code>14
Circle,4
Circle,5
Circle,6
Bamboo,1
Bamboo,2
Bamboo,3
Character,2
Character,2
Character,2
Circle,1
Circle,1
Bamboo,7
Bamboo,8
Bamboo,9
</code></pre>
<h2>Sample Output (Standard)</h2>
<pre><code>Winning hand
</code></pre>
<h2>Sample Input (Standard)</h2>
<pre><code>14
Circle,4
Bamboo,1
Circle,5
Bamboo,2
Character,2
Bamboo,3
Character,2
Circle,6
Character,2
Circle,1
Bamboo,8
Circle,1
Bamboo,7
Bamboo,9
</code></pre>
<h2>Sample Output (Standard)</h2>
<pre><code>Winning hand
</code></pre>
<h2>Sample Input (Standard)</h2>
<pre><code>14
Circle,4
Circle,5
Circle,6
Circle,4
Circle,5
Circle,6
Circle,1
Circle,1
Bamboo,7
Bamboo,8
Bamboo,9
Circle,4
Circle,5
Circle,6
</code></pre>
<h2>Sample Output (Standard)</h2>
<pre><code>Winning hand
</code></pre>
<h2>Sample Input (Bonus 1)</h2>
<pre><code>15
Circle,4
Circle,5
Circle,6
Bamboo,1
Bamboo,2
Bamboo,3
Character,2
Character,2
Character,2
Character,2
Circle,1
Circle,1
Bamboo,7
Bamboo,8
Bamboo,9
</code></pre>
<h2>Sample Output (Bonus 1)</h2>
<pre><code>Winning hand
</code></pre>
<h2>Sample Input (Bonus 1)</h2>
<pre><code>16
Circle,4
Circle,5
Circle,6
Bamboo,1
Bamboo,2
Bamboo,3
Character,2
Character,2
Character,2
Character,2
Circle,1
Circle,1
Circle,1
Bamboo,7
Bamboo,8
Bamboo,9
</code></pre>
<h2>Sample Output (Bonus 1)</h2>
<pre><code>Not a winning hand
</code></pre>
<h2>Sample Input (Bonus 2)</h2>
<pre><code>14
Circle,4
Circle,5
Circle,6
Bamboo,1
Bamboo,2
Bamboo,3
Red Dragon
Red Dragon
Red Dragon
Circle,1
Circle,1
Bamboo,7
Bamboo,8
Bamboo,9
</code></pre>
<h2>Sample Output (Bonus 2)</h2>
<pre><code>Winning hand
</code></pre>
<h2>Sample Input (Bonus 2)</h2>
<pre><code>14
Circle,4
Circle,5
Circle,6
Bamboo,1
Bamboo,2
Bamboo,3
Red Dragon
Green Dragon
White Dragon
Circle,1
Circle,1
Bamboo,7
Bamboo,8
Bamboo,9
</code></pre>
<h2>Sample Output (Bonus 2)</h2>
<pre><code>Not a winning hand
</code></pre>
<h2>Sample Input (Bonus 3)</h2>
<pre><code>14
Circle,4
Circle,4
Character,5
Character,5
Bamboo,5
Bamboo,5
Circle,5
Circle,5
Circle,7
Circle,7
Circle,9
Circle,9
Circle,9
Circle,9
</code></pre>
<h2>Sample Output (Bonus 3)</h2>
<pre><code>Winning hand
</code></pre>
<h1>Notes</h1>
<p>None of the bonus components depend on each other, and can be implemented in any order. The test cases do not presume completion of earlier bonus components. The order is just the recommended implementation order.</p>
<p>Many thanks to Redditor <a href="/u/oketa">/u/oketa</a> for this submission to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a>. If you have any ideas, please submit them there!</p>
</div>
