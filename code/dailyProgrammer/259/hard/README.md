# Operator number system
<div class="md"><p>In most cases, humans use a decimal system. Scientists have suggested that this way to count things has been defined by our hands with 5 fingers each (total of 10 fingers). When the computer was developed, the binary system was implemented because of the two options that electricity allows (current or no current). Today, we’ll throw practical sensibilities in the garbage and define a system to write all the integers that is based on operators and the static natural number sequence (integers 0 or higher).  Call it NOS (Natural Operator Sequence) base.</p>
<h1>Rules</h1>
<ol>
<li>Each digit in a number represents one of 3 operators: -  <code>0: +</code> <code>1: -</code> <code>2: *</code></li>
<li>The length of the number (count of digits) limits the natural number sequence used.  A 4 digit number means the operators are inserted into the sequence <code>0 _ 1 _ 2 _ 3 _ 4</code></li>
<li>Operators are inserted left to right, and there are no special precedence rules for <code>*</code> multiplication.</li>
<li>The encoding used should use the fewest number of digits/operators possible:</li>
</ol>
<p>Possible encodings of the number <code>10</code> are:</p>
<p>0000 = 0 + 1 + 2 + 3 + 4<br/>
0220 = 0 + 1 * 2 * 3 + 4<br/>
02212 = 0 + 1 * 2 * 3 - 4 * 5  </p>
<p>Only the first 2 representations satisfy the 4th rule of being the shortest possible:</p>
<p><strong>optional 5th rule:</strong>  As a tie break for "correct representation" use the representation with the most <code>0</code>s (representing +), and optionally if still tied, use the representation that would sort first.  ex:  first above <code>0000</code> representation of 10 has the most <code>0</code>'s.  These tie breakers are arbitrary, and you may use any tie breaking scheme you want.</p>
<p>The number 2 can be represented as either <code>02</code> or <code>20</code>.  By optional last rule, <code>02</code> is the "correct"  representation.</p>
<h1>1 easy: read NOS base numbers (optional)</h1>
<p><strong>input</strong>:<br/>
10020  </p>
<p><strong>output</strong>:<br/>
21  </p>
<h1>2 hard:  Find the shortest NOS representation of a decimal number</h1>
<p><strong>input</strong>:<br/>
21  </p>
<p><strong>output</strong>:<br/>
10020  </p>
<p>Find the shortest NOS representations for numbers up to say 50.</p>
<h1>Philosophy bonus:</h1>
<p>Speculate optimistically regarding interesting or practical features of using operators and a known sequence as a base system, or... merciless denigrate the optimistic fools that may dare propose thoughts.</p>
<h1>thanks to:</h1>
<p><a href="/u/jedidreyfus">/u/jedidreyfus</a> and <a href="/u/cheers-">/u/cheers-</a> for the challenge idea they posted to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> </p>
</div>
