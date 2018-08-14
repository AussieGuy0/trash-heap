# ("Bad" Word Filter)
<div class="md"><p>Write a program called 'censor' that takes in one argument on the command line.  This argument is the filename of a newline-separated wordlist of profanity such as</p>
<p><a href="http://urbanoalvarez.es/blog/2008/04/04/bad-words-list/">http://urbanoalvarez.es/blog/2008/04/04/bad-words-list/</a> or</p>
<p><a href="http://www.bannedwordlist.com/SwearWordResources.htm">http://www.bannedwordlist.com/SwearWordResources.htm</a></p>
<p>The program should then read a text from standard in, and print it out again, but replacing every instance of a word in the wordlist with a 'censored' version.
The censored version of a word has the same first character as the word, and the rest of the characters are replaced with '*'.  </p>
<p>For example, the 'censored' version of 'peter' would be 'p****'</p>
<p>Example: </p>
<pre><code>&gt;echo 'You jerkface!' | censor badwords.txt
You j***face!
</code></pre>
</div>
