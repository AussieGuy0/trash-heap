# Fake coins
<div class="md"><h1>Description</h1>
<p>Their are some false golden coins, wich are lighter then others, in the treasure chest. The assistant has weighed the coins, but can not figure out which are false and which are not.</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input description</h2>
<p>Each coin is labeled with a letter, and is put on the scale in groups or by itself.
The input consist of the coins on the left side, the coins on the right side and the way the scale tipped. This can be <code>left</code>, <code>right</code> or <code>equal</code> when the two sides wheigt the same. </p>
<h3>Input 1</h3>
<pre><code>a b left
a c equal
</code></pre>
<h3>Input 2</h3>
<pre><code>a c equal
</code></pre>
<h3>Input 3</h3>
<pre><code>a c equal
a b equal
c b left
</code></pre>
<h2>Output description</h2>
<p>You must determine which coins are lighter then the others.</p>
<h3>Output 1</h3>
<pre><code>b is lighter
</code></pre>
<p>It is possible that you can't determine this because you have not in enough info.</p>
<h3>Output 2</h3>
<pre><code>no fake coins detected
</code></pre>
<p>And it is possible that the provided data has been inconsistent.</p>
<h3>Output 3</h3>
<pre><code>data is inconsistent
</code></pre>
<h1>Notes/Hints</h1>
<p><code>left</code> means that the left side is heavier. Same goes for <code>right</code>...</p>
<h1>Challenge input</h1>
<h2>1</h2>
<pre><code>ab xy left
b x equal
a b equal
</code></pre>
<h2>2</h2>
<pre><code>a x equal
b x equal
y a left
</code></pre>
<h2>3</h2>
<pre><code>abcd efgh equal
abci efjk left
abij efgl equal
mnopqrs tuvwxyz equal
</code></pre>
<h2>4</h2>
<pre><code>abc efg equal
a e left
</code></pre>
<h1>Finally</h1>
<p>Have a good challenge idea?</p>
<p>Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
<h1>Edit Notes</h1>
<p>You can assume that there is only 1 fake coin, if not, the data is inconsistent.
If your solution worked without this assumption, you can leave it like that.</p>
<p>And all real coins weight the same, just like the fake coins. But no real weight is necessary to complete the challenge</p>
</div>
