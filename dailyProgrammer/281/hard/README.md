# Minesweeper Solver
<div class="md"><h1>Description</h1>
<p>In this challenge you will come up with an algorithm to solve the classic game of <a href="http://minesweeperonline.com/">Minesweeper</a>.
The brute force approach is impractical since the search space size is anywhere around 10<sup>20</sup> to 10<sup>100</sup> depending on the situation, you'll have to come up with something clever.</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input description</h2>
<p>The current field state where each character represents one field. Flags will not be used. 
Hidden/unknown fields are denoted with a '?'.<br/>
'Zero-fields' with no mines around are denoted with a space.</p>
<p>Example for a 9x9 board:</p>
<pre><code>    1????
    1????
    111??
      1??
1211  1??
???21 1??
????211??
?????????
?????????
</code></pre>
<h2>Output description</h2>
<p>A list of zero-based row and column coordinates for the fields that you have determined to be <strong>SAFE</strong>. For the above input example this would be:</p>
<pre><code>0 5
1 6
1 7
2 7
3 7
5 1
5 7
6 2
6 7
</code></pre>
<p>The list does not need to be ordered.</p>
<h2>Challenge input</h2>
<p>As suggested by <a href="/u/wutaki">/u/wutaki</a>, this input is a greater challenge then the original input</p>
<pre><code>??????
???2??
???4??
?2??2?
?2222?
?1  1?
</code></pre>
<h1>Notes/Hints</h1>
<p>If you have no idea where to start I suggest you play the game for a while and try to formalize your strategy.</p>
<p>Minesweeper is a game of both logic and luck. <a href="http://i.imgur.com/yLhxzrl.jpg">Sometimes it is impossible</a> to find free fields through logic. The right output would then be an empty list. Your algorithm does not need to guess.</p>
<h1>Bonus</h1>
<p>Extra hard mode: Make a closed-loop bot. It should take a screenshot, parse the board state from the pixels, run the algorithm and manipulate the cursor to execute the clicks.</p>
<p><em>Note: If this idea is selected for submission I'll be able to provide lots of input/output examples using my own solution.</em></p>
<h1>Finally</h1>
<p>Have a good challenge idea like <a href="/u/janismac">/u/janismac</a> did?</p>
<p>Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
</div>
