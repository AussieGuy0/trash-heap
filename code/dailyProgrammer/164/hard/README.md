# What the Funge is this!?
<div class="md"><h1>Description</h1>
<p>Befunge is a programming language invented by Chris Pressey. The language was made with the goal of being extremely difficult to compile. Well, what makes it so difficult? Consider this 'Hello World' program written by <a href="/u/Elite6809">/u/Elite6809</a> in Befunge:</p>
<pre><code>0 952**7+    v
&gt;:3-        v6
 &gt;-  :3-::7v:6
 1         -8*
 *         :+  
+8         2  
66 v-+9**25&lt;  
:^     **464&lt; 
^         +8:&lt;

   &gt;        :v
   ^    ,+*88_@
</code></pre>
<p>At first glance, this may look like gibberish (similar to BrainFuck) This is because this language isn't read in the same way as normal programming languages, which are read in a linear fashion. Instead, it is read in two dimensions, by following an instruction pointer throughout the file. The pointer defaults at moving from left to right, but characters such as [<sup>,</sup> v, &lt;, &gt;] will change the direction of the instruction pointer to any of the cardinal directions. Variables are stored on a stack, and all operations pop one or more values off the stack, then either push the result back onto the stack, or change the direction of the instruction pointer. This results in a puzzling programming language, forcing you to work with space management and a limited-access value stack.</p>
<p>Your job is to create a Befunge interpreter that will take in a list of user inputs (read in order by any &amp; or ~ command) and a two-dimensional Befunge program, and output the result.</p>
<p>Be careful! Befunge is a self-modifying programming language (using the p command) and can change itself during runtime!</p>
<h1>Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>Line 1 will consist of any values that will be used as input to the program. every time a user input command is called, it will use the next value in your list of inputs. If there is no input needed, it should be a single zero.</p>
<p>The rest of your input will be the Befunge program to interpret. Befunge-93 has a maximum size of 80 characters horizontally by 25 characters vertically, so it should be within those parameters.</p>
<h2>Output Description</h2>
<p>The program should output a new value or character whenever an output command (. or ,) is called in your program.</p>
<h2>Sample Inputs</h2>
<p>Ex.1 (Simple 'Hello World')</p>
<pre><code>0

"!dlrow olleH"&gt;:#,_@
</code></pre>
<p>Ex.2 (Factorial program written by <a href="/u/AJ_Black">/u/AJ_Black</a>)</p>
<pre><code>9

0&amp;&gt;:1v
  |:-&lt;
&lt;$&lt;v:\
^ *_$.@
</code></pre>
<h2>Sample Outputs</h2>
<p>Sample outputs:</p>
<p>Ex.1:</p>
<p>Hello world!</p>
<p>Ex.2:</p>
<p>362880</p>
<h1>Bonus</h1>
<p>Challenge:</p>
<p>Now that you've made an interpreter, put it to the test by making a Befunge program of your own. Make it serenade you by singing "99 Bottles,", or challenge yourself to a game of "higher or lower." </p>
<h1>Help</h1>
<p>If you're stuck, try reading a few resources such as the Wiki page</p>
<p><a href="http://en.wikipedia.org/wiki/Befunge">http://en.wikipedia.org/wiki/Befunge</a></p>
<p>There's a good example of Befunge code here, written for our [Easy] challenge</p>
<p><a href="http://www.reddit.com/r/dailyprogrammer/comments/26ijiu/5262014_challenge_164_easy_assemble_this_scheme/chrdyfa">http://www.reddit.com/r/dailyprogrammer/comments/26ijiu/5262014_challenge_164_easy_assemble_this_scheme/chrdyfa</a></p>
<h1>Notes</h1>
<p>You can verify that your interpreter works using the following online interpreter - </p>
<p><a href="http://www.bedroomlan.org/tools/befunge-93-playground">http://www.bedroomlan.org/tools/befunge-93-playground</a></p>
</div>
