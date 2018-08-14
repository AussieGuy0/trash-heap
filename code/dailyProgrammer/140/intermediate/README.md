# Graph Radius
<div class="md"><h1><a href="#IntermediateIcon"></a> <em>(Intermediate)</em>: Graph Radius</h1>
<p>In <a href="http://en.wikipedia.org/wiki/Graph_theory">graph theory</a>, a <a href="http://en.wikipedia.org/wiki/Distance_(graph_theory)">graph's radius</a> is the minimum eccentricity of any vertex for a given graph. More simply: it is the minimum distance between all possible pairs of vertices in a graph.</p>
<p>As an example, the <a href="http://en.wikipedia.org/wiki/Petersen_graph">Petersen graph</a> has a radius of 2 because any vertex is connected to any other vertex within 2 edges.</p>
<p>On the other hand, the <a href="http://en.wikipedia.org/wiki/Butterfly_graph">Butterfly graph</a> has a radius of 1 since its middle vertex can connect to any other vertex within 1 edge, which is the smallest eccentricity of all vertices in this set. Any other vertex has an eccentricity of 2.</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>On standard console input you will be given an integer N, followed by an <a href="http://en.wikipedia.org/wiki/Adjacency_matrix">Adjacency matrix</a>. The graph is not directed, so the matrix will always be reflected about the <a href="http://en.wikipedia.org/wiki/Main_diagonal">main diagonal</a>.</p>
<h2>Output Description</h2>
<p>Print the radius of the graph as an integer.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<pre><code>10
0 1 0 0 1 1 0 0 0 0
1 0 1 0 0 0 1 0 0 0
0 1 0 1 0 0 0 1 0 0
0 0 1 0 1 0 0 0 1 0
1 0 0 1 0 0 0 0 0 1
1 0 0 0 0 0 0 1 1 0
0 1 0 0 0 0 0 0 1 1
0 0 1 0 0 1 0 0 0 1
0 0 0 1 0 1 1 0 0 0
0 0 0 0 1 0 1 1 0 0
</code></pre>
<h2>Sample Output</h2>
<pre><code>2
</code></pre>
</div>
