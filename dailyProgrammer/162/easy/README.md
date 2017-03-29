# Novel Compression, pt. 1: Unpacking the Data
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Easy)</em>: Novel Compression, pt. 1: Unpacking the Data</h1>
<p>Welcome to this week's Theme Week. We're going to be creating our very own basic compression format for short novels or writing. This format will probably not be practical for actual use, but may serve as a rudimentary introduction to how data compression works. As a side task, it is advised to use structured programming techniques, so your program is easy to extend, modify and maintain later on (ie. later this week.) To keep in line with our Easy-Intermediate-Hard trend, our first step will be to write the <strong>decompresser</strong>.</p>
<p>The basic idea of this compression scheme will be the dictionary system. Words used in the data will be put into a dictionary, so instead of repeating phrases over and over again, you can just repeat a number instead, thus saving space. Also, because this system is based around written text, it will be specifically designed to handle sentences and punctuation, and will not be geared to handle binary data.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>The first section of the input we are going to receive will be the dictionary. This dictionary is just a list of words present in the text we're decompressing. The first line of input will be a number <strong>N</strong> representing how many entries the dictionary has. Following from that will be a list of <strong>N</strong> words, on separate lines. This will be our simple dictionary. After this will be the data.</p>
<h2>Data Format</h2>
<p>The pre-compressed data will be split up into human-readable 'chunks', representing one little segment of the output. In a practical compression system, they will be represented by a few bytes rather than text, but doing it this way makes it easier to write. Our chunks will follow 7 simple rules:</p>
<ul>
<li><p>If the chunk is just a number (eg. <code>37</code>), word number 37 from the dictionary (zero-indexed, so 0 is the 1st word) is printed <strong>lower-case</strong>.</p></li>
<li><p>If the chunk is a number followed by a caret (eg. <code>37^</code>), then word 37 from the dictionary will be printed lower-case, <strong>with the first letter capitalised</strong>.</p></li>
<li><p>If the chunk is a number followed by an exclamation point (eg. <code>37!</code>), then word 37 from the dictionary will be printed <strong>upper-case</strong>.</p></li>
<li><p>If it's a hyphen (<code>-</code>), then instead of putting a space in-between the previous and next words, put a hyphen instead.</p></li>
<li><p>If it's any of the following symbols: <code>. , ? ! ; :</code>, then put that symbol at the end of the previous outputted word.</p></li>
<li><p>If it's a letter <code>R</code> (upper or lower), print a new line.</p></li>
<li><p>If it's a letter <code>E</code> (upper or lower), the end of input has been reached.</p></li>
</ul>
<p>Remember, this is just for basic text, so not all possible inputs can be compressed. Ignore any other whitespace, like tabs or newlines, in the input.</p>
<p><strong>Note</strong>: All words will be in the Latin alphabet.</p>
<h2>Example Data</h2>
<p>Therefore, if our dictionary consists of the following:</p>
<pre><code>is
my
hello
name
stan
</code></pre>
<p>And we are given the following chunks:</p>
<pre><code>2! ! R 1^ 3 0 4^ . E
</code></pre>
<p>Then the output text is:</p>
<pre><code>HELLO!
My name is Stan.
</code></pre>
<p>Words are always separated by spaces unless they're hyphenated.</p>
<h2>Output Description</h2>
<p>Print the resultant decompressed data from your decompression algorithm, using the rules described above.</p>
<h1>Challenge</h1>
<h2>Challenge Input</h2>
<pre><code>20
i
do
house
with
mouse
in
not
like
them
ham
a
anywhere
green
eggs
and
here
or
there
sam
am
0^ 1 6 7 8 5 10 2 . R
0^ 1 6 7 8 3 10 4 . R
0^ 1 6 7 8 15 16 17 . R
0^ 1 6 7 8 11 . R
0^ 1 6 7 12 13 14 9 . R
0^ 1 6 7 8 , 18^ - 0^ - 19 . R E
</code></pre>
<p>(Line breaks added in data for clarity and ease of testing.)</p>
<h2>Expected Challenge Output</h2>
<pre><code>I do not like them in a house.
I do not like them with a mouse.
I do not like them here or there.
I do not like them anywhere.
I do not like green eggs and ham.
I do not like them, Sam-I-am.
</code></pre>
</div>
