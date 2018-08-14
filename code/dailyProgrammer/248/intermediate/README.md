# A Measure of Edginess
<div class="md"><p>Want to write a program that actually understands images it sees? </p>
<p>One of the mainstays of the computer vision toolkit is <em><a href="https://en.wikipedia.org/wiki/Edge_detection">edge
detection</a></em> -- a series
of different approaches to find places where color/brightness in an
image changes abruptly. It is a process that takes a regular image as
input, and returns an image that highlights locations at which "edges"
exist. </p>
<p>On Monday we <a href="https://www.reddit.com/r/dailyprogrammer/comments/3zfajl/20160104_challenge_248_easy_draw_me_like_one_of/">took a
look</a>
at how the Netpbm image format works, and built a very simple drawing
program using PPM images.  Let's use the same format (as it is very
simple to read/write without any special libraries) to handle this
challenge.</p>
<h1>Formal Input</h1>
<p>The input to your program is an image in PPM format. Because edge
detection requires images that are larger than can be comfortably
typed or copy/pasted, you may want to input this from a file.</p>
<p><strong>Sample input:</strong> <a href="https://github.com/fsufitch/dailyprogrammer/raw/master/ideas/edgedetect/valve_original.png">PNG
version</a>,
<a href="https://github.com/fsufitch/dailyprogrammer/raw/master/ideas/edgedetect/valve_original.ppm">PPM (P3, RGB color)
version</a>
(3.1 MB). Image courtesy of
<a href="https://en.wikipedia.org/wiki/Sobel_operator#/media/File:Valve_original_(1).PNG">Wikipedia</a>.</p>
<h1>Formal Output</h1>
<p>The output must be a <del>black and white</del> <em>grayscale</em> (edited for clarification) image of the same size as the
input. Edges from the input image must be highlighted in white.</p>
<p>This is not a strict "right or wrong answer" challenge. There are many
ways to do edge detection, and they each may yield a different
result. As such, expect outputs to vary. In general though, try to aim
for crisp (thin) edges, with little noise from non-edges.</p>
<p><strong>Sample output:</strong>
<a href="https://raw.githubusercontent.com/fsufitch/dailyprogrammer/master/ideas/edgedetect/valve_sobel.png">Converted to PNG</a>. This
is the sample output that Wikipedia gives for the application of a
Sobel filter -- one of the most basic forms of edge detection.</p>
<h1>Challenge Inputs</h1>
<ul>
<li>Taters:
<a href="https://github.com/fsufitch/dailyprogrammer/raw/master/ideas/edgedetect/potatoes.jpg">JPG</a>,
<a href="https://github.com/fsufitch/dailyprogrammer/raw/master/ideas/edgedetect/potatoes.ppm">PPM</a></li>
<li>Utah teapot:
<a href="https://github.com/fsufitch/dailyprogrammer/raw/master/ideas/edgedetect/utah_teapot.jpg">JPG</a>,
<a href="https://github.com/fsufitch/dailyprogrammer/raw/master/ideas/edgedetect/utah_teapot.ppm">PPM</a></li>
<li>Advice dog:
<a href="https://github.com/fsufitch/dailyprogrammer/raw/master/ideas/edgedetect/advice_dog.jpg">JPG</a>,
<a href="https://github.com/fsufitch/dailyprogrammer/raw/master/ideas/edgedetect/advice_dog.ppm">PPM</a></li>
</ul>
<h1>Hints / guidance</h1>
<p><em>If you prefer to figure it out / research it yourself, do not read
this section</em>.</p>
<p>While the Wikipedia article on edge detection has plenty of details
about how to approach it, it is a bit overwhelming for the purpose of
a daily challenge. As such, here's a quick overview of how one of the
simpler edge detection approaches, the <strong>Sobel operator</strong>:</p>
<p>The Sobel operator focuses on finding edges based on the
"brightness" of the image, requiring each pixel in the image to have a
"brightness" value. In other words, it requires a grayscale, not color
image. The first step, then, is to convert the input (RGB color) image to
grayscale -- perhaps by averaging the red, green, and blue values.</p>
<p>Next, we can actually apply the Sobel transformation. That involves
iterating through each pixel and figuring out how "edgy" it is. This
is done by looking at the pixels around it. Suppose our current pixel
is <code>X</code> in the table below, while its surrounding pixels are <code>a</code> to <code>h</code>.</p>
<pre><code>a b c
d X e
f g h
</code></pre>
<p>Since at this point each of these values are integers, we can just do
some simple arithmetic to figure out how much this selection of 9
pixels is changing horizontally. We'll just subtract the rightmost
three pixels from the leftmost ones (and give the central ones, <code>d</code>
and <code>e</code> a bit more weight since they're closer and more relevant to
how edgy <code>X</code> is).</p>
<pre><code>Edge_horizontal = E_h = (c + 2*e + h) - (a + 2*d + f)
</code></pre>
<p>Similarly, we can calculate the edginess in a vertical direction.</p>
<pre><code>Edge_vertical = E_v = (f + 2*g + h) - (a + 2*b + c)
</code></pre>
<p>If we imagine these horizontal and vertical edges as the sides of a
right triangle, we can calculate the overall edginess (and thus, the
value of <code>X</code>) by using the Pythagorean theorem.</p>
<pre><code>X = sqrt((E_h * E_h) + (E_v * E_v))
</code></pre>
<p>That's it. When we apply this calculation for every pixel in the
image, the outcome will be something like the problem's sample
output. We can then print out the PPM image using the same value for
red, green, and blue, giving us the grayscale output we want.</p>
<h1>Finally...</h1>
<p><strong>Have any cool ideas for challenges?</strong> Come post them over in
  <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a>! </p>
<p><strong>Got feedback?</strong> We (the mods) would like to know how we're doing!
  Are the problems too easy? Too hard? Just right? Boring/exciting?
  Varied/same? Anything you would like to see us do that we're not
  doing? Anything we're doing that we should just stop? Come by this
  <a href="https://redd.it/3zgexx">feedback thread</a> and let us know! </p>
</div>
