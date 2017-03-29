# Balancing chemical equations
<div class="md"><h1>Description</h1>
<p>Rob was just learning to balance chemical equations from his teacher, but Rob was also a programmer, so he wanted to automate the process of doing it by hand. Well, it turns out that Rob isn't a great programmer, and so he's looking to you for help. Can you help him out?</p>
<p>Balancing chemical equations is pretty straight forward - it's all in conservation of mass. Remember this: A balanced equation MUST have EQUAL numbers of EACH type of atom on BOTH sides of the arrow. Here's a great tutorial on the subject: <a href="http://www.chemteam.info/Equations/Balance-Equation.html">http://www.chemteam.info/Equations/Balance-Equation.html</a> </p>
<h1>Input</h1>
<p>The input is a chemical equation without amounts. In order to make this possible in pure ASCII, we write any subscripts as ordinary numbers. Element names always start with a capital letter and may be followed by a lowercase letter (e.g. Co for cobalt, which is different than CO for carbon monoxide, a C carbon and an O oxygen). The molecules are separated with + signs, an ASCII-art arrow -&gt; is inserted between both sides of the equation and represents the reaction:</p>
<pre><code>Al + Fe2O4 -&gt; Fe + Al2O3
</code></pre>
<h1>Output</h1>
<p>The output of your program is the input equation augmented with extra numbers. The number of atoms for each element must be the same on both sides of the arrow. For the example above, a valid output is:</p>
<pre><code>8Al + 3Fe2O4 -&gt; 6Fe + 4Al2O3  
</code></pre>
<p>If the number for a molecule is 1, drop it. A number must always be a positive integer. Your program must yield numbers such that their sum is minimal. For instance, the following is illegal:</p>
<pre><code> 800Al + 300Fe2O3 -&gt; 600Fe + 400Al2O3
</code></pre>
<p>If there is not any solution print:</p>
<pre><code>Nope!
</code></pre>
<p>for any equation like</p>
<pre><code> Pb -&gt; Au
</code></pre>
<p>(FWIW that's transmutation, or alchemy, and is simply not possible - lead into gold.) </p>
<p>Preferably, format it neatly with spaces for greater readability but if and only if it's not possible, format your equation like:</p>
<pre><code>Al+Fe2O4-&gt;Fe+Al2O3
</code></pre>
<h1>Challenge inputs</h1>
<pre><code>C5H12 + O2 -&gt; CO2 + H2O
Zn + HCl -&gt; ZnCl2 + H2
Ca(OH)2 + H3PO4 -&gt; Ca3(PO4)2 + H2O
FeCl3 + NH4OH -&gt; Fe(OH)3 + NH4Cl
K4[Fe(SCN)6] + K2Cr2O7 + H2SO4 -&gt; Fe2(SO4)3 + Cr2(SO4)3 + CO2 + H2O + K2SO4 + KNO3
</code></pre>
<h1>Challenge outputs</h1>
<pre><code>C5H12 + 8O2 -&gt; 5CO2 + 6H2O
Zn + 2HCl -&gt; ZnCl2 + H2
3Ca(OH)2 + 2H3PO4 -&gt; Ca3(PO4)2 + 6H2O
FeCl3 + 3NH4OH -&gt; Fe(OH)3 + 3NH4Cl
6K4[Fe(SCN)6] + 97K2Cr2O7 + 355H2SO4 -&gt; 3Fe2(SO4)3 + 97Cr2(SO4)3 + 36CO2 + 355H2O + 91K2SO4 +  36KNO3
</code></pre>
<h1>Credit</h1>
<p>This challenge was created by <a href="/u/StefanAlecu">/u/StefanAlecu</a>, many thanks for their submission. If you have any challenge ideas, please share them using <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and there's a chance we'll use them.</p>
</div>
