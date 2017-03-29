# Fallout Hacking Game
<div class="md"><h1>Description</h1>
<p>The popular video games <em>Fallout 3</em> and <em>Fallout: New Vegas</em> have <a href="http://gamewiki.net/Fallout_3/Hacking_Guide">a computer "hacking" minigame</a> where the player must correctly guess the correct password from a list of same-length words. Your challenge is to implement this game yourself.</p>
<p>The game operates similarly to the classic board game <a href="http://en.wikipedia.org/wiki/Mastermind_(board_game)">Mastermind</a>. The player has only 4 guesses and on each incorrect guess the computer will indicate how many letter <em>positions</em> are correct.</p>
<p>For example, if the password is MIND and the player guesses MEND, the game will indicate that 3 out of 4 positions are correct (M_ND). If the password is COMPUTE and the player guesses PLAYFUL, the game will report 0/7. While some of the letters match, they're in the wrong position.</p>
<p>Ask the player for a difficulty (very easy, easy, average, hard, very hard), then present the player with 5 to 15 words of the same length. The length can be 4 to 15 letters. More words and letters make for a harder puzzle. The player then has 4 guesses, and on each incorrect guess indicate the number of correct positions.</p>
<p>Here's an example game:</p>
<pre><code>Difficulty (1-5)? 3
SCORPION
FLOGGING
CROPPERS
MIGRAINE
FOOTNOTE
REFINERY
VAULTING
VICARAGE
PROTRACT
DESCENTS
Guess (4 left)? migraine
0/8 correct
Guess (3 left)? protract
2/8 correct
Guess (2 left)? croppers
8/8 correct
You win!
</code></pre>
<p>You can draw words from our favorite dictionary file: <a href="http://code.google.com/p/dotnetperls-controls/downloads/detail?name=enable1.txt">enable1.txt</a>. Your program should completely ignore case when making the position checks.</p>
<p>There may be ways to increase the difficulty of the game, perhaps even making it impossible to guarantee a solution, based on your particular selection of words. For example, your program could supply words that have little letter position overlap so that guesses reveal as little information to the player as possible.</p>
<h1>Credit</h1>
<p>This challenge was created by user <a href="/u/skeeto">/u/skeeto</a>. If you have any challenge ideas please share them on <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and there's a good chance we'll use them.  </p>
</div>
