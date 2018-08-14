# Weave insert Part 1
<div class="md"><p>This week's challenges are functional approaches to data interleaving.  This is usually done in the context of data being code or other machine (xml) representation.  Part 2 bonuses will be posted later in the week.</p>
<h1>input of 2 arrays</h1>
<p>First array (or scalar) argument gets interleaved into 2nd array.  :</p>
<pre><code> insWeave([11]. [0, 1, 2, 3])  
</code></pre>
<p>0 , 11 , 1 , 11 , 2 , 11 , 3</p>
<p>If first array is shorter than 2nd, it is extended cyclically</p>
<pre><code> insWeave([11,12]. [0, 1, 2, 3])  
</code></pre>
<p>0 , 11 , 1  , 12 , 2 , 11 , 3</p>
<p>If the 2nd array is shorter than the first then the simplest option is to cut off the first array so that the 2 arrays have equal length.</p>
<pre><code> insWeave([11,12,13]. [0, 1])  
</code></pre>
<p>0 , 11 , 1</p>
<h1>option 2:  shorter 2nd array is grouped by 2 and has items inserted in each pair. (strings are arrays of char)</h1>
<pre><code> insBracket ('abc'  , '()' )
</code></pre>
<p>(a)<br/>
(b)<br/>
(c)  </p>
<h1>string input</h1>
<p>input format has each string within an array on its own line.  A blank line separates the 2 arrays.  A single string represents a character array.  The first line of input indicates "Bracket" or "Weave" to indicate use of the 2 alternate functions.</p>
<p><strong>input:</strong></p>
<p>Bracket<br/>
+-  </p>
<p>234567  </p>
<p><strong>output:</strong><br/>
2+3<br/>
4-5<br/>
6+7  </p>
<p><strong>input:</strong><br/>
Bracket<br/>
2+3<br/>
4-5<br/>
6+7  </p>
<p>()</p>
<p><strong>output:</strong><br/>
(2+3)<br/>
(4-5)<br/>
(6+7)  </p>
<p><strong>input:</strong><br/>
Weave<br/>
*</p>
<p>(2+3)<br/>
(4-5)<br/>
(6+7)  </p>
<p><strong>output:</strong><br/>
(2+3)<br/>
*<br/>
(4-5)<br/>
*<br/>
(6+7)  </p>
</div>
