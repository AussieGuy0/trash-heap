# Network and Cards: Part 2, The cards
<div class="md"><h1>Description</h1>
<p>This week we are creating a game playable over network. This will be a 3-parter.</p>
<p>The second part is less dry then the first part. We are going to play a simplyfied version of blackjack over the network.
The server will deal cards over the network to all connected clients, there is no dealer stack like in real blackjack.</p>
<p>When all connected clients send a <code>START</code> command, the game will begin, you don't have to look for other connections then.</p>
<p>The communication goes as followed:</p>
<pre><code>SERVER -&gt; CLIENT A: TAKE or PASS
CLIENT A -&gt; SERVER: TAKE
SERVER -&gt; CLIENT A: HEARTS QUEEN

SERVER -&gt; CLIENT B: TAKE or PASS
CLIENT B -&gt; SERVER: PASS
</code></pre>
<p>The client has the option to either respond with a <code>TAKE</code> command or <code>PASS</code> command, the server then go to the next client till everyone is done (all passed or everyone has 21 or more in score)</p>
<p>The cards have the following values:</p>
<pre><code>2 -&gt; 2
3 -&gt; 3
4 -&gt; 4
5 -&gt; 5
6 -&gt; 6
7 -&gt; 7
8 -&gt; 8
9 -&gt; 9
Jack -&gt; 10
Queen -&gt; 10
King -&gt; 10
Ace -&gt; 1 or 11 (11 if not over 21 and 1 if over)
</code></pre>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input description</h2>
<ul>
<li>Server</li>
</ul>
<p>Server has to accept at least 3 commands: <code>START</code>, <code>TAKE</code> and <code>PASS</code></p>
<ul>
<li><p>Client</p>
<p>Clients must be able to recieve the choice for <code>TAKE</code> and <code>PASS</code> and must be able to recieve cards, format of that is up to you</p></li>
</ul>
<h2>Output description</h2>
<ul>
<li><p>Server</p>
<p>No Output required, but I can imagen that some loggin will be handy.</p>
<ul>
<li>Client</li>
</ul>
<p>A decent output for humans to read the cards and see their current score.
Also must know when to type in the option to <code>TAKE</code> and <code>PASS</code></p></li>
</ul>
<h1>Notes/Hints</h1>
<h2>TCP Socket approach</h2>
<p>The server needs to able to handle multiple clients in the end, so a multithreaded approach is advised.
It is advised to think of some command like pattern, so you can send messages to the server and back.</p>
<p>For the server and client, just pick some random ports that you can use. <a href="https://en.wikipedia.org/wiki/List_of_TCP_and_UDP_port_numbers">Here</a> you have a list off all "reserved" ports.</p>
<p>For the connection, TCP connections are the easiest way to do this in most languages. But you are not limited to that if you want to use something more high-level if your language of choice supports that.</p>
<h2>REST api approach</h2>
<p>Some off you pointed out that this could be done with a webserver. If this is more in the line of what you are used to, no problem then, as long as it stays in the line of a multiplayer game.</p>
<h1>Bonus</h1>
<ul>
<li>Send all the events to other clients in the form <code>CLIENT A takes a Queen of Hearts</code> or <code>Client A passes</code></li>
<li>Allow clients to join when a game is running for the next game</li>
<li>Add a spectator mode, nothing more fun then Let's play no?</li>
</ul>
<h1>Finally</h1>
<p>Have a good challenge idea?</p>
<p>Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
</div>
