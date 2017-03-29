# Blackjack Checker
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Easy)</em>: Blackjack Checker</h1>
<p><a href="https://en.wikipedia.org/wiki/Blackjack">Blackjack</a> is a very common card game, where the primary aim is to pick up cards until your hand has a higher value than everyone else but is less than or equal to 21. This challenge will look at the outcome of the game, rather than playing the game itself.</p>
<p>The value of a hand is determined by the cards in it.</p>
<ul>
<li><p>Numbered cards are worth their number - eg. a 6 of Hearts is worth 6.</p></li>
<li><p>Face cards (JQK) are worth 10.</p></li>
<li><p>Ace can be worth 1 or 11.</p></li>
</ul>
<p>The person with the highest valued hand wins, with one exception - if a person has 5 cards in their hand and it has any value 21 or less, then they win automatically. This is called a 5 card trick.</p>
<p>If the value of your hand is worth over 21, you are 'bust', and automatically lose.</p>
<p>Your challenge is, given a set of players and their hands, print who wins (or if it is a tie game.)</p>
<h2>Input Description</h2>
<p>First you will be given a number, <strong>N</strong>. This is the number of players in the game.</p>
<p>Next, you will be given a further <strong>N</strong> lines of input. Each line contains the name of the player and the cards in their hand, like so:</p>
<pre><code>Bill: Ace of Diamonds, Four of Hearts, Six of Clubs
</code></pre>
<p>Would have a value of 21 (or 11 if you wanted, as the Ace could be 1 or 11.)</p>
<h2>Output Description</h2>
<p>Print the winning player. If two or more players won, print "Tie".</p>
<h1>Example Inputs and Outputs</h1>
<h2>Example Input 1</h2>
<pre><code>3
Alice: Ace of Diamonds, Ten of Clubs
Bob: Three of Hearts, Six of Spades, Seven of Spades
Chris: Ten of Hearts, Three of Diamonds, Jack of Clubs
</code></pre>
<h2>Example Output 1</h2>
<pre><code>Alice has won!
</code></pre>
<h2>Example Input 2</h2>
<pre><code>4
Alice: Ace of Diamonds, Ten of Clubs
Bob: Three of Hearts, Six of Spades, Seven of Spades
Chris: Ten of Hearts, Three of Diamonds, Jack of Clubs
David: Two of Hearts, Three of Clubs, Three of Hearts, Five of Hearts, Six of Hearts
</code></pre>
<h2>Example Output 2</h2>
<pre><code>David has won with a 5-card trick!
</code></pre>
<h1>Notes</h1>
<p>Here's a tip to simplify things. If your programming language supports it, create enumerations (<code>enum</code>) for card ranks and card suits, and create structures/classes (<code>struct</code>/<code>class</code>) for the cards themselves - see <a href="https://github.com/DropTableSpoon/Challenge170Easy/blob/master/Challenge170Easy/Cards/Card.cs">this example C# code</a>.</p>
<p>For resources on using structs and enums if you haven't used them before (in C#): <a href="https://duckduckgo.com/l/?kh=-1&amp;uddg=http%3A%2F%2Fmsdn.microsoft.com%2Fen-us%2Flibrary%2Fsaxz13w4.aspx">structs</a>, <a href="http://msdn.microsoft.com/en-us/library/sbbt4032.aspx">enums</a>.</p>
<p>You may want to re-use some code from your solution to <a href="http://www.reddit.com/r/dailyprogrammer/comments/24r50l/">this challenge</a> where appropriate.</p>
</div>
