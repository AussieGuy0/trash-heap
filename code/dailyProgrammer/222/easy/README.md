# Balancing Words
<div class="md"><h1>Description</h1>
<p>Today we're going to balance words on one of the letters in them. We'll use the position and letter itself to calculate the weight around the balance point. A word can be balanced if the weight on either side of the balance point is equal. Not all words can be balanced, but those that can are interesting for this challenge.</p>
<p>The formula to calculate the weight of the word is to look at the letter position in the English alphabet (so A=1, B=2, C=3 ... Z=26) as the letter weight, then multiply that by the distance from the balance point, so the first letter away is multiplied by 1, the second away by 2, etc. </p>
<p>As an example:</p>
<p>STEAD balances at T: 1 * S(19) = 1 * E(5) + 2 * A(1) + 3 * D(4))</p>
<h1>Input Description</h1>
<p>You'll be given a series of English words. Example:</p>
<pre><code>STEAD
</code></pre>
<h1>Output Description</h1>
<p>Your program or function should emit the words split by their balance point and the weight on either side of the balance point. Example:</p>
<pre><code>S T EAD - 19
</code></pre>
<p>This indicates that the T is the balance point and that the weight on either side is 19.</p>
<h1>Challenge Input</h1>
<pre><code>CONSUBSTANTIATION
WRONGHEADED
UNINTELLIGIBILITY
SUPERGLUE
</code></pre>
<h1>Challenge Output</h1>
<p><em>Updated</em> - the weights and answers I had originally were wrong. My apologies. </p>
<pre><code>CONSUBST A NTIATION - 456
WRO N GHEADED - 120
UNINTELL I GIBILITY - 521    
SUPERGLUE DOES NOT BALANCE
</code></pre>
<h1>Notes</h1>
<p>This was found on a <a href="http://www.questrel.com/records.html">word games page</a> suggested by <a href="/u/cDull">/u/cDull</a>, thanks! If you have your own idea for a challenge, submit it to <a href="/r/DailyProgrammer_Ideas">/r/DailyProgrammer_Ideas</a>, and there's a good chance we'll post it.</p>
</div>
