# You can't handle the truth!
<div class="md"><p><strong>Description:</strong></p>
<p><a href="http://en.wikipedia.org/wiki/Truth_table">Truth Tables</a> are a simple table that demonstrates all possible results given a Boolean algebra function. An example Boolean algebra function would be "A or B", where there are four possible combinations, one of which is "A:false, B:false, Result: false"</p>
<p>Your goal is to write a Boolean algebra function truth-table generator for statements that are up to 4 variables (always A, B, C, or D) and for only the following operators: <a href="http://en.wikipedia.org/wiki/Logical_NOT">not</a>, <a href="http://en.wikipedia.org/wiki/Logical_AND">and</a>, <a href="http://en.wikipedia.org/wiki/Logical_OR">or</a>, <a href="http://en.wikipedia.org/wiki/Logical_NAND">nand</a>, and <a href="http://en.wikipedia.org/wiki/Logical_NOR">nor</a>.</p>
<p>Note that you must maintain order of operator correctness, though evaluate left-to-right if there are ambiguous statements.</p>
<p><strong>Formal Inputs &amp; Outputs:</strong></p>
<p><em>Input Description:</em></p>
<p>String BoolFunction - A string of one or more variables (always A, B, C, or D) and keyboards (not, and, or, nand, nor). This string is guaranteed to be valid</p>
<p><em>Output Description:</em></p>
<p>Your application must print all possible combinations of states for all variables, with the last variable being "Result", which should the correct result if the given variables were set to the given values. An example row would be "A:false, B:false, Result: false"</p>
<p><strong>Sample Inputs &amp; Outputs:</strong></p>
<p>Given "A and B", your program should print the following:</p>
<p>A:false, B:false, Result: false
A:true, B:false, Result: false
A:false, B:true, Result: false
A:true, B:true, Result: true</p>
<p><strong>Notes:</strong></p>
<p>To help with cycling through all boolean combinations, realize that when counting from 0 to 3 in binary, you generate a table of all combinations of 2 variables (00, 01, 10, 11). You can extrapolate this out to itterating through all table rows for a given variable count. <a href="http://www.reddit.com/r/dailyprogrammer/comments/11shtj/10202012_challenge_105_intermediate_boolean_logic/">Challenge #105</a> has a very similar premise to this challenge.</p>
</div>
