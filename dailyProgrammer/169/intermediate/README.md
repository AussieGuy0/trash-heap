# Home-row Spell Check
<div class="md"><h1>User Challenge:</h1>
<p>Thanks to <a href="/u/Fruglemonkey">/u/Fruglemonkey</a>. This is from our idea subreddit.</p>
<p><a href="http://www.reddit.com/r/dailyprogrammer_ideas/comments/26pak5/intermediate_homerow_spell_check/">http://www.reddit.com/r/dailyprogrammer_ideas/comments/26pak5/intermediate_homerow_spell_check/</a></p>
<h1>Description:</h1>
<p>Aliens from Mars have finally found a way to contact Earth! After many years studying our computers, they've finally created their own computer and keyboard to send us messages. Unfortunately, because they're new to typing, they often put their fingers slightly off in the home row, sending us garbled messages! Otherwise, these martians have impeccable spelling. You are tasked to create a spell-checking system that recognizes words that have been typed off-center in the home row, and replaces them with possible outcomes.</p>
<h1>Formal Input:</h1>
<p>You will receive a string that may have one or more 'mis-typed' words in them. Each mis-typed word has been shifted as if the hands typing them were offset by 1  or 2 places on a QWERTY keyboard.</p>
<p>Words wrap based on the physical line of a QWERTY keyboard. So A left shift of 1 on Q becomes P. A right shift of L becomes A.</p>
<h1>Formal Output:</h1>
<p>The correct string, with corrected words displayed in curly brackets. If more than one possible word for a mispelling is possible, then display all possible words.</p>
<h1>Sample Input:</h1>
<p>The quick ntpem fox jumped over rgw lazy dog.</p>
<h1>Sample Output:</h1>
<p>The quick {brown} fox jumped over {the} lazy dog.</p>
<h1>Challenge Input:</h1>
<p>Gwkki we are hyptzgsi martians rt zubq in qrsvr.</p>
<h1>Challenge Input Solution:</h1>
<p>{Hello} we are {friendly} martians {we} {come} in {peace}</p>
<h1>Alternate Challenge Input:</h1>
<p>A oweaib who fprd not zfqzh challenges should mt ewlst to kze</p>
<h1>Alternate Challenge Output:</h1>
<p>A {person} who {does} not {check} challenges should {be} {ready} to {act}</p>
<h1>Dictionary:</h1>
<p>Good to have a source of words. Some suggestions.</p>
<ul>
<li><a href="https://code.google.com/p/dotnetperls-controls/downloads/detail?name=enable1.txt">enable1.txt</a></li>
<li><a href="http://www.curlewcommunications.co.uk/wordlist.html">British English Word List</a></li>
</ul>
<h1>FAQ:</h1>
<p>As you can imagine I did not proof-read this. So lets clear it up.
Shifts can be 1 to 2 spots away. The above only says "1" -- it looks like it can be 1-2 so lets just assume it can be 1-2 away.</p>
<p>If you shift 1 Left on a Q - A - Z you get a P L M -- so it will wrap on the same "Row" of your QWERTY keyboard.</p>
<p>If you shift 2 Left on a W - S - X you get P L M. </p>
<p>If you Shift 1 Right on P L M -- you get Q A Z. If you shift 2 right on O K N - you get Q A Z.</p>
<p>The shift is only on A-Z keys. We will ignore others.</p>
<p>enable1.txt has "si" has a valid word. Delete that word from the dictionary to make it work. </p>
<p>I will be double checking the challenge input - I will post an alternate one as well.</p>
</div>
