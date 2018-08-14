# Write a Quine
<div class="md"><h1>Description:</h1>
<p>A Quine is a very interesting little program that does only one thing: it prints out exactly its own source code. Quines are tricky to write, but figuring out how to do it is a very rewarding and fun little challenge.
Some rules for this challenge:</p>
<ul>
<li><p>The program can use no I/O except for printing out to standard output. It can't read (or write) anything from standard input, or any file (or network socket, or whatever). That is to say, you can't make a program that simply reads the source code and prints it out.</p></li>
<li><p>The output of the program and the source code for the program have to match exactly, literally byte for byte (including newlines and comments, if you include any). If you're on a unix system, you can check for this by using the diff utility.</p></li>
<li><p>The source code of your Quine has to be longer than 1 character. The reason for this is to prevent "degenerate" Quines, like having an empty program that prints out nothing.</p></li>
<li><p>Often people compete about who can write the shortest Quine in a given programming language. Don't worry about that for this challenge, make your Quines as long as you want.</p></li>
</ul>
<p>There are many websites that describe in detail exactly how to write a Quine, but you are encouraged not to look those up. Figuring out how to do it for yourself is very rewarding. However, if you're hopelessly stuck, you can go ahead and research it. Wikipedia provides a very good description of how to do it.</p>
<h1>Input:</h1>
<p>None for this challenge.</p>
<h1>Output:</h1>
<p>The source code of your program exactly, byte for byte.</p>
<h1>Bonus:</h1>
<p>Write a two-language Quine. That is, write a program in language A that prints out code for language B, and when you run the code for language B, it prints out the original code for language A.</p>
<p>That is, if your two languages are python and ruby, you should be able to run this:</p>
<pre><code> $ python A.py &gt; B.rb
 $ ruby B.rb &gt; C.py
 $ diff A.py C.py
 $
</code></pre>
<p>That is, when running A.py in python, it produces the ruby source code B.rb, and when you run B.rb in ruby, it produces C.py, and A.py and C.py are exactly the same.</p>
<h1>Challenge Credit:</h1>
<p>Thanks to <a href="/u/XenophonOfAthens">/u/XenophonOfAthens</a> - This challenge was posted on <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> - A place to go to post challenge idea for this subreddit.</p>
</div>
