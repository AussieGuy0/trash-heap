<div class="md"><p>During the 70s and 80s, some handheld calculators used a very different notation for arithmetic called <a href="http://en.wikipedia.org/wiki/Reverse_Polish_notation">Reverse Polish notation</a> (RPN). Instead of putting operators (<code>+</code>, <code>*</code>, <code>-</code>, etc.) between their operands (as in <code>3 + 4</code>), they were placed behind them: to calculate <code>3 + 4</code>, you first inputted the operands (<code>3 4</code>) and then added them together by pressing <code>+</code>.</p>
<p>Internally, this was implemented using a stack: whenever you enter a number, it's pushed onto the stack, and whenever you enter an operator, the <strong>top two elements</strong> are popped off for the calculation. Here's an example of a RPN calculator calculating <code>3 4 * 6 2 - +</code>:</p>
<pre><code>[3] --&gt; 3
[4] --&gt; 3 4
[*] --&gt; 12      ( 3 * 4 = 12)
[6] --&gt; 12 6
[2] --&gt; 12 6 2
[-] --&gt; 12 4    ( 6 - 2 =  4)
[+] --&gt; 16      (12 + 4 = 16)
</code></pre>
<p>Your task is to implement a program that reads a string in Reverse Polish notation and prints the result of the calculation. Your program should support positive and negative integers and the operators <code>+</code>, <code>-</code>, <code>*</code>. (For extra credit, you can implement extra functions, such as decimal numbers, division, exponentiation, etc.)</p>
</div>
