# Generating Text with Markov Processes
<div class="md"><h1>Description</h1>
<p>Text generation algorithms exist in a wide variety of formats, including "Mad Libs" and Markov processes. A Markov chain algorithm generates text by creating a statistical model of potential textual suffixes for a given prefix. That's a fancy way of saying "it basically determines the next most probable word given the training set." Markov chain programs typically do this by breaking the input text into a series of words, then by sliding along them in some fixed sized window, storing the first N-1 words as a prefix and then the Nth word as a member of a set to choose from randomly for the suffix. Then, given a prefix, pick randomly from the suffixes to make the next piece of the chain. </p>
<p>Take this example text:</p>
<pre><code>Now is not the time for desert, now is the time for dinner 
</code></pre>
<p>For a set of triples, yielding a bi-gram (2 word) prefix, we will generate the following prefixes and suffix:</p>
<pre><code>Prefixes        Suffixes
--------        --------
Now, is         not
is, not         the
not, the        time
the, time       for
time, for       desert
for, desert     now
desert, now     is
now, is         not, the  
is, the         time
the, time       for
time, for       desert, dinner
</code></pre>
<p>You'll see a couple of the prefixes have TWO suffixes, this is because they repeat but one with a different suffix and one with the same suffix. Repeating this over piles and piles of text will start to enable you to build statistically real but logically meaningless sentences. Take this example output from my program after running it over Star Trek plot summaries:</p>
<pre><code>"attack." In fact, Yeoman Tamura's tricorder shows that Kirk has been killed after
beaming down to the bridge, Kirk reminisces about having time to beam down. Kirk wants
Spock to grab hold of him in a fist fight with Kirk and Spock try to escape, the collars
are activated, subjecting them to an entrance, which then opens. Scotty saves the day by
pretending to help Spock, and Mullhall voluntarily agree, and the others transported to
the one which is not at all obvious what to make diplomatic advances. Meanwhile Kirk is
able to get inside. McCoy and nerve pinches Chief at
</code></pre>
<h1>Challenge</h1>
<p>Your challenge today is to implement a Markov generator supporting a bi-gram prefix. It should be capable of ingesting a body of text for training and output a body of text generated from that. </p>
<h1>Notes</h1>
<p><a href="http://www.rose-hulman.edu/Users/faculty/young/CS-Classes/csse220/200820/web/Programs/Markov/markov.html">Markov Chain Algorithm</a> from rose-hulman.edu</p>
<p>If you want to reproduce my Star Trek fun, I extracted the summaries from <a href="http://www.ericweisstein.com/fun/startrek/">Eric Wasserman's site</a> and made them into a <a href="https://drive.google.com/file/d/0B3rX15hRO_71NEt0cl8tcWMxNnM/view?usp=sharing">flat text file</a>. </p>
</div>
