# String Index
<div class="md"><h1>What no hard?:</h1>
<p>So my originally planned [Hard] has issues. So it is not ready for posting. I don't have another [Hard] so we are gonna do a nice [Easy] one for Friday for all of us to enjoy.</p>
<h1>Description:</h1>
<p>We know arrays. We index into them to get a value. What if we could apply this to a string? But the index finds a "word". Imagine being able to parse the words in a string by giving an index. This can be useful for many reasons.</p>
<p>Example: </p>
<p>Say you have the String "The lazy cat slept in the sunlight."</p>
<p>If you asked for the Word at index 3 you would get "cat" back. If you asked for the Word at index 0 you get back an empty string "". Why an empty string at 0? Because we will not use a 0 index but our index begins at 1. If you ask for word at index 8 you will get back an empty string as the string only has 7 words. Any negative index makes no sense and return an empty string "".</p>
<h1>Rules to parse:</h1>
<ul>
<li>Words is defined as [a-zA-Z0-9]+ so at least one of these and many more in a row defines a word.</li>
<li>Any other character is just a buffer between words."</li>
<li>Index can be any integer (this oddly enough includes negative value). </li>
<li>If the index into the string does not make sense because the word does not exist then return an empty string.</li>
</ul>
<h1>Challenge Input:</h1>
<p>Your string:
      "...You...!!!@!3124131212 Hello have this is a --- string   Solved !!...?  to test @\n\n\n#!#@#@%$<sup>**#$@</sup>  Congratz this!!!!!!!!!!!!!!!!one ---Problem\n\n"</p>
<p>Find the words at these indexes and display them with a " " between them: 12 -1 1 -100 4 1000 9 -1000 16 13 17 15</p>
</div>
