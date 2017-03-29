# Substitution Cryptanalysis
<div class="md"><h1><a href="#HardIcon"></a> <em>(Hard)</em>: Substitution Cryptanalysis</h1>
<p>A <a href="https://en.wikipedia.org/?title=Substitution_cipher">substitution cipher</a> is one where each letter in the alphabet is substituted for another letter. It's like a Caesar shift cipher, but where every letter is ciphered independently. For example, look at the two rows below.</p>
<pre><code>abcdefghijklmnopqrstuvwxyz
YOJHZKNEALPBRMCQDVGUSITFXW
</code></pre>
<p>To encode something, find the letter on the top row, and swap it with the letter on the bottom row - and vice versa. For example, the plaintext:</p>
<pre><code>hello world
</code></pre>
<p>Becomes:</p>
<pre><code>EZBBC TCVBH
</code></pre>
<p>Now, how would you go about decrypting something like this? Let's take another example, with a different key.</p>
<pre><code>IAL FTNHPL PDDI DR RDNP WF IUD
</code></pre>
<p>You're also given the following hints: <code>A</code> is ciphered to <code>H</code> and <code>O</code> is ciphered to <code>D</code>. You know the text was in English, so you could plausibly use a word list to rule out impossible decrypted texts - for example, in the third words <code>PDDI</code>, there is a double-O in the middle, so the first letter rules out P being the letter Q, as Q is always followed by a U.</p>
<p>Your challenge is to decrypt a cipher-text into a list of possible original texts using a few letters of the substitution key, and whichever means you have at your disposal.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>On the first line of input you will be given the ciphertext. Then, you're given a number <strong>N</strong>. Finally, on the next <strong>N</strong> lines, you're given pairs of letters, which are pieces of the key. For example, to represent our situation above:</p>
<pre><code>IAL FTNHPL PDDI DR RDNP WF IUD
2
aH
oD
</code></pre>
<p>Nothing is case-sensitive. You may assume all plain-texts are in English. Punctuation is preserved, including spaces.</p>
<h2>Output Description</h2>
<p>Output a list of possible plain-texts. Sometimes this may only be one, if your input is specific enough. In this case:</p>
<pre><code>the square root of four is two
</code></pre>
<p>You don't need to output the entire substitution key. In fact, it may not even be possible to do so, if the original text isn't a pangram.</p>
<h1>Sample Inputs and Outputs</h1>
<h2>Sample 1</h2>
<h3>Input</h3>
<pre><code>LBH'ER ABG PBBXVAT CBEX PUBC FNAQJVPURF
2
rE
wJ
</code></pre>
<h3>Output</h3>
<pre><code>you're not cooking pork chop sandwiches
you're nob cooking pork chop sandwiches
</code></pre>
<p>Obviously we can guess which output is valid.</p>
<h2>Sample 2</h2>
<h3>Input</h3>
<p>This case will check your word list validator.</p>
<pre><code>ABCDEF
2
aC
zF
</code></pre>
<h3>Output</h3>
<pre><code>quartz
</code></pre>
<h2>Sample 3</h2>
<h3>Input</h3>
<pre><code>WRKZ DG ZRDG D AOX'Z VQVX
2
wW
sG
</code></pre>
<h3>Output</h3>
<pre><code>what is this i don't even
whet is this i can't ulun
</code></pre>
<p>(what's a ulun? I need a better word list!)</p>
<h2>Sample 4</h2>
<h3>Input</h3>
<pre><code>JNOH MALAJJGJ SLNOGQ JSOGX
1
sX
</code></pre>
<h3>Output</h3>
<pre><code>long parallel ironed lines
</code></pre>
<h1>Notes</h1>
<p>There's a handy word-list <a href="https://gist.githubusercontent.com/Quackmatic/512736d51d84277594f2/raw/words">here</a> or you could check out <a href="/r/dailyprogrammer/comments/2nluof/">this thread</a> talking about word lists.</p>
<p>You could also <em>in</em>validate words, rather than just validating them - check out <a href="http://linguistics.stackexchange.com/questions/4082/impossible-bigrams-in-the-english-language">this list of impossible two-letter combinations</a>. If you're using multiple systems, perhaps you could use a weighted scoring system to find the correct decrypted text.</p>
<p>There's an <a href="http://quipqiup.com/">example solver</a> for this type of challenge, which will try to solve it, but it has a really weird word-list and ignores punctuation so it may not be awfully useful.</p>
<p>Got any cool challenge ideas? Post them to <a href="/r/DailyProgrammer_Ideas">/r/DailyProgrammer_Ideas</a>!</p>
</div>
