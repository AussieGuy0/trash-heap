# Advanced Langton's Ant
<div class="md"><h1><a href="#IntermediateIcon"></a> <em>(Intermediate)</em>: Advanced Langton's Ant</h1>
<p>If you've done any work or research onto cellular automata, you may have heard of <a href="http://en.wikipedia.org/wiki/Langton%27s_ant">Langton's Ant</a>. It starts with a grid similar to that of <a href="http://www.reddit.com/r/dailyprogrammer/comments/271xyp/">Conway's Game of Life</a> where a grid cell can be black or white, however this time we have an 'ant' on it. This little metaphorical ant will follow these four rules at every 'step':</p>
<ul>
<li>If the current square is white, turn the ant 90' clockwise</li>
<li>If the current square is black, turn the ant 90' anticlockwise</li>
<li>Flip the colour of the current square</li>
<li>Move forward (from the ant's perspective) one cell</li>
</ul>
<p>With the following starting conditions:</p>
<ul>
<li>All cells start white</li>
<li>The ant starts pointing north</li>
</ul>
<p>However, being <a href="/r/DailyProgrammer">/r/DailyProgrammer</a>, we don't do things the easy way. Why only have 2 colours, black or white? Why not as many colours as you want, where you choose whether ant turns left or right at each colour? Today's challenge is to create an emulator for such a modifiable ant.</p>
<p>If you have more than 2 colours, of course, there is no way to just 'flip' the colour. Whenever the ant lands on a square, it is to change the colour of the current square to the next possible colour, going back to the first one at the end - eg. red, green, blue, red, green, blue, etc. In these cases, at the start of the simulation, all of the cells will start with the first colour/character.</p>
<h2>Input Description</h2>
<p>You will be given one line of text consisting of the characters 'L' and 'R', such as:</p>
<pre><code>LRLRR
</code></pre>
<p>This means that there are 5 possible colours (or characters, if you're drawing the grid ASCII style - choose the colours or characters yourself!) for this ant.</p>
<p>In this case, I could choose 5 colours to correspond to the LRLRR:</p>
<ul>
<li><p>White, turn left (anticlockwise)</p></li>
<li><p>Black, turn right (clockwise)</p></li>
<li><p>Red, turn left (anticlockwise)</p></li>
<li><p>Green, turn right (clockwise)</p></li>
<li><p>Blue, turn right (clockwise)</p></li>
</ul>
<p>You could also choose characters, eg. <code>' '</code>, <code>'#'</code>, <code>'%'</code>, <code>'*'</code>, <code>'@'</code> instead of colours if you're ASCII-ing the grid. You will then be given another line of text with a number <strong>N</strong> on it - this is the number of 'steps' to simulate.</p>
<h2>Output Description</h2>
<p>You have some flexibility here. The bare minimum would be to output the current grid ASCII style. You could also draw the grid to an image file, in which case you would have to choose colours rather than ASCII characters. I know there are some people who do these sorts of challenges with C/C++ curses or even more complex systems.</p>
<h1>Notes</h1>
<p><a href="http://en.wikipedia.org/wiki/Langton%27s_ant#Extension_to_multiple_colors">More info on Langton's Ant with multiple colours.</a></p>
</div>
