# (Concatenate directory)
<div class="md"><p>Write a program that concatenates all text files (<code>*.txt</code>) in a directory, numbering file names in alphabetical order. Print a header containing some basic information above each file.</p>
<p>For example, if you have a directory like this:</p>
<pre><code>~/example/abc.txt
~/example/def.txt
~/example/fgh.txt
</code></pre>
<p>And call your program like this:</p>
<pre><code>nooodl:~$ ./challenge97easy example
</code></pre>
<p>The output would look something like this:</p>
<pre><code>=== abc.txt (200 bytes)
(contents of abc.txt)

=== def.txt (300 bytes)
(contents of def.txt)

=== ghi.txt (400 bytes)
(contents of ghi.txt)
</code></pre>
<p>For extra credit, add a command line option '<code>-r</code>' to your program that makes it recurse into subdirectories alphabetically, too, printing larger headers for each subdirectory.</p>
</div>
