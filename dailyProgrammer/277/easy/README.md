# Simplifying fractions
<div class="md"><h1>Description</h1>
<p>A fraction exists of a numerator (top part) and a denominator (bottom part) as you probably all know.</p>
<p>Simplifying (or reducing) fractions means to make the fraction as simple as possible. Meaning that the denominator is a close to <code>1</code> as possible.
This can be done by dividing the numerator and denominator by their greatest common divisor.</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input description</h2>
<p>You will be given a list with 2 numbers seperator by a space.
The first is the numerator, the second the denominator</p>
<pre><code>4 8
1536 78360
51478 5536
46410 119340
7673 4729
4096 1024
</code></pre>
<h2>Output description</h2>
<p>The most simplified numbers</p>
<pre><code>1 2
64 3265
25739 2768
7 18
7673 4729
4 1
</code></pre>
<h1>Notes/Hints</h1>
<p>Most languages have by default this kind of functionality, but if you want to challenge yourself, you should go back to the basic theory and implement it yourself.</p>
<h1>Bonus</h1>
<p>Instead of using numbers, we could also use letters.</p>
<p>For instance</p>
<pre><code>ab   a
__ = _
cb   c 
</code></pre>
<p>And if you know that <code>x = cb</code>, then you would have this:</p>
<pre><code>ab   a
__ = _
x    c  
</code></pre>
<p>and offcourse:</p>
<pre><code>a    1
__ = _
a    1

aa   a
__ = _
a    1
</code></pre>
<p>The input will be first a number saying how many equations there are. And after the equations, you have the fractions.</p>
<p>The equations are a letter and a value seperated by a space.
An equation can have another equation in it.</p>
<pre><code>3
x cb
y ab
z xa
ab cb
ab x
x y
z y
z xay
</code></pre>
<p>output:</p>
<pre><code>a c
a c
c a
c 1
1 ab
</code></pre>
<h1>Finally</h1>
<p>Have a good challenge idea?</p>
<p>Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
</div>
