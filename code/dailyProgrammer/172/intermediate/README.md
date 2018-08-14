# BREACH!
<div class="md"><h1>Description</h1>
<p>This is the last time I hire monkeys to do my dirty work. Someone managed to break into our database and access all the data, I went in to inspect the problem and lo and behold, what do I see? Plaintext passwords!?</p>
<p>I hired some newer smarter guy who seemed to know what he was doing, I've spoken to my colleague who performed the code review on his program only to find out I've hired yet another monkey!</p>
<p>The password wasn't in plaintext, it was hashed, but an identical password brought back the same hash. How could I prevent this?</p>
<p>Maybe If I could get a unique hash for each user regardless of the password they enter that would solve the problem? Yes, that'll do...Damn monkeys...</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input description</h2>
<p>On standard console input you should enter a password of N length, it may contain any characters, numbers or punctuation.</p>
<h2>Output description</h2>
<p>The output will be a reasonably secure hash of the password. The hash should be different even if two passwords are the same. For example</p>
<pre><code>peanuts

A2F9CDDA934FD16E07833BD8B06AA77D52E26D39

peanuts

0E18F44C1FEC03EC4083422CB58BA6A09AC4FB2A
</code></pre>
<h1>Notes/Hints</h1>
<p>For this exercise, feel free to use any hashing algorithm you like, built-in or not.</p>
<p>You should probably research into GUID's and how they are used to prevent identical password hashing mistakes.</p>
<p>Here is a good read on this exact topic:</p>
<p><a href="http://www.codeproject.com/Articles/425150/Beginners-guide-to-a-secure-way-of-storing-passwor">Password Hashing</a></p>
<h1>Bonus</h1>
<p>Create the hashing algorithm yourself rather than using a built-in SHA-1 etc...</p>
<h1>Finally</h1>
<p>Have a good challenge idea?</p>
<p>Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
</div>
