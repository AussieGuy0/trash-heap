# Splurthian Chemistry 103
<div class="md"><h1>Background</h1>
<p>The Splurth Council for Atoms and Atom-Related Paraphernalia has erupted into bickering, with everyone having an opinion on how to build the periodic table. Abcder the Wise demands alphabetical ordering, Zyxwur the Comely wants reverse-alphabetical, and Gsvpnnhq the Random really wants to pick the names. Can you make everyone happy?</p>
<p><a href="https://www.reddit.com/r/dailyprogrammer/comments/4so25w/20160713_challenge_275_intermediate_splurthian/">See Wednesday's Intermediate challenge for the preference procedure of element symbols in Splurthian Chemistry.</a> You can ignore capital letters for the purpose of this challenge.</p>
<h1>Requirements</h1>
<p>Today's Hard challenge is an optimization problem. <a href="http://pastebin.com/raw/uQKZWbR4">Here is a list of 10,000 random 8-character strings.</a> These are candidate element names. You must select some subset of (up to 676) distinct items from this list. The requirements are:</p>
<ul>
<li>Every item on your submitted list <em>must</em> appear in the candidate list.</li>
<li>The items on your submitted list <em>must</em> be in alphabetical order.</li>
<li>Your submitted list <em>must</em> be able to be assigned symbols, in order, using the preference procedure in Wednesday's Intermediate challenge (i.e. each element is assigned its most preferred symbol that's still available).</li>
</ul>
<p>Post a link to your list on pastebin or github or Google docs or somewhere. Also post the code you used to generate your list, along with your score.</p>
<h1>Scoring</h1>
<p>Your score is as follows: assign each element a symbol using the process in Wednesday's challenge. Reverse the list of symbols you get. Your score is the number of symbols <em>at the beginning of the reversed list</em> that are in alphabetical order.</p>
<h1>Example scoring</h1>
<p><a href="http://pastebin.com/raw/XX7d3dx3">Here is a valid submission list</a> that I generated. The first and last few entries are:</p>
<pre><code>aabmevmt
abhhwzpo
aehwwogz
afbvhlke
afycbvxv
agfigxja
agxdnjyc
....
xoyittxg
xrlkgqbe
xxutzias
ycykczyb
ygnoizht
yivqpvmj
yjhamdhh
</code></pre>
<p>Assigning each of these a symbol, using the preference procedure, we get:</p>
<pre><code>aabmevmt aa
abhhwzpo ab
aehwwogz ae
afbvhlke af
afycbvxv ay
agfigxja ag
agxdnjyc ax
....
xoyittxg yi
xrlkgqbe lb
xxutzias zi
ycykczyb yy
ygnoizht yn
yivqpvmj ym
yjhamdhh jm
</code></pre>
<p>Now, reverse the list of symbols. This starts:</p>
<pre><code>jm ym yn yy zi lb yi ...
</code></pre>
<p>The first 5 symbols on this reversed list (<code>jm</code>, <code>ym</code>, <code>yn</code>, <code>yy</code>, and <code>zi</code>) are in alphabetical order. However, the sixth symbol (<code>lb</code>) comes before the fifth symbol in alphabetical order. Thus my score is 5. How high can you get?</p>
<h1>Verification script</h1>
<p><a href="http://pastebin.com/yX9hs0We">Here is a Python script you can use</a> to make sure your submission is valid and to compute your score.</p>
</div>
