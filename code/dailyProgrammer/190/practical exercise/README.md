# The Complex Number
<div class="md"><h1><a href="#PEIcon"></a> <strong>(Practical Exercise)</strong>: The Complex Number</h1>
<p>The Friday challenge was not able to be submitted, so I'm going to deviate from the Friday standard here and do a submission which will benefit a different group of Daily Programmers. The vast majority of problems here are for computer scientists, and I feel this leaves out the rest of you - ie. those who are here more for the programming practice than the logical puzzles. Therefore, rather than being expected to solve a logic problem, you will be expected to implement a piece of software from a required specification, thus serving as an exercise in good programming practice and making use of language features available to you.</p>
<p>In this exercise you will implement functionality for complex numbers. (If your language already supports such functionality, pretend it doesn't exist.) Please note that this challenge is an object-oriented one. I apologise now to people who prefer procedural or functional languages, and I will try to make such an exercise in the future. Before you do this, let me introduce you to what a complex number is.</p>
<h2>Background</h2>
<p>The complex number system was created by mathematicians to more intuitively solve certain problems involving square roots. It has long been known that you cannot conventionally compute the square root of a negative number, as there is no number which, when multiplied by itself, will produce a negative number. If the original number is positive, the squared number will obviously also be positive. If the original number is negative, the squared number is also positive as multilplying two negative numbers together produces a positive number.</p>
<p>However, this meant that certain mathematical equations involving square roots had no solutions. This was quite an inconvenience for mathematicians at the time - it meant that certain polynomial equations could not be solved, as they ended up trying to work out the square root of a negative number. At some point, someone had the bright idea of ignoring the fact that you can't square root negatives. What if you pretended that the square root of -1 did exist? This is exactly what happened, and the value was defined as the <em>imaginary unit</em>, or <em>i</em> (imaginary as in the classical understanding of numbers, it doesn't actually exist). Therefore, <em>i</em>=√(-1). Using algebra this lets you square root other negative numbers as multiples of <em>i</em>, as √(ab) = √(a) * √(b).</p>
<ul>
<li><p>√(-4) = √4 * √(-1) = √4 * <em>i</em> = 2 * <em>i</em> = 2<em>i</em></p></li>
<li><p>√(-7) = √7 * √(-1) = √7 <em>i</em></p></li>
</ul>
<p>And so on. These numbers are called <em>imaginary numbers</em>. On their own they are useful, but they really come into their own when paired with normal numbera (aka <em>real</em> numbers, to distinguish them from <em>imaginary</em> numbers.) An example of a <em>complex</em> number would be 2+3<em>i</em> or 0.5-2.2<em>i</em>. These complex numbers are split into two bits, as you can see: the real component and the imaginary component. For example, given the complex number 3-7<em>i</em>, the real component is <strong>3</strong> and the imaginary component is -7<em>i</em>. Hence, a normal real number can be represented as a complex number with imaginary component 0<em>i</em>, like 2+0<em>i</em>.</p>
<p><strong>Adding or subtracting</strong> two complex numbers is relatively simple. To do so, just add/subtract each component individually. For example, 1+3<em>i</em> add 3-2<em>i</em> equals 4+<em>i</em>. This requires no further explanation as there isn't much else to it.</p>
<p><strong>Multiplying</strong> complex numbers is a bit more involved but still simple. Multiply the two complex numbers as you would an algebraic expression. For example, to multiply 1+3<em>i</em> and 3-2<em>i</em>, multiply each component together and add them all:</p>
<table><thead>
<tr>
<th></th>
<th>1</th>
<th>3<em>i</em></th>
</tr>
</thead><tbody>
<tr>
<td><strong>3</strong></td>
<td>3</td>
<td>9<em>i</em></td>
</tr>
<tr>
<td><strong>-2i</strong></td>
<td>-2<em>i</em></td>
<td>-6<em>i</em><sup>2</sup></td>
</tr>
</tbody></table>
<p>Now, recall that <em>i</em>=√(-1). Hence, <em>i</em><sup>2</sup>=-1. Therefore, -6<em>i</em><sup>2</sup>=6. This means 1+3<em>i</em> multiplied by 3-2<em>i</em> equals 3+9<em>i</em>-2<em>i</em>+6, which is 9+7<em>i</em>.</p>
<p>To visualise it, you could plot these complex numbers on the number line. But wait... how would you do that? How can you represent the imaginary component on the number line without it floating somewhere above the line? In fact, that's essentially exactly what happens - an <em>Argand diagram</em> is used to do this. An Argand diagram representing the complex number 3-2<em>i</em> <a href="http://i.imgur.com/xycfwUk.gif">looks like this</a>. This diagram can be used to compute a value of a complex number called the <strong>modulus</strong>, which is, is essence, the 'distance from zero' on the diagram - ie. the length of the grey line, which can be computed with Pythagoras' theorem. In this case, the modulus is √(3<sup>2</sup>+(-2)<sup>2</sup>), which is √13.</p>
<p>Finally, there is another value of complex numbers, that is easy to work out. To work out the <strong>complex conjugate</strong> of a complex number, simply invert the sign of the imaginary component. For example, the complex conjugate of 3-2<em>i</em> is 3+2<em>i</em>. Simple.</p>
<h1>Specification</h1>
<p>You are to implement a class representing a complex number.</p>
<ul>
<li><p>It is to be represented by floating-point number fields for the Real and Imaginary components.</p></li>
<li><p>It is to expose a method <code>GetModulus</code> which returns a floating point number representing the modulus of the complex number.</p></li>
<li><p>It is to expose a method <code>GetConjugate</code> which returns another Complex number representing the complex conjugate.</p></li>
<li><p>It is to have 3 static/shared/classifier methods, each taking 2 parameters, for the 3 operations <code>Add</code>, <code>Subtract</code> and <code>Multiply</code>, each performing its respective operation and returning a Complex with the result of the operation.</p></li>
<li><p>It is to expose a method <code>ToString</code> which converts the complex number to its string representation correctly: eg. <code>"3-2i"</code>, <code>"1-i"</code> or <code>"13"</code>.</p></li>
</ul>
<p>The UML diagram for the Complex class <a href="http://i.imgur.com/PJYBCgd.png">looks like this</a>.</p>
<h2>Extension</h2>
<p>If you are feeling up to it, implement these, too:</p>
<ul>
<li><p>It is to expose a method <code>GetArgument</code> which returns a floating point angle, in radians, representing the <a href="http://en.wikipedia.org/wiki/Argument_%28complex_analysis%29">argument of the complex number</a>.</p></li>
<li><p>It is to have another static method taking 2 parameters for the operation <code>Divide</code>, which <a href="http://mathworld.wolfram.com/ComplexDivision.html">divides two complex numbers</a>.</p></li>
</ul>
<p>The UML diagram for the extended Complex class <a href="http://i.imgur.com/z1ENG9F.png">looks like this</a>.</p>
<h2>Making Use of your Language</h2>
<p>The main challenge of this exercise is knowing your language and its features, and adapting your solution to them. For example, in Ruby, you would not write a <code>ToString</code> method - you would write a <code>to_s</code> method, as that is the standard in Ruby. In C++ and C#, you would not write static <code>Add</code>, <code>Multiply</code> methods. You would instead overload the <code>+</code>, <code>-</code>, <code>*</code>, <code>/</code> operators, and rather than writing a <code>GetModulus</code> method you would write a <code>Modulus</code> property. Knowing and using these features that programming language provide is an important part of software development.</p>
<p>You should also be writing clean, legible code. Follow the style guide for your language, and use the correct naming/capitalisation conventions, which differ from language to language.</p>
</div>
