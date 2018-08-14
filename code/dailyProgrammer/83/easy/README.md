# (Long scale and short scale)
<div class="md"><p>One of the most annoying and confusing differences between English and basically every other language in the world is that English uses a weird way to name very large numbers. </p>
<p>For instance, if you wanted to translate "one trillion" from English to French, you might think it would be "un trillion", but that is wrong. The correct translation of "one trillion" to French is "un billion". Well, then, you might ask, what is "one billion" in French? It is, in fact, "un milliard". And "un trillion" in French is equal to english "one quintillion". Confusing, no?</p>
<p>The reason for this is that there are two so-called scales for large numbers, <a href="http://en.wikipedia.org/wiki/Long_and_short_scales">the long scale and the short scale</a>. English uses the short scale, almost everyone else uses the long scale (though the Arabic languages also apparently use the short scale). The two systems can be summarized as follows:</p>
<ul>
<li><p>In the <em>short scale</em>, you get a "new word" for the numbers every time the number increases by a factor of 1,000. So "a thousand millions" is "one billion" and "a thousand billions" is "one trillion".</p></li>
<li><p>In the <em>long scale</em>, you get a "new word" for the numbers every time the number increases by a factor of 1,000,000. So "a million millions" is the same as "one billion" and "a million billions" is the same as "one trillion". If we just increase by a factor of 1,000, the "-on" ending on the word is replaced by "-ard". So "a thousand millions" is "one milliard", "a thousand billions" is "one billiard".</p></li>
</ul>
<p>Here's a table summarizing the words for different numbers: </p>
<table><thead>
<tr>
<th align="center">Actual number</th>
<th align="left">Short scale name</th>
<th align="left">Long scale name</th>
</tr>
</thead><tbody>
<tr>
<td align="center">10<sup>6</sup></td>
<td align="left">million</td>
<td align="left">million</td>
</tr>
<tr>
<td align="center">10<sup>9</sup></td>
<td align="left">billion</td>
<td align="left">milliard</td>
</tr>
<tr>
<td align="center">10<sup>12</sup></td>
<td align="left">trillion</td>
<td align="left">billion</td>
</tr>
<tr>
<td align="center">10<sup>15</sup></td>
<td align="left">quadrillion</td>
<td align="left">billiard</td>
</tr>
<tr>
<td align="center">10<sup>18</sup></td>
<td align="left">quintillion</td>
<td align="left">trillion</td>
</tr>
<tr>
<td align="center">10<sup>21</sup></td>
<td align="left">sextillion</td>
<td align="left">trilliard</td>
</tr>
</tbody></table>
<p>And it goes on like that. </p>
<p>Your task today is to write a program that will print out the name of a number in both long-scale and short-scale. So, for instance, given 1234567891111, it should print out </p>
<pre><code>Short scale: 1 trillion, 234 billion, 567 million, 891 thousand and 111
Long scale:  1 billion, 234 milliard, 567 million, 891 thousand and 111
</code></pre>
<p>Bonus points if it prints out everything in letters, i.e.:</p>
<pre><code>Short scale: one trillion, two hundred and thirty-four billion, five hundred
and sixty-seven million, eight hundred and ninety-one thousand and one
hundred and eleven

Long scale:  one billion, two hundred and thirty-four milliard, five hundred
and sixty-seven million, eight hundred and ninety-one thousand and one
hundred and eleven
</code></pre>
<p>The program should be able to handle all numbers that can fit into an unsigned 64-bit integers, i.e. all numbers up to 2<sup>64</sup> - 1 ("18 trillion, 446 billiard, 744 billion, 73 milliard, 709 million, 551 thousand and 615" in long scale, though it's something completely different in short scale.), or 2<sup>63</sup> - 1 if you're using signed 64-bit integers. Of course, you can write your program so it can handle bigger numbers if you want, but it's not necessary. </p>
</div>
