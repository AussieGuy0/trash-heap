<div class="md"><p>When linguists study ancient and long dead languages, they sometimes come upon a situation where a certain word only appears once in all of the collected texts of that language. Words like that are obviously very bothersome, since they are exceedingly hard to translate (there's almost no context to what the word might mean).</p>
<p>Such a word is refered to as a <em><a href="http://en.wikipedia.org/wiki/Hapax_legomenon">hapax legomenon</a></em> (which is Greek for roughly "word once said"). The proper plural is <em>hapax legomena</em>, but they are frequently refered to as just "hapaxes". </p>
<p>However, a hapax legomenon doesn't just need to be a word that appears only once in an entire language; they can also be words that appears only once in a single work, or the body of work of an author. Lets take Shakespeare as an example. In all the works of Shakespeare, the word "correspondance" occurs only in one place, the beginning of Sonnet 148:</p>
<blockquote>
<p><em>O me! what eyes hath love put in my head,</em><br/>
<em>Which have no correspondence with true sight,</em><br/>
<em>Or if they have, where is my judgment fled,</em><br/>
<em>That censures falsely what they see aright?</em> </p>
</blockquote>
<p>Now, "correspondance" is 14 letters long, which is a pretty long word. It is, however, not the longest hapax legomenon in Shakespeare. The longest by far is <em><a href="http://en.wikipedia.org/wiki/Honorificabilitudinitatibus">honorificabilitudinitatibus</a></em> from <em>Love's Labour's Lost</em> (drink a couple of shots of whiskey and try and pronounce that word, I dare you!)</p>
<p><a href="http://www.gutenberg.org/cache/epub/100/pg100.txt">Here is a link</a> to a text-file containing the Complete Works of William Shakespeare (it's 5.4 mb big), provided by the good people of Project Gutenberg. Write a program that analyses that file and finds all words that </p>
<ol>
<li>Only occur once in the entire text</li>
<li>Are longer than "correspondance", i.e. words that are 15 letters long or longer. </li>
</ol>
<hr/>
<p>Bonus: If you do the first part of this problem, you will likely come up with a list of words that cannot be said to be "true" hapax legomenon. For instance, you might have found the word "distemperatures" which appears only once in <em>The Comedy of Errors</em>. But that is simply the plural of <em>distemperature</em>, and <em>distemperature</em> appears in <em>A Midsummer's Night Dream</em>, so "distemperatures" cannot be said to be a "true" hapax. Same thing with the word <em>superstitiously</em>: it also occurs only once but <em>superstitious</em> occurs many times. Even the example I used above can be said to not be a true hapax, because while <em>correspondance</em> only appears once, variations of <em>correspond</em> appears a number of times. </p>
<p>Modify your program to identify and make it detect when a word appears twice or more in a simple variation, like a plural or adverbial form (hint: words ending in "s", "ly", "ing" and "ment"), so that it can sort it out. Then, find the <em>true</em> number of hapax legomena in Shakespeare that are longer than 14 characters. By my count (which may very well be wrong), there are less than 20 of them. </p>
</div>
