# The Infinite Stallman Theorem
<div class="md"><h1><a href="#BonusIcon"></a> <em>(Bonus)</em>: The Infinite Stallman Theorem</h1>
<p>Loosely, the <a href="http://en.wikipedia.org/wiki/Infinite_monkey_theorem"><em>infinite monkey theorem</em></a> states that, given an infinite number of monkeys randomly typing at typewriters for an unbounded amount of time, one will eventually produce a work of Shakespeare from start to finish. After the Japanese government performed this thought experiment using an infinitely-nested fractal pocket dimension with some success in 2007 (despite the incident with the micro black holes), application of the theorem has had some practical value in the field of <a href="http://en.wikipedia.org/wiki/Program_optimization">software optimization</a>.</p>
<p>Human-developed programs often suffer from performance issues, such as the during the compilation of large programs. Even today's compilers, such as the GNU Compiler Collection or Clang, take a non-trivial amount of time to compile complex systems. Partly, this boils down to limitations of human thought process when designing the architecture of such systems. This problem can be alleviated by randomly-generating the program instead, using the theorem described above. This is known as using an <strong>evolutionary algorithm</strong>, named by Charles Darwin who produced the first artifically-generated Smalltalk compiler in 1866.</p>
<p>Today, your challenge is to randomly generate a C++ compiler, by simulating a monkey entering random characters on a typewriter, and testing the resulting source code. The randomly-generated compiler can be implemented in a language of your choice.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>The input to this challenge consists of a single line, describing the C++ standard which the generated compiler should accept. This can consist of any of the following strings:</p>
<ul>
<li><code>c++98</code> for the C++98 standard.</li>
<li><code>c++03</code> for the 2003 revision of the C++98 standard.</li>
<li><code>c++11</code> for the C++11 standard (previously known as C++0x).</li>
<li><code>c++14</code> for the 2014 revision of the C++11 standard.</li>
</ul>
<h2>Output Description</h2>
<p>You are to output a tarball of the source of a randomly-generated C++ compiler, compliant to the standard provided as input to the challenge.</p>
<h1>Sample Inputs and Outputs</h1>
<h2>Sample Input</h2>
<pre><code>c++14
</code></pre>
<h1>Notes</h1>
<p>Got any cool challenge ideas? Submit them to <a href="/r/DailyProgrammer_Ideas">/r/DailyProgrammer_Ideas</a>!</p>
</div>
