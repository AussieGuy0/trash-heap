# ASCII Gradient Generator
<div class="md"><h1><a href="#IntermediateIcon"></a> <em>(Intermediate)</em>: ASCII Gradient Generator</h1>
<p>A linear colour gradient is where an image transitions through a range of colours, <a href="http://i.imgur.com/IPwnI8X.png">like this</a>. A gradient doesn't need to be directly horizontal or vertical - it can be <a href="http://i.imgur.com/D4trkEk.png">diagonal</a> too, or only be <a href="http://i.imgur.com/8CHx95i.png">longer or shorter</a> than usual. It can also cycle through <a href="http://i.imgur.com/Br3xwXM.png">as many colours as you like</a>. </p>
<p>A radial colour gradient is a similar concept, except the colours move <a href="http://i.imgur.com/C6SE6m3.png">radially outwards like this</a>, rather than linearly across. Radial gradients can also be in <a href="http://i.imgur.com/S19EOu3.png">different positions or with different colours</a>.</p>
<p>To describe a gradient, you need two things - the colours in it, and its location. Describing the location of a radial gradient is easy: for a radial gradient <a href="http://i.imgur.com/dTvfj7f.png">like this</a>, you only need to know the center of the gradient (the red dot), and the radius from the center at which the gradient finishes (<code>r</code>). To locate a linear gradient <a href="http://i.imgur.com/kyZTQnK.png">like this</a>, you need to know two points - the start (red) and end (green) location. The gradient colours run perpendicular to the line joining the start and end points.</p>
<p>Today, we won't be dealing with colours. Instead, we'll be dealing with characters on the screen. You'll accept the parameters of a gradient, and you'll output the displayed gradient.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>You will first accept the size of the output display, as a width and height in characters, like this:</p>
<pre><code>40 30
</code></pre>
<p>This corresponds to a grid 40 across and 30 down, like this:</p>
<pre><code>........................................
........................................
........................................
........................................
........................................
........................................
........................................
........................................
........................................
........................................
........................................
........................................
........................................
........................................
........................................
........................................
........................................
........................................
........................................
........................................
........................................
........................................
........................................
........................................
........................................
........................................
........................................
........................................
........................................
........................................
</code></pre>
<p>The grid follows <strong>screen space</strong>, so the <strong>top-left</strong> corner is position <strong>(0, 0)</strong>.</p>
<p>Next, you will accept the characters that make up the gradient 'colours', from start to finish (or from inside to outside, for a radial gradient), like this: (note the space at the start)</p>
<pre><code> .,:;xX&amp;@
</code></pre>
<p>Any points outside the gradient will have the first/last character, depending on which side of the gradient they're on.</p>
<p>After this, you will accept the parameters of the gradient. This may take one of two forms:</p>
<ul>
<li><p>For a <strong>radial</strong> gradient, the next line will look like this:<br/>
<code>radial x y r</code><br/>
Where <strong>(<code>x</code>, <code>y</code>)</strong> is the center of the gradient, and <strong><code>r</code></strong> is the radius of the gradient, both in pixels.</p></li>
<li><p>For a <strong>linear</strong> gradient, the next line will look like this:<br/>
<code>linear x1 y1 x2 y2</code><br/>
Where <strong>(<code>x1</code>, <code>y1</code>)</strong> is the start point of the gradient, and <strong>(<code>x2</code>, <code>y2</code>)</strong> is the end point of the gradient, both in pixel measure.</p></li>
</ul>
<h2>Output Description</h2>
<p>You are to display the given gradient on a grid with the given size, like this:</p>
<pre><code>@@@@@@@@@@@&amp;&amp;&amp;&amp;&amp;XXXXXXXXX&amp;&amp;&amp;&amp;&amp;@@@@@@@@@@
@@@@@@@@@@&amp;&amp;&amp;&amp;XXXXXXXXXXXXX&amp;&amp;&amp;&amp;@@@@@@@@@
@@@@@@@@&amp;&amp;&amp;&amp;XXXXXXxxxxxXXXXXX&amp;&amp;&amp;&amp;@@@@@@@
@@@@@@@&amp;&amp;&amp;&amp;XXXXxxxxxxxxxxxXXXX&amp;&amp;&amp;&amp;@@@@@@
@@@@@@@&amp;&amp;&amp;XXXxxxxxx;;;xxxxxxXXX&amp;&amp;&amp;@@@@@@
@@@@@@&amp;&amp;&amp;XXXxxxx;;;;;;;;;xxxxXXX&amp;&amp;&amp;@@@@@
@@@@@&amp;&amp;&amp;XXXxxx;;;;;;;;;;;;;xxxXXX&amp;&amp;&amp;@@@@
@@@@@&amp;&amp;XXXxxx;;;;:::::::;;;;xxxXXX&amp;&amp;@@@@
@@@@&amp;&amp;&amp;XXxxx;;;:::::::::::;;;xxxXX&amp;&amp;&amp;@@@
@@@@&amp;&amp;XXXxx;;;::::,,,,,::::;;;xxXXX&amp;&amp;@@@
@@@&amp;&amp;&amp;XXxxx;;:::,,,,,,,,,:::;;xxxXX&amp;&amp;&amp;@@
@@@&amp;&amp;XXXxx;;;::,,,,...,,,,::;;;xxXXX&amp;&amp;@@
@@@&amp;&amp;XXXxx;;:::,,.......,,:::;;xxXXX&amp;&amp;@@
@@@&amp;&amp;XXxxx;;::,,,... ...,,,::;;xxxXX&amp;&amp;@@
@@@&amp;&amp;XXxx;;;::,,...   ...,,::;;;xxXX&amp;&amp;@@
@@@&amp;&amp;XXxx;;;::,,..     ..,,::;;;xxXX&amp;&amp;@@
@@@&amp;&amp;XXxx;;;::,,...   ...,,::;;;xxXX&amp;&amp;@@
@@@&amp;&amp;XXxxx;;::,,,... ...,,,::;;xxxXX&amp;&amp;@@
@@@&amp;&amp;XXXxx;;:::,,.......,,:::;;xxXXX&amp;&amp;@@
@@@&amp;&amp;XXXxx;;;::,,,,...,,,,::;;;xxXXX&amp;&amp;@@
@@@&amp;&amp;&amp;XXxxx;;:::,,,,,,,,,:::;;xxxXX&amp;&amp;&amp;@@
@@@@&amp;&amp;XXXxx;;;::::,,,,,::::;;;xxXXX&amp;&amp;@@@
@@@@&amp;&amp;&amp;XXxxx;;;:::::::::::;;;xxxXX&amp;&amp;&amp;@@@
@@@@@&amp;&amp;XXXxxx;;;;:::::::;;;;xxxXXX&amp;&amp;@@@@
@@@@@&amp;&amp;&amp;XXXxxx;;;;;;;;;;;;;xxxXXX&amp;&amp;&amp;@@@@
@@@@@@&amp;&amp;&amp;XXXxxxx;;;;;;;;;xxxxXXX&amp;&amp;&amp;@@@@@
@@@@@@@&amp;&amp;&amp;XXXxxxxxx;;;xxxxxxXXX&amp;&amp;&amp;@@@@@@
@@@@@@@&amp;&amp;&amp;&amp;XXXXxxxxxxxxxxxXXXX&amp;&amp;&amp;&amp;@@@@@@
@@@@@@@@&amp;&amp;&amp;&amp;XXXXXXxxxxxXXXXXX&amp;&amp;&amp;&amp;@@@@@@@
@@@@@@@@@@&amp;&amp;&amp;&amp;XXXXXXXXXXXXX&amp;&amp;&amp;&amp;@@@@@@@@@
</code></pre>
<h1>Sample Inputs and Outputs</h1>
<h2>Gradient 1</h2>
<h3>Input</h3>
<pre><code>40 30
 .,:;xX&amp;@
