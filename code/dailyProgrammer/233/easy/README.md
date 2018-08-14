# The house that ASCII built
<div class="md"><h1>Description</h1>
<p>Christopher has always dreamed of living in a really fancy ASCII house, and he's finally decided to make it happen. He works in a hedgefund and has made a lot of money in the Unicode markets (buying cheap Cyrillic code-points and selling them to Russia), and he feels like he's finally able to afford it. </p>
<p>He hires Melinda the ASCII architect, who designs and delivers the following asterisk blue-print:</p>
<pre><code>   *
  ***
******
</code></pre>
<p>To make this beautiful drawing into reality, he hires Lilly the ASCII contractor to build it. It takes a few months, but finally Lilly delivers this beautiful creation: </p>
<pre><code>              A
             / \
    A     A +---+ A
   / \   / \|   |/ \
  /   \ +---+   +---+ A
 /     \| o         |/ \
+-------+           +---+
|     o      | |      o | 
+-----------------------+ 
</code></pre>
<p>In case it isn't clear: the <code>o</code>'s are windows, the <code>A</code>'s are the tops of the roof, and the <code>| |</code> is a door. Notice that each asterisk has been transformed into a box that is 5 characters wide and 3 characters tall (and notice that two neighboring boxes share an edge). </p>
<p>Today, you are to step into the shoes of Lilly the ASCII contractor! You are to be given an ASCII blueprint of a house, which you will then turn in to glorious reality.</p>
<h1>Formal inputs &amp; outputs</h1>
<h2>Inputs</h2>
<p>On the first line, you will recieve a number telling you how many lines the blueprint will occupy. </p>
<p>After that, you will recieve some number of lines containing the blueprint. Each line is guaranteed to be less than 30 characters long. The only two characters allowed in the lines are spaces and asterisks, and there are a two assumptions you can make regarding the asterisks: </p>
<ul>
<li>The bottom line of asterisks (i.e. the "bottom floor"), will be one continous line of asterisks. </li>
<li>All asterisks on lines except for the bottom line are guaranteed to have an asterisk directly below it. That is, there are no "free hanging" asterisks. So no balconies. </li>
</ul>
<h2>Outputs</h2>
<p>You will draw that the input asterisks describe. </p>
<p>There are four essential features of the ASCII house: </p>
<ul>
<li>The outline: the basic outline of the house. The outline is just the shape you get by replacing the asterisks by 3x5 boxes made of <code>+</code>'s, <code>-</code>'s and <code>|</code>'s. (Edit: to make it more clear what I mean with "outline", <a href="https://www.reddit.com/r/dailyprogrammer/comments/3ltee2/20150921_challenge_233_easy_the_house_that_ascii/cv93tdz">read this comment</a>)</li>
<li>The door: One box has a door on it that looks like <code>| |</code>. The door should be placed in a random box on the ground floor. </li>
<li>The windows: the windows consist of a single <code>o</code> in the middle of the box. If a box doesn't have a door on it, there should be a 50% random chance of having a window on it. </li>
<li><p>The roofs: Each asterisk that has no asterisk above it should have a roof over it. The roof is made of <code>/</code>, <code>\</code> and <code>A</code> characters. If there are two or more boxes next to each other which don't have any boxes above them, they should share a wider roof. In other words, if you have three boxes next to each other without any boxes on top, then this is right: </p>
<pre><code>      A 
     / \ 
    /   \ 
   /     \  
  /       \ 
 /         \ 
+-----------+
|           | 
+-----------+
</code></pre>
<p>And this is wrong:</p>
<pre><code>  A   A   A
 / \ / \ / \
+-----------+
|           | 
+-----------+
</code></pre></li>
</ul>
<p><strong>You are given large leeway in which of these features you choose to implement</strong>. At a minimum, you should make your program draw the outline of the house according to the blueprint, but if you don't want to implement the windows, doors and roofs, that's fine. </p>
<h1>Sample inputs and outputs</h1>
<p>Given that there's a random component in this challenge (where the doors and windows are located), your outputs obviously don't have to match these character-by-charcter. </p>
<h2>Input 1</h2>
<pre><code>3
   *
  ***
******
</code></pre>
<h2>Output 1</h2>
<pre><code>              A
             / \
    A     A +---+ A
   / \   / \|   |/ \
  /   \ +---+   +---+ A
 /     \| o         |/ \
+-------+           +---+
|     o      | |      o | 
+-----------------------+ 
</code></pre>
<h2>Input 2</h2>
<pre><code>7
 *
***
***
***
***
***
***
</code></pre>
<h2>Output 2</h2>
<pre><code>      A
     / \
  A +---+ A
 / \|   |/ \
+---+   +---+
|     o     |
|           |
| o       o |
|           |
|     o   o |
|           |
| o   o     |
|           |
| o       o |
|           |
|    | |    |
+-----------+
</code></pre>
<p>(it's ASCII Empire State Building!)</p>
<h1>Challenge inputs</h1>
<h2>Input 1</h2>
<pre><code>3 
    **
*** **
******
</code></pre>
<h2>Input 2</h2>
<p>(Edit: I just realized that the output for this challenge is a bit too wide to be able to fit in a nicely formatted reddit comment, so feel free to use a service like <a href="http://gist.github.com">gist</a> or <a href="http://hastebin.com">hastebin</a> if you want to show off your results)</p>
<pre><code>7
***                    ***
***     **  ***  **    ***
***   ***************  ***
***   ***************  ***
***   ***************  ***
**************************
**************************
</code></pre>
<h1>Notes</h1>
<p>If you have a suggestion for a problem, head on over to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and suggest them!</p>
</div>
