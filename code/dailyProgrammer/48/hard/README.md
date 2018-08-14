<div class="md"><p>Inspired by the divide and conquer problem posted on 4/16/12, here's another problem that can be solved using divide and conquer. You are given a grid of vertices/nodes connected by adjacent nodes in a checkerboard manner (basically think of the intersection points of the grids on a piece of graphing paper) and each of these nodes is marked with a positive number. Assuming that these numbers are distinct, give an algorithm that can find a single local minimum.</p>
<p>Bonus: If there are n<sup>2</sup> nodes in our grid, give an O(n) time complexity algorithm that can find one/any local minimum.<br/>
In other words, if the construction of the grid takes some time c<sup>*</sup> n<sup>2,</sup> find an algorithm that locates any local minimum by looking at only some constant factor times the square root of the total number of nodes there are in the grid.</p>
<p>Hint: divide into quadrants; the recurrence T(n) = 1*T(n/4) + O(n) is (maybe somewhat counter-intuitively) in O(n).</p>
<ul>
<li>thanks to leegao for the challenge at <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> ... <a href="http://www.reddit.com/r/dailyprogrammer_ideas/comments/sclks/finding_the_local_minimum_in_a_grid_difficult/">LINK</a></li>
</ul>
</div>
