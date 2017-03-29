# Recurrence Relations, part 2
<div class="md"><h1><a href="#HardIcon"></a> <em>(Hard)</em>: Recurrence Relations, part 2</h1>
<p>In <a href="/r/dailyprogrammer/comments/2z68di/">Monday's challenge</a>, we wrote a program to compute the first <em>n</em> terms of a simple recurrence relation. These recurrence relations depended only on the directly previous term - that is, to know <em>u</em>(n), you only need to know <em>u</em>(n-1). In today's challenge, we'll be investigating more complicated recurrence relations.</p>
<p>In today's recurrence relations, the relation given will only depend on terms <em>preceding</em> the defined tern, not terms <em>following</em> the defined term. For example, the relation for <em>u</em>(n) will never depend on <em>u</em>(n+1). Let's look at the Fibonacci sequence as defined by <a href="http://oeis.org/A000045">OEIS</a>:</p>
<pre><code>u(0) = 0
u(1) = 1
u(n) = u(n-1) + u(n-2)
</code></pre>
<p>This relation provides a definition for the first two terms - the 0th term and the 1st term. It also says that the <em>n</em>-th term is the sum of the two previous terms - that is, the <em>(n-1)</em>-th term and the <em>(n-2)</em>-th term. As we know terms 0 and 1, we therefore know term 2. As we know term 1 and 2, we know term 3, and so on - for this reason, the Fibonacci sequence is <strong>completely defined</strong> by this recurrence relation - we can compute an infinite number of Fibonacci numbers after the first two, given two defined terms.</p>
<p>However, now let's look at this recurrence relation:</p>
<pre><code>u(0) = 0
u(1) = 1
u(2) = 3
u(n) = u(n-1) * u(n-2) + u(n-5)
</code></pre>
<p>We're given the 0th, 1st and 2nd terms. However, the relation for the <em>n</em>-th term depends on the <em>(n-5)</em>-th term. This means we can't calculate the value of <em>u</em>(3), as we'll need the term 5 before that - ie. <em>u</em>(-2), which we don't have. We can't calculate <em>u</em>(4) for the same reason. We find that, to try and define the 3rd term and beyond, we don't have enough information, so this series is <strong>poorly defined</strong> by this recurrence relation. Therefore, all we know about the series is that it begins <code>[0, 1, 3]</code> - and, as far as we know, that's the end of the series.</p>
<p>Here's another example of a recurrence relation with a twist:</p>
<pre><code>u(1) = 0
u(n) = u(n-2) * 2 + 1
</code></pre>
<p>This relation defines the 1st term. It also defines the <em>n</em>-th term, with respect to the <em>(n-2)</em>-th term. This means we know the 3rd term, then the 5th term, then the 7th term... but we don't know about the even-numbered terms! Here is all we know of the series:</p>
<pre><code>0, ?, 1, ?, 3, ?, 7, ?, 15, ?, ...
</code></pre>
<p>There are an infinite number of terms that we <em>do</em> know, but there are terms in-between those that we don't know! We only know half of the series at any given time. This is an example of a series being <strong>partially defined</strong> by a recurrence relation - we can work out some terms, but not others.</p>
<p>Your challenge today is, given a set of initial terms and a recurrence relation, work out <em>as many further terms as possible</em>.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>You will accept the recurrence relation in <strong>reverse Polish notation</strong> (or postfix notation). If you solved <a href="/r/dailyprogrammer/comments/2yquvm/">last Wednesday's challenge</a>, you may be able to re-use some code from your solution here. To refer to the <em>(n-k)</em>-th term, you write <code>(k)</code> in the RPN expression. Possible operators are <code>+</code>, <code>-</code>, <code>*</code> and <code>/</code> (but feel free to add any of your own). For example, this recurrence relation input defines the <em>n</em>-th term of the Fibonacci sequence:</p>
<pre><code>(2) (1) +
</code></pre>
<p>This means that the <em>n</em>-th term is the <em>(n-2)</em>-th term and the <em>(n-1)</em>-th term, added together. Next, you will accept any number of pre-defined terms, in the format <code>index:value</code>. For example, this line of input:</p>
<pre><code>2:5.333
</code></pre>
<p>Defines the 2nd term of the series to be equal to 5.333. For example, the initial terms for the Fibonacci sequence are:</p>
<pre><code>0:0
1:1
</code></pre>
<p>Finally, you will accept a number - this will be the maximum <em>n</em> of the term to calculate. For example, given:</p>
<pre><code>40
</code></pre>
<p>You calculate as many terms as you possibly can, up to and including the 40th term.</p>
<h2>Output Description</h2>
<p>The output format is identical to the Easy challenge - just print the term number along with the term value. Something like this:</p>
<pre><code>0: 0
1: 1
2: 1
3: 2
4: 3
5: 5
6: 8
7: 13
8: 21
</code></pre>
<p>is good.</p>
<h1>Sample Input and Outputs</h1>
<h2>Fibonacci Sequence</h2>
<p>This uses the OEIS definition of the Fibonacci sequence, starting from 0.</p>
<h3>Input</h3>
<pre><code>(1) (2) +
0:0
1:1
20
</code></pre>
<h3>Output</h3>
<pre><code>0: 0
1: 1
2: 1
3: 2
4: 3
5: 5
6: 8
7: 13
8: 21
9: 34
10: 55
11: 89
12: 144
13: 233
14: 377
15: 610
16: 987
17: 1597
18: 2584
19: 4181
20: 6765
</code></pre>
<h2>Oscillating Sequence</h2>
<p>This defines an oscillating sequence of numbers starting from the 5th term. The starting term is not necessarily zero!</p>
<h3>Input</h3>
<pre><code>0 (1) 2 * 1 + -
5:31
14
</code></pre>
<h3>Output</h3>
<pre><code>5: 31
6: -63
7: 125
8: -251
9: 501
10: -1003
11: 2005
12: -4011
13: 8021
14: -16043
</code></pre>
<h2>Poorly Defined Sequence</h2>
<p>This sequence is poorly defined.</p>
<h3>Input</h3>
<pre><code>(1) (4) * (2) 4 - +
0:3
1:-2
3:7
4:11
20
</code></pre>
<h3>Output</h3>
<p>The 5th term can be defined, but no further terms can.</p>
<pre><code>0: 3
1: -2
3: 7
4: 11
5: -19
</code></pre>
<h2>Staggered Tribonacci Sequence</h2>
<p>This uses the <a href="https://oeis.org/A000073">OEIS definition</a> of the Tribonacci sequence, but with a twist - the odd terms are undefined, so this is partially defined.</p>
<h3>Input</h3>
<pre><code>(2) (4) (6) + +
0:0
2:0
4:1
30
</code></pre>
<h3>Output</h3>
<pre><code>0: 0
2: 0
4: 1
6: 1
8: 2
10: 4
12: 7
14: 13
16: 24
18: 44
20: 81
22: 149
24: 274
26: 504
28: 927
30: 1705
</code></pre>
<h1>Notes</h1>
<p>Relevant links:</p>
<ul>
<li><a href="http://en.wikipedia.org/wiki/Reverse_Polish_notation">Reverse Polish notation</a></li>
<li><a href="http://en.wikipedia.org/wiki/Recurrence_relation">Recurrence relation</a></li>
</ul>
<p>Declarative languages might be handy for this challenge!</p>
</div>
