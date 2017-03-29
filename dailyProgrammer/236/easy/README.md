# Random Bag System
<div class="md"><h1>Description</h1>
<p>Contrary to popular belief, the <a href="http://i.imgur.com/65G37Aq.png">tetromino pieces</a> you are given in a game of <a href="https://en.wikipedia.org/wiki/Tetris">Tetris</a> are not randomly selected. Instead, all seven pieces are placed into a "bag." A piece is randomly removed from the bag and presented to the player until the bag is empty. When the bag is empty, it is refilled and the process is repeated for any additional pieces that are needed.  </p>
<p>In this way, it is assured that the player will never go too long without seeing a particular piece. It is possible for the player to receive two identical pieces in a row, but never three or more. Your task for today is to implement this system.  </p>
<h1>Input Description</h1>
<p>None.  </p>
<h1>Output Description</h1>
<p>Output a string signifying 50 tetromino pieces given to the player using the random bag system. This will be on a single line.</p>
<p>The <a href="http://i.imgur.com/65G37Aq.png">pieces</a> are as follows:  </p>
<ul>
<li><code>O</code></li>
<li><code>I</code></li>
<li><code>S</code></li>
<li><code>Z</code></li>
<li><code>L</code></li>
<li><code>J</code></li>
<li><code>T</code><br/></li>
</ul>
<h1>Sample Inputs</h1>
<p>None.  </p>
<h1>Sample Outputs</h1>
<ul>
<li><code>LJOZISTTLOSZIJOSTJZILLTZISJOOJSIZLTZISOJTLIOJLTSZO</code></li>
<li><code>OTJZSILILTZJOSOSIZTJLITZOJLSLZISTOJZTSIOJLZOSILJTS</code></li>
<li><code>ITJLZOSILJZSOTTJLOSIZIOLTZSJOLSJZITOZTLJISTLSZOIJO</code><br/></li>
</ul>
<h1>Note</h1>
<p>Although the output is semi-random, you can verify whether it is likely to be correct by making sure that pieces do not repeat within chunks of seven.  </p>
<h1>Credit</h1>
<p>This challenge was developed by <a href="/u/chunes">/u/chunes</a> on <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a>. If you have any challenge ideas please share them there and there's a chance we'll use them.</p>
<h1>Bonus</h1>
<p>Write a function that takes your output as input and verifies that it is a valid sequence of pieces.</p>
</div>
