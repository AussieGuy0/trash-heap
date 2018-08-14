# magic square dominoes
<div class="md"><h1>Description</h1>
<p>An NxN magic square is an NxN grid of the numbers 1 through N<sup>2</sup> such that each row, column, and major diagonal adds up to M = N(N<sup>2</sup>+1)/2. <a href="https://www.reddit.com/r/dailyprogrammer/comments/4dccix/20160404_challenge_261_easy_verifying_3x3_magic/">See this week's Easy problem for an example.</a></p>
<p>For some even N, you will be given the numbers 1 through N<sup>2</sup> as N<sup>2</sup>/2 pairs of numbers. You must produce an NxN magic square using the pairs of numbers like dominoes covering a grid. That is, your output is an NxN magic square such that, for each pair of numbers in the input, the two numbers in the pair are adjacent, either vertically or horizontally. The numbers can be swapped so that either one is on the top or left.</p>
<p>For the input provided, there is guaranteed to be at least one magic square that can be formed this way. (In fact there must be at least eight such magic squares, given reflection and rotation.)</p>
<p>Format the grid and input it into your function however you like.</p>
<h1>Efficiency</h1>
<p>An acceptable solution to this problem must be significantly faster than brute force. (This is Hard, after all.) You don't need to get the optimal solution, but you should run your program to completion on at least one challenge input before submitting. Post your output for one of the challenge inputs along with your code (unless you're stuck and asking for help).</p>
<p>Aim to finish one of the three 4x4 challenge inputs within a few minutes (my Python program takes about 11 seconds for all three). I have no idea how feasible the larger ones are. I started my program on a 6x6 input about 10 hours ago and it hasn't finished. But I'm guessing someone here will be more clever than me, so I generated inputs up to 16x16.</p>
<p>Good luck!</p>
<h1>Example input</h1>
<pre><code>1 9
2 10
3 6
4 14
5 11
7 15
8 16
12 13
</code></pre>
<h1>Example output</h1>
<pre><code> 9  4 14  7
 1 12  6 15
16 13  3  2
 8  5 11 10
</code></pre>
<h1>Challenge inputs</h1>
<p><a href="http://pastebin.com/6dkYxvrM">Challenge inputs</a></p>
</div>
