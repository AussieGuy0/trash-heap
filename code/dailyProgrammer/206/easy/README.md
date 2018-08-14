# Recurrence Relations, part 1
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Easy)</em>: Recurrence Relations, part 1</h1>
<p>A recurrence relation is a mathematical construct for defining a series of numbers. It works by first giving an initial term, and then recursively defining the rest of the series as functions of the first one. For example, let's say we have a series of numbers called <strong>u</strong>, which is defined by this recurrence relation:</p>
<pre><code>u[0] = 1
u[n+1] = 2 * u[n]
</code></pre>
<p>The first relation tells us that <em>u</em>(0), the first term in the series, is 1. The second relation says that, given the <em>n</em>-th term <em>u</em>(n), the next term (<em>u</em>(n+1)) is the previous term multiplied by two. So, to get the second term in the series, you multiply the first term by two, to get 2. To get the third term in the series, you multiply the second term by two, to get 4.</p>
<p>Recurrence relations get their name in part due to their <em>recursive</em> nature, as successive terms are essentially defined as recursive application of a function, like this Python example:</p>
<pre><code>def recurrence(n):
    return n * 2

first_term = 1
second_term = recurrence(first_term)
third_term = recurrence(recurrence(first_term))
fourth_term = recurrence(third_term) # or recurrence(recurrence(recurrence(first_term)))
</code></pre>
<p>Or, with the help of another function to apply the <code>recurrence</code> function for us:</p>
<pre><code>def get_nth_term(recurrence_relation, first_term, n):
    if n == 0:
        return first_term
    else:
        return get_nth_term(recurrence_relation, recurrence_relation(first_term), n - 1)

sixteenth_term = get_nth_term(recurrence, first_term, 16) #65536
</code></pre>
<p>You get the idea. Today you will be writing a program to compute the <em>n</em>-th term of a given series defined by a recurrence relation.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>You will first accept a line of input like this one:</p>
<pre><code>*3 +2 *2
</code></pre>
<p>This string means that, to get the next term in the series, you multiply by three, add two, then multiply by two. The operation that takes place is the first character of every space-separated part of the line, and the possible characters are <code>+</code> for add, <code>-</code> for subtract, <code>*</code> for multiply, and <code>/</code> for divide; the number given can be any real number. Next, you will accept the starting value, like so:</p>
<pre><code>0
</code></pre>
<p>Finally, you will accept the term number to print to (where the first term in the series is term <strong>0</strong>):</p>
<pre><code>7
</code></pre>
<p>(this input can be viewed on <a href="http://www.wolframalpha.com/input/?i=%7B+u%280%29%3D0%3B+u%28n%29%3D%28u%28n-1%29*3%2B2%29*2+%7D">Wolfram|Alpha</a>.)</p>
<h2>Output Description</h2>
<p>You are to print all terms in the series, up to the given term number, like so:</p>
<pre><code>Term 0: 0
Term 1: 4
Term 2: 28
Term 3: 172
Term 4: 1036
Term 5: 6220
Term 6: 37324
Term 7: 223948
</code></pre>
<h1>Sample Inputs and Outputs</h1>
<h2>Series 1</h2>
<p>This series starts with 1, and for each successive member of the series, will multiply the last one by two and add one.</p>
<h3>Input</h3>
<pre><code>*2 +1
1
10
</code></pre>
<h3>Output</h3>
<pre><code>Term 0: 1
Term 1: 3
Term 2: 7
Term 3: 15
Term 4: 31
Term 5: 63
Term 6: 127
Term 7: 255
Term 8: 511
Term 9: 1023
Term 10: 2047
</code></pre>
<h2>Series 2</h2>
<p>This one is a bit different. This just multiplies each successive term by <code>-2</code>. Notice how the series oscillates between positive and negative numbers?</p>
<h3>Input</h3>
<pre><code>*-2
1
8
</code></pre>
<h3>Output</h3>
<pre><code>Term 0: 1
Term 1: -2
Term 2: 4
Term 3: -8
Term 4: 16
Term 5: -32
Term 6: 64
Term 7: -128
Term 8: 256
</code></pre>
<h2>Series 3</h2>
<h3>Input</h3>
<pre><code>+2 *3 -5
0
10
</code></pre>
<h3>Output</h3>
<pre><code>Term 0: 0
Term 1: 1
Term 2: 4
Term 3: 13
Term 4: 40
Term 5: 121
Term 6: 364
Term 7: 1093
Term 8: 3280
Term 9: 9841
Term 10: 29524
</code></pre>
<h1>Notes</h1>
<p>More on recurrence relations <a href="http://en.wikipedia.org/wiki/Recurrence_relation">on Wikipedia</a>. Have a cool idea for a challenge? Submit it to <a href="/r/DailyProgrammer_Ideas">/r/DailyProgrammer_Ideas</a>!</p>
</div>
