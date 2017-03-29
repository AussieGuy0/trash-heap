# Box Plot Generator
<div class="md"><h1><a href="#IntermediateIcon"></a> <strong>(Intermediate)</strong>: Box Plot Generator</h1>
<p>A <a href="http://en.wikipedia.org/wiki/Box_plot">box plot</a> is a convenient way of representing a set of univariate (one-variable) numerical data, while showing some useful statistical info about it at the same time. To understand what a box plot represents you need to learn about quartiles.</p>
<h2>Quartiles</h2>
<p>Quartiles show us some info on the distribution of data in a data set. For example, here's a made-up data set representing the number of lines of code in 30 files of a software project, arranged into order.</p>
<pre><code>7 12 21 28 28 29 30 32 34 35 35 36 38 39 40 40 42 44 45 46 47 49 50 53 55 56 59 63 77 191
</code></pre>
<p>The three quartiles can be found at the quarter intervals of a data set. For this example, the number of data items is 30, so the lower quartile (<strong>Q1</strong>) is item number (<code>30/4=8</code> - round up) which the value is <code>32</code>. The median quartile (<strong>Q2</strong>) is item number (<code>2*30/4=15</code>) which the value is <code>40</code>. The upper quartile (<strong>Q3</strong>) is item number (<code>3*30/4=23</code> - round up) which the value is <code>50</code>. The bit between <strong>Q1</strong> and <strong>Q3</strong> is called the <strong>inter quartile range</strong> or <strong>IQR</strong>. To demonstrate the fact that this splits the data set into 'quarters' the quartiles here are displayed.</p>
<pre><code>7 12 21 28 28 29 30 32 34 35 35 36 38 39 40 40 42 44 45 46 47 49 50 53 55 56 59 63 80 191
                    ||                   ||                      ||
--- 1st quarter ----Q1--- 2nd quarter ---Q2---- 3rd quarter -----Q3--- 4th quarter -----
                     \           inter quartile range            /
</code></pre>
<p>The value of the <strong>IQR</strong> here is <code>50-32=18</code> (ie. <strong>Q3</strong>-<strong>Q1</strong>.) This forms the 'box' part of the box plot, with the line in the moddle of it representing the median <strong>Q2</strong> point. The 'whiskers' of the box plot are also fairly easy to work out. They represent the rest of the data set that isn't an <strong>outlier</strong> (anomalous). For example, here the 191-line-long file is an anomaly among the rest, and the 7-ling-long file might be too. How do we say for sure what is an anomaly and what isn't? If the data point is at the lower end of the data set, you work out if the value is less than 1.5 times the inter-quartile range from <strong>Q1</strong> - ie. if <code>x &lt; Q1 - 1.5 * IQR</code>. If the data point is at the higher end of the data set, you work out of the value is more than 1.5 times the inter-quartile range from <strong>Q3</strong> - ie. if <code>x &gt; Q3 + 1.5 * IQR</code>. Here, for 7, <code>Q1 - 1.5 * IQR</code> is <code>32 - 27 = 5</code>, and <code>7 &gt; 5</code>, so 7 is not an outlier. But for 191, <code>Q3 + 1.5 * IQR</code> is <code>50 + 27 = 77</code>, and both 90 and 191 are greater than 77, so they are outliers. The end of the 'whiskers' on the box plot (the endmost bits) are the first and last values that <em>aren't</em> outliers - any outlying points are represented as crosses <code>x</code> outside of the plot.</p>
<p>Note: in reality, a better method than rounding up the quartile indices is usually used.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>The program is to accept any number of numerical values, separated by whitespace.</p>
<h2>Output Description</h2>
<p>You are to output the box plot for the input data set. You have some freedom as to how you draw the box plot - you could dynamically generate an image, for example, or draw it ASCII style.</p>
<h1>Sample Inputs and Outputs</h1>
<h2>Sample Input</h2>
<p>The example above: <code>7 12 21 28 28 29 30 32 34 35 35 36 38 39 40 40 42 44 45 46 47 49 50 53 55 56 59 63 80 191</code></p>
<p>Unique traffic data for this sub:</p>
<pre><code>2095 2180 1049 1224 1350 1567 1477 1598 1462  972 1198 1847
2318 1460 1847 1600  932 1021 1441 1533 1344 1943 1617  978
1251 1157 1454 1446 2182 1707 1105 1129 1222 1869 1430 1529
1497 1041 1118 1340 1448 1300 1483 1488 1177 1262 1404 1514
1495 2121 1619 1081  962 2319 1891 1169
</code></pre>
<h1>Sample Output</h1>
<p>Sample output from my solution here: <a href="http://i.imgur.com/RIfoQ54.png">http://i.imgur.com/RIfoQ54.png</a> (fixed now, sorry.)</p>
<h1>Extension (intermediate)</h1>
<p>What about if you wish to compare two data sets? Allow your program to accept two or more data-sets, plotting the box plots such that they can be compared visually.</p>
</div>
