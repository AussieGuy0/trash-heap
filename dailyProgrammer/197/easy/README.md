# ISBN Validator
<div class="md"><h1>Description</h1>
<p>ISBN's (International Standard Book Numbers) are identifiers for books. Given the correct sequence of digits, one book can be identified out of millions of others thanks to this ISBN. But when is an ISBN not just a random slurry of digits? That's for you to find out.</p>
<h1>Rules</h1>
<p>Given the following constraints of the ISBN number, you should write a function that can return True if a number is a valid ISBN and False otherwise.</p>
<p>An ISBN is a ten digit code which identifies a book. The first nine digits represent the book and the last digit is used to make sure the ISBN is correct.</p>
<p>To verify an ISBN you :-</p>
<ul>
<li>obtain the sum of 10 times the first digit, 9 times the second digit, 8 times the third digit... all the way till you add 1 times the last digit. If the sum leaves no remainder when divided by 11 the code is a valid ISBN.</li>
</ul>
<p>For example :</p>
<p>0-7475-3269-9 is Valid because </p>
<p>(10 * 0) + (9 * 7) + (8 * 4) + (7 * 7) + (6 * 5) + (5 * 3) + (4 * 2) + (3 * 6) + (2 * 9) + (1 * 9) = 242 which can be divided by 11 and have no remainder. </p>
<p>For the cases where the last digit has to equal to ten, the last digit is written as X. For example 156881111X.</p>
<h1>Bonus</h1>
<p>Write an ISBN generator. That is, a programme that will output a valid ISBN number (bonus if you output an ISBN that is already in use :P )</p>
<h1>Finally</h1>
<p>Thanks to <a href="/u/TopLOL">/u/TopLOL</a> for the submission!</p>
</div>
