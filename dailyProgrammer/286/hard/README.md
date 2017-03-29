# Rush Hour Solver
<div class="md"><p><em>Note</em> The one I had posted earlier turns out to be a <a href="https://www.reddit.com/r/dailyprogrammer/comments/42x90t/20160127_challenge_251_hard_solve_a_nonogram_bonus/">repeat one one earlier this year</a>, so here's a fresh one. </p>
<h1>Description</h1>
<p>The game of Rush Hour is a puzzle game wherein the player has to slide the cars from their original position to allow the escape car to exit the board. Rush Hour is similar to other sliding puzzles, but with a twist: each piece moves along only one direction, instead of moving both horizontally and vertically. This makes individual moves easier to understand, and sequences easier to visualize. This is basically how cars move - forwards or backwards. </p>
<p>Rush Hour includes a 6x6 playing board with an exit opening along on edge, a red escape car, and several blocking cars (of dimensions 2x1) and several blocking trucks (of dimensions 3x1 ).  The goal is to slide the red car (the escape vehicle) through the exit opening in the edge of the grid. To play, shift the cars and trucks up and down, left and right, until the path is cleared to slide the escape vehicle out the exit. You may not lift pieces off the grid. Pieces may only move forward and back, not sideways </p>
<p>In this challenge you'll be given a starting layout, then you have to show how to move the cars to allow the red escape car to exit the board. </p>
<h1>Sample Input</h1>
<p>You'll be given the 6x6 (or 7x7) board, indicating the exit (with a <code>&gt;</code>), along with the red escape car (marked with an <code>R</code>), and blocking cars (2x1 sized, indicated with letters <code>A</code> through <code>G</code>) and trucks (3x1 sized, indicated with letters <code>T</code> through <code>Z</code>). Empty spaces will be marked with a <code>.</code>. The way the cars are facing should be obvious from their orientation. Remember, they can only move forwards or backwards. Example:</p>
<pre><code>GAA..Y
G.V..Y
RRV..Y&gt;
..VZZZ
....B.
WWW.B.
</code></pre>
<h1>Sample Output</h1>
<p>Find a solution to the puzzle, preferably one with the minimal number of steps. You should indicate which cars move in which direction to liberate the red escape car (<code>R</code>). From our example above here's a solution with <code>+</code> indicating to the right or down N squares, <code>-</code> indicating to the left or up N squares (plus or minus relative to a 0,0 cell in the top left corner):</p>
<pre><code>A +2 
V -1
Z -1
Y +3
R +5
</code></pre>
<h1>Challenge Input</h1>
<pre><code>TTTAU.
...AU.
RR..UB&gt;
CDDFFB
CEEG.H
VVVG.H
</code></pre>
<h1>Challenge Output</h1>
<pre><code>R +1
C -2
D -1
F -1
U +3
B -2
R +4
</code></pre>
<p>Puzzles via the <a href="http://www.puzzles.com/puzzlesineducation/plans/rushhourguide.pdf">Rush Hour puzzle site</a>.</p>
</div>
