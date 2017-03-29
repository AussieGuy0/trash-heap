# Abundant and Deficient Numbers
<div class="md"><h1>Description</h1>
<p>In number theory, a deficient or <strong>deficient number</strong> is a number n for which the sum of divisors <em>sigma(n)&lt;2n</em>, or, equivalently, the sum of proper divisors (or aliquot sum) <em>s(n)&lt;n</em>. The value <em>2n - sigma(n)</em> (or <em>n - s(n)</em>) is called the number's deficiency. In contrast, an <strong>abundant number</strong> or excessive number is a number for which the sum of its proper divisors is greater than the number itself</p>
<p>As an example, consider the number 21. Its divisors are 1, 3, 7 and 21, and their sum is 32. Because 32 is less than 2 x 21, the number 21 is <em>deficient</em>. Its deficiency is 2 x 21 - 32 = 10.</p>
<p><del>The integer 12 is the first <em>abundant</em> number. Its proper divisors are 1, 2, 3, 4 and 6 for a total of 16. The amount by which the sum exceeds the number is the abundance. The number 12 has an abundance of 4, for example.</del> The integer 12 is the first abundant number. Its divisors are 1, 2, 3, 4, 6, and 12, and their sum is 28. Because 28 is greater than 2 x 12, the number 12 is abundant. It's abundant by is 28 - 24 = 4. (Thanks <a href="/u/Rev0lt_">/u/Rev0lt_</a> for the correction.)</p>
<h1>Input Description</h1>
<p>You'll be given an integer, one per line. Example:</p>
<pre><code>18
21
9
</code></pre>
<h1>Output Description</h1>
<p>Your program should emit if the number if deficient, abundant (and its abundance), or neither. Example:</p>
<pre><code>18 abundant by 3
21 deficient
9 ~~neither~~ deficient
</code></pre>
<h1>Challenge Input</h1>
<pre><code>111  
112 
220 
69 
134 
85 
</code></pre>
<h1>Challenge Output</h1>
<pre><code>111 ~~neither~~ deficient 
112 abundant by 24
220 abundant by 64
69 deficient
134 deficient
85 deficient
</code></pre>
<h1>OOPS</h1>
<p>I had fouled up my implementation, 9 and 111 are deficient, not perfect. See <a href="http://sites.my.xs.edu.ph/connor-teh-14/aste/mathematics-asteroids/perfect-abundant-and-deficient-numbers-1-100">http://sites.my.xs.edu.ph/connor-teh-14/aste/mathematics-asteroids/perfect-abundant-and-deficient-numbers-1-100</a>. </p>
</div>
