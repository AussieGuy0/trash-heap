# Guess my hat color
<div class="md"><h1>Description</h1>
<p>You are the game master of the game "Guess my hat color".</p>
<p>The game goes as following:</p>
<ul>
<li>You put a group of <code>n</code> people in one row, each facing the same direction</li>
<li>You assign a collored hat to each person of the group</li>
<li>Now you let each person guess the color of their own hat, starting with the last person in the row.</li>
</ul>
<p>There are only 2 colors of hats and each person can only see the color of hats in front of them.
The group wins from the gamemaster if they can win by making only 1 mistake.</p>
<p>The challenge today is to write the logic to make the guess.</p>
<p>The person guessing can only see the persons in front of them (and their hats) and can hear the guesses from the persons behind them. 
They can <strong>NEVER</strong> look behind them or look at their own hat.</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input description</h2>
<p>You get the list of hat colors starting with the person in the back and going to the front</p>
<h3>Input 1 - 10 hats</h3>
<pre><code>Black
White
Black
Black
White
White
Black
White
White
White
</code></pre>
<h3>Input 2 - 11 hats</h3>
<pre><code>Black
Black
White
White
Black
Black
White
Black
White
White
White
</code></pre>
<h3>Input 3 - 10 hats</h3>
<pre><code>Black
Black
Black
Black
Black
Black
Black
Black
Black
White
</code></pre>
<h2>Output description</h2>
<p>You have to show the guesses of the persons and whether they passed the challenge (they should if your logic is correct).</p>
<h1>Notes/Hints</h1>
<p>Obviously if you return at random <code>Black</code> or <code>White</code> this won't work. The person units will have to work togheter to get a result with maximum 1 mistake.</p>
<p>There is no fixed ratio, neither do the participants know what the ratio is.</p>
<h1>An example for the layout</h1>
<p>You have 4 people with lined up like this:</p>
<pre><code>Black -&gt; White -&gt; White -&gt; Black
</code></pre>
<p>The one in the back can see:</p>
<pre><code>White -&gt; White -&gt; Black
</code></pre>
<p>The second one sees:</p>
<pre><code>White -&gt; Black
</code></pre>
<p>And so on...</p>
<h1>Bonus</h1>
<p><a href="https://gist.github.com/fvandepitte/8ab2e2ab0e42e3d4c731">Here you have a large set (10000 hats)</a>. 
Make sure your program can handle this.</p>
<h1>Finally</h1>
<p>Have a good challenge idea?</p>
<p>Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
<p><strong>EDIT</strong> Added notes</p>
<p>Thanks to <a href="/u/355over113">/u/355over113</a> for pointing out a typo</p>
</div>
