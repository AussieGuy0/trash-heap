# Fallout's Hacking Game
<div class="md"><h1>Description:</h1>
<p>The popular video games <strong><em>Fallout 3</em></strong> and <strong><em>Fallout: New Vegas</em></strong> has a <a href="http://gamewiki.net/Fallout_3/Hacking_Guide">computer hacking mini game</a>.</p>
<p>This game requires the player to correctly guess a password from a list of same length words. Your challenge is to implement this game yourself.</p>
<p>The game works like the classic game of <a href="http://en.wikipedia.org/wiki/Mastermind_(board_game)">Mastermind</a> 
The player has only 4 guesses and on each incorrect guess the computer will indicate how many letter positions are correct.</p>
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
<p>You can draw words from our favorite dictionary file: <a href="https://code.google.com/p/dotnetperls-controls/downloads/detail?name=enable1.txt">enable1.txt</a> . Your program should completely ignore case when making the position checks.</p>
<h1>Input/Output:</h1>
<p>Using the above description, design the input/output as you desire. It should ask for a difficulty level and show a list of words and report back how many guess left and how many matches you had on your guess.</p>
<p>The logic and design of how many words you display and the length based on the difficulty is up to you to implement.</p>
<h1>Easier Challenge:</h1>
<p>The game will only give words of size 7 in the list of words.</p>
<h1>Challenge Idea:</h1>
<p>Credit to <a href="/u/skeeto">/u/skeeto</a> for the <a href="http://www.reddit.com/r/dailyprogrammer_ideas/comments/23jps4/intermediate_fallout_hacking_game/">challenge idea</a> posted on <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
</div>
