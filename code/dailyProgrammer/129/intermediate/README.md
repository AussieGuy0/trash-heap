# N-Dimensional Vectors
<div class="md"><h1><a href="#IntermediateIcon"></a> <em>(Intermediate)</em>: N-Dimensional Vectors</h1>
<p>N-Dimensional <a href="http://en.wikipedia.org/wiki/Euclidean_vector">vectors</a> are vectors with n-components; it can be interpreted as a point in n-dimensional space. 2-dimensional (2D) vectors can be seen as a line on paper. 3D vectors can be seen as a line (direction with length) in regular space. You can represent higher n-dimensions in many different ways, but what we're interested in is the three common vector operations: length, normilization, and dot-product.</p>
<p>You are to implement code that first accepts a few vectors, the operations you want to perform on them, and their results.</p>
<p><strong>Note:</strong> this Friday's upcoming <em>[Hard]</em> challenge will be to implement the cross-product computation (for only 3-dimensions). You are encouraged to bring the code you write for this solution as a starting point for the associated [Hard]-level challenge!</p>
<p><em>Original author: <a href="/u/nint22">/u/nint22</a></em></p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>You will be given an integer N on standard input, which represents the N-following number of lines of text. The start of each line will be a positive non-zero integer A, where A is the following number of space-delimited <a href="http://en.wikipedia.org/wiki/Real_number">Real number</a> (floating-point in many languages). These numbers representing a vector of A-dimensions (or an A-component vector). After these N-lines of text, expect a single line with an integer M, which represents the M-following number of lines of text. Each line will start with the characters 'l', 'n', or 'd', representing the function you are to compute. After that, you can expect one or two space-delimited integers. These integers represent the index of the above-defined vectors; the indexing scheme starts at zero (0). An 'l' and 'n' line will be given a single integer, while a 'd' will be given two space-delimited integers.</p>
<h2>Output Description</h2>
<p>For each line that defines the function ('l' for length, 'n' for normalize, and 'd' for dot-product) and operands (the vector values based on the given indices), you are to print the result of the appropriate computation on standard console output. The length-function must compute the given vector's <a href="http://en.wikipedia.org/wiki/Euclidean_space#Distance">Euclidean space</a> length. The normalize-function must compute the given vector's <a href="http://en.wikipedia.org/wiki/Unit_vector">Unit vector</a>. Finally, the Dot-product function must compute the <em>two</em> given vector's, well... <a href="http://en.wikipedia.org/wiki/Dot_product">Dot Product</a>! When printing your result, you may choose however you print the result (regular float, or scientific notation), but you must be accurate with 5 decimals.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<pre><code>5
2 1 1
2 1.2 3.4
3 6.78269 6.72 6.76312
4 0 1 0 1
7 84.82 121.00 467.05 142.14 592.55 971.79 795.33
7
l 0
l 3
l 4
n 1
n 2
n 3
d 0 1
</code></pre>
<h2>Sample Output</h2>
<pre><code>1.4142
1.4142
1479.26
0.33282 0.94299
0.579689 0.574332 0.578017
0 0.707107 0 0.707107
4.6
</code></pre>
</div>
