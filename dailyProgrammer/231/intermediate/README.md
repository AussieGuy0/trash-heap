# Set Game Solver
<div class="md"><p>Our apologies for the delay in getting this posted, there was some technical difficulties behind the scenes. </p>
<h1>Description</h1>
<p>Set is a card game where each card is defined by a combination of four attributes: shape (diamond, oval, or squiggle), color (red, purple, green), number (one, two, or three elements), and shading (open, hatched, or filled). The object of the game is to find sets in the 12 cards drawn at a time that are distinct in every way or identical in just one way (e.g. all of the same color). From Wikipedia: A set consists of three cards which satisfy all of these conditions:</p>
<ul>
<li>They all have the same number, or they have three different numbers.</li>
<li>They all have the same symbol, or they have three different symbols.</li>
<li>They all have the same shading, or they have three different shadings.</li>
<li>They all have the same color, or they have three different colors.</li>
</ul>
<p>The rules of Set are summarized by: If you can sort a group of three cards into "Two of ____ and one of _____," then it is not a set.</p>
<p>See the <a href="http://en.wikipedia.org/wiki/Set_(game)">Wikipedia page for the Set game</a>
 for for more background. </p>
<h1>Input Description</h1>
<p>A game will present 12 cards described with four characters for shape, color, number, and shading: (D)iamond, (O)val, (S)quiggle; (R)ed, (P)urple, (G)reen; (1), (2), or (3); and (O)pen, (H)atched, (F)illed.</p>
<h1>Output Description</h1>
<p>Your program should list all of the possible sets in the game of 12 cards in sets of triplets.</p>
<h1>Example Input</h1>
<pre><code>SP3F
DP3O
DR2F
SP3H
DG3O
SR1H
SG2O
SP1F
SP3O
OR3O
OR3H
OR2H
</code></pre>
<h1>Example Output</h1>
<pre><code>SP3F SR1H SG2O
SP3F DG3O OR3H
SP3F SP3H SP3O
DR2F SR1H OR3O
DG3O SP1F OR2H
DG3O SP3O OR3O
</code></pre>
<h1>Challenge Input</h1>
<pre><code>DP2H
DP1F
SR2F
SP1O
OG3F
SP3H
OR2O
SG3O
DG2H
DR2H
DR1O
DR3O
</code></pre>
<h1>Challenge Output</h1>
<pre><code>DP1F SR2F OG3F
DP2H DG2H DR2H 
DP1F DG2H DR3O 
SR2F OR2O DR2H 
SP1O OG3F DR2H 
OG3F SP3H DR3O
</code></pre>
</div>
