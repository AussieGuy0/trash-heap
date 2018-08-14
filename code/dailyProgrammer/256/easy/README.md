# Oblique and De-Oblique
<div class="md"><p>The oblique function slices a matrix (2d array) into diagonals.</p>
<p>The de-oblique function takes diagonals of a matrix, and reassembles the original rectangular one.</p>
<h1>input for oblique</h1>
<pre><code> 0  1  2  3  4  5
 6  7  8  9 10 11
12 13 14 15 16 17
18 19 20 21 22 23
24 25 26 27 28 29
30 31 32 33 34 35
</code></pre>
<p>(and the output to de-oblique)</p>
<h1>output for oblique</h1>
<pre><code>0               
1 6             
2 7 12          
3 8 13 18       
4 9 14 19 24    
5 10 15 20 25 30
11 16 21 26 31  
17 22 27 32     
23 28 33        
29 34           
35              
</code></pre>
<p>(and the input to de-oblique)</p>
<h1>bonus deambiguated de-oblique matrices</h1>
<p>There's only one de-oblique solution for a square matrix, but when the result is not square, another input is needed to indicate whether the output should be <strong>tall</strong> or <strong>wide</strong> or provide specific dimentsions of output:</p>
<h1>rectangular oblique data input</h1>
<pre><code>0      
1 6    
2 7 12 
3 8 13 
4 9 14 
5 10 15
11 16  
17   
</code></pre>
<h1>output for (wide) <code>deoblique (3 6,  INPUT)</code> or <code>deoblique (WIDE,  INPUT)</code></h1>
<pre><code> 0  1  2  3  4  5
 6  7  8  9 10 11
12 13 14 15 16 17
</code></pre>
<h1>output for (tall) <code>deoblique (6 3,  INPUT)</code> or <code>deoblique (TALL,  INPUT)</code></h1>
<pre><code> 0  1  2
 6  7  3
12  8  4
13  9  5
14 10 11
15 16 17
</code></pre>
<h1>Note</h1>
<p>The main use of these functions in computer science is to operate on the diagonals of a matrix, and then revert it back to a rectangular form.  Usually the rectangular dimensions are known. </p>
</div>
