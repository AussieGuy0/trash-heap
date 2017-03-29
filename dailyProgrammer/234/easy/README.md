# Vampire Numbers
<div class="md"><p>I see that no [Hard] challenge was posted last week, the moderator had some challenges with getting away. Hopefully an [Easy] challenge makes up for it. </p>
<h1>Description</h1>
<p>A vampire number <em>v</em> is a number <em>v=xy</em> with an even number <em>n</em> of digits formed by multiplying a pair of <em>n</em>/2-digit numbers (where the digits are taken from the original number in any order) <em>x</em> and <em>y</em> together. Pairs of trailing zeros are not allowed. If <em>v</em> is a vampire number, then <em>x</em> and <em>y</em> are called its "fangs." </p>
<p><strong>EDIT FOR CLARITY</strong> Vampire numbers were original 2 two-digit number (fangs) that multiplied to form a four digit number. We can extend this concept to an arbitrary number of two digit numbers. For this challenge we'll work with three two-digit numbers (the fangs) to create six digit numbers with the same property - we conserve the digits we have on both sides of the equation.</p>
<p>Additional information can be found here: <a href="http://www.primepuzzles.net/puzzles/puzz_199.htm">http://www.primepuzzles.net/puzzles/puzz_199.htm</a></p>
<h1>Input Description</h1>
<p>Two digits on one line indicating <em>n</em>, the number of digits in the number to factor and find if it is a vampire number, and <em>m</em>, the number of fangs. Example:</p>
<pre><code>4 2
</code></pre>
<h1>Output Description</h1>
<p>A list of all vampire numbers of <em>n</em> digits, you should emit the number and its factors (or "fangs"). Example:</p>
<pre><code>1260=21*60
1395=15*93
1435=41*35
1530=51*30
1827=87*21
2187=27*81
6880=86*80
</code></pre>
<h1>Challenge Input</h1>
<pre><code>6 3
</code></pre>
<h1>Challenge Input Solution</h1>
<pre><code>114390=41*31*90
121695=21*61*95
127428=21*74*82
127680=21*76*80
127980=20*79*81
137640=31*74*60
163680=66*31*80
178920=71*90*28
197925=91*75*29
198450=81*49*50
247680=40*72*86
294768=46*72*89
376680=73*60*86
397575=93*75*57
457968=56*94*87
479964=74*94*69
498960=99*84*60
</code></pre>
<p><strong>NOTE</strong>: removed <code>139500=31*90*50</code> as an invalid solution - both 90 and 50 in zeros. Thanks to <a href="/u/mips32">/u/mips32</a>. </p>
</div>
