# Unique Digits
<div class="md"><h1>Description:</h1>
<p>An interesting problem to solve:</p>
<p>Looking at the Base 10 number system it has the digits 0 1 2 3 4 5 6 7 8 9 </p>
<p>If I were given the digits 5 7 and 9 how many unique numbers could be formed that
would use all these digits once?</p>
<p>For example some easy ones would be:</p>
<p>579
975
795</p>
<p>And so on. but also these would work as well.</p>
<p>111579
1120759</p>
<p>These could go on forever as you just add digits. There would be many numbers just padding numbers to the unique numbers.</p>
<p>Some might think that these next three might be valid but they are not because they do not contain all 3 digits:</p>
<p>57
75
95</p>
<p>So to cap off the range let us say numbers that do not go beyond 7 digits (so 7 places in your numbers)</p>
<p>I am also interested in other base number systems. Like how many unique numbers using 5 6 could I find in base 8 (octal) or A E 0 1 in a base 16 (hexidecimal) ?</p>
<p>Your challenge is to be able to take 2 sets of inputs and find out how many unique digits up to 7 places can be found given those 2 inputs.</p>
<h1>Input:</h1>
<p>&lt;Base system&gt; &lt;digits&gt;</p>
<ul>
<li>Base system is a base counting system. This number can be between 2 to 16.</li>
<li>Digits will be a list of digits that are ALL shown only once in the number</li>
</ul>
<h1>Output:</h1>
<p>All the unique numbers given up to 7 digits long only using the digits given once. followed by their base 10 value. At the bottom of the listing a "count" of how many numbers you found.</p>
<p>So say I was looking for base 2 and my unique digits were 1 I would see this:</p>
<pre><code>1 - 1
10 - 2
100 - 4
1000 - 8
10000 - 16
100000 - 32
1000000 - 64
Count: 7
</code></pre>
<h1>challenge inputs:</h1>
<p>These are several pairings to run. For the sake of size do not list your outputs - Maybe just the "counts" you found. 
If you wish to share the outputs use like a gist or link the output for people to go look at. </p>
<pre><code>2 1
8 3 5 6
10 1 3 9
16 A E 1 0
</code></pre>
<h1>challenge input to try:</h1>
<p>For all base systems 2 to 16 find the numbers 0 1 in them.</p>
<h1>challenge difficulty</h1>
<p>This is an unknown. Not sure if easy, intermediate or hard. Regardless lets give it a try. Could be very easy. Could be very hard. </p>
</div>
