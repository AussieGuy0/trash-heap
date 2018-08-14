# Langford strings
<div class="md"><h1>Description</h1>
<p>A "Langford string of order N" is defined as follows: </p>
<ul>
<li>The length of the string is equal to 2*N</li>
<li>The string contains the the first N letters of the uppercase English alphabet, with each letter appearing twice</li>
<li>Each pair of letters contain X letters between them, with X being that letter's position in the alphabet (that is, there is one letter between the two A's, two letters between the two B's, three letters between the two C's, etc)</li>
</ul>
<p>An example will make this clearer. These are the only two possible Langford strings of order 3:</p>
<pre><code>BCABAC
CABACB    
</code></pre>
<p>Notice that for both strings, the A's have 1 letter between them, the B's have two letters between them, and the C's have three letters between them. As another example, this is a Langford string of order 7:</p>
<pre><code>DFAGADCEFBCGBE
</code></pre>
<p>It can be shown that Langford strings only exist when the order is a multiple of 4, or one less than a multiple of 4.</p>
<p>Your challenge today is to calculate all Langford strings of a given order.</p>
<h1>Formal inputs &amp; outputs</h1>
<h2>Inputs</h2>
<p>You will be given a single number, which is the order of the Langford strings you're going to calculate.</p>
<h2>Outputs</h2>
<p>The output will be all the Langford strings of the given order, one per line. The ordering of the strings does not matter. </p>
<p>Note that for the second challenge input, the output will be somewhat lengthy. If you wish to show your output off, I suggest using a service like <a href="http://gist.github.com">gist.github.com</a> or <a href="http://hastebin.com">hastebin</a> and provide a link instead of pasting them directly in your comments.</p>
<h1>Sample input &amp; output</h1>
<h2>Input</h2>
<pre><code>3
</code></pre>
<h2>Output</h2>
<pre><code>BCABAC
CABACB   
</code></pre>
<h1>Challenge inputs</h1>
<h2>Input 1</h2>
<pre><code>4
</code></pre>
<h2>Input 2</h2>
<pre><code>8
</code></pre>
<h1>Bonus</h1>
<p>For a bit of a stiffer challenge, consider this: there are more than 5 trillion different Langford strings of order 20. If you put all those strings into a big list and sorted it, what would the first 10 strings be?</p>
<h1>Notes</h1>
<p>If you have a suggestion for a challenge, head on over to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and we might use it in the future!</p>
</div>
