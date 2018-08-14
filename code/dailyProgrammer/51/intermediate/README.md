<div class="md"><p>Brainfuck is an extremely minimalistic programming language. The memory consists of a large array of bytes, the "tape", 
which is manipulated by moving around a single tape pointer. The 8 commands are:</p>
<table><thead>
<tr>
<th align="center">Character</th>
<th align="left">Action</th>
</tr>
</thead><tbody>
<tr>
<td align="center">&lt;</td>
<td align="left">move the pointer to the left</td>
</tr>
<tr>
<td align="center">&gt;</td>
<td align="left">move the pointer to the right</td>
</tr>
<tr>
<td align="center">+</td>
<td align="left">increment the byte the pointer is pointing at (mod 256)</td>
</tr>
<tr>
<td align="center">-</td>
<td align="left">decrement the byte the pointer is pointing at (mod 256)</td>
</tr>
<tr>
<td align="center">[</td>
<td align="left">if the data which the tape pointer is pointing at is 0, jump <em>forward</em> to the command after the matching square bracket. Otherwise, just continue to the next command</td>
</tr>
<tr>
<td align="center">]</td>
<td align="left">if the data which the tape pointer is pointing at is <em>not</em> 0, jump <em>backwards</em> to the command after the matching square bracket. Otherwise, just continue to the next command</td>
</tr>
<tr>
<td align="center">,</td>
<td align="left">read a character from the input and store it into the current pointer byte</td>
</tr>
<tr>
<td align="center">.</td>
<td align="left">output the current pointer byte as an ascii character</td>
</tr>
</tbody></table>
<p>Any other character is ignored and treated as a comment</p>
<p><code>[ ... ]</code> thus make a kind of while loop, equivalent to something like "while(data[pointer] != 0) { ... }". 
The brackets match like parentheses usually do, each starting one has a matching ending one. These loops can be nested inside other loops. </p>
<p>Write a program that reads a brainfuck program and its input, interprets the code, and returns the output.</p>
<p>More information, including a "Hello World" program, can be found <a href="http://en.wikipedia.org/wiki/Brainfuck">on wikipedia</a>. </p>
<p>If you've written your program successfully, try running this and see what pops out:</p>
<pre><code>++++++++++[&gt;&gt;++++++&gt;+++++++++++&gt;++++++++++&gt;+++++++++&gt;+++&gt;+++++&gt;++++&gt;++++++++&gt;+[&lt;
]&lt;-]&gt;&gt;+++++++.&gt;+.-.&gt;+++.&lt;++++.&gt;&gt;+++++++.&lt;&lt;++.+.&gt;+++++.&gt;.&lt;&lt;-.&gt;---.&lt;-----.-.+++++.
&gt;&gt;&gt;+++.-.&lt;&lt;-.&lt;+..----.&gt;&gt;&gt;&gt;++++++++.&gt;+++++++..&lt;&lt;&lt;&lt;+.&gt;&gt;&gt;&gt;-.&lt;&lt;&lt;&lt;.++++.------.&lt;+++++
.---.&gt;&gt;&gt;&gt;&gt;.&lt;&lt;&lt;++.&lt;&lt;---.&gt;++++++.&gt;&gt;&gt;&gt;+.&lt;&lt;&lt;-.--------.&lt;&lt;+.&gt;&gt;&gt;&gt;&gt;&gt;+++.---.&lt;-.&lt;&lt;&lt;&lt;---.
&lt;.&gt;---.&gt;&gt;&gt;&gt;&gt;&gt;.  
</code></pre>
<ul>
<li>Thanks to <a href="http://www.reddit.com/user/nooodl">nooodl</a> for submitting this problem in <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a>!</li>
</ul>
</div>
