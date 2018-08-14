# Interpreting interpreters
<div class="md"><h1><strong>Description:</strong></h1>
<p>An interpreter is a program that executes commands written in a programming language. Today you will be writing 2 of these!</p>
<p>Taking a language of your choice, write an interpreter and within that language, write a Brainfuck interpreter.</p>
<p>For instance;</p>
<p>Let's say your programming language of choice is Ruby. Your languages could be linked like so:</p>
<p>Ruby -&gt; Scheme -&gt; Brainfuck</p>
<p>Ruby parses and evaluates the Scheme syntax. The Scheme syntax will parse the Brainfuck syntax.</p>
<p>I chose Scheme as an example here because there is a lot of reading material on building an interpreter for Scheme.</p>
<h1><strong>Input</strong></h1>
<p>You will be given Brainfuck code, within your program, convert this code back to its string equivalent.</p>
<pre><code>++++++++[&gt;++++[&gt;++&gt;+++&gt;+++&gt;+&lt;&lt;&lt;&lt;-]&gt;+&gt;+&gt;-&gt;&gt;+
[&lt;]&lt;-]&gt;&gt;.&gt;---.+++++++..+++.&gt;&gt;.&lt;-.&lt;.+++.------.--------.&gt;&gt;+.&gt;++.
</code></pre>
<h1><strong>Output</strong></h1>
<pre><code>Hello World!
</code></pre>
<h1><strong>Challenge Input</strong></h1>
<pre><code>++++++++[&gt;+&gt;++&gt;+++&gt;++++&gt;+++++&gt;++++++&gt;
+++++++&gt;++++++++&gt;+++++++++&gt;++++++++++&gt;
+++++++++++&gt;++++++++++++&gt;+++++++++++++&gt;++++++++++++++&gt;
+++++++++++++++&gt;++++++++++++++++
&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;-]&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;+.-&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&gt;&gt;
&gt;&gt;&gt;-.+&lt;&lt;&lt;&lt;&lt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;---.+++&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;
&lt;&lt;&lt;&gt;&gt;&gt;&gt;.&lt;&lt;&lt;&lt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;+++.---&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;
&lt;&lt;&lt;&lt;&lt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;-.+&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;++.--&lt;&lt;&lt;&lt;
&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;
&gt;++.--&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;&gt;+.-&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;&lt;.
</code></pre>
<h1><strong>Bonus:</strong></h1>
<p>For extra points, have your chain add an extra language.
E.g.</p>
<p>Ruby -&gt; Scheme -&gt; Brainfuck -&gt; Whitespace</p>
<p>(Only the mentally ill would attempt such a feat.)</p>
<h1><strong>Further Reading</strong></h1>
<p><a href="http://mitpress.mit.edu/sicp/full-text/book/book-Z-H-4.html#%_toc_start">Structure and Interpretation of Computer Programs</a></p>
<p>This book will serve you extremely well. Large portions of the book are on interpreters/compilers and its main dialect is Scheme.</p>
<p><a href="https://code.google.com/p/awib/">AWIB</a></p>
<p>This is a Brainfuck compiler written in Brainfuck. Potentially very useful to poke around and see how it works.</p>
<p><a href="http://norvig.com/lispy.html">Lispy</a></p>
<p>A Lisp interpreter written in Python</p>
</div>
