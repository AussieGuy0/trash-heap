# Network and Cards: Part 1, The network
<div class="md"><h1>Description</h1>
<p>This week we are creating a game playable over network. This will be a 3-parter.</p>
<p>The first part is to set up a connection between a server and one or more client.
The server needs to send out a heartbeat message to the clients and the clients need to respond to it.</p>
<p>For those who want to be prepared, we are going to deal and play cards over the network.</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input description</h2>
<p>No input for the server, but the client needs to know where the server is.</p>
<h2>Output description</h2>
<p>The client needs to echo the heartbeat from the server.</p>
<h1>Notes/Hints</h1>
<p>The server needs to able to handle multiple clients in the end, so a multithreaded approach is advised.
It is advised to think of some command like pattern, so you can send messages to the server and back.</p>
<p>For the server and client, just pick some random ports that you can use. <a href="https://en.wikipedia.org/wiki/List_of_TCP_and_UDP_port_numbers">Here</a> you have a list off all "reserved" ports.</p>
<p>For the connection, TCP connections are the easiest way to do this in most languages. But you are not limited to that if you want to use something more high-level if your language of choice supports that.</p>
<h1>Bonus</h1>
<ul>
<li>Make the server broadcast it's existince on the network, so clients can detect him.</li>
<li>Send messages to the server and broadcast it to all the clients</li>
<li>Let the client identify itself (username)</li>
<li>Create a way to list all connected clients</li>
<li>Send messages to the server and relay it to a requested client</li>
</ul>
<p>These bonuses are not required, but it will make the next part a whole lot easier.</p>
<h1>Finally</h1>
<p>Have a good challenge idea?</p>
<p>Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
</div>
