# String-type checking
<div class="md"><p><strong>Description:</strong></p>
<p>You and a few co-workers are implementing a cool new technology called "blue-steel" (not to be confused with this <a href="http://www.youtube.com/watch?v=D519hT7-ytY">awesome feat of technology</a>). Part of this technology, specifically the part assigned to you, is to check what "type" a given string of information is. Blue-steel currently must distinguish between a signed integer, signed float, a date, and a text-string.</p>
<p>Your goal is to write a function which, given a string of text, will echo out what "type" the string is. The string could be a signed integer (a series of digits with either a + or - at the front, though the + is optional), a signed float (a series of digits with either a + or - at the front, though the + is optional, and a . to distinguish the left and right hand digits), a date (which will be in the format of "day-month-year"), and finally a string of text (any other data). The given string will always be just one type at a time.</p>
<p><strong>Formal Inputs &amp; Outputs:</strong></p>
<p><em>Input Description:</em></p>
<p>String TypeString - A string to test what type it is.</p>
<p><em>Output Description:</em></p>
<p>You must print either "int", "float", "date", or "text" after identifying what string type this is.</p>
<p><strong>Sample Inputs &amp; Outputs:</strong></p>
<p>"123" should print "int", so should "+123", "-123", "0", etc. "123.456" should print "float", while "20-11-2012" should print "date", and finally "Hello, World!" should print "text". Again, you are not expected to handle a multi-type string such as "Hello 123".</p>
</div>
