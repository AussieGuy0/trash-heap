# Making Waves
<div class="md"><p>This challenge is a bit uncoventional, so I apologize in advance to anyone who
may feel excluded due to language or other constraints. Also, I couldn't think
of fun backstory so feel free to make one up in your comments.</p>
<h1>Description</h1>
<p>For today's challenge we will be focusing on generating a serieses waveforms
at specific frequencies, known as musical notes. Ideally you would be able to
push these frequencies directly to your speakers, but this can be difficult
depending on your operating system.</p>
<p>For Linux systems with ALSA, you can use the <code>aplay</code> utility.</p>
<pre><code>./solution | aplay -f U8 -r 8000
</code></pre>
<p>For other systems you can use Audacity,
which features a raw data import utility.</p>
<h1>Input Description</h1>
<p>You will be given a sample rate in Hz (bytes per second), followed by a
duration for each note (milliseconds), and then finally a string of notes
represented as the letters <code>A</code> through <code>G</code> (and <code>_</code> for rest).</p>
<h1>Output Description</h1>
<p>You should output a string of bytes (unsigned 8 bit integers) either as a
binary stream, or to a binary file. These bytes should represent the
waveforms<sup>[1]</sup> for the frequencies<sup>[2]</sup> of the notes.</p>
<h1>Challenge Input</h1>
<pre><code>8000
300
ABCDEFG_GFEDCBA
</code></pre>
<h1>Challenge Output</h1>
<p>Since the output will be a string of 36000 bytes, it is provided below as a
download. Note that it does not have to output exactly these bytes, but it
must be the same notes when played.</p>
<p>You can listen to the data either by playing it straight with aplay, which
should pick up on the format automatically, or by piping to aplay and
specifying the format, or by importing into audacity and playing from there.</p>
<p><a href="https://raw.githubusercontent.com/G33kDude/DailyProgrammer/master/%5B2016-06-15%5D%20Challenge%20%23271%20%5BIntermediate%5D%20Making%20Waves/out.pcm">Download</a></p>
<h1>Bonus</h1>
<p>Wrap your output with valid WAV/WAVE file headers<sup>[3]</sup> so it can be played directly
using any standard audio player.</p>
<p><a href="https://raw.githubusercontent.com/G33kDude/DailyProgrammer/master/%5B2016-06-15%5D%20Challenge%20%23271%20%5BIntermediate%5D%20Making%20Waves/out.wav">Download</a></p>
<h1>Notes</h1>
<ol>
<li><p><a href="https://en.wikipedia.org/wiki/Waveform">Wikipedia</a> has some formulas for
waveform generation. Note that <code>t</code> is measured in wavelengths.</p></li>
<li><p><a href="http://www.phy.mtu.edu/%7Esuits/notefreqs.html">This page</a> lists the exact
frequencies for every note.</p></li>
<li><p>A good resource for WAV/WAVE file headers can be found
<a href="http://www.topherlee.com/software/pcm-tut-wavformat.html">here</a>. Note that by "Format chunk marker. Includes trailing null", the author of that page means trailling space.</p></li>
<li><p>One of our readers pointed out that to accurately (re)construct a given audio signal via
discrete samples, the sampling rate must (strictly) exceed twice the highest frequency
from that signal. Otherwise, there will be artifacts such as 'aliasing'. Keep this in mind
when experimenting with higher octaves, such as the 8th and above.</p></li>
</ol>
<h1>Finally</h1>
<p>Have a good challenge idea?</p>
<p>Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
</div>
