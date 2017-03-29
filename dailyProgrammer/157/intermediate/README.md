# Puzzle Cube Simulator
<div class="md"><h1><a href="#IntermediateIcon"></a> <em>(Intermediate)</em>: Puzzle Cube Simulator</h1>
<p>You may be aware of puzzles such as the <a href="http://img1.wikia.nocookie.net/__cb20130909182419/maditsmadfunny/images/e/ee/Rubik%27s_Cube_cropped.jpg">Rubik's Cube</a>. They work by having pieces with coloured faces which can rotate around the centers. You may also be aware of higher-order puzzles such as the <a href="http://upload.wikimedia.org/wikipedia/commons/f/fe/Professors_cube.jpg">Professor's Cube</a>. These work in exactly the same way, with the exception of having more pieces. For the purposes of this challenge, an <strong>n</strong>-cube is a puzzle with <strong>n</strong> pieces along an edge - the Rubik's cube would be a 3-cube, and the Professor's cube a 5-cube.</p>
<p>To make it easier to see exactly what people are doing, there is a standard set of what is called <em>Move Notation</em>, which tells you exactly how the puzzle was turned. For the purpose of this challenge, the <a href="https://www.worldcubeassociation.org/regulations/#article-12-notation">notation defined in Article 12 of the WCA regulations</a> will be used. In a nutshell:</p>
<ul>
<li>There are 6 faces. U (up, the top face). D (down, the bottom face). L (left). R (right). F (front). B (back).</li>
<li>Each face is turned like you were looking at it from the front.</li>
<li>A notation such as <code>X</code> means you turn the X face clockwise 90'. So <code>R L</code> means turn the right face clockwise 90' (from its perspective), then the left face clockwise 90' (from its perspective).</li>
<li>A notation such as <code>X'</code> (pronounced <em>prime</em>) means you turn the X face anticlockwise 90'. So <code>R U'</code> means turn the right face clockwise 90', then the top face anticlockwise 90'.</li>
<li>A notation such as <code>X2</code> means you turn the X face 180'.</li>
</ul>
<p>This lets you signify a sequence of moves, such as <code>R U R' U'  R' F  R2 U' R' U  R U R' F'</code> - which lets you know exactly what happened to the puzzle.</p>
<p>Your challenge is, given a <strong>3</strong>-cube (the standard cube) and a sequence of moves, to simulate the turning of a puzzle and print the output state at the end. (you don't have to solve it - phew!)</p>
<p>Assume a standard colour scheme. That is, start with white on the bottom (D), yellow on the top (U), red on the front (F), green on the right (R), orange on the back (B) and blue on the left (L).</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>You will be given, on one line (and separated by spaces), a sequence of moves in WCA standard notation. This will be arbitrarily long, within sensible limits.</p>
<h2>Output Description</h2>
<p>You must print out the front face <em>only</em> of a cube that has been turned in the way described by the input (as if you were looking at it from the front of the cube.) Each colour will be represented by its first letter (r, o, y, g, b, w) and the face shall be represented as a printed square.<br/>
For example:</p>
<pre><code>rrb
rrw
oww
</code></pre>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<pre><code>U2 R' D2 R F L' U2 R
</code></pre>
<h2>Sample Output</h2>
<pre><code> rrb
 rrw
 oww
</code></pre>
<h1>Challenge</h1>
<h2>Challenge Input</h2>
<pre><code>R U2 F2 D' F' U L' D2 U2 B' L R2 U2 D
</code></pre>
<h2>Challenge Output</h2>
<pre><code>bbo
yrb
oow
</code></pre>
<h1>Hint</h1>
<p>Multidimensional arrays will be useful here. Try to visualise the way pieces are moved around when you turn a face.</p>
</div>
