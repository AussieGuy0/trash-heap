# IRC: Interactivity
<div class="md"><h1>Description</h1>
<p>In the previous two challenges the main focus has been on automated actions. Today we will be focusing on manual inputs.
Instead of being a chat bot, today's project will be a chat client.</p>
<p>Your client must allow for simultaneous input and output, so that the user can read messages while writing their own
response. It should allow the user to join and chat to multiple channels, as well as read the outputs of those channels.
They should also be able to leave (part) those channels, and message specific users directly.</p>
<p>It must also keep track of which users are in what channels. When you first join a channel, you will receive a list of
nicks that are currently in that channel. This will come as one or more messages <code>RPL_NAMREPLY</code> which is defined as <code>353</code>.
These names will sometimes be prefixed by symbols indicating special operator status, but for our purposes that can be
ignored or discarded. The <code>=</code> message parameter can also be discarded, as it holds no specific meaning. Once the server has
finished sending <code>RPL_NAMEREPLY</code> messages, it will send an <code>RPL_ENDOFNAMES</code> message, which is defined as <code>366</code>.</p>
<pre><code>:wolfe.freenode.net 353 GeekBot = #reddit-dailyprogrammer :GeekBot Blackshell @GeekDude +jose_ +j-bot
:wolfe.freenode.net 366 GeekBot #reddit-dailyprogrammer :End of /NAMES list.
</code></pre>
<h1>Input Description</h1>
<p>Initial program input is the same as Monday's challenge. However, in addition to this there should be an input field
that the user can use to send chat messages and specify chat messages and commands.</p>
<pre><code>chat.freenode.net:6667
Nickname
Username
Real Name
</code></pre>
<p>Because you can be joined to multiple channels at once, there must be one channel selected for your messages to be sent to.
This will be referred to as the 'current output channel'. Whenever you send a message, it will be sent to the current
output channel, which can be any of the channels you are currently joined to. You must be able to switch between these
channels through chat commands, or through an optional mouseable interface.</p>
<p>And as for chat commands, the following should be supported. Braces <code>[]</code> denote optional fields. <code>//</code> denotes comment.</p>
<pre><code>/join #channel    // Joins a channel
/part [#channel]  // Parts a specified channel, or the current output channel
/quit             // Sends a QUIT message and closes the connection
/msg user private message // Sends a message to a user directly
/nicks [#channel] // Lists the nicks joined to a specified channel, or the current output channel
/channel #channel // Changes the current output channel
</code></pre>
<h1>Output Description</h1>
<p>There should be an output field that shows parsed messages in the following format:</p>
<pre><code>[HH:MM] GeekBot has joined #rdp
[HH:MM] #rdp &lt;GeekBot&gt; Hey, is anyone here?
[HH:MM] GeekDude has joined #rdp
[HH:MM] #rdp &lt;GeekDude&gt; Oh, hey GeekBot.
[HH:MM] GeekBot has joined #reddit-dailyprogrammer
[HH:MM] #reddit-dailyprogrammer &lt;GeekBot&gt; This is a test message
[HH:MM] GeekBot has parted #rdp
[HH:MM] GeekBot &lt;GeekDude&gt; This is a private message
[HH:MM] GeekBot has parted #reddit-dailyprogrammer
</code></pre>
<p>It should show the joins/parts of any users, including yourself. Outgoing messages should be shown as well as incoming.</p>
<h1>Challenge Input</h1>
<p>Keep separate logs for each channel, and only populate the output field with messages from the current output channel.</p>
<h1>Challenge Output</h1>
<p>Because you no longer have to specify where a message is coming from, the message log should be formatted as follows:</p>
<p>#reddit-dailyprogrammer</p>
<pre><code>[HH:MM] GeekBot has joined #reddit-dailyprogrammer
[HH:MM] &lt;GeekBot&gt; This is a test message
[HH:MM] &lt;jose_&gt; This conversation is entirely made up
[HH:MM] &lt;GeekBot&gt; Yes, yes it is. Got to go!
[HH:MM] GeekBot has parted #reddit-dailyprogrammer
</code></pre>
<p>#rdp</p>
<pre><code>[HH:MM] GeekBot has joined #rdp
[HH:MM] &lt;GeekBot&gt; Hey, is anyone here?
[HH:MM] GeekDude has joined #rdp
[HH:MM] &lt;GeekDude&gt; Oh, hey GeekBot.
[HH:MM] &lt;GeekBot&gt; What's up GeekDude?
[HH:MM] GeekDude has parted #rdp
[HH:MM] &lt;GeekBot&gt; Guess he won't be replying...
[HH:MM] GeekBot has parted #rdp
</code></pre>
<p>GeekDude (not technically a channel, but it should go into its own section for the individual messager)</p>
<pre><code>[HH:MM] GeekBot &lt;GeekDude&gt; This is a private message. Sorry for parting without replying to your message.
</code></pre>
<h1>Bonus</h1>
<p>Allow the user to connect to multiple servers. You should be able to accept a comma separated list of servers in the
initial input, as well as allow the user to connect to or switch between servers using the <code>/server server [port]</code> command.
Port is optional and should default to 6667.</p>
<h1>Notes</h1>
<p>To verify your code is joining channels and chatting correctly, I suggest joining the channel in advance using an already
finished IRC client, such as the web based <a href="http://webchat.freenode.net/">http://webchat.freenode.net/</a>.</p>
<p>You can see the full original IRC specification at <a href="https://tools.ietf.org/html/rfc1459">https://tools.ietf.org/html/rfc1459</a>. See also, <a href="http://ircdocs.horse/specs/">http://ircdocs.horse/specs/</a>.</p>
<p><a href="https://mybuddymichael.com/writings/a-regular-expression-for-irc-messages.html">A Regular Expression For IRC Messages</a></p>
</div>
