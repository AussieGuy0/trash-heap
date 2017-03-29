# (Arithmetic tables)
<div class="md"><p>Write a program that reads two arguments from the command line:</p>
<ul>
<li>a symbol, <code>+</code>, <code>-</code>, <code>*</code>, or <code>/</code></li>
<li>a natural number <em>n</em> (≥ 0)</li>
</ul>
<p>And uses them to output a nice table for the operation from 0 to <em>n</em>, like this (for "+ 4"):</p>
<pre><code>+  |  0  1  2  3  4
-------------------
0  |  0  1  2  3  4 
1  |  1  2  3  4  5
2  |  2  3  4  5  6
3  |  3  4  5  6  7
4  |  4  5  6  7  8
</code></pre>
<p>If you want, you can format your output using the reddit table syntax:</p>
<pre><code>|+|0|1
|:|:|:
|**0**|0|1
|**1**|1|2
</code></pre>
<p>Becomes this:</p>
<table><thead>
<tr>
<th align="left">+</th>
<th align="left">0</th>
<th align="left">1</th>
</tr>
</thead><tbody>
<tr>
<td align="left"><strong>0</strong></td>
<td align="left">0</td>
<td align="left">1</td>
</tr>
<tr>
<td align="left"><strong>1</strong></td>
<td align="left">1</td>
<td align="left">2</td>
</tr>
</tbody></table>
</div>
