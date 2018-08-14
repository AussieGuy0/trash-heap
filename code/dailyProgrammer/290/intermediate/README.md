# Blinking LEDs
<div class="md"><h1>Description</h1>
<p>Mark saw someone doing experiments with blinking LEDs (imagine something like <a href="http://www.batsocks.co.uk/readme/XMegaExamples.htm#Sweep">this</a> ) and became fascinated by it.
He wants to know more about it. He knows you are good with computers, so he comes to
you asking if you can teach him how it works. You agree, but as you don't have any
LEDs with you at the moment, you suggest: "Let's build an emulator with which we can
see what's happening inside". And that's today's challenge.</p>
<p><strong>1st Part</strong></p>
<p>The 1st part should be easy, even though the description is rather verbose. If you want
more challenge try the 2nd part afterwards.</p>
<p>Our system has 8 LEDs, we represent their state with a text output. When
all LEDs are off, it is printed as string of eight dots "........". When a led is on,
it is printed as "*". LED-0 is on the right side (least significant bit), LED-7 is on the
left side. Having LEDs 0 and 1 on and all others off is written as "......**"</p>
<p>On input you get a sequence of lines forming a program. Read all lines of the input (detect
EOF, or make the first line contain number of lines that follow, whichever is more convenient
for you). Afterwards, print LED states as they are whenever the program performs an out instruction.</p>
<p>Each line is in the following format:</p>
<pre><code>&lt;line&gt;: &lt;whitespace&gt; &lt;instruction&gt; |
        &lt;empty&gt;

&lt;instruction&gt; : ld a,&lt;num&gt; |
                out (0),a
</code></pre>
<p>&lt;whitespace&gt; is one or more of characters " " or "\t". &lt;num&gt; is a number between 0 and 255.</p>
<p>Instruction ld a,&lt;num&gt; sets internal 8-bit register A to the given number.
Instruction out (0),a updates the LEDs according to the current number in A.
The LED-0's state corresponds to bit 0 of number in A, when that number is represented
in binary. For example, when A = 5, the LED state after out instruction is ".....*.*".</p>
<p>You should output the LED states after each out instruction.</p>
<p>Challenge input 1:</p>
<pre><code>  ld a,14
  out (0),a
  ld a,12
  out (0),a
  ld a,8
  out (0),a

  out (0),a
  ld a,12
  out (0),a
  ld a,14
  out (0),a
</code></pre>
<p>Expected output:</p>
<pre><code>....***.
....**..
....*...
....*...
....**..
....***.
</code></pre>
<p><strong>2nd Part</strong></p>
<p>We will extend our programming language, so that we can do more updates without
writing out instruction for each of them. We will have loops.</p>
<p>Each line has the following format:</p>
<pre><code>&lt;line&gt;: &lt;whitespace&gt; &lt;instruction&gt; |
        &lt;label&gt;                    |
        &lt;empty&gt;

&lt;instruction&gt; : ld a,&lt;num&gt; |
                ld b,&lt;num&gt; |
                out (0),a  |
                rlca       |
                rrca       |
                djnz &lt;labelref&gt;
</code></pre>
<p>&lt;label&gt; is a sequence of characters a-z A-Z _ terminated with one character ":".
&lt;labelref&gt; is a sequence of characters a-z A-Z _ (it corresponds to some label minus
the trailing ":").</p>
<p>Instruction ld b,&lt;num&gt; sets a number to register B. Instruction rlca rotates bits in
register A one position to the left, in circle (i.e. bit 0 goes to bit 1, bit 1 to bit 2,
and bit 7 to bit 0). Instruction rrca rotates bits in register A one position to the
right, in circle.
Instruction djnz &lt;labelref&gt; (decrement and jump if not zero)
subtracts one from the value of register B and if the new value of register B is not
zero then the processing of instructions continues at the line containg label
corresponding to the &lt;labelref&gt;. You can assume that in the input text &lt;label&gt; is always
given before the corresponding &lt;labelref&gt; (i.e. jumps go backwards).</p>
<p>You should output the LED states after each out instruction.</p>
<p>Challenge Input 2:</p>
<pre><code>  ld b,3

triple:
  ld a,126
  out (0),a
  ld a,60
  out (0),a
  ld a,24
  out (0),a
  djnz triple
</code></pre>
<p>Challenge Output 2:</p>
<pre><code>.******.
..****..
...**...
.******.
..****..
...**...
.******.
..****..
...**...
</code></pre>
<p>Challenge Input 3:</p>
<pre><code>  ld a,1
  ld b,9

loop:
  out (0),a
  rlca
  djnz loop
</code></pre>
<p>Challenge Output 3:</p>
<pre><code>.......*
......*.
.....*..
....*...
...*....
..*.....
.*......
*.......
.......*
</code></pre>
<p>Challenge Input 4:</p>
<pre><code>  ld a,2
  ld b,9

loop:
  out (0),a
  rrca
  djnz loop
</code></pre>
<p>Challenge Output 4:</p>
<pre><code>......*.
.......*
*.......
.*......
..*.....
...*....
....*...
.....*..
......*.
</code></pre>
<h1>Credit</h1>
<p>This challenge was suggested by <a href="/u/lukz">/u/lukz</a> in <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a>, many thanks! If you have a challenge idea please share it and there's a good chance we'll use it. </p>
</div>
