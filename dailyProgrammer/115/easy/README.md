# Guess-that-number game!
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Easy)</em>: Guess-that-number game!</h1>
<p>A "guess-that-number" game is exactly what it sounds like: a number is guessed at random by the computer, and you must guess that number to win! The only thing the computer tells you is if your guess is below or above the number.</p>
<p>Your goal is to write a program that, upon initialization, guesses a number between 1 and 100 (inclusive), and asks you for your guess. If you type a number, the program must either tell you if you won (you guessed the computer's number), or if your guess was below the computer's number, or if your guess was above the computer's number. If the user ever types "exit", the program must terminate.</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>At run-time, expect the user to input a number from 1 to 100 (inclusive), or the string "exit", and treat all other conditions as a wrong guess.</p>
<h2>Output Description</h2>
<p>The program must print whether or not your guess was correct, otherwise print if your guess was below or above the computer's number.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<p>Let "C&gt;" be the output from your applicatgion, and "U&gt;" be what the user types:</p>
<pre><code>C&gt; Welcome to guess-that-numbers game! I have already picked a number in [1, 100]. Please make a guess. Type "exit" to quit.
U&gt; 1
C&gt; Wrong. That number is below my number.
U&gt; 50
C&gt; Wrong. That number is above my number.
...
U&gt; 31
C&gt; Correct! That is my number, you win! &lt;Program terminates&gt;
</code></pre>
</div>
