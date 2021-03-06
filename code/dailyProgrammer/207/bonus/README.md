# Erdos Number Calculator
<div class="md"><p>In honor of the 102nd birthday of the famous mathematician, a problem named after him. </p>
<h1>Description</h1>
<p>Paul Erdős (1913–1996) was an influential mathematician who spent a large portion of his later life writing papers with a large number of colleagues, working on solutions to outstanding mathematical problems. The idea of the Erdős number was originally created by the mathematician's friends as a tribute to his enormous output. However, in later years it gained prominence as a tool to study how mathematicians cooperate to find answers to unsolved problems. </p>
<p>The Erdös number describes the "collaborative distance" between mathematician Paul Erdős and another person, as measured by authorship of mathematical papers. Erdös himself has a number of 0, anyone he co-authored a paper with has a number of 1, anyone they co-authored a paper with (without Erdös) has a number of 2, and so forth. </p>
<p>Several studies have shown that leading mathematicians tend to have particularly low Erdős numbers. For example, only 134,007 mathematicians have an Erdős number, with a median value of 5. In contrast, the median Erdős number of Fields Medalists is 3. Only 7,097 (about 5%) of mathematicians with a collaboration path have an Erdős number of 2 or less.</p>
<p>For this challenge you'll be working with a small, toy database of Erdős and related publications and be asked to calculate the Erdős number for several authors. </p>
<h1>Input Description</h1>
<p>You'll be given 2 integers on the first line, <em>N</em> and <em>M</em>. <em>N</em> is the number of of papers in APA format showing authors, titles, journals, and the like; think of it as a mini database. <em>M</em> is the number of authors to identify the Erdős number for. Note that all of the names should be in the same format of last name, then first and middle initials. </p>
<h1>Output</h1>
<p>Your program should emit the name of the mathematician and their Erdős number.</p>
<h1>Challenge Input</h1>
<pre><code>7 4
Thomassen, C., Erdös, P., Alavi, Y., Malde, P. J., &amp; Schwenk, A. J. (1989). Tight bounds on the chromatic sum of a connected graph. Journal of Graph Theory, 13(3), 353-357.
Burr, S., Erdös, P., Faudree, R. J., Rousseau, C. C., &amp; Schelp, R. H. (1988). Some complete bipartite graph—tree Ramsey numbers. Annals of Discrete Mathematics, 41, 79-89.
Burris, A. C., &amp; Schelp, R. H. (1997). Vertex-distinguishing proper edge-colorings. Journal of graph theory, 26(2), 73-82.
Balister, P. N., Gyo˝ ri, E., Lehel, J., &amp; Schelp, R. H. (2007). Adjacent vertex distinguishing edge-colorings. SIAM Journal on Discrete Mathematics, 21(1), 237-250.
Erdös, P., &amp; Tenenbaum, G. (1989). Sur les fonctions arithmétiques liées aux diviseurs consécutifs. Journal of Number Theory, 31(3), 285-311.
Hildebrand, A., &amp; Tenenbaum, G. (1993). Integers without large prime factors. Journal de théorie des nombres de Bordeaux, 5(2), 411-484.
Balister, P. N., Riordan, O. M., &amp; Schelp, R. H. (2003). Vertex‐distinguishing edge colorings of graphs. Journal of graph theory, 42(2), 95-109.
Schelp, R. H.
Burris, A. C.
Riordan, O. M.
Balister, P. N.
</code></pre>
<h1>Challenge Output</h1>
<pre><code>Schelp, R. H. 1
Burris, A. C. 2
Riordan, O. M. 2
Balister, P. N. 2
</code></pre>
<h1>Notes</h1>
<p>This challenge is a shameless rip off of <a href="http://www.programming-challenges.com/pg.php?page=downloadproblem&amp;format=html&amp;probid=110206">http://www.programming-challenges.com/pg.php?page=downloadproblem&amp;format=html&amp;probid=110206</a>. It was too good to pass up; I did, however, compile my own challenge inputs and outputs. </p>
<p>A full list of Erdös publications is up here <a href="http://www.renyi.hu/%7Ep_erdos/Erdos.html">http://www.renyi.hu/~p_erdos/Erdos.html</a>. </p>
<h1>Finally</h1>
<p>Have a good challenge idea? Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
</div>
