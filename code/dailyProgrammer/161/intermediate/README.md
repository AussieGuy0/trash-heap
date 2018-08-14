# Appointing Workers
<div class="md"><h1><a href="#IntermediateIcon"></a> <em>(Intermediate)</em>: Appointing Workers</h1>
<p>In the past, we've already tackled the challenge of deciding in which order to do certain jobs. However, now you need to work out which worker gets which job. What if some workers are only qualified to do certain jobs? How do you ensure there are no jobs or workers left out? Your challenge now is (given some jobs that need to be done, and some workers and the jobs they're allowed to do) compute who should be given which job, so no-one is doing a job they are not qualified for.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>On the console, you will be given numbers N. <strong>N</strong> represents the number of jobs that need to be done, and the number of workers.<sup>see footnote</sup> To keep this challenge at an Intermediate level, the number of workers and jobs will always be the same.</p>
<p>You will then be given a list of <strong>N</strong> jobs (on separate lines), followed by <strong>N</strong> workers and the jobs they're allowed to do (separated by commas, one worker per line).</p>
<p>Note that there may be more than one possible assignment of workers.</p>
<h2>Output Description</h2>
<p>You must print the list of workers, along with the job each worker is assigned to.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<pre><code>5
Wiring
Insulation
Plumbing
Decoration
Finances
Alice Wiring,Insulation,Plumbing
Bob Wiring,Decoration
Charlie Wiring,Plumbing
David Plumbing
Erin Insulation,Decoration,Finances
</code></pre>
<h2>Sample Output</h2>
<pre><code>Alice Insulation
Bob Decoration
Charlie Wiring
David Plumbing
Erin Finances
</code></pre>
<h1>Challenge</h1>
<h2>Challenge Input</h2>
<pre><code>6
GUI
Documentation
Finances
Frontend
Backend
Support
Alice GUI,Backend,Support
Bill Finances,Backend
Cath Documentation,Finances
Jack Documentation,Frontend,Support
Michael Frontend
Steve Documentation,Backend
</code></pre>
<h2>Challenge Output</h2>
<p>Note that this is just one possible solution - there may be more.</p>
<pre><code>Alice GUI
Bill Backend
Cath Finances
Jack Support
Michael Frontend
Steve Documentation
</code></pre>
<h1>Hint</h1>
<p>This problem is called the Matching problem in usual terms.</p>
<h1>Footnote</h1>
<p>Someone messaged me a while ago asking why I include this part of the challenge. Specifying how many lines of input follows makes things slightly easier for people writing the solution in languages like C where variable sized arrays are complicated to implement. It's just handy more than anything.</p>
</div>
