<div class="md"><p>The Fibonacci numbers are defined recursively as</p>
<p>f(0) = 0<br/>
f(1) = 1<br/>
f(n) = f(n-2) + f(n-1)</p>
<p>Find the last eight digits of f( 10<sup>18</sup> ).</p>
<p>If you have some computer science and/or discrete math training, this is not very difficult, but if you don't it can be really tricky. You can't just write a for-loop to calculate Fibonacci numbers one by one (and you certainly can't simply implement the recursive definition directly). That for-loop would have to run a quintillion times, and by the time it's finished, the sun will probably have exploded. You have to be more clever than that.</p>
<p>I should add that the identity you need to solve this problem is on the Wikipedia page for Fibonacci numbers. Using that identity and another algorithm solves the problem instantly (my Python program gives the answer in less than 0.1 seconds).</p>
<ul>
<li>submitted by oskar_s in <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> </li>
</ul>
<p>Edit : Note the "Intermediate" challenge #30 has been changed. Thank you!</p>
</div>
