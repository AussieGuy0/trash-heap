# (Dice roller)
<div class="md"><p>In tabletop role-playing games like Dungeons &amp; Dragons, people use a system called <a href="http://en.wikipedia.org/wiki/Dice_notation">dice notation</a> to represent a combination of dice to be rolled to generate a random number. Dice rolls are of the form <strong>A</strong>d<strong>B</strong> <em>(+/-)</em> <strong>C</strong>, and are calculated like this:</p>
<ol>
<li>Generate <strong>A</strong> random numbers from 1 to <strong>B</strong> and add them together.</li>
<li>Add or subtract the modifier, <strong>C</strong>.</li>
</ol>
<p>If <strong>A</strong> is omitted, its value is 1; if (+/-)<strong>C</strong> is omitted, step 2 is skipped. That is, <code>"d8"</code> is equivalent to <code>"1d8+0"</code>.</p>
<p>Write a function that takes a string like <code>"10d6-2"</code> or <code>"d20+7"</code> and generates a random number using this syntax.</p>
<p>Here's a hint on how to parse the strings, if you get stuck:</p>
<pre><code>Split the string over 'd' first; if the left part is empty, A = 1,
otherwise, read it as an integer and assign it to A. Then determine
whether or not the second part contains a '+' or '-', etc.
</code></pre>
</div>
