# Rövarspråket
<div class="md"><h1>Description</h1>
<p>When we Swedes are young, we are taught a SUPER-SECRET language that only kids know, so we can hide secrets from our confused parents. This language is known as "Rövarspråket" (which means "Robber's language", more or less), and is surprisingly easy to become fluent in, at least when you're a kid. Recently, the cheeky residents of <a href="/r/Sweden">/r/Sweden</a> decided to play a trick on the rest on reddit, and get a thread entirely in Rövarspråket to <a href="/r/all">/r/all</a>. <a href="http://np.reddit.com/r/sweden/comments/301sqr/dodetot_%C3%A4ror_fof%C3%B6ror_lolitote/">The results were hilarious</a>. </p>
<p>Rövarspråket is not very complicated: you take an ordinary word and replace the consonants with the consonant doubled and with an "o" in between. So the consonant "b" is replaced by "bob", "r" is replaced with "ror", "s" is replaced with "sos", and so on. Vowels are left intact. It's made for Swedish, but it works just as well in English.</p>
<p>Your task today is to write a program that can encode a string of text into Rövarspråket. </p>
<p>(note: this is a higly guarded Swedish state secret, so I trust that none of you will share this very privileged information with anyone! If you do, you will be extradited to Sweden and be forced to eat <a href="http://en.wikipedia.org/wiki/Surstr%C3%B6mming">surströmming</a> as penance.)</p>
<p>(note 2: surströmming is actually not that bad, it's much tastier than its reputation would suggest! I'd go so far as to say that it's the tastiest half-rotten fish in the world!)</p>
<h1>Formal inputs &amp; outputs</h1>
<h2>Input</h2>
<p>You will recieve one line of input, which is a text string that should be encoded into Rövarspråket. </p>
<h2>Output</h2>
<p>The output will be the encoded string. </p>
<p>A few notes: your program should be able to handle case properly, which means that "Hello" should be encoded to "Hohelollolo", and <em>not</em> as "HoHelollolo" (note the second capital "H"). </p>
<p>Also, since Rövarspråket is a Swedish invention, your program should follow Swedish rules regarding what is a vowel and what is a consonant. The Swedish alphabet is the same as the English alphabet except that there are three extra characters at the end (Å, Ä and Ö) which are all vowels. In addition, Y is always a vowel in Swedish, so the full list of vowels in Swedish is A, E, I, O, U, Y, Å, Ä and Ö. The rest are consonants.</p>
<p>Lastly, any character that is not a vowel or a consonant (i.e. things like punctuation) should be left intact in the output. </p>
<h1>Example inputs</h1>
<h2>Input 1</h2>
<pre><code>Jag talar Rövarspråket!
</code></pre>
<h2>Output 1</h2>
<pre><code>Jojagog totalolaror Rorövovarorsospoproråkoketot!
</code></pre>
<h2>Input 2</h2>
<pre><code>I'm speaking Robber's language!
</code></pre>
<h2>Output 2</h2>
<pre><code>I'mom sospopeakokinongog Rorobobboberor'sos lolanongoguagoge!
</code></pre>
<h1>Challenge inputs</h1>
<h2>Input 1</h2>
<pre><code>Tre Kronor är världens bästa ishockeylag.
</code></pre>
<h2>Input 2</h2>
<pre><code>Vår kung är coolare än er kung. 
</code></pre>
<h1>Bonus</h1>
<p>Make your program able to decode a Rövarspråket-encoded sentence as well as encode it. </p>
<h1>Notes</h1>
<p>This excellent problem (which filled my crusty old Swedish heart with glee) was suggested by <a href="/u/pogotc">/u/pogotc</a>. Thanks so much for the suggestion!</p>
<p>If you have an idea for a problem, head on over to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and post your suggestion! If it's good idea, we might use it, and you'll be as cool as <a href="/u/pogotc">/u/pogotc</a>. </p>
</div>
