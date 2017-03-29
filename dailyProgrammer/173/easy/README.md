# Unit Calculator
<div class="md"><h1><a href="#EasyIcon"></a> _(Easy): Unit Calculator</h1>
<p>You have a 30-centimetre ruler. Or is it a 11.8-inch ruler? Or is it even a 9.7-attoparsec ruler? It means the same thing, of course, but no-one can quite decide which one is the standard. To help people with this often-frustrating situation you've been tasked with creating a calculator to do the nasty conversion work for you.</p>
<p>Your calculator must be able to convert between metres, inches, miles and <a href="https://www.google.com/search?q=attoparsec">attoparsecs</a>. It must also be able to convert between kilograms, pounds, ounces and <a href="http://www.wolframalpha.com/input/?i=mass+of+1+hogshead+of+berylliumm">hogsheads of Beryllium</a>.</p>
<h2>Input Description</h2>
<p>You will be given a request in the format: <strong>N</strong> oldUnits to newUnits</p>
<p>For example:</p>
<pre><code>3 metres to inches
</code></pre>
<h2>Output Description</h2>
<p>If it's possible to convert between the units, print the output as follows:</p>
<pre><code>3 metres is 118.1 inches
</code></pre>
<p>If it's not possible to convert between the units, print as follows:</p>
<pre><code>3 metres can't be converted to pounds
</code></pre>
<h1>Notes</h1>
<p>Rather than creating a method to do each separate type of conversion, it's worth storing the ratios between all of the units in a 2-D array or something similar to that.</p>
</div>
