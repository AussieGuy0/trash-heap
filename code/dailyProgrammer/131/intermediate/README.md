# Simple Ray-Casting
<div class="md"><h1><a href="#IntermediateIcon"></a> <em>(Intermediate)</em>: Simple Ray-Casting</h1>
<p><a href="http://en.wikipedia.org/wiki/Ray_casting">Ray Casting</a> is a method of <a href="http://en.wikipedia.org/wiki/Rendering_(computer_graphics)">rendering 3D computer graphics</a>, popular in the early/mid 90's. Famous games like <a href="http://en.wikipedia.org/wiki/Wolfenstein_3D">Wolfenstein</a> and <a href="http://en.wikipedia.org/wiki/Doom_(video_game)">Doom</a> are great examples of ray-casting based graphics. Real-time computer graphics today are based on hardware-accelerated polygon <a href="http://en.wikipedia.org/wiki/Rasterisation">rasterization</a>, while film-quality computer graphics are based on <a href="http://en.wikipedia.org/wiki/Ray_tracing_(graphics)">ray-tracing</a> (a more advanced and finer-detailed ray-casting derivative).</p>
<p>Your goal is to implement a single ray-cast query within a 2D world: you will be given the ray's origin and direction, as well as a top-down view of a tile-based world, and must return the position of the first wall you hit. The world will be made of a grid of tiles that are either occupied (as defined by the 'X' character), or empty (as defined by the space ' ' character). <strong><a href="http://imgur.com/a/pUOKb">Check out these graphics as a visualization of example 1; it should help clarify the input data</a>.</strong> Real ray-casting applications do many of these wall-collision hits, generally one per column of pixels you want to render, but today you only have to solve for a single ray!</p>
<p><em>Original author: <a href="/u/nint22">/u/nint22</a></em></p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>On standard console input you will be given two integers, N and M. N is the number of columns, while M is the number of rows. This will be followed by M rows of N-characters, which are either 'x' or ' ' (space), where 'x' is a wall that you can collide with or ' ' which is empty space. After this world-definition data, you will be given three space-delimited floating-point values: X, Y, and R. X and Y are world positions, following <a href="http://imgur.com/a/pUOKb">this coordinate system description</a>, with R being a radian-value degree representing your ray direction (using the unit-circle definition where if R is zero, it points to the right, with positive R growth rotation counter-clockwise). R is essentially how much you rotate the ray from the default position of X+ in a counter-clockwise manner.</p>
<h2>Output Description</h2>
<p>Simply print the collision coordinate with three-digit precision.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<p><em>Note that this input is rendered and explained in more detail <a href="http://imgur.com/a/pUOKb">here</a>.</em></p>
<pre><code>10 10
xxxxxxxxxx
x  x x   x
x  x x   x
x    x xxx
xxxx     x
x  x     x
x        x
x  x     x
x  x    xx
xxxxxxxxxx
6.5 6.5 1.571
</code></pre>
<h2>Sample Output</h2>
<pre><code>6.500 1.000
</code></pre>
</div>
