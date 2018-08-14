<div class="md"><p>Given a binary matrix like this:</p>
<pre><code>0 1 1 1 1 0
1 0 0 1 1 1
1 0 1 1 1 1
1 1 1 1 1 1
0 1 1 1 1 0
</code></pre>
<p>Output the clues for a <a href="http://en.wikipedia.org/wiki/Nonogram">nonogram puzzle</a> in the format of "top clues, empty line, bottom clues", with clues separated by spaces:</p>
<pre><code>3
1 2
1 3
5
5
3

4
1 3
1 4
6
4
</code></pre>
<p>That is, count the contiguous groups of "1" bits and their sizes, first in columns, then in rows.</p>
<ul>
<li>Thanks to <a href="http://www.reddit.com/user/nooodl">nooodl</a> for suggesting this problem at <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a>! If you have a problem that you think would be good for us, why not head over there and post it!</li>
</ul>
</div>
