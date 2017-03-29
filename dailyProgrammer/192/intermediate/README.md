# Markov Chain Error Detection
<div class="md"><h1><a href="#IntermediateIcon"></a> <strong>(Intermediate)</strong>: Markov Chain Error Detection</h1>
<p>A Markov process describes a system where the probability of changing to a certain state is dependent on the current state. A Markov Chain is a system where there is a discrete set of states. One application of this is in some predictive-texting systems. For example, a Markov chain can describe how, in writing, the word 'car' has a higher probability of being followed by the word 'key' than the word 'banana' or 'the'. This system is handy as it allows the predictive-texting system to adapt (in a limited way) to the specific user. For example, for the word 'source', an academic would have a likely following word as 'reference', whereas a programmer would have a likely following word as 'code' - as the text 'source reference' might be used a lot by an academic whereas the text 'source code' would be used a lot by a developer. This is of course a crude example but it illustrates the point nicely.</p>
<p>The Markov chain could be represent in memory via a matrix. For example, for a small sample of 4 words in a paragraph, the matrix may look like:</p>
<table><thead>
<tr>
<th align="right"></th>
<th>The</th>
<th>Thing</th>
<th>Did</th>
<th>Do</th>
</tr>
</thead><tbody>
<tr>
<td align="right"><strong>The</strong></td>
<td>0</td>
<td>12</td>
<td>0</td>
<td>0</td>
</tr>
<tr>
<td align="right"><strong>Thing</strong></td>
<td>0</td>
<td>0</td>
<td>3</td>
<td>5</td>
</tr>
<tr>
<td align="right"><strong>Did</strong></td>
<td>6</td>
<td>0</td>
<td>0</td>
<td>11</td>
</tr>
<tr>
<td align="right"><strong>Do</strong></td>
<td>8</td>
<td>0</td>
<td>0</td>
<td>0</td>
</tr>
</tbody></table>
<p>At a glance you can see the number of times the word 'thing' was followed by 'do' more than 'did', and the word 'do' was preceded more by 'did' than 'thing'. There are other ways to store this data, of course - the implementation of this part is up to you.</p>
<p>This can be used to detect errors in input. For example, you could use the above table to predict that a sentence containing 'the do' is likely to be erroneous. Your challenge today will involve letters in words (rather than words in sentences) to predict if a word is likely to be misspelled or not.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>The program is to utilise <a href="https://www.reddit.com/r/dailyprogrammer/comments/2nluof/request_the_ultimate_wordlist/">a word list of your choice</a> to construct Markov chain data for the occurrence of certain letters following other letters. For example, the word 'occurrence' would have a matrix that looks like:</p>
<table><thead>
<tr>
<th></th>
<th>O</th>
<th>C</th>
<th>U</th>
<th>R</th>
<th>E</th>
<th>N</th>
</tr>
</thead><tbody>
<tr>
<td><strong>O</strong></td>
<td>0</td>
<td>1</td>
<td>0</td>
<td>0</td>
<td>0</td>
<td>0</td>
</tr>
<tr>
<td><strong>C</strong></td>
<td>0</td>
<td>1</td>
<td>1</td>
<td>0</td>
<td>1</td>
<td>0</td>
</tr>
<tr>
<td><strong>U</strong></td>
<td>0</td>
<td>0</td>
<td>0</td>
<td>1</td>
<td>0</td>
<td>0</td>
</tr>
<tr>
<td><strong>R</strong></td>
<td>0</td>
<td>0</td>
<td>0</td>
<td>1</td>
<td>1</td>
<td>0</td>
</tr>
<tr>
<td><strong>E</strong></td>
<td>0</td>
<td>0</td>
<td>0</td>
<td>0</td>
<td>0</td>
<td>1</td>
</tr>
<tr>
<td><strong>N</strong></td>
<td>0</td>
<td>1</td>
<td>0</td>
<td>0</td>
<td>0</td>
<td>0</td>
</tr>
</tbody></table>
<p>Of course with more data used to populate the table the numbers would be larger and more meaningful.</p>
<p>The program is also to accept a word to compare against the Markov chain - your program will predict whether the word is likely to be misspelled or not. You may ask 'why not just check against a word-list?' In most cases that would be fine. However, is a word is amalgamated like errorcorrection then this system should still find that the word is likely to be valid (if not malformed.)</p>
<h2>Output Description</h2>
<p>You have some freedom in this section. The specific way of determining the likelihood of a word being invalid is up to you. A naive one would check if the word contains any consecutive letters that have a 0 for the Markov chain count - for example, the word 'examqle' is likely to misspelled as Q probably never follows M in the word-list. You will need to do some of the testing of this yourself, and hence different people's solutions may differ.</p>
<h1>Sample Inputs and Outputs</h1>
<h2>Word List Data</h2>
<p>You can use some of the word lists linked to in <a href="https://www.reddit.com/r/dailyprogrammer/comments/2nluof/request_the_ultimate_wordlist/">our currently-stickied post</a> (at the time of writing.)</p>
<h2>Sample Input</h2>
<p>I assume you can come up with some testing data yourself - just pick some actual words to test for validity, and fake words to test your program with, like horqqar or axumilog.</p>
<h1>Further Reading</h1>
<p>Wikipedia page on Markov chains is <a href="https://en.wikipedia.org/wiki/Markov_chain">here</a>. An interesting use of Markov chains is automatic text generation based on previous input to train the program, <a href="http://vedantmisra.com/markov-chain-paper-title-generator/">like this cool article</a>. </p>
</div>
