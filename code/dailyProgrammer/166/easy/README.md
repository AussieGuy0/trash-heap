# ASCII Fractal Curves
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Easy)</em>: ASCII Fractal Curves</h1>
<p>Today we're going to set a more open-ended challenge. First, let's look at what a space-filling curve is.</p>
<p>A <a href="http://en.wikipedia.org/wiki/Space-filling_curve">space-filling curve</a> is a specific type of line/curve that, as you recreate it in more and more detail, fills more and more of the space that it's in, without (usually) ever intersecting itself. There are several types of space-filling curve, and all behave slightly differently. Some get more and more complex over time whereas some are the same pattern repeated over and over again.</p>
<p>Your challenge will be to take any space-fulling curve you want, and write a program that displays it to a given degree of complexity.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>The input to this challenge is extremely simple. You will take a number <strong>N</strong> which will be the degree of complexity to which you will display your fractal curve. For example, <a href="http://upload.wikimedia.org/wikipedia/en/a/a5/Hilbert_curve.svg">this image</a> shows the <em>Hilbert curve</em> shown to 1 through 6 degrees of complexity.</p>
<h2>Output Description</h2>
<p>You must print out your own curve to the given degree of complexity. The method of display is up to you, but try and stick with the ASCII theme - for example, see below.</p>
<h1>Sample Inputs &amp; Output</h1>
<h2>Sample Input</h2>
<p>(Hilbert curve program)</p>
<pre><code>3
</code></pre>
<h2>Sample Output</h2>
<pre><code># ##### ##### #
# #   # #   # #
### ### ### ###
    #     #    
### ### ### ###
# #   # #   # #
# ##### ##### #
#             #
### ### ### ###
  # #     # #  
### ### ### ###
#     # #     #
# ### # # ### #
# # # # # # # #
### ### ### ###
</code></pre>
<h1>Notes</h1>
<p>Recursive algorithms will come in very handy here. You'll need to do some of your own research into the curve of your choice.</p>
</div>
