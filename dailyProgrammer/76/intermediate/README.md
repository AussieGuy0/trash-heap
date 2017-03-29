# (Probability graph)
<div class="md"><p>Write a function <code>graph(f, low, high, tests)</code> that outputs a probability graph of the function <code>f</code> from range <code>low</code> to <code>high</code> (inclusive) over <code>tests</code> tests (i.e., counting the frequencies of <code>f()</code> outputs). <code>f</code> takes no arguments and returns an integer, <code>low</code>, <code>high</code> and <code>tests</code> are all integer values. For example, a function <code>f</code> that simulates two-dice rolls:</p>
<pre><code>def two_dice():
    return random.randint(1, 6) + random.randint(1, 6)
</code></pre>
<p>Then <code>graph(f, 2, 12, 10000)</code> should output something roughly like:</p>
<pre><code>  2: ##
  3: #####
  4: #######
  5: ###########
  6: #############
  7: #################
  8: #############
  9: ###########
 10: ########
 11: #####
 12: ##
</code></pre>
<p>For bonus points, output the graph with the numbers on the bottom and the bars drawn vertically.</p>
</div>
