# Hex to 8x8 Bitmap
<div class="md"><h1>Description:</h1>
<p>Today we will be making some simple 8x8 bitmap pictures. You will be given 8 hex values that can be 0-255 in decimal value (so 1 byte). Each value represents a row. So 8 rows of 8 bits so a 8x8 bitmap picture.</p>
<h1>Input:</h1>
<p>8 Hex values.</p>
<h2>example:</h2>
<p>18 3C 7E 7E 18 18 18 18</p>
<h1>Output:</h1>
<p>A 8x8 picture that represents the values you read in. </p>
<p>For example say you got the hex value FF. This is 1111 1111 . "1" means the bitmap at that location is on and print something. "0" means nothing is printed so put a space. 1111 1111 would output this row: </p>
<pre><code>xxxxxxxx
</code></pre>
<p>if the next hex value is 81 it would be 1000 0001 in binary and so the 2nd row would output (with the first row)</p>
<pre><code>xxxxxxxx
x      x
</code></pre>
<h2>Example output based on example input:</h2>
<pre><code>   xx
  xxxx
 xxxxxx
 xxxxxx
   xx
   xx
   xx
   xx
</code></pre>
<h1>Challenge input:</h1>
<p>Here are 4 pictures to process and display:</p>
<pre><code>FF 81 BD A5 A5 BD 81 FF
AA 55 AA 55 AA 55 AA 55
3E 7F FC F8 F8 FC 7F 3E
93 93 93 F3 F3 93 93 93
</code></pre>
<h1>Output Character:</h1>
<p>I used "x" but feel free to use any ASCII value you want. Heck if you want to display it using graphics, feel free to be creative here.</p>
</div>
