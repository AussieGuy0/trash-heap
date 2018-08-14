# Addition chains
<div class="md"><h1>Description</h1>
<p>An "addition chain" is a sequence of numbers that starts with 1 and where each number is the sum of two previous numbers (or the same number taken twice), and that ends at some predetermined value. </p>
<p>An example will make this clearer: the sequence [1, 2, 3, 5, 10, 11, 21, 42, 84] is an addition chain for the number 84. This is because it starts with 1 and ends with 84, and each number is the sum of two previous numbers. To demonstrate:</p>
<pre><code>                (chain starts as [1])
1 + 1   = 2     (chain is now [1, 2]) 
1 + 2   = 3     (chain is now [1, 2, 3]) 
2 + 3   = 5     (chain is now [1, 2, 3, 5]) 
5 + 5   = 10    (chain is now [1, 2, 3, 5, 10]) 
1 + 10  = 11    (chain is now [1, 2, 3, 5, 10, 11]) 
10 + 11 = 21    (chain is now [1, 2, 3, 5, 10, 11, 21]) 
21 + 21 = 42    (chain is now [1, 2, 3, 5, 10, 11, 21, 42]) 
42 + 42 = 84    (chain is now [1, 2, 3, 5, 10, 11, 21, 42, 84]) 
</code></pre>
<p>Notice that the right hand side of the equations make up the chain, and left hand side of all the equations is a sum of two numbers that occur earlier in the chain (sometimes the same number twice). </p>
<p>We say that this chain is of length 8, because it took 8 additions to generate it (this is one less than the total amount of numbers in the chain). </p>
<p>There are a several different addition chains of length 8 for the number 84 (another one is [1, 2, 4, 8, 16, 32, 64, 68, 84], for instance), but there are no shorter ones. This is as short as we can get. </p>
<p>Your task today is to try and generate addition chains of a given length and last number. </p>
<p>(by the way, you may think this looks similar to the Fibonacci sequence, but it's not, there's a crucial difference: you don't just add the last two numbers of the chain to get the next number, you can add <em>any</em> two previous numbers to get the next number. The challenge is figuring out, for each step, which two numbers to add)</p>
<h1>Formal inputs &amp; outputs</h1>
<h2>Input description</h2>
<p>You will be given one line with two numbers on it. The first number will be the length of the addition chain you are to generate, and the second the final number. </p>
<p>Just to remind you: the length of the addition chain is equal to the number of additions it took to generate it, which is the same as <strong>one less</strong> than the total amount of numbers in it.  </p>
<h2>Output description</h2>
<p>You will output the entire addition chain, one number per line. There will be several different addition chains of the given length, but you only need to output one of them. </p>
<p>Note that going by the strict definition of addition chains, they don't necessarily have to be strictly increasing. However, any addition chain that is not strictly increasing can be reordered into one that is, so you can safely assume that all addition chains are increasing. In fact, making this assumption is probably a very good idea! </p>
<h1>Examples</h1>
<h2>Input 1</h2>
<pre><code>7 43
</code></pre>
<h2>Output 1</h2>
<p>(one of several possible outputs)</p>
<pre><code>1
2
3
5
10
20
40
43
</code></pre>
<h2>Input 2</h2>
<pre><code>9 95
</code></pre>
<h2>Output 2</h2>
<p>(one of several possible outputs)</p>
<pre><code>1
2
3
5
7
14
19
38
57
95
</code></pre>
<h1>Challenge inputs</h1>
<h2>Input 1</h2>
<pre><code>10 127
</code></pre>
<h2>Input 2</h2>
<pre><code>13 743
</code></pre>
<h1>Bonus</h1>
<pre><code>19 123456
</code></pre>
<p>If you want <em>even more</em> of a challenge than that input, consider this: when I, your humble moderator, was developing this challenge, my code would not be able to calculate the answer to this input in any reasonable time (even though solutions exist): </p>
<pre><code>25 1234567
</code></pre>
<p>If you can solve that input, you will officially have written a much better program than me!</p>
<h1>Notes</h1>
<p>I would like to note that while this challenge looks very "mathy", you don't need any higher level training in mathematics in order to solve it (at least not any more than is needed to understand the problem). There's not some secret formula that you have to figure out. It's still not super-easy though, and a good working knowledge of programming techniques will certainly be helpful!</p>
<p>In other words, in order to solve this problem (and especially the bonus), you need to be clever, but you don't need to be a mathematician. </p>
<p>As always, if you have any suggestions for problems, hop on over to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and let us know!</p>
</div>