radial 20 15 20
</code></pre>
<h3>Output</h3>
<p>(shown above, in <strong>Output Description</strong>)</p>
<h2>Gradient 2</h2>
<p>Notice how the colours appear in the reverse order, as the end point is to the <em>left</em> of the start point.</p>
<h3>Input</h3>
<pre><code>60 30
 '"^+$
linear 30 30 0 0
</code></pre>
<h3>Output</h3>
<pre><code>$$$$$$$$$$$++++++++++^^^^^^^^^^""""""""""'''''''''
$$$$$$$$$$++++++++++^^^^^^^^^^""""""""""'''''''''
$$$$$$$$$++++++++++^^^^^^^^^^""""""""""'''''''''
$$$$$$$$++++++++++^^^^^^^^^^""""""""""'''''''''
$$$$$$$++++++++++^^^^^^^^^^""""""""""'''''''''
$$$$$$++++++++++^^^^^^^^^^""""""""""'''''''''
$$$$$++++++++++^^^^^^^^^^""""""""""'''''''''
$$$$++++++++++^^^^^^^^^^""""""""""'''''''''
$$$++++++++++^^^^^^^^^^""""""""""'''''''''
$$++++++++++^^^^^^^^^^""""""""""'''''''''
$++++++++++^^^^^^^^^^""""""""""'''''''''
++++++++++^^^^^^^^^^""""""""""'''''''''
+++++++++^^^^^^^^^^""""""""""'''''''''
++++++++^^^^^^^^^^""""""""""'''''''''
+++++++^^^^^^^^^^""""""""""'''''''''
++++++^^^^^^^^^^""""""""""'''''''''
+++++^^^^^^^^^^""""""""""'''''''''
++++^^^^^^^^^^""""""""""'''''''''
+++^^^^^^^^^^""""""""""'''''''''
++^^^^^^^^^^""""""""""'''''''''
+^^^^^^^^^^""""""""""'''''''''
^^^^^^^^^^""""""""""'''''''''
^^^^^^^^^""""""""""'''''''''
^^^^^^^^""""""""""'''''''''
^^^^^^^""""""""""'''''''''
^^^^^^""""""""""'''''''''
^^^^^""""""""""'''''''''
^^^^""""""""""'''''''''
^^^""""""""""'''''''''
^^""""""""""'''''''''
</code></pre>
<h2>Gradient 3</h2>
<p>The gradient start/end/centre points don't have to be inside the grid!</p>
<h3>Input</h3>
<pre><code>40 40
aaabcccdeeefggg
radial -10 20 60
</code></pre>
<h3>Output</h3>
<pre><code>ccccccccccdddddeeeeeeeeeeeeeeeffffgggggg
cccccccccccdddddeeeeeeeeeeeeeefffffggggg
ccccccccccccdddddeeeeeeeeeeeeeeffffggggg
cccccccccccccdddddeeeeeeeeeeeeeffffggggg
cccccccccccccdddddeeeeeeeeeeeeefffffgggg
ccccccccccccccdddddeeeeeeeeeeeeeffffgggg
cccccccccccccccddddeeeeeeeeeeeeeffffgggg
cccccccccccccccdddddeeeeeeeeeeeeeffffggg
bcccccccccccccccddddeeeeeeeeeeeeeffffggg
bbccccccccccccccdddddeeeeeeeeeeeeffffggg
bbbccccccccccccccddddeeeeeeeeeeeeffffggg
bbbbcccccccccccccddddeeeeeeeeeeeeeffffgg
bbbbcccccccccccccddddeeeeeeeeeeeeeffffgg
bbbbbcccccccccccccddddeeeeeeeeeeeeffffgg
abbbbcccccccccccccddddeeeeeeeeeeeeffffgg
abbbbbccccccccccccddddeeeeeeeeeeeeffffgg
aabbbbccccccccccccddddeeeeeeeeeeeeffffgg
aabbbbccccccccccccddddeeeeeeeeeeeeffffgg
aabbbbccccccccccccddddeeeeeeeeeeeeffffgg
aabbbbccccccccccccddddeeeeeeeeeeeeffffgg
aabbbbccccccccccccddddeeeeeeeeeeeeffffgg
aabbbbccccccccccccddddeeeeeeeeeeeeffffgg
aabbbbccccccccccccddddeeeeeeeeeeeeffffgg
aabbbbccccccccccccddddeeeeeeeeeeeeffffgg
aabbbbccccccccccccddddeeeeeeeeeeeeffffgg
abbbbbccccccccccccddddeeeeeeeeeeeeffffgg
abbbbcccccccccccccddddeeeeeeeeeeeeffffgg
bbbbbcccccccccccccddddeeeeeeeeeeeeffffgg
bbbbcccccccccccccddddeeeeeeeeeeeeeffffgg
bbbbcccccccccccccddddeeeeeeeeeeeeeffffgg
bbbccccccccccccccddddeeeeeeeeeeeeffffggg
bbccccccccccccccdddddeeeeeeeeeeeeffffggg
bcccccccccccccccddddeeeeeeeeeeeeeffffggg
cccccccccccccccdddddeeeeeeeeeeeeeffffggg
cccccccccccccccddddeeeeeeeeeeeeeffffgggg
ccccccccccccccdddddeeeeeeeeeeeeeffffgggg
cccccccccccccdddddeeeeeeeeeeeeefffffgggg
cccccccccccccdddddeeeeeeeeeeeeeffffggggg
ccccccccccccdddddeeeeeeeeeeeeeeffffggggg
cccccccccccdddddeeeeeeeeeeeeeefffffggggg
</code></pre>
<h1>Notes</h1>
<p>Got any cool challenge ideas? Submit them to <a href="/r/DailyProgrammer_Ideas">/r/DailyProgrammer_Ideas</a>!</p>
</div>
