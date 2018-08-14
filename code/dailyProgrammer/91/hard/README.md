# (Chess move validation)
<div class="md"><p><a href="http://en.wikipedia.org/wiki/Forsyth%E2%80%93Edwards_Notation">Forsyth-Edwards notation</a> is a is a notation used by chess players for describing a particular board position of a chess game. It contains information about the pieces, whose turn it is, who can castle, and how many turns have passed, among others. Write a program that reads a FEN file and two coordinates from input, like this:</p>
<pre><code>rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1
e2 e4
</code></pre>
<p>Your program parses the FEN board, then determines whether moving the piece on coordinate 1 to coordinate 2 is a valid move, printing either <code>true</code> or <code>false</code>. As demonstrated here, it is:</p>
<table><thead>
<tr>
<th align="center">/</th>
<th align="center">a</th>
<th align="center">b</th>
<th align="center">c</th>
<th align="center">d</th>
<th align="center">e</th>
<th align="center">f</th>
<th align="center">g</th>
<th align="center">h</th>
</tr>
</thead><tbody>
<tr>
<td align="center"><strong>8</strong></td>
<td align="center">♜</td>
<td align="center">♞</td>
<td align="center">♝</td>
<td align="center">♛</td>
<td align="center">♚</td>
<td align="center">♝</td>
<td align="center">♞</td>
<td align="center">♜</td>
</tr>
<tr>
<td align="center"><strong>7</strong></td>
<td align="center">♟</td>
<td align="center">♟</td>
<td align="center">♟</td>
<td align="center">♟</td>
<td align="center">♟</td>
<td align="center">♟</td>
<td align="center">♟</td>
<td align="center">♟</td>
</tr>
<tr>
<td align="center"><strong>6</strong></td>
<td align="center">·</td>
<td align="center">·</td>
<td align="center">·</td>
<td align="center">·</td>
<td align="center">·</td>
<td align="center">·</td>
<td align="center">·</td>
<td align="center">·</td>
</tr>
<tr>
<td align="center"><strong>5</strong></td>
<td align="center">·</td>
<td align="center">·</td>
<td align="center">·</td>
<td align="center">·</td>
<td align="center">·</td>
<td align="center">·</td>
<td align="center">·</td>
<td align="center">·</td>
</tr>
<tr>
<td align="center"><strong>4</strong></td>
<td align="center">·</td>
<td align="center">·</td>
<td align="center">·</td>
<td align="center">·</td>
<td align="center">♙</td>
<td align="center">·</td>
<td align="center">·</td>
<td align="center">·</td>
</tr>
<tr>
<td align="center"><strong>3</strong></td>
<td align="center">·</td>
<td align="center">·</td>
<td align="center">·</td>
<td align="center">·</td>
<td align="center">↑</td>
<td align="center">·</td>
<td align="center">·</td>
<td align="center">·</td>
</tr>
<tr>
<td align="center"><strong>2</strong></td>
<td align="center">♙</td>
<td align="center">♙</td>
<td align="center">♙</td>
<td align="center">♙</td>
<td align="center">◌</td>
<td align="center">♙</td>
<td align="center">♙</td>
<td align="center">♙</td>
</tr>
<tr>
<td align="center"><strong>1</strong></td>
<td align="center">♖</td>
<td align="center">♘</td>
<td align="center">♗</td>
<td align="center">♕</td>
<td align="center">♔</td>
<td align="center">♗</td>
<td align="center">♘</td>
<td align="center">♖</td>
</tr>
</tbody></table>
</div>
