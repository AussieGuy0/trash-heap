# Divisible by 7
<div class="md"><h1>Description</h1>
<p>Consider positive integers that are divisible by 7, and are also divisible by 7 when you reverse the digits. For instance, <code>259</code> counts, because <code>952</code> is also divisible by 7. The list of all such numbers between 0 and 10<sup>3</sup> is:</p>
<pre><code>7 70 77 161 168 252 259 343 434 525 595 616 686 700 707 770 777 861 868 952 959
</code></pre>
<p>The sum of these numbers is 10,787.</p>
<p>Find the sum of all such numbers betwen 0 and 10<sup>11</sup>.</p>
<h1>Notes</h1>
<p>I learned this one from an old ITA Software hiring puzzle. The solution appears in a few places online, so if you want to avoid spoilers, take care when searching. You can check that you got the right answer pretty easily by searching for your answer online. Also the sum of the digits in the answer is 85.</p>
<p>The answer has 21 digits, so a big integer library would help here, as would brushing up on your modular arithmetic.</p>
<h1>Optional challenge</h1>
<p>Make your program work for an upper limit of 10<sup>N</sup> for any N, and be able to efficiently handle N's much larger than 11. Post the sum of the digits in the answer for N = 10,000. (There's no strict speed goal here, but for reference, my Python program handles N = 10,000 in about 30 seconds.)</p>
<p>EDIT: A few people asked about my solution. <a href="https://github.com/cosmologicon/problems/tree/master/lucky7s">I've put it up on github</a>, along with a detailed derivation that's hopefully understandable.</p>
</div>
