# Ggggggg gggg Ggggg-ggggg!
<div class="md"><p>We have discovered a new species of aliens! They look like <a href="https://www.redditstatic.com/about/assets/reddit-alien.png">this</a> and are trying to communicate with us using the <a href="/r/ggggg">/r/ggggg</a> subreddit! As you might have been able to tell, though, it is awfully hard to understand what they're saying since their super-advanced alphabet only makes use of two letters: "g" and "G". Fortunately, their numbers, spacing and punctuation are the same.</p>
<p>We are going to write a program to translate to and from our alphabet to theirs, so we can be enlightened by their intelligence.</p>
<p>Feel free to code either the encoding program, the decoding program, or both.</p>
<p><sup>Also,</sup> <sup>please</sup> <sup>do</sup> <sup>not</sup> <sup>actually</sup> <sup>harass</sup> <sup>the</sup> <sup>residents</sup> <sup>of</sup> <sup><a href="/r/ggggg">/r/ggggg</a>.</sup></p>
<h1>Part 1: Decoding</h1>
<p>First, we need to be able to understand what the Ggggg aliens are saying. Fortunately, they are cooperative in this matter, and they helpfully include a "key" to translate between their g-based letters and our Latin letters. Your decoder program needs to read this key from the first line of the input, then use it to translate the rest of the input.</p>
<h2>Sample decoder input 1</h2>
<pre><code>H GgG d gGg e ggG l GGg o gGG r Ggg w ggg
GgGggGGGgGGggGG, ggggGGGggGGggGg!
</code></pre>
<h2>Sample decoder output 1</h2>
<pre><code>Hello, world!
</code></pre>
<p><strong>Explanation:</strong> Reading the input, the key is:</p>
<ul>
<li>H = GgG</li>
<li>d = gGg</li>
<li>e = ggG</li>
<li>l = GGg</li>
<li>o = gGG</li>
<li>r = Ggg</li>
<li>w = ggg</li>
</ul>
<p>When we read the message from left to right, we can divide it into letters like so (alternating letters bolded):</p>
<p>&gt; <strong>GgG</strong>ggG<strong>GGg</strong>GGg<strong>gGG</strong>, <strong>ggg</strong>gGG<strong>Ggg</strong>GGg<strong>gGg</strong>!</p>
<p>Take those letter groups and turn them into letters using the key, and you get "Hello, world!"</p>
<h2>Sample decoder input 2</h2>
<pre><code>a GgG d GggGg e GggGG g GGGgg h GGGgG i GGGGg l GGGGG m ggg o GGg p Gggg r gG y ggG
GGGgGGGgGGggGGgGggG /gG/GggGgGgGGGGGgGGGGGggGGggggGGGgGGGgggGGgGggggggGggGGgG!
</code></pre>
<p>Note that the letters are <em>not</em> guaranteed to be of equal length.</p>
<h2>Sample decoder output 2</h2>
<pre><code>hooray /r/dailyprogrammer!
</code></pre>
<h1>Part 2: Encoding</h1>
<p>Next, we will go in the other direction. Come up with a key based on the letters "g" and "G" that maps all the letters in a given message to Ggggg equivalents, use it to translate the message, then output both the key and the translated message. You can double-check your work using the decoding script from part 1.</p>
<h2>Sample input</h2>
<pre><code>Hello, world!
</code></pre>
<h2>Sample output</h2>
<pre><code>H GgG d gGg e ggG l GGg o gGG r Ggg w ggg
GgGggGGGgGGggGG, ggggGGGggGGggGg!
</code></pre>
<p>Your key (and thus message) may end up being completely different than the one provided here. That's fine, as long as it can be translated back.</p>
<h1>Part 2.1 (Bonus points): Compression</h1>
<p>Just as it annoys us to see someone typing "llliiiiikkkeeee ttttthhhiiiisssss", the Ggggg aliens don't actually enjoy unnecessary verbosity. Modify your encoding script to create a key that results in the <em>shortest possible Ggggg message</em>. You should be able to decode the output using the same decoder used in part 1 (the second sample input/output in part 1 is actually compressed).</p>
<p>Here's a <a href="https://en.wikipedia.org/wiki/Variable-length_code">hint</a>. </p>
<h2>Sample input:</h2>
<pre><code>Here's the thing. You said a "jackdaw is a crow."
Is it in the same family? Yes. No one's arguing that.
As someone who is a scientist who studies crows, I am telling you, specifically, in science, no one calls jackdaws crows. If you want to be "specific" like you said, then you shouldn't either. They're not the same thing.
If you're saying "crow family" you're referring to the taxonomic grouping of Corvidae, which includes things from nutcrackers to blue jays to ravens.
So your reasoning for calling a jackdaw a crow is because random people "call the black ones crows?" Let's get grackles and blackbirds in there, then, too.
Also, calling someone a human or an ape? It's not one or the other, that's not how taxonomy works. They're both. A jackdaw is a jackdaw and a member of the crow family. But that's not what you said. You said a jackdaw is a crow, which is not true unless you're okay with calling all members of the crow family crows, which means you'd call blue jays, ravens, and other birds crows, too. Which you said you don't.
It's okay to just admit you're wrong, you know?
</code></pre>
<h2>Sample output:</h2>
<p>Found here (a bit too big to paste in the challenge itself): <a href="http://www.hastebin.com/raw/inihibehux.txt">http://www.hastebin.com/raw/inihibehux.txt</a></p>
<p>Remember you can test your decoder on this message, too!</p>
<hr/>
<p>C GgggGgg H GgggGgG T GgggGGg a gGg c GGggG d GggG e GgG g ggGgG h GGgGg i gGGg j GgggGGG l gGGG m ggGGg n GGgGG o ggg p ggGGG r GGGg s GGGG t GGgggG u ggGgg v Ggggg w GGggggg y GGggggG
GgggGGgGGgGggGGgGGGG GGggGGGgGggGggGGGgGGGGgGGGgGGggGgGGgG GGggggggGgGGGG ggGGGGGGggggggGGGgggGGGGGgGGggG gGgGGgGGGggG GggGgGGgGGGGGGggGggGggGGGGGGGGGgGGggG gggGggggGgGGGGg gGgGGgggG /GGGg/GggGgGggGGggGGGGGggggGggGGGGGGggggggGgGGGGggGgggGGgggGGgGgGGGGg_gGGgGggGGgGgGgGGGG. GgggGgGgGgGggggGgG gGg GGggGgggggggGGG GGggGGGgGggGggGGGgGGGGgGGGgGGggGgGGgG gGGgGggGGgGgGg? GgggGgggggggGGgGgG GgggGGGggggGGgGGgGG ggGggGGGG gggGggggGgGGGGg GGgggGGGgGgGgGGGGgGgG!</p>
</div>
