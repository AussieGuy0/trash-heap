# Tiny Assembler
<div class="md"><h1><a href="#IntermediateIcon"></a> <em>(Intermediate)</em>: Tiny Assembler</h1>
<p><em>Tiny</em>, a very simple fictional computer architecture, is programmed by an assembly language that has 16 <a href="http://en.wikipedia.org/wiki/Assembly_language#Opcode_mnemonics_and_extended_mnemonics">mnemonics</a>, with 37 unique op-codes. The system is based on <a href="http://en.wikipedia.org/wiki/Harvard_architecture">Harvard architecture</a>, and is very straight-forward: program memory is different from working memory, the machine only executes one instruction at a time, memory is an array of bytes from index 0 to index 255 (inclusive), and doesn't have any relative addressing modes. Instructions are multibyte, much like the X86 architecture. Simple instructions like HALT only take one byte, while complex instructions like JLS (Jump if Less-than) take four bytes.</p>
<p>Your goal will be to write an <a href="http://en.wikipedia.org/wiki/Assembler_(computing)#Assembler">assembler</a> for Tiny: though you don't need to simulate the code or machine components, you must take given assembly-language source code and produce a list of hex op-codes. You are essentially writing code that converts the lowest human-readable language to machine-readable language!</p>
<p>The following are all mnemonics and associated op-codes for the Tiny machine. Note that brackets mean "content of address-index" while non-brackets mean literals. For example, the instruction "AND [0] 1" will set the contents of the first element (at index 0) of memory to 1 if, and only if, the original contents at that element are equal to the given literal 1.</p>
<p><strong>Google Documents of the below <a href="https://docs.google.com/document/d/1lDk_1dLz82iwc-1hESNFSepcz4Swyaf9P1j5hvR2iHw">found here</a>.</strong></p>
<table><thead>
<tr>
<th align="left">Group</th>
<th align="left">Instruction</th>
<th align="left">Byte Code</th>
<th align="left">Description</th>
</tr>
</thead><tbody>
<tr>
<td align="left">1. Logic</td>
<td align="left">AND a b</td>
<td align="left">2 Ops, 3 bytes:</td>
<td align="left">M[a] = M[a] bit-wise and M[b]</td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x00 [a] [b]</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x01 [a] b</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left">OR a b</td>
<td align="left">2 Ops, 3 bytes:</td>
<td align="left">M[a] = M[a] bit-wise or M[b]</td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x02 [a] [b]</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x03 [a] b</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left">XOR a b</td>
<td align="left">2 Ops, 3 bytes:</td>
<td align="left">M[a] = M[a] bit-wise xor M[b]</td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x04 [a] [b]</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x05 [a] b</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left">NOT a</td>
<td align="left">1 Op, 2 bytes:</td>
<td align="left">M[a] = bit-wise not M[a]</td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x06 [a]</td>
<td align="left"></td>
</tr>
<tr>
<td align="left">2. Memory</td>
<td align="left">MOV a b</td>
<td align="left">2 Ops, 3 bytes:</td>
<td align="left">M[a] = M[b], or the literal-set M[a] = b</td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x07 [a] [b]</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x08 [a] b</td>
<td align="left"></td>
</tr>
<tr>
<td align="left">3. Math</td>
<td align="left">RANDOM a</td>
<td align="left">2 Ops, 2 bytes:</td>
<td align="left">M[a] = random value (0 to 25; equal probability distribution)</td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x09 [a]</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left">ADD a b</td>
<td align="left">2 Ops, 3 bytes:</td>
<td align="left">M[a] = M[a] + b; no overflow support</td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x0a [a] [b]</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x0b [a] b</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left">SUB a b</td>
<td align="left">2 Ops, 3 bytes:</td>
<td align="left">M[a] = M[a] - b; no underflow support</td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x0c [a] [b]</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x0d [a] b</td>
<td align="left"></td>
</tr>
<tr>
<td align="left">4. Control</td>
<td align="left">JMP x</td>
<td align="left">2 Ops, 2 bytes:</td>
<td align="left">Start executing instructions at index of value M[a] (So given a is zero, and M[0] is 10, we then execute instruction 10) or the literal a-value</td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x0e [x]</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x0f x</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left">JZ x a</td>
<td align="left">4 Ops, 3 bytes:</td>
<td align="left">Start executing instructions at index x if M[a] == 0 (This is a nice short-hand version of )</td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x10 [x] [a]</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x11 [x] a</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x12 x [a]</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x13 x a</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left">JEQ x a b</td>
<td align="left">4 Ops, 4 bytes:</td>
<td align="left">Jump to x or M[x] if M[a] is equal to M[b] or if M[a] is equal to the literal b.</td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x14 [x] [a] [b]</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x15 x [a] [b]</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x16 [x] [a] b</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x17 x [a] b</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left">JLS x a b</td>
<td align="left">4 Ops, 4 bytes:</td>
<td align="left">Jump to x or M[x] if M[a] is less than M[b] or if M[a] is less than the literal b.</td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x18 [x] [a] [b]</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x19 x [a] [b]</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x1a [x] [a] b</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x1b x [a] b</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left">JGT x a b</td>
<td align="left">4 Ops, 4 bytes:</td>
<td align="left">Jump to x or M[x] if M[a] is greater than M[b] or if M[a] is greater than the literal b.</td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x1c [x] [a] [b]</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x1d x [a] [b]</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x1e [x] [a] b</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x1f x [a] b</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left">HALT</td>
<td align="left">1 Op, 1 byte:</td>
<td align="left">Halts the program / freeze flow of execution</td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0xff</td>
<td align="left"></td>
</tr>
<tr>
<td align="left">5. Utilities</td>
<td align="left">APRINT a</td>
<td align="left">4 Ops, 2 byte:</td>
<td align="left">Print the contents of M[a] in either ASCII (if using APRINT) or as decimal (if using DPRINT). Memory ref or literals are supported in both instructions.</td>
</tr>
<tr>
<td align="left"></td>
<td align="left">DPRINT a</td>
<td align="left">0x20 [a] (as ASCII; aprint)</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x21 a (as ASCII)</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x22 [a] (as Decimal; dprint)</td>
<td align="left"></td>
</tr>
<tr>
<td align="left"></td>
<td align="left"></td>
<td align="left">0x23 a (as Decimal)</td>
<td align="left"></td>
</tr>
</tbody></table>
<p><em>Original author: <a href="/u/nint22">/u/nint22</a></em></p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>You will be given the contents of a file of Tiny assembly-language source code. This text file will only contain source-code, and no meta-data or comments. The source code is not case-sensitive, so the instruction "and", "And", and "AND" are all the same.</p>
<h2>Output Description</h2>
<p>Print the resulting op-codes in hexadecimal value. Formatting does not matter, as long as you print the <em>correct</em> hex-code!</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<p><em>The following Tiny assembly-language code will multiply the numbers at memory-location 0 and 1, putting the result at memory-location 0, while using [2] and [3] as working variables. All of this is done at the lowest 4 bytes of memory.</em></p>
<pre><code>Mov [2] 0
Mov [3] 0
Jeq 6 [3] [1]
Add [3] 1
Add [2] [0]
Jmp 2
Mov [0] [2]
Halt
</code></pre>
<h2>Sample Output</h2>
<pre><code>0x08 0x02 0x00
0x08 0x03 0x00
0x15 0x06 0x03 0x01
0x0B 0x03 0x01
0x0A 0x02 0x00
0x0F 0x02
0x07 0x00 0x02
0xFF
</code></pre>
<h1>Challenge Bonus</h1>
<p>If you write an interesting Tiny-language program and successfully run it against your assembler, you'll win a silver medal! If you can formally prove (it won't take much effort) that this language / machine is Turing Complete, you'll win a gold medal!</p>
</div>
