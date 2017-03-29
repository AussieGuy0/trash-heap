# Arrows and Arrows, part 1
<div class="md"><h1><a href="#HardIcon"></a> <strong>(Hard)</strong>: Arrows and Arrows, part 1</h1>
<p>Wednesday's challenge was released later than I wanted it to be (my fault entirely), so I'll make it up to you by posting this one early. I fear some previous hard challenges have appeared unapproachable to some people due to their logical or mathematical complexity. I aim to make a Hard challenge today which is innately simple, but will still require a Hard degree of thought (assuming you come up with the algorithm yourself.)<br/>
Take this grid of characters:</p>
<pre><code>v&lt;^&gt;&lt;&gt;&gt;v&gt;&lt;&gt;^&lt;&gt;vvv^^&gt;
&gt;^&lt;&gt;^&lt;&lt;v&lt;&gt;&gt;^v^v&gt;&lt;^&lt;&lt;
v^^&gt;&gt;&gt;&gt;&gt;&gt;&lt;v^^&lt;^vvv&gt;v
^^&gt;&lt;v&lt;^^&lt;^&lt;^^&gt;&gt;&gt;v&gt;v&gt;
^&lt;&gt;vv^&gt;&lt;&gt;^&lt;^^&lt;&lt;^^&gt;&lt;v
^vv&lt;&lt;&lt;&gt;&lt;&gt;&gt;&gt;&gt;^&lt;&gt;^^^v^
^&lt;^^&lt;^&gt;v&lt;v^&lt;&gt;vv&lt;^v&lt;&gt;
v&lt;&gt;^vv&lt;^&gt;vv&gt;v&gt;&lt;v^&gt;^^
&gt;v&lt;v&gt;&lt;^&gt;&lt;&lt;v&gt;^^&gt;&gt;^&lt;&gt;^
^v&lt;&gt;^&lt;&gt;^&gt;^^^vv^v&gt;&gt;^&lt;
v&gt;v^^&lt;&gt;&gt;&lt;&lt;&lt;^^&gt;&lt;^vvv^
</code></pre>
<p>Let's imagine they all represent arrows, pointing to a cell next to them. For example, <code>v</code> points downward, and <code>&lt;</code> points left. Let's also imagine the grid is infinite - ie. a <code>&gt;</code> arrow at the right-hand side will 'wrap around' and point to the leftmost character on the same row, meaning the board has no limits. Now, we're going to follow the direction of the arrows. Look at the top-left cell. It's a <code>v</code>, so it points down to the cell below it, which is a <code>&gt;</code>. That points to the cell to its right, which is a <code>^</code>. This points up to the cell above it, which is a <code>&lt;</code>. This points to the cell to its left... which is exactly where we started. See how this has formed a 'loop'? You could go round and round and round forever. Remember, the board wraps around, so this grid is also a loop:</p>
<pre><code>&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;
</code></pre>
<p>And so is this, if you follow the arrows:</p>
<pre><code>^^&gt;
&gt;^^
^&gt;^
</code></pre>
<p>This looping structure is called a <strong>cycle</strong>. The discrete mathematicians in this sub should have all collectively just said <em>'aha!'</em>, as they should know already be thinking of how to approach the challenge from that last sentence. If you're not a discrete mathematician, read on. Your challenge today is simply described: given a grid such as the one above, find the <em>largest cycle</em> in it.</p>
<p>One important point: the 'length' of the cycle is just the part of the cycle that repeats. For example, the cycle is <em>not</em> made longer by adding an 'intro' to it:</p>
<pre><code>    &gt;&gt;v
    ^&lt;&lt;
     ^
     ^
     ^
     ^
