# Adding fractions
<div class="md"><h1>Description</h1>
<p>Fractions are the bane of existence for many elementary and middle-schoolers. They're sort-of hard to get your head around (though thinking of them as pizza slices turned out to be very helpful for me), but even worse is that they're so hard to calculate with! Even adding them together is no picknick. </p>
<p>Take, for instance, the two fractions 1/6 and 3/10. If they had the same denominator, you could simply add the numerators together, but since they have different denominators, you can't do that. First, you have to make the denominators equal. The easiest way to do that is to use cross-multiplication to make both denominators 60 (i.e. the original denominators multiplied together, 6 * 10). Then the two fractions becomes 10/60 and 18/60, and you can then add those two together to get 28/60. </p>
<p><em>(if you were a bit more clever, you might have noticed that the lowest common denominator of those fractions is actually 30, not 60, but it doesn't really make much difference).</em> </p>
<p>You might think you're done here, but you're not! 28/60 has not been reduced yet, those two numbers have factors in common! The greatest common divisor of both is 4, so we divide both numerator and denominator with 4 to get 7/15, which is the real answer. </p>
<p>For today's challenge, you will get a list of fractions which you will add together and produce the resulting fraction, reduced as far as possible. </p>
<p><strong>NOTE:</strong> Many languages have libraries for rational arithmetic that would make this challenge really easy (for instance, Python's <code>fractions</code> module does exactly this). You are allowed to use these if you wish, but the spirit of this challenge is to try and implement the logic yourself. I highly encourage you to only use libraries like that if you can't figure out how to do it any other way. </p>
<h1>Formal inputs &amp; outputs</h1>
<h2>Inputs</h2>
<p>The input will start with a single number N, specifying how many fractions there are to be added. </p>
<p>After that, there will follow N rows, each one containing a fraction that you are supposed to add into the sum. Each fraction comes in the form "X/Y", so like "1/6" or "3/10", for instance. </p>
<h2>Output</h2>
<p>The output will be a single line, containing the resulting fraction reduced so that the numerator and denominator has no factors in common. </p>
<h1>Sample inputs &amp; outputs</h1>
<h2>Input 1</h2>
<pre><code>2
1/6
3/10
</code></pre>
<h2>Output 1</h2>
<pre><code>7/15
</code></pre>
<h2>Input 2</h2>
<pre><code>3
1/3
1/4
1/12
</code></pre>
<h2>Output 2</h2>
<pre><code>2/3
</code></pre>
<h1>Challenge inputs</h1>
<h2>Input 1</h2>
<pre><code>5
2/9
4/35
7/34
1/2
16/33
</code></pre>
<h2>Input 2</h2>
<pre><code>10
1/7
35/192
61/124
90/31
5/168
31/51
69/179
32/5
15/188
10/17
</code></pre>
<h1>Notes</h1>
<p>If you have any challenge suggestions, please head on over to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and suggest them! If they're good, we might use them!</p>
</div>
