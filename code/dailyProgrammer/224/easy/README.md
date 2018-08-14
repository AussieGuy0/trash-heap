# Shuffling a List
<div class="md"><h1>Description</h1>
<p>We've had our fair share of sorting algorithms, now let's do a <em>shuffling</em> challenge. In this challenge, your challenge is to take a list of inputs and change around the order in random ways. Think about shuffling cards - can your program shuffle cards?</p>
<p><em>EDIT 07-25-2014</em> In case this isn't obvious, the intention of this challenge is for you to implement this yourself and not rely on a standard library built in (e.g. Python's "random.shuffle()" or glibc's "strfry()"). </p>
<h1>Input Description</h1>
<p>You'll be given a list of values - integers, letters, words - in one order. The input list will be space separated. Example:</p>
<pre><code>1 2 3 4 5 6 7 8 
</code></pre>
<h1>Output Description</h1>
<p>Your program should emit the values in any non-sorted order; sequential runs of the program or function should yield different outputs. You should maximize the disorder if you can. From our example:</p>
<pre><code>7 5 4 3 1 8 2 6
</code></pre>
<h1>Challenge Input</h1>
<pre><code>apple blackberry cherry dragonfruit grapefruit kumquat mango nectarine persimmon raspberry raspberry
a e i o u
</code></pre>
<h1>Challenge Output</h1>
<p>Examples only, this is all about shuffling</p>
<pre><code>raspberry blackberry nectarine kumquat grapefruit cherry raspberry apple mango persimmon dragonfruit
e a i o u
</code></pre>
<h1>Bonus</h1>
<p>Check out the <a href="https://en.wikipedia.org/wiki/Faro_shuffle">Faro shuffle</a> and the <a href="https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle">Fisher-Yates shuffles</a>, which are algorithms for specific shuffles. Shuffling has some interesting mathematical properties. </p>
</div>
