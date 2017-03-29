# Jenny's Fruit Basket
<div class="md"><h1>Description</h1>
<p>Little Jenny has been sent to the market with a 5 dollar bill in hand, to buy
fruits for a gift basket for the new neighbors. Since she's a diligent and
literal-minded kid, she intends to spend <em>exactly</em> 5 dollars - not one cent more
or less.</p>
<p>The fact that the market sells fruits per piece at non-round prices, does not
make this easy - but Jenny is prepared. She takes out a Netbook from her
backpack, types in the unit prices of some of the fruits she sees, and fires
off a program from her collection - and voil\u00e0, the possible fruit combinations for a $5 purchase appear on the screen.</p>
<p><strong>Challenge:</strong> Show what Jenny's program might look like in the
programming language of your choice.</p>
<ul>
<li>The goal is aways 500 cents (= $5).</li>
<li>Solutions can include multiple fruits of the same type - assume they're available in unlimited quantities.</li>
<li>Solutions do <em>not</em> need to include all available types of fruit.</li>
<li>Determine all possible solutions for the given input.</li>
</ul>
<h1>Input Description</h1>
<p>One line per available type of fruit - each stating the fruit's <strong>name</strong> <em>(a word without
spaces)</em> and the fruit's <strong>unit price</strong> in cents <em>(an integer)</em>.</p>
<h1>Output Description</h1>
<p>One line per solution - each a comma-separated set of <strong>quantity</strong>+<strong>name</strong>
pairs, describing how many fruits of which type to buy.</p>
<p>Do not list fruits with a quantity of zero in the output. Inflect the names for plural (adding an <code>s</code> is sufficient).</p>
<h1>Sample Input</h1>
<pre><code>banana 32
kiwi 41
mango 97
papaya 254
pineapple 399
</code></pre>
<h1>Sample Output</h1>
<pre><code>6 kiwis, 1 papaya
7 bananas, 2 kiwis, 2 mangos
</code></pre>
<h1>Challenge Input</h1>
<pre><code>apple 59
banana 32
coconut 155
grapefruit 128
jackfruit 1100
kiwi 41
lemon 70
mango 97
orange 73
papaya 254
pear 37
pineapple 399
watermelon 500
</code></pre>
<p>Note: For this input there are <a href="http://pastebin.com/raw.php?i=7S7pnUyL">180 solutions</a>.</p>
<h1>Credit</h1>
<p>This challenge was submitted by <a href="/u/smls">/u/smls</a>. If you have a challenge idea, please share it on <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and there's a chance we'll use it!</p>
</div>
