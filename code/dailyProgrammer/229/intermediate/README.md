# Reverse Fizz Buzz
<div class="md"><h1>Description</h1>
<p>Imagine that I've written a program to solve a modified version of <a href="https://www.reddit.com/r/dailyprogrammer/comments/s6bas/4122012_challenge_39_easy/">Fizz Buzz</a>. My program takes as input some positive integers, like this:</p>
<pre><code>2 5 4
</code></pre>
<p>These input numbers correspond to letters, in this case <code>a</code>, <code>b</code>, and <code>c</code>. Now, my program loops through all integers starting at 1, printing out one line at a time, each line containing one or more letters in alphabetical order. If the current number is divisible by 2, the line will contain <code>a</code>. If it's divisible by 5, it'll contain <code>b</code>. If it's divisible by 4, it'll contain <code>c</code>.</p>
<p>So for instance, when the loop reaches 2, my program will output <code>a</code>. When the loop reaches 8 it'll output <code>ac</code>. At 30 it'll output <code>ab</code>. At 7 no line will be output, not even a blank line. Thus the output will begin like this:</p>
<pre><code>a
ac
b
a
ac
ab
ac
a
b
ac
a
abc
a
</code></pre>
<p>Your challenge is to reverse my program. Write a program that takes the beginning of the output from my program, and determines what input my program was given to produce it. There will be more than one possible answer, so find the solution with the smallest possible numbers.</p>
<h1>Examples</h1>
<p>Since this is Intermediate, it's okay to use brute force. As long as you can solve these examples in less than a minute, that's fine. But definitely test your program on the examples! (And don't worry about input or output format too much. Just do whatever's easiest for you to get the solutions.)</p>
<h2>Example Input 1</h2>
<pre><code>a
b
a
a
b
a
</code></pre>
<h2>Example Output 1</h2>
<pre><code>3 5
</code></pre>
<h2>Example Input 2</h2>
<pre><code>b
be
ab
be
b
abe
b
</code></pre>
<h2>Example Output 2</h2>
<pre><code>3 1 8 8 2
</code></pre>
<p>(Note that in this case, you can infer that there must be at least 5 numbers in the solution, because of the presence of the letter <code>e</code>, even though <code>c</code> and <code>d</code> don't appear. The numbers corresponding to <code>c</code> and <code>d</code> must be high enough for them not to have appeared yet.)</p>
<h2>Example Input 3</h2>
<pre><code>a
b
c
d
a
ab
</code></pre>
<h2>Example Output 3</h2>
<pre><code>6 9 10 11
</code></pre>
<h1>Optional challenge input</h1>
<p><a href="https://gist.github.com/cosmologicon/3ff90d20efaa21887d32">Get the challenge input here.</a> You probably won't be able to brute force this one. How fast can you make your program run on this input?</p>
<p><em>Thanks to <a href="/u/Blackshell">u/Blackshell</a> for suggesting this challenge in <a href="/r/dailyprogrammer_ideas">r/dailyprogrammer_ideas</a>!</em></p>
</div>
