# Sport Points
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Easy)</em>: Sport Points</h1>
<p>You must write code that verifies the awarded points for a fictional sport are valid. This sport is a simplification of <a href="http://en.wikipedia.org/wiki/American_football#Scoring">American Football</a> scoring rules. This means that the score values must be any logical combination of the following four rewards:</p>
<ul>
<li>6 points for a "touch-down"</li>
<li>3 points for a "field-goal"</li>
<li>1 point for an "extra-point"; can only be rewarded <em>after</em> a touch-down. Mutually-exclusive with "two-point conversion"</li>
<li>2 points for a "two-point conversion"; can only be rewarded <em>after</em> a touch-down. Mutually-exclusive with "extra-point"</li>
</ul>
<p>A valid score could be 7, which can come from a single "touch-down" and then an "extra-point". Another example could be 6, from either a single "touch-down" or two "field-goals". 4 is not a valid score, since it cannot be formed by any well-combined rewards.</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>Input will consist of a single positive integer given on standard console input.</p>
<h2>Output Description</h2>
<p>Print "Valid Score" or "Invalid Score" based on the respective validity of the given score.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input 1</h2>
<pre><code>35
</code></pre>
<h2>Sample Output 1</h2>
<pre><code>Valid Score
</code></pre>
<h2>Sample Input 2</h2>
<pre><code>2
</code></pre>
<h2>Sample Output 2</h2>
<pre><code>Invalid Score
</code></pre>
</div>
