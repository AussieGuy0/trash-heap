# Simple Stream Cipher
<div class="md"><h1>Description</h1>
<p>Stream ciphers like <a href="https://en.wikipedia.org/wiki/RC4">RC4</a> operate very simply: they have a strong psuedo-random number generator that takes a key and produces a sequence of psuedo-random bytes as long as the message to be encoded, which is then XORed against the plaintext to provide the cipher text. The strength of the cipher then depends on the strength of the generated stream of bytes - its randomness (or lack thereof) can lead to the text being recoverable.</p>
<h1>Challenge Inputs and Outputs</h1>
<p>Your program should have the following components:</p>
<ul>
<li>A psuedo-random number generator which takes a key and produces a consistent stream of psuedo-random bytes. A very simple one to implement is the <a href="https://en.wikipedia.org/wiki/Linear_congruential_generator">linear congruential generator (LCG).</a> </li>
<li>An "encrypt" function (or method) that takes a key and a plaintext and returns a ciphertext.</li>
<li>A "decrypt" function (or method) that takes a key and the ciphertext and returns the plaintext. </li>
</ul>
<p>An example use of this API might look like this (in Python):</p>
<pre><code>key = 31337
msg = "Attack at dawn"
ciphertext = enc(msg, key)
# send to a recipient

# this is on a recipient's side
plaintext = dec(ciphertext, key)
</code></pre>
<p>At this point, <code>plaintext</code> should equal the original <code>msg</code> value. </p>
</div>
