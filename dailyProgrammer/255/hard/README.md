# Hacking a search engine
<div class="md"><h1>Problem description</h1>
<p>Let's consider a simple search engine: one that searches over a large list of short, pithy sayings. It can take a 5+ letter string as an input, and it returns any sayings that contain that sequence (ignoring whitespace and punctuation). For example:</p>
<pre><code> Search: jacka
Matches: Jack and Jill went up the hill to fetch a pail of water.
        All work and no play makes Jack a dull boy.
        The Manchester United Junior Athletic Club (MUJAC) karate team was super good at kicking.

 Search: layma
Matches: All work and no play makes Jack a dull boy.
        The MUJAC playmaker actually kinda sucked at karate.
</code></pre>
<p>Typically, a search engine does not provide an easy way to simply search "everything", especially if it is a private service. Having people get access to all your data generally devalues the usefulness of only showing small bits of it (as a search engine does). </p>
<p>We are going to force this (hypothetical) search engine to give us all of its results, by coming up with just the right inputs such that every one of its sayings is output at least once by all those searches. We will also be minimizing the number of searches we do, so we don't "overload" the search engine.</p>
<h1>Formal input/output</h1>
<p>The input will be a (possibly very long) list of short sayings, one per line. Each has at least 5 letters.</p>
<p>The output must be a list of 5+ letter search queries. Each saying in the input must match at least one of the output queries. Minimize the number of queries you output.</p>
<h1>Sample input</h1>
<pre><code>Jack and Jill went up the hill to fetch a pail of water.
All work and no play makes Jack and Jill a dull couple.
The Manchester United Junior Athletic Club (MUJAC) karate team was super good at kicking.
The MUJAC playmaker actually kinda sucked at karate.
</code></pre>
<h1>Sample output</h1>
<pre><code>layma
jacka
</code></pre>
<p>There are multiple possible valid outputs. For example, this is another solution:</p>
<pre><code>djill
mujac
</code></pre>
<p>Also, while this is technically a valid solution, it is <em>not</em> an optimal one, since it does not have the minimum possible (in this case, 2) search queries:</p>
<pre><code>jacka
allwo
thema
themu
</code></pre>
<h1>Challenge input</h1>
<p>Use this file of 3877 one-line UNIX fortunes: <a href="https://raw.githubusercontent.com/fsufitch/dailyprogrammer/master/common/oneliners.txt">https://raw.githubusercontent.com/fsufitch/dailyprogrammer/master/common/oneliners.txt</a></p>
<h1>Notes</h1>
<p>This is a hard problem not just via its tag here on <a href="/r/dailyprogrammer">/r/dailyprogrammer</a>; it's in a <a href="https://en.wikipedia.org/wiki/NP-completeness#NP-complete_problems">class of problems</a> that is generally known to computer scientists to be difficult to find efficient solutions to. I picked a "5+ letter" limit on the outputs since it makes brute-forcing hard: 26<sup>5</sup> = 11,881,376 different combinations, checked against 3,877 lines each is 46 billion comparisons. That serves as a very big challenge. If you would like to make it easier while developing, you could turn the 5 character limit down to fewer -- reducing the number of possible outputs. Good luck!</p>
<h1>Lastly...</h1>
<p>Got your own idea for a super hard problem? Drop by <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and share it with everyone!</p>
</div>
