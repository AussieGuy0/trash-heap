# Word Numbers
<div class="md"><h1>Description</h1>
<p>Read the problem carefully and make sure you understand it. This is a hard problem, so if it seems straightforward, you might be misreading something. Feel free to ask for clarification.</p>
<p>Consider the following procedure:</p>
<ol>
<li>Take a list of the integers 1 through 999,999,999.</li>
<li>Write out each integer in English, so that you have 999,999,999 strings.</li>
<li>Sort the strings using <a href="https://en.wikipedia.org/wiki/Alphabetical_order">alphabetical order</a>.</li>
<li>Concatenate them all into one big string.</li>
<li>Take the first 51 billion (51,000,000,000) letters of this big string.</li>
</ol>
<p>Now, you probably can't actually do this procedure. It would take too long or require too much memory. But determine what, if you did this procedure, would be the answers to the following questions about your final, 51-billion-letter string:</p>
<ol>
<li>What is the last letter in your string?</li>
<li>What is the last number named in your string? (Hint: your string will end at the end of a number.)</li>
<li>What is the sum of all the numbers named in your string?</li>
</ol>
<p>You must actually be able to answer all these questions. Writing a program that would theoretically find the answer given a long time is <strong>not</strong> a valid solution to this problem. There's no strict runtime limit, but actually run your program to completion and get the answers before posting your code. (If you want a goal, my Python solution takes 0.05 seconds, but that fast is not necessary.)</p>
<h1>Details</h1>
<p>When you write the numbers out in step 2, omit spaces, punctuation, and the word "and". Examples of how this step looks:</p>
<pre><code>100 -&gt; onehundred
1709 -&gt; onethousandsevenhundrednine
500000000 -&gt; fivehundredmillion
911610034 -&gt; ninehundredelevenmillionsixhundredtenthousandthirtyfour
</code></pre>
<p>The first word in this list after sorting alphabetically is <code>eight</code>, followed by <code>eighteen</code>, then <code>eighteenmillion</code>, then <code>eighteenmillioneight</code>. Thus your final string will begin like this:</p>
<pre><code>eighteighteeneighteenmillioneighteenmillioneight...
</code></pre>
<p>And be 51 billion letters long.</p>
<h1>Example</h1>
<p>The procedure requires taking the first 51 billion letters in step 5. As an example, if instead I asked you to take the first 28 letters in step 5, then your final string would be:</p>
<pre><code>eighteighteeneighteenmillion
</code></pre>
<p>And the answers to the three questions would be:</p>
<ol>
<li>N</li>
<li>18000000 (eighteen million)</li>
<li>18000026 (8 + 18 + 18000000)</li>
</ol>
<h1>Bonus</h1>
<p>Same procedure, except start with the integers 1 through 999,999,999,999 in step 1, and take the first 68 trillion (68,000,000,000,000) letters in step 5. If I did it right (that's a big "if"), this will also end on a number name boundary.</p>
<h1>Notes</h1>
<p>This is an old ITA Software hiring puzzle, and the solution can be found in several places on the web (including Reddit). So if you go looking for it, spoiler alert! On the other hand, it's easy to check your solution by doing a web search for your answer to question #3.</p>
<p><em>Thanks to <a href="/u/wizao">u/wizao</a> for posting this challenge to <a href="/r/dailyprogrammer_ideas">r/dailyprogrammer_ideas</a>!</em></p>
</div>
