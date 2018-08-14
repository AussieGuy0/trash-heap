# Ambiguous Bases
<div class="md"><h1>Description:</h1>
<p>Due to an unfortunate compression error your lucky number in base n was compressed to a simple string where the conversion to decimal has potentially many values.</p>
<p>Normal base n numbers are strings of characters, where each character represents a value from 0 to (n-1) inclusive. The numbers we are dealing with here can only use digits though, so some "digits" span multiple characters, causing ambiguity.</p>
<p>For example "A1" in normal hexadecimal would in our case be "101" as "A" converts to 10, as "A" is the 10<sup>th</sup> character in base 16 </p>
<p>"101" is can have multiple results when you convert from ambiguous base 16 to decimal as it could take on the possible values:</p>
<pre><code> 1*16^2 + 0*16^1 + 1*16^0  (dividing the digits as [1][0][1])
 10*16^1 + 1*16^0 (dividing the digits as [10][1])
</code></pre>
<p>A few notes:</p>
<ul>
<li>Digits in an "ambiguous" number won't start with a 0. For example, dividing the digits in 101 as <code>[1][01]</code> is not valid because <code>01</code> is not a valid digit.</li>
<li>Ensure that your solutions work with non-ambiguous bases, like "1010" base 2 -&gt; 10</li>
<li>Recall that like normal base n numbers the range of values to multiply by a power of n is 0 to (n-1) inclusive.</li>
</ul>
<h1>Input:</h1>
<p>You will be given a string of decimal values ("0123456789") and a base n.</p>
<h1>Output:</h1>
<p>Convert the input string to all possible unique base 10 values it could take on, sorted from smallest to largest.</p>
<h1>Challenge Inputs</h1>
<ul>
<li><code>101 2</code></li>
<li><code>101 16</code></li>
<li><code>120973 25</code></li>
</ul>
<h1>Bonus Inputs</h1>
<ul>
<li><code>25190239128039083901283 100</code></li>
<li><code>251902391280395901283 2398</code></li>
</ul>
<p>The first 10,000 values of each Bonus output are pasted here respectively:</p>
<p><a href="http://pastebin.com/QjP3gazp">http://pastebin.com/QjP3gazp</a></p>
<p><a href="http://pastebin.com/ajr9bN8q">http://pastebin.com/ajr9bN8q</a></p>
<h1>Finally</h1>
<p>Credit for this challenge goes to by <a href="/u/wwillsey">/u/wwillsey</a>, who proposed it in <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a>. Have your own neat challenge idea? Drop by and show it off!</p>
</div>
