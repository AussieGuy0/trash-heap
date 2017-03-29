# Ogre Maze
<div class="md"><h1>Description:</h1>
<p>Today we are going to solve a maze. What? Again? Come on, Simpsons did it. Yah okay so we always pick a hero to walk a maze. This time our hero is an Ogre.</p>
<p>An ogre is large. Your run of the mill hero "@" takes up a 1x1 spot. Easy. But our beloved hero today is an ogre.</p>
<pre><code> @@
 @@
</code></pre>
<p>Ogres take up a 2x2 space instead of a 1x1. This makes navigating a maze tougher as you have to handle the bigger ogre.</p>
<p>So I will give you a layout of a swamp. (Ogres navigate swamps while puny heroes navigate caves. That's the unwritten rules of maze challenges) You will find the path (if possible) for
the ogre to walk to his gold. </p>
<h1>Input:</h1>
<p>You will read in a swamp. The swamp is laid out in 10x10 spaces. Each space can be the following:</p>
<ul>
<li>. - empty spot</li>
<li>@ - 1/4th of the 2x2 ogre</li>
<li>$ - the ogre's gold</li>
<li>O - sink hole - the ogre cannot touch these. All 2x2 of the Ogre manages to fall down one of these (even if it is a 1x1 spot too. Don't be bothered by this - think of it as a "wall" but in a swamp we call them sink holes)</li>
</ul>
<h1>Output:</h1>
<p>You will navigate the swamp. If you find a path you will display the solution of all the spaces the ogre will occupy to get to his gold. Use a "&amp;" symbol to show the muddy path created by the ogre to reach his gold. If there is no path at all then you will output "No Path"</p>
<h1>Example Input 1:</h1>
<pre><code> @@........
 @@O.......
 .....O.O..
 ..........
 ..O.O.....
 ..O....O.O
 .O........
 ..........
 .....OO...
 .........$
</code></pre>
<h1>Example  Output 1:</h1>
<pre><code>&amp;&amp;.&amp;&amp;&amp;&amp;&amp;&amp;&amp;
&amp;&amp;O&amp;&amp;&amp;&amp;&amp;&amp;&amp;
&amp;&amp;&amp;&amp;&amp;O.O&amp;&amp;
&amp;&amp;&amp;&amp;&amp;&amp;&amp;&amp;&amp;&amp;
..O.O&amp;&amp;&amp;&amp;&amp;
..O..&amp;&amp;O.O
.O...&amp;&amp;&amp;&amp;.
.....&amp;&amp;&amp;&amp;.
.....OO&amp;&amp;&amp;
.......&amp;&amp;&amp;
</code></pre>
<h1>Example Input 2:</h1>
<pre><code>@@........
@@O.......
.....O.O..
..........
..O.O.....
..O....O.O
.O........
..........
.....OO.O.
.........$
</code></pre>
<h1>Example Output 2:</h1>
<p>No Path</p>
<h1>FAQ (Will update with answers here)</h1>
<ul>
<li>Q: Does path have to be shortest Path.</li>
<li>A: No.</li>
</ul>
<h3>-</h3>
<ul>
<li>Q: There could be a few different paths. Which one do I output?</li>
<li>A: The first one that works. Answers will vary based on how people solve it.</li>
</ul>
<h3>-</h3>
<ul>
<li>Q: My output should show all the spots the Ogre moves too or just the optimal path?</li>
<li>A: The ogre will hit dead ends. But only show the optimal path and not all his dead ends. Think of this as a GPS Tom-Tom guide for the Ogre so he uses the program to find his gold. TIL Ogres subscribe to <a href="/r/dailyprogrammer">/r/dailyprogrammer</a>. (And use the internet....)</li>
</ul>
<h1>Challenge Input 1:</h1>
<pre><code>$.O...O...
...O......
..........
O..O..O...
..........
O..O..O...
..........
......OO..
O..O....@@
........@@
</code></pre>
<h1>Challenge Input 2:</h1>
<pre><code>.@@.....O.
.@@.......
..O..O....
.......O..
...O......
..........
.......O.O
...O.O....
.......O..
.........$
</code></pre>
<h1>Bonus:</h1>
<p>For those seeking more challenge. Instead of using input swamps you will generate a swamp. Place the Ogre randomly. Place his gold randomly. Generate sinkholes based on the size of the swamp.</p>
<p>For example you are given N for a NxN swamp to generate. Generate a random swamp and apply your solution to it. The exact design/algorithm for random generation I leave it for you to tinker with. I suggest start with like 15% of the swamp spots are sinkholes and go up or down based on your results. (So you get paths and not always No Path)</p>
</div>
