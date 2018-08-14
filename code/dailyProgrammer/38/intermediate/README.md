<div class="md"><p><a href="http://en.wikipedia.org/wiki/Reverse_Polish_notation">Reverse Polish Notation</a>(RPN) is a mathematical notation where every operator follows all of its operands. For instance, to add three and four, one would write "3 4 +" rather than "3 + 4". If there are multiple operations, the operator is given immediately after its second operand; so the expression written "3 − 4 + 5" would be written "3 4 − 5 +" first subtract 4 from 3, then add 5 to that.</p>
<p>Transform the algebraic expression with brackets into RPN form.</p>
<p>You can assume that for the test cases below only single letters will be used, brackets [ ] will not be used and each expression has only one RPN form (no expressions like a<em>b</em>c)</p>
<p>Test Input:</p>
<p>(a+(b*c))</p>
<p>((a+b)*(z+x))</p>
<p>((a+t)*((b+(a+c)) ^ (c+d)))</p>
<p>Test Output:</p>
<p>abc*+</p>
<p>ab+zx+*</p>
<p>at+bac++cd+ ^ *</p>
</div>
