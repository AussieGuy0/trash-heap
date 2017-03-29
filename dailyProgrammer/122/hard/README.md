# Subset Sum Insanity
<div class="md"><h1><a href="#HardIcon"></a> <em>(Hard)</em>: Subset Sum</h1>
<p>The <a href="http://en.wikipedia.org/wiki/Subset_sum_problem">subset sum</a> problem is a classic computer science challenge: though it may appear trivial on its surface, there is no known solution that runs in <a href="http://en.wikipedia.org/wiki/P_(complexity">deterministic polynomial time</a>) (basically this is an <a href="http://en.wikipedia.org/wiki/Subset_sum_problem">NP-complete</a> problem). To make this challenge more "fun" (in the same way that losing in Dwarf Fortress is "fun"), we will be solving this problem in a three-dimensional matrix and define a subset as a set of integers that are directly adjacent!</p>
<p><strong>Don't forget our <a href="http://www.reddit.com/r/dailyprogrammer/comments/1dk7c7/05213_challenge_121_hard_medal_management/">previous week-long</a> [Hard] challenge competition ends today!</strong></p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>You will be given three integers <code>(U, V, W)</code> on the first line of data, where each is the length of the matrices' respective dimensions (meaning U is the number of elements in the X dimension, V is the number of elements in the Y dimension, and W is the number of elements in the Z dimension). After the initial line of input, you will be given a series of space-delimited integers that makes up the 3D matrix. Integers are ordered first in the X dimension, then Y, and then Z ( <a href="http://i.imgur.com/nxChpUZ.png">the coordinate system is clarified here</a> ).</p>
<h2>Output Description</h2>
<p>Simply print all sets of integers that sum to 0, if this set is of directly-adjacent integers (meaning a set that travels vertically or horizontally, but never diagonally). If there are no such sets, simply print "No subsets sum to 0".</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<pre><code>2 2 3
-1 2 3 4 1 3 4 5 4 6 8 10
</code></pre>
<h2>Sample Output</h2>
<pre><code>-1 1
</code></pre>
<p><em>Note:</em> This is set of positions (0, 0, 0), and (0, 0, 1).</p>
<h1>Challenge Input</h1>
<pre><code>8 8 8
-7 0 -10 -4 -1 -9 4 3 -9 -1 2 4 -6 3 3 -9 9 0 -7 3 -7 -10 -9 4 -6 1 5 -1 -8 9 1 -9 6 -1 1 -8 -6 -5 -3 5 10 6 -1 2 -2 -7 4 -4 5 2 -10 -8 9 7 7 9 -7 2 2 9 2 6 6 -3 8 -4 -6 0 -2 -8 6 3 8 10 -5 8 8 8 8 0 -1 4 -5 9 -7 -10 1 -7 6 1 -10 8 8 -8 -9 6 -3 -3 -9 1 4 -9 2 5 -2 -10 8 3 3 -1 0 -2 4 -5 -2 8 -8 9 2 7 9 -10 4 9 10 -6 5 -3 -5 5 1 -1 -3 2 3 2 -8 -9 10 4 10 -4 2 -5 0 -4 4 6 -1 9 1 3 -7 6 -3 -3 -9 6 10 8 -3 -5 5 2 6 -1 2 5 10 1 -3 3 -10 6 -6 9 -3 -9 9 -10 6 7 7 10 -6 0 6 8 -10 6 4 -4 -1 7 4 -9 -3 -10 0 -6 7 10 1 -9 1 9 5 7 -2 9 -8 10 -8 -7 0 -10 -7 5 3 2 0 0 -1 10 3 3 -7 8 7 5 9 -7 3 10 7 10 0 -10 10 7 5 6 -6 6 -9 -1 -8 9 -2 8 -7 -6 -8 5 -2 1 -9 -8 2 9 -9 3 3 -8 1 -3 9 1 3 6 -6 9 -2 5 8 2 -6 -9 -9 1 1 -9 5 -4 -9 6 -10 10 -1 8 -2 -6 8 -9 9 0 8 0 4 8 -7 -9 5 -4 0 -9 -8 2 -1 5 -6 -5 5 9 -8 3 8 -3 -1 -10 10 -9 -10 3 -1 1 -1 5 -7 -8 -5 -10 1 7 -3 -6 5 5 2 6 3 -8 9 1 -5 8 5 1 4 -8 7 1 3 -5 10 -9 -2 4 -5 -7 8 8 -8 -7 9 1 6 6 3 4 5 6 -3 -7 2 -2 7 -1 2 2 2 5 10 0 9 6 10 -4 9 7 -10 -9 -6 0 -1 9 -3 -9 -7 0 8 -5 -7 -10 10 4 4 7 3 -5 3 7 6 3 -1 9 -5 4 -9 -8 -2 7 10 -1 -10 -10 -3 4 -7 5 -5 -3 9 7 -3 10 -8 -9 3 9 3 10 -10 -8 6 0 0 8 1 -7 -8 -6 7 8 -1 -4 0 -1 1 -4 4 9 0 1 -6 -5 2 5 -1 2 7 -8 5 -7 7 -7 9 -8 -10 -4 10 6 -1 -4 -5 0 -2 -3 1 -1 -3 4 -4 -6 4 5 7 5 -6 -6 4 -10 -3 -4 -4 -2 6 0 1 2 1 -7
</code></pre>
<h1>Challenge Note</h1>
<p>Like any challenge of this complexity class, you are somewhat constrained to solving the problem with brute-force (sum all possible sub-sets). We really want to encourage any and all new ideas, so really go wild and absolutely do whatever you think could solve this problem quickly!</p>
</div>
