# Path to Philosophy
<div class="md"><h1><a href="#IntermediateIcon"></a> <em>(Intermediate)</em>: Path to Philosophy</h1>
<p>Clicking on the first link in the main text of a Wikipedia article not
in parentheses or italics, and then repeating the process for subsequent
articles, usually eventually gets you to the Philosophy article. As of
May 26, 2011, 94.52% of all articles in Wikipedia lead eventually to
the article Philosophy. The rest lead to an article with no wikilinks
or with links to pages that do not exist, or get stuck in
loops. <a href="http://www.youtube.c%0Aom/watch?v=vehDe2lSptU">Here's a Youtube video demonstrating this phenomenon</a>.</p>
<p>Your goal is to write a program that will find the path from a given
article to the Philosophy article by following the first link (not in
parentheses, italics or tables) in the main text of the given article. Make
sure you have caching implemented from the start so you only need to
fetch each page once.</p>
<p>You will then extend the program to do a depth-first search in search
of the Philosophy article, backtracking if you get stuck and quitting
only when you know there is no such path. The last thing you
will do is generalise it to do a DFS towards <em>any</em> goal article.</p>
<p>Hint: Yes, there is a Wikipedia API. Feel free to use it.</p>
<p>The original formulation of this problem is found in the alternative
text to <a href="http://www.youtube.com/watch?v=vehDe2lSptU">XKCD: Extended Mind</a>.</p>
<p><em>Author: nagasgura</em></p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>Two strings, both which are names of existing Wikipedia articles (in
the Wikipedia language of your choice).</p>
<h2>Output Description</h2>
<p>A path of Wikipedia articles, each linked from the previous one, that
leads from the start article to the end article.</p>
<ul>
<li>Links in parentheses, italics and tables should not be considered</li>
<li>Links leading outside the main article namespace should not be considered</li>
<li>Links are to be considered in the order they appear in an article</li>
<li>The path should be created in a depth-first fashion</li>
<li>You must implement article caching early on</li>
</ul>
<p>You choose the output datastructure yourself, or print to standard-out.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<ul>
<li>From: Molecule</li>
<li>To:   Philosophy</li>
</ul>
<h2>Sample Output</h2>
<ul>
<li>Molecule</li>
<li>Atom</li>
<li>Matter</li>
<li>Invariant mass</li>
<li>Energy</li>
<li>Kinetic energy</li>
<li>Physics</li>
<li>Natural philosophy</li>
<li>Philosophy
# Challenge Input</li>
<li>From: Asperger syndrome</li>
<li>To:   Logic
## Challenge Input Solution

<ul>
<li>Asperger syndrome</li>
<li>Autism spectrum</li>
<li>Pervasive developmental disorder</li>
<li>Mental disorder</li>
<li>Psychology</li>
<li>Applied science</li>
<li>Natural science</li>
<li>Science</li>
<li>Knowledge</li>
<li>Fact</li>
<li>Proof (truth)</li>
<li>Necessity and sufficiency</li>
<li>Logic
# Note
This challenge was originally posted to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a>
Help us out by posting your own ideas!</li>
</ul></li>
</ul>
</div>
