# DNA Shotgun Sequencing
<div class="md"><h1>Description</h1>
<p>DNA sequences are made up of a 4 character alphabet - A, C, T or G, that describe the nucleotide bases in a gene sequence. To ascertain the sequence of DNA, scientists use chemical methods to identify the component nucleotides in a method called DNA sequencing. DNA <em>shotgun</em> sequencing is a method whereby DNA subsequences of the same larger sequence are produced at massive parallel scale by DNA sequencing methods, and the overlap between segments is used to reconstruct the input gene. This is a fast and accurate method, and is dropping in price. Shotgun sequencing was used to perform the first entire sequence of a human's DNA, for example. For additional background information, see <a href="http://en.wikipedia.org/wiki/Shotgun_sequencing">Wikipedia on shotgun sequencing</a>. </p>
<p>You're working in a DNA laboratory and you have to reconstruct a gene's sequence from a series of fragments!</p>
<h1>Formal Input Description</h1>
<p>You'll be given a series of DNA sequence fragments, which include overlaps with neighbor sequences, but not in any specific order - it's random. Your job is to read in the fragments and reconstruct the input DNA sequence that lead to the fragments. </p>
<h1>Formal Output Description</h1>
<p>Your program should emit the DNA sequence it calculated. </p>
<h1>Sample Input</h1>
<p>You'll be given the DNA sequence of one of the strands of DNA (e.g. no complementarity calculations or inferences required) using the DNA alphabet of "a,t,c,g". Assume no read errors, also. Example:</p>
<pre><code>    tgca
    taggcta
    gtcatgcttaggcta
    agcatgctgcag
    tcatgct
</code></pre>
<h1>Sample Output</h1>
<p>Your program should emit the shortest DNA sequence that would contain the above fragments. Example:</p>
<pre><code>    agcatgctgcagtcatgcttaggcta
</code></pre>
<h1>Challenge Input</h1>
<pre><code>    gatccatctggatcctatagttcatggaaagccgctgc
    tatttcaacattaattgttggttttgatacagatggtacacca
    aaaagaaattcaaaaagaacaagaaaaatctgaaaaacaacaaaa
    ggaatgtcaatcctatagattaactgttgaagattcaccatcagttg
    tggaaataaaaatattgaaattgcagtcattagaaataaacaac
    tcaagtagaatatgccatggaagcagtaagaaaaggtactgttg
    tgcaagatcaattagaaaaatcgttaaattagatgaccacatt
    tgtcgttgaagctgaaaaagaaattcaaaaagaacaagaaaaatct
    gaaaaacaacaaaaataaattacatcaaattccttttttt
    caatcgttttattagatgaacaagaaattgataaattagttgc
    aatctttatcaaactgatccatctggatcctatagttcatg
    gaaattgcagtcattagaaataaacaaccaatcgttttattagatg
    atcgttaaattagatgaccacatttgtttaacctttgctggt
    aattatacagacgttagtgaagaggaatcaattaaattagcagtta
    tatactcaaagtggtggtgttagaccatttggtatttcaacattaat
    ttttaggtgttgaaaagaaagcaaccgctaaacttcaaga
    aagaaagcaaccgctaaacttcaagatgcaagatcaattagaaaa
    ccccacctttttttttaattatcttcaagtttttttaaaaaaaaaaaaaaaa
    gaatttttagaaaagaattatacagacgttagtgaagaggaatc
    agtgcaagatacgatagagcaattacagttttctcaccagatg
    aattaaattagcagttagagctttattagagattgttgaaag
    cagttggtgtacgtggtaaagatgttattgttttaggtgttgaa
    ttcaacaacgttatactcaaagtggtggtgttagaccatttgg
    ataaattacatcaaattcctttttttccccacctttttttt
    aattggtcgtagttcaaagagtgttggtgaatttttagaaaag
    aatatatttctaaatttattgctggtattcaacaacgt
    aacaagaaattgataaattagttgctgtcgttgaagctga
    gagctttattagagattgttgaaagtggaaataaaaatatt
    ttaactgccgattcacgtgtattaattagtaaagcattaat
    acgatagagcaattacagttttctcaccagatggtcatctttt
    aaggtactgttgcagttggtgtacgtggtaaagatgttattg
    tgtttaacctttgctggtttaactgccgattcacgtgtattaatt
    aataatataatatatatataaatacataataatgtcaagtgcaagat
    agtaaagcattaatggaatgtcaatcctatagattaactgt
    tgaagattcaccatcagttgaatatatttctaaatttattgctggta
    gaaagccgctgcaattggtcgtagttcaaagagtgttggt
    gtcatctttttcaagtagaatatgccatggaagcagtaagaa
    tgttggttttgatacagatggtacaccaaatctttatcaaact
</code></pre>
<h1>Challenge Input Solution</h1>
<pre><code>    aataatataatatatatataaatacataataatgtcaagtgcaagatacgatagagcaattacagttttctcaccagatggtcatctttttcaagtagaatatgccatggaagcagtaagaaaaggtactgttgcagttggtgtacgtggtaaagatgttattgttttaggtgttgaaaagaaagcaaccgctaaacttcaagatgcaagatcaattagaaaaatcgttaaattagatgaccacatttgtttaacctttgctggtttaactgccgattcacgtgtattaattagtaaagcattaatggaatgtcaatcctatagattaactgttgaagattcaccatcagttgaatatatttctaaatttattgctggtattcaacaacgttatactcaaagtggtggtgttagaccatttggtatttcaacattaattgttggttttgatacagatggtacaccaaatctttatcaaactgatccatctggatcctatagttcatggaaagccgctgcaattggtcgtagttcaaagagtgttggtgaatttttagaaaagaattatacagacgttagtgaagaggaatcaattaaattagcagttagagctttattagagattgttgaaagtggaaataaaaatattgaaattgcagtcattagaaataaacaaccaatcgttttattagatgaacaagaaattgataaattagttgctgtcgttgaagctgaaaaagaaattcaaaaagaacaagaaaaatctgaaaaacaacaaaaataaattacatcaaattcctttttttccccacctttttttttaattatcttcaagtttttttaaaaaaaaaaaaaaaa
</code></pre>
<h1>Credit</h1>
<p>This same idea - shortest common superstring - was also suggested by <a href="/u/202halffound">/u/202halffound</a>, many thanks! If you have your own idea for a challenge, submit it to <a href="/r/DailyProgrammer_Ideas">/r/DailyProgrammer_Ideas</a>, and there's a good chance we'll post it.</p>
</div>
