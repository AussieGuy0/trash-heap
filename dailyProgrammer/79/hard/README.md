# (Remove C comments)
<div class="md"><p>In the C programming language, comments are written in two different ways:</p>
<ul>
<li><code>/* ... */</code>: block notation, across multiple lines.</li>
<li><code>// ...</code>: a single-line comment until the end of the line.</li>
</ul>
<p>Write a program that removes these comments from an input file, replacing them by <strong>a single space character</strong>, but also handles <strong>strings</strong> correctly. Strings are delimited by a <code>"</code> character, and <code>\"</code> is skipped over. For example:</p>
<pre><code>  int /* comment */ foo() { }
→ int   foo() { }

  void/*blahblahblah*/bar() { for(;;) } // line comment
→ void bar() { for(;;) }  

  { /*here*/ "but", "/*not here*/ \" /*or here*/" } // strings
→ {   "but", "/*not here*/ \" /*or here*/" }  
</code></pre>
</div>
