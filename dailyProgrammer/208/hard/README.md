# The Universal Machine
<div class="md"><h1><a href="#HardIcon"></a> <em>(Hard)</em>: The Universal Machine</h1>
<p>Imagine an infinitely long, one-dimensional list of symbols. The list is infinite in both directions, and each symbol is indexed by a number, where the middle of the list is zero. This is called a <strong>tape</strong>. The symbols on the tape can be any symbol from an <strong>alphabet</strong>, which is just a set of possible symbols. If our example alphabet consists of the symbols <code>0</code>, <code>1</code> and <code>#</code>, then a valid tape would look like:</p>
<pre><code>#0110#10101#111#01##
|
</code></pre>
<p>(The <code>|</code> marks the location of the middle of the tape, position zero.) Of course, we can't represent an infinite tape at once. Therefore, we add another possible symbol to our alphabet, <code>_</code> (underscore), to denote the lack of a symbol. This <code>_</code> symbol fills the rest of the tape, all the way out to infinity, like so (ellipsis denotes repeat):</p>
<pre><code>. . . _________________#0110#10101#111#01##_________________ . . .
                       |
</code></pre>
<p>Now, imagine we have a <strong>machine</strong> that can look at this tape, but it can only see one symbol on the tape at once. To look at this tape, it has a <strong>read head</strong>. In our tape diagrams, the read head is marked with a caret (<code>^</code>). For example, here's the read head at position 7:</p>
<pre><code>#0110#10101#111#01##
|      ^
</code></pre>
<p>This read head can move one symbol to the left or right, but it can't skip ahead arbitrarily or jump to a specific location. Besides the read head, the machine also has a <strong>state</strong>. This is just an alphanumeric string, with no spaces, like a variable of the machine. It could be <code>Red</code>, it could be <code>Clockwise</code>, it could be <code>Catch22</code>, it could be <code>Tgnqovjaxbg</code>, as long as it's alphanumeric.</p>
<p>Now, this machine is capable of performing a <strong>step</strong>. A step will change the symbol under the read head to another symbol from the alphabet, and then either move the read head left or right. The type of step that happens depends on the current state, and the current symbol under the read head. We can define a rule for our machine which says something like this:</p>
<blockquote>
<p>If the current symbol under the read head is <strong>p</strong>, and the current state is <strong>A</strong>, then change the state to <strong>B</strong>, change the symbol under the read head to <strong>q</strong> and move the read head in direction <strong>d</strong>.</p>
</blockquote>
<p><strong>p</strong> and <strong>q</strong> can be the same symbol, and <strong>A</strong> and <strong>B</strong> can be the same state. For example:</p>
<blockquote>
<p>If the current symbol under the read head is <code>0</code>, and the current state is <code>State1</code>, then change the state to <code>State1</code>, change the symbol under the read head to <code>1</code> and move the read head left.</p>
</blockquote>
<p>This rule is called a <strong>transition function</strong>, and the typical notation is:</p>
<pre><code>𝛿(A, p) = (B, q, d)
</code></pre>
<p>So our example rule is:</p>
<pre><code>𝛿(State1, 0) = (State1, 1, &lt;)
</code></pre>
<p>So, if our machine is in the state <code>State1</code> and our tape looks like this:</p>
<pre><code>#0110#10101#111#01##
|      ^
</code></pre>
<p>Then, after applying our transition function above, we're now in <code>State1</code> (again) and the tape now looks like this:</p>
<pre><code>#0110#11101#111#01##
|     ^
</code></pre>
<p>You'll typically have quite a few transition functions to cover every possible state/symbol combination. After each step, the machine compares the new state to a special state known as the <strong>accepting state</strong>. If the current state is the accepting state, then the machine stops, as the computation is complete.</p>
<p>Whew, that's a lot of information! Here's the synopsis of what you need to describe one of these machines:</p>
<ul>
<li>The <strong>alphabet</strong>: all possible symbols (along with <code>_</code>, which is implicitly part of the alphabet.)</li>
<li>The <strong>tape</strong> at the start of the computation.</li>
<li>The <strong>starting position</strong> of the read head on the tape; this is assumed to be zero.</li>
<li>The <strong>list of possible</strong> states that our machine can be in.</li>
<li>The <strong>starting state</strong>, and the <strong>accepting state</strong>.</li>
<li>A list of <strong>transition functions</strong>, that cover every possible symbol/state combination on the given tape.</li>
</ul>
<p>This type of machine is known as a <a href="http://en.wikipedia.org/wiki/Turing_machine"><strong>Turing machine</strong></a>, named after the famous groundbreaking computer scientist and mathematician <a href="http://en.wikipedia.org/wiki/Alan_Turing">Alan Turing</a>. It sounds hopelessly verbose in practice, but a Turing machine is insanely useful as a theoretical model for computation. To gloss over quite a few details: if a machine can simulate any such Turing machine as described above, then it's described as <strong>Turing-complete</strong>. Today, you'll be writing a program to simulate a turing machine given the above required parameters; therefore, you'll need to use a Turing-complete language to solve this challenge. :)</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>First, you will be given the alphabet of a Turing machine (excluding <code>_</code>, which is always part of the alphabet) as a sequence of non-whitespace characters, like so:</p>
<pre><code>01
</code></pre>
<p>Next, you will be given a space-separated list of possible states for the machine, like this:</p>
<pre><code>Mov B Bi OK
</code></pre>
<p>You will then be given the initial state, and the accepting state, on two lines:</p>
<pre><code>Mov
OK
</code></pre>
<p>After this, you will be given the initial tape to use. The first character is assumed to be at position 0, with following characters at successive locations (1, 2, 3, etc.), like so:</p>
<pre><code>01100100
</code></pre>
<p>Finally, you're given a list of transition rules. These are in the format <code>StateBefore SymbolBefore = StateAfter SymbolAfter DirectionToMove</code>, like this list:</p>
<pre><code>Mov 0 = Mov 0 &gt;
Mov 1 = Mov 1 &gt;
Mov _ = B _ &lt;
B 0 = B 0 &lt;
B 1 = Bi 1 &lt;
B _ = OK _ &gt;
Bi 0 = Bi 1 &lt;
Bi 1 = Bi 0 &lt;
Bi _ = OK _ &gt;
</code></pre>
<p>The direction is either <code>&lt;</code> for left, or <code>&gt;</code> for right.</p>
<h2>Output Description</h2>
<p>You are to output the tape after the computation has finished. You are also to output the symbol <code>|</code> (pipe) under the middle of the tape (position zero), and output the symbol <code>^</code> (caret) under the position of the read head after the computation has finished. If the <code>^</code> and <code>|</code> would be in the same place (ie. the read head finishes at the middle of the tape), just print only the <code>|</code>.</p>
<pre><code>10011100
|
</code></pre>
<h1>Sample Turing Machines</h1>
<h2>Machine 1: Two's Complement</h2>
<p>This machine computes the two's complement of the binary number in the input. Notice how the transition functions can use the <code>_</code> symbol, even though it's not explicitly part of the alphabet.</p>
<h3>Input</h3>
<pre><code>01
Mov B Bi OK
Mov
OK
01100100
Mov 0 = Mov 0 &gt;
Mov 1 = Mov 1 &gt;
Mov _ = B _ &lt;
B 0 = B 0 &lt;
B 1 = Bi 1 &lt;
B _ = OK _ &gt;
Bi 0 = Bi 1 &lt;
Bi 1 = Bi 0 &lt;
Bi _ = OK _ &gt;
</code></pre>
<h3>Output</h3>
<pre><code>10011100
|
</code></pre>
<h2>Machine 2: Moving Morse Code</h2>
<p>This machine takes input as dots (<code>.</code>) and dashes (<code>/</code>), including a delimiter symbol, <code>k</code>. The dots and dashes are moved to after the <code>k</code>.</p>
<h3>Input</h3>
<pre><code>./k
Init Mdot MDash Ret OK
Init
OK
/././../.../..../k
Init _ = Init _ &gt;
Init . = Mdot _ &gt;
Init / = MDash _ &gt;
Init k = OK k &gt;
Mdot . = Mdot . &gt;
Mdot / = Mdot / &gt;
Mdot k = Mdot k &gt;
Mdot _ = Ret . &lt;
MDash . = MDash . &gt;
MDash / = MDash / &gt;
MDash k = MDash k &gt;
MDash _ = Ret / &lt;
Ret . = Ret . &lt;
Ret / = Ret / &lt;
Ret k = Ret k &lt;
Ret _ = Init _ &gt;
</code></pre>
<h3>Output</h3>
<pre><code>_________________k/././../.../..../
|                 ^                
</code></pre>
<p>Notice all the spaces in the output, as the dots and dashes are now not centered on the middle of the tape.</p>
<h2>Machine 3: Copying</h2>
<p>This machine takes a binary input string, including a delimiter symbol at the end. The binary string is copied to after the delimiter symbol.</p>
<h3>Input</h3>
<pre><code>01xy#
C0 C1 Ret Search OK
Search
OK
0110100#
Search 0 = C0 x &gt;
Search 1 = C1 y &gt;
Search # = OK # &gt;
C0 0 = C0 0 &gt;
C0 1 = C0 1 &gt;
C0 # = C0 # &gt;
C0 _ = Ret 0 &lt;
C1 0 = C1 0 &gt;
C1 1 = C1 1 &gt;
C1 # = C1 # &gt;
C1 _ = Ret 1 &lt;
Ret 0 = Ret 0 &lt;
Ret 1 = Ret 1 &lt;
Ret # = Ret # &lt;
Ret x = Search 0 &gt;
Ret y = Search 1 &gt;
</code></pre>
<h3>Output</h3>
<pre><code>0110100#0110100
|       ^      
</code></pre>
<h1>Notes and Further Reading</h1>
<p>The Wolfram MathWorld <a href="http://mathworld.wolfram.com/TuringMachine.html">page on Turing Machines</a> has some more description of the concept of turing machines. Sometimes cell 'colours' are used rather than 'symbols', but the over-arching concept is always the same.</p>
<p>Got any cool challenge ideas? Submit them to <a href="/r/DailyProgrammer_Ideas">/r/DailyProgrammer_Ideas</a>!</p>
</div>
