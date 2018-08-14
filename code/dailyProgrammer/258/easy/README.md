# IRC: Making a Connection
<div class="md"><h1>Description</h1>
<p>A <a href="https://en.wikipedia.org/wiki/Network_socket">network socket</a> is an endpoint of a connection across a computer network.
Today, most communication between computers is based on the Internet Protocol; therefore most network sockets are Internet
sockets. <a href="https://simple.wikipedia.org/wiki/Internet_Relay_Chat">Internet Relay Chat</a> (IRC) is a chat system on the Internet.
It allows people from around the world to have conversations together, but it can also be used for two people to chat
privately.</p>
<p><a href="https://en.wikipedia.org/wiki/Freenode">Freenode</a> is an IRC network used to discuss peer-directed projects. Their servers
are all accessible from the domain names chat.freenode.net and irc.freenode.net. In 2010, it became the largest free and
open source software-focused IRC network.  In 2013 it became the largest IRC network, encompassing more than 90,000 users
and 40,000 channels and gaining almost 5,000 new users per year. We have a channel on freenode ourselves for all things
<a href="/r/DailyProgrammer">/r/DailyProgrammer</a> on freenode, which is
<a href="https://www.reddit.com/r/dailyprogrammer/comments/2dtqr7/psa_rdailyprogrammer_irc_channel/">#reddit-dailyprogrammer</a>.</p>
<p>Your challenge today will be to communicate with the freenode IRC server. This will consist of opening a TCP socket to
freenode and sending two protocol messages to initiate the connection. The original
<a href="https://tools.ietf.org/html/rfc1459#section-4.1">IRC RFC</a> defines a message as a line of text up to 512 bytes starting 
with a message code, followed by one or more space separated parameters, and ending with a CRLF (<code>\r\n</code>). The last
paramater can be prefixed by a colon to mark it as a parameter that can contain spaces, which will take up the rest of the
line. An example of a colon-prefixed parameter would be the contents of a chat message, as that is something that contains spaces.</p>
<p>The first of the two initiation messages (<code>NICK</code>) defines what name people will see when you send a chat message.
It will have to be unique, and you will not be able to connect if you specify a name which is currently in use or reserved.
It has a single parameter <code>&lt;nickname&gt;</code> and will be sent in the following form:</p>
<pre><code>NICK &lt;nickname&gt;
</code></pre>
<p>The second of the two initiation messages (<code>USER</code>) defines your username, user mode, server name, and real name. The username must also be unique and is usually set to be the same as the nickname. Originally, hostname was sent instead of user mode, but this was changed in a later version of the IRC protocol. For our purposes, standard mode <code>0</code> will work fine. As for server name, this will be ignored by the server and is conventionally set as an asterisk (<code>*</code>). The real name parameter can be whatever you want, though it is usually set to be the same value as the nickname. It does not have to be unique and may contain spaces. As such, it must be prefixed by a colon. The <code>USER</code> message will be sent in the following form:</p>
<pre><code>USER &lt;username&gt; 0 * :&lt;realname&gt;
</code></pre>
<h1>Input Description</h1>
<p>You will give your program a list of lines specifying server, port, nickname, username, and realname. The first line will contain the server and the port, separated by a colon. The second through fourth lines will contain nick information.</p>
<pre><code>chat.freenode.net:6667
Nickname
Username
Real Name
</code></pre>
<h1>Output Description</h1>
<p>Your program will open a socket to the specified server and port, and send the two required messages. For example:</p>
<pre><code>NICK Nickname
USER Username 0 * :Real Name
</code></pre>
<p>Afterwards, it will begin to receive messages back from the server. Many messages sent from the server will be prefixed to indicate the origin of the message. This will be in the format <code>:server</code> or <code>:nick[!user][@host]</code>, followed by a space. The exact contents of these initial messages are usually not important, but you must output them in some manner. The first few messages received on a successful connection will look something like this:</p>
<pre><code>:wolfe.freenode.net NOTICE * :*** Looking up your hostname...
:wolfe.freenode.net NOTICE * :*** Checking Ident
:wolfe.freenode.net NOTICE * :*** Found your hostname
:wolfe.freenode.net NOTICE * :*** No Ident response
:wolfe.freenode.net 001 Nickname :Welcome to the freenode Internet Relay Chat Network Nickname
</code></pre>
<h1>Challenge Input</h1>
<p>The server will occasionally send <code>PING</code> messages to you. These have a single parameter beginning with a colon. The exact contents of that parameter will vary between servers, but is usually a unique string used to verify that your client is still connected and responsive. On freenode, it appears to be the name of the specific server you are connected to. For example:</p>
<pre><code>PING :wolfe.freenode.net
</code></pre>
<h1>Challenge Output</h1>
<p>In response, you must send a <code>PONG</code> message with the parameter being the same unique string from the <code>PING</code>. You must continue to do this for the entire time your program is running, or it will get automatically disconnected from the server. For example:</p>
<pre><code>PONG :wolfe.freenode.net
</code></pre>
<h1>Notes</h1>
<p>You can see the full original IRC specification at <a href="https://tools.ietf.org/html/rfc1459">https://tools.ietf.org/html/rfc1459</a>. Sections 2.3 and 4.1 are of particular note, as they describe the message format and the initial connection. See also, <a href="http://ircdocs.horse/specs/">http://ircdocs.horse/specs/</a>.</p>
<p><a href="https://mybuddymichael.com/writings/a-regular-expression-for-irc-messages.html">A Regular Expression For IRC Messages</a></p>
<p>Happy Pi Day!</p>
</div>
