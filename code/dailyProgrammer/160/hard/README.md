# Trigonometric Triangle Trouble, pt. 2
<div class="md"><h1><a href="#HardIcon"></a> <em>(Hard)</em>: Trigonometric Triangle Trouble, pt. 2</h1>
<p>[I'm posting this early because there's a chance I won't have access to the internet tomorrow. Better an hour early than a day late I suppose.]</p>
<p>A triangle on a flat plane is described by its angles and side lengths, and you don't need all of the angles and side lengths to work out everything about the triangle. (This is the same as last time.) However, this time, the triangle will not necessarily have a right angle. This is where more trigonometry comes in. Break out your trig again, people.</p>
<p><a href="http://i.imgur.com/Q3qUoRg.png">Here's a representation of how this challenge will describe a triangle</a>. Each side is a <strong>lower-case</strong> letter, and the angle opposite each side is an <strong>upper-case</strong> letter - exactly the same as last time. Side a is opposite angle A, side b is opposite angle B, and side c is opposite angle C. However, angle C is not guaranteed to be 90' anymore, meaning the old right-angle trigonometry will not work; the choice of letter is completely arbitrary now. Your challenge is, using trigonometry and given an appropriate number of values, to find the rest of the values.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>On the console, you will be given a number <strong>N</strong>. You will then be given <strong>N</strong> lines, expressing <strong>some</strong> details of a triangle in the format:</p>
<pre><code>3
a=2.45912
A=39
B=56
</code></pre>
<p>a, A and B are just examples, it could be a, b and B or whatever.</p>
<p>Where all angles are in degrees. Note that, depending on your language of choice, a conversion to radians may be needed to use trigonometric functions such as <em>sin</em>, <em>cos</em> and <em>tan</em>.</p>
<h2>Output Description</h2>
<p>You must print out <strong>all</strong> of the details shown below of the triangle in the same format as above.</p>
<pre><code>a=2.45912
b=3.23953
c=3.89271
A=39
B=56
C=85
</code></pre>
<p>The input data will always give enough information and will describe a valid triangle.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<pre><code>3
c=7
A=43
C=70
</code></pre>
<h2>Sample Output</h2>
<pre><code>a=5.08037
b=6.85706
c=7
A=43
B=67
C=70
</code></pre>
<h1>Notes</h1>
<p>There are 5 more useful trigonometric identities you may find very useful. The 4 from Part 1 aren't great here as they are edge cases of trigonometry.</p>
<ul>
<li><p><a href="http://latex.codecogs.com/gif.latex?%5Cmathbf%7BA%7D+%5Cmathbf%7BB%7D+%5Cmathbf%7BC%7D%3D180%5E%7B%5Ccirc%7D">Sum of the angles is 180</a></p></li>
<li><p><a href="http://latex.codecogs.com/gif.latex?%5Cfrac%7B%5Cmathbf%7Ba%7D%7D%7Bsin%20%5Cmathbf%7BA%7D%7D%3D%5Cfrac%7B%5Cmathbf%7Bb%7D%7D%7Bsin%20%5Cmathbf%7BB%7D%7D%3D%5Cfrac%7B%5Cmathbf%7Bc%7D%7D%7Bsin%20%5Cmathbf%7BC%7D%7D">Sine Rule 1</a></p></li>
<li><p><a href="http://latex.codecogs.com/gif.latex?%5Cfrac%7Bsin%20%5Cmathbf%7BA%7D%7D%7B%5Cmathbf%7Ba%7D%7D%3D%5Cfrac%7Bsin%20%5Cmathbf%7BB%7D%7D%7B%5Cmathbf%7Bb%7D%7D%3D%5Cfrac%7Bsin%20%5Cmathbf%7BC%7D%7D%7B%5Cmathbf%7Bc%7D%7D">Sine Rule 2 (same as above but re-arranged)</a></p></li>
<li><p><a href="http://latex.codecogs.com/gif.latex?%5Cmathbf%7Ba%7D%5E2%3D%5Cmathbf%7Bb%7D%5E2+%5Cmathbf%7Bc%7D%5E2-2%5Cmathbf%7Bbc%7D%5Ccos%5Cmathbf%7BA%7D">Cosine Rule 1</a></p></li>
<li><p><a href="http://latex.codecogs.com/gif.latex?%5Cfrac%7B%5Cmathbf%7Bb%7D%5E2+%5Cmathbf%7Bc%7D%5E2-%5Cmathbf%7Ba%7D%5E2%7D%7B2%5Cmathbf%7Bbc%7D%7D%3D%5Ccos%5Cmathbf%7BA%7D">Cosine Rule 2 (same as above but re-arranged)</a></p></li>
</ul>
<h1>Finally...</h1>
<p>Some of your excellent solutions to Part 1 already accounted for these situations. If your solution from last time already solves this challenge, don't be afraid of posting it again here too! If your solution from last time doesn't, don't fret. You may be able to re-use a lot of code from last time anyway. Learning to <a href="http://en.wikipedia.org/wiki/Reusability">write reusable code</a> is generally good practice in the field. </p>
</div>
