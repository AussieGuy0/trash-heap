# Adjacency Matrix Generator
<div class="md"><h1><a href="#HardIcon"></a> <em>(Hard)</em>: Adjacency Matrix Generator</h1>
<p>We've often talked about adjacency matrices in challenges before. Usually, the adjacency matrix is the input to a challenge. This time, however, we're going to be taking a visual representation of a graph as input, and turning it into the adjacency matrix. Here's the rules for the input diagrams:</p>
<ul>
<li>Vertices are represented by lower-case letters A to Z. (There will be no more than 26 vertices in an input.) Vertices will be connected by no more than one edge.</li>
<li>All edges on the diagram are perfectly straight, are at least one character long, and will go either horizontally, vertically, or diagonally at 45 degrees.</li>
<li><p>All edges must connect directly to two vertices at either end.</p>
<pre><code>a------------b  f
                |     g
    c           |    /
     \          e   /
      \            /
       \          /
        \        h
         d
</code></pre></li>
</ul>
<p>These are all valid vertices..</p>
<pre><code>a-----
      -----b



      cd
</code></pre>
<p>But these aren't. A and B aren't connected, and neither are C and D.</p>
<p>If a line on the graph needs to bend, then spare vertices can be added. There are represented with a <code>#</code> and don't appear on the output, but otherwise behave like vertices:</p>
<pre><code>   s
    \
     \
      \
       \
        #-----------t
</code></pre>
<p>This above diagram represents just one edge between <code>s</code> and <code>t</code>. <strong>A spare vertex will always be connected to exactly two edges</strong>.</p>
<ul>
<li><p>Finally, edges may cross over other edges. One will go on top of the other, like this:</p>
<pre><code>         a
        /|
       / |
d---------------e
 \   /   |
  \ /    |
   c     |
         |
         b
</code></pre></li>
</ul>
<p>An edge will never cross under/over a vertex as that would cause ambiguity. However, an edge may cross under or over multiple other edges successively, like so:</p>
<pre><code>    e
b   |
 \  |g
  \ ||
    \|
s---|\----t
    ||\
    || \
    f|  \
     |   c
     h
</code></pre>
<p>This is also valid - <code>a</code> and <code>b</code> are connected:</p>
<pre><code>    z  y  x  w
  a-|\-|\-|\-|-b
    | \| \| \| 
    v  u  t  s
</code></pre>
<p>However, this is not valid:</p>
<pre><code>    zy
 a  ||
  \ ||
   #||--b
    ||
    ||
    xw
</code></pre>
<p>As there is no edge coming out of the right side of the <code>#</code>.</p>
<p>Your challenge today is to take a diagram such as the above ones and turn it into an adjacency matrix.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Specification</h2>
<p>You'll be given a number <strong>N</strong> - this is the number of lines in the diagram. Next, accept <strong>N</strong> lines of a diagram such as the ones above, like:</p>
<pre><code>7
a-----b
|\   / \
| \ /   \
|  /     e
| / \   /
|/   \ /
c-----d
</code></pre>
<h2>Output Description</h2>
<p>Output the corresponding adjacency matrix. The rows and columns should be ordered in alphabetical order, like this:</p>
<pre><code>01110
10101
11010
10101
01010
</code></pre>
<p>So the leftmost column and topmost row correspond to the vertex A.</p>
<h1>Sample Inputs and Outputs</h1>
<h2>Example 1</h2>
<h3>Input</h3>
<pre><code>5
a
|\
| \
|  \
b---c
</code></pre>
<h3>Output</h3>
<pre><code>011
101
110
</code></pre>
<h2>Example 2</h2>
<h3>Input</h3>
<pre><code>7
a  b--c
|    /
|   /
d  e--f
 \    |
  \   |
g--h--#
</code></pre>
<h3>Output</h3>
<pre><code>00010000
00100000
01001000
10000001
00100100
00001001
00000001
00010110
</code></pre>
<h2>Example 3</h2>
<h3>Input</h3>
<pre><code>5
a   #   #   #   #   #   #   b
 \ / \ / \ / \ / \ / \ / \ / \
  /   /   /   /   /   /   /   #
 / \ / \ / \ / \ / \ / \ / \ /
c   #   #   #   #   #   #   d
</code></pre>
<h3>Output</h3>
<pre><code>0001
0011
0100
1100
</code></pre>
<h2>Example 4</h2>
<h3>Input</h3>
<pre><code>5
    ab-#
# e-|\-|-#
|\ \# c# |
| #-#\| \|
#-----d  #
</code></pre>
<h3>Output</h3>
<pre><code>00110
00001
10010
10101
01010
</code></pre>
<h2>Sample 5</h2>
<h3>Input</h3>
<pre><code>9
   #--#
   | /        #
   |a--------/-\-#
  #--\-c----d   /
   \  \|     \ / \
   |\  b      #   #
   | #  \        /
   |/    #------#
   #
</code></pre>
<h3>Output</h3>
<pre><code>0111
1011
1101
1110
</code></pre>
<h1>Finally</h1>
<p>Got any cool challenge ideas? Submit them to <a href="/r/DailyProgrammer_Ideas">/r/DailyProgrammer_Ideas</a>!</p>
</div>
