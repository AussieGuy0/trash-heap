# Critical Hit
<div class="md"><h1>Description</h1>
<p>Critical hits work a bit differently in this RPG.  If you roll the maximum value on a die, you get to roll the die again and add both dice rolls to get your final score.  Critical hits can stack indefinitely -- a second max value means you get a third roll, and so on.  With enough luck, any number of points is possible.</p>
<h1>Input</h1>
<ul>
<li><code>d</code> -- The number of sides on your die.</li>
<li><code>h</code> -- The amount of health left on the enemy.</li>
</ul>
<h1>Output</h1>
<p>The probability of you getting <code>h</code> or more points with your die.</p>
<h1>Challenge Inputs and Outputs</h1>
<table><thead>
<tr>
<th align="center">Input: <code>d</code></th>
<th align="center">Input: <code>h</code></th>
<th align="center">Output</th>
</tr>
</thead><tbody>
<tr>
<td align="center">4</td>
<td align="center">1</td>
<td align="center">1</td>
</tr>
<tr>
<td align="center">4</td>
<td align="center">4</td>
<td align="center">0.25</td>
</tr>
<tr>
<td align="center">4</td>
<td align="center">5</td>
<td align="center">0.25</td>
</tr>
<tr>
<td align="center">4</td>
<td align="center">6</td>
<td align="center">0.1875</td>
</tr>
<tr>
<td align="center">1</td>
<td align="center">10</td>
<td align="center">1</td>
</tr>
<tr>
<td align="center">100</td>
<td align="center">200</td>
<td align="center">0.0001</td>
</tr>
<tr>
<td align="center">8</td>
<td align="center">20</td>
<td align="center">0.009765625</td>
</tr>
</tbody></table>
<h1>Secret, off-topic math bonus round</h1>
<p>What's the expected (mean) value of a D4? (if you are hoping for as high a total as possible).</p>
<hr/>
<p>thanks to <a href="/u/voidfunction">/u/voidfunction</a> for submitting this challenge through <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a>.</p>
</div>
