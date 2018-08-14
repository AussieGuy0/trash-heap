# We're about to score!
<div class="md"><h1><strong>Description</strong></h1>
<p>One of the ways that chess games are tracked during play is to assign values to each piece and then look at the pieces that remain on the board for each player. After several moves where pieces have been taken, one can quickly determine who has an advantage.</p>
<p>Pieces are assigned standard valuations: </p>
<ul>
<li>pawns are worth one point each. </li>
<li>Knights and bishops 3 points each</li>
<li>A Rook is worth 5</li>
<li>The Queen is worth 9 points.</li>
<li>The Kings true value is infinite but you shouldn't need to worry about this</li>
</ul>
<p>More info on chess values can be seen <a href="http://en.wikipedia.org/wiki/Chess_piece_relative_value">HERE</a></p>
<h1><strong>Input Description</strong></h1>
<p>Each line of input will be given in standard chess algebraic notation: </p>
<p>Here's a picture of the notation to give you an idea : <a href="http://home.comcast.net/%7Edanheisman/images/Record_board.jpg">Image</a></p>
<ul>
<li>columns are given a-h and rows are given 1-8 (starting with white's back row). For reference the queens are on d1 (white) and d8 (black).</li>
<li><p>Pieces (except for pawns) have a capital letter associated with them:</p>
<p>King = K; Knight = N; Queen = Q; Rook = R; Bishop = B; None = pawns, they are just specified by their file. </p></li>
<li><p>Captures are marked with an "x": </p>
<p>e.g. "Qxe5" for "queen captures the piece on square e5"; pawn captures are given by file, for example "exd5". </p></li>
<li><p>Castling is indicated as such: O-O for kingside, O-O-O Queenside. Check is indicated by a "+" and checkmate is given by "mate" or "#". </p></li>
</ul>
<p>For more help on chess notation see <a href="http://home.comcast.net/%7Edanheisman/Articles/recording_chess.htm">HERE</a></p>
<h1><strong>Formal Input Description</strong></h1>
<p>Three values per line: move number, then white's move, then black's move using chess algebraic notation.</p>
<p>Example:</p>
<ol>
<li>e4 e5          &lt;-- White's pawn to e4, Black's pawn moves to e5</li>
<li>Nf3 Nc6       &lt;-- White's Knight moves to f3, Black's Knight moves to c6</li>
<li>Bb5 Nf6       &lt;-- White's Bishop moves to b5, Black's Knight moves to f6</li>
<li>d3 Bc5        &lt;-- White's Pawn moves to d3, Black's Bishop moves to c5</li>
</ol>
<p>etc...</p>
<h1><strong>Formal Output Description</strong></h1>
<p>Your program should emit two values, one for white and one for black, at the end of the series of moves (for an incomplete game).</p>
<h1><strong>Sample Input</strong></h1>
<p>This is actually Anand v Carlsen from the Zurich Chess Challenge 2014, round 5 play.</p>
<ol>
<li>e4 e5</li>
<li>Nf3 Nc6</li>
<li>Bb5 Nf6</li>
<li>d3 Bc5</li>
<li>Bxc6 dxc6</li>
<li>h3 Nd7</li>
<li>Be3 Bd6</li>
<li>Nbd2 O-O</li>
<li>O-O Re8</li>
<li>Nc4 Nf8</li>
<li>d4 exd4</li>
<li>Qxd4 c5</li>
<li>Qd3 b6</li>
<li>Nxd6 Qxd6</li>
<li>Qxd6 cxd6</li>
<li>Rfd1 Bb7</li>
<li>Rxd6 Bxe4</li>
<li>Ne1 Rad8</li>
<li>Rad1 Ne6</li>
<li>Rxd8 Rxd8</li>
<li>Rxd8+ Nxd8</li>
<li>f3 Bd5</li>
<li>a3 Nc6</li>
<li>Kf2 f6</li>
<li>Nd3 Kf8</li>
<li>Ke2 Ke7</li>
<li>Kd2 Kd7</li>
<li>Nf4 Bf7</li>
<li>b3 Ne7</li>
<li>h4 Nd5</li>
</ol>
<h1><strong>Sample output</strong></h1>
<p>12-12</p>
<h1><strong>Challenge Input</strong></h1>
<p>This is actually Aronian vs So from the 2014 76th Tata Steel Masters round 6. Aronian would go on to win.</p>
<ol>
<li>c4 Nf6</li>
<li>Nf3 g6</li>
<li>Nc3 d5</li>
<li>cxd5 Nxd5</li>
<li>e4 Nxc3</li>
<li>bxc3 Bg7</li>
<li>Be2 c5</li>
<li>O-O Nc6</li>
<li>Qa4 Bd7</li>
<li>Qa3 Qa5</li>
<li>Rd1 O-O</li>
<li>Rb1 b6</li>
<li>d4 Qxa3</li>
<li>Bxa3 Bg4</li>
<li>dxc5 Bxc3</li>
<li>Ba6 Rab8</li>
<li>Rdc1 Bxf3</li>
<li>gxf3 Bd2</li>
<li>Rd1 Bc3</li>
<li>Kg2 bxc5</li>
<li>Bxc5 Bb4</li>
<li>Be3 Bd6</li>
<li>Rbc1 Nb4</li>
<li>Bc4 Rfc8</li>
<li>f4 Kf8</li>
<li>a3 Nc6</li>
<li>Ba6 Bxa3</li>
</ol>
<h1><strong>Thanks</strong></h1>
<p>Big thank you to <a href="/u/jnazario">/u/jnazario</a> for the submission and for his stream of posts over at <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
</div>
