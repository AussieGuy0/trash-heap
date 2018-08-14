# Unicode Chess
<div class="md"><h1>1. generate a chessboard</h1>
<pre><code>1☐☒☐☒☐☒☐☒
2☒☐☒☐☒☐☒☐
3☐☒☐☒☐☒☐☒
4☒☐☒☐☒☐☒☐
5☐☒☐☒☐☒☐☒
6☒☐☒☐☒☐☒☐
7☐☒☐☒☐☒☐☒
8☒☐☒☐☒☐☒☐
 a bc d e fg h                
</code></pre>
<p>(or with better glyphs, and lining up of letters)</p>
<h1>2. Modified FEN input</h1>
<pre><code> rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR
</code></pre>
<p>is the standard simplified ascii representation of <a href="https://en.wikipedia.org/wiki/Forsyth%E2%80%93Edwards_Notation">a starting chess position</a>.  Lower case are black pieces, upper are white, numbers are consecutive empty squares, and '/' are row separators.</p>
<p>A modified FEN notation replaces rR (rooks) with sS if the rooks are eligible to castle (they have never moved from start of game, and their king has also never moved.)  A gG piece is a ghost which can be used to invoke 2 special chess rules.  </p>
<ol>
<li>A pawn that moves 2 squares can still be captured on the next move by another pawn on the ghost square that he would have been on if he had moved just 1 square instead of 2.<br/></li>
<li>A king that moves 2 squares through castling can still be captured on the next move by any piece on the ghost square that he would have been on if he had moved just 1 square instead of 2.  While such a castle is an illegal move in official chess, for a computer, it may be easier to declare a move illegal after the king is captured on next move.</li>
</ol>
<p><strong>modified FEN starting position input</strong></p>
<pre><code> snbqkbns/pppppppp/8/8/4P3/8/PPPP1PPP/SNBQKBNS
</code></pre>
<p>(after most common first move)</p>
<h1>output 2 and input to 3</h1>
<pre><code>snbqkbns
pppppppp
........
........
....P...
........
PPPP.PPP
SNBQKBNS
</code></pre>
<h1>3. unicode prettified output</h1>
<pre><code>8♜♞♝♛♚♝♞♜
7♟♟♟♟♟♟♟♟
6☐☒☐☒☐☒☐☒
5☒☐☒☐☒☐☒☐
4☐☒☐☒♙☒☐☒
3☒☐☒☐☒☐☒☐
2♙♙♙♙☐♙♙♙
1♖♘♗♕♔♗♘♖
 a bc d e fg h     
(edit: had bug that had border numbers upside down)
</code></pre>
<p>reddit (firefox) doesn't like the size of the empty squares :(
help appreciated to find right sized glyphs for the empty squares.  Here is unicode pattern:</p>
<pre><code>9820 9822 9821 9819 9818 9821 9822 9820
9823 9823 9823 9823 9823 9823 9823 9823
9744 9746 9744 9746 9744 9746 9744 9746
9746 9744 9746 9744 9746 9744 9746 9744
9744 9746 9744 9746 9744 9746 9744 9746
9746 9744 9746 9744 9746 9744 9746 9744
9817 9817 9817 9817 9817 9817 9817 9817
9814 9816 9815 9813 9812 9815 9816 9814
</code></pre>
<h1>4. challenge</h1>
<p>Move a few pieces, updating the board.  Erase from position, add empty square colour at from position, erase whatever was on to position square, add the piece that was moved there.</p>
<p>input state to this function: (starting chess position)</p>
<pre><code> snbqkbns/pppppppp/8/8/8/8/PPPPPPPP/SNBQKBNS
</code></pre>
<p>suggested moves: (at least first 3.  bonus for up to 5)</p>
<p>e2-e4  c7-c5<br/>
f1-c4   g8-f6<br/>
c4xf7   e8xf7<br/>
e4-e5  d7-d5<br/>
e5xd6 (en passant)</p>
<p>Move format: for each line:  (white move "from square"(- or x)"to square") space(s) (black move "from square"(- or x)"to square").  x is optional indicator of move that captures an oponent piece.</p>
<p>Easier Move format: for each line:  (white move "from square"-"to square") space(s) (black move "from square"-"to square")</p>
<p>each "half move" returns a new board.  (a half move is when just white or black moves.  A full move includes both)
the en-passant rule lets a pawn capture another pawn if the opponent pawn <strong>just</strong> moved 2 squares.  The capture takes place as if the opponent pawn was 1 square behind.  (see section 2 for ghost pieces above)</p>
</div>
