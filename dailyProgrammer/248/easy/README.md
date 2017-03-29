# Draw Me Like One Of Your Bitmaps
<div class="md"><p>Let's build a basic paint program! Your task for today will be to create a basic paint program that can draw points, lines, and filled rectangles, then output an image file that many image viewers can read. But first, some background:</p>
<h1>Netpbm Formats</h1>
<p>PNG, GIF, JPEG, and even BMP are all image formats that are way too complex for an [Easy] challenge. Instead, we are going to be using <a href="https://en.wikipedia.org/wiki/Netpbm_format">Netpbm formats</a>. More specifically, we will be using the PPM format, which supports 24-bit RGB color. Here's how a <code>.ppm</code> file looks (courtesy of Wikipedia):</p>
<pre><code>P3
# The P3 means colors are in ASCII, then 3 columns and 2 rows,
# then 255 for max color, then RGB triplets
3 2
255
255   0   0     0 255   0     0   0 255
255 255   0   255 255 255     0   0   0
</code></pre>
<p>Each pixel in the image is represented with 3 integers (0-255) for its Red, Green, and Blue pixel values. The above <code>.ppm</code> file gets displayed as <a href="https://upload.wikimedia.org/wikipedia/commons/5/57/Tiny6pixel.png">this</a> (zoomed in). </p>
<p>Everything is separated by whitespace, but what the whitespace is (and how much of it there is) doesn't matter. Comments (anything after a <code>#</code>) are also ignored. In other words, the following PPM file renders exactly the same image:</p>
<pre><code>P3 3 2 255 255 0 0 0 255 0 0 0 255 255 255 0 255 255 255 0 0 0
</code></pre>
<p>Lastly, note that in image processing, pixels are indexed using <code>(row, column)</code> coordinates, counting up from <code>(0, 0)</code>. Thus, in the image above, the pixel at <code>(0, 2)</code> is on row 0, column 2, which has the RGB value of <code>0 0 255</code>, or in other words, is blue.</p>
<p>Now that that's out of the way, let's get to painting!</p>
<h1>Formal Input</h1>
<p>Your input file will contain an X/Y size for an image to create, followed by a series of commands, each on its own line. The commands each start with <code>point</code>, <code>line</code>, or <code>rect</code>, followed by a RGB color, followed by whatever arguments the command needs. Here's a sample:</p>
<pre><code>5 3
point 0 0 255 0 0
line 100 100 100 0 2 2 4
rect 77 0 0 1 3 2 2
</code></pre>
<p>Breaking the file down line by line:</p>
<ul>
<li><code>5 3</code>: The output image is 5 columns wide and 3 rows tall</li>
<li><code>point</code>: we're drawing a single point... <code>0 0 255</code>: with this RGB color (blue)... <code>0 0</code>: at this coordinate (top left)</li>
<li><code>line</code>: we're drawing a line... <code>100 100 100</code>: with this RGB color (grey)... <code>0 2</code>: from this coordinate... <code>2 4</code> to this coordinate (for oblique lines, make a "best effort" to approximate the line; no need to do any antialiasing or other fancy stuff)</li>
<li><code>rect</code>: we're drawing a rectangle... <code>77 0 0</code>: with this RGB color (dark red)... <code>1 3</code>: with its top left coordinate here... <code>2 2</code> with its sides being 2 pixels tall and 2 pixels wide</li>
</ul>
<p>The "unpainted" background can be assumed to be black (<code>0 0 0</code>).</p>
<h1>Formal Output</h1>
<p>The output PPM file for the above example should look like this (more or less, spacing notwithstanding):</p>
<pre><code>P3
5 3
255
0   0   255    0   0   0      100 100 100    0   0   0      0   0   0  
0   0   0      0   0   0      0   0   0      77  0   0      77  0   0  
0   0   0      0   0   0      0   0   0      77  0   0      77  0   0  
</code></pre>
<p>And it should render like <a href="https://i.imgur.com/EaGSFdZ.png">this</a> (zoomed in).</p>
<h1>Challenge Input</h1>
<pre><code>400 300
rect 0 0 255 0 0 300 400
line 255 255 255 0 0 299 399
line 255 255 255 299 0 0 399
rect 200 200 0 100 150 100 100
point 0 0 0 150 200
</code></pre>
<h1>Challenge Output</h1>
<p>Actual output: <a href="https://raw.githubusercontent.com/fsufitch/dailyprogrammer/master/248_easy/sample2_tight.ppm">https://raw.githubusercontent.com/fsufitch/dailyprogrammer/master/248_easy/sample2_tight.ppm</a></p>
<p>Converted to PNG and posted to Imgur: <a href="https://i.imgur.com/nRmSoUf.png">https://i.imgur.com/nRmSoUf.png</a></p>
<h1>Big Challenge</h1>
<p>Run these commands: <a href="https://raw.githubusercontent.com/fsufitch/dailyprogrammer/master/248_easy/sierpinsky.txt">https://raw.githubusercontent.com/fsufitch/dailyprogrammer/master/248_easy/sierpinsky.txt</a></p>
<p>You should get something like this: <a href="https://i.imgur.com/5F31DSE.png">https://i.imgur.com/5F31DSE.png</a></p>
<h1>Bonus Points</h1>
<p>If you would like more of a challenge, implement the following commands:</p>
<ul>
<li><code>bline &lt;R&gt; &lt;G&gt; &lt;B&gt; &lt;row1&gt; &lt;col1&gt; &lt;row2&gt; &lt;col2&gt;</code> draw a line using <a href="https://en.wikipedia.org/wiki/Bresenham%27s_line_algorithm">Bresenham's line algorithm</a></li>
<li><code>circle &lt;R&gt; &lt;G&gt; &lt;B&gt; &lt;centerRow&gt; &lt;centerCol&gt; &lt;radius&gt;</code></li>
<li><code>ellipse &lt;R&gt; &lt;G&gt; &lt;B&gt; &lt;centerRow&gt; &lt;centerCol&gt; &lt;radiusVertical&gt; &lt;radiusHorizontal&gt;</code></li>
<li><code>fill &lt;R&gt; &lt;G&gt; &lt;B&gt; &lt;row&gt; &lt;col&gt;</code> (flood fill one color starting at the given point)</li>
<li><code>smartfill &lt;R&gt; &lt;G&gt; &lt;B&gt; &lt;row&gt; &lt;col&gt; &lt;tolerance&gt;</code> (flood fill similar colors starting at the given point, filling pixels as long as the gradient distance (<code>sqrt( (r2-r1)^2 + (g2-g1)^2 + (b2-b1)^2)</code>) is less than the tolerance.</li>
</ul>
<h1>Resources</h1>
<ul>
<li>Online PPM format converter: <a href="https://convertio.co/ppm-png/">https://convertio.co/ppm-png/</a></li>
<li>For local command line conversion: <a href="https://www.imagemagick.org/">https://www.imagemagick.org/</a></li>
<li>For local GUI editing/conversion: <a href="https://www.gimp.org/">https://www.gimp.org/</a></li>
</ul>
<hr/>
<p><strong>Have any cool ideas for challenges?</strong> Come post them over in <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a>!</p>
<p><strong>Got feedback?</strong> We (the mods) would like to know how we're doing! Are the problems too easy? Too hard? Just right? Boring/exciting? Varied/same? Anything you would like to see us do that we're not doing? Anything we're doing that we should just stop? Come by this <a href="https://redd.it/3zgexx">feedback thread</a> and let us know!</p>
</div>
