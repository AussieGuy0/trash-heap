# Working like a terminal
<div class="md"><p>First of, sorry for the late upload. I had a bit of an hold up</p>
<h1>Description</h1>
<p>We are going to work with terminal commands. You will be given a set of instructions to generate an output.
We are going to use a screen of 10 rows and 10 characters</p>
<p>Rows and columns are numbered 0 through 9. The character that introduces a control sequence is <code>^</code>, the circumflex. The character (or in one case, the two characters) immediately following the control sequence introducer will direct your software in performing its special functions.</p>
<table><thead>
<tr>
<th>Command</th>
<th>Description</th>
</tr>
</thead><tbody>
<tr>
<td><code>^c</code></td>
<td>clear the entire screen; the cursor row and column do not change</td>
</tr>
<tr>
<td><code>^h</code></td>
<td>move the cursor to row 0, column 0; the image on the screen is not changed</td>
</tr>
<tr>
<td><code>^b</code></td>
<td>move the cursor to the beginning of the current line; the cursor row does not change</td>
</tr>
<tr>
<td><code>^d</code></td>
<td>move the cursor down one row if possible; the cursor column does not change</td>
</tr>
<tr>
<td><code>^u</code></td>
<td>move the cursor up one row, if possible; the cursor column does not change</td>
</tr>
<tr>
<td><code>^l</code></td>
<td>move the cursor left one column, if possible; the cursor row does not change</td>
</tr>
<tr>
<td><code>^r</code></td>
<td>move the cursor right one column, if possible; the cursor row does not change</td>
</tr>
<tr>
<td><code>^e</code></td>
<td>erase characters to the right of, and including, the cursor column on the cursor's row; the cursor row and column do not change</td>
</tr>
<tr>
<td><code>^i</code></td>
<td>enter insert mode</td>
</tr>
<tr>
<td><code>^o</code></td>
<td>enter overwrite mode</td>
</tr>
<tr>
<td><code>^^</code></td>
<td>write a circumflex (<code>^</code>) at the current cursor location, exactly as if it was not a special character; this is subject to the actions of the current mode (insert or overwrite)</td>
</tr>
<tr>
<td><code>^DD</code></td>
<td>move the cursor to the row and column specified; each D represents a decimal digit; the first D represents the new row number, and the second D represents the new column number</td>
</tr>
</tbody></table>
<h1>Input/output</h1>
<h2>In 1</h2>
<pre><code>^h^c^i
DDD^r^rPPPP^d^b
D^r^rD^rP^19P^d^b
D^r^rD^rPPPP^d^b
D^r^rD^rP^d^b
DDD^r^rP  
</code></pre>
<h2>Out 1</h2>
<pre><code>DDD  PPPP 
D  D P   P
D  D PPPP 
D  D P    
DDD  P 
</code></pre>
<h2>In 2</h2>
<pre><code>^h^c^i
^04^^
^13/ \^d^b  /   \
^u^d^d^l^l^l^l^l^l^l^l^l
^r^r^l^l^d&lt;^49&gt;^l^l^d/^b \
^d^r^r^66/^b  \
^b^d   \ /
^d^l^lv^d^b===========^i^94O123456
789^94A=======^u^u^u^u^u^u^l^l\^o^b^r/
</code></pre>
<h2>Out</h2>
<pre><code>    ^
   / \
  /   \
 /     \
&lt;       &gt;
 \     /
  \   /
   \ /
    v
====A=====
</code></pre>
<h1>Bonus</h1>
<p>Turn an 10 by 10 ascii art into most optimized terminal instructions.</p>
<h1>Finaly</h1>
<p>Have a good challenge idea?</p>
<p>Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
<p>Thanks to <a href="/u/chunes">/u/chunes</a> for pointing out my mistakes</p>
</div>
