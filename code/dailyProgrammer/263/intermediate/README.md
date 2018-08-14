# Help Eminem win his rap battle!
<div class="md"><h1>Description</h1>
<p>Eminem is out of rhymes! He's enlisted you to help him out.</p>
<p>The typical definition of a rhyme is two words with their last syllable sounding the same.
E.g. "solution" and "apprehension", though their last syllable is not spelled the same (-tion and -sion), they still sound the same (SH AH N) and qualify as a rhyme.</p>
<p>For this challenge, we won't concern ourselves with syllables proper, only with the last vowel sound and whatever comes afterwards.
E.g. "gentleman" rhymes with "solution" because their phonetic definitions end in "AH N". Similarly, "form" (F AO R M) and "storm" (S T AO R M) also rhyme.</p>
<p>Our good friends from the <a href="http://cmusphinx.sourceforge.net/">SPHINX project</a> at Carnegie Mellon University have produced all the tools we need.
Use <a href="http://svn.code.sf.net/p/cmusphinx/code/trunk/cmudict/cmudict-0.7b">this pronouncing dictionary</a> in conjunction
with <a href="http://svn.code.sf.net/p/cmusphinx/code/trunk/cmudict/cmudict-0.7b.phones">this phoneme description</a> to find rhyming words.</p>
<p>Note that the dictionary uses the <a href="https://en.wikipedia.org/wiki/Arpabet">ARPAbet</a> phonetic transcription code and
includes stress indicators for the vowel sounds. Make sure to match the stress indicator of the input word.</p>
<h1>Input</h1>
<p>A word from the pronouncing dictionary</p>
<pre><code>solution
</code></pre>
<h1>Output</h1>
<p>A list of rhyming words, annotated by the number of matching phonemes and their phonetic definition,
sorted by the number of matching phonemes.</p>
<pre><code>[7] ABSOLUTION  AE2 B S AH0 L UW1 SH AH0 N
[7] DISSOLUTION D IH2 S AH0 L UW1 SH AH0 N
[6] ALEUTIAN    AH0 L UW1 SH AH0 N
[6] ANDALUSIAN  AE2 N D AH0 L UW1 SH AH0 N
...
[2] ZUPAN   Z UW1 P AH0 N
[2] ZURKUHLEN   Z ER0 K Y UW1 L AH0 N
[2] ZWAHLEN Z W AA1 L AH0 N
[2] ZYMAN   Z AY1 M AH0 N
</code></pre>
<h1>Challenge</h1>
<p>Eminem likes to play fast and loose with his rhyming!
He doesn't mind if the rhymes you find don't match the stress indicator.</p>
<p>Find all the words that rhyme the input word, regardless of the value of the stress indicator for the last vowel phoneme.</p>
<h3>Input</h3>
<pre><code>noir
</code></pre>
<h3>Output</h3>
<pre><code>[2] BOUDOIR B UW1 D OY2 R
[2] LOIRE   L OY1 R
[2] MOIR    M OY1 R
[2] SOIR    S OY1 R
</code></pre>
<h1>Credit</h1>
<p>This challenge was suggested by <a href="/u/lt_algorithm_gt">/u/lt_algorithm_gt</a>. If you have a challenge idea, please share it in <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and there's a chance we'll use it. </p>
</div>
