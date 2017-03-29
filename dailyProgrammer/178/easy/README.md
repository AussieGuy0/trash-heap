# Transformers: Matrices in Disguise, pt. 1
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Easy)</em>: Transformers: Matrices in Disguise, pt. 1</h1>
<p>Or, rather, transform<em>ation</em>s. Today we'll be doing a bit of basic geometry. We'll be writing a program which will take a point in 2-dimensional space, represented as <code>(X, Y)</code> (where X and Y can be decimal and negative), transform them a number of times in different ways and then find the final position of the point.</p>
<p>Your program must be able to do the following:</p>
<ul>
<li><p>Translations - ie. offsetting the X and Y co-ordinates by a given amount <a href="http://i.imgur.com/3jI4sGI.png">http://i.imgur.com/3jI4sGI.png</a></p></li>
<li><p>Rotations by an arbitrary angle around a given point <a href="http://i.imgur.com/9c0ji7c.png">http://i.imgur.com/9c0ji7c.png</a></p></li>
<li><p>Scale relative to a point <a href="http://i.imgur.com/vHUfXv2.png">http://i.imgur.com/vHUfXv2.png</a></p></li>
<li><p>Reflection over the X or Y axis <a href="http://i.imgur.com/X6JH6pT.png">http://i.imgur.com/X6JH6pT.png</a></p></li>
</ul>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input</h2>
<p>You will take an starting point <code>(X, Y)</code>, such as:</p>
<pre><code>(3, 4)
</code></pre>
<p>On new lines, you will then take commands in the format:</p>
<pre><code>translate(A, B)     - translate by (A, B)
rotate(A, B, C)     - rotate around (A, B) by angle C (in radians) clockwise
scale(A, B, C)      - scale relative to (A, B) with scale-factor C
reflect(axis)       - reflect over the given axis
finish()            - end input and print the modified location
</code></pre>
<p>Where <code>axis</code> is one of <code>X</code> or <code>Y</code>.</p>
<h2>Output</h2>
<p>Print the final value of <code>(X, Y)</code> in the format:</p>
<pre><code>(2.5, -0.666666)
</code></pre>
<h1>Test Case</h1>
<h2>Test Case Input</h2>
<pre><code>(0, 5)
translate(3, 2)
scale(1,3,0.5)
rotate(3,2,1.57079632679)
reflect(X) 
translate(2,-1)
scale(0,0,-0.25)
rotate(1,-3,3.14159265359)
reflect(Y)
</code></pre>
<h2>Test Case Output</h2>
<pre><code>(-4, -7)
</code></pre>
<h1>Notes</h1>
<p>I want to say two things. First, this may be a good opportunity to learn your language's 2-D drawing capabilities - every time a command is given, represent it on an image like I have done with the examples, so you can see the path the co-ordinate has taken. Secondly, this is a multi-part challenge. I'm not sure how many parts there will be, however it may be a good idea to prepare for more possible commands (or, if you're crazy enough to use Prolog - you know who you are - write an EBNF parser like last time, lol.) If you know how, it would be clever to start using matrices for transformations now rather than later.</p>
</div>