</code></pre>
<p>The length of this cycle is 6 regardless of where you start from, as that is the length of the 'cycle'.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>You will input 2 numbers first - these are the width and height of the grid you'll be working with. Then you will input a grid in the same format as described above.</p>
<h2>Output Description</h2>
<p>You are to output the length of the longest cycle on the grid, possibly along with some representation of where that cycle is on the board (eg. print the cycle in another color.)</p>
<h1>Sample Inputs and Outputs</h1>
<h2>Sample Input</h2>
<p>This input should test the ability of your program to find longer cycles over shorter cycles, and ignore arrows not in a cycle.</p>
<pre><code>5 5
&gt;&gt;&gt;&gt;v
^v&lt;&lt;v
^vv^v
^&gt;&gt;v&lt;
^&lt;&lt;&lt;^
</code></pre>
<h2>Sample Output</h2>
<p>Longest cycle: <code>16</code><br/>
Position:</p>
<pre><code>&gt;&gt;&gt;&gt;v
^   v
^   v
^  v&lt;
^&lt;&lt;&lt; 
</code></pre>
<h2>Sample Input</h2>
<p>This should test the ability of your program to find cycles that wrap around.</p>
<pre><code>45 20
^^v&gt;&gt;v^&gt;&gt;v&lt;&lt;&lt;v&gt;v&lt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;^vvv^^vvvv&lt;v^^&gt;&lt;^^v&gt;
&gt;&gt;&lt;&lt;&gt;vv&lt;&gt;&lt;&lt;&lt;^&gt;&lt;^&lt;^v^^&lt;vv&gt;&gt;^v&lt;v^vv^^v&lt;&gt;&lt;^&gt;&gt;&lt;v&lt;
vv&lt;^v&lt;v&lt;v&lt;vvv&gt;v&lt;v&lt;vv&lt;^&lt;v&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;^&lt;&gt;&lt;&gt;^&gt;&lt;^v&gt;&gt;&gt;
&lt;v&lt;v^^&lt;v&lt;&gt;v&lt;&gt;v&lt;v&lt;^v^&gt;^&lt;^&lt;&lt;v&gt;^v&gt;&lt;^v^&gt;&gt;^^^&lt;&gt;&lt;^v
^&gt;&gt;&gt;^v^v^&lt;&gt;&gt;vvv&gt;v^^&lt;^&lt;&lt;&lt;&gt;&lt;&gt;v&gt;&gt;^v&lt;^^&lt;&gt;v&gt;&gt;v&lt;v&gt;^
^^^&lt;&lt;^&lt;^&gt;&gt;^v&gt;&gt;&gt;&gt;&gt;&lt;&gt;&gt;^v&lt;^^^&lt;^^v^v&lt;^&lt;v^&gt;&lt;&lt;^&lt;&lt;&lt;&gt;
v&lt;&gt;v^vv^v&lt;&gt;&lt;^&gt;v^vv&gt;^^v^&lt;&gt;v^^^&gt;^&gt;vv&lt;^&lt;&lt;v^&lt;&lt;&gt;^v
&lt;&lt;&lt;&lt;&lt;^&lt;vv&lt;^&gt;&lt;&gt;^^&gt;&gt;&gt;^^^^&lt;^&lt;^v^&gt;&lt;^v^v&gt;^vvv&gt;^v^^
&lt;&lt;v^&lt;v&lt;&lt;^^v&lt;&gt;v&gt;v^&lt;&lt;&lt;&lt;&lt;&gt;^^v&lt;v^&gt;&gt;&gt;v^&gt;&lt;v^v&lt;v^^^&lt;
^^&gt;&gt;^&lt;vv&lt;vv&lt;&gt;v^&lt;^&lt;^^&gt;&lt;&gt;&lt;^vvvv&lt;&lt;v&lt;^&lt;&lt;^&gt;^&gt;vv^&lt;v
^^v^&gt;&gt;^&gt;^&lt;vv^^&lt;&gt;&gt;^^v&gt;v&gt;&gt;v&gt;&gt;v^vv&lt;vv^&gt;&gt;&lt;&gt;&gt;v&lt;&lt;&gt;&gt;
^v&lt;^v&lt;v&gt;^^&lt;&gt;&gt;^&gt;^&gt;^^v&gt;v&lt;&lt;&lt;&lt;&lt;&gt;&gt;&lt;&gt;&lt;^v&lt;^^v&gt;&lt;v&gt;^&lt;&lt;
v&gt;v&lt;&gt;&lt;^v&lt;&lt;^^&lt;^&gt;v&gt;^&gt;&lt;^&gt;&lt;v^&gt;&lt;v^^^&gt;&gt;&lt;^^&lt;^vv^^^&gt;^
v&gt;&lt;&gt;^&gt;&lt;vv^v^^&gt;&gt;&lt;&gt;^&lt;^v&lt;^&gt;&lt;v&gt;^v^&lt;^&lt;&gt;&gt;^&lt;^vv&lt;v&gt;^v
&gt;&lt;^&lt;v&gt;&gt;v&gt;^&lt;&lt;^&gt;^&lt;^^&gt;v^^v&lt;&gt;&gt;v&gt;&lt;&lt;&gt;v&lt;&lt;^&gt;&lt;&lt;&gt;^&gt;^v&lt;v
&gt;vv&gt;^&gt;^v&gt;&lt;^^&lt;v^&gt;^&gt;v&lt;^v&gt;&lt;&gt;vv&gt;v&lt;^&gt;&lt;&lt;&lt;&lt;v^&lt;^vv&lt;&gt;v
&lt;&gt;&lt;&lt;^^&gt;&gt;^&lt;&gt;vv&gt;&lt;^^&lt;vv&lt;&lt;^v^v^&lt;^^^^vv&lt;&lt;&gt;^&lt;vvv^vv
&gt;v&lt;&lt;v^&gt;&lt;v&lt;^^&gt;&lt;^v^&lt;&lt;&lt;&gt;^&lt;&lt;vvvv^^^v&lt;&lt;v&gt;vv&gt;^&gt;&gt;^&lt;&gt;
^^^^&lt;^&lt;&gt;^^vvv&gt;v^&lt;&lt;&gt;&gt;&lt;^&lt;&lt;v&gt;^&lt;&lt;v&gt;&gt;&gt;&lt;&gt;&gt;&gt;&lt;&lt;^^&gt;vv&gt;
&lt;^&lt;^&lt;&gt;vvv^v&gt;&lt;&lt;&lt;vvv&lt;&gt;&gt;&gt;&gt;^&lt;&lt;&lt;^vvv&gt;^&lt;&lt;&lt;^vv&gt;v^&gt;&lt;^
</code></pre>
<h2>Sample Output</h2>
<p>Longest cycle: <code>44</code><br/>
Position:</p>
<pre><code>                    &gt;&gt;&gt;&gt;&gt;^
                    ^&lt;
                     ^
                    &gt;^
                    ^
                   &gt;^
                   ^
                &gt;&gt;&gt;^
                ^
                ^&lt;
                 ^
                 ^
                 ^
                &gt;^
                ^
                ^
                ^  v&lt;&lt;
                ^&lt;&lt;&lt; ^
                     ^&lt;&lt;
                       ^&lt;&lt;
</code></pre>
<h1>Notes</h1>
<p>If you're a discrete mathematician or know of graph theory, you could try treating the grid as a directed graph and use a cycle finding algorithm on it. If not, try and come up with your own algorithm. <a href="http://jsfiddle.net/Quackmatic/s976w08c/2/">I wrote a tool for you to generate random inputs</a>. If you find (or make) a cool loop in an input, post it here!</p>
<h1>Bonus</h1>
<p>Notice how the path length will always be an even number if the arrows do not wrap around? Try to explain why. Food for thought.</p>
</div>
