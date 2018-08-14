# A Zero-Sum Game of Threes
<div class="md"><h1>Description</h1>
<p>Let's pursue Monday's <a href="https://www.reddit.com/r/dailyprogrammer/comments/3r7wxz/20151102_challenge_239_easy_a_game_of_threes/">Game of Threes</a> further!</p>
<p>To make it more fun (and make it a 1-player instead of a <a href="https://en.wikipedia.org/wiki/Zero-player_game">0-player</a> game), let's change the rules a bit: <em>You can now add any of [-2, -1, 1, 2] to reach a multiple of 3</em>. This gives you two options at each step, instead of the original single option. </p>
<p>With this modified rule, find a Threes sequence to get to 1, with this extra condition: <em>The sum of all the numbers that were added must equal 0</em>. If there is no possible correct solution, print <code>Impossible</code>.</p>
<h1>Sample Input:</h1>
<pre><code>929
</code></pre>
<h1>Sample Output:</h1>
<pre><code>929 1
310 -1
103 -1
34 2
12 0
4 -1
1
</code></pre>
<p>Since <code>1 - 1 - 1 + 2 - 1 == 0</code>, this is a correct solution. </p>
<h1>Bonus points</h1>
<p>Make your solution work (and run reasonably fast) for numbers up to your operating system's maximum long int value, or its equivalent. For some concrete test cases, try:</p>
<ul>
<li><code>18446744073709551615</code></li>
<li><code>18446744073709551614</code></li>
</ul>
</div>
