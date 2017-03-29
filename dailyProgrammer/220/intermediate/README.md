# It's Go time!
<div class="md"><h1><a href="#IntermediateIcon"></a> <em>(Intermediate)</em>: It's Go time!</h1>
<p><a href="https://en.wikipedia.org/wiki/Go_(game)">Go</a> is a board game involving placing black and white stones on a grid. Two opponents take turns to place stones; one player places white stones, the other black. Stones of the same colour form a <em>group</em>, as long as they're all connected via the cardinal axes. The leftmost pair of stones (represented by <code>#</code>) below are valid groups, and the rightmost pair are not.</p>
<pre><code>#      ###   #     ##  
###    # #   #      ##  
 ##    ###    ##      ## 
  #     #      #       ##
</code></pre>
<p>Now, when a player places stones such that a group of the opponent's colour is touching no more open spaces (<em>liberties</em>), then that group is removed from play. The edges of the board do <strong>not</strong> count as open spaces. Let the black stones be represented by <code>b</code> and white stones by <code>w</code>. Here, the player plays as the black stones.</p>
<pre><code>bbbbb
 wwwb
bwbwb
 bbbb
</code></pre>
<p>Let <code>B</code> be the stone I place in the next turn. If I place the stone here:</p>
<pre><code>bbbbb
Bwwwb
bwbwb
 bbbb
</code></pre>
<p>The white group is entirely enclosed by the black group, and so the white group is removed from play.<br/>
If a situation were to arise where both your own and your opponent's stones would be removed, your opponent's stones would be removed first, and then (only if your stones still need to be removed) your own stones would be removed.</p>
<p><em>Liberties</em> don't need to be outside of the group; they can be inside the group, too. These are called <em>eyes</em>. Here, the white group survives, as it has the eye:</p>
<pre><code> bbbbb
bbwwwwb
bww wb
 bwwwwb
  bbbbb
</code></pre>
<p>Your challenge today is to determine the location on the board which, when a stone of your own colour is placed there, will remove the greatest number of your opponent's stones.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>You will be given the size of the grid as a width and a height. Next, you will be given the player's colour - either <code>b</code> or <code>w</code>. Finally, you will be given a grid of the appropriate dimensions, using the format I used in the Description: spaces for empty grid regions, and <code>b</code> and <code>w</code> for stones of either colour.</p>
<h2>Output Description</h2>
<p>Output the co-ordinate of the location which, if you were to place a stone of your own colour there, would result in the greatest number of your opponent's stones being removed. The top-left corner is location <code>(0, 0)</code>.</p>
<h1>Sample Inputs and Outputs</h1>
<h3>Input</h3>
<pre><code>7 5
b      
 bbbbb 
bbwwwwb
bww wb 
 bwwwwb
  bbbbb
</code></pre>
<h3>Output</h3>
<pre><code>(3, 2)
</code></pre>
<h3>Input</h3>
<pre><code>9 11
w
    ww   
  wwbbbw 
  wbbbbw 
 wwbbbbw 
 wwwwwww 
 wbbbbww 
 wbwbbww 
 wbwbbww 
 wwwbbww 
    wbw  
    w    
</code></pre>
<h3>Output</h3>
<pre><code>(5, 10)
</code></pre>
<h3>Input</h3>
<pre><code>7 7
w
w w w w
 bbbbb 
wbbbbbw
 bbbbb 
wbbbbbw
 bbbbb 
w w w w
</code></pre>
<h3>Output</h3>
<pre><code>No constructive move
</code></pre>
<h2>Sample 4</h2>
<h3>Input</h3>
<pre><code>4 3
b
 bw 
bw w
 bw 
</code></pre>
<h3>Output</h3>
<pre><code>(2, 1)
</code></pre>
<h2>Sample 5</h2>
<p>(thanks to <a href="/u/adrian17">/u/adrian17</a>)</p>
<h3>Input</h3>
<pre><code>7 5
b
 bb bb 
bww wwb
 bbbbb 
bwwwb  
 bb    
</code></pre>
<h3>Output</h3>
<pre><code>(3, 1)
</code></pre>
<h1>Notes</h1>
<p>I apologise beforehand to any Go players for presenting such unrealistic scenarios!</p>
<p>Got any cool challenge ideas? Post them to <a href="/r/DailyProgrammer_Ideas">/r/DailyProgrammer_Ideas</a>!</p>
</div>
