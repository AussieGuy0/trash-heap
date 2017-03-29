# Re-emvoweler 1
<div class="md"><h1><em>(Intermediate)</em>: Re-emvoweler 1</h1>
<p>In <a href="http://www.reddit.com/r/dailyprogrammer/comments/1ystvb/022414_challenge_149_easy_disemvoweler/">this week's Easy challenge</a>, series of words were disemvoweled into vowels, and non-vowel letters. Spaces were also removed. Your task today is, given the two strings produced via disemvowelment, output <em>one possibility</em> for the original string.</p>
<ol>
<li>Your output must be such that if you put it through the solution to this week's Easy challenge, you'll recover exactly the input you were given.</li>
<li>You don't need to output the same string as the one that was originally disemvoweled, just <em>some</em> string that disemvowels to your input.</li>
<li>Use <a href="http://code.google.com/p/dotnetperls-controls/downloads/detail?name=enable1.txt">the Enable word list</a>, or some other reasonable English word list. Every word in your output must appear in your word list.</li>
<li>For the sample inputs, all words in originally disemvoweled strings appear in Enable. In particular, I'm not using any words with punctuation, and I'm not using the word "a".</li>
<li>As before, ignore punctuation and capitalization.</li>
</ol>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input description</h2>
<p>Two strings, one containing only non-vowel letters, and one containing only vowels.</p>
<h2>Output description</h2>
<p>A space-separated series of words that could be disemvoweled into the input, each word of which must appear in your word list. </p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input 1</h2>
<pre><code>wwllfndffthstrds
eieoeaeoi
</code></pre>
<h2>Sample Output 1</h2>
<p>There are, in general, many correct outputs. Any of these is valid output for the sample input (using the Enable word list to verify words):</p>
<pre><code>we wile lo fen daff et host rids 
we wile lo fend aff eths tor ids 
we wile lo fen daff the sot rids 
we will fend off eths tare do si 
we will fend off the asteroids
</code></pre>
<h2>Sample Input 2</h2>
<pre><code>bbsrshpdlkftbllsndhvmrbndblbnsthndlts
aieaeaeieooaaaeoeeaeoeaau
</code></pre>
<h2>Sample Outputs 2</h2>
<pre><code>ab bise ars he ae pi ed look fa tab all sned hove me ar bend blob ens than adults 
ai be base rash pe die look fat bal la sned hove me ar bend blob ens than adults 
babies ae rash pe die loo ka fat balls end ho vee mar bend blob ens than adults 
babies rash pedal kef tie bolls nod aah ave omer bendable bones than adults 
babies are shaped like footballs and have more bendable bones than adults
</code></pre>
<h2>Sample Input 3</h2>
<pre><code>llfyrbsshvtsmpntbncnfrmdbyncdt
aoouiaeaeaoeoieeoieaeoe
</code></pre>
<h1>Notes</h1>
<p>Thanks to <a href="/u/abecedarius">/u/abecedarius</a> for inspiring this challenge on <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a>!</p>
<p>Think you can do a better job of re-emvoweling? Check out this week's Hard challenge!</p>
</div>
