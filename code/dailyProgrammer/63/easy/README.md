<div class="md"><p>Write a procedure called reverse(N, A), where N is an integer and A is an array which reverses the N first items in the array and leaves the rest intact. </p>
<p>For instance, if N = 3 and A = [1,2,3,4,5], then reverse(N,A) will modify A so that it becomes [3,2,1,4,5], because the three first items, [1,2,3], have been reversed. Here are a few other examples:</p>
<pre><code>reverse(1, [1, 2, 3, 4, 5])      -&gt; A = [1, 2, 3, 4, 5]
reverse(2, [1, 2, 3, 4, 5])      -&gt; A = [2, 1, 3, 4, 5]
reverse(5, [1, 2, 3, 4, 5])      -&gt; A = [5, 4, 3, 2, 1]
reverse(3, [51, 41, 12, 62, 74]) -&gt; A = [12, 41, 51, 62, 74]
</code></pre>
<p>So if N is equal to 0 or 1, A remains unchanged, and if N is equal to the size of A, all of A gets flipped. </p>
<p>Try to write reverse() so that it works <em>in-place</em>; that is, it uses only a constant amount of memory in addition to the list A itself. This isn't necessary, but it is recommended.</p>
</div>
