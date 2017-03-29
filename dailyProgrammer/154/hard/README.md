# Wumpus Cave Game
<div class="md"><h1>Description:</h1>
<p>Across the land the people whisper "Beware the Wumpus. For it slumbers in the cave up yonder in the hills. Only the brave seek him."  </p>
<p>This challenge will be about implementing a simple rogue like game. You will create a game engine that will accept simple commands from the user. You will parse the commands and process them. You will score the moves with a point system. The goal of the player is to score the most points with 1 life. The cave will be a randomly generated N sized cave. </p>
<h1>Design:</h1>
<h2>Cave Creation:</h2>
<p>On running the game the user picks the size of the cave by entering a number N. This creates a cave NxN in size. N must be 10 to 20 in size.</p>
<p>The cave has rooms that scale with the size of the cave. The location of these rooms are picked randomly and the amount of each type is fixed on single number or percentage of how many rooms in the cave.</p>
<p><strong>Entrance</strong>: Only 1 of the rooms must be an entrance/exit point. This is where the player controlled hero spawns and can choose to leave the cave to end it.</p>
<p><strong>Wumpus</strong>: 15% of the rooms must spawn a Wumpus. (A monster your hero seeks to slay). So if you have 100 rooms, 15 of them will spawn a Wumpus.</p>
<p><strong>Pit Trap</strong>: 5% of the rooms must be a pit trap. If you walk into this room you fall to your doom. (And the game is over)</p>
<p><strong>Gold</strong>: 15% of the rooms must have a gold to loot. </p>
<p><strong>Weapon</strong>: 15% of the rooms must have a weapon on the ground for the player to pick up to use for slaying monsters.</p>
<p><strong>Empty</strong>: The remainder of rooms not assigned one of the above will be empty.</p>
<h2>Game Engine:</h2>
<p>The game engine is an endless loop. It will display to the user basic info for the game and prompt for a single letter command. It will parse the command then refresh the basic info and continue to prompt for a move. </p>
<p><strong>How the Game Ends:</strong></p>
<ul>
<li>The hero leaves the cave by the entrance. </li>
<li>The hero dies by moving into a pit trap room.</li>
<li>The hero dies by moving into a room with a Wumpus without having picked up a weapon.</li>
<li>The player chooses X to hard exit out of the game right of way.</li>
</ul>
<hr/>
<p>The player scores points. The higher the points the better they do at the game. The following is the point system.</p>
<p><strong>Point system:</strong></p>
<ul>
<li>Explore an empty room not visited before: 1 point</li>
<li>Find and Pickup a weapon: 5 points</li>
<li>Find and kill a Wumpus: 10 points</li>
<li>Find and loot gold: 5 points</li>
</ul>
<hr/>
<p><strong>Game Commands:</strong></p>
<p>When prompted the following commands can be entered and causes an action for the player:
(Note: Case insensitive -- uppercase shown for easy to read)</p>
<ul>
<li>? -- help to show this list of moves a player can make</li>
<li>N  -- move north 1 space - cannot move north if the cave ends (outside of grid)</li>
<li>S  -- move south 1 space - cannot move south if the cave ends (outside of grid)</li>
<li>E  -- move east 1 space - cannot move east if the cave ends (outside of grid)</li>
<li>W -- moves west 1 space - cannot move west if the cave ends (outside of grid)</li>
<li>L -- loot either gold or weapon in the room</li>
<li>R -- run out of the cave entrance and head to the local inn to share your tale</li>
<li>X -- this is a hard exit out of the game. The game ends with no points awarded.</li>
</ul>
<h2>Environment Changes:</h2>
<p>As the game progresses the cave changes based on the actions.</p>
<ul>
<li><p>Once a weapon is picked up all other weapon rooms turn into gold rooms.</p></li>
<li><p>Entering a Wumpus room with a weapon that has been picked up instantly slays the Wumpus and turns that room into an empty explored room (only points for kill the Wumpus are given not points for exploring an empty room as well)</p></li>
<li><p>Picking up a weapon/gold will turn that room into an empty explored room (only points for the items and not for exploring an empty room)</p></li>
</ul>
<h2>Understanding Walls &amp; Environment:</h2>
<p>There are walls surrounding your cave. So for example if you pick N to be 10 you will have a 10x10 cave. But really the cave is 12x12 with the Border of the Cave being Walls. You cannot go in a direction that would put you into a wall. (This is not a game for mining) Trying to move into a wall will display an error describing how you bump into a wall or such and continue then to redisplay the current room you are in and prompt for another command.</p>
<p>As you move in the cave you will be given hints to nearby dangers (see below on output). If to the n, s, e, w of your position you are next ta Wumpus you will "Detect a Foul Stench in the Air". If to the n, s, e, w of your position you are next to a pit trap you will "Hear a howling wind".</p>
<p>There are no clues to being near an empty room, gold or weapons. </p>
<h1>Input &amp; Output:</h1>
<h2>Start of Game:</h2>
<p>either pass the N size of the cave as a start up value, you can prompt for it, you can hard code it. Whatever you like but somehow you must set the N value of the cave.</p>
<h2>Status:</h2>
<p>The program will give status to the user in the following format</p>
<p>(Ascii Display of surrounding rooms)</p>
<p>(Description of Room you are in)</p>
<p>(Environment Clues/Description)</p>
<p>[x Points Earned] You are (Weaponless/Armed).</p>
<p>Enter Move (? for help) &gt;</p>
<p><strong>Ascii Display</strong></p>
<p>You will show the 8 rooms surrounding you. Use the following ASCII values to represent rooms as such.</p>
<ul>
<li>@ - the hero in the middle of the 9 rooms (8 surrounding and the one in the middle which you occupy)</li>
<li>? - unexplored room that could be empty, weapon, gold, wumpus or a pit trap</li>
<li>. - explored/empty room</li>
<li># - wall showing the boundary of the cave</li>
<li>^ - Entrance to the cave where you can run out</li>
<li>W - weapon in an explored weapon room that you did not bother to loot which would be odd. You can't beat a Wumpus Unarmed.</li>
<li>$ - gold in an explored gold room that you did not bother to loot. Not looting this means you did not understand the goal of the game.</li>
</ul>
<p>Examples:</p>
<p>You are in the upper left corner of the cave.</p>
<pre><code>###
#@?
#.?
</code></pre>
<p>Just left the entrance and started to explore. Hey why did you leave that gold there?</p>
<pre><code>^??
.@$
.??
</code></pre>
<p>You are not having luck finding anything right now</p>
<pre><code>###
.@.
...
</code></pre>
<p><strong>Description of Room:</strong></p>
<p>Examples of how you might describe the rooms. Feel free to customize to your liking or humor. </p>
<p>Entrance Room -- you see see the entrance here. You wish to run away?</p>
<p>Empty Room -- you see nothing which is something</p>
<p>Pit trap -- aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhhhhhhhhh noooooooooooooooooo <em>Splat</em></p>
<p>Wumpus Room -- Overwhelmed in Stench a Wumpus stands before you ready to eat you.</p>
<p>Gold Room - before you lies the the gold of adventure seekers who feed a Wumpus Recently</p>
<p>Weapon Room - Cast before you in a rock a sword awaits to be looted and name yourself King.</p>
<p><strong>Environmental Clues/Description:</strong></p>
<p>This is giving you clues to nearby threats as well as describing any battles if you enter a room with a Wumpus and you are armed.</p>
<p>If next to a pit room you see a message like "Howling Winds Fill the Room"
If next to a Wumpus room you see a message like "A fowl Stench fills the room"
If you enter a room with a wumpus you describe if you kill it or you get eaten based on if you have a weapon or not.
If you enter a pit trap room - have fun describing how one falls before showing the game over.</p>
<hr/>
<p>So putting it all together you might see these screen shots</p>
<pre><code>###
#@?
#.?
Empty Room - there is nothing here but air.
You hear howling winds.
[10 points earned] You are weaponless.
Enter Move (? for help) &gt;


