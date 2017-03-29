# Garland words
<div class="md"><h1>Description</h1>
<p>A <a href="http://blog.vivekhaldar.com/post/89763722591/garland-words"><em>garland word</em></a> is one that starts and ends with the same N letters in the same order, for some N greater than 0, but less than the length of the word. I'll call the maximum N for which this works the garland word's <em>degree</em>. For instance, "onion" is a garland word of degree 2, because its first 2 letters "on" are the same as its last 2 letters. The name "garland word" comes from the fact that you can make chains of the word in this manner:</p>
<pre><code>onionionionionionionionionionion...
</code></pre>
<p>Today's challenge is to write a function <code>garland</code> that, given a lowercase word, returns the degree of the word if it's a garland word, and 0 otherwise.</p>
<h1>Examples</h1>
<pre><code>garland("programmer") -&gt; 0
garland("ceramic") -&gt; 1
garland("onion") -&gt; 2
garland("alfalfa") -&gt; 4
</code></pre>
<h1>Optional challenges</h1>
<ol>
<li>Given a garland word, print out the chain using that word, as with "onion" above. You can make it as long or short as you like, even infinite.</li>
<li>Find the largest degree of any garland word in the <a href="https://code.google.com/p/dotnetperls-controls/downloads/detail?name=enable1.txt">enable1 English word list</a>.</li>
<li>Find a word list for some other language, and see if you can find a language with a garland word with a higher degree.</li>
</ol>
<p><em>Thanks to <a href="/u/skeeto">/u/skeeto</a> for submitting this challenge on <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a>!</em></p>
</div>
