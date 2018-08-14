# Broken Keyboard
<div class="md"><h1>Description</h1>
<p>Help! My keyboard is broken, only a few keys work any more. If I tell you what keys work, can you tell me what words I can write?</p>
<p>(You should use the trusty <a href="http://norvig.com/ngrams/enable1.txt">enable1.txt</a> file, or <code>/usr/share/dict/words</code> to chose your valid English words from.)</p>
<h1>Input Description</h1>
<p>You'll be given a line with a single integer on it, telling you how many lines to read. Then you'll be given that many lines, each line a list of letters representing the keys that work on my keyboard. Example:</p>
<pre><code>3
abcd
qwer
hjklo
</code></pre>
<h1>Output Description</h1>
<p>Your program should emit the longest valid English language word you can make for each keyboard configuration. </p>
<pre><code>abcd = bacaba
qwer = ewerer
hjklo = kolokolo
</code></pre>
<h1>Challenge Input</h1>
<pre><code>4
edcf
bnik
poil
vybu
</code></pre>
<h1>Challenge Output</h1>
<pre><code>edcf = deedeed
bnik = bikini
poil = pililloo
vybu = bubby
</code></pre>
<h1>Credit</h1>
<p>This challenge was inspired by <a href="/u/ThinkinWithSand">/u/ThinkinWithSand</a>, many thanks! If you have any ideas, please share them on <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and there's a chance we'll use it. </p>
</div>
