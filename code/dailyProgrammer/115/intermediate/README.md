# Sum-Pairings
<div class="md"><h1><a href="#IntermediateIcon"></a> <em>(Intermediate)</em>: Sum-Parings</h1>
<p>Let the term "sum-pair" be a pair of integers A and B such that the sum of A and B equals a given number C. As an example, let C be 10. Thus, the pairs (5, 5), (1, 9), (2, 8), etc. are all sum-pairs of 10.</p>
<p>Your goal is to write a program that, given an array through standard input (console), you echo out all sum-pairs of a given integer C.</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description:</h2>
<p>On the console, you will be first given an integer N. This is the number of following integers that are part of the array. After the N integers, you will be given an integer C which represents the sum-pair you are attempting to match.</p>
<h2>Output Description</h2>
<p>Your program must print all unique pair of integers in the given list, where the sum of the pair is equal to integer C.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Input (Through Console)</h2>
<pre><code>4
1 -3 4 10aw
5
</code></pre>
<h2>Output (Through Console)</h2>
<pre><code>1, 4
</code></pre>
<p>Note that there is only one pair printed to the console since there is only one unique pair (1, 4) that has the sum of C (5).</p>
<h1>Challenge Input</h1>
<p><em>We will show the solution of this problem data-set in 7-days after the original submission.</em></p>
<pre><code>14
10 -8 2 1 4 -9 6 1 9 -10 -5 2 3 7
7
</code></pre>
<h1>Note</h1>
<p>(<em>Awesome points awarded to <a href="/u/drigz">/u/drigz</a> for getting some important information into my thick-skull: there are linear-time solutions!</em>)</p>
<p>This is a common interviewing problem for programming jobs, so treat it as such! There is a very trivial solution, but the trivial solution will run in <a href="http://en.wikipedia.org/wiki/Big_O_notation">O(N<sup>2</sup> )</a> time. There are a few other known solutions: one that runs in O(N Log(N)) time (hint: takes advantage of sorting), and another in linear time (hint: dictionary).</p>
</div>
