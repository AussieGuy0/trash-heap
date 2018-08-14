# Letter Splits
<div class="md"><p>This problem is a simplified version of Text Segmentation in Natural Language Processing.</p>
<p><strong>Description</strong></p>
<p>Given a positive integer, return all the ways that the integer can be represented by letters using the mapping:</p>
<ul>
<li><code>1</code> -&gt; <code>A</code></li>
<li><code>2</code> -&gt; <code>B</code></li>
<li><p><code>3</code> -&gt; <code>C</code></p>
<p>...</p></li>
<li><p><code>25</code> -&gt; <code>Y</code></p></li>
<li><p><code>26</code> -&gt; <code>Z</code></p></li>
</ul>
<p>For example, the integer <code>1234</code> can be represented by the words :</p>
<ul>
<li><code>ABCD</code> -&gt; <code>[1,2,3,4]</code></li>
<li><code>AWD</code> -&gt; <code>[1,23,4]</code></li>
<li><code>LCD</code> -&gt; <code>[12,3,4]</code></li>
</ul>
<p><strong>Input description</strong></p>
<p>A positive integer:</p>
<p><strong>Output description</strong></p>
<p>All possible ways the number can be represented once per line.</p>
<p><strong>Examples</strong></p>
<p>Example 1:</p>
<pre><code>1234

ABCD
AWD
LCD
</code></pre>
<p>Example 2:</p>
<pre><code>1234567899876543210

LCDEFGHIIHGFEDCBJ
AWDEFGHIIHGFEDCBJ
ABCDEFGHIIHGFEDCBJ
</code></pre>
<p>Example 3:</p>
<pre><code>10520

jet
</code></pre>
<p><strong>Bonus</strong></p>
<p>We can use our beloved <a href="https://code.google.com/p/dotnetperls-controls/downloads/detail?name=enable1.txt">enable1.txt</a> (or other if you prefer that) to find real words or even sentences.</p>
<p><em>Example 1</em></p>
<pre><code>1321205

ACUTE
MUTE
</code></pre>
<p><em>Example 2</em></p>
<pre><code>1252020518

LETTER
ABETTER
</code></pre>
<p><em>Example 3</em></p>
<pre><code>85121215231518124

HELLOWORLD
</code></pre>
<p><em>Bonus Input</em></p>
<pre><code>81161625815129412519419122516181571811313518
</code></pre>
<p><strong>Finally</strong></p>
<p>Thanks to <a href="/u/wizao">/u/wizao</a> and <a href="/u/smls">/u/smls</a> for the idea and bonus idea</p>
<p>Have a good challenge idea?
Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
</div>
