# Wandering Fingers
<div class="md"><h1>Description</h1>
<p>Software like Swype and SwiftKey lets smartphone users enter text by <em>dragging</em> their finger over the on-screen keyboard, rather than tapping on each letter.</p>
<p><a href="http://www.swype.com/content/uploads/2014/09/swype_path.png">Example image of Swype</a></p>
<p>You'll be given a string of characters representing the letters the user has dragged their finger over.</p>
<p>For example, if the user wants "rest", the string of input characters might be "resdft" or "resert".</p>
<h1>Input</h1>
<p>Given the following input strings, find all possible output words 5 characters or longer.</p>
<ol>
<li>qwertyuytresdftyuioknn</li>
<li>gijakjthoijerjidsdfnokg</li>
</ol>
<h1>Output</h1>
<p>Your program should find all possible words (5+ characters) that can be derived from the strings supplied.</p>
<p>Use <a href="http://norvig.com/ngrams/enable1.txt">http://norvig.com/ngrams/enable1.txt</a> as your search dictionary.</p>
<p>The order of the output words doesn't matter.</p>
<ol>
<li>queen question</li>
<li>gaeing garring gathering gating geeing gieing going goring</li>
</ol>
<h1>Notes/Hints</h1>
<p>Assumptions about the input strings:</p>
<ul>
<li>QWERTY keyboard</li>
<li>Lowercase a-z only, no whitespace or punctuation</li>
<li>The first and last characters of the input string will always match the first and last characters of the desired output word</li>
<li>Don't assume users take the most efficient path between letters</li>
<li>Every letter of the output word will appear in the input string</li>
</ul>
<h1>Bonus</h1>
<p>Double letters in the output word <em>might</em> appear only once in the input string, e.g. "polkjuy" could yield "polly".</p>
<p>Make your program handle this possibility.</p>
<h1>Credit</h1>
<p>This challenge was submitted by <a href="/u/fj2010">/u/fj2010</a>, thank you for this! If you have any challenge ideas please share them in <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and there's a chance we'll use them. </p>
</div>
