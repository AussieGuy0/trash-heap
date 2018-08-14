<div class="md"><p>As computer programmers are well aware, it can be very useful to write numbers using numerical bases other than the familiar base 10 notation we use in everyday life. In computer programming, <a href="http://en.wikipedia.org/wiki/Binary_number">base 2</a> and <a href="http://en.wikipedia.org/wiki/Hexadecimal">base 16</a> are especially handy. In base 2, the number 1234 becomes 10011010010 and in base 16 it becomes 4D2. </p>
<p>Because there are only 10 regular digits, when numbers are written in base 16, the first few letters of the alphabet are added to represent the remaining required digits, so 'A' stands in for 10, 'B' for 11, 'C' for 12, 'D' for 13, 'E' for 14 and 'F' for 15. </p>
<p>Of course, this trick of adding letters to stand in for numbers allows us to represent higher bases than 16; if you can use all letters of the alphabet, you can represent bases up to base 36 (because there are ten regular digits and 26 "letter-digits"). So for instance, 12345678 becomes 1L2FHE in base 23 and 4IDHAA in base 19. </p>
<p>Write a program that will take a number and convert it to any base between 2 and 36. Have the program print out 19959694 in base 35 and 376609378180550 in base 29. </p>
<p>NOTE: Many languages have this built in as a library function. For instance, in Java, the function Integer.toString(i, radix) does exactly this. However, the entire point of this challenge is to write the program yourself, so you <strong>are not</strong> allowed to use any library functions like this.</p>
<hr/>
<p>BONUS: A number is said to be "palindromic in base N" if, when written in base N the number is the same backwards and forwards. So, for instance, the number 16708 is palindromic in base 27, because in base 27 the number is written as MOM, obviously a palindrome. The number 12321 is a palindrome in in base 10, because 12321 written backwards is 12321. Some numbers are palindromic in several bases, the number 15167 for instance is palindromic in bases 9, 27, 28, 35 and 36. </p>
<p>In what bases is the number 10858 palindromic?</p>
<ul>
<li>Thanks to <a href="http://www.reddit.com/user/Hannoii">Hannoii</a> for suggesting this problem and <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a>! If you have a problem that you think would be good for this subreddit, why not head over there and suggest it? </li>
</ul>
</div>
