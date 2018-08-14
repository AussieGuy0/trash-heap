# Combination Lock
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Easy)</em>: Combination Lock</h1>
<p><a href="http://en.wikipedia.org/wiki/Combination_lock">Combination locks</a> are mechanisms that are locked until a specific number combination is input. Either the input is a single dial that must rotate around in a special procedure, or have three disks set in specific positions. This challenge will ask you to compute how much you have to spin a single-face lock to open it with a given three-digit code.</p>
<p>The procedure for our lock is as follows: (lock-face starts at number 0 and has up to N numbers)</p>
<ul>
<li>Spin the lock a full 2 times clockwise, and continue rotating it to the code's first digit.</li>
<li>Spin the lock a single time counter-clockwise, and continue rotating to the code's second digit.</li>
<li>Spin the lock clockwise directly to the code's last digit.</li>
</ul>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>Input will consist of four space-delimited integers on a single line through console standard input. This integers will range inclusively from 1 to 255. The first integer is N: the number of digits on the lock, starting from 0. A lock where N is 5 means the printed numbers on the dial are 0, 1, 2, 3, and 5, listed counter-clockwise. The next three numbers are the three digits for the opening code. They will always range inclusively between 0 and N-1.</p>
<h2>Output Description</h2>
<p>Print the total rotation increments you've had to rotate to open the lock with the given code. See example explanation for details.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<pre><code>5 1 2 3
</code></pre>
<h2>Sample Output</h2>
<pre><code>21
</code></pre>
<p>Here's how we got that number:</p>
<ul>
<li>Spin lock 2 times clockwise: +10, at position 0</li>
<li>Spin lock to first number clockwise: +1, at position 1</li>
<li>Spin lock 1 time counter-clockwise: +5, at position 1</li>
<li>Spin lock to second number counter-clockwise: +4, at position 2</li>
<li>Spin lock to third number clockwise: +1, at position 3</li>
</ul>
</div>
