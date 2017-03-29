# 0 to 100, Real Quick
<div class="md"><h1>Description</h1>
<p>Oh, how cursed we are to have but 10 digits upon our fingers. Imagine the possibilities were we able to count to numbers beyond! But halt! With 10 digits upon our two appendages, 1024 unique combinations appear! But alas, counting in this manner is cumbersome, and counting to such a number beyond reason. Surely being able to count up to 100 would suffice!</p>
<p>You will be given inputs which correspond to the 10 digits of a pair of hands in the following format, where 1 means the finger is raised, and 0 means the finger is down.</p>
<p>Example:</p>
<table><thead>
<tr>
<th><strong>LP</strong></th>
<th><strong>LR</strong></th>
<th><strong>LM</strong></th>
<th><strong>LI</strong></th>
<th><strong>LT</strong></th>
<th><strong>RT</strong></th>
<th><strong>RI</strong></th>
<th><strong>RM</strong></th>
<th><strong>RR</strong></th>
<th><strong>RP</strong></th>
</tr>
</thead><tbody>
<tr>
<td>0</td>
<td>1</td>
<td>1</td>
<td>1</td>
<td>0</td>
<td>1</td>
<td>1</td>
<td>1</td>
<td>0</td>
<td>0</td>
</tr>
</tbody></table>
<pre><code>L = Left, R = Right, P = Pinky, R = Ring Finger, M = Middle Finger, I = Index Finger, T = Thumb
</code></pre>
<p>Your challenge is to take these inputs, and:</p>
<ol>
<li><p>Determine if it is valid based on <a href="http://www.wikihow.com/Count-to-99-on-Your-Fingers">this counting scheme</a>. </p></li>
<li><p>If it is, then decode the inputs into the number represented by the digits on the hand.</p></li>
</ol>
<h1>Formal Inputs and Outputs</h1>
<pre><code>0111011100 -&gt; 37
1010010000 -&gt; Invalid
0011101110 -&gt; 73
0000110000 -&gt; 55
1111110001 -&gt; Invalid
</code></pre>
<h1>Credit</h1>
<p>This challenge was submitted by <a href="/u/abyssalheaven">/u/abyssalheaven</a>. Thank you! If you have any challenge ideas, please share them in <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and there's a good chance we'll use them. </p>
</div>
