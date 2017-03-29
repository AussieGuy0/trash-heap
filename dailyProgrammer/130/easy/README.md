# Roll the Dies
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Easy)</em>: Roll the Dies</h1>
<p>In many board games, you have to roll <a href="http://en.wikipedia.org/wiki/File:Dice_(typical_role_playing_game_dice">multiple multi-faces dies</a>.jpg) to generate random numbers as part of the game mechanics. A classic die used is the d20 (die of 20 faces) in the game Dungeons &amp; Dragons. This notation, often called the <a href="http://en.wikipedia.org/wiki/Dice_notation">Dice Notation</a>, is where you write NdM, where N is a positive integer representing the number of dies to roll, while M is a positive integer equal to or grater than two (2), representing the number of faces on the die. Thus, the string "2d20" simply means to roll the 20-faced die twice. On the other hand "20d2" means to roll a two-sided die 20 times.</p>
<p>Your goal is to write a program that takes in one of these Dice Notation commands and correctly generates the appropriate random numbers. Note that it does not matter how you <a href="http://en.wikipedia.org/wiki/Random_seed">seed your random number generation</a>, but you should try to as good programming practice.</p>
<p><em>Author: nint22</em></p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>You will be given a string of the for NdM, where N and M are describe above in the challenge description. Essentially N is the number of times to roll the die, while M is the number of faces of this die. N will range from 1 to 100, while M will range from 2 to 100, both inclusively. This string will be given through standard console input.</p>
<h2>Output Description</h2>
<p>You must simulate the die rolls N times, where if there is more than one roll you must space-delimit (not print each result on a separate line). Note that the range of the random numbers must be inclusive of 1 to M, meaning that a die with 6 faces could possibly choose face 1, 2, 3, 4, 5, or 6.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<pre><code>2d20
4d6
</code></pre>
<h2>Sample Output</h2>
<pre><code>19 7
5 3 4 6
</code></pre>
</div>
