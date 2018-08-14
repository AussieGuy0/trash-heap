# (Rubik's cube simulator)
<div class="md"><p>Your intermediate task today is to build a simple simulator of a <a href="http://en.wikipedia.org/wiki/Rubik%27s_Cube">Rubik's Cube</a>. The cube should be represented by some sort of structure, which you can give a list of moves which it will execute and show you how the cube will look as a result.</p>
<p>A Rubik's Cube has six sides, which are traditionally known as Up, Down, Front, Back, Left and Right, abbreviated as U, D, F, B, L and R respectively. Color the sides of the cube as follows: Up &lt;- white, Down &lt;- yellow, Front &lt;- green, Back &lt;- blue, Left &lt;- orange and Right &lt;- red. </p>
<p>Taking advantage of the style of <a href="http://www.reddit.com/r/dailyprogrammer/comments/xq2ao/832012_challenge_85_intermediate_3d_cuboid/">problem #85</a>, the basic solved cube should then look something like this:</p>
<pre><code>    W W W /
  W W W / R
W W W / R R
G G G|R R R
G G G|R R
G G G|R
</code></pre>
<p>Here showing the top side, the front side and the right side. </p>
<p>To list moves you can make on a Rubik's Cube, you use something called <a href="http://en.wikipedia.org/wiki/Rubik%27s_Cube#Move_notation">Singmaster's notation</a>, which works like this: to indicate a clockwise turn of any one side, you use the abbreviation of the side. So "R" means to spin the right side clockwise 90 degrees. If there's a prime sympol (i.e. a ' ) after the letter, that means to spin it counter-clockwise 90 degrees. If there's a "2" after the letter, it means you should spin that side 180 degrees. There is an extended notation for advanced moves (such as spinning a middle slice, or spinning two slices), but we'll ignore those for this challenge. </p>
<p>So, for instance, executed the sequence</p>
<pre><code>R U B' R B R2 U' R' F R F'
</code></pre>
<p>on a totally solved cube, it should result in the following configuration:</p>
<pre><code>    O O R /
  B W G / W
R R O / W R
W W G|W R R
G G G|R R
G G G|R
</code></pre>
<p><a href="http://alg.garron.us/?alg=R_U_B-_R_B_R2_U-_R-_F_R_F-">See here for a step by step demonstration</a>.</p>
<p>Make a program that can execute a sequence of moves like these, and then print out what the cube looks like as a result, either in the cuboid form I've used here, or just print out the sides one by one. </p>
<p>What is the result of executing the following series of moves on a solved cube?</p>
<pre><code>F' B L R' U' D F' B
</code></pre>
</div>
