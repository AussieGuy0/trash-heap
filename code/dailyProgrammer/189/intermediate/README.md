# Roman Numeral Conversion
<div class="md"><p>Your friend is an anthropology major who is studying roman history. They have never been able to quite get a handle for roman numerals and how to read them, so they've asked you to come up with a simple program that will let them input some numbers and return roman numerals, as well as the opposite, to input roman numerals and return base-10 numbers. They are bribing you with Indiana Jones memorabilia, so you are totally up for the challenge!</p>
<h1>Description</h1>
<p>Most people learn about roman numerals at a young age. If you look at many analog clocks, you will find that many of them actually use roman numerals for the numbers. Roman numerals do not just stop at 12 though, they actually can represent numbers as high as 4999 using their most basic form.
The challenge, is to create a program that will allow you to convert decimal (base-10) numbers to roman numerals as well as roman numerals to decimal numbers. The history of roman numerals is a bit debated because of their varied use throughout history and a seeming lack of a standard definition. Some rules are well accepted and some less-so. Here are the guidelines for your implementation:</p>
<table><thead>
<tr>
<th align="left">I</th>
<th align="left">V</th>
<th align="right">X</th>
<th align="left">L</th>
<th align="left">C</th>
<th align="left">D</th>
<th align="left">M</th>
</tr>
</thead><tbody>
<tr>
<td align="left">1</td>
<td align="left">5</td>
<td align="right">10</td>
<td align="left">50</td>
<td align="left">100</td>
<td align="left">500</td>
<td align="left">1000</td>
</tr>
</tbody></table>
<h1>Rules</h1>
<p>You cannot repeat the same roman numeral more than three times in a row, except for M, which can be added up to four times. (Note: Some descriptions of roman numerals allows for IIII to represent 4 instead of IV. For the purposes of this exercise, that is not allowed.)
When read from left to right, if successive roman numerals decrease or stay the same in value, you add them to the total sum.
When read from left to right, if successive roman numerals increase in value, you subtract the smaller value from the larger one and add the result to the total sum.</p>
<h1>Restrictions</h1>
<p>I can only be subtracted from V or X</p>
<p>X can only be subtracted from L or C</p>
<p>C can only be subtracted from D or M</p>
<p>Only one smaller value can be subtracted from a following larger value. (e.g. 'IIX' would be an invalid way to represent the number 8)</p>
<h1>Examples</h1>
<p>XII = 10 + 1 + 1 = 12</p>
<p>MDCCLXXVI = 1000 + 500 + 100 + 100 + 50 + 10 + 10 + 5 + 1 = 1776</p>
<p>IX = "1 from 10" = 10 - 1 = 9</p>
<p>XCIV = "10 from 100" + "1 from 5" = (100 - 10) + (5 - 1) = 90 + 4 = 94</p>
<h1>Inputs &amp; Outputs</h1>
<p>Your program should be able to accept numbers in either integer or roman numeral format to return the other. You may want to add validation checks on the input.
When converting to a roman numeral, the maximum number is 4999.
When converting from a roman numeral, I,V,X,L,C,D,M are the only valid characters.
You should be able to accept one or many numbers or numerals and convert to the other direction.</p>
<h1>Challenge</h1>
<p>Some historical accounts state that roman numerals could actually go much higher than 4999. There are incredibly varied explanations and syntactical requirements for them. Some state that an over-line (vinculum) would be used over a number to multiply it by 1000, some say that you would put a curved line on either side of a number to multiply it by 1000.
For the challenge, see if you can add support to your code to allow parenthesis to encapsulate parts of a number that can be multiplied by one thousand. You can nest parenthesis as well to allow for numbers that are incredibly large.</p>
<h1>Restriction</h1>
<p>The last roman numeral digit inside a set of parenthesis can not be an "I". There are two reasons for this (1) because historical accounts claimed that confusion would happen with the curved lines that encapsulate a number to be multiplied by one thousand and (2) because the easiest way to validate your numbers is with Wolfram Alpha and they do not allow it either.</p>
<h1>Examples</h1>
<p>(V)M = 5*1000 + 1000 = 6000</p>
<p>(X)MMCCCXLV = 10*1000 + 1000 + 1000 + 100 + 100 + 100 + (50 - 10) + 5 = 10000 + 2000 + 300 + 40 + 5 = 12345</p>
<p>((XV)M)DCC = ((10 + 5) * 1000 + 1000) * 1000 + 500 + 100 + 100 = (15000 + 1000) * 1000 + 1700 = 16000000 + 1700 = 16001700</p>
<h1>Hints</h1>
<p>You can visit Wolfram Alpha to validate some of your numbers if you are having any trouble.
<a href="http://www.wolframalpha.com/input/?i=314+in+roman+numerals">http://www.wolframalpha.com/input/?i=314+in+roman+numerals</a></p>
<h1>Sample Data</h1>
<h2>Basic</h2>
<p>IV = 4</p>
<p>XXXIV = 34</p>
<p>CCLXVII = 267</p>
<p>DCCLXIV = 764</p>
<p>CMLXXXVII = 987</p>
<p>MCMLXXXIII = 1983</p>
<p>MMXIV = 2014</p>
<p>MMMM = 4000</p>
<p>MMMMCMXCIX = 4999</p>
<h2>Challenge</h2>
<p>(V) = 5000</p>
<p>(V)CDLXXVIII = 5478</p>
<p>(V)M = 6000</p>
<p>(IX) = 9000</p>
<p>(X)M = 11000</p>
<p>(X)MM = 12000</p>
<p>(X)MMCCCXLV = 12345</p>
<p>(CCCX)MMMMCLIX = 314159</p>
<p>(DLXXV)MMMCCLXVII = 578267</p>
<p>(MMMCCXV)CDLXVIII = 3215468</p>
<p>(MMMMCCX)MMMMCDLXVIII = 4214468</p>
<p>(MMMMCCXV)CDLXVIII = 4215468</p>
<p>(MMMMCCXV)MMMCDLXVIII = 4218468</p>
<p>(MMMMCCXIX)CDLXVIII = 4219468</p>
<p>((XV)MDCCLXXV)MMCCXVI = 16777216</p>
<p>((CCCX)MMMMCLIX)CCLXV = 314159265</p>
<p>((MLXX)MMMDCCXL)MDCCCXXIV = 1073741824</p>
<h1>Finally</h1>
<p>Have a good challenge idea?</p>
<p>Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
<p>Thanks to <a href="/u/pshatmsft">/u/pshatmsft</a> for the submission!</p>
</div>
