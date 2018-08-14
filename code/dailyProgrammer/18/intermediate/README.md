<div class="md"><p>Screen scraping involves interacting with the terminal display of a currently running program.  There are commercial screen scraping applications available for mainframe programs that provide a web interface on top of a dumb terminal program.</p>
<p>Write a program that will read the following from a text file to simulate the dumb terminal program.  Each line represents a prompt to the user (always ends with a colon).  Input constraints may be available for prompts.  If they are, then they will always be surrounded in parentheses.  The accepted input values will always be separated by a comma, and the value that is actually counted will be surrounded in square brackets.</p>
<p>Once you've parsed the text file, convert the data into an HTML form output file.  If the prompt did not have any input constraints, then the input type is just a text.  If the prompt contained input constraints and there are less than 5 options, then the input type are radio buttons.  If there are 5 or more possible input values, then the input type is a dropdown.</p>
<p>Example:</p>
<h2>Input File</h2>
<p>Name:</p>
<p>Gender ([M]ale, [F]emale):</p>
<p>Position ([C]ashier, [D]eli Clerk, [M]anager, [P]roduce Clerk, [S]tock Person):</p>
<h2>Output File (HTML)</h2>
<p>&lt;html&gt;</p>
<p>&lt;body&gt;</p>
<p>&lt;form&gt;</p>
<p>Name:</p>
<p>&lt;input type="text" name="name"/&gt;</p>
<p>&lt;br/&gt;</p>
<p>Gender:</p>
<p>&lt;input type="radio" name="gender" value="m"/&gt; Male</p>
<p>&lt;input type="radio" name="gender" value="f"/&gt; Female</p>
<p>&lt;br/&gt;</p>
<p>Position:</p>
<p>&lt;select name="position"&gt;</p>
<p>&lt;option value="c"&gt;Cashier&lt;/option&gt;</p>
<p>&lt;option value="d"&gt;Deli Clerk&lt;/option&gt;</p>
<p>&lt;option value="m"&gt;Manager&lt;/option&gt;</p>
<p>&lt;option value="p"&gt;Produce Clerk&lt;/option&gt;</p>
<p>&lt;option value="s"&gt;Stock Person&lt;/option&gt;</p>
<p>&lt;/select&gt;</p>
<p>&lt;br/&gt;</p>
<p>&lt;input type="submit" value="Submit"/&gt;</p>
<p>&lt;/form&gt;</p>
<p>&lt;/body&gt;</p>
<p>&lt;/html&gt;</p>
</div>
