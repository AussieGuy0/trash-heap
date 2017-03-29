# Something about bases
<div class="md"><h1>Description</h1>
<p>Numbers can be written in many kind of bases.</p>
<p>Normally we use <code>base 10</code>, wich is the decimal notation, for our numbers. In modern computerscience we use <code>base 16</code> (hexadecimal) a lot, and beneath that we have <code>base 2</code> (binary).</p>
<p>Given a number you can't tell what base it is, but you can tell what base it isn't from. E.g.: <code>1</code> exists in all bases, but <code>2</code> does not exist in <code>base 2</code>. It does exist in <code>base 3</code> and so on.</p>
<h1>Formal Inputs &amp; Outputs</h1>
<p>You will be given a number and you have to print the smallest base possible to wich it can belong and it's equivalent in <code>base 10</code></p>
<h2>Input description</h2>
<p>The numbers to test</p>
<pre><code>1
21
ab3
ff
</code></pre>
<h2>Output description</h2>
<p>The smallest base it belongs to plus the value in <code>base 10</code></p>
<pre><code>base 2 =&gt; 1
base 3 =&gt; 7
base 12 =&gt; 1575
base 16 =&gt; 255
</code></pre>
<h1>Notes/Hints</h1>
<p>For more info on numeral systems, you can start here <a href="https://en.wikipedia.org/wiki/Numeral_system">wiki</a></p>
<p>For those new with bases. The letters translate to a higher value then <code>9</code>, and because <code>10</code> exists out of 2 digits, they replace it with a letter.</p>
<p>This is the translation you need for this challenge</p>
<table><thead>
<tr>
<th>Digit</th>
<th>Value</th>
</tr>
</thead><tbody>
<tr>
<td>a</td>
<td>10</td>
</tr>
<tr>
<td>b</td>
<td>11</td>
</tr>
<tr>
<td>c</td>
<td>12</td>
</tr>
<tr>
<td>d</td>
<td>13</td>
</tr>
<tr>
<td>e</td>
<td>14</td>
</tr>
<tr>
<td>f</td>
<td>15</td>
</tr>
</tbody></table>
<h1>Bonus</h1>
<p>Print out all the decimal values for every base starting from the minimum till <code>base 16</code>.</p>
<h2>Input</h2>
<pre><code>21
</code></pre>
<h2>Output</h2>
<pre><code>base 3 =&gt; 7
base 4 =&gt; 9
base 5 =&gt; 11
base 6 =&gt; 13
base 7 =&gt; 15
base 8 =&gt; 17
base 9 =&gt; 19
base 10 =&gt; 21
base 11 =&gt; 23
base 12 =&gt; 25
base 13 =&gt; 27
base 14 =&gt; 29
base 15 =&gt; 31
base 16 =&gt; 33
</code></pre>
<h2>Bonus inputs:</h2>
<pre><code>1
21
ab3
ff
</code></pre>
<h1>Bonus 2</h1>
<p>Make sure your program handles <code>0</code>. </p>
<p>The minimum base for <code>0</code> is <code>base 1</code> and it's value <code>0</code>. As you might expect...</p>
<h1>Finally</h1>
<p>Have a good challenge idea?</p>
<p>Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
</div>
