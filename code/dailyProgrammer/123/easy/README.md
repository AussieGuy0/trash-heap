# New-Line Troubles
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Easy)</em>: New-Line Troubles</h1>
<p>A <a href="http://en.wikipedia.org/wiki/Newline">newline character</a> is a special character in text for computers: though it is not a visual (e.g. renderable) character, it is a control character, informing the reader (whatever program that is) that the following text should be on a new line (hence "newline character").</p>
<p>As is the case with many computer standards, newline characters (and their rendering behavior) were not uniform across systems until much later. Some character-encoding standards (such as <a href="http://en.wikipedia.org/wiki/ASCII">ASCII</a>) would encode the character as hex 0x0A (dec. 10), while <a href="http://en.wikipedia.org/wiki/Unicode">Unicode</a> has a handful of subtly-different newline characters. Some systems even define newline characters as a set of characters: Windows-style new-line is done through two bytes: CR+LF (carriage-return and then the ASCII newline character).</p>
<p>Your goal is to read ASCII-encoding text files and "fix" them for the encoding you want. You may be given a Windows-style text file that you want to convert to UNIX-style, or vice-versa.</p>
<p><em>Author: nint22</em></p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>On standard input, you will be given two strings in quotes: the first will be the text file location, with the second being which format you want it output to. Note that this second string will always either be "Windows" or "Unix".</p>
<p>Windows line endings will always be CR+LF (carriage-return and then newline), while Unix endings will always be just the LF (newline character).</p>
<h2>Output Description</h2>
<p>Simply echo the text file read back off onto standard output, with all line endings corrected.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<p>The following runs your program with the two arguments in the required quoted-strings.</p>
<pre><code>./your_program.exe "/Users/nint22/WindowsFile.txt" "Unix"
</code></pre>
<h2>Sample Output</h2>
<p>The example output should be the contents of the WindowsFile.txt file, sans CR+LF characters, but just LF.</p>
<h1>Challenge Input</h1>
<p>None required.</p>
<h2>Challenge Input Solution</h2>
<p>None required.</p>
<h1>Note</h1>
<p>None</p>
</div>
