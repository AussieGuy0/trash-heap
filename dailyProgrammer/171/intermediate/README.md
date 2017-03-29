# Zoom, Rotate, Invert Hex Picture
<div class="md"><h1>Description:</h1>
<p>This builds off the <a href="http://www.reddit.com/r/dailyprogrammer/comments/2ao99p/7142014_challenge_171_easy_hex_to_8x8_bitmap/">Easy #171</a> Challenge. We take it to the next level.</p>
<p>We can read in an 8x8 picture from hex values. Once we have that image we can do some fun things to it.</p>
<ul>
<li>Zoom - zoom in or out of the image</li>
<li>Rotate - turn the image 90 degrees clockwise or counter clockwise</li>
<li>Invert - What was On is Off and what is Off becomes On. It inverts the image</li>
</ul>
<p>Your challenge is implement these 3 abilities. If you completed Easy #171 then you have a headstart. Otherwise you will need to complete that first.</p>
<h1>Input:</h1>
<p>Same as <a href="http://www.reddit.com/r/dailyprogrammer/comments/2ao99p/7142014_challenge_171_easy_hex_to_8x8_bitmap/">Easy #171</a> read in 8 hex values and use it to generate a 8x8 image.</p>
<h1>Zoom:</h1>
<p>You will zoom in x2 at a time. So let's look at what a zoom does.
You have this image (using numbers for reference)</p>
<pre><code>12
34
</code></pre>
<p>If you perform a zoom in x2 you will generate this image.</p>
<pre><code>1122
1122
3344
3344
</code></pre>
<p>If you zoom again on this image x2 you will get this:</p>
<pre><code>11112222
11112222
11112222
11112222
33334444
33334444
33334444
33334444
</code></pre>
<p>So for example if you have this image:</p>
<pre><code>xxxxxxxx
x      x
x xxxx x
x x  x x
x x  x x
x xxxx x
x      x
xxxxxxxx
</code></pre>
<p>If you do a zoom x2 you get this:</p>
<pre><code>xxxxxxxxxxxxxxxx
xxxxxxxxxxxxxxxx
xx            xx
xx            xx
xx  xxxxxxxx  xx
xx  xxxxxxxx  xx
xx  xx    xx  xx
xx  xx    xx  xx
xx  xx    xx  xx
xx  xx    xx  xx
xx  xxxxxxxx  xx
xx  xxxxxxxx  xx
xx            xx
xx            xx
xxxxxxxxxxxxxxxx
xxxxxxxxxxxxxxxx
</code></pre>
<p>Your zoom feature should be able to take the image and go x2. Up to a maximum of x4 (so 8x8 up to 32x32).
Your zoom feature should also zoom out and take a 32x32 to a 16x16 and then down to a 8x8. Your zoom should
not go out more than x4. (So your images can be only 8x8, 16x16 or 32x32).</p>
<h1>Rotate:</h1>
<p>This is very simple. You will rotate clockwise or counterclockwise.</p>
<p>So this image:</p>
<pre><code>12
34
</code></pre>
<p>If you rotate it 90 clockwise:</p>
<pre><code>31
42
</code></pre>
<p>If you rotate it 90 counter clockwise:</p>
<pre><code>12
34
</code></pre>
<p>Your rotations should go either direction and can handle the image being 8x8, 16x16 or 32x32.</p>
<h1>Invert:</h1>
<p>In the image if it was turned off it becomes turned on. If it is turned on it becomes turn off.</p>
<p>Example if you have this image: (adding a border of #)</p>
<pre><code> ##########
 #xxxxxxxx#
 #x      x#
 #x xxxx x#
 #x x  x x#
 #x x  x x#
 #x xxxx x#
 #x      x#
 #xxxxxxxx#
 ##########
</code></pre>
<p>The invert of it becomes:</p>
<pre><code> ##########
 #        #
 # xxxxxx #
 # x    x #
 # x xx x #
 # x xx x #
 # x    x #
 # xxxxxx #
 #        #
 ##########
</code></pre>
<h1>Challenge:</h1>
<p>Use the same input as the <a href="http://www.reddit.com/r/dailyprogrammer/comments/2ao99p/7142014_challenge_171_easy_hex_to_8x8_bitmap/">Easy #171</a> and do the following operations on them.</p>
<ul>
<li>Zoom in x 2</li>
<li>Rotate Clockwise 90</li>
<li>Zoom in x 2</li>
<li>Invert</li>
<li>Zoom out x 2</li>
</ul>
<p>Note: Due to the potential size of outputs (and if you elect to show the image inbetween the steps) please use a github or other method to show your output. Thanks!</p>
<p>For speed here are the 4 hex pictures from the Easy 171:</p>
<pre><code>FF 81 BD A5 A5 BD 81 FF
AA 55 AA 55 AA 55 AA 55
3E 7F FC F8 F8 FC 7F 3E
93 93 93 F3 F3 93 93 93
</code></pre>
</div>
