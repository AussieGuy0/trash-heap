<div class="md"><p>Two strings A and B are said to have a <em>common substring</em> called C, if C is embedded somewhere in both A and B. For instance, "ble" is a common substring for "Dou<strong>ble</strong>, double, toil and trouble" and "Fire burn and cauldron bub<strong>ble</strong>" (because, as you can see, "ble" is part of both "Double" and "Bubble"). It is, however, not the longest common substring, the longest common substring is " and " (5 characters long for vs. 3 characters long for "ble").</p>
<p>Define two pseudo-random number generators, P(N) and Q(N), like this:</p>
<pre><code>P(0) = 123456789
P(N) = (22695477 * P(N-1) + 12345) mod 1073741824

Q(0) = 987654321
Q(N) = (22695477 * Q(N-1) + 12345) mod 1073741824
</code></pre>
<p>Thus, they're basically the same except for having different seed values. Now, define SP(N) to be the first N values of P concatenated together and made into a string. Similarly, define SQ(N) as the first N values of Q concatenated together and made into a string. So, for instance:</p>
<pre><code>SP(4) = "123456789752880530826085747576968456"
SQ(4) = "987654321858507998535614511204763124"
</code></pre>
<p>The longest common substring for SP(30) and SQ(30) is "65693".</p>
<p>Find the longest common substring of SP(200) and SQ(200)</p>
<hr/>
<p>BONUS: Find the longest common substring of SP(4000) and SQ(4000).</p>
</div>
