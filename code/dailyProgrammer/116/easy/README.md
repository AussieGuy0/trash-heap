# Permutation of a string
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Easy)</em>: Permutation of a string</h1>
<p>Write a function that prints all of the permutatons of the unique characters of a given string. For example, permute("baz") would print:</p>
<pre><code>baz
bza
abz
azb
zba
zab
</code></pre>
<p>Find all the permutations of daily.</p>
<p><em>Author: skeeto</em></p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>Your function should accept a single string variable which is guaranteed to be at least 1 character long.</p>
<h2>Output Description</h2>
<p>Print all permutations of the given string variable.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<p>Let the string argument be "ab"</p>
<h2>Sample Output</h2>
<p>All permutations of "ab" would be ["ab", "ba"]</p>
<h1>Challenge Input</h1>
<p>Let the string argument be "abbccc"</p>
<h2>Challenge Input Solution</h2>
<p>abbccc abcbcc abccbc abcccb acbbcc acbcbc acbccb accbbc accbcb acccbb babccc bacbcc baccbc bacccb bbaccc bbcacc bbccac bbccca bcabcc bcacbc bcaccb bcbacc bcbcac bcbcca bccabc bccacb bccbac bccbca bcccab bcccba cabbcc cabcbc cabccb cacbbc cacbcb caccbb cbabcc cbacbc cbaccb cbbacc cbbcac cbbcca cbcabc cbcacb cbcbac cbcbca cbccab cbccba ccabbc ccabcb ccacbb ccbabc ccbacb ccbbac ccbbca ccbcab ccbcba cccabb cccbab cccbba </p>
<h1>Note</h1>
<ul>
<li><p>Bonus 1: Instead of printing, be functional. Return a collection (array, etc.) of the permutations.</p></li>
<li><p>Bonus 2: Correctly handle the case when the input contains a character multiple times. That is, don't output repeats and ensure the output contains the same number of characters as the input. For example, there are three permutations of foo: foo, ofo, oof.</p></li>
<li><p>Note that this challenge is a near-duplicate of challenge #12, hence why there is the above "bonus" challenges</p></li>
</ul>
</div>
