# Minimum Spanning Tree
<div class="md"><h1><a href="#HardIcon"></a> <em>(Hard)</em>: Minimum Spanning Tree</h1>
<p>First, a bit of back story. In graph theory, a graph is a set of points called <em>vertices</em>, joined up by lines or <em>edges</em>. Those edges can have a number called <em>weight</em> associated with them, which would represent distance, cost, or whatever you like. It's an abstract idea and is usually used for modeling real-world situations such as a neighborhood, a network of computers or a set of steps. A <strong>spanning tree</strong> is a subgraph (a graph deriving from another one) that connects <em>all</em> of the vertices of the parent graph.<br/>
This means several things:</p>
<ul>
<li>A spanning tree must contain every vertex of G - but not necessarily every edge.<br/></li>
<li>Because it's a tree, it must not have any loops or cycles - that is, it must have no closed shapes within it.<br/></li>
<li>You must only use edges from the original graph to form the spanning tree.</li>
<li>The tree must be <em>connected</em>. This means all the edges must be joined in some way. This is illustrated with an example below.</li>
</ul>
<p>Here are some examples to illustrate this concept. Take this <a href="http://i.imgur.com/RIfsghM.png">graph G</a>.<br/>
Here is <a href="http://i.imgur.com/yf8K1AK.png">one possible spanning tree</a>. Note there may be (and probably will be) more than one valid spanning tree for a given graph. Here are some examples of invalid spanning trees, for several reasons:</p>
<ul>
<li><a href="http://i.imgur.com/6CVjxpF.png">This one leaves out vertices C and E.</a></li>
<li><a href="http://i.imgur.com/cibmve1.png">This one contains a cycle so it's not a tree.</a></li>
<li><a href="http://i.imgur.com/eanfUzf.png">This one is not fully connected - there is no path from B to F via this spanning tree.</a></li>
<li><a href="http://i.imgur.com/WMSDZf8.png">This one uses an edge that is not in the original graph.</a></li>
</ul>
<p>Because representing graphs visually like this makes it complicated to do computations with them, you can represent graphs as a matrix instead, such as <a href="http://i.imgur.com/iXuaqNT.png">this one</a>. This is called a distance matrix because it shows you the distances between any two vertices - like those distance charts you find at the back of diaries. (These are <em>very</em> similar to adjacency matrices, except they show the weight of the connecting edges rather than just its existence.) Note how it is symmetric along the diagonal. A dash (-) means there is no edge connecting those two vertices.</p>
<p>Your challenge is, given any (non-directional) graph in matrix form as shown above, to find the <strong>minimum spanning tree</strong>. This is the spanning tree with the smallest possible sum distance of its edges. There may be more than one minimum spanning tree for any given tree. For example a minimum spanning tree for Graph G shown above is <a href="http://i.imgur.com/RrXzZZY.png">here</a>.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>On the console, you will be given a number V. This will be between 1 and 26 inclusive, and represents the number of vertices in the graph.<br/>
You will then be given a distance matrix, with newlines separating rows and commas separating columns. <strong>-1</strong> is used to denote that there is no edge connecting those two vertices. For the sake of simplicity, the vertices in the graph are assumed to be named A, B, C, D and so on, with the matrix representing them in that order, left-to-right and top-to-bottom (like in the distance matrix example shown previously.)</p>
<h2>Output Description</h2>
<p>You must print out the total weight of the MST, and then the edges of the minimum spanning tree represented by the two vertices such as DF, AE. They do not need to be in any particular order.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<pre><code>8
-1,11,9,6,-1,-1,-1,-1
11,-1,-1,5,7,-1,-1,-1
9,-1,-1,12,-1,6,-1,-1
6,5,12,-1,4,3,7,-1
-1,7,-1,4,-1,-1,2,-1
-1,-1,6,3,-1,-1,8,10
-1,-1,-1,7,2,8,-1,6
-1,-1,-1,-1,-1,10,6,-1
</code></pre>
<h2>Sample Output</h2>
<pre><code>32
AD,DF,DE,EG,DB,GH,FC
</code></pre>
<h1>Challenge</h1>
<h2>Challenge Input</h2>
<p>(this input represents <a href="http://i.imgur.com/ef5kdbx.png">this graph</a>)</p>
<pre><code>10
-1,29,-1,-1,18,39,-1,-1,-1,-1
29,-1,37,-1,-1,20,-1,-1,-1,-1
-1,37,-1,28,-1,43,47,-1,-1,-1
-1,-1,28,-1,-1,-1,35,-1,-1,-1
18,-1,-1,-1,-1,31,-1,36,-1,-1
39,20,43,-1,31,-1,34,-1,33,-1
-1,-1,47,35,-1,34,-1,-1,-1,22
-1,-1,-1,-1,36,-1,-1,-1,14,-1
-1,-1,-1,-1,-1,33,-1,14,-1,23
-1,-1,-1,-1,-1,-1,22,-1,23,-1
</code></pre>
<h1>Notes</h1>
<p>There are algorithms to find the MST for a given graph, such as the <a href="http://en.wikipedia.org/wiki/Reverse-Delete_algorithm">reverse-delete algorithm</a> or <a href="http://en.wikipedia.org/wiki/Kruskal%27s_algorithm">Kruskal's method</a>. The submitted solution does not have to work with directed graphs - the edges will always be bidirectional and thus the matrix will always be symmetrical.</p>
</div>
