# Calculating Shannon Entropy of a String
<div class="md"><h1>Description</h1>
<p>Shannon entropy was introduced by Claude E. Shannon in his 1948 paper "A Mathematical Theory of Communication". Somewhat related to the physical and chemical concept entropy, the Shannon entropy measures the uncertainty associated with a random variable, i.e. the expected value of the information in the message (in classical informatics it is measured in bits). This is a key concept in information theory and has consequences for things like compression, cryptography and privacy, and more. </p>
<p>The Shannon entropy <em>H</em> of input sequence <em>X</em> is calculated as -1 times the sum of the frequency of the symbol <em>i</em> times the log base 2 of the frequency:</p>
<pre><code>            n
            _   count(i)          count(i)
H(X) = -1 * &gt;   --------- * log  (--------)
            -       N          2      N
            i=1
</code></pre>
<p>(That funny thing is the summation for i=1 to n. I didn't see a good way to do this in Reddit's markup so I did some crude ASCII art.)</p>
<p>For more, see Wikipedia for <a href="https://en.wikipedia.org/wiki/Entropy_(information_theory">Entropy in information theory</a>). </p>
<h1>Input Description</h1>
<p>You'll be given a string, one per line, for which you should calculate the Shannon entropy. Examples:</p>
<pre><code>1223334444
Hello, world!
</code></pre>
<h1>Output Description</h1>
<p>Your program should emit the calculated entropy values for the strings to at least five decimal places. Examples:</p>
<pre><code>1.84644
3.18083
</code></pre>
<h1>Challenge Input</h1>
<pre><code>122333444455555666666777777788888888
563881467447538846567288767728553786
https://www.reddit.com/r/dailyprogrammer
int main(int argc, char *argv[])
</code></pre>
<h1>Challenge Output</h1>
<pre><code>2.794208683
2.794208683
4.056198332
3.866729296
</code></pre>
</div>
