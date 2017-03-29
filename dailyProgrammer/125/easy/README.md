# Word Analytics
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Easy)</em>: Word Analytics</h1>
<p>You're a newly hired engineer for a brand-new company that's building a "killer Word-like application". You've been specifically assigned to implement a tool that gives the user some details on common word usage, letter usage, and some other analytics for a given document! More specifically, you must read a given text file (no special formatting, just a plain ASCII text file) and print off the following details:</p>
<ol>
<li>Number of words</li>
<li>Number of letters</li>
<li>Number of symbols (any non-letter and non-digit character, excluding white spaces)</li>
<li>Top three most common words (you may count "small words", such as "it" or "the")</li>
<li>Top three most common letters</li>
<li>Most common first word of a paragraph (paragraph being defined as a block of text with an empty line above it) (<em>Optional bonus</em>)</li>
<li>Number of words only used once (<em>Optional bonus</em>)</li>
<li>All letters not used in the document (<em>Optional bonus</em>)</li>
</ol>
<p>Please note that your tool does <em>not</em> have to be case sensitive, meaning the word "Hello" is the same as "hello" and "HELLO".</p>
<p><em>Author: nint22</em></p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>As an argument to your program on the command line, you will be given a text file location (such as "C:\Users\nint22\Document.txt" on Windows or "/Users/nint22/Document.txt" on any other sane file system). This file may be empty, but will be guaranteed well-formed (all valid ASCII characters). You can assume that line endings will follow the UNIX-style new-line ending (<a href="http://www.cs.toronto.edu/%7Ekrueger/csc209h/tut/line-endings.html">unlike the Windows carriage-return &amp; new-line format</a> ).</p>
<h2>Output Description</h2>
<p>For each analytic feature, you must print the results in a special string format. Simply you will print off 6 to 8 sentences with the following format:</p>
<pre><code>"A words", where A is the number of words in the given document
"B letters", where B is the number of letters in the given document
"C symbols", where C is the number of non-letter and non-digit character, excluding white spaces, in the document
"Top three most common words: D, E, F", where D, E, and F are the top three most common words
"Top three most common letters: G, H, I", where G, H, and I are the top three most common letters
"J is the most common first word of all paragraphs", where J is the most common word at the start of all paragraphs in the document (paragraph being defined as a block of text with an empty line above it) (*Optional bonus*)
"Words only used once: K", where K is a comma-delimited list of all words only used once (*Optional bonus*)
"Letters not used in the document: L", where L is a comma-delimited list of all alphabetic characters not in the document (*Optional bonus*)
</code></pre>
<p>If there are certain lines that have no answers (such as the situation in which a given document has no paragraph structures), simply do not print that line of text. In this example, I've just generated some random Lorem Ipsum text.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<p>*Note that "MyDocument.txt" is just a <a href="http://en.wikipedia.org/wiki/Lorem_ipsum">Lorem Ipsum</a> text file that conforms to this challenge's well-formed text-file definition.</p>
<pre><code>./MyApplication /Users/nint22/MyDocument.txt
</code></pre>
<h2>Sample Output</h2>
<p><em>Note that we do not print the "most common first word in paragraphs" in this example, nor do we print the last two bonus features:</em></p>
<pre><code>265 words
1812 letters
59 symbols
Top three most common words: "Eu", "In", "Dolor"
Top three most common letters: 'I', 'E', 'S'
</code></pre>
</div>
