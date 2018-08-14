# Museum Cameras
<div class="md"><h1>Description</h1>
<p>You run a museum, and you have a small budget - but you have to protect the museum with cameras. Given some descriptions of rooms, can you organize the smallest number of cameras to view the whole room?</p>
<p>Some assumptions and other factors for you to work with:</p>
<ul>
<li>Cameras can't see around corners. </li>
<li>You can only place cameras in corners.</li>
<li>Assume every camera has a field of view of 180 degrees, yielding a semicircular field of view. </li>
<li>Assume every camera's field of view will be equal to the left and right of the line in the corner where the camera is placed; this line bisects the angle of the corner. The camera points away from the corner.</li>
<li>Assume every camera has an otherwise infinite view.</li>
</ul>
<h1>Input Description</h1>
<p>You'll be given a row with a single number <em>N</em> that tells you how many points to read. Then on the next line you'll be given <em>N</em> points in a Cartesian coordinate space to draw the bounding box of the museum room. For example:</p>
<pre><code>3
(0,0) (3,6) (6,0)
</code></pre>
<p>This translates to (pardon my ugly ASCII art) this triangle:</p>
<pre><code>       .                                       .
                                              / \
                            =&gt;               /   \
                                            /     \
                                           /       \
                                          /         \
.             .                          .___________.
</code></pre>
<h1>Output Description</h1>
<p>Your program should emit the position of the cameras needed to cover the area. From our example:</p>
<pre><code>(0,0)
</code></pre>
<p>That's one possible solution (for this one any of the corners would have worked). </p>
<p>If the shape has no solution, emit something like "The architect has no concept of security" because maybe they're collaborating with art theives. </p>
<h1>Challenge Input</h1>
<p>first room</p>
<pre><code>4 
(0,0) (5,0) (5,6) (0,6)
</code></pre>
<p>second room</p>
<pre><code>5
(0,0) (7,0) (7,3) (5,6) (0,6)
</code></pre>
<p>third room</p>
<pre><code>13
(0,5) (2,8) (5,7) (9,6) (10,9) (13,10) (13,6) (17,6) (16,3) (13,1) (7,1) (5,3) (2,3)
</code></pre>
<h1>Notes</h1>
<p>This is a classic computational geometry problem called the <a href="https://en.wikipedia.org/wiki/Art_gallery_problem">Art Gallery Problem</a>. For some ideas on calculating 2d visibility from a top down map, <a href="http://www.redblobgames.com/articles/visibility/">click here</a> </p>
</div>
