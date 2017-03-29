# Cellular Automata: Rule 90
<div class="md"><h1>Description</h1>
<p>The development of cellular automata (CA) systems is typically attributed to Stanisław Ulam and John von Neumann, who were both researchers at the Los Alamos National Laboratory in New Mexico in the 1940s. Ulam was studying the growth of crystals and von Neumann was imagining a world of self-replicating robots. That’s right, robots that build copies of themselves. Once we see some examples of CA visualized, it’ll be clear how one might imagine modeling crystal growth; the robots idea is perhaps less obvious. Consider the design of a robot as a pattern on a grid of cells (think of filling in some squares on a piece of graph paper). Now consider a set of simple rules that would allow that pattern to create copies of itself on that grid. This is essentially the process of a CA that exhibits behavior similar to biological reproduction and evolution. (Incidentally, von Neumann’s cells had twenty-nine possible states.) Von Neumann’s work in self-replication and CA is conceptually similar to what is probably the most famous cellular automaton: Conways “Game of Life,” sometimes seen as a screen saver. CA has been pushed very hard by Stephen Wolfram (e.g. Mathematica, Worlram Alpha, and "A New Kind of Science"). </p>
<p>CA has a number of simple "rules" that define system behavior, like "If my neighbors are both active, I am inactive" and the like. The rules are all given numbers, but they're not sequential for historical reasons. </p>
<p>The subject rule for this challenge, Rule 90, is one of the simplest, a simple neighbor XOR. That is, in a 1 dimensional CA system (e.g. a line), the next state for the cell in the middle of 3 is simply the result of the XOR of its left and right neighbors. E.g. "000" becomes <del>"1"</del> "0" in the next state, "100" becomes "1" in the next state and so on. You traverse the given line in windows of 3 cells and calculate the rule for the next iteration of the following row's center cell based on the current one while the two outer cells are influenced by their respective neighbors. Here are the rules showing the conversion from one set of cells to another:</p>
<table><thead>
<tr>
<th>"111"</th>
<th>"101"</th>
<th>"010"</th>
<th>"000"</th>
<th>"110"</th>
<th>"100"</th>
<th>"011"</th>
<th>"001"</th>
</tr>
</thead><tbody>
<tr>
<td>0</td>
<td>0</td>
<td>0</td>
<td>0</td>
<td>1</td>
<td>1</td>
<td>1</td>
<td>1</td>
</tr>
</tbody></table>
<h1>Input Description</h1>
<p>You'll be given an input line as a series of 0s and 1s. Example:</p>
<pre><code>1101010
</code></pre>
<h1>Output Description</h1>
<p>Your program should emit the states of the celular automata for 25 steps. Example from above, in this case I replaced 0 with a blank and a 1 with an X:</p>
<pre><code>xx x x
xx    x
xxx  x
x xxx x
  x x
 x   x
</code></pre>
<h1>Challenge Input</h1>
<pre><code>00000000000000000000000000000000000000000000000001000000000000000000000000000000000000000000000000
</code></pre>
<h1>Challenge Output</h1>
<p>I chose this input because it's one of the most well known, it yields a Serpinski triangle, a well known fractcal. </p>
<pre><code>                                             x
                                            x x
                                           x   x
                                          x x x x
                                         x       x
                                        x x     x x
                                       x   x   x   x
                                      x x x x x x x x
                                     x               x
                                    x x             x x
                                   x   x           x   x
                                  x x x x         x x x x
                                 x       x       x       x
                                x x     x x     x x     x x
                               x   x   x   x   x   x   x   x
                              x x x x x x x x x x x x x x x x
                             x                               x
                            x x                             x x
                           x   x                           x   x
                          x x x x                         x x x x
                         x       x                       x       x
                        x x     x x                     x x     x x
                       x   x   x   x                   x   x   x   x
                      x x x x x x x x                 x x x x x x x x
                     x               x               x               x
                    x x             x x             x x             x x
</code></pre>
</div>
