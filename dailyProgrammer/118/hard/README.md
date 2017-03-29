# Alphabetizing cipher
<div class="md"><h1><a href="#HardIcon"></a> <em>(Hard)</em>: Alphabetizing cipher</h1>
<p>This challenge is an optimization problem. Your solution will be a string of the 26 letters of the alphabet in some order, such as:</p>
<pre><code>jfbqpwcvuamozhilgrxtkndesy
</code></pre>
<p>The string is a cipher. For this cipher, the letter <code>a</code> maps to <code>j</code>, the letter <code>b</code> maps to <code>f</code>, and so on. This cipher maps the word <code>bakery</code> to <code>fjmprs</code>. Notice that <code>fjmprs</code> is in alphabetical order. Your cipher's score is the number of words from the word list that it maps to a string in alphabetical order.</p>
<p><a href="http://pastebin.com/9aFn1r27">The word list for this problem is here.</a> It consists of the 7,260 six-letter words from the Enable word list that are made up of 6 different letters.</p>
<p>Since there are 60 words from the list that my example cipher maps to sorted strings, my score is 60. Can you do better? Post your solution, your score, and the program you used to generate it (if any).</p>
<p>Here's a python script that will evaluate your solution:</p>
<pre><code>abc = "abcdefghijklmnopqrstuvwxyz"
words = open("enable-6.txt").read().splitlines()
newabc = raw_input()
assert len(newabc) == 26 and set(abc) == set(newabc)
cipher = dict(zip(abc, newabc))
for word in words:
  nword = "".join(map(cipher.get, word))
  if sorted(nword) == list(nword):
    print word, nword
</code></pre>
<p><em>Author: Cosmologicon</em></p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>&lt;Field to be removed&gt;</p>
<h2>Output Description</h2>
<p>&lt;Field to be removed&gt; </p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<p>&lt;Field to be removed&gt; </p>
<h2>Sample Output</h2>
<p>&lt;Field to be removed&gt; </p>
<h1>Challenge Input</h1>
<p>&lt;Field to be removed&gt; </p>
<h2>Challenge Input Solution</h2>
<p>&lt;Field to be removed&gt; </p>
<h1>Note</h1>
<p>None</p>
</div>
