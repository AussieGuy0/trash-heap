<div class="md"><p>If you were to generate all permutations of the first three letters of the alphabet ("a", "b" and "c") and then sort them, you would get the following list of 6 permutations:</p>
<ol>
<li>abc</li>
<li>acb</li>
<li>bac</li>
<li>bca</li>
<li>cab</li>
<li>cba</li>
</ol>
<p>As you can see, the fourth permutation in a sorted list of all the permutations of "a", "b" and "c" is "bca".</p>
<p>Similarly, if we wanted the 30th permutation in a sorted list of all permutations of the first five letters of the alphabet (i.e. "abcde"), you get "baedc".</p>
<p>Define a function f(n,p) that generates the permutation number p in a sorted list of all permutations of the n first letters of the alphabet. So, for instance: </p>
<p>f(3, 4) = "bca"<br/>
f(5, 30) = "baedc"<br/>
f(7, 1000) = "bdcfega"<br/>
f(8, 20000) = "dhfebagc"    </p>
<p>Find f(11, 20000000)</p>
<hr/>
<p>Bonus:</p>
<p>Find f(20, 10<sup>18</sup> )</p>
</div>
