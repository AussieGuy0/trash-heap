# Precedence Parsing
<div class="md"><h1><a href="#HardIcon"></a> <strong>(Hard)</strong>: Precedence Parsing</h1>
<p>If you have covered algebra then you may have heard of the BEDMAS rule (also known as BIDMAS, PEMDAS and a lot of other acronyms.) The rule says that, when reading a mathematical expression, you are to evaluate in this order:</p>
<ul>
<li><p><strong>B</strong>rackets, and their contents, should be evaluated first.</p></li>
<li><p><strong>E</strong>xponents should be evaluated next.</p></li>
<li><p><strong>D</strong>ivision and <strong>M</strong>ultiplication follow after that.</p></li>
<li><p><strong>A</strong>ddition and <strong>S</strong>ubtraction are evaluated last.</p></li>
</ul>
<p>This disambiguates the evaluation of expressions. These BEDMAS rules are fairly arbitrary and are defined mostly by convention - they are called <em>precedence</em> rules, as they dictate which operators have precedence over other operators. For example, the above rules mean that an expression such as <code>3+7^2/4</code> is interpreted as <code>3+((7^2)/4)</code>, rather than <code>(3+7)^(2/4)</code> or any other such way.</p>
<p>For the purposes of this challenge, let's call the fully-bracketed expression the <em>disambiguated</em> expression - for example, <code>1+2*6-7^3*4</code> is disambiguated as <code>((1+(2*6))-((7^3)*4))</code>, giving no room for mistakes. Notice how <em>every</em> operation symbol has an associated pair of brackets around it, meaning it's impossible to get it wrong!</p>
<p>There is something that BEDMAS does <em>not</em> cover, and that is called <em>associativity</em>. Let's look at an expression like <code>1-2-3-4-5</code>. This contains only one operator, so our precedence rules don't help us a great deal. Is this to be read as <code>(1-(2-(3-(4-5))))</code> or <code>((((1-2)-3)-4)-5)</code>? The correct answer depends on the operator in question; in the case of the subtract operator, the correct answer is the latter. The left-most operation (<code>1-2</code>) is done first, followed by <code>-3</code>, <code>-4</code>, <code>-5</code>. This is called <em>left-associativity</em>, as the left-most operation is done first. However, for the exponent (<code>^</code>) operator, the right-most operation is usually done first. For example <code>2^6^9^10</code>. The first operation evaluated is <code>9^10</code>, followed by <code>6^</code>, <code>2^</code>. Therefore, this is disambiguated as <code>(2^(6^(9^10)))</code>. This is called <em>right-associativity</em>.</p>
<p>In this challenge, you won't be dealing with performing the actual calculations, but rather just the disambiguation of expressions into their fully-evaluated form. As a curve-ball, you won't necessarily be dealing with the usual operators <code>+</code>, <code>-</code>, ... either! You will be given a set of operators, their precedence and associativity rules, and an expression, and then you will disambiguate it. The expression will contain only integers, brackets, and the operations described in the input.</p>
<h2>Disclaimer</h2>
<p>These parsing rules are a bit of a simplification. In real life, addition and subtraction have the same precedence, meaning that <code>1-2+3-4+5</code> is parsed as <code>((((1-2)+3)-4)+5)</code>, rather than <code>((1-(2+3))-(4+5))</code>. For the purpose of the challenge, you will not have to handle inputs with equal-precedence operators. Just bear this in mind, that you cannot represent PEMDAS using our challenge input, and you will be fine.</p>
<h1>Input and Output Description</h1>
<h2>Input Description</h2>
<p>You will input a number <strong>N</strong>. This is how many different operators there are in this expression. You will then input <strong>N</strong> further lines in the format:</p>
<pre><code>symbol:assoc
</code></pre>
<p>Where <code>symbol</code> is a single-character symbol like <code>^</code>, <code>#</code> or <code>@</code>, and <code>assoc</code> is either <em>left</em> or <em>right</em>, describing the associativity of the operator. The precedence of the operators is from highest to lowest in the order they are input. For example, the following input describes a subset of our BEDMAS rules above:</p>
<pre><code>3
^:right
/:left
-:left
</code></pre>
<p>Finally after that you will input an expression containing integers, brackets (where brackets are treated as they normally are, taking precedence over everything else) and the operators described in the input.</p>
<h2>Output Description</h2>
<p>You will output the fully disambiguated version if the input. For example, using our rules described above, <code>3+11/3-3^4-1</code> will be printed as:</p>
<pre><code>(((3-(11/3))-(3^4))-1)
</code></pre>
<p>If you don't like this style, you could print it with (reverse-)Polish notation instead:</p>
<pre><code>3 11 3 / - 3 4 ^ - 1 -
</code></pre>
<p>Or even as a parse-tree or something. The output format is up to you, as long as it shows the disambiguated order of operations clearly.</p>
<h1>Sample Inputs and Outputs</h1>
<p>This input:</p>
<pre><code>3
^:right
*:left
+:left
1+2*(3+4)^5+6+7*8
</code></pre>
<p>Should disambiguate to:</p>
<pre><code>(((1+(2*((3+4)^5)))+6)+(7*8))
</code></pre>
<p>This input:</p>
<pre><code>5
&amp;:left
|:left
^:left
&lt;:right
&gt;:right
3|2&amp;7&lt;8&lt;9^4|5
</code></pre>
<p>Should disambiguate to:</p>
<pre><code>((3|(2&amp;7))&lt;(8&lt;(9^(4|5))))
</code></pre>
<p>This input:</p>
<pre><code>3
&lt;:left
&gt;:right
.:left
1&lt;1&lt;1&lt;1&lt;1.1&gt;1&gt;1&gt;1&gt;1
</code></pre>
<p>Should disambiguate to:</p>
<pre><code>(((((1&lt;1)&lt;1)&lt;1)&lt;1).(1&gt;(1&gt;(1&gt;(1&gt;1)))))
</code></pre>
<p>This input:</p>
<pre><code>2
*:left
+:left
1+1*(1+1*1)
</code></pre>
<p>Should disambiguate to:</p>
<pre><code>(1+(1*(1+(1*1))))
</code></pre>
</div>
