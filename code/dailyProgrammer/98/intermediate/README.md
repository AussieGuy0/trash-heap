# (Multiple cycling)
<div class="md"><p>Write a function that takes two arguments: a limit, <em>lim</em>, and a list of integers, <em>x</em>. The function counts up from 0 by cycling through <em>x</em> and skipping numbers until we find the next number that's a multiple of <em>x[i]</em>. For example, when x is the list [5, 7, 3], start counting from 0:</p>
<ol>
<li>Next multiple of 5 is 5</li>
<li>Next multiple of 7 is 7</li>
<li>Next multiple of 3 is 9</li>
<li>Next multiple of 5 is 10</li>
<li>Next multiple of 7 is 14</li>
<li>Next multiple of 3 is 15</li>
</ol>
<p>When the count reaches <em>lim</em> or a number above it, return the number of steps it took to reach it. (<code>multiple_cycle(15, [5, 7, 3])</code> would return 6.)</p>
<p>What is the result of <code>multiple_count(1000000000, [5395, 7168, 2367, 9999, 3])</code>?</p>
</div>
