# Start to Rummikub
<div class="md"><p><strong>Description</strong></p>
<p><a href="https://en.wikipedia.org/wiki/Rummikub">Rummikub</a> is a game consisting of 104 number tiles and two joker tiles. The number tiles range in value from one to thirteen, in four colors (we pick black, yellow, red and purple). Each combination of color and number is represented twice.</p>
<p>Players at start are given 14 random tiles. The main goal of the game is playout all the tiles you own on the field.</p>
<p>You either play your tiles on the field in <em>Groups</em> or <em>Runs</em>. All sets on the field need to consist of at least 3 tiles.</p>
<ul>
<li><em>Groups</em> are tiles consiting of the same number and having different colors. The biggest <em>group</em> you can make is one of 4 tiles (1 each color).</li>
<li><em>Runs</em> are tiles of the same color numbered in consecutive number order. You can't have a gap between 2 numbers (if this is the case and both sets have 3 or more tiles it is considered 2 runs)</li>
</ul>
<p>This challenge is a bit more lengthy, so I'll split it into 2 parts. </p>
<p><strong>Part I: Starting off</strong></p>
<p>To start off you need to play 1 or more sets where the total sum of the tiles are above 30. You can't use the jokers for the start of the game, so we will ingore them for now.</p>
<p>E.G.:</p>
<pre><code>Red 10, Purple 10, Black 10
</code></pre>
<p>or</p>
<pre><code>Black 5, Black 6, Black 7, Black 8
Yellow 2, Purple 2, Red 2
</code></pre>
<p>Are vallid plays to start with.</p>
<p>The first one is a <em>group</em> with the sum of 30, the second one is a combination of a <em>run</em> (26) and a <em>group</em> (6) that have the combined sum of 32.</p>
<p>For the first part of the challenge you need to search the set tiles and look for a good play to start with. If it is possible show the play, if not just show <code>Impossible</code>.</p>
<p><em>Input</em></p>
<pre><code>P12 P7 R2 R5 Y2 Y7 R9 B5 P3 Y8 P2 B7 B6 B8
</code></pre>
<p><em>Output</em></p>
<pre><code>B5 B6 B7 B8
Y2 P2 R2
</code></pre>
<p><em>Input</em></p>
<pre><code>P7 R5 Y2 Y13 R9 B5 P3 P7 R3 Y8 P2 B7 B6 B12
</code></pre>
<p><em>Output</em></p>
<pre><code>Impossibe
</code></pre>
<p>As you see the input is not in any specific order.</p>
<p>You can generate more <a href="https://dotnetfiddle.net/gQQTdT">here</a></p>
<p><strong>Part II: Grab tiles till we can play</strong></p>
<p>Now you create a tilebag that would give you random tiles until you can make a set of to start the game off.</p>
<p>The second input gives an <code>Impossible</code> as result, so now we need to add tiles till we can start the game.</p>
<p><em>Input</em></p>
<pre><code>P7 R5 Y2 Y13 R9 B5 P3 P7 R3 Y8 P2 B7 B6 B12
</code></pre>
<p><em>Possible output</em></p>
<pre><code>Grabbed:
B13
Y3
B10
R1
B11

Found set:
B10 B11 B12 B13
</code></pre>
<p>Formatting is totaly up to you.</p>
<p><strong>Bonus</strong></p>
<p>Always shows the <em>best</em> set to play if you have multiple.</p>
<p>The <em>best</em> set is the set consisting of the most tiles, not the highest score.</p>
<p><strong>Finally</strong></p>
<p>Have a good challenge idea?
Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
</div>
