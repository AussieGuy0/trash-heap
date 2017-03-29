# Base-Negative Numbers
<div class="md"><h1><a href="#IntermediateIcon"></a> <em>(Intermediate)</em>: Base-Negative Numbers</h1>
<p><em>"Don't be stupid, Elite6809!"</em>, I hear you say. <em>"You can't have a negative base."</em> Well, why not? Let's analyse what we mean by base. Given a base-<strong>r</strong> system, the column <strong>p</strong> places from the right (starting from zero), which contains the digit <strong>n</strong>, has the value <strong>n</strong>×<strong>r</strong><sup><strong>p</strong></sup>. The binary columns 1, 2, 4, 8, 16, ... is the same as 2<sup>0</sup>, 2<sup>1</sup>, 2<sup>2</sup>, 2<sup>3</sup>, 2<sup>4</sup>. Nothing stops you from using a negative base with this system, except perhaps the understanding of the concept and practicality of its usage.</p>
<p>Let's imagine base -10 (negadecimal). Here, the place values for each column are now 1, -10, 100, -1000 and so on. Therefore, the negadecimal number 7211:</p>
<pre><code>-Thousands    Hundreds    -Tens    Units
    7            2           1       1
 (-7000)   +   (200)   +   (-10) +  (1) = -6809
</code></pre>
<p>Is equivalent to -6809 in standard decimal.</p>
<p>Your challenge is, given a negative base and a value, convert it to the representation in the corresponding positive base, and vice versa.</p>
<h1>Input and Output Description</h1>
<h2>Challenge Input</h2>
<p>You will accept two numbers: <strong>r</strong> and <strong>n</strong>. <strong>n</strong> is a number in base <strong>r</strong>. For example:</p>
<pre><code>-4 1302201
</code></pre>
<p>This input means 1302201 in base -4.</p>
<h2>Challenge Output</h2>
<p>Print the value of the input number in the corresponding opposite-signed base, for example, for the input above:</p>
<pre><code>32201
</code></pre>
<p>As 1302201 in base -4 equals 32201 in base 4.</p>
<h1>Sample Inputs and Outputs</h1>
<p>Input: <code>-10 12345678</code> (convert from base -10 to base 10)<br/>
Output: <code>-8264462</code></p>
<p>Input:<code>-7 4021553</code><br/>
Output: <code>4016423</code></p>
<p>Similarly, if the given base is <em>positive</em>, convert back to the corresponding negative base.</p>
<p>Input: <code>7 4016423</code> (convert from base 7 to base -7)<br/>
Output: <code>4021553</code></p>
<p>Input: <code>6 -3014515</code><br/>
Output: <code>13155121</code></p>
<h2>Extension (Hard)</h2>
<p>Extend your program to support imaginary bases. Imaginary bases can represent any complex number. The principle is the same; for example, base 4<em>i</em> can be used to represent complex numbers much the same way as a cartesian representation like a+b<em>i</em>.
If you have forgotten the principles of imaginary numbers, re-read the challenge description for <a href="/r/dailyprogrammer/comments/2nr6c4/">The Complex Number</a> - you might want to re-use some code from that challenge anyway.</p>
<h1>Notes</h1>
<p>Try and do both the main challenge and extension without looking for the conversion algorithms on the internet. This is part of the challenge!</p>
</div>
