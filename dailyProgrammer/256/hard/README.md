# RLE Obsession
<div class="md"><p>run length encoding is a simple and magical data compression technique that I would like to use as a database.  But we will just be experimenting with querying and updating ranges of rle data without "decompressing" the rle data.</p>
<h1>1. eazy: run length indexes</h1>
<p>run length indexes (RLI) is an array representation of binary data (list of booleans) as a list of indexes (numbers that are not booleans).</p>
<ol>
<li>the last element is the size of the boolean list</li>
<li>the first element is the boolean data index of the first 1 </li>
<li>every other element is an index where the data changes from 0 or 1 to its opposite.</li>
</ol>
<p>An rli list of <code>1000</code> represents 1000 0s.<br/>
An rli list of <code>0 1000</code> represents 1000 1s.<br/>
An rli list of <code>2 3 7 10</code> represents <code>0 0 1 0 0 0 0 1 1 1</code>. </p>
<p>RLI is more of an in memory representation rather than a storage format, but can be computed efficiently from this <strong>packed RLE format</strong></p>
<ol>
<li>first element is number of leading consecutive <code>0s</code></li>
<li>next element is number of following <code>1s</code> minus 1 (there has to be at least one)</li>
<li>next element is number of following <code>0s</code> minus 1 (there has to be at least one)</li>
<li>repeat step 2.</li>
</ol>
<p><strong>challenge</strong><br/>
create an RLI function, and optionally a packed RLE function</p>
<p><strong>input</strong>  (one per line)<br/>
0 0 1 0 0 0 0 1 1 1<br/>
0 0 0 0 0 0 0 0 1 0 1 1 1 0 1 1 1 1 0 1 1 0 1 0 1 0 1 1 1 1 1 1<br/>
1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 0 0 1</p>
<p><strong>alternate input: bitsize, number</strong><br/>
10 135<br/>
32 12311231<br/>
32 2147483713</p>
<p><strong>Packed RLE output</strong><br/>
2 0 3 2<br/>
8 0 0 2 0 3 0 1 0 0 0 0 0 5<br/>
0 0 23 0 4 0</p>
<p><strong>RLI output</strong><br/>
2 3 7 10<br/>
8 9 10 13 14 18 19 21 22 23 24 25 26 32<br/>
0 1 25 26 31 32</p>
<h1>2. [Med] range query on RLI data</h1>
<p>for 32bit binary 2147483713 the (0 based) indexes from 23 to 30 are: <code>0 0 1 0 0 0 0 0</code></p>
<p>Can you query the RLI data directly to obtain binary substrings?</p>
<p><strong>input</strong> format is:  start_index, length, RLI data<br/>
0 9 2 3 7 10<br/>
5 14 8 9 10 13 14 18 19 21 22 23 24 25 26 32<br/>
23 4 0 1 25 26 31 32</p>
<p><strong>output</strong><br/>
2 3 7 9<br/>
3 4 5 8 9 13 14<br/>
2 3 4</p>
<h1>3. [Hard] overwrite RLI data with RLI data at an offset</h1>
<p>to overwrite the string <code>1 1 1</code> starting at index <code>3</code> overinto <code>0 0 1 0 0 0 0 1 1 1</code> results in the output string <code>0 0 1 1 1 1 0 1 1 1</code></p>
<p>The same problem with RLI data is to overwrite the RLI string <code>0 3</code> starting at index <code>3</code> overinto <code>2 3 7 10</code> results in <code>2 6 7 10</code></p>
<p><strong>input</strong> format: start_index, RLI_newdata &gt; RLI_intodata<br/>
3 0 3 &gt; 2 3 7 10<br/>
3 1 3 &gt; 2 3 7 10<br/>
3 1 3 &gt; 10<br/>
3 1 3 &gt; 0 10<br/>
3 0 3 7 10 12 15 &gt; 8 9 10 13 14 18 19 21 22 23 24 25 26 32</p>
<p><strong>output</strong><br/>
2 6 7 10<br/>
2 3 4 6 7 10<br/>
4 6 10<br/>
0 3 4 10<br/>
3 6 10 13 15 18 19 21 22 23 24 25 26 32</p>
<h1>Note: CHEATING!!!!</h1>
<p>For Medium and Hard part, it is cheating to convert RLI to bitstrings, query/overwrite and then convert back to RLI.  These functions are meant to be run on sparse bitstrings, trillions of bits long, but with short RLI sequences.</p>
<h1>bonus</h1>
<p>these functions can be used to solve the "Playing with light switches" recent challenge here: <a href="https://www.reddit.com/r/dailyprogrammer/comments/46zm8m/20160222_challenge_255_easy_playing_with_light/">https://www.reddit.com/r/dailyprogrammer/comments/46zm8m/20160222_challenge_255_easy_playing_with_light/</a></p>
<p>though there is also a shortcut to negate a range of bit values in RLI format (hint: add or remove a single index)</p>
</div>
