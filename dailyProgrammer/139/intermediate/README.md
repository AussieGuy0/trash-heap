# Telephone Keypads
<div class="md"><h1><a href="#IntermediateIcon"></a> <em>(Intermediate)</em>: Telephone Keypads</h1>
<p><a href="http://en.wikipedia.org/wiki/Telephone_keypad">Telephone Keypads</a> commonly have both digits and characters on them. This is to help with remembering &amp; typing phone numbers (called a <a href="http://en.wikipedia.org/wiki/Phoneword">Phoneword</a>), like 1-800-PROGRAM rather than 1-800-776-4726. This keypad layout is also helpful with <a href="http://en.wikipedia.org/wiki/T9_(predictive_text)">T9</a>, a way to type texts with word prediction.</p>
<p>Your goal is to mimic some of the T9-features: given a series of digits from a telephone keypad, and a list of English words, print the word or set of words that fits the starting pattern. You will be given the number of button-presses and digit, narrowing down the search-space.</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>On standard console input, you will be given an array of digits (0 to 9) and spaces. All digits will be space-delimited, unless the digits represent multiple presses of the same button (for example pressing 2 twice gives you the letter 'B').</p>
<p>Use the modern <a href="http://en.wikipedia.org/wiki/Telephone_keypad">Telephone Keypads</a> digit-letter layout:</p>
<pre><code>0 = Not used
1 = Not used
2 = ABC
3 = DEF
4 = GHI
5 = JKL
6 = MNO
7 = PQRS
8 = TUV
9 = WXYZ
</code></pre>
<p>You may use any source for looking up English-language words, though this <a href="http://www.curlewcommunications.co.uk/wordlist.html">simple English-language dictionary</a> is complete enough for the challenge.</p>
<h2>Output Description</h2>
<p>Print a list of all best-fitting words, meaning words that start with the word generated using the given input on a telephone keypad. You do not have to only print words of the same length as the input (e.g. even if the input is 4-digits, it's possible there are many long words that start with those 4-digits).</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<pre><code>7777 666 555 3
</code></pre>
<h2>Sample Output</h2>
<pre><code>sold
solder
soldered
soldering
solders
soldier
soldiered
soldiering
soldierly
soldiers
soldiery
</code></pre>
<h2>Challenge++</h2>
<p>If you want an extra challenge, accomplish the same challenge but without knowing the number of times a digit is pressed. For example "7653" could mean sold, or poke, or even solenoid! You must do this efficiently with regards to <a href="http://en.wikipedia.org/wiki/Big_O_notation">Big-O complexity</a>.</p>
</div>
