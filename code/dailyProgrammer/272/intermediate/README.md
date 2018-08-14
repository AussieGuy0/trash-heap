# Dither that image
<div class="md"><h1>Description</h1>
<p><a href="https://en.wikipedia.org/wiki/Dither">Dithering</a> is the intentional use of
noise to reduce the error of compression. If you start with a color image
and want to reduce it to two colors (black and white) the naive approach is
to threshold the image. However, the results are usually terrible.</p>
<ul>
<li><a href="http://i.imgur.com/kjWn2Q1.png">Color Solids</a></li>
<li><a href="http://i.imgur.com/RDOMCfg.png">Thresholded Solids</a></li>
</ul>
<p>One of the most popular dithering algorithms is
<a href="https://en.wikipedia.org/wiki/Floyd%E2%80%93Steinberg_dithering">Floyd-Steinberg</a>.
When a pixel is thresholded, the error (difference) between the original value
and the converted value is carried forward into nearby pixels.</p>
<ul>
<li><a href="http://i.imgur.com/w9DFOKS.png">Floyd-Steinberg Solids</a></li>
</ul>
<p>There are other approaches, such as
<a href="https://en.wikipedia.org/wiki/Ordered_dithering">Ordered Dithering</a> with a
Bayer Matrix.</p>
<ul>
<li><a href="http://i.imgur.com/mLKUyfn.png">Bayer solids</a></li>
</ul>
<h1>Input</h1>
<p>Your program will take a color or grayscale image as its input. You may choose
your input method appropriate to your language of choice. If you want to do it
yourself, I suggest picking a <a href="https://en.wikipedia.org/wiki/Netpbm">Netpbm</a>
format, which is easy to read.</p>
<h1>Output</h1>
<p>Output a two-color (e.g. Black and White) dithered image in your choice of
format. Again, I suggest picking a Netpbm format, which is easy to write.</p>
<h1>Notes</h1>
<ul>
<li><a href="http://www.tannerhelland.com/4660/dithering-eleven-algorithms-source-code/">Here</a>
is a good resource for dithering algorithms.</li>
</ul>
<h1>Finally</h1>
<p>Have a good challenge idea?
Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
<p>Thanks to <a href="/u/skeeto">/u/skeeto</a> for this <a href="https://www.reddit.com/r/dailyprogrammer_ideas/comments/4nt7rp">challenge idea</a></p>
</div>
