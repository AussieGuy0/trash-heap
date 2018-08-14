# Trippy Julia fractals
<div class="md"><h1>Description</h1>
<p>You’re making a music video for an acid rock band. Far out man! Of course they want visual effects with fractals, because they’ve googled fractals, and they’re <a href="https://www.google.com/search?q=fractal&amp;source=lnms&amp;tbm=isch&amp;sa=X&amp;ved=0ahUKEwjljOT9l7nNAhXIKo8KHct2CckQ_AUICCgB&amp;biw=1920&amp;bih=1014">super trippy</a>. Of course, they don’t know the mad programming needed to make these fractals. But you do, and that’s why they pay you money.</p>
<p>A <a href="http://wikipedia.org/wiki/julia_set">Julia set</a> is made by applying a function to the complex numbers repeatedly and keeping track of when the resulting numbers reach a threshold value. One number may take 200 iterations to achieve and absolute value over a certain threshold, value while an <em>almost</em> identical one might only take 10 iterations.</p>
<p>Here, we’re interested in Julia sets because you can make <a href="https://en.wikipedia.org/wiki/Julia_set#/media/File:Julia_-0.8_0.156.png">pretty pictures</a> with them if you map each complex input number to a pixel on the screen. The task today is to write a program that does all the math necessary for your computer to draw one of these beautiful pictures. In addition to making a buck from the band, you can also make a set of nice wallpapers for your desktop!</p>
<h2>How to make a picture from a Julia set</h2>
<p><em>1 – Pick your function</em></p>
<p>Pick a function f which maps from a complex number z to another complex number. In our case we will use f(x) = z<sup>2</sup> – 0.221 – 0.713 i, because that makes a particularly pretty picture. To customize your own picture you can change the constant – 0.221 – 0.713 i to something else if you want.
The threshold value for this function is 2.</p>
<p><em>2 – Make a set of complex numbers</em></p>
<p>The only complex numbers which are interesting for the Julia set are the ones where both the real and the imaginary part is between -1 and 1.  That’s because, if the absolute value of an input number exceeds the threshold value, it will keep increasing or decreasing without bounds when you keep applying your function. So your program needs to keep a whole bunch of these small complex numbers in memory – one number for each pixel in your final image.</p>
<p><em>3 - Apply f to that set of complex numbers iteratively</em></p>
<p>Your program needs to check <em>how many times you can apply the function f to each of the complex numbers above before its absolute value crosses the threshold value</em>. So for each of your complex numbers, you get number of iterations, I.</p>
<p><em>4 – Map the values of I to pixels in a picture</em></p>
<p>You can do this in many ways, but an easier way, which I recommend, is that the real and imaginary parts of the complex numbers are the positions of the pixel on the X- and Y-axis, respectively, and I is the intensity of the pixel. You might want to set some cutoff to prevent specific pixels from iterating thousands of times.</p>
<h2>Illustrative example</h2>
<p>Say I want to make a 3x3 pixel image. I use the function f(z) = z<sup>2</sup> – 0.221 – 0.713 i. I map the complex numbers with both real and imaginary parts in the interval [-1, 1] to the nine pixels, giving nine input complex numbers (pixels):</p>
<p>(-1 + 1*i) (0 + 1*i) (1 + 1*i)</p>
<p>(-1 + 0*i) (0 + 0*i) (1 + 0*i)</p>
<p>(-1 - 1*i) (0 - 1*i) (1 - 1*i)</p>
<p>I calculate how many times I need to apply f to each pixel before its absolute value crosses the threshold value 2:</p>
<p>(1) (5) (2)</p>
<p>(3) (112) (3)</p>
<p>(2) (5) (1)</p>
<p>Finally I convert it to a 3x3 pixel image with the intensities above (not shown).</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input description</h2>
<p>The desired resolution in pixels written as X Y for example:</p>
<p>500 400</p>
<h2>Output description</h2>
<p>A Julia set with the desired resolution, in this case:</p>
<p><a href="http://imgur.com/4nVcHVk">A link to the output picture</a></p>
<h1>Bonuses</h1>
<h2>Bonus #1</h2>
<p>The band needs to upload in HD. Make your program fast enough to make wallpaper-sized pictures of 1920 x 1080 pixels with a reasonable iteration depth (128 or above).</p>
<h2>Bonus #2</h2>
<p>Make your program accept an arbitrary function, f, instead of just f(x) = z<sup>2</sup> – 0.221 – 0.713 i. The right function can really make the shapes crazy!</p>
<h2>Bonus #3</h2>
<p>Because neighboring pixels can vary a lot in intensity (this is a property of the Julia sets!), the result looks a little pixelated. Implement some kind of <a href="https://en.wikipedia.org/wiki/Spatial_anti-aliasing">anti-alialising</a> to make it look prettier.</p>
<h2>Bonus #4</h2>
<p>The problem is <a href="https://en.wikipedia.org/wiki/Embarrassingly_parallel">embarrasingly parallel</a>. There’s a lot of speed to gain by parallising your code!</p>
<h1>Finally</h1>
<p>Have a good challenge idea?</p>
<p>Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
<p>This challenge is posted by <a href="/u/Gobbedyret">/u/Gobbedyret</a> . All credits go to him/her</p>
</div>
