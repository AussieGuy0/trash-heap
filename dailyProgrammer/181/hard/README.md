# Deconstructing Audio
<div class="md"><h1>Description</h1>
<p>You're part of an innovative new company whose primary goal is to improve the music catalogue and its databases for integration with Apple,Linux and Microsoft products. You notice a significant lack of metadata given by users and wonder if there's a way to automate the process instead.</p>
<h1>Formal Inputs &amp; Outputs</h1>
<p>Given an audio file that contains music (this won't work on speech or anything irregular) you must create a program that can determine the <a href="http://en.wikipedia.org/wiki/Tempo">BPM/Tempo</a> of that audio file.</p>
<h2>Input description</h2>
<p>On input you should pass your file through for analysis.</p>
<h2>Output description</h2>
<p>The program should output the Beats per minute of a song</p>
<p>For example</p>
<pre><code>120bpm
</code></pre>
<p>or</p>
<pre><code>79bpm
</code></pre>
<p><a href="http://songbpm.com/">Here</a> is a good website to test your results against</p>
<h1>Notes/Hints</h1>
<p>For the less musically inclined, make sure your music is in 4/4(common time) before analyzing. Analyzing odd time signatured songs might make this significantly harder. This brings us neatly to the bonus challenge...</p>
<p>There are a few ways to go about this challenge from the exceedingly simple; Pulling the data from an already existing database. Or the actual way, using various signal processing techniques to arrive at an accurate result.</p>
<p>Here is a good article on beat detection and implementing the algorithm</p>
<p><a href="http://archive.gamedev.net/archive/reference/programming/features/beatdetection/index.html">http://archive.gamedev.net/archive/reference/programming/features/beatdetection/index.html</a></p>
<p>You may also want to check out <a href="http://en.wikipedia.org/wiki/Comb_filter">Comb filtering</a></p>
<h1>Bonus</h1>
<p>Output the time signature of the song</p>
<h1>Finally</h1>
<p>We have an IRC channel over at</p>
<p>webchat.freenode.net in #reddit-dailyprogrammer</p>
<p>Stop on by :D</p>
<p>Have a good challenge idea?</p>
<p>Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
</div>
