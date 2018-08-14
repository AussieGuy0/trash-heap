# Pangrams
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Easy)</em>: Pangrams</h1>
<p><a href="http://en.wikipedia.org/wiki/Pangram">Wikipedia</a> has a great definition for Pangrams: "<em>A pangram or holoalphabetic sentence for a given alphabet is a sentence using every letter of the alphabet at least once.</em>" A good example is the English-language sentence "<a href="http://en.wikipedia.org/wiki/The_quick_brown_fox_jumps_over_the_lazy_dog">The quick brown fox jumps over the lazy dog</a>"; note how all 26 English-language letters are used in the sentence.</p>
<p>Your goal is to implement a program that takes a series of strings (one per line) and prints either True (the given string is a pangram), or False (it is not).</p>
<p><strong>Bonus:</strong> On the same line as the "True" or "False" result, print the number of letters used, starting from 'A' to 'Z'. The format should match the following example based on the above sentence:</p>
<pre><code>a: 1, b: 1, c: 1, d: 1, e: 3, f: 1, g: 1, h: 2, i: 1, j: 1, k: 1, l: 1, m: 1, n: 1, o: 4, p: 1, q: 1, r: 2, s: 1, t: 2, u: 2, v: 1, w: 1, x: 1, y: 1, z: 1
</code></pre>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>On standard console input, you will be given a single integer on the first line of input. This integer represents the number of lines you will then receive, each being a string of alpha-numeric characters ('a'-'z', 'A'-'Z', '0'-'9') as well as spaces and <a href="http://en.wikipedia.org/wiki/Period_(punctuation)">period</a>.</p>
<h2>Output Description</h2>
<p>For each line of input, print either "True" if the given line was a pangram, or "False" if not.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<pre><code>3
The quick brown fox jumps over the lazy dog.
Pack my box with five dozen liquor jugs
Saxophones quickly blew over my jazzy hair
</code></pre>
<h2>Sample Output</h2>
<pre><code>True
True
False
</code></pre>
<h1>Authors Note: <a href="http://i.imgur.com/chKCAPM.jpg">Horay, we're back with a queue of new challenges</a>! Sorry fellow <a href="/r/DailyProgrammers">r/DailyProgrammers</a> for the long time off, but we're back to business as usual.</h1>
</div>
