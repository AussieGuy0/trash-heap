# IRC: Responding to commands
<div class="md"><h1>Description</h1>
<p>In the last challenge we initiated a connection to an IRC server. This time we are going to utilise that connection by
responding to user input. On an IRC server you can communicate with other users either directly, or in a group chatroom
known as a channel. Channel names are distinguished from users by a prefixed character (<code>#</code> on freenode) in the name.</p>
<p>After connecting to an IRC server you will receive some informational text from the server known as the Message Of The Day,
or MOTD. The server will buffer any messages (particularly attempts to join channels) sent before it has finished.
The end of the MOTD is marked by the message <code>RPL_ENDOFMOTD</code> which is defined as the number <code>376</code>. You don't necessarily
have to wait for the end of the MOTD before joining, but I've found it usually works better if you do.</p>
<pre><code>:wolfe.freenode.net 376 GeekBot :End of /MOTD command.
</code></pre>
<p>To join a channel you must use the <code>JOIN</code> message. It takes a single parameter, which is a comma separated list of one or
more channels.</p>
<pre><code>JOIN #reddit-dailyprogrammer,#botters-test
</code></pre>
<p>Once you have sent this message, you will receive one or more JOIN message(s) back from the server for every channel
you were successfully able to join. The message you receive back will be prefixed with yourself as the origin.</p>
<pre><code>:GeekBot!G33kDude@192-168-1-42.isp.com JOIN #reddit-dailyprogrammer
:GeekBot!G33kDude@192-168-1-42.isp.com JOIN #botters-test
</code></pre>
<p>After you've been joined to the channel, you can send text to the channel using the <code>PRIVMSG</code> message. It takes two
parameters, the first being the the comma separated list of users or channels to send the text to, and the second being the
colon prefixed message text.</p>
<pre><code>PRIVMSG #reddit-dailyprogrammer :Hello World!
</code></pre>
<p>In addition to being able to send messages, you can receive messages that have been sent to the channel by other users.
You should listen for a phrase prefixed with your name, then respond to that chat message. For example, you might see
the following chat message.</p>
<pre><code>:GeekDude!G33kDude@192-168-1-42.isp.com PRIVMSG #ahkscript :GeekBot: random 20
</code></pre>
<p>Your code would parse this message, and see the chatted contents were <code>GeekBot: random 20</code>. In response, your program might
do something like generate a random number, and chat it back.</p>
<pre><code>PRIVMSG #ahkscript :GeekDude: 4 // chosen by fair 20 sided dice roll // guaranteed to be random
</code></pre>
<h1>Input Description</h1>
<p>In addition to the input from last time's challenge, there will also be two line specifying a channel to join, and a
message to chat upon joining.</p>
<pre><code>chat.freenode.net:6667
Nickname
Username
Real Name
#reddit-dailyprogrammer,#rdp,#botters-test
Hello World!
</code></pre>
<h1>Output Description</h1>
<p>In addition to the last challenge's output, you must also pick and respond to one or more chat commands. These commands
must take at least one parameter, and the return value should be chatted back to the same channel prefixed with the nick
of the person who invoked the command.</p>
<p>The following code block has the prefix <code>&gt;</code> for outgoing messages, and <code>&lt;</code> for incoming messages.</p>
<pre><code>&gt;NICK Nickname
&gt;USER Username 0 * :Real Name
&lt;:wolfe.freenode.net NOTICE * :*** Looking up your hostname...
&lt;:wolfe.freenode.net NOTICE * :*** Checking Ident
&lt;:wolfe.freenode.net NOTICE * :*** Found your hostname
&lt;:wolfe.freenode.net NOTICE * :*** No Ident response
&lt;:wolfe.freenode.net 001 Nickname :Welcome to the freenode Internet Relay Chat Network Nickname
--- A bit later ---
&lt;:wolfe.freenode.net 376 MyRC_Bot :End of /MOTD command.
&gt;JOIN #reddit-dailyprogrammer,#rdp,#botters-test
&lt;:GeekBot!G33kDude@192-168-1-42.isp.com JOIN #reddit-dailyprogrammer
&gt;PRIVMSG #reddit-dailyprogrammer :Hello World!
&lt;:GeekBot!G33kDude@192-168-1-42.isp.com JOIN #rdp
&gt;PRIVMSG #rdp :Hello World!
&lt;:GeekBot!G33kDude@192-168-1-42.isp.com JOIN #botters-test
&gt;PRIVMSG #botters-test :Hello World!
--- Wait for chat ---
&lt;:GeekDude!G33kDude@192-168-1-42.isp.com PRIVMSG #reddit-dailyprogrammer :GeekBot: sum 12 8 7 3 5
&gt;PRIVMSG #reddit-dailyprogrammer :GeekDude: The sum is 35
</code></pre>
<p>Also, don't forget to return any incoming <code>PING</code> messages!</p>
<h1>Challenge Input</h1>
<p>Your bot should handle commands sent to it directly as well as through normal channels. When you receive such a message,
the channel parameter of <code>PRIVMSG</code> is set to your own nickname.</p>
<pre><code>:GeekDude!G33kDude@192-168-1-42.isp.com PRIVMSG GeekBot :GeekBot: mult 6 9
</code></pre>
<h1>Challenge Output</h1>
<p>You will have to recognize that the message has been sent directly to you, so you can send your own reply directly back.
If you tried to send to the same destination as the original message (as you would with a regular channel message),
you would end up sending the chat to yourself.</p>
<pre><code>PRIVMSG GeekDude :GeekDude: 42
</code></pre>
<h1>Bonus</h1>
<p>When communicating with the bot directly via private message, nickname prefixes for calling commands and for return
values should be optional. For example, the following should work:</p>
<pre><code>&lt;:GeekDude!G33kDude@192-168-1-42.isp.com PRIVMSG GeekBot :GeekBot: div 1 9801
&gt;PRIVMSG GeekDude :GeekDude: 0.00010203...
&lt;:GeekDude!G33kDude@192-168-1-42.isp.com PRIVMSG GeekBot :div 1 9801
&gt;PRIVMSG GeekDude :0.00010203...
</code></pre>
<h1>Notes</h1>
<p>Be careful not to allow your bot to generate any newlines in response to a command. For example, if your bot did hex to
ascii conversion (<code>GeekBot: hex2ascii 0D0A</code>) someone could potentially cause the bot to send a new protocol message, which
could do all sorts of nasty things. This includes sending the <code>QUIT</code> message which would disconnect the bot, or making it
spam people potentially getting it banned. If your bot is registered to an account, someone could use this technique to
delete the account, or reset the password.</p>
<p>To verify your code is joining channels and chatting correctly, I suggest joining the channel(s) in advance using an IRC client, such as the web based <a href="http://webchat.freenode.net/">http://webchat.freenode.net/</a>.</p>
<p>You can see the full original IRC specification at <a href="https://tools.ietf.org/html/rfc1459">https://tools.ietf.org/html/rfc1459</a>. See also, <a href="http://ircdocs.horse/specs/">http://ircdocs.horse/specs/</a>.</p>
<p><a href="https://mybuddymichael.com/writings/a-regular-expression-for-irc-messages.html">A Regular Expression For IRC Messages</a></p>
<p>I get the distinct feeling I've missed something, so if you see anything off let me know.</p>
</div>
