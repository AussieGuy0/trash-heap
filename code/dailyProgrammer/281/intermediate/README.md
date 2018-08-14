# Dank usernames
<div class="md"><h1>Description</h1>
<p>If you're named Danny Kyung or Matthew Emes, it opens up the possibility of justifying your use of usernames such as <a href="https://github.com/dank">dank</a> or <a href="https://github.com/memes">memes</a>.</p>
<p>Your task is to find the longest word such that it satisfies the criteria - that is, it is a substring of the given string but not necessarily consecutively (we can call it a sparse substring). 
If there are multiple words of same maximum length, output all of them.</p>
<p>You may use the <a href="http://norvig.com/ngrams/enable1.txt">the Enable word list</a>, or some other reasonable English word list. Every word in your output must appear in your word list.</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input description</h2>
<p>One string.</p>
<h2>Example Inputs</h2>
<pre><code>Donald Knuth
Alan Turing
Claude Shannon
</code></pre>
<h2>Output description</h2>
<p>A single word (ouptut the lengthiest word/words in case of multiple words satisfying the criteria)</p>
<h2>Example outputs</h2>
<pre><code>Donut (because **Don**ald k**nut**h)
Alanin, Anting
Cannon
</code></pre>
<p>Note : Your outputs may differ from these outputs depending on the word list you are using</p>
<h2>Challenge Inputs</h2>
<pre><code>Ada Lovelace
Haskell Curry
**Your own name!**
</code></pre>
<h1>Bonus</h1>
<p>Find a combination of words that satisfy the criteria. For example, "AlantRing" in "<strong>Alan T</strong>ur<strong>ing</strong>".</p>
<p>In case of multiple combination of words that satisfy the criteria, find the word with the highest score and print that, where the score is sum of squares of length of all the constituent words</p>
<p>For example, in "Alan Turing",<br/>
score of AlantRing is  5<sup>2</sup> + 4<sup>2</sup> = 41,<br/>
score of AlAnting is 2<sup>2</sup> + 6<sup>2</sup> = 40,<br/>
score of Alanin is 6<sup>2</sup> = 36</p>
<p>and thus of the three, the first should be printed because of highest score.</p>
<h2>Bonus Inputs</h2>
<pre><code>Donald Knuth
Alan Turing
Claude Shannon
Ada Lovelace
Haskell Curry
**Your own name!**
</code></pre>
<h1>Finally</h1>
<p>Have a good challenge idea like <a href="/u/automata-door">/u/automata-door</a> did?</p>
<p>Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
</div>
