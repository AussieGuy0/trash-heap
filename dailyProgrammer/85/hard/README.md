# (Bitwise arithmetic)
<div class="md"><p>While basic arithmetic operations like addition, subtraction, multiplication, etc. seem 'natural' to us, computers think on a very different level: under the hood, computations work with <a href="http://en.wikipedia.org/wiki/Bitwise_operation">bitwise operations</a>, using operators like <code>~</code>, <code>&amp;</code>, <code>|</code>, <code>^</code>, and <code>&lt;&lt;</code>. Your task is to implement functions for (integer) <strong>addition</strong>, <strong>subtraction</strong>, <strong>negation</strong>, <strong>multiplication</strong>, <strong>division</strong>, <strong>modulo</strong>, and <strong>exponentiation</strong>, without using any "high-level" operators like <code>+</code> and <code>*</code>. Other statements like "if" and "while", or recursion for functional languages, are fine.</p>
<p>As a hint, you could start with a helper function that increments a binary number, and work from there. Your functions should take signed integer arguments and return signed integer values, rounding down (e.g. <code>binary_div(14, 4) == 3</code>, not <code>3.5</code>).</p>
<p>Use your set of functions to implement <a href="http://i.imgur.com/ENkWO.png">this function</a>:</p>
<pre><code>f(a, b, c, d, e) = (a % e) * (b / (c - a) + exp(d * (-b), e))
</code></pre>
<p>What is the result of <code>f(50, -40, 300, 2, 3)</code>?</p>
</div>
