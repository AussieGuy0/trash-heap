# Mirror encryption
<div class="md"><h1>Description</h1>
<p>We are going to encrypt and decrypt with a mirror field.</p>
<p>It works like this:</p>
<p>We align letters to a mirror field:</p>
<pre><code> ab
A \c
B\ d
 CD
</code></pre>
<p>Every letter has now a mirror image</p>
<p>For example <code>A</code> has as mirror image <code>D</code></p>
<pre><code>A-\ 
  | 
  D
</code></pre>
<p>The <code>/</code> and <code>\</code> act as a mirror that will turn the line 90 degrees like you would if you had a laserpointer pointed to a mirror.</p>
<p>The full letter grid will look like this (without the seperators):</p>
<pre><code> |a|b|c|d|e|f|g|h|i|j|k|l|m|
-----------------------------
A| | | | | | | | | | | | | |n
-----------------------------
B| | | | | | | | | | | | | |o
-----------------------------
C| | | | | | | | | | | | | |p
-----------------------------
D| | | | | | | | | | | | | |q
-----------------------------
E| | | | | | | | | | | | | |r
-----------------------------
F| | | | | | | | | | | | | |s
-----------------------------
G| | | | | | | | | | | | | |t
-----------------------------
H| | | | | | | | | | | | | |u
-----------------------------
I| | | | | | | | | | | | | |v
-----------------------------
J| | | | | | | | | | | | | |w
-----------------------------
K| | | | | | | | | | | | | |x
-----------------------------
L| | | | | | | | | | | | | |y
-----------------------------
M| | | | | | | | | | | | | |z
-----------------------------
 |N|O|P|Q|R|S|T|U|V|W|X|Y|Z|
</code></pre>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input description</h2>
<p>You'll get a grid of 13 by 13 with mirrors and a word.  </p>
<pre><code>   \\  /\    
            \
   /         
      \     \
    \        
  /      /   
\  /      \  
     \       
\/           
/            
          \  
    \/       
   /       / 
TpnQSjdmZdpoohd
</code></pre>
<h2>Output description</h2>
<p>Return the encrypted word</p>
<pre><code>DailyProgrammer
</code></pre>
<h1>Bonus</h1>
<p>Use the mirrors as a encryption key file and make you program encrypt in realtime (as you type)</p>
<h1>Finally</h1>
<p>Have a good challenge idea?</p>
<p>Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
<h1>Edit</h1>
<p>Thanks to you all for pointing out the typo. Fixed it now. </p>
<p>Special thanks to <a href="/u/skeeto">/u/skeeto</a> to provide us with an animated version <a href="http://i.imgur.com/uML0tJK.gif">http://i.imgur.com/uML0tJK.gif</a> </p>
</div>
