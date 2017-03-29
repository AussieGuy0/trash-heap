# Connect Four
<div class="md"><p>** EDITED ** Corrected the challenge output (my bad), verified with solutions from <a href="/u/Hells_Bell10">/u/Hells_Bell10</a> and <a href="/u/mdskrzypczyk">/u/mdskrzypczyk</a></p>
<h1>Description</h1>
<p>Connect Four is a two-player connection game in which the players first choose a color and then take turns dropping colored discs (like checkers) from the top into a seven-column, six-row vertically suspended grid. The pieces fall straight down, occupying the next available space within the column. The objective of the game is to connect four of one's own discs of the same color next to each other vertically, horizontally, or diagonally before your opponent. </p>
<p>A fun discourse on winning strategies at Connect Four is found here <a href="http://www.pomakis.com/c4/expert_play.html">http://www.pomakis.com/c4/expert_play.html</a> . </p>
<p>In this challenge you'll be given a set of game moves and then be asked to figure out who won and when (there are more moves than needed). You should safely assume that all moves should be valid (e.g. no more than 6 per column). </p>
<p>For sake of consistency, this is how we'll organize the board, rows as numbers <em>1-6</em> descending and columns as letters <em>a-g</em>.  This was chosen to make the first moves in row 1.</p>
<pre><code>    a b c d e f g
6   . . . . . . . 
5   . . . . . . . 
4   . . . . . . . 
3   . . . . . . . 
2   . . . . . . . 
1   . . . . . . . 
</code></pre>
<h1>Input Description</h1>
<p>You'll be given a game with a list of moves. Moves will be given by <em>column only</em> (gotta make this challenging somehow). We'll call the players <em>X</em> and <em>O</em>, with <em>X</em> going first using columns designated with an uppercase letter and <em>O</em> going second and moves designated with the lowercase letter of the column they chose. </p>
<pre><code>C  d
D  d
D  b
C  f
C  c
B  a
A  d
G  e
E  g
</code></pre>
<h1>Output Description</h1>
<p>Your program should output the player ID who won, what move they won, and what final position (column and row) won. Optionally list the four pieces they used to win.</p>
<pre><code>X won at move 7 (with A2 B2 C2 D2)
</code></pre>
<h1>Challenge Input</h1>
<pre><code>D  d
D  c    
C  c    
C  c
G  f
F  d
F  f
D  f
A  a
E  b
E  e
B  g
G  g
B  a
</code></pre>
<h1>Challenge Output</h1>
<pre><code>O won at move 11 (with c1 d2 e3 f4)
</code></pre>
</div>
