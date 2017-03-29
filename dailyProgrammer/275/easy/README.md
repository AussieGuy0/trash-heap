# Splurthian Chemistry 101
<div class="md"><h1>Description</h1>
<p>The inhabitants of the planet Splurth are building their own <a href="https://en.wikipedia.org/wiki/Periodic_table#Overview">periodic table of the elements</a>. Just like Earth's periodic table has a chemical symbol for each element (<code>H</code> for Hydrogen, <code>Li</code> for Lithium, etc.), so does Splurth's. However, their chemical symbols must follow certain rules:</p>
<ol>
<li>All chemical symbols must be exactly two letters, so <code>B</code> is not a valid symbol for Boron.</li>
<li>Both letters in the symbol must appear in the element name, but the first letter of the element name does not necessarily need to appear in the symbol. So <code>Hg</code> is not valid for Mercury, but <code>Cy</code> is.</li>
<li>The two letters must appear in order in the element name. So <code>Vr</code> is valid for Silver, but <code>Rv</code> is not. To be clear, both <code>Ma</code> and <code>Am</code> are valid for Magnesium, because there is both an <code>a</code> that appears after an <code>m</code>, and an <code>m</code> that appears after an <code>a</code>.</li>
<li>If the two letters in the symbol are the same, it must appear twice in the element name. So <code>Nn</code> is valid for Xenon, but <code>Xx</code> and <code>Oo</code> are not.</li>
</ol>
<p>As a member of the Splurth Council of Atoms and Atom-Related Paraphernalia, you must determine whether a proposed chemical symbol fits these rules.</p>
<h1>Details</h1>
<p>Write a function that, given two strings, one an element name and one a proposed symbol for that element, determines whether the symbol follows the rules. If you like, you may parse the program's input and output the result, but this is not necessary.</p>
<p>The symbol will have exactly two letters. Both element name and symbol will contain only the letters a-z. Both the element name and the symbol will have their first letter capitalized, with the rest lowercase. (If you find that too challenging, it's okay to instead assume that both will be completely lowercase.)</p>
<h1>Examples</h1>
<pre><code>Spenglerium, Ee -&gt; true
Zeddemorium, Zr -&gt; true
Venkmine, Kn -&gt; true
Stantzon, Zt -&gt; false
Melintzum, Nn -&gt; false
Tullium, Ty -&gt; false
</code></pre>
<h1>Optional bonus challenges</h1>
<ol>
<li>Given an element name, find the valid symbol for that name that's first in alphabetical order. E.g. <code>Gozerium -&gt; Ei</code>, <code>Slimyrine -&gt; Ie</code>.</li>
<li>Given an element name, find the number of distinct valid symbols for that name. E.g. <code>Zuulon -&gt; 11</code>.</li>
<li>The planet Blurth has similar symbol rules to Splurth, but symbols can be any length, from 1 character to the entire length of the element name. Valid Blurthian symbols for <code>Zuulon</code> include <code>N</code>, <code>Uuo</code>, and <code>Zuuln</code>. Complete challenge #2 for the rules of Blurth. E.g. <code>Zuulon -&gt; 47</code>.</li>
</ol>
</div>
