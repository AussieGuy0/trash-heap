# Edge Sorting
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Easy)</em>: Edge Sorting</h1>
<p>In <a href="http://en.wikipedia.org/wiki/Graph_theory">graph theory</a>, an "edge" is defined as the connection between two vertices. For example, if we look at the <a href="http://en.wikipedia.org/wiki/File:6n-graf.svg">sample graph</a> on the Wikipedia article, we would define the relationship between vertex 4 and 6 as having an edge, but vertices 5 and 3 have no edge (though they are connected, through {5,4,3} or {5,2,3,} and a few others)</p>
<p>Your goal is to sort a given list of edges in the correct connection-order: to make your job even easier, given edges will always form one big long line (so basically a very simplified graph, <a href="http://i.imgur.com/KXc00a2.png">like this</a> ). Lower index integers should be on the left / top of the sorted list, while larger index integers should be on the right / bottom of the sorted list. All edges are assigned a unique letter to help keep track of ordering.</p>
<p><em>Author: nint22</em></p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>On standard input, you will first be given an integer, which is the number of edges you will then be given. Each given edge is defined by a letter and two integers: the letter will always be unique and represents the edge. The integers are the actual edge's vertices, and thus may be duplicate (if a vertex is shared between two edges).</p>
<h2>Output Description</h2>
<p>Simply list the sorted edges from the left-most ordered edge to the right-most ordered edge.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<p>The following data is a simple example, with valid output following the next section:</p>
<pre><code>4
A 3 4
B 4 5
C 1 2
D 2 3
</code></pre>
<h2>Sample Output</h2>
<pre><code>C D A B
</code></pre>
<h1>Challenge Input</h1>
<p>This is an example of a randomized input:</p>
<pre><code>6
F 2 3
B 1 2
D 6 5
C 6 7
E 5 4
A 3 4
</code></pre>
<h2>Challenge Input Solution</h2>
<p>None required.</p>
<h1>Note</h1>
<p>None</p>
</div>
