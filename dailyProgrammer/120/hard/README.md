# Derpson Family Party
<div class="md"><h1><a href="#HardIcon"></a> <em>(Hard)</em>: Derpson Family Party</h1>
<p>The Derpsons are having a party for all their relatives. It will be
the greatest party ever held, with hired musicians, a great cake and a
magical setting with two long tables at an old castle. The only
problem is that some of the guests can't stand each other, and cannot
be placed at the same table.</p>
<p>The Derpsons have created a list with pairs of enemies they know will
start a fight if put together. The list is rather long so it is your
mission to write a program to partition the guests into two tables.</p>
<p><em>Author: emilvikstrom</em></p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>The input is a list of enemies for each guest (with empty lines for
guests without enemies). Each guest have a number which is equivalent
to the line number in the list.</p>
<p>It is a newline-separated file (text file or standard in). Each line is a
comma-separated (no space) list of positive integers. The first
line of the input is called 1, the second 2 and so on. This input can
be mapped to an array, <em>arr</em>, indexed from 1 to <em>n</em> (for <em>n</em> guests)
with lists of numbers. Each index of the array is a guest, and each
number of each list is another guest that he or she cannot be placed with.</p>
<p>If a number <em>e</em> appears in the list <em>arr[k]</em>, it means that <em>e</em> and <em>k</em>
are sworn enemies. The lists are <em>symmetric</em> so that <em>k</em> will also
appear in the list <em>arr[e]</em>.</p>
<h2>Output Description</h2>
<p>A newline-separated list (on standard out or in a file) of guest
numbers to put at the first table, followed by an empty line and then
the guests to place at the second table. You may just return
the two lists if printing is non-trivial in your language of choice.</p>
<p>All guests must be placed at one of the two tables in such a way that
any two people at the same table <em>are not</em> enemies.</p>
<p>The tables do not need to be the same size. The lists do not need to
be sorted.</p>
<p>Additionally, if the problem is impossible to solve, just output
"No solution".</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<pre><code>2,4
1,3
2
1
</code></pre>
<h2>Sample Output</h2>
<pre><code>1
3

4
2
</code></pre>
<h1>Challenge Input</h1>
<p>This is the input list of enemies amongst the Derpsons:
<a href="http://lajm.eu/emil/dailyprogrammer/derpsons">http://lajm.eu/emil/dailyprogrammer/derpsons</a> (1.6 MiB)</p>
<p>Is there a possible seating?</p>
<h2>Challenge Input Solution</h2>
<p>What is your answer? :-)</p>
<h1>Note</h1>
<p>What problems do you think are the most fun? Help us out and discuss in <a href="http://www.reddit.com/r/dailyprogrammer_ideas/comments/1alixl/what_kind_of_challenges_do_you_like/">http://www.reddit.com/r/dailyprogrammer_ideas/comments/1alixl/what_kind_of_challenges_do_you_like/</a></p>
<p>We are sorry for having problems with the intermediate challenge posts, it was a bug in the robot managing the queue. There will be a new intermediate challenge next Wednesday.</p>
</div>
