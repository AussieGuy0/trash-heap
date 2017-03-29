# Contiguous chains
<div class="md"><h1>Description:</h1>
<p>If something is contiguous, it means it is connected or unbroken. For a chain, this would mean that all parts of the chain are reachable without leaving the chain. So, in this little piece of ASCII-art:    </p>
<pre><code>xxxxxxxx  
x      x
</code></pre>
<p>there is only 1 contiguous chain, while in this</p>
<pre><code>xxxx xxxx 

x
</code></pre>
<p>there are 3 contiguous chains. Note that a single x, unconnected to any other, counts as one chain. </p>
<p>For the purposes of this problems, chains can only be contiguous if they connect horizontally of vertically, not diagonally. So this image</p>
<pre><code>xx
  xx
    xx    
</code></pre>
<p>contains three chains.</p>
<p>Your challenge today is to write a program that calculates the number of contiguous chains in a given input.  </p>
<h1>Formal inputs &amp; outputs</h1>
<h2>Input:</h2>
<p>The first line in the input will consist of two numbers separated by a space, giving the dimensions of the ASCII-field you're supposed to read. The first number gives the number of lines to read, the second the number of columns (all lines have the same number of columns).</p>
<p>After that follows the field itself, consisting of only x's and spaces. </p>
<h2>Output:</h2>
<p>Output a single number giving the number of contiguous chains. </p>
<h1>Sample inputs &amp; outputs</h1>
<h2>Input 1</h2>
<pre><code>2 8
xxxxxxxx
x      x
</code></pre>
<h2>Output 1</h2>
<pre><code>1
</code></pre>
<h2>Input 2</h2>
<pre><code>3 9
xxxx xxxx
    x    
   xx    
</code></pre>
<h2>Output 2</h2>
<pre><code>3
</code></pre>
<h1>Challenge inputs:</h1>
<h2>Input 1</h2>
<pre><code>4 9
xxxx xxxx
   xxx   
x   x   x
xxxxxxxxx
</code></pre>
<h2>Input 2</h2>
<pre><code>8 11
xx x xx x  
x  x xx x  
xx   xx  x 
xxxxxxxxx x
         xx
xxxxxxxxxxx
 x x x x x 
  x x x x  
</code></pre>
<h1>Bonus</h1>
<p><a href="/u/Cephian">/u/Cephian</a> was nice enough to generete <a href="https://gist.githubusercontent.com/Cephian/f1c2869bd67d40c88042/raw/63871d115bc7bf887eac5434b5c6c5494f83ba2e/10.txt">a much larger 1000x1000 input</a> which you are welcome to use if you want a little tougher performance test. </p>
<h1>Notes</h1>
<p>Many thanks to <a href="/u/vgbm">/u/vgbm</a> for suggesting this problem at <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a>! For his great contribution, <a href="/u/vgbm">/u/vgbm</a> has been awarded with a gold medal. Do you want to be as cool as <a href="/u/vgbm">/u/vgbm</a> (as if that were possible!)? Go on over to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and suggest a problem. If it's good problem, we'll use it. </p>
<p>As a final note, I would just like to observe that "contiguous" is a very interesting word to spell (saying it is no picnic either...)</p>
</div>
