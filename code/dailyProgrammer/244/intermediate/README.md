# Turn any language into an Array language (part 1)
<div class="md"><h1>Array languages</h1>
<p>Array languages include J, APL and OpenCL.  The only criteria is that function in and out parameters are arrays.  </p>
<p>In our array language, every function has 2 parameters (each arrays) called y and x.  (Optional rule)</p>
<p>In every function, the x parameter is optional, and your function should create a default value to fill in if missing.  (Somewhat Optional rule)</p>
<h1>rank and items</h1>
<p>more theory wil come in part 2 but,<br/>
Math functions are rank 0, which means they operate on scalars at a time inside the array.</p>
<p>scalar -- for our purposes is the same as a singleton array.  A 0D array.<br/>
list -- A 1 dimensional array.  Each item is a scalar.<br/>
table-- A 2 dimensional array. Each item is a list.<br/>
brick-- A 3 dimensional array.  Each item is a table.  </p>
<h1>1. iota function</h1>
<p>In J, the iota function takes just 1 rank 1 parameter (y is processed "list-at-a-time").<br/>
The iota function returns an array whose dimensions is equal to the scalar items of y.
The total number of scalars in the returned array is the product of y.<br/>
The ravelled (if the returned items were flattened to a 1 dimensional list) items of the return value is the range from (0) to (the product of y - 1)</p>
<p>examples:</p>
<pre><code>    iota 4 NB. 1d
0 1 2 3

  iota 2 3  NB. 2d
0 1 2
3 4 5

  iota 2 2 3  NB. 3d
0 1 2  
3 4 5  

6 7 8  
9 10 11
</code></pre>
<p>J's input and display for arrays does not need brackets around them.  3d arrays are displayed with a blank line between table items.</p>
<p><strong>the 2nd x parameter to iota</strong><br/>
Though not part of J or APL, we can add a 2nd optional parameter x to iota.  This parameter will add an offset to iota results.  Its default value is 0.  You may ignore testing it until you make the add function below, but basics:</p>
<pre><code>  1 iota  4
1 2 3 4
 10 iota  2 3
10 11 12
13 14 15
</code></pre>
<p>a python definition for iota would be<br/>
iota(y,x=0): </p>
<p>implement the details of iota in any language.</p>
<h1>add function</h1>
<p>addition of arrays is <code>rank 0 0</code>.  It operates at a scalar level (for both x and y).  Its default x value is 0.</p>
<pre><code>   5 add 1 2 3 
6 7 8
  10 10 10 add 1 2 3 
11 12 13
   1 2 3 add 1 2 3 
2 4 6

   10 add iota 2 3
10 11 12
13 14 15
   0 10 add iota 2 3
0 1 2   
13 14 15
</code></pre>
<p>The last case may seem a bit tricky.
J/Array functions are implemented such that </p>
<p>if both of its parameters are larger shape than its rank (ie. lists instead of scalars for add) then the function is called recursively for each item of its parameters.</p>
<p>if one of its parameters is the correct rank (scalar for add), but its other parameter is too large (list or higher), then the correct rank item is copied the number of items of the too large parameter.  and then called recursively.  So, <code>10 + 1 2 3</code> is the same as <code>10 10 10 + 1 2 3</code> (ie, the 10 is copied 3 times, then the recursive call does <code>10 + 1</code> <code>10+2</code> <code>10 +3</code> and the results accumulated into a list of 3 items.</p>
<p>So in <code>0 10 add iota 2 3</code>  the result of iota has 2 items, and one of the recursive calls in add will be:  <code>0 + 0 1 2</code> <code>10 + 3 4 5</code> and the expansion rule above applies.</p>
<p>implement add function. (in python, signature would look like)<br/>
add(y,x=0):  </p>
<h1>bonus</h1>
<pre><code>   iota (1 + iota 2 2)
0 1 0 0  
0 0 0 0  
0 0 0 0  

0 1 2 3  
4 5 6 7  
8 9 10 11
</code></pre>
<p>(<strong>edit:</strong> note iota is <code>rank _ 1</code> (x is scalar rank, y is list rank).   Above is same result as  <code>iota 1 iota 2 2</code>)
rank _ means rank infinity (take whole array/argument).  iota internally uses the add function which has <code>rank 0 0</code>  which groups the number of recursive calls down to <code>rank 0 0</code> after iota has generated its high dimension array.</p>
<p><strong>detail for what is going on here</strong> </p>
<pre><code>  1 + iota 2 2
1 2
3 4
</code></pre>
<p>which will call iota twice (it is rank 1)</p>
<pre><code>   iota 1 2  NB. product is 2.  J "official" result is a table with 1 list of 2 items.
0 1

   iota 3 4   NB. table with 3 lists of 4 items.
0 1 2 3  
4 5 6 7  
8 9 10 11
</code></pre>
<p>When the results of a recursive function application do not have the same shape, then 0s (default) are filled in before returning (accumulating) the array.  So when the above 2 results are combined, the 0 1 (first) result is padded with 0s.</p>
<pre><code>   2 3  + (iota (1 + iota 2 2))  NB. parens clarify J's right to left parsing order.  NB. is a comment.
2 3 2 2    
2 2 2 2    
2 2 2 2    

3 4 5 6    
7 8 9 10   
11 12 13 14

   (iota 2 3 4 )  + (iota (1 + iota 2 2))  NB. These parens are not needed in J.  But you may not know that.
0 2 2 3    
4 5 6 7    
8 9 10 11  

12 14 16 18
20 22 24 26
28 30 32 34
</code></pre>
</div>
