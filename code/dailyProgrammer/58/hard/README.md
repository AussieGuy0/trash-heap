<div class="md"><p>A type of pseudo-random number generator is the so-called <a href="http://en.wikipedia.org/wiki/Lagged_fibonacci_generator">lagged fibonacci generator</a>, which has become somewhat popular because it is very simple to implement, can have an extremely long period, and produces high quality random numbers.</p>
<p>The idea is this: to calculate s(n) (i.e. the nth random number), you evaluate:</p>
<pre><code>s(n) = (s(n - a) + s(n - b)) mod M
</code></pre>
<p>For some positive constants a and b (it is thus similar to the fibonacci numbers, but it "lags" behind) and some modulus M. One popular choice for a and b is a = 24 and b = 55. Lets use those numbers and a modulus of 1073741824 (i.e. 2<sup>30</sup> ), and the generator becomes:</p>
<pre><code>s(n) = (s(n - 24) + s(n - 55)) mod 1073741824
</code></pre>
<p>In order for this formula to work, you need to initialize the values s(0),s(1),...,s(54), so that the recursion has somewhere to bottom out. Often, another random number generator is used to supply the inital values. Lets use the random number generator from the <a href="http://www.reddit.com/r/dailyprogrammer/comments/tpxqc/5162012_challenge_53_intermediate/">intermediate challenge #53</a>.</p>
<p>That is to say, for values s(0) through s(54), s is defined as follows:</p>
<pre><code>s(0) = 123456789
s(n) = (22695477 * s(n-1) + 12345) mod 1073741824
</code></pre>
<p>But for values s(55) and above, s is defined as follows:</p>
<pre><code>s(n) = (s(n - 24) + s(n - 55)) mod 1073741824
</code></pre>
<p>Here are a few example values:</p>
<pre><code>s(10)     = 1048156299
s(20)     = 472459921
s(55)     = 827614689
s(56)     = 530449927
s(100)    = 515277845
s(1000)   = 985063932
s(10000)  = 304605728
s(100000) = 434136346
</code></pre>
<p>Find s( 10<sup>18</sup> )</p>
</div>
