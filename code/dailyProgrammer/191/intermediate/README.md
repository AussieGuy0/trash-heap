# Space Probe. Alright Alright Alright.
<div class="md"><h1>Description:</h1>
<p>NASA has contracted you to program the AI of a new probe. This new probe must navigate space from a starting location to an end location. The probe will have to deal with Asteroids and Gravity Wells. Hopefully it can find the shortest path.</p>
<h1>Map and Path:</h1>
<p>This challenge requires you to establish a random map for the challenge. Then you must navigate a probe from a starting location to an end location.</p>
<h1>Map:</h1>
<p>You are given N -- you generate a NxN 2-D map (yes space is 3-D but for this challenge we are working in 2-D space)</p>
<ul>
<li>30% of the spots are "A" asteroids</li>
<li>10% of the spots are "G" gravity wells (explained below)</li>
<li>60% of the spots are "." empty space.</li>
</ul>
<p>When you generate the map you must figure out how many of each spaces is needed to fill the map. The map must then be randomly populated to hold the amount of Gravity Wells and Asteroids based on N and the above percentages.</p>
<h2>N and Obstacles</h2>
<p>As n changes so does the design of your random space map. Truncate the amount of obstacles and its always a min size of 1. (So say N is 11 so 121 spaces. At 10% for wells you need 12.1 or just 12 spots) N can be between 2 and 1000. To keep it simple you will assume every space is empty then populate the random Asteroids and Gravity wells (no need to compute the number of empty spaces - they will just be the ones not holding a gravity well or asteroid)</p>
<h2>Asteroids</h2>
<p>Probes cannot enter the space of an Asteroid. It will just be destroyed.</p>
<h2>Empty Spaces</h2>
<p>Probes can safely cross space by the empty spaces of space. Beware of gravity wells as described below.</p>
<h2>Gravity Wells</h2>
<p>Gravity wells are interesting. The Space itself is so dense it cannot be travelled in. The adjacent spaces of a Gravity well are too strong and cannot be travelled in. Therefore you might see this.</p>
<p>. = empty space, G = gravity well</p>
<pre><code> .....
 .....
 ..G..
 .....
 .....
</code></pre>
<p>But due to the gravity you cannot pass (X = unsafe)</p>
<pre><code> .....
 .XXX.
 .XGX.
 .XXX.
 .....
</code></pre>
<p>You might get Gravity wells next to each other. They do not effect each other but keep in mind the area around them will not be safe to travel in.</p>
<pre><code> ......
 .XXXX.
 .XGGX.
 .XXXX.
 ......
</code></pre>
<h1>Probe Movement:</h1>
<p>Probes can move 8 directions. Up, down, left, right or any of the 4 adjacent corners. However there is no map wrapping. Say you are at the top of the map you cannot move up to appear on the bottom of the map. Probes cannot fold space. And for whatever reason we are contained to only the spots on the map even thou space is infinite in any direction. </p>
<h1>Output:</h1>
<p>Must show the final Map and shortest safe route on the map. </p>
<ul>
<li>. = empty space</li>
<li>S = start location</li>
<li>E = end location</li>
<li>G = gravity well</li>
<li>A = Asteroid</li>
<li>O = Path.</li>
</ul>
<p>If you fail to get to the end because of no valid path you must travel as far as you can and show the path. Note that the probe path was terminated early due to "No Complete Path" error.</p>
<h1>Challenge Input:</h1>
<p>using (row, col) for coordinates in space.</p>
<p>Find solutions for:</p>
<ul>
<li>N = 10, start = (0,0) end = (9,9)</li>
<li>N = 10, start = (9, 0) end = (0, 9)</li>
<li>N= 50, start = (0,0) end = (49, 49)</li>
</ul>
<h1>Map Obstacle %</h1>
<p>I generated a bunch of maps and due to randomness you will get easy ones or hard ones. I suggest running your solutions many times to see your outcomes. If you find the solution is always very straight then I would increase your asteroid and gravity well percentages. Or if you never get a good route then decrease the obstacle percentages. </p>
<h1>Challenge Theme Music:</h1>
<p>If you need inspiration for working on this solution listen to this in the background to help you.</p>
<p><a href="https://www.youtube.com/watch?v=4PL4kzsrVX8">https://www.youtube.com/watch?v=4PL4kzsrVX8</a></p>
<p>Or</p>
<p><a href="https://www.youtube.com/watch?v=It4WxQ6dnn0">https://www.youtube.com/watch?v=It4WxQ6dnn0</a></p>
</div>
