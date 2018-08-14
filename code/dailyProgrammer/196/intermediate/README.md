# Rail Fence Cipher
<div class="md"><h1><a href="#IntermediateIcon"></a> <strong>(Intermediate)</strong>: Rail Fence Cipher</h1>
<p>Before the days of computerised encryption, cryptography was done manually by hand. This means the methods of encryption were usually much simpler as they had to be done reliably by a person, possibly in wartime scenarios.</p>
<p>One such method was the <a href="http://en.wikipedia.org/wiki/Rail_fence_cipher">rail-fence cipher</a>. This involved choosing a number (we'll choose 3) and writing our message as a zig-zag with that height (in this case, 3 lines high.) Let's say our message is <code>REDDITCOMRDAILYPROGRAMMER</code>. We would write our message like this:</p>
<pre><code>R   I   M   I   R   A   R
 E D T O R A L P O R M E
  D   C   D   Y   G   M
</code></pre>
<p>See how it goes up and down? Now, to get the ciphertext, instead of reading with the zigzag, just read along the lines instead. The top line has <code>RIMIRAR</code>, the second line has <code>EDTORALPORME</code> and the last line has <code>DCDYGM</code>. Putting those together gives you <code>RIMIRAREDTORALPORMEDCDYGM</code>, which is the ciphertext.</p>
<p>You can also decrypt (it would be pretty useless if you couldn't!). This involves putting the zig-zag shape in beforehand and filling it in along the lines. So, start with the zig-zag shape:</p>
<pre><code>?   ?   ?   ?   ?   ?   ?
 ? ? ? ? ? ? ? ? ? ? ? ?
  ?   ?   ?   ?   ?   ?
</code></pre>
<p>The first line has 7 spaces, so take the first 7 characters (<code>RIMIRAR</code>) and fill them in.</p>
<pre><code>R   I   M   I   R   A   R
 ? ? ? ? ? ? ? ? ? ? ? ?
  ?   ?   ?   ?   ?   ?
</code></pre>
<p>The next line has 12 spaces, so take 12 more characters (<code>EDTORALPORME</code>) and fill them in.</p>
<pre><code>R   I   M   I   R   A   R
 E D T O R A L P O R M E
  ?   ?   ?   ?   ?   ?
</code></pre>
<p>Lastly the final line has 6 spaces so take the remaining 6 characters (<code>DCDYGM</code>) and fill them in.</p>
<pre><code>R   I   M   I   R   A   R
 E D T O R A L P O R M E
  D   C   D   Y   G   M
</code></pre>
<p>Then, read along the fence-line (zig-zag) and you're done!</p>
<h2>Input Description</h2>
<p>You will accept lines in the format:</p>
<pre><code>enc # PLAINTEXT
</code></pre>
<p>or </p>
<pre><code>dec # CIPHERTEXT
</code></pre>
<p>where <code>enc #</code> encodes <code>PLAINTEXT</code> with a rail-fence cipher using <code>#</code> lines, and <code>dec #</code> decodes <code>CIPHERTEXT</code> using <code>#</code> lines.</p>
<p>For example:</p>
<pre><code>enc 3 REDDITCOMRDAILYPROGRAMMER
</code></pre>
<h2>Output Description</h2>
<p>Encrypt or decrypt depending on the command given. So the example above gives:</p>
<pre><code>RIMIRAREDTORALPORMEDCDYGM
</code></pre>
<h1>Sample Inputs and Outputs</h1>
<pre><code>enc 2 LOLOLOLOLOLOLOLOLO
Result: LLLLLLLLLOOOOOOOOO

enc 4 THEQUICKBROWNFOXJUMPSOVERTHELAZYDOG
Result: TCNMRZHIKWFUPETAYEUBOOJSVHLDGQRXOEO

dec 4 TCNMRZHIKWFUPETAYEUBOOJSVHLDGQRXOEO
Result: THEQUICKBROWNFOXJUMPSOVERTHELAZYDOG

dec 7 3934546187438171450245968893099481332327954266552620198731963475632908289907
Result: 3141592653589793238462643383279502884197169399375105820974944592307816406286 (pi)

dec 6 AAPLGMESAPAMAITHTATLEAEDLOZBEN
Result: ?
</code></pre>
</div>
