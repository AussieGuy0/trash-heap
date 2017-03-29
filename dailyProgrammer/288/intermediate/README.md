# Stars and Stripes and Vertices
<div class="md"><h1>Description</h1>
<p>This challenge is about drawing stars.</p>
<p>Specifically, each point should be equally spaced to the ones beside it, and should be connected to the two opposite points with a line.</p>
<p>Not the direct opposite though, like when you have an even number of points.</p>
<p>For example, take a look at <a href="http://i.imgur.com/8A872Al.png">this image.</a> In the first star, the pentagram with an odd amount of points, it's clear what "connected to the two opposite points" means.</p>
<p>In the hexagram it's not just as clear. That's why the image shows that exactly opposite points should not be connected.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input</h2>
<p>You will be given the amount of vertices, or points in the specific star.</p>
<h2>Output</h2>
<p>The output should be any type of image with the star rendered onto it.</p>
<h2>Challenge input</h2>
<pre><code>8
7
20
</code></pre>
<h2>Bonus challenge</h2>
<p>Surround the star by a polygon with the same amount of vertices. For example, if the input is 5, the output should be a pentagram (5-pointed star) surrounded by a pentagon.</p>
<h2>Tips</h2>
<p>If you want to find a point's coordinates from only a distance and angle, here's how to do that:</p>
<pre><code>x = d cos a
y = d sin a
</code></pre>
<p>Remember that many languages measure in radians! To convert from degrees to radians, multiply by pi/180. If you want to find the relationship to pi, just divide by 180.</p>
<p>For example, 360/180 is 2, so 360° is 2pi rad.</p>
<p>Also, <a href="http://www.wolframalpha.com">wolfram alpha</a> is really useful for simplifying math expressions quickly.</p>
<h1>Credit</h1>
<p>This challenge was suggested by <a href="/u/tulanir">/u/tulanir</a>, thank you. If you have a challenge idea, please share it in <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and there's a good chance we'll use it. </p>
</div>
