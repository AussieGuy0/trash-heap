# Word Squares Part 1
<div class="md"><h1>Description</h1>
<p>A word square is a type of acrostic, a word puzzle. In a word square you are given a grid with letters arranged that spell valid English language words when you read from left to right or from top to bottom, with the requirement that the words you spell in each column and row of the same number are the same word. For example, the first row and the first column spell the same word, the second row and second column do, too, and so on. The challenge is that in arranging those letters that you spell valid words that meet those requirements.</p>
<p>One variant is where you're given an n*n grid and asked to place a set of letters inside to meet these rules. That's today's challenge: given the grid dimensions and a list of letters, can you produce a valid word square.</p>
<p>Via <a href="/u/Godspiral">/u/Godspiral</a>: <a href="http://norvig.com/ngrams/enable1.txt">http://norvig.com/ngrams/enable1.txt</a> (an English-language dictionary you may wish to use)</p>
<h1>Input Description</h1>
<p>You'll be given an integer telling you how many rows and columns (it's a square) to use and then n<sup>2</sup> letters to populate the grid with. Example:</p>
<pre><code>4 eeeeddoonnnsssrv
</code></pre>
<h1>Output Description</h1>
<p>Your program should emit a valid word square with the letters placed to form valid English language words. Example:</p>
<pre><code>rose
oven
send
ends
</code></pre>
<h1>Challenge Input</h1>
<pre><code>4 aaccdeeeemmnnnoo
5 aaaeeeefhhmoonssrrrrttttw
5 aabbeeeeeeeehmosrrrruttvv
7 aaaaaaaaabbeeeeeeedddddggmmlloooonnssssrrrruvvyyy
</code></pre>
<h1>Challenge Output</h1>
<pre><code>moan
once
acme
need

feast
earth
armor
stone
threw

heart
ember
above
revue
trees

bravado
renamed
analogy
valuers
amoebas
degrade
odyssey
</code></pre>
</div>
