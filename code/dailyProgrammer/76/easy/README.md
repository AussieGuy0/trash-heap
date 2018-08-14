# (Title case)
<div class="md"><p>Write a function that transforms a string into <a href="http://en.wikipedia.org/wiki/Letter_case#Headings_and_publication_titles">title case</a>. This mostly means: capitalizing only every first letter of every word in the string. However, there are some non-obvious exceptions to title case which can't easily be hard-coded. Your function must accept, as a second argument, a set or list of words that should <strong>not</strong> be capitalized. Furthermore, the <strong>first word</strong> of every title should always have a capital leter. For example:</p>
<pre><code>exceptions = ['jumps', 'the', 'over']
titlecase('the quick brown fox jumps over the lazy dog', exceptions)
</code></pre>
<p>This should return:</p>
<pre><code>The Quick Brown Fox jumps over the Lazy Dog
</code></pre>
<p>An example from the Wikipedia page:</p>
<pre><code>exceptions = ['are', 'is', 'in', 'your', 'my']
titlecase('THE vitamins ARE IN my fresh CALIFORNIA raisins', exceptions)
</code></pre>
<p>Returns:</p>
<pre><code>The Vitamins are in my Fresh California Raisins
</code></pre>
</div>
