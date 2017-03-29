# Never Ending Snake
<div class="md"><h1>Description</h1>
<p>Sleether Yn is a neverending snake, and like all neverending snakes, she loves drinking neverending soda and eating baloney. She also hates walking (err, creeping) -- which probably has to do with the fact that her body <strong>grows whenever she moves</strong>. Your goal is give Yn instructions to <strong>eat all the food</strong> on the map, while <strong>moving as little as possible</strong>. On map 1, for instance, you could just tell her: "<strong>r2d2</strong>", for "move right twice and down twice" (she can't move diagonally). You might also say "rrdd", if you prefer.</p>
<pre><code>+- map 1 --+
| s        |
|          |
|   *      |
+----------+
</code></pre>
<p>On map 2, though, you could either instruct her "r5d2l2" or "d2r3r2u2"; both are equally good, with 9 moves each. You could not tell her "r3d2u2r2", though, because she whould <strong>crash against herself</strong> when going "u2" -- life is hard when you're an neverending snake!</p>
<pre><code>+- map 2 --+
| s    *   |
|          |
|    *     |
+----------+
</code></pre>
<p>But as if Yn didn't have enough problems already, she still has to worry about the neverending pits! Believe me, you do not want to fall in one. So on map 3, for instance, she has to do something like "d3r3u1l2u3r5d" (17 moves). Whew!</p>
<pre><code>+- map 3 --+
|          |
| s OO  *  |
|    OOO   |
|    * OOOO|
|          |
+----------+
</code></pre>
<p>So let's recap: you can tell Sleether ("s") to go up ("u"), down ("d"), left ("l") or right ("r"). On each map, she must eat (go over) all baloney sandwiches ("*"), while <strong>avoiding her own trail</strong> (including the initial square) and the neverending pits ("O").</p>
<h1>Input &amp; Output</h1>
<p><strong>Input</strong>: a map, like the ones described above; you can ignore the first and last lines (those with "+"s), and parse only the characters between the pipes ("|").</p>
<p><strong>Output</strong>: a string with commands to solve the map.</p>
<p>Can you make a solver that finds instructions for maps 1 to 16?</p>
<pre><code>+- map 4 --+- map 5 --+- map 6 --+-- map 7 --+map 8+- map 9 ----+- map 10 -+
|*         |     *    |      *   |      *  * |*   *|*O *  O O   | *     OO |
|   OOO    |OO  *  *  |     *    | *O  OO*   | * * |      s*  O | O     **O|
| s    *   | *  Os   *| *O    O *| s*    O   |  s  |     * O   O|  *   * sO|
|OOOOOO    |  *    *  |OOO   *OOO| *OOO   O *| * * |          O |          |
|*         |     *    | s       *|       * O |*   *|  O*  * O   |OO  OOO* O|
+----------+----------+----------+-----------+-----+------------+----------+
+- map 11 -+- map 12 -+- map 13 --+-- map 14 --+-- map 15 --+--- map 16 ---+
|     sOO  |   O     O|    * *OO  |OO *      * |   *      OO|       *   *  |
|**   * *  |  O   OO O|           | O    * O  O|*   O    ** |    O     *  O|
|        O | O*   s*  |**O        |*   O  O*  *|O         O |  O     OO   *|
|O*  *  OOO|*    *  * | *OsO   O  |O O *       |  *    *O O | s      *     |
|*     OOO | O      OO|    *O OO  |O      OO s*|     **s O  |O O* O* OO    |
+----------+----------+-----------+------------+------------+--------------+
</code></pre>
<h1>Notes</h1>
<p>Also please share interesting maps you come up with, especially ones that your own solver cannot work around!</p>
<p>If you're stuck, <a href="https://en.wikipedia.org/wiki/Maze_solving_algorithm">this</a> might help. If not, it's an interesting read anyway.</p>
<h1>Credit</h1>
<p>This challenge was suggested by <a href="/u/alfred300p">/u/alfred300p</a>. Have a good challenge idea? Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a>.</p>
</div>
