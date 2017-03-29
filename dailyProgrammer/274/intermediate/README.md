# Calculating De Bruijn sequences
<div class="md"><h1>Description</h1>
<p>In combinatorial mathematics, a <em>k-ary</em> De Bruijn sequence <em>B(k, n)</em> of order <em>n</em>, named after the Dutch mathematician Nicolaas Govert de Bruijn, is a cyclic sequence of a given alphabet <em>A</em> with size <em>k</em> for which every possible subsequence of length <em>n</em> in <em>A</em> appears as a sequence of consecutive characters exactly once. At the terminus, you "wrap" the end of the sequence around to the beginning to get any remaining subsequences. </p>
<p>Each <em>B(k, n)</em> has length <em>k<sup>n</sup></em>.</p>
<p>A De Bruijn sequence <em>B(2, 3)</em> (with alphabet <em>0</em> and <em>1</em>) is therefore:</p>
<pre><code>00010111
</code></pre>
<p>Similarly, <em>B("abcd", 2)</em> (with alphabet "a", "b", "c", and "d") is therefore:</p>
<pre><code>aabacadbbcbdccdd
</code></pre>
<p>For those sequences of length, every trigram (for the former case) or bigram (for the latter case) is represented in the result. </p>
<p>De Bruijn sequences have various applications, including in PIN pad testing and rotor angle calculation. </p>
<h1>Input Description</h1>
<p>You'll be given two inputs <em>k</em> and <em>n</em>, the first is an integer or a a string of unique characters, the second is the length of the subsequences to ensure are encoded.</p>
<h1>Output Description</h1>
<p>Your program should emit a string that encodes the De Bruijn sequence.</p>
<h1>Input</h1>
<pre><code>5 3
2 4
abcde 4
</code></pre>
<h1>Output</h1>
<p>The outputs expected for those (in order) are:</p>
<pre><code>00010020030040110120130140210220230240310320330340410420430441112113114122123124132133134142143144222322423323424324433343444
0000100110101111
aaaabaaacaaadaaaeaabbaabcaabdaabeaacbaaccaacdaaceaadbaadcaaddaadeaaebaaecaaedaaeeababacabadabaeabbbabbcabbdabbeabcbabccabcdabceabdbabdcabddabdeabebabecabedabeeacacadacaeacbbacbcacbdacbeaccbacccaccdacceacdbacdcacddacdeacebacecacedaceeadadaeadbbadbcadbdadbeadcbadccadcdadceaddbaddcadddaddeadebadecadedadeeaeaebbaebcaebdaebeaecbaeccaecdaeceaedbaedcaeddaedeaeebaeecaeedaeeebbbbcbbbdbbbebbccbbcdbbcebbdcbbddbbdebbecbbedbbeebcbcbdbcbebcccbccdbccebcdcbcddbcdebcecbcedbceebdbdbebdccbdcdbdcebddcbdddbddebdecbdedbdeebebeccbecdbecebedcbeddbedebeecbeedbeeeccccdccceccddccdeccedcceecdcdcecdddcddecdedcdeececeddcedeceedceeeddddeddeededeeee
</code></pre>
</div>
