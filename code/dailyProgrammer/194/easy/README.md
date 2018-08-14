# Destringification
<div class="md"><h1><a href="#EasyIcon"></a> <strong>(Easy)</strong>: Destringification</h1>
<p>Most programming languages understand the concept of escaping strings. For example, if you wanted to put a double-quote <code>"</code> into a string that is delimited by double quotes, you can't just do this:</p>
<pre><code>"this string contains " a quote."
</code></pre>
<p>That would end the string after the word <em>contains</em>, causing a syntax error. To remedy this, you can prefix the quote with a backslash <code>\</code> to <em>escape</em> the character.</p>
<pre><code>"this string really does \" contain a quote."
</code></pre>
<p>However, what if you wanted to type a backslash instead? For example:</p>
<pre><code>"the end of this string contains a backslash. \"
</code></pre>
<p>The parser would think the string never ends, as that last quote is escaped! The obvious fix is to also escape the back-slashes, like so.</p>
<pre><code>"lorem ipsum dolor sit amet \\\\"
</code></pre>
<p>The same goes for putting newlines in strings. To make a string that spans two lines, you cannot put a line break in the string literal:</p>
<pre><code>"this string...
...spans two lines!"
</code></pre>
<p>The parser would reach the end of the first line and panic! This is fixed by replacing the newline with a special escape code, such as <code>\n</code>:</p>
<pre><code>"a new line \n hath begun."
</code></pre>
<p>Your task is, given an escaped string, un-escape it to produce what the parser would understand.</p>
<h2>Input Description</h2>
<p>You will accept a string literal, surrounded by quotes, like the following:</p>
<pre><code>"A random\nstring\\\""
</code></pre>
<p>If the string is valid, un-escape it. If it's not (like if the string doesn't end), throw an error!</p>
<h2>Output Description</h2>
<p>Expand it into its true form, for example:</p>
<pre><code>A random
string\"
</code></pre>
<h1>Sample Inputs and Outputs</h1>
<h2>Sample Input</h2>
<pre><code>"hello,\nworld!"
</code></pre>
<h2>Sample Output</h2>
<pre><code>hello,
world!
</code></pre>
<h2>Sample Input</h2>
<pre><code>"\"\\\""
</code></pre>
<h2>Sample Output</h2>
<pre><code>"\"
</code></pre>
<h2>Sample Input</h2>
<pre><code>"an invalid\nstring\"
</code></pre>
<h2>Sample Output</h2>
<p>Invalid string! (Doesn't end)</p>
<h2>Sample Input</h2>
<pre><code>"another invalid string \q"
</code></pre>
<h2>Sample Output</h2>
<p>Invalid string! (Bad escape code, <code>\q</code>)</p>
<h1>Extension</h1>
<p>Extend your program to support entering multiple string literals:</p>
<pre><code>"hello\nhello again" "\\\"world!\\\""
</code></pre>
<p>The gap between string literals can only be whitespace (ie. new lines, spaces, tabs.) Anything else, throw an error. Output like the following for the above:</p>
<pre><code>String 1:
hello
hello again

String 2:
\"world!\"
</code></pre>
</div>
