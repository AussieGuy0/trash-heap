# Texas Hold 'Em 3 of 3 All In
<div class="md"><h1>Description:</h1>
<p>For the last part of this week's theme challenge. You have choices.</p>
<h2>Choice 1: Betting</h2>
<p>Poker is about money. The betting system is interesting in Texas Hold Em. It involves assigning and moving blinds and inbetween shared cards coming out you have a chance to bet in a cycle until some conditions are meet. For this challenge implement a Texas Hold 'Em Poker betting system with your current progress from the Easy and Intermediate Challenge.</p>
<h2>Choice 2: Simulation</h2>
<p>At this point we have a way to run games of different game lengths. We have built a fold AI system based on just cards and not betting. The questions remains, how good is the AI we developed? I think a good way to test it out is run many games and gather some data and see.</p>
<p>For this path of the challenge we want to run many simulations of the game. You will ask for how many players and how many games. At the end you will output data gathered to show some results.</p>
<h1>Betting:</h1>
<p>At this point the design/flow of this I would leave to you to develop. Some things to consider in your design:</p>
<ul>
<li>Starting Money amount</li>
<li>CPU betting AI</li>
<li>Game Ending Conditions. (Player runs out of money or is last player left in game)</li>
</ul>
<p>I would try to use the fold AI to morph it a bit to help the CPU decide how strong of a hand it thinks it has for the size of the bet. Again the design of how much to bet and if to raise/check/call is up to you. There is no wrong or right choice just the design of how you want it to work.</p>
<h1>Simulation:</h1>
<p>Gather the number of cycles to run by asking the user after the amount of players. At the end of all the games we want to see the following data</p>
<ul>
<li>Number of Total Rounds/Games played out</li>
<li>Number of Wins-losses each player had and a percentage of each</li>
<li>Number of times the best hand equals the highest hand (Remember the best hand includes all hands, including folded AI players vs winning hand was only just best hand of players who did not fold. This potentially could check how good the Fold AI is at deciding to fold)</li>
<li>Winning hand count - By method (High card, pair, 2 pairs, 3 of a kind, etc) This could be interesting to see what is the most common winning hand</li>
</ul>
<p>Thank you to everyone for participating this week.</p>
</div>
