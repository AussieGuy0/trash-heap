# Halt! It's simulation time!
<div class="md"><h1><a href="#IntermediateIcon"></a> <em>(Intermediate)</em>: Halt! It's simulation time!</h1>
<p>The <a href="http://en.wikipedia.org/wiki/Halting_problem">Halting Problem</a>, in computational theory, is the challenge of determining if a given program and data, when started, will actually finish. In more simple terms: it is essentially impossible to determine if an arbitrary program will ever complete because of how quickly a program's complexity can grow. One could attempt to partially solve the program by attempting to find logical errors, such as infinite loops or bad iteration conditions, but this cannot verify if complex structures ever halt. Another partial solution is to just simulate the code and see if it halts, though this fails for any program that becomes reasonably large. For this challenge, you will be doing this last approach:</p>
<p>Your goal is to simulate a given program, written in a subset of common assembly instructions listed below, and measure how many instructions were executed before the program halts, or assume the program never halts after executing 100,000 instructions. The fictional computer architecture that runs these instructions does so one instruction at a time, starting with the first and only stopping when the "HALT" instruction is executed or when there is no next instruction. The memory model is simple: it has 32 1-bit registers, indexed like an array. Memory can be treated conceptually like a C-style array named M: M[0], M[1], ..., M[31] are all valid locations. All memory should be initialized to 0. Certain instructions have arguments, which will always be integers between 0 to 31 (inclusive).</p>
<p>The instruction set only has 10 instructions, as follows:</p>
<table><thead>
<tr>
<th align="left">Instruction</th>
<th align="right">Description</th>
</tr>
</thead><tbody>
<tr>
<td align="left">AND a b</td>
<td align="right">M[a] = M[a] bit-wise and M[b]</td>
</tr>
<tr>
<td align="left">OR a b</td>
<td align="right">M[a] = M[a] bit-wise or M[b]</td>
</tr>
<tr>
<td align="left">XOR a b</td>
<td align="right">M[a] = M[a] bit-wise xor M[b]</td>
</tr>
<tr>
<td align="left">NOT a</td>
<td align="right">M[a] = bit-wise not M[a]</td>
</tr>
<tr>
<td align="left">MOV a b</td>
<td align="right">M[a] = bit-wise M[b]</td>
</tr>
<tr>
<td align="left">SET a c</td>
<td align="right">M[a] = c</td>
</tr>
<tr>
<td align="left">RANDOM a</td>
<td align="right">M[a] = random value (0 or 1; equal probability distribution)</td>
</tr>
<tr>
<td align="left">JMP x</td>
<td align="right">Start executing instructions at index x</td>
</tr>
<tr>
<td align="left">JZ x a</td>
<td align="right">Start executing instructions at index x if M[a] == 0</td>
</tr>
<tr>
<td align="left">HALT</td>
<td align="right">Halts the program</td>
</tr>
</tbody></table>
<p>Note that memory and code reside in different places! Basically you can modify memory, but cannot modify code.</p>
<p><em>Special thanks to the ACM collegiate programming challenges group for giving me the initial idea <a href="https://icpcarchive.ecs.baylor.edu/index.php?option=com_onlinejudge&amp;Itemid=8&amp;category=12&amp;page=show_problem&amp;problem=945">here</a>. Please note that one cannot actually solve the Halting problem, and that this is strictly a mini-simulation challenge.</em></p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>You will first be given an integer N, which represents the number of instructions, one per line, that follows. Each of these lines will start with an instruction from the table above, with correctly formed arguments: the given program will be guaranteed to <strong>never</strong> crash, but are <strong>not</strong> guaranteed to ever halt (that's what we are testing!).</p>
<h2>Output Description</h2>
<p>Simply run the program within your own simulation; if it halts (runs the HALT instruction) or ends (goes past the final instruction), write "Program halts!" and then the number of instructions executed. If the program does not halt or end within 100,000 instruction executions, stop the simulation and write "Unable to determine if application halts".</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<pre><code>5
SET 0 1
JZ 4 0
RANDOM 0
JMP 1
HALT
</code></pre>
<h2>Sample Output</h2>
<pre><code>"Program halts! 5 instructions executed."
</code></pre>
</div>
