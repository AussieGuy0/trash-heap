# Pile of Paper
<div class="md"><h1>Description</h1>
<p>Have you ever layered colored sticky notes in interesting patterns in
order to make pictures? You can create surprisingly complex pictures
you can make out of square/rectangular pieces of paper. An interesting
question about these pictures, though, is: what area of each color is
actually showing? We will simulate this situation and answer that
question.</p>
<p>Start with a sheet of the base color 0 (colors are represented by
single integers) of some specified size. Let's suppose we have a sheet
of size 20x10, of color 0. This will serve as our "canvas", and first
input:</p>
<pre><code>20 10
</code></pre>
<p>We then place other colored sheets on top of it by specifying their
color (as an integer), the (x, y) coordinates of their top left
corner, and their width/height measurements. For simplicity's sake,
all sheets are oriented in the same orthogonal manner (none of them
are tilted). Some example input:</p>
<pre><code>1 5 5 10 3
2 0 0 7 7 
</code></pre>
<p>This is interpreted as:</p>
<ul>
<li>Sheet of color <code>1</code> with top left corner at <code>(5, 5)</code>, with a width of <code>10</code> and height of <code>3</code>.</li>
<li>Sheet of color <code>2</code> with top left corner at <code>(0,0)</code>, with a width of
<code>7</code> and height of <code>7</code>.</li>
</ul>
<p>Note that multiple sheets <em>may</em> have the same color. Color is not
unique per sheet.</p>
<p>Placing the first sheet would result in a canvas that looks like this:</p>
<pre><code>00000000000000000000
00000000000000000000
00000000000000000000
00000000000000000000
00000000000000000000
00000111111111100000
00000111111111100000
00000111111111100000
00000000000000000000
00000000000000000000
</code></pre>
<p>Layering the second one on top would look like this:</p>
<pre><code>22222220000000000000
22222220000000000000
22222220000000000000
22222220000000000000
22222220000000000000
22222221111111100000
22222221111111100000
00000111111111100000
00000000000000000000
00000000000000000000
</code></pre>
<p>This is the end of the input. The output should answer a single
question: <em>What area of each color is visible after all the sheets
have been layered, in order?</em> It should be formatted as an
one-per-line list of colors mapped to their visible areas. In our
example, this would be:</p>
<pre><code>0 125
1 26
2 49
</code></pre>
<hr/>
<h1>Sample Input:</h1>
<pre><code>20 10
1 5 5 10 3
2 0 0 7 7
</code></pre>
<h1>Sample Output:</h1>
<pre><code>0 125
1 26
2 49
</code></pre>
<h1>Challenge Input</h1>
<p>Redditor <a href="/u/Blackshell">/u/Blackshell</a> has a bunch of inputs of varying sizes from 100 up to 10000 rectangles up here, with solutions: <a href="https://github.com/fsufitch/dailyprogrammer/tree/master/ideas/pile_of_paper">https://github.com/fsufitch/dailyprogrammer/tree/master/ideas/pile_of_paper</a> </p>
<h1>Credit</h1>
<p>This challenge was created by user <a href="/u/Blackshell">/u/Blackshell</a>. If you have an idea for a challenge, please submit it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and there's a good chance we'll use it!</p>
</div>
