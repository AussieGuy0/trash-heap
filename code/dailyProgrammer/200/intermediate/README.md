# Metro Tile Meltdown
<div class="md"><h1><a href="#IntermediateIcon"></a> <em>(Intermediate)</em>: Metro Tile Meltdown</h1>
<p>In the continued name of backward-compatibility, Microsoft has released a version of their flagship operating system for VGA text-mode terminals. In this version of their operating system, rectangular tiles consisting of a single character are displayed on the screen, like so:</p>
<pre><code>..........................................................................
.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
................................bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
.ddddddddddddddddd.cccccccccccc.bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
.ddddddddddddddddd.cccccccccccc.bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
.ddddddddddddddddd.cccccccccccc.bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
...................cccccccccccc.bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
.eeeeeeeeee.ffffff.cccccccccccc.bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
.eeeeeeeeee.ffffff.cccccccccccc.bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
.eeeeeeeeee.ffffff.cccccccccccc.bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
.eeeeeeeeee.ffffff.cccccccccccc.............................jjjjjjjjjjjjj.
.eeeeeeeeee.ffffff.cccccccccccc.hhhhhhhhhhhhhhhhhhhhhhhhhhh.jjjjjjjjjjjjj.
.eeeeeeeeee.ffffff.cccccccccccc.hhhhhhhhhhhhhhhhhhhhhhhhhhh.jjjjjjjjjjjjj.
.eeeeeeeeee.ffffff.cccccccccccc.hhhhhhhhhhhhhhhhhhhhhhhhhhh.jjjjjjjjjjjjj.
.eeeeeeeeee...............................................................
.eeeeeeeeee.gggggggggggggggggggggggggggggggggggggg.iiiiiiiiiiiiiiiiiiiiii.
.eeeeeeeeee.gggggggggggggggggggggggggggggggggggggg.iiiiiiiiiiiiiiiiiiiiii.
.eeeeeeeeee.gggggggggggggggggggggggggggggggggggggg.iiiiiiiiiiiiiiiiiiiiii.
.eeeeeeeeee.gggggggggggggggggggggggggggggggggggggg.iiiiiiiiiiiiiiiiiiiiii.
.eeeeeeeeee.gggggggggggggggggggggggggggggggggggggg.iiiiiiiiiiiiiiiiiiiiii.
.eeeeeeeeee.gggggggggggggggggggggggggggggggggggggg.iiiiiiiiiiiiiiiiiiiiii.
.eeeeeeeeee.gggggggggggggggggggggggggggggggggggggg.iiiiiiiiiiiiiiiiiiiiii.
..........................................................................
</code></pre>
<p>Screen space with no tile is denoted by a period (<code>.</code>). Tiles can be made of any character other than periods (due to the reason given) and spaces.</p>
<p>However, the dev team forgot to add support for screen-readers! Now visually impaired users cannot determine the location of the tiles on their display. Your task is, given a tile display such as the one above, write a program to find the location and size of each rectangular tile on the screen, along with the character in it, and output it in a way that can be read by a screen reader. For example, one such tile in the above example is located at position <code>(1, 1)</code> on the screen (from the top-left), consists of the character <code>a</code> and is 30 characters wide and 8 characters tall.</p>
<h2>Tiles</h2>
<p>A tile will always be perfectly rectangular:</p>
<pre><code>aaaaaaaaaa
aaaaaaaaaa
aaaaaaaaaa
</code></pre>
<p>There will never be a non-rectangular tile on the screen, or one that is not completely filled in. These are not single tiles:</p>
<pre><code>..................................
.bbbbbbbbbb.........ccccccccccccc.
.bbbbbbbbb..........c...........c.
.bbbbbbbb...........c...........c.
.bbbbbbb............ccccccccccccc.
..................................
</code></pre>
<p>A tile is something completely bordered by empty space (<code>.</code>), so this is two separate tiles:</p>
<pre><code>.....................................
.aaaaaaaaaaaaaaaaaaa.aaaaaaaaaaaaaaa.
.aaaaaaaaaaaaaaaaaaa.aaaaaaaaaaaaaaa.
.aaaaaaaaaaaaaaaaaaa.aaaaaaaaaaaaaaa.
.aaaaaaaaaaaaaaaaaaa.aaaaaaaaaaaaaaa.
.....................................
</code></pre>
<p>Lastly, if a tile is made of two regions of separate colours, then the input as invalid:</p>
<pre><code>.....................................
.aaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbb.
.aaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbb.
.aaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbb.
.aaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbb.
.....................................
</code></pre>
<p>The above 'tile' is two separate tiles: one made of <code>a</code>, one made of <code>b</code>.</p>
<p>Handling of invalid input is undefined and thus mostly up to you; your program can try and make sense of the input if you want, but for the purpose of the challenge, assume all tiles will be rectangular, separated by empty space (<code>.</code>) and consisting of a single character.</p>
<h1>Input and Output Description</h1>
<h2>Sample Input</h2>
<p>You will first be given two numbers, like so:</p>
<pre><code>74 30
</code></pre>
<p>These denote the width and height of the tile display in characters. You will then be given the tile display of that size via standard input, for example:</p>
<pre><code>..........................................................................
.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.bbbbbbbb.ddddddddddddddddddddd.
.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.bbbbbbbb.ddddddddddddddddddddd.
.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.bbbbbbbb.ddddddddddddddddddddd.
.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.bbbbbbbb.ddddddddddddddddddddd.
.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.bbbbbbbb.ddddddddddddddddddddd.
.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.bbbbbbbb.ddddddddddddddddddddd.
...........................................bbbbbbbb.ddddddddddddddddddddd.
.jjjjjjjjjjjjjjjjjjjjjjjjj.eeeeeeeeeeeeeee.bbbbbbbb.ddddddddddddddddddddd.
.jjjjjjjjjjjjjjjjjjjjjjjjj.eeeeeeeeeeeeeee.bbbbbbbb.ddddddddddddddddddddd.
.jjjjjjjjjjjjjjjjjjjjjjjjj.eeeeeeeeeeeeeee.bbbbbbbb.ddddddddddddddddddddd.
.jjjjjjjjjjjjjjjjjjjjjjjjj.eeeeeeeeeeeeeee.bbbbbbbb.ddddddddddddddddddddd.
.jjjjjjjjjjjjjjjjjjjjjjjjj.eeeeeeeeeeeeeee.bbbbbbbb.......................
.jjjjjjjjjjjjjjjjjjjjjjjjj.eeeeeeeeeeeeeee.bbbbbbbb.ccccccccccccccccccccc.
.jjjjjjjjjjjjjjjjjjjjjjjjj.eeeeeeeeeeeeeee.bbbbbbbb.ccccccccccccccccccccc.
...........................eeeeeeeeeeeeeee.bbbbbbbb.ccccccccccccccccccccc.
.iiiiiiiiii.kkkkkkkkkkkkkk.eeeeeeeeeeeeeee.bbbbbbbb.ccccccccccccccccccccc.
.iiiiiiiiii.kkkkkkkkkkkkkk.eeeeeeeeeeeeeee................................
.iiiiiiiiii.kkkkkkkkkkkkkk.eeeeeeeeeeeeeee.fffffffffffffff.gggggggggggggg.
.iiiiiiiiii.kkkkkkkkkkkkkk.eeeeeeeeeeeeeee.fffffffffffffff.gggggggggggggg.
.iiiiiiiiii.kkkkkkkkkkkkkk.eeeeeeeeeeeeeee.fffffffffffffff.gggggggggggggg.
.iiiiiiiiii.kkkkkkkkkkkkkk.eeeeeeeeeeeeeee.fffffffffffffff.gggggggggggggg.
.iiiiiiiiii................................fffffffffffffff.gggggggggggggg.
.iiiiiiiiii.hhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.fffffffffffffff.gggggggggggggg.
.iiiiiiiiii.hhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.fffffffffffffff.gggggggggggggg.
.iiiiiiiiii.hhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.fffffffffffffff.gggggggggggggg.
.iiiiiiiiii.hhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.fffffffffffffff.gggggggggggggg.
.iiiiiiiiii.hhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.fffffffffffffff.gggggggggggggg.
.iiiiiiiiii.hhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.fffffffffffffff.gggggggggggggg.
..........................................................................
</code></pre>
<h2>Sample Output</h2>
<p>You are to print the location (with <code>(0, 0)</code> being the top-left), width, height and filled character of each tile on the screen, like this:</p>
<pre><code>41×6 tile of character 'a' located at (1,1)
8×16 tile of character 'b' located at (43,1)
21×4 tile of character 'c' located at (52,13)
21×11 tile of character 'd' located at (52,1)
15×14 tile of character 'e' located at (27,8)
15×11 tile of character 'f' located at (43,18)
14×11 tile of character 'g' located at (59,18)
30×6 tile of character 'h' located at (12,23)
10×13 tile of character 'i' located at (1,16)
25×7 tile of character 'j' located at (1,8)
14×6 tile of character 'k' located at (12,16)
</code></pre>
<h1>Sample Inputs and Outputs</h1>
<h2>Input</h2>
<pre><code>4 4
xx.z
xx..
..yy
z.yy
</code></pre>
<h2>Output</h2>
<pre><code>2×2 tile of character 'x' located at (0,0)
1×1 tile of character 'z' located at (0,3)
2×2 tile of character 'y' located at (2,2)
1×1 tile of character 'z' located at (3,0)
</code></pre>
<h2>Input</h2>
<pre><code>10 10
..........
.@@@@@.ss.
.@@@@@.ss.
.......ss.
.\\\\\.ss.
.\\\\\....
.\\\\\.\\.
.......\\.
./////.\\.
..........
</code></pre>
<h2>Output</h2>
<pre><code>5×2 tile of character '@' located at (1,1)
5×3 tile of character '\' located at (1,4)
5×1 tile of character '/' located at (1,8)
2×4 tile of character 's' located at (7,1)
2×3 tile of character '\' located at (7,6)
</code></pre>
<h2>Input</h2>
<pre><code>74 30
..........................................................................
.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
................................bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
.ddddddddddddddddd.cccccccccccc.bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
.ddddddddddddddddd.cccccccccccc.bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
.ddddddddddddddddd.cccccccccccc.bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
...................cccccccccccc.bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
.eeeeeeeeee.ffffff.cccccccccccc.bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
.eeeeeeeeee.ffffff.cccccccccccc.bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
.eeeeeeeeee.ffffff.cccccccccccc.bbbbbbbbbb.kkkkkkkkkkkkkkkk.jjjjjjjjjjjjj.
.eeeeeeeeee.ffffff.cccccccccccc.............................jjjjjjjjjjjjj.
.eeeeeeeeee.ffffff.cccccccccccc.hhhhhhhhhhhhhhhhhhhhhhhhhhh.jjjjjjjjjjjjj.
.eeeeeeeeee.ffffff.cccccccccccc.hhhhhhhhhhhhhhhhhhhhhhhhhhh.jjjjjjjjjjjjj.
.eeeeeeeeee.ffffff.cccccccccccc.hhhhhhhhhhhhhhhhhhhhhhhhhhh.jjjjjjjjjjjjj.
.eeeeeeeeee...............................................................
.eeeeeeeeee.gggggggggggggggggggggggggggggggggggggg.iiiiiiiiiiiiiiiiiiiiii.
.eeeeeeeeee.gggggggggggggggggggggggggggggggggggggg.iiiiiiiiiiiiiiiiiiiiii.
.eeeeeeeeee.gggggggggggggggggggggggggggggggggggggg.iiiiiiiiiiiiiiiiiiiiii.
.eeeeeeeeee.gggggggggggggggggggggggggggggggggggggg.iiiiiiiiiiiiiiiiiiiiii.
.eeeeeeeeee.gggggggggggggggggggggggggggggggggggggg.iiiiiiiiiiiiiiiiiiiiii.
.eeeeeeeeee.gggggggggggggggggggggggggggggggggggggg.iiiiiiiiiiiiiiiiiiiiii.
.eeeeeeeeee.gggggggggggggggggggggggggggggggggggggg.iiiiiiiiiiiiiiiiiiiiii.
..........................................................................
</code></pre>
<h2>Output</h2>
<pre><code>30×8 tile of character 'a' located at (1,1)
17×3 tile of character 'd' located at (1,10)
10×15 tile of character 'e' located at (1,14)
6×7 tile of character 'f' located at (12,14)
38×7 tile of character 'g' located at (12,22)
12×11 tile of character 'c' located at (19,10)
10×16 tile of character 'b' located at (32,1)
27×3 tile of character 'h' located at (32,18)
16×16 tile of character 'k' located at (43,1)
22×7 tile of character 'i' located at (51,22)
13×20 tile of character 'j' located at (60,1)
</code></pre>
<h1>Finally...</h1>
<p>Got a good idea for a challenge? Head on over to <a href="/r/DailyProgrammer_Ideas">/r/DailyProgrammer_Ideas</a>, write it out, and we might post it on this subreddit!</p>
<p>We're currently recruiting some moderators to join our team. If you're interested, read the sticky by clicking <a href="http://www.reddit.com/r/dailyprogrammer/comments/2uji4v/psa_were_hiring/">here</a>.</p>
</div>
