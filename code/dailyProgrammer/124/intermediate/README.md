# Circular Graphs
<div class="md"><h1><a href="#IntermediateIcon"></a> <em>(Intermediate)</em>: Circular Graphs</h1>
<p>A classic problem in computer science &amp; <a href="http://en.wikipedia.org/wiki/Graph_theory">graph-theory</a> is to detect if there are any <a href="http://en.wikipedia.org/wiki/Cycle_(graph_theory)">circular paths</a> in a given directed graph (sometimes called a cycle). Your goal is to write a program that takes in a series of edges, which defines a graph, and then print all sets of cycles onto a console or text file.</p>
<p>For the sake of clarity, we define a cycle as a set of vertices that have at least one incoming edge and one outgoing edge, where each node is only directly connected to at most two other nodes within the list.</p>
<p><em>Author: nint22</em></p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>You will first be given an integer N, which represents the number of edges that will be given on each following new-line. Edges are defined as two integer numbers, where the direction of the edge always goes from the left vertex to the right vertex.</p>
<h2>Output Description</h2>
<p>Simply print all vertices in a directed cycle; make sure that the cycle is closed (see sample output).</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<pre><code>4
1 2
2 3
3 1
3 4
</code></pre>
<h2>Sample Output</h2>
<pre><code>1 2 3 1
</code></pre>
<h1>Note</h1>
<p>As usual with these kind of problems, the challenge isn't in writing a solution, but writing a <em>fast</em>-solution. If you post a solution, please discuss the big-O notation of your search function. Good luck, and have fun programming!</p>
</div>
