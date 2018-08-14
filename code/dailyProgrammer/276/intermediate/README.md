# Key function
<div class="md"><p>The key function is a higher order array function modelled in sql as <code>group by</code> and in J as <code>/.</code>  For each key, apply a passed function to the entire subarray of items that share the same key.</p>
<h1>function signature</h1>
<p>key(</p>
<pre><code> elements:  an array/list of stuff. number of items is leading array dimension,
 key: an array/list of stuff.  Same amount of items as "elements".  If null, then defaults to same array as elements,
 applyfunction:  function that will be called for each group of elements that have the same key.  Optionally, this function could also have the key parameter.  Results are aggregated in order of key appearance.
 )
</code></pre>
<p>key(<code>3 4 5 6</code> , <code>2 0 1 2</code> , <code>sum</code>)</p>
<p>would produce</p>
<p><code>9 4 5</code></p>
<p>There are 2 elements with key 2, and so for key 2, sum is called with <code>3 6</code>.  Results accumulated in order of key seen.</p>
<h1>1. Histogram</h1>
<p>for each item in input, return a record with the key and the item count for that key</p>
<p><strong>input:</strong></p>
<pre><code> 5 3 5 2 2 9 7 0 7 5 9 2 9 1 9 9 6 6 8 5 1 1 4 8 5 0 3 5 8 2 3 8 3 4 6 4 9 3 4 3 4 5 9 9 9 7 7 1 9 3 4 6 6 8 8 0 4 0 6 3 2 6 3 2 3 5 7 4 2 6 7 3 9 5 7 8 9 5 6 5 6 8 3 1 8 4 6 5 6 4 8 9 5 7 8 4 4 9 2 6 10
</code></pre>
<p><strong>output</strong> </p>
<pre><code> 5 13
 3 12
 2  8
 9 14
 7  8
 0  4
 1  5
 6 13
 8 11
 4 12
10  1
</code></pre>
<h1>2. grouped sum of field</h1>
<p>for each record use the first field as key, and return key and sum of field 2 (grouped by key)</p>
<p><strong>input:</strong></p>
<pre><code>a 14
b 21
c 82
d 85
a 54
b 96
c 9 
d 61
a 43
b 49
c 16
d 34
a 73
b 59
c 36
d 24
a 45
b 89
c 77
d 68
</code></pre>
<p><strong>output:</strong></p>
<pre><code>┌─┬───┐
│a│229│
├─┼───┤
│b│314│
├─┼───┤
│c│220│
├─┼───┤
│d│272│
└─┴───┘
</code></pre>
<h1>3. nub (easier)</h1>
<p>the "nub of an array" can be implemented with key.  It is similar to sql first function. </p>
<p>for the input from <code>2.</code> return the first element keyed (grouped) by first column</p>
<p><strong>output:</strong></p>
<pre><code>  (&gt;@{."1 ({./.) ]) b
┌─┬──┐
│a│14│
├─┼──┤
│b│21│
├─┼──┤
│c│82│
├─┼──┤
│d│85│
└─┴──┘
</code></pre>
<h1>note</h1>
<p>I will upvote if you write a key function that functionally returns an array/list.  (spirit of challenge is not to shortcut through actual data inputs)</p>
</div>
