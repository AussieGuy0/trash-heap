# Edge Matching Tile Puzzle
<div class="md"><h1>Credit:</h1>
<p>Thanks to <a href="/u/skeeto">/u/skeeto</a> for this challenge. As posted on our <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> subreddit.</p>
<h1>Description:</h1>
<p>There's a tile puzzle game you might find at your local game store. There are 9 tiles to be arranged in a 3x3 grid. Each of a tile's contains half of some image, to be met up with the appropriate half on another tile. The images are usually animals (cats, beetles). There are 4 kinds of images in total. For example, here's a picture of completed puzzle.</p>
<ul>
<li>(<a href="http://i.imgur.com/NbLum43.jpg">http://i.imgur.com/NbLum43.jpg</a>)</li>
</ul>
<p>Your task is to write a program that finds solutions to a given set of tiles.</p>
<h1>Formal Input Description:</h1>
<p>On standard input you'll be given a number, n, indicating the size of the side of the puzzle. For example, for a 3x3 puzzle n = 3. What will follow are n * n lines of 4 letters indicating the edges of each tile. The order of the edges is north, east, south, west (clockwise). Your program should be able to handle up to n = 5.
Instead of images, we'll use the 4 colors Cyan, Magenta, Yellow, and Black (CMYK). The two "halves" are uppercase and lower case. For two tiles to legally touch, an uppercase letter can only touch its lowercase matchin letter on an adjacent tile and vice versa.
For the sake of communication, <a href="http://i.imgur.com/pnVvQ8L.jpg"> the tiles will be labeled A-Z</a> in the order that they were input. So on a 3x3 puzzle, the tiles are A-I.</p>
<h1>Formal Output Description:</h1>
<p>This is where you can get creative. The simplest output could just list the tiles, left to right, top to bottom, and their orientations (N, E, S, W). Or if you're feeling ambitious, output an image showing the completed tile arrangement. For a 3x3 puzzle, there are over 95 billion possible such arrangements (9! * 4<sup>9),</sup> though all but a handful of them will be illegal.</p>
<p>You may output just one solution or all solutions. Keep symmetry in mind.</p>
<h1>Sample Input 1</h1>
<pre><code>3
CYMk
CmKm
cKyM
cYkY
CMky
ckyM
CYMK
CMKy
CkmY
</code></pre>
<p>This corresponds to these tiles:</p>
<ul>
<li>(<a href="http://i.imgur.com/eok9gTt.png">http://i.imgur.com/eok9gTt.png</a>)</li>
</ul>
<p>With these graphics, half circles must be matched up with half squares of the same color. The solution should look like those <a href="http://i.imgur.com/etCrWXi.jpg">cannon bullet things from Super Mario.</a></p>
<h1>Sample Input 2</h1>
<pre><code>3
ycKC
kKcY
cKMc
mYmk
CCYk
mMyC
MyYk
mKMy
YCMk
</code></pre>
<h1>Sample Output 1</h1>
<p>Simplest output showing one solution:</p>
<pre><code>AN CW GE BW FE DS HE IS EN
</code></pre>
<p>A more graphical output (same solution):</p>
<pre><code>+---------+
| C  M  Y |
|kAYyCcCGM|
| M  K  K |
| m  k  k |
|KBCcFyYDY|
| m  M  c |
| M  m  C |
|CHKkIYyEM|
| y  C  k |
+---------+
</code></pre>
<p>Or drawing the solution:</p>
<ul>
<li>(<a href="http://i.imgur.com/GJh2eOI.png">http://i.imgur.com/GJh2eOI.png</a>)</li>
</ul>
<h1>Challenge Input #1:</h1>
<pre><code>4
mcYC
MmCk
yYcm
yMYC
Ykcy
kkkm
KKcy
KMYK
YMkk
ymKc
MyMK
CmmY
kMMY
yCCM
yccc
kcck
</code></pre>
<p>Graphical version (if this helps):</p>
<ul>
<li>(<a href="http://i.imgur.com/mpO8HGJ.png">http://i.imgur.com/mpO8HGJ.png</a>)</li>
</ul>
<h1>Challenge Input #2:</h1>
<pre><code>5
cKCk
yYcc
YcCK
kKCM
CMKc
cKYC
kYcm
KYyY
Mccm
yKcm
mykK
MMCm
ckYC
ycmm
MmKM
kymc
KMMK
KcyM
kYck
YCKM
myYm
kYyY
CMKM
yYCM
YKyk
</code></pre>
<p>Graphical version:</p>
<ul>
<li>(<a href="http://i.imgur.com/Msa9F6G.png">http://i.imgur.com/Msa9F6G.png</a>)</li>
</ul>
</div>
