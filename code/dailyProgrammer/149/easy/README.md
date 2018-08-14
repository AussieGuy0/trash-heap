# Disemvoweler
<div class="md"><h1><em>(Easy)</em>: Disemvoweler</h1>
<p>Disemvoweling means removing the vowels from text. (For this challenge, the letters a, e, i, o, and u are considered vowels, and the letter y is not.) The idea is to make text difficult but not impossible to read, for when somebody posts something so idiotic you want people who are reading it to get extra frustrated.</p>
<p>To make things even harder to read, we'll remove spaces too. For example, this string:</p>
<pre><code>two drums and a cymbal fall off a cliff
</code></pre>
<p>can be disemvoweled to get:</p>
<pre><code>twdrmsndcymblfllffclff
</code></pre>
<p>We also want to keep the vowels we removed around (in their original order), which in this case is:</p>
<pre><code>ouaaaaoai
</code></pre>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input description</h2>
<p>A string consisting of a series of words to disemvowel. It will be all lowercase (letters a-z) and without punctuation. The only special character you need to handle is spaces.</p>
<h2>Output description</h2>
<p>Two strings, one of the disemvoweled text (spaces removed), and one of all the removed vowels.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input 1</h2>
<pre><code>all those who believe in psychokinesis raise my hand
</code></pre>
<h2>Sample Output 1</h2>
<pre><code>llthswhblvnpsychknssrsmyhnd
aoeoeieeioieiaiea
</code></pre>
<h2>Sample Input 2</h2>
<pre><code>did you hear about the excellent farmer who was outstanding in his field
</code></pre>
<h2>Sample Output 2</h2>
<pre><code>ddyhrbtthxcllntfrmrwhwststndngnhsfld
ioueaaoueeeeaeoaouaiiiie
</code></pre>
<h1>Notes</h1>
<p>Thanks to <a href="/u/abecedarius">/u/abecedarius</a> for inspiring this challenge on <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a>!</p>
<p>In principle it may be possible to reconstruct the original text from the disemvoweled text. If you want to try it, check out this week's Intermediate challenge!</p>
</div>
