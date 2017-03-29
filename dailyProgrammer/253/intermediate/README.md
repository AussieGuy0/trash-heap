# Countdown (numbers game)
<div class="md"><p>Countdown is a British ripoff of a French TV show where given 6 starting numbers, the 4 basic arithmetic operators are used to manipulate the given 6 numbers to arrive at a given total.</p>
<p><a href="http://datagenetics.com/blog/august32014/index.html">Full rules and ideas here</a></p>
<h1>It's just the first count down (tedudu do)</h1>
<p>A simplified ruleset is to test for solutions that don't require parentheses on one side of an operator, and no operator precedence.  All of the problems here have such an exact solution.</p>
<p><strong>sample input</strong><br/>
 50  8  3  7  2  10 makes 556</p>
<p><strong>sample output</strong><br/>
((((50 - 7) × 3) + 10) × 8) ÷ 2<br/>
= 556</p>
<p><strong>challenge input</strong><br/>
 25 50 75 100 3 6 makes 952</p>
<p>(You may also simplify the solution by assuming - and ÷ are only applied in one direction/order)</p>
<h1>Must shout a second count down</h1>
<p>RPN notation and a mini stack language can permit parenthesized group operations without using parentheses</p>
<p>1 5 100 5 - × 9 - 10 + +<br/>
= 477</p>
<p>equivalent to:  1+(((5×(100-5))-9)+10)</p>
<p><strong>challenge:</strong>  Allow for parenthesized grouped operations or RPN formatted expressions in determining solution.</p>
<h1>Its the final count down</h1>
<p>Use either program 1 or 2 to test which target totals from 0 to 1000 cannot be obtained by combining the 4 basic operators, or alternatively, find the lower target total that fails for the <strong>input</strong>:</p>
<p>25 50 75 100 3 6</p>
</div>
