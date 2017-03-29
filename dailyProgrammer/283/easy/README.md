# Anagram Detector
<div class="md"><h1>Description</h1>
<p>An anagram is a form of word play, where you take a word (or set of words) and form a different word (or different set of words) that use the same letters, just rearranged. All words must be valid spelling, and shuffling words around doesn't count. </p>
<p>Some serious word play aficionados find that some anagrams can contain meaning, like "Clint Eastwood" and "Old West Action", or "silent" and "listen".</p>
<p>Someone once said, "All the life's wisdom can be found in anagrams. Anagrams never lie." How they don't lie is beyond me, but there you go. </p>
<p>Punctuation, spaces, and capitalization don't matter, just treat the letters as you would scrabble tiles.</p>
<h1>Input Description</h1>
<p>You'll be given two words or sets of words separated by a question mark. Your task is to replace the question mark with information about the validity of the anagram. Example:</p>
<pre><code>"Clint Eastwood" ? "Old West Action"
"parliament" ? "partial man"
</code></pre>
<h1>Output Description</h1>
<p>You should replace the question mark with some marker about the validity of the anagram proposed. Example:</p>
<pre><code>"Clint Eastwood" is an anagram of "Old West Action"
"parliament" is NOT an anagram of "partial man"
</code></pre>
<h1>Challenge Input</h1>
<pre><code>"wisdom" ? "mid sow"
"Seth Rogan" ? "Gathers No"
"Reddit" ? "Eat Dirt"
"Schoolmaster" ? "The classroom"
"Astronomers" ? "Moon starer"
"Vacation Times" ? "I'm Not as Active"
"Dormitory" ? "Dirty Rooms"
</code></pre>
<h1>Challenge Output</h1>
<pre><code>"wisdom" is an anagram of "mid sow"
"Seth Rogan" is an anagram of "Gathers No"
"Reddit" is NOT an anagram of "Eat Dirt"
"Schoolmaster" is an anagram of "The classroom"
"Astronomers" is NOT an anagram of "Moon starer"
"Vacation Times" is an anagram of "I'm Not as Active"
"Dormitory" is NOT an anagram of "Dirty Rooms"
</code></pre>
</div>
