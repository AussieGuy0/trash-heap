# A Day in the Life of a Network Router
<div class="md"><h1><a href="#HardIcon"></a> <em>(Hard)</em>: A Day in the Life of a Network Router</h1>
<p>Every time you send or receive data across the internet, it has navigated itself through tens or hundreds of intermediate destinations to finally reach its target. This involves a ton of extremely well optimised algorithms to find the fastest way to get from A to B - and all of this happens without you knowing about it - until now. The network engineers at Notfast© Internet have detected a problem with a central node - it's not letting any packets through! They are hiring some engineers to manually route the packets while they go about fixing the problem.</p>
<p>You are given a <a href="http://en.wikipedia.org/wiki/Distance_matrix">distance Matrix</a> (which we met <a href="http://www.reddit.com/r/dailyprogrammer/comments/20cydp/14042014_challenge_152_hard_minimum_spanning_tree/">back in April</a> - go check out that for a more in depth discussion of graphs) to represent the portion of the network you are dealing with. The pings between nodes on the network will all be different, and it is the job of your algorithm to account for this. Your job and challenge will be to write a program that will find the route through the network from one node to another that has the shortest ping.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>You will be given a number <strong>N</strong> which will represent the number of nodes on the network. N will be between 1 and 26 inclusive - although 1 would be a bit pointless.</p>
<p>You will then be given a distance matrix, with newlines separating rows and commas separating columns. -1 is used to denote that there is no route connecting those two nodes. For the sake of simplicity, the vertices in the graph are assumed to be named A, B, C, D and so on, with the matrix representing them in that order, left-to-right and top-to-bottom, like <a href="http://i.imgur.com/RIfsghM.png">this network</a> and its corresponding <a href="http://i.imgur.com/iXuaqNT.png">distance matrix</a>.</p>
<p>Finally, you will be given 2 vertices (represented as letters A-Z), <strong>V1</strong> and <strong>V2</strong>. You are to find the path from <strong>V1</strong> to <strong>V2</strong>.</p>
<h2>Output Description</h2>
<p>You are to print out the path from <strong>V1</strong> to <strong>V2</strong>, in the format ABCDEFG - one letter after the other.</p>
<h1>Example Inputs and Outputs</h1>
<h2>Example Input</h2>
<p>This represents the same example network given above.</p>
<pre><code>8
-1,11,9,6,-1,-1,-1,-1
11,-1,-1,5,7,-1,-1,-1
9,-1,-1,12,-1,6,-1,-1
6,5,12,-1,4,3,7,-1
-1,7,-1,4,-1,-1,2,-1
-1,-1,6,3,-1,-1,8,10
-1,-1,-1,7,2,8,-1,6
-1,-1,-1,-1,-1,10,6,-1
B H
</code></pre>
<h2>Example Output</h2>
<pre><code>BEGH
</code></pre>
<p>(this represents <a href="http://i.imgur.com/Aajz4zj.png">this path</a> through the network.)</p>
<h1>Challenge</h1>
<h2>Challenge Input</h2>
<p>(this represents a network with 26 nodes.)</p>
<pre><code>26
-1,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,57,18,-1,-1,-1
39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,94,-1,-1,-1,-1,-1,-1,74,86,-1,-1,-1
-1,-1,-1,86,-1,-1,-1,-1,-1,-1,52,-1,51,-1,-1,33,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
-1,-1,86,-1,-1,-1,-1,-1,-1,-1,82,31,-1,-1,-1,-1,-1,51,-1,-1,-1,-1,-1,-1,-1,-1
-1,-1,-1,-1,-1,81,-1,78,20,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
-1,-1,-1,-1,81,-1,-1,48,-1,-1,-1,-1,-1,-1,-1,-1,81,-1,83,-1,-1,-1,-1,-1,-1,-1
-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,18,-1,-1,-1,-1,-1,-1,92,-1,-1,-1,-1,-1
-1,-1,-1,-1,78,48,-1,-1,63,35,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
-1,-1,-1,-1,20,-1,-1,63,-1,95,-1,-1,-1,-1,-1,-1,75,-1,-1,-1,-1,-1,-1,-1,-1,-1
-1,-1,-1,-1,39,-1,-1,35,95,-1,-1,-1,-1,-1,-1,-1,48,-1,-1,-1,-1,-1,-1,-1,-1,-1
-1,-1,52,82,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,64,-1,-1,-1,-1,-1,-1,73,-1
-1,-1,-1,31,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,81,-1,-1,-1,-1,-1,44,97,-1
-1,-1,51,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,28,-1,14,-1,-1,-1,-1,32,-1,-1,-1,-1,-1
-1,-1,-1,-1,-1,-1,18,-1,-1,-1,-1,-1,28,-1,-1,33,-1,-1,-1,-1,59,-1,-1,-1,-1,-1
-1,94,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,74,-1,33,-1,-1,-1,50
-1,-1,33,-1,-1,-1,-1,-1,-1,-1,-1,-1,14,33,-1,-1,50,-1,-1,-1,-1,-1,-1,-1,-1,-1
-1,-1,-1,-1,-1,81,-1,-1,75,48,-1,-1,-1,-1,-1,50,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
-1,-1,-1,51,-1,-1,-1,-1,-1,-1,64,81,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,74,-1,-1
-1,-1,-1,-1,-1,83,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,87,32,-1
-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,74,-1,-1,-1,-1,-1,-1,-1,-1,79,-1,38
-1,-1,-1,-1,-1,-1,92,-1,-1,-1,-1,-1,32,59,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1
57,74,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,33,-1,-1,-1,-1,-1,-1,-1,26,-1,-1,-1
18,86,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,26,-1,-1,-1,62
-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,44,-1,-1,-1,-1,-1,74,87,79,-1,-1,-1,-1,-1,-1
-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,73,97,-1,-1,-1,-1,-1,-1,32,-1,-1,-1,-1,-1,-1,-1
-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,50,-1,-1,-1,-1,38,-1,-1,62,-1,-1,-1
G B
</code></pre>
<h2>Challenge Output</h2>
<pre><code>481
GNPCDLXTZWAB
</code></pre>
<h1>Notes</h1>
<p>The essence of the challenge here is just finding the shortest route from one node to another in a simple undirected graph. There are several algorithms you could use - two of which are <a href="http://en.wikipedia.org/wiki/Dijkstra%27s_algorithm">Edsger Dijkstra's algorithm</a> and the <a href="http://en.wikipedia.org/wiki/A*_search_algorithm">A* algorithm</a>.</p>
</div>
