# The Data Collator from Jamaica
<div class="md"><h1><a href="/IntermediateIcon"></a> <strong>(Intermediate)</strong>: The Data Collator from Jamaica</h1>
<p>Often, when given a set of data where one variable is associated with another, we want to find a general rule equating the two variables, with which you can find the closest appropriate match of one to the other.</p>
<p>Say, for example, we have performed an experiment determining the acceleration undergone by an object when subject to a force. <a href="https://en.wikipedia.org/wiki/Newton%27s_laws_of_motion#Newton.27s_second_law">Newton's 2<sup>nd</sup> Law of Motion</a> dictates that <em>F=ma</em> - linking the variables <code>F</code> (force) and <code>a</code> (acceleration) by a constant <code>m</code> (mass of the object). If we performed the acceleration we may get the following values:</p>
<table><thead>
<tr>
<th align="right">F (N)</th>
<th align="right">a (m s<sup>-2</sup>)</th>
</tr>
</thead><tbody>
<tr>
<td align="right">0.2</td>
<td align="right">0.32</td>
</tr>
<tr>
<td align="right">0.4</td>
<td align="right">0.62</td>
</tr>
<tr>
<td align="right">0.6</td>
<td align="right">0.97</td>
</tr>
<tr>
<td align="right">0.8</td>
<td align="right">1.22</td>
</tr>
<tr>
<td align="right">1</td>
<td align="right">1.58</td>
</tr>
<tr>
<td align="right">1.2</td>
<td align="right">1.84</td>
</tr>
<tr>
<td align="right">1.4</td>
<td align="right">2.17</td>
</tr>
<tr>
<td align="right">1.6</td>
<td align="right">2.47</td>
</tr>
<tr>
<td align="right">1.8</td>
<td align="right">2.83</td>
</tr>
<tr>
<td align="right">2</td>
<td align="right">3.16</td>
</tr>
</tbody></table>
<p><a href="http://i.imgur.com/PdlTl6W.png">This data can be plotted to see the link between the 2 data sets. Here, <code>F</code> is on the horizontal and <code>a</code> is on the vertical axis.</a></p>
<p>To create a line of best-fit or <strong>trend line</strong> for this data, <a href="http://i.imgur.com/W2aFGIx.png">which looks like this</a>, a number of methods can be used, such as the ever-present <a href="https://en.wikipedia.org/wiki/Least_squares">least squares</a> method. For the purposes of this challenge, the trend line will <em>always</em> be linear, and thus the two data sets must be </p>
<p>Your challenge is, given 2 data sets, draw the values on an appropriately-scaled graph (with axes) and find a suitable trend line fitting the data.</p>
<h1>Input and Output Description</h1>
<h2>Input</h2>
<p>The first line of input will be in the format:</p>
<pre><code>&lt;X&gt;:&lt;graph title&gt;:&lt;X label&gt;:&lt;Y label&gt;
</code></pre>
<ul>
<li><strong>X</strong>: The size of the data sets.</li>
<li><strong>graph title</strong>: The title to be displayed at the top of the graph.</li>
<li><strong>X label</strong>: The label to be displayed on the x-axis.</li>
<li><strong>Y label</strong>: The label to be displayed on the y-axis.</li>
</ul>
<p>Following that will be precisely <strong>N</strong> further lines of input, in the format:</p>
<pre><code>X:Y
</code></pre>
<p>Where X is the value to be plotted on the X-axis, and Y is the value to be plotted on the Y-axis.</p>
<h1>Output</h1>
<p>The output is to be in the form of an image:</p>
<ul>
<li>The scale of the axes should be big enough to show every data point on the image, but not too big such that the points are all crammed together.</li>
<li>The data points are to be plotted onto a graph.</li>
<li>A linear trend line, fitting the given data, is to be plotted.</li>
</ul>
<h1>Sample Input</h1>
<p>I've created a data set for you to plot yourself.</p>
<pre><code>20:Graph of I over V through a resistor:Voltage (V):Current (mA)
0.000:0.000
0.198:0.387
0.400:0.781
0.600:1.172
0.802:1.566
1.003:1.962
1.200:2.349
1.402:2.735
1.597:3.122
1.798:3.505
2.002:3.918
2.202:4.314
2.399:4.681
2.603:5.074
2.800:5.485
2.997:5.864
3.198:6.256
3.400:6.631
3.597:7.017
3.801:7.435
</code></pre>
<h1>Tips</h1>
<p>Here are some tips to make the most of this <a href="/r/DailyProgrammer">/r/DailyProgrammer</a> challenge.</p>
<ul>
<li><p>Try and think of an algorithm or method to find the best-fit line yourself. There are plenty of ways out there, but as a member of <a href="/r/DailyProgrammer">/r/DailyProgrammer</a> try and do it from scratch!</p></li>
<li><p>Half of the challenge here is drawing the graph yourself. For that reason it's best to pick a language here that supports graphical output. Using a premade graphing library defeats the point of this challenge so try and DIY.</p></li>
</ul>
</div>
