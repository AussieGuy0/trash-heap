# Bioinformatics 1: DNA Replication
<div class="md"><p>For this week my theme is bioinformatics, I hope you enjoy the taste of the field through these challenges. </p>
<h1>Description</h1>
<p>DNA - deoxyribonucleic acid - is the building block of every organism. It contains information about hair color, skin tone, allergies, and more.
<a href="http://cdn.theatlantic.com/static/mt/assets/science/shutterstock_34693498%20copy.jpg">It's usually visualized as a long double helix of base pairs.</a> DNA is composed of four bases - adenine, thymine, cytosine, guanine - paired as follows: A-T and G-C. </p>
<p>Meaning: on one side of the strand there may be a series of bases </p>
<pre><code>A T A A G C 
</code></pre>
<p>And on the other strand there will have to be</p>
<pre><code>T A T T C G
</code></pre>
<p>It is your job to generate one side of the DNA strand and output the two DNA strands. Your program should take a DNA sequence as input and return the complementary strand. </p>
<h1>Input</h1>
<pre><code>A A T G C C T A T G G C
</code></pre>
<h1>Output</h1>
<pre><code>A A T G C C T A T G G C
T T A C G G A T A C C G
</code></pre>
<h1>Extra Challenge</h1>
<p>Three base pairs make a codon. These all have different names based on what combination of the base pairs you have. A handy table can be found <a href="http://en.wikipedia.org/wiki/DNA_codon_table">here</a>.
The string of codons starts with an ATG (Met) codon ends when a STOP codon is hit.</p>
<p>For this part of the challenge, you should implement functionality for translating the DNA to a protein sequence based on the codons, recalling that every generated DNA strand starts with a Met codon and ends with a STOP codon. Your program should take a DNA sequence and emit the translated protein sequence, complete with a STOP at the terminus. </p>
<h1>Input</h1>
<pre><code>A T G T T T C G A G G C T A A
</code></pre>
<h1>Output</h1>
<pre><code>A T G T T T C G A G G C T A A
Met Phe Arg Gly STOP
</code></pre>
<h1>Credit</h1>
<p>Thanks to <a href="/u/wickys">/u/wickys</a> for the submission. If you have your own idea for a challenge, submit it to <a href="/r/DailyProgrammer_Ideas">/r/DailyProgrammer_Ideas</a>, and there's a good chance we'll post it.</p>
</div>
