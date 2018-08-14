# Checksums
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Easy)</em>: Checksums</h1>
<p><a href="http://en.wikipedia.org/wiki/Checksum">Checksums</a> are a tool that allow you to verify the integrity of data (useful for networking, security, error-correction, etc.). Though there are <em>many</em> different Checksum algorithms, the general usage is that you give raw-data to your algorithm of choice, and a block of data (usually smaller than the given data) is generated and can later be used by re-computing the checksum and comparing the original and recent values.</p>
<p>A classic example for how helpful Checksums are is with data-networking: imagine you have a packet of information that must be guaranteed the same after receiving it. Before sending the data, you can compute its checksum, and send both blocks together. When received, the data can be used to re-compute a checksum, and validate that the given checksum and your own checksum are the same. The subject is much more complex, since there are issues of <a href="http://en.wikipedia.org/wiki/Entropy_(information_theory)">data-entropy</a> and the importance of the checksum's size compared to the raw data size.</p>
<p>This example is so common in network programming, one of the <a href="http://en.wikipedia.org/wiki/Transmission_Control_Protocol#Checksum_computation">basic Internet networking protocols (TCP)</a> has it built-in!</p>
<p>Your goal will be more modest: you must implement a specific checksum algorithm (<a href="http://en.wikipedia.org/wiki/Fletcher%27s_checksum">Fletcher's 16-bit Checksum</a>) for given lines of text input. The <a href="http://en.wikipedia.org/wiki/Fletcher%27s_checksum#Straightforward">C-like language pseudo-code found on Wikipedia</a> is a great starting point!</p>
<p><strong>Note:</strong> Make sure to explicitly implement this algorithm, and not call into other code (libraries). The challenge here is focused on your implementation of the algorithm.</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>On standard console input, you will first be given an integer N which ranges inclusively from 1 to 256. After this line, you will receive N-lines of ASCII text. This text will only contain regular printable characters, and will all be on a single line of input.</p>
<h2>Output Description</h2>
<p>For each line of input, print the index (starting from 1) and the 16-bit Fletcher's checksum as a 4-digit hexadecimal number.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<pre><code>3
Fletcher
Sally sells seashells by the seashore.
Les chaussettes de l'archi-duchesse, sont-elles seches ou archi-seches ?
</code></pre>
<h2>Sample Output</h2>
<pre><code>1 D330
2 D23E
3 404D
</code></pre>
</div>
