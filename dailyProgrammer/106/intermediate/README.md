# (Jugs)
<div class="md"><p>There exists a problem for which you must get exactly 4 gallons of liquid, using only a 3 gallon jug and a 5 gallon jug. You must fill, empty, and/or transfer liquid from either of the jugs to acquire exactly 4 gallons. </p>
<p>The solution to this particular problem is the following:</p>
<ul>
<li><p>Fill the 5 gallon jug</p></li>
<li><p>Transfer from the 5 gallon jug to the 3 gallon jug, leaving 2 gallons in the 5 gallon jug and 3 gallons in the 3 gallon jug</p></li>
<li><p>Empty the 3 gallon jug</p></li>
<li><p>Transfer from the 5 gallon jug to the 3 gallon jug, leaving 0 gallons in the 5 gallon jug and 2 gallons in the 3 gallon jug</p></li>
<li><p>Fill the 5 gallon jug</p></li>
<li><p>Transfer from the 5 gallon jug to the 3 gallon jug, leaving 4 gallons in the 5 gallon jug and 3 gallons in the 3 gallon jug</p></li>
<li><p>Empty the 3 gallon jug (optional)</p></li>
</ul>
<p>The challenge will be to output a set of instructions to achieve an arbitrary final volume given 2 arbitrary sized gallon jugs. Jugs should be sized in a whole number (integer) amount of gallons. The program must also determine if the desired volume is impossible with this method (i.e. 2 - 4 gallon jugs to make 3 gallons). The program should be deterministic, meaning that running with the same inputs always produces the same solution (preventing a random pouring algorithm). The program should also consider outputting the most optimal set of instructions, but is not necessary.</p>
</div>
