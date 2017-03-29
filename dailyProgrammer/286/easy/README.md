# Reverse Factorial
<div class="md"><h1>Description</h1>
<p>Nearly everyone is familiar with the factorial operator in math. 5! yields 120 because factorial means "multiply successive terms where each are one less than the previous":</p>
<pre><code>5! -&gt; 5 * 4 * 3 * 2 * 1 -&gt; 120
</code></pre>
<p>Simple enough. </p>
<p>Now let's reverse it. Could you write a function that tells us that "120" is "5!"? </p>
<p>Hint: The strategy is pretty straightforward, just divide the term by successively larger terms until you get to "1" as the resultant:</p>
<pre><code>120 -&gt; 120/2 -&gt; 60/3 -&gt; 20/4 -&gt; 5/5 -&gt; 1 =&gt; 5!
</code></pre>
<h1>Sample Input</h1>
<p>You'll be given a single integer, one per line. Examples:</p>
<pre><code>120
150
</code></pre>
<h1>Sample Output</h1>
<p>Your program should report what each number is as a factorial, or "NONE" if it's not legitimately a factorial. Examples:</p>
<pre><code>120 = 5!
150   NONE
</code></pre>
<h1>Challenge Input</h1>
<pre><code>3628800
479001600
6
18
</code></pre>
<h1>Challenge Output</h1>
<pre><code>3628800 = 10!
479001600 = 12!
6 = 3!
18  NONE
</code></pre>
</div>
