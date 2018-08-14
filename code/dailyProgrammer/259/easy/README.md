# Clarence the Slow Typist
<div class="md"><h1>Description</h1>
<p>Clarence is a data entry clerk who works at an internet service provider. His job is to manually enter the IP addresses of all of the ISP's customers into the database. He does this using a keypad which has the following layout:</p>
<table><thead>
<tr>
<th align="center"><code>1</code></th>
<th align="center"><code>2</code></th>
<th align="center"><code>3</code></th>
</tr>
</thead><tbody>
<tr>
<td align="center"><code>4</code></td>
<td align="center"><code>5</code></td>
<td align="center"><code>6</code></td>
</tr>
<tr>
<td align="center"><code>7</code></td>
<td align="center"><code>8</code></td>
<td align="center"><code>9</code></td>
</tr>
<tr>
<td align="center"><code>.</code></td>
<td align="center"><code>0</code></td>
<td align="center"></td>
</tr>
</tbody></table>
<p>The distance between the centre of horizontally or vertically adjacent keys is exactly one centimetre. For instance, the distance between the centres of <code>3</code> and <code>9</code> would be two centimetres. The distance between the centres of <code>3</code> and <code>5</code> would be sqrt 2cm. The Pythagoras theorem is sufficient to calculate the distance between any two keys.</p>
<p>Clarence, as you might expect from one who works in an ISP, uses a very slow and inefficient system of typing. He uses a single finger and searches for the key, and then moves his finger to the key, then presses it, and repeats for all of the digits in the number. You might know of this style as the "eagle search system" since the finger searches above the keyboard for the correct key before plunging down for the keypress, like an eagle plunging down for a kill.</p>
<p>For example, here is how Clarence would type out the number <code>7851</code>:</p>
<ol>
<li>He starts his finger at <code>7</code> and pushes the key.</li>
<li>He moves his finger to the right 1cm to <code>8</code> and pushes the key.</li>
<li>He moves his finger upwards 1cm to <code>5</code>  and pushes the key.</li>
<li>He moves his finger diagonally upwards and left sqrt 2cm to <code>1</code> and pushes the key.</li>
</ol>
<p>Therefore the total distance that Clarence moved his finger to type in <code>7851</code> is <code>1 + 1 + sqrt 2</code> which is about 3.41cm.</p>
<p>Your task is to write a program that calculates the distance Clarence must move his finger to type in arbitrary IP addresses.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>Input is a string that will be in the form</p>
<p><code>().().().()</code></p>
<p>where each <code>()</code> is an integer in the range <code>0</code> - <code>999</code>. This represents the IP address that Clarence must type in. An example input might be:</p>
<pre><code>219.45.143.143
</code></pre>
<p>I would also like to point out that inputs such as <code>0.42.42.42</code> or <code>999.999.999.999</code> are still valid inputs, despite the fact that they are invalid IP addresses. So you don't need to include any IP address verification code in your program.</p>
<h2>Output Description</h2>
<p>Output the distance that Clarence must move his finger in order to type in the specified IP address. Round answers to two decimal places where needed, and use the <code>cm</code> unit in your output. The output for the example input is <code>27.38cm</code> (1 + sqrt 8 + sqrt 5 + 2 + 1 + sqrt 5 + 3 + 1 + sqrt 5 + sqrt 13 + 3 + 1 + sqrt 5).</p>
<h1>Credit</h1>
<p>This challenge was suggested by <a href="/u/katyai">/u/katyai</a>. If you have any challenge ideas please share them on <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and there's a good chance we'll use them!</p>
</div>
