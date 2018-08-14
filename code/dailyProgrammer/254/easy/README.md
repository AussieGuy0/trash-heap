# Atbash Cipher
<div class="md"><h1>Description</h1>
<p>Atbash is a simple substitution cipher originally for the Hebrew alphabet, but possible with any known alphabet. It emerged around 500-600 BCE. It works by substituting the first letter of an alphabet for the last letter, the second letter for the second to last and so on, effectively reversing the alphabet. Here is the Atbash substitution table:</p>
<pre><code>Plain:  abcdefghijklmnopqrstuvwxyz
Cipher: ZYXWVUTSRQPONMLKJIHGFEDCBA
</code></pre>
<p>Amusingly, some English words Atbash into their own reverses, e.g., "wizard" = "draziw."</p>
<p>This is not considered a strong cipher but was at the time. </p>
<p>For more information on the cipher, please see the <a href="https://en.wikipedia.org/wiki/Atbash">Wikipedia page on Atbash</a>. </p>
<h1>Input Description</h1>
<p>For this challenge you'll be asked to implement the Atbash cipher and encode (or decode) some English language words. If the character is NOT part of the English alphabet (a-z), you can keep the symbol intact. Examples:</p>
<pre><code>foobar
wizard
/r/dailyprogrammer
gsrh rh zm vcznkov lu gsv zgyzhs xrksvi
</code></pre>
<h1>Output Description</h1>
<p>Your program should emit the following strings as ciphertext or plaintext:</p>
<pre><code>ullyzi
draziw
/i/wzrobkiltiznnvi
this is an example of the atbash cipher
</code></pre>
<h1>Bonus</h1>
<p>Preserve case. </p>
</div>
