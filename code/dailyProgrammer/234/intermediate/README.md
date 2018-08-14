# Red Squiggles
<div class="md"><p>It looks like the moderators fell down on the job! I'll send in an emergency challenge. </p>
<h1>Description</h1>
<p>Many of us are familiar with real-time spell checkers in our text editors. Two of the more popular editors Microsoft Word or Google Docs will insert a red squiggly line under a word as it's typed incorrectly to indicate you have a problem. (Back in my day you had to run spell check <em>after</em> the fact, and that was an extra feature you paid for. Real time was just a dream.) The lookup in a dictionary is dynamic. At some point, the error occurs and the number of possible words that it could be goes to zero. </p>
<p>For example, take the word <code>foobar</code>. Up until <code>foo</code> it could be words like <code>foot</code>, <code>fool</code>, <code>food</code>, etc. But once I type the <code>b</code> it's appearant that no words could possibly match, and Word throws a red squiggly line. </p>
<p>Your challenge today is to implement a real time spell checker and indicate where you would throw the red squiggle. For your dictionary use <code>/usr/share/dict/words</code> or the always useful <a href="http://norvig.com/ngrams/enable1.txt">enable1.txt</a>. </p>
<h1>Input Description</h1>
<p>You'll be given words, one per line. Examples:</p>
<pre><code>foobar
garbgae
</code></pre>
<h1>Output Description</h1>
<p>Your program should emit an indicator for where you would flag the word as mispelled. Examples:</p>
<pre><code>foob&lt;ar
garbg&lt;ae
</code></pre>
<p>Here the <code>&lt;</code> indicates "This is the start of the mispelling". If the word is spelled correctly, indicate so.</p>
<h1>Challenge Input</h1>
<pre><code>accomodate
acknowlegement
arguemint 
comitmment 
deductabel
depindant
existanse
forworde
herrass
inadvartent
judgemant 
ocurrance
parogative
suparseed
</code></pre>
<h1>Challenge Output</h1>
<pre><code>accomo&lt;date
acknowleg&lt;ement
arguem&lt;int 
comitm&lt;ment 
deducta&lt;bel
depin&lt;dant
exista&lt;nse
forword&lt;e
herra&lt;ss
inadva&lt;rtent
judgema&lt;nt 
ocur&lt;rance
parog&lt;ative
supa&lt;rseed
</code></pre>
<h1>Note</h1>
<p>When I run this on OSX's <code>/usr/share/dict/words</code> I get some slightly different output, for example the word "supari" is in OSX but not in <code>enable1.txt</code>. That might explain some of your differences at times.</p>
<h1>Bonus</h1>
<p>Include some suggested replacement words using any strategy you wish (edit distance, for example, or where you are in your data structure if you're using a trie). </p>
</div>
