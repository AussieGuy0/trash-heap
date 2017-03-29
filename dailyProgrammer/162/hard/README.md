# Novel Compression, pt. 3: Putting it all together
<div class="md"><h1><a href="#HardIcon"></a> <em>(Hard)</em>: Novel Compression, pt. 3: Putting it all together</h1>
<p>Welcome to the third and final part of this week's Theme Week. Today is not so much a 'hard' challenge as such, but rather a culmination of this week's efforts. You will be putting your code from Monday and Wednesday into one program that can be operated <a href="http://en.wikipedia.org/wiki/Command-line_interface#Arguments">via the command line or terminal</a>, and will deal with files rather than textual input.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>The program will take 3 arguments on the command line: the first one will be one of the following:</p>
<ul>
<li><p><code>-c</code> Will compress the input.</p></li>
<li><p><code>-d</code> Will decompress the input.</p></li>
</ul>
<p>If it is anything other than these, return an error message. The second argument will be a path to a file that the input data will be read from, and the third argument will be a path to a file that output data will be written to. If there are any more or less than three arguments given, return another error message.</p>
<h2>Output Description</h2>
<p>Using the given operation (compress or decompress), the data in the input file will be processed, and the resulting data written to the output file.</p>
<h1>Example Input</h1>
<p>There is a plain text copy of Green Eggs and Ham <a href="http://pastie.org/pastes/9180059/text?key=wmyubynyw72ten8m3gzpfw">available here</a>, edited to work with our compression algorithm, which can be used to test your program.</p>
<p>For example, on Windows:</p>
<pre><code>compressor -c eggs.txt eggs-c.txt
</code></pre>
<p>Or on nearly everything else:</p>
<pre><code>./compressor -c eggs.txt eggs-c.txt
</code></pre>
<h1>Notes</h1>
<p>It may be an idea to submit your code to a site such as <a href="https://gist.github.com/">Github Gist</a> or another code sharing site, rather than pasting it in the comments, as the combined code may be quite long.</p>
<p>Hopefully by the end of this we'll have ported this program to a wide selection of languages.</p>
<p>Green Eggs and Ham is copyright of Dr Seuss?. I think the usage here is fair use as it is not for profit.</p>
</div>
