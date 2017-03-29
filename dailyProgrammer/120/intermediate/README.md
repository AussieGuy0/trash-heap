# Base Conversion Words
<div class="md"><h1><a href="#IntermediateIcon"></a> <em>(Intermediate)</em>: Base Conversion Words</h1>
<p>Given as input an arbitrary string and base (integer), your goal is to convert the base-encoded string to all bases from 2 to 64 and try to detect all English-language words.</p>
<p><em>Author: aredna</em></p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>On the console, you will be first given an arbitrary string followed by an integer "Base". This given string is base-encoded, so as an example if the string is "FF" and base is "16", then we know that the string is hex-encoded, where "FF" means 255 in decimal. </p>
<h2>Output Description</h2>
<p>Given this string, you goal is to re-convert it to all bases, between 2 (binary) to 64. Based on these results, if any English-language words are found within the resulting encodings, print the encoded string, the encoding base, and on the same line have a comma-separated list of all words you found in it.</p>
<p>It is ** extremely** important to note this challenge's encoding scheme: unlike the "Base-64" encoding scheme, we will associate the value 0 (zero) as the character '0', up to value '9' (nine), the value 10 as the character 'a' up to 35 as the character 'z', the value 26 as 'A', then the value 61 as 'Z', and finally 62 as '+' (plus) and 63 as '/' (division). Essentially it is as follows:</p>
<pre><code>Values 0 to 9 maps to '0' through '9'
Values 10 to 35 maps to 'a' through 'z'
Values 36 to 61 maps to 'A' through 'Z'
Value 62 maps to '+'
Value 63 maps to '/'
</code></pre>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<pre><code>E1F1 22
</code></pre>
<h2>Sample Output</h2>
<pre><code>Coming soon!
</code></pre>
<h1>Challenge Input</h1>
<p>None given</p>
<h2>Challenge Input Solution</h2>
<p>None given</p>
<h1>Note</h1>
<p>None</p>
</div>
