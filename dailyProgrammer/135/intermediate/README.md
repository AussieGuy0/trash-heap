# De Morgan's Law
<div class="md"><h1><a href="#IntermediateIcon"></a> <em>(Intermediate)</em>: De Morgan's Law</h1>
<p><a href="http://en.wikipedia.org/wiki/De_Morgan's_laws">De Morgan's Law</a> is a neat law of Boolean propositional logic, helpful in every-day programming. It helps with inverting a boolean expression to get the opposite expression. <a href="http://mathworld.wolfram.com/deMorgansLaws.html">Wolfram Mathworld</a> has a much more correct definition using set theory, being equivalent to <a href="http://en.wikipedia.org/wiki/Boolean_algebra">Boolean expressions</a>.</p>
<p>That's important since programming is all about Boolean-expressions! If you want to invert some "if" conditional code (that is, to compute the test for the "else" fall-through case), you need to apply the Law's two transformations:</p>
<ul>
<li>The not ( of expression-A and expression-B) is-equivalent-to not expression-A or not expression-B</li>
<li>The not ( of expression-A or expression-B) is-equivalent-to not expression-A and not expression-B</li>
</ul>
<p>An interpretation of these rules, helpful for applying it, is that you first apply the <em>not</em>-operator on all expressions, then replace all <em>and</em>s with <em>or</em>s, and vice-versa. This gets much more tricky and complex when order of operations come in play with parentheses (nested expressions).</p>
<p>Your goal is to take a C-like language's Boolean expression, and apply De Morgan's Law on it. You may choose to simplify the resulting expression as much as possible for epic bonus poinst; consider reading into <a href="http://en.wikipedia.org/wiki/Karnaugh_map">Karnaugh maps</a> as one approach. "Simplified" is measured in the least-amount of variables and operators required (not counting parentheses).</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>The grammar of this C-like language is English-language space-delimited words, uses parentheses for nested expressions, with variables strictly being lower-case alpha-numeric. The reserved key-word for logical-and is "AND", with logical-or "OR", and logical-not "NOT". The expression will be in <a href="http://en.wikipedia.org/wiki/Infix_notation">Infix-notation</a>.</p>
<p>Note that the "NOT" is a unary operator, meaning it always applies first to variables on the right of itself, or to a full expression. The expression "NOT a OR b" is equivalent to "(NOT a) OR b", but not "NOT (a or b)".</p>
<h2>Output Description</h2>
<p>Given the expression, print it's inverse using the same grammar and given variables. Simplify the expression for epic bonus points.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Inputs</h2>
<pre><code>a
NOT a
a AND b 
NOT a AND b 
NOT (a AND b)
NOT (a OR b AND C) OR NOT(a AND NOT b)
</code></pre>
<h2>Sample Outputs</h2>
<pre><code>NOT a
a
NOT a or NOT b 
a OR NOT b 
a AND b
a AND NOT b
</code></pre>
</div>
