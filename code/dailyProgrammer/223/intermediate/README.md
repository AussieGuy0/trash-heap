# Eel of Fortune
<div class="md"><h1>Description</h1>
<p>You work on the popular game show Eel of Fortune, where contestants take turns fishing live eels out of an aquarium for the opportunity to solve a word puzzle. The word puzzle works like the game Hangman. A secret word is obscured on the board. A player guesses a letter of the alphabet, and if that letter appears anywhere in the secret word, all of the times it appears in the secret word are revealed.</p>
<p>An unfortunate incident occurred on yesterday's show. The secret word was <code>SYNCHRONIZED</code>, and at one point the board was showing:</p>
<pre><code>S _ N _ _ _ O N _ _ _ D
</code></pre>
<p>As you can see, the letters on the board spelled "snond", which is of course an extremely offensive word for telemarketer in the Doldunian language. This incident caused ratings to immediately plummet in East Doldunia. The Eel of Fortune producers want the ability to identify "problem words" for any given offensive word.</p>
<p>Write a function that, given a secret word and an offensive word, returns true if the board could theoretically display the offensive word (with no additional letters) during the course of solving the secret word.</p>
<h1>Examples</h1>
<pre><code>problem("synchronized", "snond") -&gt; true
problem("misfunctioned", "snond") -&gt; true
problem("mispronounced", "snond") -&gt; false
problem("shotgunned", "snond") -&gt; false
problem("snond", "snond") -&gt; true
</code></pre>
<h1>Optional challenges</h1>
<ol>
<li>Define the <em>problem count</em> of an offensive word to be the number of words in the <a href="https://code.google.com/p/dotnetperls-controls/downloads/detail?name=enable1.txt">enable1 word list</a> that return true when paired with that offensive word as secret words. For instance, the problem count of "snond" is 6. What is the problem count of "rrizi" (Zarthan offensive slang for the air in potato chip bags)?</li>
<li>(Edited for clarity) What are the 10 largest problem counts of any sequence of 5 letters ("aaaaa", "aaaab", " aaaac", through "zzzzz")? <em>A solution to this problem needs to finish in less than a year. Aim for a few minutes, or an hour at most. Post your output along with your code.</em></li>
</ol>
<p><em>Thanks to <a href="/u/AtlasMeh-ed">/u/AtlasMeh-ed</a> for submitting this challenge on <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a>!</em></p>
</div>
