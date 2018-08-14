# Kaprekar's Routine
<div class="md"><h1>Description</h1>
<p>Write a function that, given a 4-digit number, returns the largest digit in that number. Numbers between 0 and 999 are counted as 4-digit numbers with leading 0's.</p>
<pre><code>largest_digit(1234) -&gt; 4
largest_digit(3253) -&gt; 5
largest_digit(9800) -&gt; 9
largest_digit(3333) -&gt; 3
largest_digit(120) -&gt; 2
</code></pre>
<p>In the last example, given an input of <code>120</code>, we treat it as the 4-digit number <code>0120</code>.</p>
<p><em>Today's challenge is really more of a warmup for the bonuses. If you were able to complete it, I highly recommend giving the bonuses a shot!</em></p>
<h1>Bonus 1</h1>
<p>Write a function that, given a 4-digit number, performs the "descending digits" operation. This operation returns a number with the same 4 digits sorted in descending order.</p>
<pre><code>desc_digits(1234) -&gt; 4321
desc_digits(3253) -&gt; 5332
desc_digits(9800) -&gt; 9800
desc_digits(3333) -&gt; 3333
desc_digits(120) -&gt; 2100
</code></pre>
<h1>Bonus 2</h1>
<p>Write a function that counts the number of iterations in Kaprekar's Routine, which is as follows.</p>
<p>Given a 4-digit number <em>that has at least two different digits</em>, take that number's descending digits, and subtract that number's ascending digits. For example, given <code>6589</code>, you should take <code>9865 - 5689</code>, which is <code>4176</code>. Repeat this process with <code>4176</code> and you'll get <code>7641 - 1467</code>, which is <code>6174</code>.</p>
<p>Once you get to 6174 you'll stay there if you repeat the process. In this case we applied the process 2 times before reaching 6174, so our output for <code>6589</code> is <code>2</code>.</p>
<pre><code>kaprekar(6589) -&gt; 2
kaprekar(5455) -&gt; 5
kaprekar(6174) -&gt; 0
</code></pre>
<p>Numbers like 3333 would immediately go to 0 under this routine, but since we require at least two different digits in the input, all numbers will eventually reach 6174, which is known as Kaprekar's Constant. <a href="https://www.youtube.com/watch?v=d8TRcZklX_Q">Watch this video if you're still unclear on how Kaprekar's Routine works</a>.</p>
<p>What is the largest number of iterations for Kaprekar's Routine to reach 6174? That is, what's the largest possible output for your <code>kaprekar</code> function, given a valid input? Post the answer along with your solution.</p>
<p><em>Thanks to <a href="/u/BinaryLinux">u/BinaryLinux</a> and <a href="/u/Racoonie">u/Racoonie</a> for posting the idea behind this challenge in <a href="/r/daliyprogrammer_ideas">r/daliyprogrammer_ideas</a>!</em></p>
</div>
