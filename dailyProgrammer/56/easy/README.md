<div class="md"><p>The ABACABA sequence is defined as follows: start with the first letter of the alphabet ("a"). This is the first iteration. The second iteration, you take the second letter ("b") and surround it with all of the first iteration (just "a" in this case). Do this for each iteration, i.e. take two copies of the previous iteration and sandwich them around the next letter of the alphabet. </p>
<p>Here are the first 5 items in the sequence:</p>
<p>a<br/>
aba<br/>
abacaba<br/>
abacabadabacaba<br/>
abacabadabacabaeabacabadabacaba         </p>
<p>And it goes on and on like that, until you get to the 26th iteration (i.e. the one that adds the "z"). If you use one byte for each character, the final iteration takes up just under 64 megabytes of space.</p>
<p>Write a computer program that prints the 26th iteration of this sequence to a file. </p>
<hr/>
<p>BONUS: try and limit the amount of memory your program needs to finish, while still getting a reasonably quick runtime. Find a good speed/memory tradeoff that keeps both memory usage low (around a megabyte, at most) and the runtime short (around a few seconds). </p>
<ul>
<li>Thanks to <a href="http://www.reddit.com/user/thelonesun">thelonesun</a> for suggesting this problem at <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a>! If you have problem that you think would be good for us, why not head on over there and help us out!</li>
</ul>
</div>
