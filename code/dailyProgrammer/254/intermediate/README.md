# Finding Legal Reversi Moves
<div class="md"><h1>Description</h1>
<p>The game of Reversi (or Othello) is a color flipping strategy game played between two players. It's played on an 8x8 uncheckered board. In each turn, the player must place a new chip on the game board. The chip must be placed in a currently empty square. The other requirement is that it be placed so that one or more of their opponent's chips lie between the empty square and another chip of the player's color. That is, the player placing a black chip must place it on an empty square with one or more white chips in a row - vertical, horizontal, or diagonal - between it and another black chip.</p>
<p>The object of the game is to have the majority of disks turned to display your color when the last playable empty square is filled.</p>
<p>Today's challenge is to review a game in progress and indicate legal moves for the next player. </p>
<h1>Input Description</h1>
<p>You'll be given a row with a single letter, <code>X</code> or <code>O</code>, denoting the player whose move it is. Then you'll be given the board as an 8x8 grid, with a dash <code>-</code> for an open square and an <code>X</code> or an <code>O</code> for a space occupied by that piece. Example:</p>
<pre><code>X
--------
--------
--------
---OX---
---XO---
--------
--------
--------
</code></pre>
<h1>Output Description</h1>
<p>Your program should indicate the quantity of moves for that piece and then draw where they could be, indicated using a star <code>*</code>. Example</p>
<pre><code>4 legal moves for X
--------
--------
---*----
--*OX---
---XO*--
----*---
--------
--------
</code></pre>
<h1>Challenge Input</h1>
<pre><code>O
--------
--------
---O----
--XXOX--
---XOO--
----X---
--------
--------

X
--------
--------
---OX---
--XXXO--
--XOO---
---O----
--------
--------
</code></pre>
<h1>Challenge Output</h1>
<pre><code>11 legal moves for O
--------
--------
--*O-**-
-*XXOX*-
-**XOO--
--**X---
---**---
--------

12 legal moves for X
--------
--***---
--*OX---
--XXXO*-
--XOO**-
--*O**--
---**---
--------
</code></pre>
<h1>Note</h1>
<p>For an interesting discussion of such algorithms, see the Wikipedia page on <a href="https://en.wikipedia.org/wiki/Computer_Othello">computer Othello</a>. An 8x8 board has nearly 10<sup>28</sup> legal moves in a game tree possible! One of the first computer Othello programs was published in 1977, written in FORTRAN. </p>
</div>
