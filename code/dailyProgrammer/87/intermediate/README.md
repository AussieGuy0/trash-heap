# (Chord lookup)
<div class="md"><p>For this challenge, your task is to write a program that takes a musical chord name from input (like <code>Gm7</code>) and outputs the notes found in that chord (<code>G A# D F</code>). If you're no musician, don't worry -- the progress is quite simple. The first thing you need to know about is the 12 notes of the chromatic scale:</p>
<pre><code>C C# D D# E F F# G G# A A# B
</code></pre>
<p>The intervals between two notes is expressed in semitones. For example, there are three semitones between the <code>D</code> and the <code>F</code> on this scale. Next, you'll need to know about the different kinds of chords themselves:</p>
<table><thead>
<tr>
<th>chord</th>
<th>symbol</th>
<th>tones</th>
</tr>
</thead><tbody>
<tr>
<td colspan="3"></td>
</tr>
<tr>
<td>major</td>
<td>(nothing)</td>
<td>[0, 4, 7]</td>
</tr>
<tr>
<td>minor</td>
<td>m</td>
<td>[0, 3, 7]</td>
</tr>
<tr>
<td>dom. 7th</td>
<td>7</td>
<td>[0, 4, 7, 10]</td>
</tr>
<tr>
<td>minor 7th</td>
<td>m7</td>
<td>[0, 3, 7, 10]</td>
</tr>
<tr>
<td>major 7th</td>
<td>maj7</td>
<td>[0, 4, 7, 11]</td>
</tr>
</tbody></table>
<p>To find out the notes in a chord, take the base note, then select the tones from the chromatic scale relative to the numbers in the list of tone intervals. For example, for <code>F7</code>, we look up the chord:</p>
<pre><code>7 → dom. 7th → [0, 4, 7, 10]
</code></pre>
<p>Then we step <code>[0, 4, 7, 10]</code> semitones up from <code>F</code> in the scale, wrapping if necessary:</p>
<pre><code>[F+0, F+4, F+7, F+10] → [F, A, C, D#]
</code></pre>
<p>Those are the notes in our chord.</p>
<p>If you know a thing or two about music theory: for extra credit, tweak your program so that it...</p>
<ul>
<li><p>outputs the chords "correctly", using <code>b</code> and <code>bb</code> and <code>x</code> where necessary</p></li>
<li><p>supports more complex chords like <code>A9sus4</code> or <code>Emadd13</code>.</p></li>
</ul>
<p>(Bad submission timing, and I have to go right now -- expect [easy] and [difficult] problems tomorrow. Sorry!)</p>
</div>
