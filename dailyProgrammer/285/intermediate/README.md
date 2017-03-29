# Cross Platform/Language Data Encoding part 2
<div class="md"><p>The goal of this challenge is to encode and decode records in a compact and/or efficient self contained manner.  Because the more I type, the more confusing the challenge is interpreted, I will avoid discussing process as much as I can.</p>
<h1>1. fixed length records: birthdays</h1>
<p>Database systems prefer tables of fixed length records because it is easy and fast to retrieve any single record that way.</p>
<p>A customer birthday is:</p>
<ul>
<li>A tuple of Year, Month, Day</li>
<li>The year is in the past, and can be assumed to not be earlier than 1900</li>
</ul>
<p>So the year, month, day can be stored as 1 byte each, and this arrangement makes it easiest to search on year or other components.  (the year can be coded as the offset to 1900)</p>
<p><strong>challenge</strong> (encode following dates)</p>
<p>1944/11/22<br/>
1982/3/14<br/>
1986/2/11  </p>
<h1>2. add a header to the file</h1>
<p>Database management software needs to know what is in the file.  Create a strategy to describe what is in the file, such that it can be read and written to.</p>
<p>Information to include in the header:</p>
<ul>
<li>Fixed vs variable sized records (above is fixed)</li>
<li>code to unpack into native format</li>
<li>code to pack from native into file format</li>
<li>method to tell where header ends and data begins.</li>
</ul>
<p>TIP: An easy way to provide language agnostic packing code is to provide a minimum and maximum allowed range to integer (or float for that matter) data.</p>
<h1>3. variable length fields/records</h1>
<p>A subject touched upon in Monday's part 1 challenge, was that there are 2 general strategies to coding the field length of variable length data with the data.  There are in fact 3 strategies:</p>
<ol>
<li>interleave length with data elements.  Disadvantage is that file must be read sequentially to retrieve any element.</li>
<li>place a key of lengths or (easily derived) offsets to data starts as a header element to the data.  Relatively fast specific data access.  More memory used.  2 updates needed when record/field changed.</li>
<li>Use a seperator, non-legal-data-value.  Still sequential read disadvantage, but a faster sequential read.  Requires that a non-legal-data value or escape sequence exists.</li>
</ol>
<p>FYI, most database (and in memory) systems allocate variable string data by using a "too big" text field and left aligning data within the larger space.  Provides quickest indexed access and in place updates. </p>
<p><strong>challenge for 3 fields:  FirstName LastName DateOfBirth</strong>:</p>
<p>Bill Gates 1947/1/14<br/>
Mark Zuckerberg 1987/11/4<br/>
Steve Jobs 1955/3/7</p>
<p>Where firstname and lastname are variable length fields.  Can use whatever strategy you wish, but include a header that self describes how to unpack the data into native memory.</p>
<h1>4. Multiple variable file</h1>
<p>Variation to number 3 (and may do one or the other), instead of encoding a table as a single variable, encode the data as 3 variables which are each lists of 3 items.  This is known as an inverted table or column-oriented database.</p>
<p>The 3 variables correspond to FirstName, LastName, DateofBirth</p>
</div>
