<div class="md"><p>If you list all positive integers less than or equal to 20, you get this:</p>
<p>1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20</p>
<p>If you count the number of times the digit "1" appears in that list, you get 12. Define a function f(n) which gives the number of 1's needed to write out all numbers 1 to n in decimal notation. </p>
<p>Here is a couple of example values for f(n):</p>
<pre><code>f(20) = 12
f(1234) = 689
f(5123) = 2557
f(70000) = 38000
f(123321) = 93395
f( 3^35 ) = 90051450678399649
</code></pre>
<p>By the way, all numbers in this problem, inputs and outputs alike, fit into 64-bit integers.</p>
<p>Can you implement f(n) in a way that is faster than just listing the values less than n and counting the instances of 1?</p>
<p>What is f( 5<sup>20</sup> )?</p>
<hr/>
<p>Bonus: A curious thing happens when you try and calculate f(35199981). You get 35199981, the same number you put in. You can prove that the number of times f(n) is equal to n is finite. What is the sum of all n such that f(n) == n?</p>
<hr/>
<p>Since this problem is harder than most problems here, I'll give you two hints for solving it.</p>
<p>Hint for calculating f(n):</p>
<pre><code>The numbers f(10^n - 1) (i.e. f(9), f(99), f(999), f(9999), ....) all follow a very regular pattern that is 
trivial to evaluate. If you figure out this pattern (it's not very complicated), you should 
be able to figure out what (for instance) f(99999) is instantaneously. 
Once you have f(99999), what is f(100000)? What is f(200000)? What is f(299999)?
</code></pre>
<p>Hint for the bonus: </p>
<pre><code>There are 83 such numbers, and they are all less than 10^11
</code></pre>
<p>Good luck!</p>
<ul>
<li>Thanks to <a href="http://www.reddit.com/user/Rinfiyks">Rinfiyks</a> for posting this problem in <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a>! Do you have a problem you think would be good for us? Head over there and post it!</li>
</ul>
</div>
