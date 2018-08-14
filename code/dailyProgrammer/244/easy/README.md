# er - Array language (part 3) - J Forks
<div class="md"><p>This challenge does not require doing the previous 2 parts.  If you want something harder, the rank conjunction from Wednesday's challenge requires concentration.</p>
<h1>Forks</h1>
<p>A fork is a function that takes 3 functions that are all "duck defined" to take 2 parameters with 2nd optional or ignorable.</p>
<p>for 3 functions,  <code>f(y,x= default):</code> , <code>g(y,x= default):</code> , <code>h(y,x= default):</code> , where the function g is a "genuine" 2 parameter function,</p>
<p>the call <code>Fork(f,g,h)</code> executes the function composition:</p>
<pre><code> g(f(y,x),h(y,x))  (data1,data2)
</code></pre>
<p><strong>1.  Produce the string that makes the function call from string input:</strong></p>
<pre><code>  sum divide count
</code></pre>
<p>(above input are 3 function names to Fork)</p>
<p><strong>2. Native to your favorite language, create an executable function from above string input</strong></p>
<p>or 3. create a function that takes 3 functions as input, and returns a function.</p>
<pre><code>  Fork(sum, divide ,count)  (array data)
</code></pre>
<p>should return the mean of that array.  Where divide works similarly to add from Monday's challenge.</p>
<p><strong>4. Extend above functions to work for any odd number of function parameters</strong></p>
<p>for 5 parameters,  Fork(a, b, c, d, e) is:</p>
<pre><code>   b(a, Fork(c,d,e))      NB. should expand this if producing strings. 
</code></pre>
<h1>challenge input</h1>
<p>(25 functions)</p>
<pre><code> a b c d e f g h i j k l m n o p q r s t u v w x y
</code></pre>
</div>
