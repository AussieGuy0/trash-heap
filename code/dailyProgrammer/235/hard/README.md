# Contiguous Chain Variation
<div class="md"><h1>Description</h1>
<p>Based on <a href="http://redd.it/3gpjn3">Challenge #227 Contiguous chains</a>
... but with a chain meaning 1 <em>continuous</em> strand, where each link in the chain can be connected to <em>at most</em> two neighbors. For the purposes of this problem, chains can only be contiguous if they connect horizontally of vertically, not diagonally (which is the same original constraint).</p>
<p>For example, the input:</p>
<pre><code>4 9
xxxx xxxx
   xxx   
x   x   x
xxxxxxxxx
</code></pre>
<p>has at least 3 chains, with several valid layouts for the chains. One possible layout that shows 3 chains:</p>
<pre><code>1111 2222
   112
3   1   3
333333333
</code></pre>
<p>Another way to find 3:</p>
<pre><code>1111 1111
   111
2   2   3
222223333
</code></pre>
<p>There is also a valid set of 4 chains:</p>
<pre><code>1111 2222
   111
3   3   4
333334444
</code></pre>
<p>but 4 is not a correct (minimal) output, because 3 is possible.</p>
<p>Your challenge, should you choose to accept it, is to find the minimum number of chains in a given input.</p>
<h1>Challenge Input</h1>
<pre><code>4 9
xxxx xxxx
   xxx   
x   x   x
xxxxxxxxx
</code></pre>
<h1>Challenge Output</h1>
<pre><code>3
</code></pre>
<h1>Credit</h1>
<p>This challenge was suggested by <a href="/u/BarqsDew">/u/BarqsDew</a> over in <a href="/r/DailyProgrammer_Ideas">/r/DailyProgrammer_Ideas</a>. If you have any suggested challenges, please share them and there's a good chance we'll use them. </p>
</div>
