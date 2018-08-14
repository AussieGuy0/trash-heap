# Flood-Fill
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Easy)</em>: Flood-Fill</h1>
<p>Flood-fill is a tool used in essentially any image editing program that's worth its salt. It allows you to fill in any contigious region of colour with another colour, like flooding a depression in a board with paint. For example, take <a href="http://i.imgur.com/NlCcrKj.png">this beautiful image</a>. If I was to flood-fill the colour orange into <a href="http://i.imgur.com/yCavN08.png">this region of the image</a>, then that region would be <a href="http://i.imgur.com/u6626BA.png">turned completely orange</a>.</p>
<p>Today, you're going to implement an algorithm to perform a flood-fill on a text ASCII-style image.</p>
<h1>Input and Output Description</h1>
<h2>Challenge Input</h2>
<p>You will accept two numbers, <strong>w</strong> and <strong>h</strong>, separated by a space. These are to be the width and height of the image in characters, with the top-left being (0, 0). You will then accept a grid of ASCII characters of size <strong>w</strong>*<strong>h</strong>. Finally you will accept two more numbers, <strong>x</strong> and <strong>y</strong>, and a character <strong>c</strong>. <strong>x</strong> and <strong>y</strong> are the co-ordinates on the image where the flood fill should be done, and <strong>c</strong> is the character that will be filled.</p>
<p>Pixels are defined as contigious (touching) when they share at least one edge (pixels that only touch at corners aren't contigious).</p>
<p>For example:</p>
<pre><code>37 22
.....................................
...#######################...........
...#.....................#...........
...#.....................#...........
...#.....................#...........
...#.....................#...........
...#.....................#...........
...#.....................#######.....
...###.................##......#.....
...#..##.............##........#.....
...#....##.........##..........#.....
...#......##.....##............#.....
...#........#####..............#.....
...#........#..................#.....
...#.......##..................#.....
...#.....##....................#.....
...#...##......................#.....
...#############################.....
.....................................
.....................................
.....................................
.....................................
8 12 @
</code></pre>
<h2>Challenge Output</h2>
<p>Output the image given, after the specified flood-fill has taken place.</p>
<pre><code>.....................................
...#######################...........
...#.....................#...........
...#.....................#...........
...#.....................#...........
...#.....................#...........
...#.....................#...........
...#.....................#######.....
...###.................##......#.....
...#@@##.............##........#.....
...#@@@@##.........##..........#.....
...#@@@@@@##.....##............#.....
...#@@@@@@@@#####..............#.....
...#@@@@@@@@#..................#.....
...#@@@@@@@##..................#.....
...#@@@@@##....................#.....
...#@@@##......................#.....
...#############################.....
.....................................
.....................................
.....................................
.....................................
</code></pre>
<h1>Sample Inputs and Outputs</h1>
<h2>Input</h2>
<pre><code>16 15
----------------
-++++++++++++++-
-+------------+-
-++++++++++++-+-
-+------------+-
-+-++++++++++++-
-+------------+-
-++++++++++++-+-
-+------------+-
-+-++++++++++++-
-+------------+-
-++++++++++++++-
-+------------+-
-++++++++++++++-
----------------
2 2 @
</code></pre>
<h2>Output</h2>
<pre><code>----------------
-++++++++++++++-
-+@@@@@@@@@@@@+-
-++++++++++++@+-
-+@@@@@@@@@@@@+-
-+@++++++++++++-
-+@@@@@@@@@@@@+-
-++++++++++++@+-
-+@@@@@@@@@@@@+-
-+@++++++++++++-
-+@@@@@@@@@@@@+-
-++++++++++++++-
-+------------+-
-++++++++++++++-
----------------
</code></pre>
<h2>Input</h2>
<pre><code>9 9
aaaaaaaaa
aaadefaaa
abcdafgha
abcdafgha
abcdafgha
abcdafgha
aacdafgaa
aaadafaaa
aaaaaaaaa
8 3 ,
</code></pre>
<h2>Output</h2>
<pre><code>,,,,,,,,,
,,,def,,,
,bcd,fgh,
,bcd,fgh,
,bcd,fgh,
,bcd,fgh,
,,cd,fg,,
,,,d,f,,,
,,,,,,,,,
</code></pre>
<h1>Extension (Easy/Intermediate)</h1>
<p>Extend your program so that the image 'wraps' around from the bottom to the top, and from the left to the right (and vice versa). This makes it so that the top and bottom, and left and right edges of the image are touching (like the surface map of a torus).</p>
<h2>Input</h2>
<pre><code>9 9
\/\/\/\.\
/./..././
\.\.\.\.\
/.../.../
\/\/\/\/\
/.../.../
\.\.\.\.\
/./..././
\/\/\/\.\
1 7 #
</code></pre>
<h2>Output</h2>
<pre><code>\/\/\/\#\
/#/###/#/
\#\#\#\#\
/###/###/
\/\/\/\/\
/###/###/
\#\#\#\#\
/#/###/#/
\/\/\/\#\
</code></pre>
<h1>Further Reading</h1>
<p>If you need a starting point with recursion, here are some reading resources.</p>
<ul>
<li><a href="http://www2.its.strath.ac.uk/courses/c/subsection3_9_5.html">Recursive Algorithms</a></li>
<li><a href="http://www.cs.cmu.edu/%7Erwh/introsml/core/recfns.htm">Recursive function calls</a></li>
</ul>
<p>Consider using list-like data structures in your solution, too.</p>
<h1>Addendum</h1>
<p>200! :)</p>
</div>
