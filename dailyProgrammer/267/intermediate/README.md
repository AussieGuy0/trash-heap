# Vive la résistance!
<div class="md"><h2>Description</h2>
<p>It's midnight. You're tired after a night of partying (or gaming, or whatever 
else you like to do when procrastinating), and are about ready to go to sleep
when you remember: you have a whole load of homework for your Electronics 101
course. The topic is resistance, and calculating the total resistance of various
circuits. </p>
<p>Someone who is not you might do something sensible, like sighing and getting the
work done, or even going to sleep and letting it go. But you are a <em>programmer</em>!
Obviously, the only thing to do here is to write a program to do your homework
for you!</p>
<p>Today's challenge is to write a program that calculates the resistance between
two points in a circuit. For the necessary background maths, check the bottom
of the problem.</p>
<h2>Formal Input</h2>
<p>The input consists of two parts. First, a line that lists a series of IDs for
circuit "nodes". These are strings of uppercase characters. The first and last
node are to be the start and end point of the circuit. </p>
<p>Next, there will be some number of lines that identify two nodes and specify the resistance between
them (in Ohms, for simplicity). This will be a positive number.</p>
<p><strong>Sample input:</strong></p>
<pre><code>A B C
A B 10
A B 30
B C 50
</code></pre>
<p>The above input can be interpreted as the circuit:</p>
<pre><code>     +--(10)--+
     |        |
[A]--+        +--[B]--(50)--[C]
     |        |
     +--(30)--+
</code></pre>
<blockquote>
<p>Note: resistance is bi-directional. <code>A B 10</code> means the same thing as <code>B A 10</code>.</p>
</blockquote>
<h2>Formal Output</h2>
<p>The output consists of a single number: the resistance between the first and
 last node, in Ohms. Round to the 3rd decimal place, if necessary.</p>
<p><strong>Sample output:</strong></p>
<pre><code>57.5
</code></pre>
<p><strong>Explanation:</strong> The theory is explained in the last section of this problem,
but the calculation to achieve <code>57.5</code> is:</p>
<pre><code>1 / (1/10 + 1/30) + 50
</code></pre>
<h2>Challenge 1</h2>
<p><strong>Input:</strong></p>
<pre><code>A B C D E F
A C 5
A B 10
D A 5
D E 10
C E 10
E F 15
B F 20
</code></pre>
<p><strong>Output:</strong></p>
<pre><code>12.857
</code></pre>
<h2>Challenge 2</h2>
<p>This is a 20x20 grid of 10,000 Ohm resistors. As the input is too large to paste
here, you can find it here instead: <a href="https://github.com/fsufitch/dailyprogrammer/raw/master/ideas/resistance/challenge.txt">https://github.com/fsufitch/dailyprogrammer/raw/master/ideas/resistance/challenge.txt</a></p>
<p><strong>Edit:</strong> As this challenge introduces some cases that weren't present in previous cases, yet are non-trivial to solve, you could consider this smaller, similar problem instead:</p>
<h2>Challenge 2(a)</h2>
<pre><code>A B C D
A B 10
A C 10
B D 10
C D 10
B C 10
</code></pre>
<h2>Maths Background</h2>
<p>Circuit resistance is calculated in two ways depending on the circuit's
structure. That is, whether the circuit is serial or parallel. Here's what that
means:</p>
<p><strong>Serial circuit.</strong> This is a circuit in which everything is in a row. There is
no branching. It might look something like this:</p>
<pre><code>[A]--(x)--[B]--(y)--[C]
</code></pre>
<p>In the case of a serial circuit, resistances are simply added. Since resistance
measures the "effort" electricity has to overcome to get from one place to
another, it makes sense that successive obstacles would sum up their difficulty.
In the above example, the resistance between A and C would simply be <code>x + y</code>.</p>
<p><strong>Parallel circuit.</strong> This is an instance where there are multiple paths from
one node to the next. We only need two nodes to demonstrate this, so let's show
a case with three routes:</p>
<pre><code>     +--(x)--+
     |       |
[A]--+--(y)--+--[B]
     |       |
     +--(z)--+
</code></pre>
<p>When there are multiple routes for electricity to take, the overall resistance
goes down. However, it does so in a funny way: the total resistance is the
inverse of the sum of the inverses of the involved resistances. Stated 
differently, you must take all the component resistances, invert them (divide 1
by them), add them, then invert that sum. That means the resistance for the
above example is:</p>
<pre><code>1 / (1/x + 1/y + 1/z)
</code></pre>
<p><strong>Putting them together.</strong></p>
<p>When solving a more complex circuit, you can use the two calculations from above
to simplify the circuit in steps. Take the circuit in the sample input:</p>
<pre><code>     +--(10)--+
     |        |
[A]--+        +--[B]--(50)--[C]
     |        |
     +--(30)--+
</code></pre>
<p>There is a parallel circuit between A and B, which means we can apply the second
calculation. <code>1 / (1/10 + 1/30) = 7.5</code>, so we simplify the problem to:</p>
<pre><code>[A]--(7.5)--[B]--(50)--[C]
</code></pre>
<p>This is now a serial circuit, which means we can simplify it with the first
rule. <code>7.5 + 50 = 57.5</code>, so:</p>
<pre><code>[A]--(57.5)--[C]
</code></pre>
<p>This leaves us with 57.5 as the answer to the problem.</p>
<p><strong>Edit:</strong> This should have maybe been a [Hard] problem in retrospect, so here's a hint: <a href="https://rosettacode.org/wiki/Resistor_mesh">https://rosettacode.org/wiki/Resistor_mesh</a></p>
<h2>Finally...</h2>
<p>Have your own <del>boring homework</del> fascinating challenge to suggest? Drop by 
<a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and post it!</p>
</div>
