# Date Localization
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Easy)</em>: Date Localization</h1>
<p>Localization of software is the process of adapting code to handle special properties of a given language or a region's standardization of date / time formats.</p>
<p>As an example, in the United States it is common to write down a date first with the month, then day, then year. In France, it is common to write down the day and <em>then</em> month, then year.</p>
<p>Your goal is to write a function that takes a given string that defines how dates and times should be ordered, and then print off the current date-time in that format.</p>
<p><em>Author: nint22</em></p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>Your function must accept a string "Format". This string can have any set of characters or text, but you must explicitly replace certain special-characters with their equivalent date-time element. Those special characters, and what they map to, are as follows:</p>
<p>"%l": Milliseconds (000 to 999)
"%s": Seconds (00 to 59)
"%m": Minutes (00 to 59)
"%h": Hours (in 1 to 12 format)
"%H": Hours (in 0 to 23 format)
"%c": AM / PM (regardless of hour-format)
"%d": Day (1 up to 31)
"%M": Month (1 to 12)
"%y": Year (four-digit format)</p>
<h2>Output Description</h2>
<p>The output must be the given string, but with the appropriate date-time special-characters replaced with the current date-time of your system. All other characters should be left untouched.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<pre><code>"%s.%l"
"%s:%m:%h %M/%d/%y"
"The minute is %m! The hour is %h."
</code></pre>
<h2>Sample Output</h2>
<pre><code>"32.429"
"32:6:9 07/9/2013"
"The minute is 32! The hour is 6."
</code></pre>
<h1>Challenge Input</h1>
<p><em>None needed</em></p>
<h2>Challenge Input Solution</h2>
<p><em>None needed</em></p>
<h1>Note</h1>
<p>There are several standards for this kind of functionality in many software packages. ISO has a well documented standard that follows similar rules, which this exercise is based on.</p>
</div>
