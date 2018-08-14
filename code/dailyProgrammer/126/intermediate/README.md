# Perfect P'th Powers
<div class="md"><h1><a href="#IntermediateIcon"></a> <em>(Intermediate)</em>: Perfect P'th Powers</h1>
<p>An integer X is a "perfect square power" if there is some integer Y such that Y<sup>2</sup> = X. An integer X is a "perfect cube power" if there is some integer Y such that Y<sup>3</sup> = X. We can extrapolate this where P is the power in question: an integer X is a "perfect p'th power" if there is some integer Y such that Y<sup>P</sup> = X.</p>
<p>Your goal is to find the highest value of P for a given X such that for some unknown integer Y, Y<sup>P</sup> should equal X. You can expect the given input integer X to be within the range of an unsigned 32-bit integer (0 to 4,294,967,295).</p>
<p><em>Special thanks to the ACM collegiate programming challenges group for giving me the initial idea <a href="http://uva.onlinejudge.org/index.php?option=onlinejudge&amp;page=show_problem&amp;problem=1563">here</a>.</em></p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>You will be given a single integer on a single line of text through standard console input. This integer will range from 0 to 4,294,967,295 (the limits of a 32-bit unsigned integer).</p>
<h2>Output Description</h2>
<p>You must print out to standard console the highest value P that fits the above problem description's requirements.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<p><em>Note:</em> These are all considered separate input examples.</p>
<pre><code>17

1073741824

25
</code></pre>
<h2>Sample Output</h2>
<p><em>Note:</em> The string following the result are notes to help with understanding the example; it is NOT expected of you to write this out.</p>
<pre><code>1 (17^1)

30 (2^30)

2 (5^2)
</code></pre>
</div>
