# Kanoodle Solver
<div class="md"><p>Getting back on track today.</p>
<h1>Description</h1>
<p>The game of Kanoodle provides 12 distinctly shaped pieces (triminoes, tetraminoes and pentaminoes) and asks the player to assemble them into a 5 by 11 rectangular grid. Furthermore they're shown in one column to aide your solution in reading them in.</p>
<p>The pieces are shown below (and they're given here made up with different letters to help you see them in place). Pieces may be rotated, flipped, etc to make them fit but you may not overlap them or leave any blank squares in the 5x11 grid. </p>
<pre><code> A
 A
AA

 B
BB
BB

 C
 C
 C
CC

 D
 D
DD
 D

 E
 E
EE
E

F
FF

  G
  G
GGG

  H
 HH
HH

I I
III

J
J
J
J

KK
KK

 L
LLL
 L
</code></pre>
<p>A solution is found when: </p>
<ul>
<li>Every piece is used exactly once.</li>
<li>Every square in the grid is covered exactly once (no overlaps).</li>
</ul>
<h2>Note</h2>
<p>This is an instance of the exact cover problem. There's "Algorithm X" by Knuth for finding solutions to the exact cover problem. It's not particularly sophisticated; indeed Knuth refers to it as "a statement of the obvious trial-and-error approach."</p>
<h1>Challenge Output</h1>
<p>The puzzle is to arrange all of the above tiles into a four sided figure with no gaps or overlaps. </p>
<p>Your program should be able to emit a solution to this challenge. Bonus points if you can discover all of them. It's helpful if you keep the pieces identified by their letters to indicate their uniqueness. </p>
<p>One solution is:</p>
<pre><code>EEGGGJJJJII
AEEEGCDDDDI
AAALGCHHDII
BBLLLCFHHKK
BBBLCCFFHKK
</code></pre>
</div>
