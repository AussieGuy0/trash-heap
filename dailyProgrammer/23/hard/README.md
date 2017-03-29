<div class="md"><p>Sort a given set of strings based on a unique collating sequence for each position in a string.  Given N collating sequences, to sort strings of length greater than N, sequence i mod N is used at character position i.</p>
<p>For example, consider the three collating sequences:<br/>
collating sequence 0 is: ASCII-order-ignore-case<br/>
collating sequence 1 is: reverse-ASCII-order<br/>
collating sequence 2 is: a-z 0-9 ASCII-order A-Z</p>
<p>In this example the strings</p>
<p>The Cat in the Hat<br/>
the Rain in Spain<br/>
The RAIN in Spain<br/>
Beavis and Butthead</p>
<p>Note that the last ordering says lower case comes before digits; and digits before everything not upper case; and upper case follows all.</p>
<p><strong>The allowable notations for collating sequences are:</strong> </p>
<p>ASCII-order<br/>
ASCII-order-ignore-case<br/>
reverse-ASCII-order<br/>
reverse-ASCII-order-ignore-case<br/>
a-z<br/>
A-Z<br/>
0-9</p>
<p>These can occur in any order without repetition.</p>
<p><strong>Input will be in the form:</strong></p>
<p>N<br/>
description of collating sequence 1<br/>
..<br/>
..<br/>
description of collating sequence N<br/>
line 1<br/>
line 2<br/>
..<br/>
..<br/>
line unknown number</p>
<p>So for the given example, the input would look like:</p>
<p>3<br/>
ASCII-order-ignore-case<br/>
reverse-ASCII-order<br/>
a-z 0-9 ASCII-order A-Z<br/>
The Cat in the Hat<br/>
the Rain in Spain<br/>
The RAIN in Spain<br/>
Beavis and Butthead</p>
<ul>
<li>from a programming competition</li>
</ul>
</div>
