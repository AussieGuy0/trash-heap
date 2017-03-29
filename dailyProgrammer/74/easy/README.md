<div class="md"><p>The Fibonacci numbers, which we are all familiar with, start like this:</p>
<pre><code>0,1,1,2,3,5,8,13,21,34,...
</code></pre>
<p>Where each new number in the sequence is the sum of the previous two.</p>
<p>It turns out that by summing different Fibonacci numbers with each other, you can create every single positive integer. In fact, a much stronger statement holds: </p>
<p>Every single positive integer can be represented in one <em>and only one</em> way as a sum of <em>non-consecutive</em> Fibonacci numbers. This is called the number's <a href="http://en.wikipedia.org/wiki/Zeckendorf%27s_theorem">"Zeckendorf representation"</a>.</p>
<p>For instance, the Zeckendorf representation of the number 100 is 89 + 8 + 3, and the Zeckendorf representation of 1234 is 987 + 233 + 13 + 1. Note that all these numbers are Fibonacci numbers, and that they are non-consecutive (i.e. no two numbers in a Zeckendorf representation can be next to each other in the Fibonacci sequence).</p>
<p>There are other ways of summing Fibonacci numbers to get these numbers. For instance, 100 is also equal to 89 + 5 + 3 + 2 + 1, but 1, 2, 3, 5 are all consecutive Fibonacci numbers. If no consecutive Fibonacci numbers are allowed, the representation is unique. </p>
<p>Finding the Zeckendorf representation is actually not very hard. Lets use the number 100 as an example of how it's done:</p>
<p>First, you find the largest fibonacci number less than or equal to 100. In this case that is 89. This number will always be of the representation, so we remember that number and proceed recursively, and figure out the representation of 100 - 89 = 11.</p>
<p>The largest Fibonacci number less than or equal to 11 is 8. We remember that number and proceed recursively with 11 - 8 = 3.</p>
<p>3 is a Fibonacci number itself, so now we're done. The answer is 89 + 8 + 3. </p>
<p>Write a program that finds the Zeckendorf representation of different numbers. </p>
<p>What is the Zeckendorf representation of 3<sup>15</sup> ?</p>
<hr/>
<ul>
<li>Thanks to <a href="http://www.reddit.com/user/SwimmingPastaDevil">SwimmingPastaDevil</a> for suggesting this problem in <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a>! Do you have a problem you think would be good for us? Why not head over there and post it?</li>
</ul>
</div>
