<div class="md"><p>The objective of this exercise is to maintain a list of Strings in memory that support undo and redo.  Write a program that allows the user to add, edit, delete, <strong>undo</strong>, and <strong>redo</strong> entries in a list.  You must be able to undo and redo everything you've done during the execution of this program.  After each command is run, always print out the list (unless you're doing this in a UI).  Before writing any code, first think about how to write add, edit, and remove with undo and redo in mind.  If there are no submissions to this post, I'll reply with some hints.</p>
<p>Sample Run:</p>
<p>Enter command ('A'dd, 'E'dit, 'D'elete, 'U'ndo, 'R'edo): A</p>
<p>Enter text to add:  Venus</p>
<p>Venus</p>
<p>Enter command ('A'dd, 'E'dit, 'D'elete, 'U'ndo, 'R'edo): A</p>
<p>Enter text to add:  Mars</p>
<p>Venus</p>
<p>Mars</p>
<p>Enter command ('A'dd, 'E'dit, 'D'elete, 'U'ndo, 'R'edo): U</p>
<p>Venus</p>
<p>Enter command ('A'dd, 'E'dit, 'D'elete, 'U'ndo, 'R'edo): U</p>
<p>Enter command ('A'dd, 'E'dit, 'D'elete, 'U'ndo, 'R'edo): R</p>
<p>Venus</p>
<p>Enter command ('A'dd, 'E'dit, 'D'elete, 'U'ndo, 'R'edo): R</p>
<p>Venus</p>
<p>Mars</p>
<p>Enter command ('A'dd, 'E'dit, 'D'elete, 'U'ndo, 'R'edo): A</p>
<p>Enter text to add:  Saturn</p>
<p>Venus</p>
<p>Mars</p>
<p>Saturn</p>
<p>Enter command ('A'dd, 'E'dit, 'D'elete, 'U'ndo, 'R'edo): E</p>
<p>Enter index to edit:  1</p>
<p>Enter text to edit:  Earth</p>
<p>Venus</p>
<p>Earth</p>
<p>Saturn</p>
<p>Enter command ('A'dd, 'E'dit, 'D'elete, 'U'ndo, 'R'edo): U</p>
<p>Venus</p>
<p>Mars</p>
<p>Saturn</p>
<p>Enter command ('A'dd, 'E'dit, 'D'elete, 'U'ndo, 'R'edo): R</p>
<p>Venus</p>
<p>Earth</p>
<p>Saturn</p>
<p>Enter command ('A'dd, 'E'dit, 'D'elete, 'U'ndo, 'R'edo): D</p>
<p>Enter index to delete:  2</p>
<p>Venus</p>
<p>Earth</p>
<p>Enter command ('A'dd, 'E'dit, 'D'elete, 'U'ndo, 'R'edo): U</p>
<p>Venus</p>
<p>Earth</p>
<p>Saturn</p>
<p>Enter command ('A'dd, 'E'dit, 'D'elete, 'U'ndo, 'R'edo): R</p>
<p>Venus</p>
<p>Earth</p>
</div>
