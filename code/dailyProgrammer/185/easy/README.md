# Generated twitter handles
<div class="md"><h1>Description</h1>
<p>For those that don't tweet or know the workings of Twitter, you can reply to 'tweets' by replying to that user with an @ symbol and their username. </p>
<p>Here's an example from <a href="https://twitter.com/ID_AA_Carmack">John Carmack's</a> twitter.</p>
<p><strong>His</strong> <strong>initial</strong> <strong>tweet</strong></p>
<p>@ID_AA_Carmack : "Even more than most things, the challenges in computer vision seem to be the gulf between theory and practice."</p>
<p><strong>And</strong> <strong>a</strong> <strong>reply</strong></p>
<p>@professorlamp : @ID_AA_Carmack Couldn't say I have too much experience with that</p>
<p>You can see, the '@' symbol is more or less an integral part of the tweet and the reply. Wouldn't it be neat if we could think of names that incorporate the @ symbol and also form a word?</p>
<p>e.g.</p>
<p>@tack -&gt; (attack)</p>
<p>@trocious -&gt;(atrocious)</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input description</h2>
<p>As input, you should give a word list for your program to scout through to find viable matches. The most popular word list is good ol' <a href="https://code.google.com/p/dotnetperls-controls/downloads/detail?name=enable1.txt">enable1.txt</a></p>
<p><a href="/u/G33kDude">/u/G33kDude</a>  has supplied an even bigger text file. I've hosted it on my site over <a href="http://www.joereynoldsaudio.com/WordList.txt">here</a> , I recommend 'saving as' to download the file.</p>
<h2>Output description</h2>
<p>Both outputs should contain the 'truncated' version of the word and the original word. For example.</p>
<pre><code>@tack : attack
</code></pre>
<p>There are two outputs that we are interested in:</p>
<ul>
<li>The 10 longest twitter handles sorted by length in descending order. </li>
<li>The 10 shortest twitter handles sorted by length in ascending order.</li>
</ul>
<h1>Bonus</h1>
<p>I think it would be even better if we could find words that have 'at' in them at any point of the word and replace it with the @ symbol. Most of these wouldn't be valid in Twitter but that's not the point here.</p>
<p>For example</p>
<p>r@@a -&gt; (ratata)</p>
<p>r@ic@e -&gt;(raticate)</p>
<p>dr@ -&gt;(drat)</p>
<h1>Finally</h1>
<p>Have a good challenge idea?</p>
<p>Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
<p>Thanks to <a href="/u/jnazario">/u/jnazario</a> for the challenge!</p>
<p>Remember to check out our IRC channel. Check the sidebar for a link --&gt;</p>
</div>
