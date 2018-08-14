# (Vigenère cipher)
<div class="md"><p>The easy challenge today is to implement the famous <a href="http://en.wikipedia.org/wiki/Vigen%C3%A8re_cipher">Vigenère cipher</a>. The Wikipedia article explains well how it works, but here's a short description anyway:</p>
<p>You take a message that you want to encrypt, for instance "THECAKEISALIE" (lets assume that all characters are upper-case and there are no spaces in the messages, for the sake of simplicity), and a key you want to encrypt it with, for instance "GLADOS". You then write the message with the key repeated over it, like this:</p>
<pre><code>GLADOSGLADOSG
THECAKEISALIE
</code></pre>
<p>The key is repeated as often as is needed to cover the entire message. </p>
<p>Now, one by one, each letter of the key is "added" to the letter of the clear-text to produce the cipher-text. That is, if A = 0, B = 1, C = 2, etc, then E + G = K (because E = 4 and G = 6, and 4 + 6 = 10, and K = 10). If the sum is larger than 25 (i.e. larger than Z), it starts from the beginning, so S + K = C (i.e. 18 + 10 = 28, and 28 - 26 is equal to 2, which is C).</p>
<p>For a full chart of how characters combine to form new characters, see <a href="http://en.wikipedia.org/wiki/File:Vigen%C3%A8re_square_shading.svg">here</a></p>
<p>The cipher text then becomes:  </p>
<pre><code>GLADOSGLADOSG
THECAKEISALIE
-------------
ZSEFOCKTSDZAK
</code></pre>
<p>Write funtions to both encrypt and decrypt messages given the right key.</p>
<p>As an optional bonus, decrypt the following message, which has been encrypted with a word that I've used in this post:</p>
<pre><code>HSULAREFOTXNMYNJOUZWYILGPRYZQVBBZABLBWHMFGWFVPMYWAVVTYISCIZRLVGOPGBRAKLUGJUZGLN
BASTUQAGAVDZIGZFFWVLZSAZRGPVXUCUZBYLRXZSAZRYIHMIMTOJBZFZDEYMFPMAGSMUGBHUVYTSABB
AISKXVUCAQABLDETIFGICRVWEWHSWECBVJMQGPRIBYYMBSAPOFRIMOLBUXFIIMAGCEOFWOXHAKUZISY
MAHUOKSWOVGBULIBPICYNBBXJXSIXRANNBTVGSNKR
</code></pre>
<p>As an additional challenge, attempt to pronounce "Vigenère" properly. I think it's like "Viche-en-ere", but I'm not entirely sure. </p>
</div>
