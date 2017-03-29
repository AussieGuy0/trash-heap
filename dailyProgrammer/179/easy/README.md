# You make me happy when clouds are gray...scale
<div class="md"><h1>Description</h1>
<p>The 'Daily Business' newspaper are a distributor of the most recent news concerning business. They have a problem though, there is a new newspaper brought out every single day and up to this point, all of the images and advertisements featured have been in full colour and this is costing the company.</p>
<p>If you can convert these images before they reach the publisher, then you will surely get a promotion, or at least a raise!</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input description</h2>
<p>On console input you should enter a filepath to the image you wish to convert to grayscale.</p>
<h2>Output description</h2>
<p>The program should save an image in the current directory of the image passed as input, the only difference being that it is now in black and white.</p>
<h1>Notes/Hints</h1>
<p>There are several methods to convert an image to grayscale, the easiest is to sum up all of the RGB values and divide it by 3 (The length of the array) and fill each R,G and B value with that number.</p>
<p>For example</p>
<pre><code>RED = (255,0,0)
</code></pre>
<p>Would turn to</p>
<pre><code>(85,85,85)       //Because 255/3 == 85.
</code></pre>
<p>There is a problem with this method though,</p>
<pre><code>GREEN = (0,255,0)
</code></pre>
<p>brings back the exact same value!</p>
<p>There is a formula to solve this, see if you can find it.</p>
<p>Share any interesting methods for grayscale conversion that you come across.</p>
<h1>Finally</h1>
<p>We have an IRC channel over at </p>
<p>irc.freenode.net in #reddit-dailyprogrammer</p>
<p>Stop on by :D</p>
<p>Have a good challenge idea?</p>
<p>Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
</div>
