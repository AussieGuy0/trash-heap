# Estimating pi from images of circles
<div class="md"><h1>Description</h1>
<p>In modern times, if we wish to calculate the value of pi to some precision, there are plenty of mathematical formulas that you can use to get the value. <a href="https://en.wikipedia.org/wiki/Leibniz_formula_for_%CF%80">Leibniz formula for pi</a> and the solution to the <a href="https://en.wikipedia.org/wiki/Basel_problem">Basel problem</a> are two of the most famous ones, though both converge very slowly. Modern day computers that attempt to set the world record for digits of pi generally use some variation on <a href="https://en.wikipedia.org/wiki/Approximations_of_%CF%80#20th_century">Ramanujan's formula</a>, which converges very rapidly. </p>
<p>However, back in the good old days, we didn't know of these formulas. They all depend on analysis and infinite sums which mathematicians had no skill at manipulating. Back then, the way you estimated pi was less accurate but more straight-forward: you drew a circle, measured it, and calculated pi from that. </p>
<p>Today, we're going to honor those mathematicians of old. You will be given an image of a black circle on white background, and using the pixel data in the image, you are to come up with an estimate for pi.</p>
<p>For those of you who have forgotten your formulas for circles, the formula for the area of a circle is as follows: </p>
<pre><code>A = pi * r^2
</code></pre>
<p>In other words, to calculate the area of a circle, multiply pi by the square of the radius.</p>
<h1>Formal inputs &amp; outputs</h1>
<h2>Inputs</h2>
<p>As input, you will be given an image that contains a black circle on white background (those are the only two colors in the image, there's no anti-aliasing or anything). The image provided will be in PNG format, but if you find it difficult to import and analyze PNG images in your language, you're welcome to use a tool like ImageMagick to convert it to a format you prefer (the <a href="https://en.wikipedia.org/wiki/Netpbm">Netpbm</a> family of formats are famously easy for a computers to parse). </p>
<p>Note that for challenge input 1, the height and width of the image itself is equal to the diameter of the circle, but that <em>is not</em> true for challenge input #2. It is highly encouraged (but not required) that you to try and write a program that works for both challenge inputs. </p>
<h2>Outputs</h2>
<p>You will output a single line containing your estimate of pi based on the image. It doesn't have to be very exact in all decimal places, just the closest value you can get by looking at the image provided.</p>
<h1>Challenge inputs</h1>
<h2>Input 1</h2>
<p><a href="http://i.imgur.com/5GScbUe.png">This image</a></p>
<h2>Input 2</h2>
<p><a href="http://i.imgur.com/dRko2KH.png">This image</a></p>
<h1>Bonus</h1>
<p>If you really want to test your test your skills, extract an estimate of pi from <a href="http://i.imgur.com/Cp0hxTh.png">this image</a></p>
<h1>Notes</h1>
<p>As always, if you have a challenge suggestion, head on over to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and suggest it! </p>
<p>Also, for you historians out there who are going to comment "that's not how Archimedes did it!": <a href="https://en.wikipedia.org/wiki/Pi#Polygon_approximation_era">yes, I know that other methods were used</a>, but lets just forget that for the purposes of this problem :)</p>
</div>
