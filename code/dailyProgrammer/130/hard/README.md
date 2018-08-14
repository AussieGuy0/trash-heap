# Coloring France's Departments
<div class="md"><h1><a href="#HardIcon"></a> <em>(Hard)</em>: Coloring France's Departments</h1>
<p>The European country of <a href="http://en.wikipedia.org/wiki/France">France</a> is segmented into many different <a href="http://en.wikipedia.org/wiki/Departments_of_France">departments</a>; 96 in the main continent with a few others overseas. Wikipedia, as always, has a great <a href="http://upload.wikimedia.org/wikipedia/commons/b/b2/D%C3%A9partements_de_France_English.svg">visualization of these departments with their respective unique numbers here</a>.</p>
<p>Some departments, like 66 (Pyrénées-Orientales), are only bordered by two other departments. Others, like department 87, are surrounded by much more (6 in this example). Your goal is to color a map of these regions with two requirements: 1) make sure that each adjacent department do not share a color, so you can clearly distinguish each department, and 2) minimize these numbers of colors.</p>
<p>The input will be a variation of the list of French departments, represented as an <a href="http://en.wikipedia.org/wiki/Adjacency_list">adjacency list</a>. This challenge is essentially solving for <a href="http://en.wikipedia.org/wiki/Graph_coloring">Graph coloring</a>, where you must print each department's color (a unique integer).</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>On standard console input, you will be given an integer N which represents the following N-lines of an adjacency list. These lines of data will always be in the format of integers A B C D ... where A is the source node / vertex that points to vertices B C D... etc. Remember that this data really means that A is the ID of a department, and B C D ... are the bordering departments.</p>
<p>Writing up the French department list as an adjacency list is very tedious; feel free to only work on a subset.</p>
<h2>Output Description</h2>
<p>For each given node (a department), print the unique color identifier after it. A color identifier is unique integer, starting from 0, that represents a unique color. Remember that bordering departments (e.g. adjacent nodes) cannot have the same color index!</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<p><em>Note that this list only contains 8 departments from the south-western corner of France as an example</em></p>
<pre><code>8
64 40 32 65
65 64 32 31
31 65 32 82 81 11 9
9 31 11 66
66 9 11
40 33 47 32 64
32 40 47 82 31 65 64
11 31 81 34 66 9
</code></pre>
<h2>Sample Output</h2>
<pre><code>64 0
65 1
31 0
9 1
66 0
40 1
32 2
11 2
</code></pre>
<h1>Challenge++:</h1>
<p>If you want to go above and beyond for this challenge, programmatically draw a map of the French departments with actual colors from your unique set (you may randomly pick them or use a <a href="http://en.wikipedia.org/wiki/Palette_(computing)">color palette</a>). Feel free to use the linked SVG file from Wikipedia, since it can be modified through text / XML manipulation.</p>
</div>
