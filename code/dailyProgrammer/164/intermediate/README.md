# Part 3 - Protect The Bunkers
<div class="md"><h2>Description</h2>
<p>Most of the residential buildings have been destroyed by the termites due to a bug in <a href="/u/1337C0D3R">/u/1337C0D3R</a>'s code. All of the civilians in our far-future society now live in bunkers of a curious design - the bunkers were poorly designed using the ASCII Architect and are thus not secure. If the bunkers are breached by a hostile force, it is almost certain that all the civilians will die.</p>
<p>The high-tech termites have developed a taste for human flesh. Confident from their victory at the building lines, they are now staging a full attack on the bunkers. The government has hired you to design protective walls against the termite attacks. However, their supplies are limited, so you must form a method to calculate the minimum amount of walls required.</p>
<p>A map of an area under assault by evil termites can be described as a 2d array of length m and width n. There are five types of terrain which make up the land:</p>
<ul>
<li>*: A termite nest. Termites can pass through here. The termites begin their assault here. Protective walls cannot be placed here.</li>
<li>#: Impassible terrain. Termites cannot pass through here. Protective walls cannot be placed here.</li>
<li>+: Unreliable terrain. Termites can pass through here. Protective walls cannot be placed here.</li>
<li>-: Reliable terrain. Termites can pass through here. Protective walls can be placed here.</li>
<li>o: Bunker. Termites can pass through here. If they do, the civilians die a horrible death. Protective walls cannot be placed here.</li>
</ul>
<p>Termites will begin their attack from the nest. They will then spread orthogonally (at right angles) through terrain they can pass through.</p>
<p>A map will always follow some basic rules:</p>
<ul>
<li>There will only be one nest.</li>
<li>Bunkers will always be in a single filled rectangle (i.e. a contiguous block).</li>
<li>A bunker will never be next to a nest.</li>
<li>There will always be a solution (although it may require a lot of walls).</li>
</ul>
<h2>Formal Inputs And Outputs</h2>
<h2>Input Description</h2>
<p>Input will be given on STDIN, read from a file map.txt, or supplied as a command line argument. The first line of input will contain 2 space separated integers m and n. Following that line are n lines with m space seperated values per line. Each value will be one of five characters: *, #, +, -, or o.</p>
<p>Input Limits</p>
<pre><code>1 &lt;= n &lt; 16
3 &lt;= m &lt; 16
</code></pre>
<h2>Output Description</h2>
<p>Output will be to STDOUT or written to a file output.txt. Output consists of a single integer which is the number of walls required to protect all the bunkers.</p>
<h2>Sample Inputs and Outputs</h2>
<h2>Sample Input 1</h2>
<p>6 6</p>
<p>#++++*</p>
<p>#-#+++</p>
<p>#--#++</p>
<p>#ooo--</p>
<p>#ooo-#</p>
<p>######</p>
<h2>Sample Output 1</h2>
<p>2</p>
<p>(The walls in this example are placed as follows, with @ denoting walls:</p>
<p>#++++* </p>
<p>#@#+++</p>
<p>#--#++</p>
<p>#ooo@-</p>
<p>#ooo-#</p>
<p>######</p>
<h2>Notes</h2>
<p>Thanks again to <a href="/u/202halffound">/u/202halffound</a></p>
</div>
