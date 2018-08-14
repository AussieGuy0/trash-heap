# Garage Door Opener
<div class="md"><h1>Description</h1>
<p>You just got a new garage door installed by the Automata™ Garage Door Company. You are having a lot of fun playing with the remote clicker, opening and closing the door, scaring your pets and annoying the neighbors.</p>
<p>The clicker is a one-button remote that works like this:</p>
<ol>
<li><p>If the door is <code>OPEN</code> or <code>CLOSED</code>, clicking the button will cause the door to move, until it completes the cycle of opening or closing. </p>
<p>Door: Closed -&gt; Button clicked -&gt; Door: Opening -&gt; Cycle complete -&gt; Door: Open.</p></li>
<li><p>If the door is currently opening or closing, clicking the button will make the door stop where it is. When clicked again, the door will go the opposite direction, until complete or the button is clicked again.</p></li>
</ol>
<p>We will assume the initial state is CLOSED.</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input description</h2>
<p>Input will be a series of commands (can be hard coded, no need to parse):</p>
<pre><code>button_clicked
cycle_complete
button_clicked
button_clicked
button_clicked
button_clicked
button_clicked
cycle_complete
</code></pre>
<h2>Output description</h2>
<p>Output should be the state of the door and the input commands, such as:</p>
<pre><code>Door: CLOSED
&gt; Button clicked.
Door: OPENING
&gt; Cycle complete.
Door: OPEN
&gt; Button clicked.
Door: CLOSING
&gt; Button clicked.
Door: STOPPED_WHILE_CLOSING
&gt; Button clicked.
Door: OPENING
&gt; Button clicked.
Door: STOPPED_WHILE_OPENING
&gt; Button clicked.
Door: CLOSING
&gt; Cycle complete.
Door: CLOSED
</code></pre>
<h1>Notes/Hints</h1>
<p>This is an example of a simple <a href="https://en.wikipedia.org/wiki/Finite-state_machine">Finite State Machine</a> with 6 States and 2 inputs.</p>
<h1>Bonus</h1>
<p>Bonus challenge - The door has an infrared beam near the bottom, and if something is breaking the beam, (your car, your cat, or a baby in a stroller) the door will be BLOCKED and will add the following rules:</p>
<ol>
<li>If the door is currently CLOSING, it will reverse to OPENING until completely OPEN. It will remain BLOCKED, however, until the input BLOCK_CLEARED is called.</li>
<li>Any other state, it will remain in that position, until the input BLOCK_CLEARED is called, and then it will revert back to it's prior state before it was blocked. Button clicks will be discarded. If the door was already in the process of opening, it will continue to OPEN until CYCLE_COMPLETE is called.</li>
</ol>
<p>Bonus Challenge Input</p>
<pre><code>button_clicked
cycle_complete
button_clicked
block_detected
button_clicked
cycle_complete
button_clicked
block_cleared
button_clicked
cycle_complete
</code></pre>
<p>Bonus Challenge output:</p>
<pre><code>Door: CLOSED
&gt; Button clicked
Door: OPENING
&gt; Cycle complete
Door: OPEN
&gt; Button Clicked
Door: CLOSING
&gt; Block detected!
Door: EMERGENCY_OPENING
&gt; Button clicked.
Door: EMERGENCY_OPENING
&gt; Cycle complete.
Door: OPEN_BLOCKED
&gt; Button clicked
Door: OPEN_BLOCKED
&gt; Block cleared
Door: OPEN
&gt; Button clicked
Door: CLOSING
&gt; Cycle complete
Door: CLOSED
</code></pre>
<h1>Finally</h1>
<p>Have a good challenge idea?</p>
<p>Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
<p>Thanks to <a href="/u/Philboyd_Studge">/u/Philboyd_Studge</a> for this <a href="https://www.reddit.com/r/dailyprogrammer_ideas/comments/3sggs4/easy_garage_door_opener/">challenge idea</a>.</p>
</div>
