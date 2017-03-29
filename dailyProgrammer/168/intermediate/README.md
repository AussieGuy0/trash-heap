# Block Count, Length & Area
<div class="md"><h1>Description:</h1>
<p>In construction there comes a need to compute the length and area of a jobsite. The areas and lengths computed are used by estimators
to price out the cost to build that jobsite. If for example a jobsite was a building with a parking lot and had concrete walkways and some nice
pavers and landscaping it would be good to know the areas of all these and some lengths (for concrete curbs, landscape headerboard, etc)</p>
<p>So for today's challenge we are going to automate the tedious process of calculating the length and area of aerial plans or photos.</p>
<h1>ASCII Photo:</h1>
<p>To keep this within our scope we have converted the plans into an ASCII picture. We have scaled the plans so 1 character is a square 
with dimensions of 10 ft x 10 ft.</p>
<p>The photo is case sensitive. so a "O" and "o" are 2 different blocks of areas to compute.</p>
<h1>Blocks Counts, Lengths and Areas:</h1>
<p>Some shorthand to follow:</p>
<ul>
<li>SF = square feet</li>
<li>LF = linear feet</li>
</ul>
<p>If you have the following picture.</p>
<pre><code>####
OOOO
####
mmmm
</code></pre>
<ul>
<li># has a block count of 2. we have 2 areas not joined made up of #</li>
<li>O and m have a block count of 1. they only have 1 areas each made up of their ASCII character.</li>
<li>O has 4 blocks. Each block is 100 SF and so you have 400 SF of O.</li>
<li>O has a circumference length of that 1 block count of 100 LF.</li>
<li>m also has 4 blocks so there is 400 SF of m and circumference length of 100 LF</li>
<li># has 2 block counts each of 4. So # has a total area of 800 SF and a total circumference length of 200 LF.</li>
</ul>
<p>Pay close attention to how "#" was handled. It was seen as being 2 areas made up of # but the final length and area adds them together even thou they not together. It recognizes the two areas by having a block count of 2 (2 non-joined areas made up of "#" characters) while the others only have a block count of 1.</p>
<h1>Input:</h1>
<p>Your input is a 2-D ASCII picture. The ASCII characters used are any non-whitespace characters.</p>
<h2>Example:</h2>
<pre><code>####
@@oo
o*@!
****
</code></pre>
<h1>Output:</h1>
<p>You give a Length and Area report of all the blocks.</p>
<h2>Example: (using the example input)</h2>
<pre><code>Block Count, Length &amp; Area Report
=================================

#: Total SF (400), Total Circumference LF (100) - Found 1 block
@: Total SF (300), Total Circumference LF (100) - Found 2 blocks
o: Total SF (300), Total Circumference LF (100) - Found 2 blocks
*: Total SF (500), Total Circumference LF (120) - Found 1 block
!: Total SF (100), Total Circumference LF (40) - Found 1 block
</code></pre>
<h1>Easy Mode (optional):</h1>
<p>Remove the need to compute the block count. Just focus on area and circumference length.</p>
<h1>Challenge Input:</h1>
<p>So we have a "B" building. It has a "D" driveway. "O" and "o" landscaping. "c" concrete walks. "p" pavers. "V" &amp; "v" valley gutters. @ and T tree planting. 
Finally we have # as Asphalt Paving.</p>
<pre><code>ooooooooooooooooooooooDDDDDooooooooooooooooooooooooooooo
ooooooooooooooooooooooDDDDDooooooooooooooooooooooooooooo
ooo##################o#####o#########################ooo
o@o##################o#####o#########################ooo
ooo##################o#####o#########################oTo
o@o##################################################ooo
ooo##################################################oTo
o@o############ccccccccccccccccccccccc###############ooo
pppppppppppppppcOOOOOOOOOOOOOOOOOOOOOc###############oTo
o@o############cOBBBBBBBBBBBBBBBBBBBOc###############ooo
ooo####V#######cOBBBBBBBBBBBBBBBBBBBOc###############oTo
o@o####V#######cOBBBBBBBBBBBBBBBBBBBOc###############ooo
ooo####V#######cOBBBBBBBBBBBBBBBBBBBOcpppppppppppppppppp
o@o####V#######cOBBBBBBBBBBBBBBBBBBBOc###############ooo
ooo####V#######cOBBBBBBBBBBBBBBBBBBBOc######v########oTo
o@o####V#######cOBBBBBBBBBBBBBBBBBBBOc######v########ooo
ooo####V#######cOOOOOOOOOOOOOOOOOOOOOc######v########oTo
o@o####V#######ccccccccccccccccccccccc######v########ooo
ooo####V#######ppppppppppppppppppppppp######v########oTo
o@o############ppppppppppppppppppppppp###############ooo
oooooooooooooooooooooooooooooooooooooooooooooooooooooooo
oooooooooooooooooooooooooooooooooooooooooooooooooooooooo
</code></pre>
<h1>FAQ:</h1>
<p>Diagonals do not connect. The small example shows this. The @ areas are 2 blocks and not 1 because of the Diagonal.</p>
</div>
