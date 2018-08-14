# IDDQD
<div class="md"><h2>Description</h2>
<p>You are trapped in a room full of evil zombies. Some people might resign
themselves to their doom in this situation, but not you. You're a badass space
marine! No, not the kind with <a href="http://vignette1.wikia.nocookie.net/warhammer40k/images/1/13/Ultramarines_Artificer_Armour2.jpg">big armor</a>;
the kind with a <a href="http://vignette2.wikia.nocookie.net/doom/images/d/d6/BFG9000-HellRevealed-map04.png">BFG-9000</a>!</p>
<p>Unfortunately though, this Big F'in Gun only has one shot remaining, so you have
to make it count. The BFG will blow away anything it hits, of course, but it
will also destroy anything it grazes. The zombies in the room are slow, so you
have ample time to position yourself for the perfect shot. How many zombies can
you take out at once?</p>
<p>For the sake of simplicity, the room is represented by a flat 2D grid. The BFG
can be fired from any empty spot in any direction along a row, column, or
diagonal of the grid. Any zombie that it meets in its path gets destroyed, and stops
the BFG beam. Additionally, any zombie that is adjacent (horizontally, vertically
or diagonally) to the beam is also destroyed.</p>
<h2>Formal input</h2>
<p>The first line of input will be two numbers denoting the size (height, width) of the
two-dimensional room. The remaining lines will contain the coordinates at which
there is a zombie. These coordinates are zero-indexed.</p>
<p><strong>Sample input:</strong></p>
<pre><code>6 10
2 4
4 6
5 5
0 0
0 6
</code></pre>
<p>This corresponds to the following map:</p>
<pre><code>X.....X...
..........
....X.....
..........
......X...
.....X....
</code></pre>
<h2>Formal output</h2>
<p>The output is a single number: the maximum number of zombies you can blast with
one single shot of the BFG.</p>
<p><strong>Sample output:</strong></p>
<pre><code>4
</code></pre>
<p>Because there are many possible ways to achieve the maximum, an actual output of
what the shot <em>is</em> is not necessary. You might want to do it for debug purposes,
but in big rooms it is fairly meaningless.</p>
<p><strong>Sample explanation:</strong> One way to achieve the 4-zombie blast is:</p>
<pre><code>X....#X...
.....#....
....X#....
.....#....
.....#X...
.....X....
</code></pre>
<p>Another one is:</p>
<pre><code>X#....X...
..#.......
...#X.....
....#.....
.....#X...
.....X#...
</code></pre>
<p>As might be evident, "your" position doesn't matter. All that matters is the
line that the BFG beam draws, and the things adjacent to it.</p>
<h2>Challenge input #1</h2>
<pre><code>20 20
11 16
5 19
12 5
8 9
0 10
17 16
14 9
10 8
19 7
17 11
6 10
0 4
10 9
11 13
19 6
17 10
8 11
6 0
18 17
2 10
12 11
4 2
1 0
2 17
10 5
8 3
13 14
10 14
4 3
5 2
</code></pre>
<h2>Challenge input #2</h2>
<p><strong>Edit:</strong> I am adding this challenge input after the fact to give the problem an optimization angle too. This is a 10,000,000 by 10,000,000 grid with 500,000 zombies on it. Have fun! The 4.5 MB download is here: <a href="https://github.com/fsufitch/dailyprogrammer/raw/master/ideas/iddqd/huge.txt">https://github.com/fsufitch/dailyprogrammer/raw/master/ideas/iddqd/huge.txt</a></p>
<h2>Bonus points</h2>
<p>Modify the challenge to feature walls or other non-zombie obstacles.</p>
<h2>Finally...</h2>
<p>Have your own challenge idea that is totally not a reference to a recently
released video game? Come by <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and share it!</p>
</div>
