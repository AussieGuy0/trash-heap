# What's in the bag?
<div class="md"><h1>Description</h1>
<p>Scrabble is a popular word game where players remove tiles with letters on
them from a bag and use them to create words on a board. The total number
of tiles as well as the frequency of each letter does not change between
games.</p>
<p>For this challenge we will be using the tile set from the English edition,
which has 100 tiles total. <a href="http://scrabblewizard.com/scrabble-tile-distribution/">Here's a reference for the distribution and point
value of each tile</a>.</p>
<p>Each tile will be represented by the letter that appears on it, with the
exception that blank tiles are represented by underscores <code>_</code>.</p>
<h1>Input Description</h1>
<p>The tiles already in play are inputted as an uppercase string. For example,
if 14 tiles have been removed from the bag and are in play, you would be given
an input like this:</p>
<pre><code>AEERTYOXMCNB_S
</code></pre>
<h1>Output Description</h1>
<p>You should output the tiles that are left in the bag. The list should be in
descending order of the quantity of each tile left in the bag, skipping over
amounts that have no tiles.</p>
<p>In cases where more than one letter has the same quantity remaining, output
those letters in alphabetical order, with blank tiles at the end.</p>
<pre><code>10: E
9: I
8: A
7: O
5: N, R, T
4: D, L, U
3: G, S
2: F, H, P, V, W
1: B, C, J, K, M, Q, Y, Z, _
0: X
</code></pre>
<p>If more tiles have been removed from the bag than possible, such as 3 <code>Q</code>s,
you should give a helpful error message instead of printing the list.</p>
<pre><code>Invalid input. More Q's have been taken from the bag than possible.
</code></pre>
<h1>Challenge Inputs</h1>
<ol>
<li><p><code>PQAREIOURSTHGWIOAE_</code></p></li>
<li><p><code>LQTOONOEFFJZT</code></p></li>
<li><p><code>AXHDRUIOR_XHJZUQEE</code></p></li>
</ol>
<h1>Challenge Outputs</h1>
<p>1.</p>
<pre><code>10: E
7: A, I
6: N, O
5: T
4: D, L, R
3: S, U
2: B, C, F, G, M, V, Y
1: H, J, K, P, W, X, Z, _
0: Q
</code></pre>
<p>2.</p>
<pre><code>11: E
9: A, I
6: R
5: N, O
4: D, S, T, U
3: G, L
2: B, C, H, M, P, V, W, Y, _
1: K, X
0: F, J, Q, Z
</code></pre>
<p>3.</p>
<pre><code>Invalid input. More X's have been taken from the bag than possible.
</code></pre>
<h1>Bonus</h1>
<p>After the normal output, output the distribution of tiles in play and the
total point score of both sets of tiles.</p>
<h1>Finally</h1>
<p>Have a good challenge idea?
Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
<p>Thanks to <a href="/u/genderdoom">/u/genderdoom</a> for this <a href="https://www.reddit.com/r/dailyprogrammer_ideas/comments/4j33t1/easy_whats_in_the_bag/">challenge idea</a>.</p>
</div>
