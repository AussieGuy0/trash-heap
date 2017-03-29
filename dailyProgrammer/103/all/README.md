# (Text transformations)
<div class="md"><h3>Easy</h3>
<p>Back in the 90s (and early 00s) people thought it was a cool idea to \/\/|2][73 |_1|&lt;3 7H15 to bypass text filters on BBSes. They called it <a href="http://en.wikipedia.org/wiki/Leet">Leet (or 1337)</a>, and it quickly became popular all over the internet. The habit has died out, but it's still quite interesting to see the various replacements people came up with when transforming characters.</p>
<p>Your job's to write a program that translates normal text into Leet, either by hardcoding a number of translations (e.g. A becomes either 4 or /-\, randomly) or allowing the user to specify a random translation table as an input file, like this:</p>
<pre><code>A    4 /-\
B    |3 [3 8
C    ( {
(etc.)
</code></pre>
<p>Each line in the table contains a single character, followed by whitespace, followed by a space-separated list of possible replacements. Characters should have some non-zero chance of not being replaced at all.</p>
<h3>Intermediate</h3>
<p>Add a <code>--count</code> option to your program that counts the number of possible outcomes your program could output for a given input. Using the entire translation table from <a href="http://en.wikipedia.org/wiki/Leet#Orthography">Wikipedia</a>, how many possible results are there for <code>./leet --count "DAILYPROG"</code>? (Note that each character can also remain unchanged.)</p>
<p>Also, write a translation table to convert ASCII characters to hex codes (<code>20</code> to <code>7E</code>), i.e. <code>"DAILY" -&gt; "4441494C59"</code>.</p>
<h3>Difficult</h3>
<p>Add a <code>--decode</code> option to your program, that tries to reverse the process, again by picking any possibility randomly: <code>/\/\/</code> could decode to <code>M/</code>, or <code>NV</code>, or <code>A/V</code>, etc.</p>
<p>Extend the <code>--count</code> option to work with <code>--decode</code>: how many interpretations are there for a given input?</p>
</div>
