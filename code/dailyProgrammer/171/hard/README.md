# Intergalatic Bitstream
<div class="md"><h1>Description:</h1>
<p>Keeping with our "Bit" theme this week. We will look into the future. It is 2114. We have colonized the Galaxy. To communicate we send 140 character max messages using [A-Z0-9 ]. The technology to do this requires faster than light pulses to beam the messages to relay stations.</p>
<p>Your challenge is to implement the compression for these messages. The design is very open and the solutions will vary.</p>
<p>Your goals:</p>
<ul>
<li><p>Compact 140 Bytes down to a stream of bits to send and then decompact the message and verify 100% data contained.</p></li>
<li><p>The goal is bit reduction. 140 bytes or less at 8 bits per byte so thats 1120 bits max. If you take a message of 140 bytes and compress it to 900 bits you have 220 less bits for 20% reduction.</p></li>
</ul>
<h1>Input:</h1>
<p>A text message of 140 or less characters that can be [A-Z0-9 ]</p>
<h1>Output:</h1>
<pre><code> Read Message of x Bytes.
 Compressing x*8 Bits into y Bits. (z% compression)
 Sending Message.
 Decompressing Message into x Bytes.
 Message Matches!
</code></pre>
<ul>
<li>x - size of your message</li>
<li>x* 8 = bits of your message</li>
<li>z - the percentage of message compressed by</li>
<li>y bits of your bit stream for transmission</li>
</ul>
<p>So compress your tiny message and show some stats on it and then decompress it and verify it matches the original message.</p>
<h1>Challenge Inputs:</h1>
<p>three  messages to send:</p>
<pre><code> REMEMBER TO DRINK YOUR OVALTINE


 GIANTS BEAT DODGERS 10 TO 9 AND PLAY TOMORROW AT 1300 


 SPACE THE FINAL FRONTIER THESE ARE THE VOYAGES OF THE BIT STREAM DAILY PROGRAMMER TO SEEK OUT NEW COMPRESSION
</code></pre>
<h1>Congrats!</h1>
<p>We are a trending subreddit for today 7-18-2014. Welcome to first time viewers of <a href="/r/dailyprogrammers">/r/dailyprogrammers</a> checking out our cool subreddit. We have lots of programming challenges for you to take on in the past and many to look forward to in the future.</p>
</div>
