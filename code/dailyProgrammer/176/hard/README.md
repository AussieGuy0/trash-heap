# Spreadsheet Developer pt. 2: Mathematical Operations
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Hard)</em>: Spreadsheet Developer pt. 2: Mathematical Operations</h1>
<p>Today we are building on <a href="/r/dailyprogrammer/comments/2dvc81/8182014_challenge_176_easy_spreadsheet_developer/">what we did on Monday</a>. We be using the selection system we developed last time and create a way of using it to manipulate numerical data in a spreadsheet.</p>
<p>The spreadsheet should ideally be able to expand dynamically in either direction but don't worry about that too much. We will be able to perform 4 types of operation on the spreadsheet.</p>
<ul>
<li><p>Assignment. This allows setting any number of cells to one value or cell. For example, <code>A3:A4&amp;A5=5.23</code> or <code>F7:G11~A2=A1</code>.</p></li>
<li><p>Infix operators - <code>+</code>, <code>-</code>, <code>*</code>, <code>/</code> and <code>^</code> (exponent). These allow setting any number of cells to the result of a mathematical operation (only one - no compound operations are required but you can add them if you're up to it!) For example, <code>F2&amp;F4=2*5</code> or <code>A1:C3=2^D5</code>. If you want, add support for mathematical constants such as <em>e</em> (2.71828183) or <em>pi</em> (3.14159265).</p></li>
<li><p>Functions. These allow setting any number of cells to the result of a function which takes a variable number of cells. Your program must support the functions <code>sum</code> (adds the value of all the given cells), <code>product</code> (multiplies the value of all the given cells) and <code>average</code> (calculates the mean average of all the given cells). This looks like <code>A1:C3=average(D1:D20)</code>.</p></li>
<li><p>Print. This changes nothing but prints the value of the given cell to the screen. This should only take 1 cell (if you can think of a way to format and print multiple cells, go ahead.) This looks like <code>A3</code>, and would print the number in A3 to the screen.</p></li>
</ul>
<p>All of the cells on the left-hand side are set to the same value. Cell values default to 0. The cell's contents are not to be evaluated immediately but rather when they are needed, so you could do this:</p>
<pre><code>A1=5
A2=A1*2
A2 &gt;&gt;prints 10
A1=7
A2 &gt;&gt;prints 14
</code></pre>
<p>After you've done all this, give yourself a whopping big pat on the back, go <a href="/r/IAmA/comments/227tme/">here</a> and apply to work on the Excel team - you're pretty much there!</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>You will be given commands as described above, one on each line.</p>
<h2>Output Description</h2>
<p>Whenever the user requests the value of a cell, print it.</p>
<h1>Example Inputs and Outputs</h1>
<h2>Example Input</h2>
<pre><code>A1=3
A2=A1*3
A3=A2^2
A4=average(A1:A3)
A4
</code></pre>
<h2>Example Output</h2>
<pre><code>31
</code></pre>
</div>
