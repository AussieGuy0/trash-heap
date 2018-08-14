# Guarding the Coast
<div class="md"><h1>Description</h1>
<p>Imagine you're in charge of the coast guard for your island nation, but you're on a budget. You have to minimize how many boats, helicopters and crew members to adequately cover the coast. Each group is responsible for a square area of coastline. </p>
<p>It turns out this has a mathematical relationship to some interesting mathematics. In fractal geometry, the <a href="https://en.wikipedia.org/wiki/Minkowski%E2%80%93Bouligand_dimension">Minkowski–Bouligand Dimension</a>, or box counting dimension, is a means of counting the fractal geometry of a set <em>S</em> in Euclidian space R<sup>n.</sup> Less abstractly, imagine the set <em>S</em> laid out in an evenly space grid. The box counting dimension would be the minimum number of square tiles required to cover the set.</p>
<p>More realistically, when doing this counting you'll wind up with some partial tiles and have to overlap, and that's OK - overlapping boxes are fine, gaps in coastal coverage are not. What you want to do is to minimize the number of tiles overall. It's easy over estimate, it's another to minimize. </p>
<h1>Input Description</h1>
<p>You'll be given two things: a tile size N representing the side of the square, and an ASCII art map showing you the coastline to cover. </p>
<p>Example:</p>
<pre><code>2

*****
*   *
*   *
*   *
*****
</code></pre>
<h1>Output Description</h1>
<p>Your program should emit the minimum number of tiles of that size needed to cover the boundary. </p>
<p>From the above example:</p>
<pre><code>8
</code></pre>
<h1>Challenge Input</h1>
<pre><code>4

                     **
                   *   **
                  *     *
                 **      *
                *        *
               **         *
              *            *
             *            *
              **        **
                *      *
              **        ***
             *             *
            *               *
          **                *
         *                   **
        **                     *
      **                        *
     *                        **
      *                     **
       *                 ***
        **              *
       *                 *
     **                   **
    *                 ****
     **         ******           
       *********   
</code></pre>
</div>
