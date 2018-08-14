# Synchronizing Calendars
<div class="md"><h1><a href="#IntermediateIcon"></a> <em>(Intermediate)</em>: Synchronizing Calendars</h1>
<p>You're trying to plan out your family's Easter dinners for the next few centuries.</p>
<p>Your grandparents use the Lunar calendar, but your parents use the Julian calender, so you only have dinner with your grandparents when the calendars synchronize.</p>
<p>To help you figure that out, you're going to need to compute when M Julian years has the same amount of days as N Lunar months. As it turns out, these calendars synchronize with cycles of certain numbers of years.</p>
<p><strong>Some information you will need:</strong></p>
<ul>
<li><p>The time between full moons is 29.53059 days, so that is the length of one Lunar month.</p></li>
<li><p>A Julian year is 365 days for three years, the fourth year is a leap year of 366 days, and then the cycle repeats.</p></li>
<li><p>When taking the days in a number of Lunar months, you will likely get a decimal answer. <em>Round to the nearest day.</em></p></li>
</ul>
<p><em>Author: Zamarok</em></p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>You will be given two numbers <code>(M, N)</code>, where<br/>
<code>M</code> is the number of Julian years, and<br/>
<code>N</code> is the number of Lunar months.</p>
<p>You need to confirm that the number of days in <code>M</code> Julian years is equal to the number of days in <code>N</code> Lunar months.</p>
<h2>Output Description</h2>
<p>You will take <code>M</code> and <code>N</code> and discover if the calendars synchronize after <code>M</code> Julian years and <code>N</code> Lunar months.</p>
<p>When looking at how many days <code>N</code> Lunar months will have, round to the nearest day.</p>
<p>If they do synchronize with the given input, print out the number of days that will pass before this occurs.</p>
<p>If the calendars don't synchronize with the given input, print <code>0</code>.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<pre><code>38, 470
</code></pre>
<h2>Sample Output</h2>
<p>13879</p>
<h1>Challenge Input</h1>
<pre><code>114, 2664
30, 82
</code></pre>
<h2>Challenge Input Solution</h2>
<pre><code>41638
0
</code></pre>
<h1>Note</h1>
<p>This was a problem in my homework for an astronomy class. I decided to code a solution to generate solutions, rather than figuring out it by hand. Turned out to be a good problem to solve, and I learned a bunch while doing it. It's difficult enough to provide a good challenge and to make you think about how to approach the problem from different angles.</p>
<p>Let me know if anyone wants to see the original homework assignment, or my solution (about 5 lines of Haskell).</p>
<h1>Extra Credit (optional):</h1>
<p>Right now your program just confirms when the calendars will synchronize. You can modify your program to generate <code>(M, N)</code> to sequentially discover solutions. Find the largest solution for <code>M</code> where <code>M</code> is less than <code>500</code>.</p>
<p>For even more extra credit, point out the number of years that it takes for one cycle, a cycle being the time between when these calendars synchronize. There are multiple correct answers here.</p>
</div>
