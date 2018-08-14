# Fibonacci-ish Sequence
<div class="md"><h1>Description</h1>
<p><a href="https://en.wikipedia.org/wiki/Fibonacci_number">The Fibonacci Sequence</a> is a famous integer series in the field of mathematics. The sequence is recursively defined for n &gt; 1 by the formula <em>f(n) = f(n-1) + f(n-2)</em>. In plain english, each term in the sequence is found by adding the previous two terms together.  Given the starting values of <em>f(0) = 0</em> and <em>f(1) = 1</em> the first ten terms of the sequence are:</p>
<blockquote>
<p>0 1 1 2 3 5 8 13 21 34</p>
</blockquote>
<p>We will notice however that some numbers are left out of the sequence and don't get any of the fame, 9 is an example. However, if we were to start the sequence with a different value for <em>f(1)</em> we will generate a new sequence of numbers. Here is the series for <em>f(1) = 3</em>:</p>
<blockquote>
<p>0 3 3 6 <strong>9</strong> 15 24 39 102 165</p>
</blockquote>
<p>We now have a sequence that contains the number 9. What joy!<br/>
Today you will write a program that will find the lowest positive integer for <em>f(1)</em> that will generate a Fibonacci-ish sequence containing the desired integer (let's call it <em>x</em>).</p>
<h1>Input description</h1>
<p>Your input will be a single positive integer <em>x</em>.</p>
<p>Sample Input 1: 21  </p>
<p>Sample Input 2: 84  </p>
<h1>Output description</h1>
<p>The sequence of integers generated using the recursion relation starting from 0 and ending at the desired integer <em>x</em> with the lowest value of <em>f(1)</em>.</p>
<p>Sample Output 1: 0 1 1 2 3 5 8 13 21</p>
<p>Sample Output 2: 0 4 4 8 12 20 32 52 84</p>
<h1>Challenge Inputs</h1>
<p>Input 1: 0<br/>
Input 2: 578<br/>
Input 3: 123456789  </p>
<h1>Notes/Hints</h1>
<p>Large inputs (such as input 3) may take some time given your implementation. However, there is a relationship between sequences generated using <em>f(1) &gt; 1</em> and the classic sequence that can be exploited.</p>
<h1>Bonus</h1>
<p>Make your program run as fast as possible.</p>
<h1>Credit</h1>
<p>This challenge was suggsted by <a href="/u/nmacholl">/u/nmacholl</a>. Have a good challenge idea?  Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and we might use it</p>
</div>
