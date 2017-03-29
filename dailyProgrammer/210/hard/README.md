# Loopy Robots
<div class="md"><h1>Description</h1>
<p>Our robot has been deployed on an infinite plane at position (0, 0) facing north. He's programmed to <em>indefinitely</em> execute a command string. Right now he only knows three commands</p>
<ul>
<li>S - Step in the direction he's currently facing</li>
<li>R - Turn right (90 degrees)</li>
<li>L - Turn left (90 degrees)</li>
</ul>
<p>It's our job to determine if a command string will send our robot into an endless loop. (It may take many iterations of executing the command!) In other words, will executing some
command string enough times bring us back to our original coordinate, in our original orientation.</p>
<p>Well, technically he's stuck in a loop regardless.. but we want to know if he's going in a circle!</p>
<h1>Input Description</h1>
<p>You will accept a command string of arbitrary length. A valid command string will only contain the characters "S", "R", "L" however it is not required that a command string utilizes all commands. Some examples of valid command strings are</p>
<ul>
<li>S</li>
<li>RRL</li>
<li>SLLLRLSLSLSRLSLLLLS</li>
</ul>
<h1>Output Description</h1>
<p>Based on robot's behavior in accordance with a given command string we will output one of two possible solutions</p>
<p>A) That a loop was detected and how many cycles of the command string it took to return to the beginning of the loop</p>
<p>B) That no loop was detected and our precious robot has trudged off into the sunset </p>
<h1>Input</h1>
<ul>
<li>"SR" (Step, turn right)</li>
<li>"S" (Step)</li>
</ul>
<h1>Output</h1>
<ul>
<li>"Loop detected! 4 cycle(s) to complete loop" [<a href="http://i.imgur.com/kGsoPSX.png">Visual</a>]</li>
<li>"No loop detected!"</li>
</ul>
<h1>Challenge Input</h1>
<ul>
<li>SRLLRLRLSSS</li>
<li>SRLLRLRLSSSSSSRRRLRLR</li>
<li>SRLLRLRLSSSSSSRRRLRLRSSLSLS</li>
<li>LSRS</li>
</ul>
<h1>Credit</h1>
<p>Many thanks to Redditor <a href="/u/hutsboR">/u/hutsboR</a> for this submission to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a>. If you have any ideas, please submit them there!</p>
</div>
