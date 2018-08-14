# Detecting Four Sided Figures
<div class="md"><h1>Description</h1>
<p>I got this idea from the <a href="https://www.mensa.org/workout/questions">Mensa quiz</a>, specifically question 17. It's a basic scanning challenge: can your program detect and count intersecting bounding boxes from an ASCII art input? A four-sided figure is an ASCII art rectangle. Note that it can overlap another one, as long as the four corners are fully connected. </p>
<h1>Formal Inputs &amp; Outputs</h1>
<p>Your program will be given an ASCII art chart showing boxes and lines. <code>-</code> and <code>|</code> characters indicate horizontal and vertical lines, respectively, while "+" characters show intersections.</p>
<p>Your program should emit an integer, <em>N</em>, of how many unique four sided figures it found. Rectangles and squares both count. </p>
<h1>Example Input</h1>
<pre><code>                                +----+
                                |    |
+-------------------------+-----+----+
|                         |     |    |
|     +-------------------+-----+    |
|     |                   |     |    |
|     |                   |     |    |
+-----+-------------------+-----+    |
      |                   |     |    |
      |                   |     |    |
      +-------------------+-----+    |
                          |     |    |
                          |     |    |
                          |     |    |
                          +-----+----+
                                |    |
                                |    |
                                |    |
                                +----+
</code></pre>
<h1>Example Output</h1>
<p>For the above diagram your program should find 25 four sided figures. </p>
<h1>Challenge Input</h1>
<p>This one adds a bit to the complexity by throwing in some three sided figures. This should catch more naive implementations.</p>
<pre><code>              +-----------+
              |           |
              |           |
              |           |
              |           |              
+-------------+-----------+-------------+
|             |           |             |
|             |           |             |
|             |           |             |
|             |           |             |
+-------------+-----------+-------------+
              |           |
              |           |
              |           |
              |           |              
+-------------+-----------+-------------+
|             |           |             |
|             |           |             |
|             |           |             |
|             |           |             |
+-------------+-----------+-------------+
              |           |
              |           |
              |           |
              |           |              
              +-----------+
</code></pre>
<h1>Challenge Output</h1>
<p>For the challenge diagram your program should find 25 four sided figures. </p>
<h1>Finally</h1>
<p>Have a good challenge idea? Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
</div>
