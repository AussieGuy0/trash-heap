# Variable Notation
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Easy)</em>: Variable Notation</h1>
<p>When writing code, it can be helpful to have a standard (<a href="http://en.wikipedia.org/wiki/Identifier_naming_convention">Identifier naming convention</a>) that describes how to define all your variables and object names. This is to keep code easy to read and maintain. Sometimes the standard can help describe the type (such as in <a href="http://en.wikipedia.org/wiki/Hungarian_notation">Hungarian notation</a>) or make the variables visually easy to read (<a href="http://en.wikipedia.org/wiki/CamelCase">CamcelCase notation</a> or <a href="http://en.wikipedia.org/wiki/Snake_case">snake_case</a>).</p>
<p>Your goal is to implement a program that takes an english-language series of words and converts them to a specific variable notation format. Your code must support CamcelCase, snake_case, and capitalized snake_case.</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>On standard console input, you will be given an integer one the first line of input, which describes the notation you want to convert to. If this integer is zero ('0'), then use CamcelCase. If it is one ('1'), use snake_case. If it is two ('2'), use capitalized snake_case. The line after this will be a space-delimited series of words, which will only be lower-case alpha-numeric characters (letters and digits).</p>
<h2>Output Description</h2>
<p>Simply print the given string in the appropriate notation.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<pre><code>0
hello world

1
user id

2
map controller delegate manager
</code></pre>
<h2>Sample Output</h2>
<pre><code>0
helloWorld

1
user_id

2
MAP_CONTROLLER_DELEGATE_MANAGER
</code></pre>
<h2>Difficulty++</h2>
<p>For an extra challenge, try to convert from one notation to another. Expect the first line to be two integers, the first one being the notation already used, and the second integer being the one you are to convert to. An example of this is:</p>
<p>Input:</p>
<pre><code>1 0
user_id
</code></pre>
<p>Output:</p>
<pre><code>userId
</code></pre>
</div>
