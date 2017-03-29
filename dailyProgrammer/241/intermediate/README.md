# ascii Bitmap Chess
<div class="md"><h1>1. unicode sucks</h1>
<p>From Monday's challenge,</p>
<pre><code>  toascii '1r3rk1/1pnnq1bR/p1pp2B1/P2P1p2/1PP1pP2/2B3P1/5PK1/2Q4R'
.r...rk.
.pnnq.bR
p.pp..B.
P..P.p..
.PP.pP..
..B...P.
.....PK.
..Q....R
</code></pre>
<p>make something like this:</p>
<pre><code>┌─┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐
│8│     │X...X│     │.....│     │X...X│  X  │.....│
│ │     │XXXXX│     │.....│     │XXXXX│XXXXX│.....│
│ │     │.XXX.│     │.....│     │.XXX.│ XXX │.....│
│ │     │.XXX.│     │.....│     │.XXX.│XXXXX│.....│
├─┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤
│7│.....│     │.XXX.│ XXX │X.X.X│     │..X..│O   O│
│ │.....│  X  │XXXX.│XXXX │XXXXX│     │.XXX.│OOOOO│
│ │.....│  X  │..X..│  X  │.XXX.│     │..X..│ OOO │
│ │.....│ XXX │XXXX.│XXXX │X...X│     │..X..│ OOO │
├─┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤
│6│     │.....│     │.....│     │.....│  O  │.....│
│ │  X  │.....│  X  │..X..│     │.....│ OOO │.....│
│ │  X  │.....│  X  │..X..│     │.....│  O  │.....│
│ │ XXX │.....│ XXX │.XXX.│     │.....│  O  │.....│
├─┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤
│5│.....│     │.....│     │.....│     │.....│     │
│ │..O..│     │.....│  O  │.....│  X  │.....│     │
│ │..O..│     │.....│  O  │.....│  X  │.....│     │
│ │.OOO.│     │.....│ OOO │.....│ XXX │.....│     │
├─┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤
│4│     │.....│     │.....│     │.....│     │.....│
│ │     │..O..│  O  │.....│  X  │..O..│     │.....│
│ │     │..O..│  O  │.....│  X  │..O..│     │.....│
│ │     │.OOO.│ OOO │.....│ XXX │.OOO.│     │.....│
├─┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤
│3│.....│     │..O..│     │.....│     │.....│     │
│ │.....│     │.OOO.│     │.....│     │..O..│     │
│ │.....│     │..O..│     │.....│     │..O..│     │
│ │.....│     │..O..│     │.....│     │.OOO.│     │
├─┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤
│2│     │.....│     │.....│     │.....│  O  │.....│
│ │     │.....│     │.....│     │..O..│OOOOO│.....│
│ │     │.....│     │.....│     │..O..│ OOO │.....│
│ │     │.....│     │.....│     │.OOO.│OOOOO│.....│
├─┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤
│1│.....│     │O.O.O│     │.....│     │.....│O   O│
│ │.....│     │OOOOO│     │.....│     │.....│OOOOO│
│ │.....│     │.OOO.│     │.....│     │.....│ OOO │
│ │.....│     │O...O│     │.....│     │.....│ OOO │
├─┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤
│ │a    │b    │c    │d    │e    │f    │g    │h    │
└─┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘
</code></pre>
<p>Here are some 4x5 crappy bitmaps to get started</p>
<pre><code>O...O
OOOOO
.OOO.
.OOO.
;
.OOO.
OOOO.
..O..
OOOO.
;
..O..
.OOO.
..O..
..O..
;
O.O.O
OOOOO
.OOO.
O...O
;
..O..
OOOOO
.OOO.
OOOOO
;
.....
..O..
..O..
.OOO.
;
.....
..O..
.O.O.
.....
</code></pre>
<p>the last one is that ghost square from Monday's challenge.  Bitmaps differences for Starting, Regular, and Ghost Rooks is encouraged, as is code generating as much as possible of the variations.</p>
<h1>2. Is the black king in check</h1>
<p><a href="https://en.wikipedia.org/wiki/Chess#Movement">how chess pieces can move</a></p>
<p>The black king (k) is in a check position if</p>
<ol>
<li>He pretends he is a bishop(b), and can capture a B or Q(ueen)</li>
<li>He pretends he is a rook(r), and can capture a R or Q(ueen)</li>
<li>He pretends he is a knight(n), and can capture a N </li>
<li>He pretends he is a pawn(p), and can capture a P</li>
</ol>
<p>(note that pieces are blocked by other friend and foe pieces from "checking" the king)</p>
<p>For output, list all squares that have a piece that is holding the black king in check.</p>
<p>** sample input **</p>
<p>1r3rk1/1pnnq1bR/p1pp2B1/P2P1p2/1PP1pP2/2B3P1/5PK1/2Q4R</p>
<p>** sample output **</p>
<p>empty - no checks.</p>
<p>** challenge input **</p>
<p>'1r3kR1/4P3/6NB/8/8/Q7/8/4KR2'</p>
</div>
