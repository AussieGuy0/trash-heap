# Sad Cycles
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Easy)</em>: Sad Cycles</h1>
<p>Take a number, and add up the square of each digit. You'll end up with another number. If you repeat this process over and over again, you'll see that one of two things happen:</p>
<ul>
<li>You'll reach one, and from that point you'll get one again and again.</li>
<li>You'll reach a cycle of 4, 16, 37, 58, 89, 145, 42, 20, 4, 16, 37, ...</li>
</ul>
<p>For example, starting with the number 12:</p>
<ul>
<li>1<sup>2</sup>+2<sup>2</sup>=5</li>
<li>5<sup>2</sup>=25</li>
<li>2<sup>2</sup>+5<sup>2</sup>=29</li>
<li>2<sup>2</sup>+9<sup>2</sup>=85</li>
<li>8<sup>2</sup>+5<sup>2</sup>=89</li>
<li>8<sup>2</sup>+9<sup>2</sup>=145</li>
<li>From this point on, you'll join the cycle described above.</li>
</ul>
<p>However, if we start with the number 13:</p>
<ul>
<li>1<sup>2</sup>+3<sup>2</sup>=10</li>
<li>1<sup>2</sup>+0<sup>2</sup>=1</li>
<li>1<sup>2</sup>=1</li>
<li>1<sup>2</sup>=1</li>
<li>We get the number 1 forever.</li>
</ul>
<p>The sequence of numbers that we end up with is called a <em>sad cycle</em>, and it depends on the number you start with. If you start the process with a number <strong>n</strong>, the sad cycle for <strong>n</strong> is the cycle which ends up eventually repeating itself; this will either just be the cycle <code>1</code>, or the cycle <code>4, 16, 37, 58, 89, 145, 42, 20</code>.</p>
<p>But what if we cube the digits instead of squaring them? This gives us a different set of cycles all together. For example, starting with 82375 and repeatedly getting the sum of the <em>cube</em> of the digits will lead us to the cycle <code>352, 160, 217</code>. Other numbers gravitate toward certain end points. These cycles are called <em>3-sad cycles</em> (as the digits are raised to the power 3). This can be extended toward higher powers. For example, the 7-sad cycle for 1060925 is <code>5141159, 4955606, 5515475, 1152428, 2191919, 14349038, 6917264, 6182897, 10080881, 6291458, 7254695, 6059210</code>. Your challenge today,  will be to find the <em>b</em>-sad cycle for a given <em>n</em>.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>You will input the base <strong><em>b</em></strong> on the first line, and the starting number <strong><em>n</em></strong> on the second line, like so:</p>
<pre><code>5
117649
</code></pre>
<h2>Output Description</h2>
<p>Output a comma-separated list containing the <strong><em>b</em></strong>-sad cycle for <strong><em>n</em></strong>. For example, the 5-sad cycle for 117649 is:</p>
<pre><code>10933, 59536, 73318, 50062
</code></pre>
<p>The starting point of the cycle doesn't matter - you can give a circularly permuted version of the cycle, too; rotating the output around, wrapping from the start to the end, is also a correct output. The following outputs are equivalent to the above output:</p>
<pre><code>59536, 73318, 50062, 10933
73318, 50062, 10933, 59536
50062, 10933, 59536, 73318
</code></pre>
<h1>Sample Inputs and Outputs</h1>
<h2>Sample 1</h2>
<h3>Input</h3>
<pre><code>6
2
</code></pre>
<h3>Output</h3>
<pre><code>383890, 1057187, 513069, 594452, 570947, 786460, 477201, 239459, 1083396, 841700
</code></pre>
<h2>Sample 2</h2>
<h3>Input</h3>
<pre><code>7
7
</code></pre>
<h3>Output</h3>
<pre><code>5345158, 2350099, 9646378, 8282107, 5018104, 2191663
</code></pre>
<h2>Sample 3</h2>
<h3>Input</h3>
<pre><code>3
14
</code></pre>
<h3>Output</h3>
<pre><code>371
</code></pre>
<h2>Sample 4</h2>
<h3>Input</h3>
<pre><code>11
2
</code></pre>
<h3>Output</h3>
<pre><code>5410213163, 416175830, 10983257969, 105122244539, 31487287760, 23479019969, 127868735735, 23572659062, 34181820005, 17233070810, 12544944422, 31450865399, 71817055715, 14668399199, 134844138593, 48622871273, 21501697322, 33770194826, 44292995390, 125581636412, 9417560504, 33827228267, 21497682212, 42315320498, 40028569325, 40435823054, 8700530096, 42360123272, 2344680590, 40391187185, 50591455115, 31629394541, 63182489351, 48977104622, 44296837448, 50918009003, 71401059083, 42001520522, 101858747, 21187545101, 10669113941, 63492084785, 50958448520, 48715803824, 27804526448, 19581408116, 48976748282, 61476706631
</code></pre>
<h1>Comment Order</h1>
<p>Some people have notified us that new solutions are getting buried if you're not one of the first to submit. This is valid concern, so today we're trialling a method of <strong>setting the suggested sort order to</strong> <strong><em>new</em></strong> (suggested sorts are a newly introduced feature on Reddit). We'll take feedback on this and see how it goes. This means newer solutions will appear at the top.</p>
<p>If you don't like this new sorting, you can still change the method back to <strong>sort by</strong> <strong><em>best</em></strong>, which is the default.</p>
<h1>Notes</h1>
<p>I wasn't aware that <a href="/u/AnkePluff">/u/AnkePluff</a> has made a <a href="http://www.reddit.com/r/dailyprogrammer_ideas/comments/2ydta5/easy_happy_numbers/">similar challenge suggestion</a> already - seems like we're on the same wavelength!</p>
</div>
