# (Z-Order Encryption)
<div class="md"><p>Write a program that implements the following encryption scheme:</p>
<p>It reads in some string of data of length N.  Then, lay out that string in the smallest possible perfect power of two square that can fit the data.</p>
<p>For example, "My country, tis of thee" is 23 characters long.  Therefore, it fits into a 5x5 square 25 characters long like this:</p>
<pre><code>My co
untry
, tis
 of t
hee
</code></pre>
<p>However, when we constrain it to be a power of two, instead we end up with an 8x8 square, and laying it out looks like</p>
<pre><code>My count
ry, tis 
of thee
</code></pre>
<p>However, the encrytion part happens when, instead of laying out letters of the square from left to right as above, you lay out 
the square using a <a href="http://en.wikipedia.org/wiki/Z-order_curve">Z-order code</a> instead, like so.</p>
<pre><code>Myouofhe
 cnt te 
ryti
, s 
</code></pre>
<p>Write a program that reads a string from standard input and can encrypt to a z-order square, and vice-versa</p>
</div>
