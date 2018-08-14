# Friendly Date Ranges
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Easy)</em>: Friendly Date Ranges</h1>
<p>The goal of this challenge is to implement a way of converting two dates into a more friendly date range that could be presented to a user. It must not show any redundant information in the date range. For example, if the year and month are the same in the start and end dates, then only the day range should be displayed. Secondly, if the starting year is the current year, and the ending year can be inferred by the reader, the year should be omitted also (see below for examples).</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>The input will be two dates in the <code>YYYY-MM-DD</code> format, such as:</p>
<ol>
<li><code>2015-07-01 2015-07-04</code></li>
<li><code>2015-12-01 2016-02-03</code></li>
<li><code>2015-12-01 2017-02-03</code></li>
<li><code>2016-03-01 2016-05-05</code></li>
<li><code>2017-01-01 2017-01-01</code></li>
<li><code>2022-09-05 2023-09-04</code></li>
</ol>
<h2>Output Description</h2>
<p>The program must turn this into a human readable date in the <code>Month Day, Year</code> format (omitting the year where possible). These outputs correspond to the above inputs:</p>
<ol>
<li><code>July 1st - 4th</code></li>
<li><code>December 1st - February 3rd</code></li>
<li><code>December 1st, 2015 - February 3rd, 2017</code></li>
<li><code>March 1st - May 5th, 2016</code></li>
<li><code>January 1st, 2017</code></li>
<li><code>September 5th, 2022 - September 4th, 2023</code></li>
</ol>
<h2>Edge Case 1</h2>
<p>If the starting year is the current year, <strong>but the ending year isn't</strong> and <strong>the dates are at least a year apart</strong>, then specify the year in both. For example, this input:</p>
<pre><code>2015-04-01 2020-09-10
</code></pre>
<p>Must not omit the 2015, so it should output <code>April 1st, 2015 - September 10th, 2020</code>, and <strong>NOT</strong> <code>April 1st - September 10th, 2020</code>, which would otherwise be ambiguous.</p>
<p>Of course if the dates are less than a year apart, as in the case of <code>2015-12-01 2016-02-03</code>, then you can safely omit the years (<code>December 1st - February 3rd</code>), as that makes it clear that it's the February next year.</p>
<h2>Edge Case 2</h2>
<p>Similarly, if the starting year is the current year, <strong>but the two dates are exactly one year apart</strong>, also specify the year in both. For example, this input:</p>
<pre><code>2015-12-11 2016-12-11
</code></pre>
<p>Must specify both years, i.e. <code>December 11th, 2015 - December 11th, 2016</code>.</p>
<h1>Bonus (Intermediate)</h1>
<p>Of course, not all users will want to read a <code>Month Day, Year</code> format. To fix this, allow your program to receive hints on how to format the dates, by accepting a date format as a third parameter, for example:</p>
<ol>
<li><code>2015-07-01 2015-07-04 DMY</code></li>
<li><code>2016-03-01 2016-05-05 YDM</code></li>
<li><code>2022-09-05 2023-09-04 YMD</code></li>
</ol>
<p>would produce:</p>
<ol>
<li><code>1st - 4th July</code></li>
<li><code>2016, 1st March - 5th May</code></li>
<li><code>2022, September 5th - 2023, September 4th</code></li>
</ol>
<p>You only need to handle date format strings <code>DMY</code>, <code>MDY</code>, <code>YMD</code> and <code>YDM</code>.</p>
<h1>Special Thanks</h1>
<p>Special thanks to <a href="/u/pogotc">/u/pogotc</a> for creating this challenge in <a href="/r/DailyProgrammer_Ideas">/r/DailyProgrammer_Ideas</a>! If you have your own idea for a challenge, submit it there, and there's a good chance we'll post it.</p>
</div>
