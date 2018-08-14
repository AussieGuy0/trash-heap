# Mayan Long Count
<div class="md"><h1><a href="#IntermediateIcon"></a> <em>(Intermediate)</em>: Mayan Long Count</h1>
<p>The <a href="http://en.wikipedia.org/wiki/Maya_calendar#Long_Count">Mayan Long Count</a> calendar is a counting of days with these units: "* The Maya name for a day was k'in. Twenty of these k'ins are known as a winal or uinal. Eighteen winals make one tun. Twenty tuns are known as a k'atun. Twenty k'atuns make a b'ak'tun.*". Essentially, we have this pattern:</p>
<ul>
<li><p>1 <strong>kin</strong> = 1 day</p></li>
<li><p>1 <strong>uinal</strong> = 20 kin</p></li>
<li><p>1 <strong>tun</strong> = 18 uinal</p></li>
<li><p>1 <strong>katun</strong> = 20 tun</p></li>
<li><p>1 <strong>baktun</strong> = 20 katun</p></li>
</ul>
<p>The long count date format follows the number of each type, from longest-to-shortest time measurement, separated by dots. As an example, '12.17.16.7.5' means 12 baktun, 17 katun, 16 tun, 7 uinal, and 5 kin. This is also the date that corresponds to January 1st, 1970. Another example would be December 21st, 2012: '13.0.0.0.0'. This date is completely valid, though shown here as an example of a "roll-over" date.</p>
<p>Write a function that accepts a year, month, and day and returns the Mayan Long Count corresponding to that date. You must remember to take into account leap-year logic, but only have to convert dates after the 1st of January, 1970.</p>
<p><em>Author: skeeto</em></p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>Through standard console, expect an integer N, then a new-line, followed by N lines which have three integers each: a day, month, and year. These integers are guaranteed to be valid days and either on or after the 1st of Jan. 1970.</p>
<h2>Output Description</h2>
<p>For each given line, output a new line in the long-form Mayan calendar format: &lt;Baktun&gt;.&lt;Katun&gt;.&lt;Tun&gt;.&lt;Uinal&gt;.&lt;Kin&gt;.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<pre><code>3
1 1 1970
20 7 1988
12 12 2012
</code></pre>
<h2>Sample Output</h2>
<pre><code>12.17.16.7.5
12.18.15.4.0
12.19.19.17.11
</code></pre>
<h1>Challenge Input</h1>
<p>None needed</p>
<h2>Challenge Input Solution</h2>
<p>None needed</p>
<h1>Note</h1>
<ul>
<li><p>Bonus 1: Do it without using your language's calendar/date utility. (i.e. handle the leap-year calculation yourself).</p></li>
<li><p>Bonus 2: Write the inverse function: convert back from a Mayan Long Count date. Use it to compute the corresponding date for <code>14.0.0.0.0</code>.</p></li>
</ul>
</div>
