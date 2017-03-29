# Formatting J code
<div class="md"><p>J code can be written like basic/pascal/fortran.</p>
<p>Challenge today is to convert between 2 or 4 format styles for one J routine.  the last 2 are optional bonuses.  </p>
<p>Your program should autodetect any current format, and output the target format from any state.</p>
<p>The program should return text/arrays of lines instead of making "sideeffect print statements"</p>
<h1>J control word rules</h1>
<p>This challenge is almost entirely about adding and replacing linefeeds and leading spaces.  <a href="http://www.jsoftware.com/help/dictionary/ctrl.htm">reference to all j control words, you likely don't need to read</a></p>
<p>A control word is a string of letters and underscores that is at least 2 letters long and ends with a <code>.</code>  For the sake of this challenge the only control words that are used are:</p>
<p><code>for_varname. if. do. else. end. label_.</code>  (these are case sensitive)</p>
<p>you may (or not) assume that an end-of_word boundary occurs after the control word but a space or linefeed isn't strictly necessary for J's parser.  A begining of word boundary is necessary for J to parse correctly, but can be ignored.</p>
<p>All control words have implied linefeeds that follow and precede them, and so all multiline code can be converted to a single line by converting "essential linefeeds" (those that separate (LF terminated) statements that do not have intervening control words) into the "dummy control word separator:" <code>label_.</code></p>
<p>The <code>end.</code> control word terminates an <code>if.</code> or <code>for.</code> structure.<br/>
The <code>do.</code> control word acts as <code>THEN</code> (for if.) and as "middle separator" for all other control words.</p>
<p>The sample code here is taken from <a href="http://rosettacode.org/wiki/Levenshtein_distance#J">http://rosettacode.org/wiki/Levenshtein_distance#J</a></p>
<h1>inputs</h1>
<p>all of the following sections contain inputs ( and the first 4 are target outputs).  The challenge inputs are "messed up" but still valid J code, that can be formatted into one of the first 4 inputs/outputs.</p>
<p>Your function should take the described inputs, and an additional parameter that is the desired output format.  The number of spaces or tabs that are leading spaces is your choice and may be a global paramater.</p>
<h1>1. Basic format</h1>
<p>The following  as input must also be able to output itself.   </p>
<pre><code>  D=. x +/&amp;i.&amp;&gt;:&amp;# y
  for_i. 1+i.#x do.
    for_j. 1+i.#y do.
      if. ((&lt;:i){x)=(&lt;:j){y do.
        D=.(D {~&lt;&lt;:i,j) (&lt;i,j)} D
      else.
        min=. 1+&lt;./D{~(i,j) &lt;@:-"1#:1 2 3
        D=. min (&lt;i,j)} D
      end.
    end.
  end.
  {:{:D
</code></pre>
<h1>2 linear format</h1>
<p>This has linefeeds removed, and the 2 statements inside the <code>else.</code> clause are separated by a <code>label_.</code> clause.</p>
<p>This is likely the most useful "starting format" to convert to and from all others.  If you do just 2 parts of this challege, convert from this format to <code>1.</code>, and also convert from <code>1.</code> to <code>1.</code> unchanged.</p>
<pre><code>D=. x +/&amp;i.&amp;&gt;:&amp;# y for_i. 1+i.#x do. for_j. 1+i.#y do. if. ((&lt;:i) (x)=(&lt;:j){y do. D=.(D {~&lt;&lt;:i,j) (&lt;i,j)} D else. min=. 1+&lt;./D{~(i,j) &lt;@:-"1#:1 2 3 label_. D=. min (&lt;i,j)} D end. end. end. {:{:D
</code></pre>
<h1>3. python layout format</h1>
<p>like <code>1.</code> but with <code>end.</code>s terminating the last line of their sections.</p>
<pre><code>  D=. x +/&amp;i.&amp;&gt;:&amp;# y
  for_i. 1+i.#x do.
    for_j. 1+i.#y do.
      if. ((&lt;:i){x)=(&lt;:j){y do.
        D=.(D {~&lt;&lt;:i,j) (&lt;i,j)} D
      else.
        min=. 1+&lt;./D{~(i,j) &lt;@:-"1#:1 2 3
        D=. min (&lt;i,j)} D end. end. end.
  {:{:D
</code></pre>
<h1>4. implied python format</h1>
<p>this is the only format that is not valid J code.  Its a simple modification to <code>3.</code> in that <code>do.</code> and <code>end.</code> control words are removed.  Where this is challenging is if this is the input for other outputs, and this format must be detected and <code>do</code> and <code>end</code> keywords must be added.</p>
<pre><code>  D=. x +/&amp;i.&amp;&gt;:&amp;# y
  for_i. 1+i.#x 
    for_j. 1+i.#y 
      if. ((&lt;:i){x)=(&lt;:j){y 
        D=.(D {~&lt;&lt;:i,j) (&lt;i,j)} D
      else.
        min=. 1+&lt;./D{~(i,j) &lt;@:-"1#:1 2 3
        D=. min (&lt;i,j)} D 
  {:{:D
</code></pre>
<h1>challenge input 1</h1>
<p>this is valid J code.</p>
<pre><code>D=. x +/&amp;i.&amp;&gt;:&amp;# y 
for_i.
1+i.#x 
do. for_j. 1+i.#y 
do. 

if. ((&lt;:i) (x)=(&lt;:j){y do. D=.(D {~&lt;&lt;:i,j) (&lt;i,j)} D else. min=. 1+&lt;./D{~(i,j) &lt;@:-"1#:1 2 3 
D=. min (&lt;i,j)} D 
label_.  end. end. end. {:{:D
</code></pre>
<h1>challenge input 2</h1>
<p>Very hard:  partially implied python format, and partially "free form"</p>
<pre><code>  D=. x +/&amp;i.&amp;&gt;:&amp;# y for_i. 1+i.#x 
    for_j. 1+i.#y do. 
      if. ((&lt;:i){x)=(&lt;:j){y 
        D=.(D {~&lt;&lt;:i,j) (&lt;i,j)} D
      else.
        min=. 1+&lt;./D{~(i,j) &lt;@:-"1#:1 2 3
        D=. min (&lt;i,j)} D end. 
  {:{:D
</code></pre>
<p>(missing (implied) end. statement.  Some implied do. statements)</p>
<hr/>
<p>To cut down on output, converting challenge <code>1.</code> to output <code>4.</code> likely requires exercising all of your code, in such a way that it works.</p>
</div>
