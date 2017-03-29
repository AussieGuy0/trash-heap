# Game of Text Life
<div class="md"><h1>Description</h1>
<p>John Conway's <a href="https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life">Game of Life</a> is a classic game among computer programmers and mathematicians. </p>
<p>The basic idea is this: the game takes place on an infinite 2D grid of cells. Cells can be either "alive" or "dead". The game evolves in generations, where old cells die out or are born again according to very simple rules. The game can inhibit remarkably complex patterns despite the simplicity of the rules, which is why it's called "Game of Life". It's as if the little cells become living organisms. </p>
<p>The rules are as follows: </p>
<ul>
<li>Any cell that is alive and zero or just one living neighbor is dead in the next generation</li>
<li>Any cell that is alive and has two or three living neighbors lives happily on to the next generation</li>
<li>Any cell that is alive and has four or more neighbors get "smothered" and is dead in the next generation</li>
<li>Any cell that is dead and has exactly three neighbors is "born", and is thus alive in the next generation. </li>
</ul>
<p>To be clear, a "neighbor" is defined as a cell that's right next another cell, either horizontally, vertically or diagonally.</p>
<p>If something is unclear or you need more information, I highly recommend reading <a href="https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life">Game of Life's Wikipedia entry</a> for a more thorough description of the rules. </p>
<p>Usually, "alive" cells are filled in and black and "dead" cells are just white. In ASCII you could represent alive cells with asterisks and dead cells with spaces. So, if one generation of the Game of Life looks like this</p>
<pre><code> **
**
 *
</code></pre>
<p>Then the next generation will look like this: </p>
<pre><code>***
* 
** 
</code></pre>
<p>Poor little middle dude has died, but a bunch of new ones have been born. </p>
<p>There is, however, no law that says that the alive cells <em>have</em> to be represented by asterisks. It could be any text, really. So then we could have this first generation: </p>
<pre><code> He
ll
 o
</code></pre>
<p>Which leads to this generation</p>
<pre><code>lHe
l 
lo
</code></pre>
<p>Notice that the character that represents newly born cells are selected randomly from the three neighbors that spawned it.
Your challenge today is to implement this variation of the Game of Life. </p>
<h1>Formal inputs &amp; outputs</h1>
<p>Since there's a random component to this challenge (i.e. which character a newly born cell will be, your solutions obviously don't have to match these character for character)</p>
<h2>Inputs</h2>
<p>You will receive a number of lines which you will play the Game of Life on.</p>
<h2>Outputs</h2>
<p>You will output the next generation of the "textual" Game of Life according to the rules laid up above.</p>
<p>There is one more rule that deserves mention: in normal Game of Life, you play on an infinite grid. Here, the size of the grid is the smallest rectangle that can fit the input. No cells can be born outside of it. </p>
<h1>Sample inputs</h1>
<h2>Input 1</h2>
<pre><code> He
ll
 o
</code></pre>
<h2>Output 1</h2>
<pre><code>lHe
l 
lo
</code></pre>
<h2>Input 2</h2>
<pre><code>What? 
This is exceedingly silly. 

Really, we would like some ACTUAL programming challenges around here. 
</code></pre>
<h2>Output 2</h2>
<pre><code>W   ??   exceeding   sill
T    i   xceedingl   illy
                          . ACTU   programmi   challeng   arou   her
 eally      oul   ik   om   CTUA   rogrammin   hallenge   roun   ere
</code></pre>
<h1>Challenge inputs</h1>
<p>The challenge outputs will perhaps be a bit long, so consider using a service like <a href="http://hastebin.com">hastebin</a> or  <a href="http://gist.github.com">gist</a> to share your results instead of pasting them into your comments. </p>
<h2>Challenge 1</h2>
<p>The full text of this post (either the markdown source, or just copy the text itself)</p>
<h2>Challenge 2</h2>
<p>The source code for your own program. If you use tabs instead of spaces to indent your code, you can treat those like a single space, or you can treat them like four or eight spaces, whichever it is you use when you write your code. </p>
<h1>Bonus</h1>
<p>Apply your program over and over again to your source code, so that you get an animated game of life (maybe make a plugin that does this for your favorite editor?) and upload a video of it. It can be an animated gif, a webm, a giphy, a youtube, or whatever it is the kids are using nowadays (if you want to make a Vine of your code being destroyed by the Game of Life, don't let me stop you). </p>
<h1>Notes</h1>
<p>As always, if you have a challenge suggestion, head on over to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and suggest it. </p>
<p>By the way, I've gotten several comments saying that the easy problem from this week was a bit too difficult. Mea culpa, sometimes you misjudge the difficulty of a problem when you design it. I do really appreciate it when readers point out whether they think a problem is too difficult or too easy for the difficulty level, as long as you do so in a pleasant manner. Constructive feedback is always welcome. :)</p>
</div>
