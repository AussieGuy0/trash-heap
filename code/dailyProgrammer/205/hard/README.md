# DNA and Protein Sequence Alignment
<div class="md"><h1>Description</h1>
<p>If you are studying a particular pair of genes or proteins, an important question is to what extent the two sequences are similar. To quantify similarity, it is necessary to align the two sequences, and then you can calculate a similarity score based on the alignment.</p>
<p>There are two types of alignment in general. A global alignment is an alignment of the full length of two sequences, for example, of two protein sequences or of two DNA sequences. A local alignment is an alignment of part of one sequence to part of another sequence.</p>
<p>Alignment treats the two inputs as a linear sequence to be lined up as much as possible, with optional gaps and conversions allowed. The goal is to minimize these differences. </p>
<p>The first step in computing a sequence alignment is to decide on a scoring system. For this exercise, we'll simplify this and give a score of +2 to a match and a penalty of -1 to a mismatch, and a penalty of -2 to a gap. </p>
<p>Here's a small example. Our two DNA sequences to align:</p>
<pre><code>CTCTAGCATTAG
GTGCACCCA
</code></pre>
<p>One alignment might look like this:</p>
<pre><code>CTCTAGCATTAG
GT---GCACCCA
</code></pre>
<p>But that one adds three gaps. We can do a bit better with only one gap added (and a small shift in starting position):</p>
<pre><code>CTCTAGCATTAG
  GT-GCACCCA
</code></pre>
<p>While not an exact match, it now minimizes the conversion penalties between the two and aligns them as best we can. </p>
<p>For more information and how to do this using an R package, see the chapter <a href="http://a-little-book-of-r-for-bioinformatics.readthedocs.org/en/latest/src/chapter4.html">"Pairwise Sequence Alignment"</a>, or <a href="http://www.seas.gwu.edu/%7Esimhaweb/cs151/lectures/module12/align.html">this set of lecture notes from George Washington University</a>. The key algorithm is <a href="http://en.wikipedia.org/wiki/Needleman%E2%80%93Wunsch_algorithm">Needleman-Wunsch</a>.</p>
<p>For this challenge your task is to write a program that accepts two sequences and globally aligns them. If you want to make this harder and integrate the BLOSUM matrices, you may. </p>
<h1>Input Description</h1>
<p>You'll be given two sequences on two lines, one line per sequence. They'll be the same type of input, DNA or protein. </p>
<h1>Output Description</h1>
<p>Your program should emit the aligned sequences with gaps introduced represented by dashed ("-"). </p>
<h1>Input</h1>
<p>DNA example</p>
<pre><code>GACGTACGTACGTACGTACGTACGTACGTACGTACGTACGTACGTACGTAC
ACGTACGTACGTACGTACGTACGTACGTACGTACGTACGTACGTAC
</code></pre>
<p>Protein example</p>
<pre><code>    MTNRTLSREEIRKLDRDLRILVATNGTLTRVLNVVANEEIVVDIINQQLLDVAPKIPELENLKIGRILQRDILLKGQKSGILFVAAESLIVIDLLPTAITTYLTKTHHPIGEIMAASRIETYKEDAQVWIGDLPCWLADYGYWDLPKRAVGRRYRIIAGGQPVIITTEYFLRSVFQDTPREELDRCQYSNDIDTRSGDRFVLHGRVFKN
    MLAVLPEKREMTECHLSDEEIRKLNRDLRILIATNGTLTRILNVLANDEIVVEIVKQQIQDAAPEMDGCDHSSIGRVLRRDIVLKGRRSGIPFVAAESFIAIDLLPPEIVASLLETHRPIGEVMAASCIETFKEEAKVWAGESPAWLELDRRRNLPPKVVGRQYRVIAEGRPVIIITEYFLRSVFEDNSREEPIRHQRSVGTSARSGRSICT
</code></pre>
<h1>Output</h1>
<p>DNA example</p>
<pre><code>GACGTACGTACGTACGTACGTACGTACGTACGTACGTACGTACGTACGTAC
 ACGTACGTACGTACGTACGTACGTACGTACGTACGTACGTACGTAC
</code></pre>
<p>Protein example</p>
<pre><code>          MTNRTLSREEIRKLDRDLRILVATNGTLTRVLNVVANEEIVVDIINQQLLDVAPKIPELENLKIGRILQRDILLKGQKSGILFVAAESLIVIDLLPTAITTYLTKTHHPIGEIMAASRIETYKEDAQVWIGDLPCWLADYGYWDLPKRAVGRRYRIIAGGQPVIITTEYFLRSVFQDTPREELDRCQYSNDIDTRSGDRFVLHGRVFKN
MLAVLPEKREMTECHLSDEEIRKLNRDLRILIATNGTLTRILNVLANDEIVVEIVKQQIQDAAPEMDGCDHSSIGRVLRRDIVLKGRRSGIPFVAAESFIAIDLLPPEIVASLLETHRPIGEVMAASCIETFKEEAKVWAGESPAWLELDRRRNLPPKVVGRQYRVIAEGRPVIIITEYFLRSVFEDNSREEPIRHQRS--VGT-SA-R---SGRSICT
</code></pre>
<h1>Notes</h1>
<p>Once you have a simple NW algorithm implemented, you can alter the cost matrices. In the bioinformatics field, the PAM and BLOSUM matrices are the standards. You can find them here: <a href="ftp://ftp.ncbi.nih.gov/blast/matrices/">ftp://ftp.ncbi.nih.gov/blast/matrices/</a> </p>
<p>Have a cool challenge idea? Post it to <a href="/r/DailyProgrammer_Ideas">/r/DailyProgrammer_Ideas</a>!</p>
</div>
