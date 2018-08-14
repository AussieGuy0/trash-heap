# Radioactive Decay
<div class="md"><h1><a href="#IntermediateIcon"></a> <strong>(Intermediate)</strong>: Radioactive Decay</h1>
<p>Radioactive decay occurs when an unstable atomic nucleus tries to make itself become more stable. It does this by spitting bits of itself out - like <a href="https://www.youtube.com/watch?v=OETj9aTYO2Q">taking bits off your car to make it lighter</a>. While radioactive decay is an entirely random process, the probability of one type of nucleus decaying per second is well-defined.</p>
<p>There are two ways of describing this probability. The first is using a constant called λ (lambda). λ describes the probability of a specific type of atomic nucleus decaying per second. If λ=0, the probability is 0 - meaning the nucleus never decays, and is thus stable. If λ=0.5, every second there is a 50% chance the nucleus will decay. You get the point.</p>
<p>The second is using a value called t½ (the half-life). This describes how long it takes for exactly half of a sample to decay. For example, if the half-life of a nucleus is 10 seconds, and you start with a sample of 2000 nuclei:</p>
<ul>
<li>At the start, 2000 atoms remain - nothing has happened yet.</li>
<li>After 10 seconds, half of the 2000 atoms will have decayed. 1000 remain.</li>
<li>After 20 seconds, half of those 1000 will have decayed. 500 remain.</li>
<li>After 30 seconds, half of those 500 will have decayed. 250 remain.</li>
</ul>
<p>And so on, and so forth. This is all very simple - until you introduce the concept of a <em>decay chain</em>. This describes how a starting nucleus will decay into a 'daughter' nucleus, which in turn decays again into another type of nucleus - this happens all the way down the chain until the nucleus becomes stable.</p>
<p>Your challenge is: given a decay chain and λ values for each type of nucleus in the chain, calculate the percentage of each nucleus in the sample over time. This can be done by random sampling (the simpler way), or calculation of the exponential decays (for mathematicians). You can choose which method to do it by.</p>
<h1>Trouble understanding the concept?</h1>
<p>This challenge introduces a physics concept which may be new to you - don't worry if you have some issues understand what's going on. Imagine you have a bag of 400 marbles. These marbles can be different colours - at the start of the experiment the marbles are all red.</p>
<p>Let's say a red marble has a 10% chance of turning into a green one per second. A green marble has a 50% chance of turning into blue marble every second. This means that (roughly) 40 red marbles will have turned into green marbles after 1 second. We now have 360 red and 40 green.</p>
<p>Now, you have 360 red marbles and 40 green ones. Remember the green marbles have a 50% chance of turning into blue marbles. After another second (2 seconds in total), 50% of the green marbles turn into blue marbles, that is 20 of them. 10% of the remaining red marbles will turn green, that is 36 of them.</p>
<p>We now have 324 (400<em>90%</em>90%) red, 56 (the 20 that remain, and then the other 36 that just decayed) green and 20 blue. This carries on happening. Of course these are approximations, as we don't count any marbles that happen to change twice in one second. If the percentages of changing are low enough, however, this is negligible for our simulation.</p>
<p>Now, replace marble colour with 'type of nucleus' (aka. isotope), marble with nucleus (ie. an instance of a type of nucleus), and bag with sample. These percentages are the λ values - so the λ of the red marble, 10%, is 0.1.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>You will be first given a value <strong>t</strong>. This is the number of seconds to run your calculations for - ie. calculate the percentages of the nuclei at this time.</p>
<p>You will be then  given a line in the format:</p>
<pre><code>a-&gt;b-&gt;c-&gt;...-&gt;z
</code></pre>
<p>Where <code>a</code>...<code>z</code> are types of nucleus. <code>a</code> is the starting nucleus type of your sample, and <code>z</code> is the end of the chain; the stable nucleus.</p>
<p>You will then be given lines in the format:</p>
<pre><code>a: 0.0002
</code></pre>
<p>Where <code>a</code> is an unstable type of nucleus, and <code>0.0002</code> is the λ constant for <code>a</code>. The last one in the decay chain must have a λ of zero (stable).</p>
<h2>Output Description</h2>
<p>You will print a line for all nuclei in the decay chain in the format:</p>
<pre><code>a: 3.4%
</code></pre>
<p>Where <code>a</code> is a type of nucleus in the decay chain, and <code>3.4%</code> is the percentage of the sample that is nucleus type <code>a</code> after <strong>t</strong> seconds.</p>
<h1>Sample Inputs and Outputs</h1>
<h2>Sample Input</h2>
<pre><code>5000
a-&gt;b-&gt;c-&gt;d-&gt;s
a: 0.00007
b: 0.0005
c: 0.00013
d: 0.00022
s: 0
</code></pre>
<h2>Sample Output 1</h2>
<pre><code>a: 70.37%
b: 10.25%
c: 15.00%
d: 3.31%
s: 1.07%
</code></pre>
<h2>Sample Output 2</h2>
<pre><code>a: 70.76%
b: 11.00%
c: 14.48%
d: 2.80%
s: 0.96%
</code></pre>
<p>I'm using a random method so my results differ slightly (but are relatively consistent) each time. With a larger sample size your results will be more accurate. YMMV!</p>
<h1>Extension</h1>
<p>Plot the data as percentages over time! For the given input above, my test program gives <a href="http://i.imgur.com/evZO02O.png">this output</a> for t=5000 s and <a href="http://i.imgur.com/FtmQzsb.png">this output</a> for t=50000 s, where cooling colours are going down the decay chain. Make yours look really cool for extra points!</p>
</div>
