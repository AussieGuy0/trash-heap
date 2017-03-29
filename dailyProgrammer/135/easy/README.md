# Arithmetic Equations
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Easy)</em>: Arithmetic Equations</h1>
<p><a href="http://en.wikipedia.org/wiki/Unix">Unix</a>, the famous multitasking and multi-user operating system, has several standards that defines Unix commands, system calls, subroutines, files, etc. Specifically within <a href="http://en.wikipedia.org/wiki/Version_7_Unix">Version 7</a> (though this is included in many other Unix standards), there is a game called "arithmetic". To quote the <a href="http://en.wikipedia.org/wiki/Man_page">Man Page</a>:</p>
<pre><code>Arithmetic types out simple arithmetic problems, and waits for an answer to be typed in. If the answer
is correct, it types back "Right!", and a new problem. If the answer is wrong, it replies "What?", and
waits for another answer. Every twenty problems, it publishes statistics on correctness and the time
required to answer.
</code></pre>
<p>Your goal is to implement this game, with some slight changes, to make this an [Easy]-level challenge. You will only have to use three arithmetic operators (addition, subtraction, multiplication) with four integers. An example equation you are to generate is "2 x 4 + 2 - 5".</p>
<p><em>Author:</em> nint22</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>The first line of input will always be two integers representing an inclusive range of integers you are to pick from when filling out the constants of your equation. After that, you are to print off a single equation and wait for the user to respond. The user may either try to solve the equation by writing the integer result into the console, or the user may type the letters 'q' or 'Q' to quit the application.</p>
<h2>Output Description</h2>
<p>If the user's answer is correct, print "Correct!" and randomly generate another equation to show to the user. Otherwise print "Try Again" and ask the same equation again. Note that all equations must randomly pick and place the operators, as well as randomly pick the equation's constants (integers) from the given range. You are allowed to repeat constants and operators. You may use either the star '*' or the letter 'x' characters to represent multiplication.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input / Output</h2>
<p><em>Since this is an interactive application, lines that start with '&gt;' are there to signify a statement from the console to the user, while any other lines are from the user to the console.</em></p>
<pre><code>0 10
&gt; 3 * 2 + 5 * 2
16
&gt; Correct!
&gt; 0 - 10 + 9 + 2
2
&gt; Incorrect...
&gt; 0 - 10 + 9 + 2
3
&gt; Incorrect...
&gt; 0 - 10 + 9 + 2
1
&gt; Correct!
&gt; 2 * 0 * 4 * 2
0
&gt; Correct!
q
</code></pre>
</div>
