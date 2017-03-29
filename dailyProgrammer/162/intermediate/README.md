# Novel Compression, pt. 2: Compressing the Data
<div class="md"><h1><a href="#IntermediateIcon"></a> <em>(Intermediate)</em>: Novel Compression, pt. 2: Compressing the Data</h1>
<p>Welcome to Part 2 of this week's Theme Week. Today we are (predictably) doing the opposite of Monday's challenge. We will be taking uncompressed data, running it through a compression algorithm, and printing compressed data. The grammar and format is exactly the same as last time.</p>
<p>You are still advised to write your program in a way that can be easily adapted and extended later on. A challenge later this week will involve putting all of your work together into a fully featured program!</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>The input will simply be uncompressed textual data. At the end, an EOF symbol is printed (note: in Windows an EOF is entered using Ctrl-Z on the console, and in Linux an EOF is entered using Ctrl-D at a terminal - or alternatively pipe a file containing the input using <code>cat</code>.)</p>
<h2>Data Format</h2>
<p><a href="/r/dailyprogrammer/comments/25clki/5122014_challenge_162_easy_novel_compression_pt_1/">Same rules as before</a>. All words must go into a dictionary (just a list of words.)</p>
<ul>
<li><p>If a lower-case word (eg. <code>stanley</code>) is encountered, print its index in the dictionary, followed by a space.</p></li>
<li><p>If a capitalised word (first letter is upper-case, eg. <code>Stanley</code>) is encountered, print its index in the dictionary, followed by a caret (<code>^</code>), followed by a space.</p></li>
<li><p>If an upper-case word (eg. <code>Stanley</code>) is encountered, print its index in the dictionary, followed by an exclamation point (<code>!</code>), followed by a space.</p></li>
<li><p>If the previous and next words encountered are joined by a hyphen rather than a space (eg. <code>hunter-gatherer</code>), print a hyphen (<code>-</code>), followed by a space (eg. <code>44 - 47</code>).</p></li>
<li><p>If word is followed by any of the following symbols: <code>. , ? ! ; :</code>, print that symbol after it, followed by another space (eg. <code>44 !</code>).</p></li>
<li><p>If a new line is encountered, print the letter <code>R</code>, followed by a space.</p></li>
<li><p>If the end of the input has been reached, print the letter <code>E</code>, followed by a space.</p></li>
</ul>
<p><strong>Note</strong>: All words will be in the Latin alphabet.</p>
<p>Now for an important bit. If you encounter any of the following:</p>
<ul>
<li><p>A word is capitalised in any other different way than above,</p></li>
<li><p>A word is not alphabetical (eg. has numbers in it),</p></li>
<li><p>A symbol not in <code>. , ? ! ; :</code> is encountered,</p></li>
<li><p>Two or more symbols are next to each other like <code>??1</code>),</p></li>
</ul>
<p>Then you must print an error message and then stop, because our simple basic compression format cannot account for these cases. Normally a practical compression system would handle it more gracefully, but this is just a challenge after all so just drop them.</p>
<h2>Example Data</h2>
<p>Therefore, if our input is given as:</p>
<pre><code>The quick brown fox jumps over the lazy dog.
Or, did it?
</code></pre>
<p>Then the output data is:</p>
<pre><code>11
the
quick
brown
fox
jumps
over
lazy
dog
or
did
it
0^ 1 2 3 4 5 0 6 7 . R 8^ , 9 10 ? E
</code></pre>
<h2>Output Description</h2>
<p>Print the resultant data from your compression algorithm, using the rules described above.</p>
<h1>Challenge</h1>
<h2>Challenge Input</h2>
<pre><code>I would not, could not, in the rain.
Not in the dark. Not on a train.
Not in a car. Not in a tree.
I do not like them, Sam, you see.
Not in a house. Not in a box.
Not with a mouse. Not with a fox.
I will not eat them here or there.
I do not like them anywhere!
</code></pre>
<h2>Example Challenge Output</h2>
<p>Your output may vary slightly depending on how you populate your word dictionary.</p>
<pre><code>30
i
would
not
could
in
the
rain
dark
on
a
train
car
tree
do
like
them
sam
you
see
house
box
with
mouse
fox
will
eat
here
or
there
anywhere
0^ 1 2 , 3 2 , 4 5 6 . R 2^ 4 5 7 . 2^ 8 9 10 . R 2^ 4 9 11 . 2^ 4
9 12 . R 0^ 13 2 14 15 , 16^ , 17 18 . R 2^ 4 9 19 . 2^ 4 9 20 . R 2^ 21 9
22 . 2^ 21 9 23 . R 0^ 24 2 25 15 26 27 28 . R 0^ 13 2 14 15 29 ! R E
</code></pre>
</div>
