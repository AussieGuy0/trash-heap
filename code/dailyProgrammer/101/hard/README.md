# (Boolean Minimization)
<div class="md"><p>For difficult 101, I thought I'd do something with binary in it.</p>
<p>Write a program that reads in a file containing 2<sup>n</sup> 0s and 1s as ascii characters.  You will have to solve for N given the number of 0s and 1s in the file,
as it will not be given in the file.  These 0s and 1s are to be interpreted as the outputs of a truth table in N variables.  </p>
<p>Given this truth table, output a minimal boolean expression of the function in some form.  (
<a href="http://en.wikipedia.org/wiki/Quine%E2%80%93McCluskey_algorithm">Hint1</a>,        <a href="http://en.wikipedia.org/wiki/Karnaugh_map">hint2</a>)</p>
<p>For example, one implementation could read in this input file</p>
<pre><code>0000010111111110
</code></pre>
<p>This is a 4-variable boolean function with the given truth table.  The program could minimize the formula, and could output</p>
<pre><code>f(abcd)=ac'+ab'+bcd'
</code></pre>
<p>or </p>
<pre><code>f(0123)=02'+01'+123'
</code></pre>
</div>
