# Verify Your Language!
<div class="md"><h1><a href="#HardIcon"></a> <em>(Hard)</em>: Verify Your Language!</h1>
<p><a href="http://en.wikipedia.org/wiki/Context-free_grammar">Context-free grammar</a> is a tool heavily used in programming language design, verification, compiling, and execution. It is, essentially, a formal language used to define a grammar (i.e. another language). CFG are "more powerful" (in that they can verify more complex languages) than other grammars, such as regular-expressions.</p>
<p>Programming language expressions are generally validated through CFGs. This is done by applying several products on an expression, subdividing the statement into known components, and finally into "terminal" components (i.e. parts of an expression that cannot be more subdivided). An example could be a CFG that only accepts addition expressions, such as "123 + 456". Such a CFG would have two rules that could be applied to verify if this expression was valid: A -&gt; Int + Int, and Int -&gt; '0123456789'Int | NULL</p>
<p>It is ** extremely important** that the reader understands CFG and the formal language associated with it - the above is simply a refresher / casual introduction to the subject.</p>
<p>Your goal is to write a program that accepts a CFG definition and a series of expressions, printing true or false for each expression if it is a valid expression of the given CFG.</p>
<p><em>Author: nint22</em></p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>First, your program must accept an integer N, where there will be N products, one per line, right below this integer.</p>
<p>To keep things simple, products must be a single upper-case letter, such as "S". The letter "E" is reserved as the null-terminator. The equal-character "=" is reserved as the product definition operator. Finally, the pipe-character "|" is reserved for defining sets of possible products.</p>
<p>This syntax is similar to the "on-paper" definition, with the small difference of substituting "E" and "-&gt;" for the greek-letter and arrow symbols.</p>
<p>Assume that the grammar is valid; you do not have to error-check or handle "bad" CFG definitions.</p>
<p>Next, you program must accept an integer M, where there will be M expressions, one per line, that must be tested by the above-defined grammar.</p>
<h2>Output Description</h2>
<p>For each expression M, print true or false, based on wether or not the expression is a valid expression of the given CFG.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<pre><code>3
S = SS
S = (S)
S = ()
4
()
((()))
(()(()))
(()
</code></pre>
<h2>Sample Output</h2>
<pre><code>True
True
True
False
</code></pre>
<h1>Challenge Input</h1>
<pre><code>8
S = x
S = y
S = z
S = S + S
S = S - S
S = S * S
S = S / S
S = ( S )
3
( x + y ) * x - z * y / ( x + x )
(xx - zz + x / z)
x + y * x - z * y / x + x
</code></pre>
<h2>Challenge Input Solution</h2>
<pre><code>True
False
False
</code></pre>
<h1>Note</h1>
<p>Some grammars may be ambiguous! Make sure to research what that means, though it should not affect your solution - I mention this simply to give you a warning if you see odd parsing behavior while debugging.</p>
<p><em>Bonus</em>: A short-hand method of having multiple products from one function-name is the "pipe operator", such as "S = x | y | z", instead of three separate "S = x", "S = y", "S = z". Support this notation system as a bonus.</p>
</div>
