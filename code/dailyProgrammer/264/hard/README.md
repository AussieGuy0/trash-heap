# Detecting Poetry Forms
<div class="md"><h1>Description</h1>
<p>This is a variant of last week's intermediate challenge and was inspired by a comment from <a href="/u/Agent_Epsilon">/u/Agent_Epsilon</a>. In short, given a piece of poetry can you write a program to tell you what <a href="https://en.wikipedia.org/wiki/Rhyme_scheme">rhyme scheme</a> it has?</p>
<p>From that challenge: we'll use the <a href="http://cmusphinx.sourceforge.net/">SPHINX project</a> from Carnegie Mellon University to detect if words rhyme. Use <a href="http://svn.code.sf.net/p/cmusphinx/code/trunk/cmudict/cmudict-0.7b">this pronouncing dictionary</a> in conjunction with <a href="http://svn.code.sf.net/p/cmusphinx/code/trunk/cmudict/cmudict-0.7b.phones">this phoneme description</a> to find rhyming words. Note that the dictionary uses the <a href="https://en.wikipedia.org/wiki/Arpabet">ARPAbet</a> phonetic transcription code and includes stress indicators for the vowel sounds.</p>
<h1>Input Description</h1>
<p>You'll be given a poem in plain text, with line breaks as expected. Example:</p>
<pre><code>  A bather whose clothing was strewed
  By winds that left her quite nude
  Saw a man come along
  And unless we are wrong
  You expected this line to be lewd.
</code></pre>
<h1>Output Description</h1>
<p>Your program should emit the rhyme scheme found in the poem. From the above example:</p>
<pre><code>aabba
</code></pre>
<p>(It's a Limerick.)</p>
<h1>Challenge Input</h1>
<pre><code>  There once was a young lady named bright
  Whose speed was much faster than light
  She set out one day
  In a relative way
  And returned on the previous night.
</code></pre>
<h2></h2>
<pre><code>  Once upon a midnight dreary, while I pondered, weak and weary,
  Over many a quaint and curious volume of forgotten lore—
  While I nodded, nearly napping, suddenly there came a tapping,
  As of some one gently rapping, rapping at my chamber door.
  "'Tis some visiter," I muttered, "tapping at my chamber door—
              Only this and nothing more."
</code></pre>
<h2></h2>
<pre><code>Brothers, who when the sirens roar
From office, shop and factory pour
'Neath evening sky;
By cops directed to the fug
Of talkie-houses for a drug,
Or down canals to find a hug
</code></pre>
<h2></h2>
<pre><code>Two roads diverged in a yellow wood,
And sorry I could not travel both
And be one traveler, long I stood
And looked down one as far as I could
To where it bent in the undergrowth;    
</code></pre>
<h1>Challenge Output</h1>
<pre><code>aabba
abcbbb
aabccc
abaab
</code></pre>
</div>
