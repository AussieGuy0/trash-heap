# BASIC Formatting
<div class="md"><h1>Description</h1>
<p>It's the year 2095. In an interesting turn of events, it was decided 50 years ago that BASIC
is by far the universally best language. You work for a company by the name of SpaceCorp, who
has recently merged with a much smaller company MixCo. While SpaceCorp has rigorous formatting
guidelines, exactly 4 space per level of indentation, MixCo developers seem to format however
they please at the moment. Your job is to bring MixCo's development projects up to standards.</p>
<h1>Input Description</h1>
<p>You'll be given a number N, representing the number of lines of BASIC code.
Following that will be a line containing the text to use for indentation, which will
be <code>····</code> for the purposes of visibility. Finally, there will be N lines of
pseudocode mixing indentation types (space and tab, represented by <code>·</code> and <code>»</code> for visibility)
that need to be reindented.</p>
<p>Blocks are denoted by <code>IF</code> and <code>ENDIF</code>, as well as <code>FOR</code> and <code>NEXT</code>.</p>
<h1>Output Description</h1>
<p>You should output the BASIC indented by SpaceCorp guidelines.</p>
<h1>Challenge Input</h1>
<pre><code>12
····
VAR I
·FOR I=1 TO 31
»»»»IF !(I MOD 3) THEN
··PRINT "FIZZ"
··»»ENDIF
»»»»····IF !(I MOD 5) THEN
»»»»··PRINT "BUZZ"
··»»»»»»ENDIF
»»»»IF (I MOD 3) &amp;&amp; (I MOD 5) THEN
······PRINT "FIZZBUZZ"
··»»ENDIF
»»»»·NEXT
</code></pre>
<h1>Challenge Output</h1>
<pre><code>VAR I
FOR I=1 TO 31
····IF !(I MOD 3) THEN
········PRINT "FIZZ"
····ENDIF
····IF !(I MOD 5) THEN
········PRINT "BUZZ"
····ENDIF
····IF (I MOD 3) &amp;&amp; (I MOD 5) THEN
········PRINT "FIZZBUZZ"
····ENDIF
NEXT
</code></pre>
<h1>Bonus</h1>
<p>Give an error code for mismatched or missing statements. For example, this has a missing <code>ENDIF</code>:</p>
<pre><code>FOR I=0 TO 10
····IF I MOD 2 THEN
········PRINT I
NEXT
</code></pre>
<hr/>
<p>This has a missing <code>ENDIF</code> and a missing <code>NEXT</code>:</p>
<pre><code>FOR I=0 TO 10
····IF I MOD 2 THEN
········PRINT I
</code></pre>
<hr/>
<p>This has an <code>ENDIF</code> with no <code>IF</code> and a <code>FOR</code> with no <code>NEXT</code>:</p>
<pre><code>FOR I=0 TO 10
····PRINT I
ENDIF
</code></pre>
<hr/>
<p>This has an extra <code>ENDIF</code>:</p>
<pre><code>FOR I=0 TO 10
····PRINT I
NEXT
ENDIF
</code></pre>
<h1>Finally</h1>
<p>Have a good challenge idea?</p>
<p>Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
<p>Edit: Added an extra bonus input</p>
</div>
