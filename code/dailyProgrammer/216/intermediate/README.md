# Texas Hold 'Em 2 of 3 - Winning Hand & Know when to fold 'em
<div class="md"><h1>Description:</h1>
<p>This continues the week long challenge of Texas Hold 'Em. Today we are going to be challenged with 2 added features.</p>
<ul>
<li>AI logic for the computer hands to pick a "fold" option</li>
<li>Determining the Winning Hand</li>
</ul>
<h1>AI Logic - When to fold:</h1>
<p>I feel this is related to the winning hand which is the 2nd of the two challenges for today. Knowing what a winning hand is helps determine if you should fold. If the CPU determines it doesn't look good it should fold.</p>
<p>The exact logic/method for when to fold it is not so easy. I think there exists many different ways (be it programmed logic or math with probability) to determine it is time to fold.</p>
<p>You will have the freedom and challenge of coming up with code for the AI controlled hands to look at their hands after the flop and the turn cards. Based on your solution for this you will have the AI determine if their hand is not worth pursuing any long and do a "fold". Solutions will vary here. There is no wrong or right way to do this. </p>
<p>Furthermore we will have the ability to see all the cards and check if the logic was a good move or perhaps by also detemining the best hand (regardless if a fold was picked or not)</p>
<h1>Winning Hand and Best hand</h1>
<p>Following general rules for Poker we can determine who wins the hand. <a href="http://en.wikipedia.org/wiki/List_of_poker_hands">List of winning hands in poker</a></p>
<p>After the river is drawn we will show with our output who wins the hand. During the process of drawing the community cards the AI hands have a chance to enter a "fold" state (see above). The winning hand can never be a CPU who picks the fold option.</p>
<p>We will also pick the "Best Hand" by comparing all hands (even ones that were folded) to check our AI logic. If the Winning hand does not equal the best hand then we see the fold choice was not always optimal.</p>
<h1>Input:</h1>
<p>You will use the same input as the Easy part of this challenge. You will ask for how many players 2-8. You will be one of the players and playing against 1-7 random CPU controlled players.</p>
<h1>Output:</h1>
<p>We will modify the output to reflect the status of any folds. We will also output who had the winning hand and the method (high card, pair, straight, flush, 3 of a kind, full house, 4 of a kind, etc) We will also note if a folded hand would have won instead if they had not picked the fold option. (See examples below)</p>
<h1>Example 1:</h1>
<pre><code> How many players (2-8) ? 3

 Your hand: 2 of Clubs, 5 of Diamonds
 CPU 1 Hand: Ace of Spades, Ace of Hearts
 CPU 2 Hand: King of Clubs, Queen of Clubs

 Flop: 2 of Hearts, 5 of Clubs, Ace of Clubs
 Turn: King of Hearts
 River: Jack of Hearts

 Winner: CPU 1 wins. 3 of a kind.
</code></pre>
<h1>Example 2:</h1>
<pre><code> How many players (2-8) ? 3

 Your hand: 3 of Diamonds, 3 of Spades
 CPU 1: 10 of Diamonds, Jack of Diamonds
 CPU 2: 4 of Clubs, 8 of Hearts

 Flop: Ace of Diamonds, Queen of Diamonds, 9 of Diamonds
 CPU 2 Folds!
 Turn: 7 of Hearts
 River: 4 of Spades

 Winner: CPU 1. Flush.
 Best Hand: CPU 1.
</code></pre>
<h1>Example 3:</h1>
<pre><code> How many players (2-8) ? 3

 Your hand: 2 of Hearts, 8 of Spades
 CPU 1: 4 of Hearts, 6 of Clubs
 CPU 2: Jack of Diamonds, 10 of Hearts

 Flop: 8 of Hearts, Jack of Spades, 10  of Clubs
 CPU 1 Folds!
 Turn: 5 of Hearts
 River: 7 of Hearts 

 Winner: CPU 2. Two pair.
 Best Hand: CPU 1. Straight.
</code></pre>
<h1>Looking ahead</h1>
<p>At this point we have Texas Hold Em without money or bets. We can deal cards. We can have the AIs decide to fold and we can determine the winning hand and who had the best hand. The final step on Friday will be to look for trends in running many simulated games to look for trends and patterns. It will really test how good our AI logic is and maybe generate data to help human players see patterns and trends.</p>
</div>