###
.@.
...
Empty Room - there is nothing here but air.
[23 points earned] You are armed and dangerous.
Enter Move (? for help) &gt;
</code></pre>
<h2>End of Game Message:</h2>
<p>When the game ends due to the conditions display why the game is over. Say the game is over and show the final points.</p>
<p>Examples: </p>
<p>Say you find a wumpus unarmed.</p>
<pre><code>A Wumpus attacks you and makes you his lunch.
***GAME OVER***
You scored 24 Points!
</code></pre>
<p>Say you find that pit trap:</p>
<pre><code>You fall to your death. Your screams are heard by no one.
***GAME OVER***
You scored 1 whole point!
</code></pre>
<p>Say you exit out of the dungeon</p>
<pre><code>You exit the Wumpus cave and run to town. People buy you ales as you tell the story of your adventure.
***GAME OVER***
You scored 120 points! Well Played!
</code></pre>
<h1><strong>Notes:</strong></h1>
<p>I have done what I can to layout the challenge with a very large design requirement. There will be potential for holes or missing elements in the design or things I perhaps did not address in the design. Please find a suitable solution that fits your desire and implementation and consider this part of the challenge. However if you wish to ask questions about the design or point out obvious things missing from the design, please comment and I can make adjustments.</p>
<p>Be creative. There are lots of strings for feedback or descriptions. Come up with your own or perhaps find a way to do random strings to keep the game fresh and unique. Add other features or monsters or whatever. This design for the challenge is much like the pirate code - it is just a bunch of guidelines for you to bend to your need and liking.</p>
<p>Remember to add Error messages. If you loot an empty cave or move to a direction towards a wall you must display what happens and then either redisplay the whole status or just the prompt for a move. Up to you to decide.</p>
<p>This hard challenges builds on skills learned in doing easy and intermediate challenges. The difficulty comes from following a larger design than normal and putting it all together to make a very fun game. Have fun and enjoy the challenge!</p>
</div>
