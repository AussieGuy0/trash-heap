# (Plain PGM file viewer)
<div class="md"><p>Write a program that converts a <a href="http://netpbm.sourceforge.net/doc/pgm.html">"plain" <code>.pgm</code> file</a> passed from stdin to an ASCII representation easily viewable in a terminal. If you're too lazy to read through the specification, the format should be simple enough to reverse-engineer from an example file:</p>
<pre><code>P2
# feep.pgm
24 7
15
0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0
0  3  3  3  3  0  0  7  7  7  7  0  0 11 11 11 11  0  0 15 15 15 15  0
0  3  0  0  0  0  0  7  0  0  0  0  0 11  0  0  0  0  0 15  0  0 15  0
0  3  3  3  0  0  0  7  7  7  0  0  0 11 11 11  0  0  0 15 15 15 15  0
0  3  0  0  0  0  0  7  0  0  0  0  0 11  0  0  0  0  0 15  0  0  0  0
0  3  0  0  0  0  0  7  7  7  7  0  0 11 11 11 11  0  0 15  0  0  0  0
0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0  0
</code></pre>
<ul>
<li>The top line, <code>P2</code>, is there to <strong>identify</strong> the file as a plain .pgm file.</li>
<li>Lines with a <strong>#</strong> in front of them are <strong>comments</strong>, and should be ignored.</li>
<li>The first two numbers in the file are the <strong>width</strong> and <strong>height</strong>.</li>
<li>The third number, 15 here, is the <strong>maximum grayscale value</strong> in the image: here, this means 15 is full white, and lower numbers are darker, 0 being pure black.</li>
<li>Thereafter, a <strong>(<em>width</em> x <em>height</em>) grid</strong> specifying the image itself follows.</li>
</ul>
<p>Your program should use ASCII symbols to represent different grayscale values. Assuming the text is black on a white background, you could use a gradient like this one:</p>
<pre><code>" .:;+=%$#"
</code></pre>
<p>Converted, the example image would look something like this:</p>
<pre><code> ....  ;;;;  ====  #### 
 .     ;     =     #  # 
 ...   ;;;   ===   #### 
 .     ;     =     #    
 .     ;;;;  ====  #    
</code></pre>
</div>
