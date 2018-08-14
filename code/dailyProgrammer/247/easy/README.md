# Secret Santa
<div class="md"><h1>Description</h1>
<p>Every December my friends do a "Secret Santa" - the traditional gift exchange
where everybody is randomly assigned to give a gift to a friend. To make
things exciting, the matching is all random (you cannot pick your gift
recipient) and nobody knows who got assigned to who until the day when the
gifts are exchanged - hence, the "secret" in the name.</p>
<p>Since we're a big group with many couples and families, often a husband gets
his wife as secret santa (or vice-versa), or a father is assigned to one of
his children. This creates a series of issues:</p>
<ul>
<li>If you have a younger kid and he/she is assigned to you, you might end up
paying for your own gift and ruining the surprise.</li>
<li>When your significant other asks "who did you get for Secret Santa", you
have to lie, hide gifts, etc.</li>
<li>The inevitable "this game is rigged!" commentary on the day of revelation.</li>
</ul>
<p>To fix this, you must design a program that randomly assigns the Secret Santa
gift exchange, but <em>prevents people from the same family to be assigned to
each other</em>.</p>
<h1>Input</h1>
<p>A list of all Secret Santa participants. People who belong to the same family
are listed in the same line separated by spaces. Thus, "Jeff Jerry" represents
two people, Jeff and Jerry, who are family and should not be assigned to
eachother.</p>
<pre><code>Joe
Jeff Jerry
Johnson
</code></pre>
<h1>Output</h1>
<p>The list of Secret Santa assignments. As Secret Santa is a random assignment,
output may vary.</p>
<pre><code>Joe -&gt; Jeff
Johnson -&gt; Jerry
Jerry -&gt; Joe
Jeff -&gt; Johnson
</code></pre>
<p>But <strong>not</strong> <code>Jeff -&gt; Jerry</code> or <code>Jerry -&gt; Jeff</code>!</p>
<h1>Challenge Input</h1>
<pre><code>Sean
Winnie
Brian Amy
Samir
Joe Bethany
Bruno Anna Matthew Lucas
Gabriel Martha Philip
Andre
Danielle
Leo Cinthia
Paula
Mary Jane
Anderson
Priscilla
Regis Julianna Arthur
Mark Marina
Alex Andrea
</code></pre>
<h1>Bonus</h1>
<p>The assignment list must avoid "closed loops" where smaller subgroups get
assigned to each other, breaking the overall loop.</p>
<pre><code>Joe -&gt; Jeff
Jeff -&gt; Joe # Closed loop of 2
Jerry -&gt; Johnson
Johnson -&gt; Jerry # Closed loop of 2
</code></pre>
<h1>Challenge Credit</h1>
<p>Thanks to <a href="/u/oprimo">/u/oprimo</a> for his idea in <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
</div>
