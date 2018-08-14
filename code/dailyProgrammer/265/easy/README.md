# Permutations and combinations part 1
<div class="md"><h1>Permutations</h1>
<p>The "permutations of 3" for the sake of this text are the possible arrangements of the list of first 3 numbers (0 based but optional) in sorted order</p>
<pre><code>0 1 2
0 2 1
1 0 2
1 2 0
2 0 1
2 1 0
</code></pre>
<p>The permutation number is the index in this list.  The "3rd permutation of 3" is <code>1 0 2</code>.  "1 2 0 has permutation number <code>3</code> (0 based)"</p>
<p><strong>input:</strong></p>
<p>what is 240th permutation of 6<br/>
what is 3240th permutation of 7  </p>
<p><strong>output:</strong><br/>
    1 5 4 3 2 0<br/>
    4 2 6 5 3 1 0</p>
<h1>combinations</h1>
<p>The "combinations of 3 out of 6" is the sorted list of the possible ways to take 3 items out of the first 6 numbers (as a set where order does not matter)</p>
<pre><code>0 1 2
0 1 3
0 1 4
0 1 5
0 2 3
0 2 4
0 2 5
0 3 4
0 3 5
0 4 5
1 2 3
1 2 4
1 2 5
1 3 4
1 3 5
1 4 5
2 3 4
2 3 5
2 4 5
3 4 5
</code></pre>
<p>The "3rd combination number of 3 out of 6 is <code>0 1 4</code>".  "0 2 4 is combination index/number 5 or the 6th combination of 3 out of 6"</p>
<p><strong>input:</strong><br/>
24th combination of 3 out of 8<br/>
112th combination of 4 out of 9 </p>
<p><strong>output</strong><br/>
   1 2 5<br/>
 3 4 5 6</p>
<p>Brute force solutions (generate full list, then take the number/index) to all of today's challenges are encouraged.</p>
</div>
