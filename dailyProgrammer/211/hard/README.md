# Hungry puppies
<div class="md"><h1>Description</h1>
<p>Annie has a whole bunch of puppies. They're lovable but also very rambunctious. One day, spur of the moment, Annie decides to get them all treats. She is looking forward to how happy they will all be, and getting ready to serve them the treats, when she realizes: the treats are not all the same size!</p>
<p>This is disastrous! The puppies, knowing the drill, have already lined themselves up in a neat line to receive their treats, so Annie must figure out how to best distribute the unevenly-sized treats so as to make as many puppies happy as possible.</p>
<p>The puppies' jealous reactions to uneven treat distribution is straightforward:</p>
<ul>
<li>If a puppy receives a bigger treat than both its neighbors do, it is happy (+1 happiness).</li>
<li>If a puppy receives a smaller treat than both its neighbors do, it is sad (-1 happiness).</li>
<li>If a puppy does not fit in either of the above categories, it is merely content. This means any puppy with at least one neighbor with the same size treat, or any puppy with one neighbor with a bigger treat and one with a smaller treat.</li>
</ul>
<p>Note that the puppies on either end of the line only have a single neighbor to look at, so in their case their mood depends on whether that single neighbor received a bigger, smaller, or equal treat.</p>
<p>Write a program for Annie to recommend a treat distribution that maximizes puppy happiness.</p>
<h1>Formal inputs &amp; outputs</h1>
<h1>Input</h1>
<p>The input is a single line of positive integers representing the sizes of the treats Annie purchased. For example:</p>
<pre><code>1 1 1 1 1 2 2 3
</code></pre>
<p>Assume there are as many puppies as there are treats. In this case, there are 8 puppies to be served 8 treats of 3 different sizes.</p>
<h1>Output</h1>
<p>The output must provide two facts. First, it must display what the maximum achievable happiness is, as a single integer on its own line</p>
<pre><code>3
</code></pre>
<p>Then, it must specify a treat ordering that achieves this number.</p>
<pre><code>2 1 1 2 1 1 1 3
</code></pre>
<p>The puppies on either end of the queue get bigger treats than their sole neighbors, so they are happy. The one in the middle receives a bigger treat than both its neighbors, so it as well is happy. No puppy received a treat that is smaller than both its neighbors', so no puppies are unhappy. Thus, 3 happy puppies minus 0 unhappy puppies results in 3 happiness.</p>
<p>Pictorally:</p>
<pre><code> 2  1  1  2  1  1  1  3
:) :| :| :) :| :| :| :)
</code></pre>
<p>An example of a bad solution would be:</p>
<pre><code>1 2 2 1 1 1 3 1
</code></pre>
<p>The puppies on either end of the line are sad, since their only neighbors have bigger treats, while there is a single happy puppy (the one with the size 3 treat), since it was the only one that had a treat bigger than its neighbors'. This results in a sub-optimal score of -1.</p>
<p>Again, pictorally:</p>
<pre><code> 1  2  2  1  1  1  3  1
:( :| :| :| :| :| :) :(
</code></pre>
<p>Note that it may be possible for there to be several different orderings of the treats that give the maximum happiness. As long as you print out one of them, it doesn't matter <em>which</em> one.</p>
<h1>Example inputs and outputs</h1>
<h2>Input 1:</h2>
<pre><code>1 2 2 3 3 3 4
</code></pre>
<h2>Output 1</h2>
<pre><code>2
3 1 3 2 2 3 4
</code></pre>
<h2>Input 2:</h2>
<pre><code>1 1 2 3 3 3 3 4 5 5 
</code></pre>
<h2>Output 2:</h2>
<pre><code>4
5 3 3 5 3 3 4 1 1 2
</code></pre>
<h1>Challenge inputs</h1>
<h2>Challenge input 1</h2>
<pre><code>1 1 2 3 3 3 3 4 5 5
</code></pre>
<h2>Challenge input 2</h2>
<pre><code>1 1 2 2 3 4 4 5 5 5 6 6
</code></pre>
<h1>Bonus</h1>
<pre><code>1 1 2 2 2 2 2 2 3 4 4 4 5 5 5 6 6 6 7 7 8 8 9 9 9 9 9 9 9 9
</code></pre>
<h1>Finally</h1>
<p>This lovely little problem was submitted by <a href="/u/Blackshell">/u/Blackshell</a> to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a>, and for his hard work, he has been rewarded with with a gold medal! That means he's a pretty cool dude!</p>
<p>Do you want to be as cool as <a href="/u/Blackshell">/u/Blackshell</a>? Head on over to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a>, and add a suggestion for a challenge!</p>
</div>
