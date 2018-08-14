# Tree Generation
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Easy)</em>: Tree Generation</h1>
<p>Your goal is to draw a tree given the base-width of the tree (the number of characters on the bottom-most row of the triangle section). This "tree" must be drawn through <a href="http://en.wikipedia.org/wiki/ASCII_art">ASCII art-style graphics</a> on standard console output. It will consist of a 1x3 trunk on the bottom, and a triangle shape on the top. The tree must be centered, with the leaves growing from a base of N-characters, up to a top-layer of 1 character. Each layer reduces by 2 character, so the bottom might be 7, while shrinks to 5, 3, and 1 on top layers. See example output.</p>
<p><em><a href="http://www.reddit.com/r/dailyprogrammer_ideas/comments/1srsde/easy_build_a_christmas_treemenorah_with/">Originally submitted by u/Onkel_Wackelflugel</a></em></p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>You will be given one line of text on standard-console input: an integer and two characters, all space-delimited. The integer, N, will range inclusively from 3 to 21 and <em>always</em> be odd. The next character will be your trunk character. The next character will be your leaves character. Draw the trunk and leaves components with these characters, respectively.</p>
<h2>Output Description</h2>
<p>Given the three input arguments, draw a centered-tree. It should follow this pattern: (this is the smallest tree possible, with a base of 3)</p>
<pre><code>   *
  ***
  ###
</code></pre>
<p>Here's a much larger tree, of base 7:</p>
<pre><code>   *
  ***
 *****
*******
  ###
</code></pre>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input 1</h2>
<pre><code>3 # *
</code></pre>
<h2>Sample Output 1</h2>
<pre><code>   *
  ***
  ###
</code></pre>
<h2>Sample Input 2</h2>
<pre><code>13 = +
</code></pre>
<h2>Sample Output 2</h2>
<pre><code>      +
     +++
    +++++
   +++++++
  +++++++++
 +++++++++++
+++++++++++++
     ===
</code></pre>
<h1>Challenge++</h1>
<p>Draw something special! Experiment with your creativity and engineering, try to render this tree in whatever cool way you can think of. <a href="http://www.youtube.com/watch?v=QMYfkOtYYlg#t=15">Here's an example</a> of how far you can push a simple console for rendering neat graphics!</p>
</div>
