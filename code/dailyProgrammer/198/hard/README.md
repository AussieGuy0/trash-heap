# Words with Enemies -- The Game!
<div class="md"><h1>Description:</h1>
<p>We had an easy challenge for part 1 of this challenge. </p>
<p>(<a href="http://www.reddit.com/r/dailyprogrammer/comments/2syz7y/20150119_challenge_198_easy_words_with_enemies/">http://www.reddit.com/r/dailyprogrammer/comments/2syz7y/20150119_challenge_198_easy_words_with_enemies/</a>)</p>
<p>To expand this further we will make a game. For this challenge you will have to create a player vs AI game battling it out with words. Following some basic rules for the games you must design and implement this game.</p>
<h1>Rules of the Game:</h1>
<ul>
<li>5 Turns</li>
<li>Each turn the user and AI are given random letters</li>
<li>The user and AI must submit a dictionary checked word derived from these letters</li>
<li>The words are compared. Using the easy challenge the winner of the duel is determined by whoever has the most left over letters.</li>
<li>1 point is awarded for each left over letter.</li>
<li>At the end of 5 turns who ever gets the most points wins the game.</li>
</ul>
<h1>Design:</h1>
<p>There are many unanswered design issues with this game. I leave it as part of the challenge for you to develop and decide on that design. Please keep this in mind that part of the challenge beyond solving the coding aspect of this challenge is also solving the design issue of this challenge.</p>
<p>Some design suggestions to consider:</p>
<ul>
<li>How many random letters do you get each turn? How do you determine it?</li>
<li>Do you wipe all letters clean between rounds and regenerate letters or do they carry over turn to turn with a way to generate new letters?</li>
<li>Do you re-use letters left over for the next turn or just ignore them?</li>
<li>Does the AI searching for a word have a random level of difficulty? </li>
</ul>
<h1>AI design:</h1>
<p>So you are giving your AI a bunch of letters. It has to find a legal word. Using a dictionary of words you can match up letters to form valid words.</p>
<p>Use this post to help find a dictionary to use that fits your needs (<a href="http://www.reddit.com/r/dailyprogrammer/comments/2nluof/request_the_ultimate_wordlist/">http://www.reddit.com/r/dailyprogrammer/comments/2nluof/request_the_ultimate_wordlist/</a>)</p>
<p>I really like the idea of a varied AI. You can make 1-3 levels of AI. Ultimately the AI can be coded to always find the biggest word possible. This could be rather difficult for a human to play against. I would suggest developing at least 2 or 3 different levels of AI (you  might have to dumb down the AI) so that players can play against an easier AI and later play against the best AI if they want more a challenge.</p>
<h1>Checking the user input:</h1>
<p>Users will input a word based on letters given. Your solution must check to make sure the word entered uses only the letters given to the human user but also that it makes a word in the dictionaries (see above)</p>
<h1>Input:</h1>
<p>Varied as needed for the game to work</p>
<h1>Output:</h1>
<p>Varied as needed for the game to work</p>
<h1>Example of a UI flow:</h1>
<pre><code> Welcome to Words with Enemies!
 Select an AI difficulty:
 1) easy
 2) Hard
 --&gt; 1
 You have selected Easy! - Let's begin!

 Turn 1 -- Points You: 0 Computer: 0
 -----------------------------------------
 Your letters: a b c d e k l m o p t u
 Your word-&gt; rekt
 I am sorry but you cannot spell rekt with your letters. Try again.
 Your letters: a b c d e k l m o p t u
 Your word-&gt; top
 Valid Word! Open Fire!!!!
 AI selects "potluck"

 top vs potluck -- Computer wins.
 You had 0 letters left over - you score 0 points
 AI had 4 letters left over - AI score 4 points

 Turn 2 -- Points You: 0 Computer: 4
 -----------------------------------------
 Your letters: e i o k a l m q t u w y
</code></pre>
</div>
