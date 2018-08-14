# It's like regular binary, only way more hype!
<div class="md"><h1>Description</h1>
<p>We all know and love the binary number system, but today we're going to do something a little bit different with it. We're going to break it by adding another number.</p>
<p>The regular binary number system uses two digits, 0 and 1, and the positions they are put in represents different powers of 2, increasing from right to left. So, for example, if you have the binary number 110101, that is equal to</p>
<p>1*2<sup>5</sup> + 1*2<sup>4</sup> + 0*2<sup>3</sup> + 1*2<sup>2</sup> + 0*2<sup>1</sup> + 1*2<sup>0</sup> </p>
<p>= 2<sup>5</sup> + 2<sup>4</sup> + 2<sup>2</sup> + 2<sup>0</sup></p>
<p>= 32 + 16 + 4 + 1</p>
<p>= 53 </p>
<p>Easy enough, but now lets have some fun with it. </p>
<p>Imagine that instead of having just the two digits 0 and 1, the binary number system had three digits, 0, 1 and 2 with everything else working exactly the same. This system is known as the "hyperbinary number system".</p>
<p>Lets see an example how the hyperbinary number system works. Lets take the hyperbinary number "1021", and try and figure out what number it represents. Just as before, each position represents a power of 2, but now you can have 0, 1 or 2 of each of them, so the calculation goes like this: </p>
<p>1*2<sup>3</sup> + 0*2<sup>2</sup> + 2*2<sup>1</sup> + 1*2<sup>0</sup></p>
<p>= 8 + 2*2 + 1</p>
<p>= 8 + 4 + 1</p>
<p>= 13</p>
<p>Interestingly, this is not the only way you can represent the number 13 in hyperbinary, you could also write 13 as "221" and "1101".</p>
<p>In fact, this is a common issue with this number system: most numbers can be written in multiple ways in hyperbinary. Your challenge today is to find every single hyperbinary representation of a given number. </p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input description</h2>
<p>The input will be a single line containing a single number (written in regular decimal).</p>
<h2>Output description</h2>
<p>Your program should print out all possible representations of the input number in hyperbinary, one per line. Every representation should be printed out once and only once. The order of the outputs doesn't matter, and you can use leading zeroes if you want to.</p>
<h1>Examples</h1>
<h2>Input 1</h2>
<pre><code>18
</code></pre>
<h2>Output 1</h2>
<pre><code>1122
1202
1210
2002
2010
10002
10010
</code></pre>
<h2>Input 2</h2>
<pre><code>73
</code></pre>
<h2>Output 2</h2>
<pre><code>112121
112201
120121
120201
121001
200121
200201
201001
1000121
1000201
1001001
</code></pre>
<h2>Challenge inputs</h2>
<h2>Input 1</h2>
<pre><code>128
</code></pre>
<h2>Input 2</h2>
<pre><code>239
</code></pre>
<h1>Bonus</h1>
<p>If you're looking for a stiffer challenge, try this input: </p>
<pre><code>12345678910
</code></pre>
<p>I wouldn't recommend printing all the representations of that number out, though, becuse there are quite a few of them. </p>
<p>Have your program generate all the hyperbinary representations of that number, and then count them. Exactly how many are there?</p>
<h1>Notes</h1>
<p>Have a good challenge idea?</p>
<p>Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
</div>
