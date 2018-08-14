# The Heighway dragon fractal
<div class="md"><h1>Description</h1>
<p>Write a program to print out the (x, y) coordinates of each point in the nth iteration of the <a href="http://www-user.uni-bremen.de/schmuhl/fractals/dragon_curve_o12.png">Heighway dragon fractal</a>. Start at the origin (0, 0) and take steps of length 1, starting in the positive x direction (1, 0), then turning to the positive y direction (1, 1). Your program should generate 2<sup>n</sup> + 1 lines of output.</p>
<p>You can use any resources you want for help coming up with the algorithm, but if you want to start from the very beginning, use only the fact that the nth iteration can be made by <a href="http://www.cutoutfoldup.com/images/0216-s03b.jpg">folding a strip of paper in half n times, then unfolding it so that each crease is at a right angle</a>.</p>
<h1>Example</h1>
<p>For n = 3, your output should be:</p>
<pre><code>0 0
1 0
1 1
0 1
0 2
-1 2
-1 1
-2 1
-2 2
</code></pre>
<p><a href="http://i.imgur.com/3sCzNyG.png">Plotted image of these points</a>, made using LibreOffice.</p>
<p>The sum of the x's here is -4, and the sum of the y's is 10. For n = 12, the sums are -104896 and 52416. To verify that your program is correct, post the sum of x's and y's for n = 16 along with your code.</p>
<h1>Optional challenges</h1>
<p>Today's basic challenge is not too hard, relatively speaking, so if you want more, try some of these optional add-ons, or take it in your own direction.</p>
<ol>
<li>Show us a plot of your output. There are many options for this. You can use a plotting library for your language of choice, or use a spreadsheet like I did. gnuplot is another free option. Feel free to get creative with colors, effects, animations, etc.</li>
<li>Optimize your code for memory usage. Aim for O(n) space.</li>
<li>Optimize your code for speed. What's the largest n you can generate all the data for in less than 1 minute? (You can skip printing output for this one, as long as you actually do all the calculations.)</li>
<li>Golf: minimize your code length. What's the shortest program you can write in your language that works?</li>
<li>There are <a href="http://i.imgur.com/n30yp.gif">other ways of generating the Heighway dragon</a> than the paper folding one I suggested. Try implementing a different one than you used first.</li>
<li>There are many variations of the Heighway dragon <a href="http://ecademy.agnesscott.edu/%7Elriddle/ifs/heighway/heighway.htm">(see Variations at the bottom)</a>. Try creating a terdragon, golden dragon, or anything else you can find.</li>
<li>Find a way to efficiently calculate s(n), the sum of the x's and y's for the nth iteration. For example, s(3) = (-4, 10) and s(12) = (-104896, 52416). Post s(100) along with your code. (This is possible without any advanced math, but it's tricky.)</li>
<li>Find a way to efficiently calculate p(k), the (x, y) position after k steps (i.e. the (k+1)th line of output when n is sufficiently large), starting from from p(0) = (0, 0), p(1) = (1, 0). For example, p(345) = (13, 6). Post p(3<sup>45</sup>) along with your code. (This one is also quite tricky.)</li>
</ol>
</div>
