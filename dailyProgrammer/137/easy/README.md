# String Transposition
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Easy)</em>: String Transposition</h1>
<p>It can be helpful sometimes to rotate a string 90-degrees, like a big vertical "SALES" poster or your business name on vertical neon lights, like <a href="http://imgur.com/766x8uM">this image from Las Vegas</a>. Your goal is to write a program that does this, but for multiples lines of text. This is very similar to a <a href="http://en.wikipedia.org/wiki/Transpose">Matrix Transposition</a>, since the order we want returned is not a true 90-degree rotation of text.</p>
<p><em>Author:</em> nint22</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>You will first be given an integer N which is the number of strings that follows. N will range inclusively from 1 to 16. Each line of text will have at most 256 characters, including the new-line (so at most 255 printable-characters, with the last being the new-line or carriage-return).</p>
<h2>Output Description</h2>
<p>Simply print the given lines top-to-bottom. The first given line should be the left-most vertical line.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input 1</h2>
<pre><code>1
Hello, World!
</code></pre>
<h2>Sample Output 1</h2>
<pre><code>H
e
l
l
o
,

W
o
r
l
d
!
</code></pre>
<h2>Sample Input 2</h2>
<pre><code>5
Kernel
Microcontroller
Register
Memory
Operator
</code></pre>
<h2>Sample Output 2</h2>
<pre><code>KMRMO
eieep
rcgme
nrior
eosra
lctyt
 oe o
 nr r
 t
 r
 o
 l
 l
 e
 r
</code></pre>
</div>
