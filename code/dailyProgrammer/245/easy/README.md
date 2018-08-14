# Date Dilemma
<div class="md"><h1>Description</h1>
<p>Yesterday, Devon the developer made an awesome webform, which the sales team would use to record the results from today's big new marketing campaign, but now he realised he forgot to add a validator to the "delivery_date" field! He proceeds to open the generated spreadsheet but, as he expected, the dates are all but normalized... Some of them use <code>M D Y</code> and others <code>Y M D</code>, and even arbitrary separators are used! Can you help him parse all the messy text into properly ISO 8601
(<code>YYYY-MM-DD</code>) formatted dates before beer o'clock?</p>
<p>Assume only dates starting with 4 digits use <code>Y M D</code>, and others use <code>M D Y</code>.</p>
<h1>Sample Input</h1>
<pre><code>2/13/15
1-31-10
5 10 2015
2012 3 17
2001-01-01
2008/01/07
</code></pre>
<h1>Sample Output</h1>
<pre><code>2015-02-13
2010-01-31
2015-05-10
2012-03-17
2001-01-01
2008-01-07
</code></pre>
<h1>Extension challenge [Intermediate]</h1>
<p>Devon's nemesis, Sally, is by far the best salesperson in the team, but her writing is also the most idiosyncratic! Can you parse all of her dates? Guidelines:</p>
<ul>
<li>Use <code>2014-12-24</code> as the base for relative dates.</li>
<li>When adding <strong>days</strong>, account for the different number of days in each month; ignore leap years.</li>
<li>When adding <strong>months</strong> and <strong>years</strong>, use whole units, so that:

<ul>
<li>one month before october 10 is september 10</li>
<li>one year after 2001-04-02 is 2002-04-02</li>
<li>one month after january 30 is february 28 (not march 1)</li>
</ul></li>
</ul>
<p><strong>Sally's inputs</strong>:</p>
<pre><code>tomorrow
2010-dec-7
OCT 23
1 week ago
next Monday
last sunDAY
1 year ago
1 month ago
last week
LAST MONTH
10 October 2010
an year ago
2 years from tomoRRow
1 month from 2016-01-31
4 DAYS FROM today
9 weeks from yesterday
</code></pre>
<p><strong>Sally's expected outputs</strong>:</p>
<pre><code>2014-12-25
2010-12-01
2014-10-23
2014-12-17
2014-12-29
2014-12-21
2013-12-24
2014-11-24
2014-12-15
2014-11-24
2010-10-10
2013-12-24
2016-12-25
2016-02-28
2014-12-28
2015-02-25
</code></pre>
<h1>Notes and Further Reading</h1>
<ul>
<li><a href="https://en.wikipedia.org/wiki/ISO_8601">https://en.wikipedia.org/wiki/ISO_8601</a></li>
<li><a href="http://php.net/manual/en/function.strtotime.php">http://php.net/manual/en/function.strtotime.php</a></li>
<li><a href="https://xkcd.com/1179/">https://xkcd.com/1179/</a></li>
<li><em>Moderator note:</em> If you would like to solve the general case to absolutely work on all possible input dates, check out this video first: <a href="https://www.youtube.com/watch?v=-5wpm-gesOY">https://www.youtube.com/watch?v=-5wpm-gesOY</a></li>
</ul>
<p>PS: Using <code>&lt;?php echo strftime('%Y-%m-%d', strtotime($s));</code> is cheating! :^)</p>
<hr/>
<p>This challenge is here thanks to <a href="/u/alfred300p">/u/alfred300p</a> proposing it in <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a>.</p>
<p>Do you a good challenge idea? Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a>!</p>
</div>
