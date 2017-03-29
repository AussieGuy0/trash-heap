# (Broken Roman Numerals)
<div class="md"><p>Many ancient buildings and scriptures use <a href="http://en.wikipedia.org/wiki/Roman_numerals">Roman numerals</a> to express numbers or years. Let's say you discover a bunch of formulas using these numerals, but some of the letters used in them are unreadable, like this:</p>
<pre><code>LX?I
</code></pre>
<p>That ? could be an I, V, or X, giving you these possibilities:</p>
<pre><code>LXII = 62
LXVI = 66
LXXI = 71
</code></pre>
<p>Write a function <code>guess_roman</code> that outputs all possibilities for an input string containing any number of question marks. For example, <code>guess_roman("X??I")</code> outputs:</p>
<pre><code>XIII = 13
XVII = 17
XXII = 22
XXVI = 26
XXXI = 31
XLII = 42
XLVI = 46
XCII = 92
XCVI = 96
</code></pre>
<ul>
<li>What is the output of <code>guess_roman("D??I")</code>?</li>
<li>How many unique seven-letter Roman numerals are there (that is, how many strings does <code>guess_roman("???????")</code> return?)</li>
<li>What is their sum?</li>
</ul>
</div>
