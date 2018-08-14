# Math Proofs
<div class="md"><h1>Description</h1>
<p>Determine if a mathematical expression is logically equivalent</p>
<h1>Part 1</h1>
<p>Determine if a mathematical expression is logically equivalent
Our first program will only support 4 basic operators; <code>+</code>,<code>-</code>,<code>*</code>,<code>/</code>.</p>
<p>Examples of logically equivalent expressions:</p>
<pre><code>x + x = 2x
2*x = 2x
2(x + y) = 2x + 2y
a + b = b + a
x - x = 0
y/2 = (1/2)*y
-(-x) = x
</code></pre>
<p>Examples of <em>not</em> logically equivalent expressions:</p>
<pre><code>2 = 3
a - b - c = a - (b - c)
x + y = a + b
</code></pre>
<h1>Part 2</h1>
<p>Support more advanced operators such as <code>^</code>,<code>log</code>, derivatives, bit shifts, booleans, or whatever you can come up with.  This part is more open, so feel free to show off your additions.</p>
<p>Examples of extensions:</p>
<pre><code>x^2 * x^3 = x^5
(x + 2)^(y + 2) = 4x(2 + x)^y + 4(2 + x)^y + (2 + x)^y * x^2
!(a &amp;&amp; b) = !a || !b
x &lt;&lt; 1 &lt;&lt; 2 = x &lt;&lt; 3
</code></pre>
<h1>Part 3</h1>
<p>Your solution should create a proof of the steps your program took to show the expression was valid or invalid.</p>
<table><thead>
<tr>
<th align="left">Statements</th>
<th align="left">Reasons</th>
</tr>
</thead><tbody>
<tr>
<td align="left">2(x + y) + 0 = 2x + 2y</td>
<td align="left">1. Given</td>
</tr>
<tr>
<td align="left">2x + 2y + 0 = 2x + 2y</td>
<td align="left">2. Distributive Property of Multiplication</td>
</tr>
<tr>
<td align="left">2x + 2y = 2x + 2y</td>
<td align="left">3. Identity Property of Addition</td>
</tr>
</tbody></table>
<table><thead>
<tr>
<th align="left">Statements</th>
<th align="left">Reasons</th>
</tr>
</thead><tbody>
<tr>
<td align="left">x + y = a + b</td>
<td align="left">1. Given</td>
</tr>
<tr>
<td align="left">3 = 7</td>
<td align="left">2. Contradiction for x=1, y=2, a=3, b=4</td>
</tr>
</tbody></table>
<h1>Notes</h1>
<p>I'm inclined to treat undefined expressions as not equivalent to anything.  Such as divide by zero:</p>
<pre><code>x/0 = x/0
</code></pre>
<h1>thanks</h1>
<p>Thanks to <a href="/u/wizao">u/wizao</a> for submitting this idea through <a href="/r/dailyprogrammer_ideas">r/dailyprogrammer_ideas</a> </p>
</div>
