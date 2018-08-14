# Re-emvoweler 2
<div class="md"><h1><em>(Hard)</em>: Re-emvoweler 2</h1>
<p><a href="http://www.reddit.com/r/dailyprogrammer/comments/1yzlde/022614_challenge_150_intermediate_reemvoweler_1/">This week's Intermediate challenge</a> involved re-emvoweling, which means reconstructing a series of words given their consonants and vowels separately, in order.</p>
<p>For most inputs, there are a huge number of valid ways to re-emvowel them. Your goal this time is to produce a valid output that also resembles an English sentence, as much as possible. For each sample input, there is one best answer (the sentence I actually used to produce the input). Good solutions that don't produce the best answer are acceptable, but you should aim for answers that are significantly better than random.</p>
<p>A typical strategy is to begin by analyzing a corpus of English text for word frequencies or other patterns. You can use whatever techniques or data sources you wish, but your program must run completely autonomously, without relying on human judgment during runtime.</p>
<p>The challenge inputs this time are all based on English sentences taken from the web. The word "a" <em>does</em> appear in these sentences. Other than the word "a", all words in the sentences appear in <a href="http://code.google.com/p/dotnetperls-controls/downloads/detail?name=enable1.txt">the Enable word list</a>, and none of the words contain punctuation.</p>
<p>Along with your solution, be sure to post your results from running the challenge inputs!</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input description</h2>
<p>Two strings, one containing only consonants, and one containing only vowels. There are no spaces in the input.</p>
<h2>Output description</h2>
<p>A space-separated series of words that could be disemvoweled into the input, each word of which must appear in your word list. The output should resemble an English sentence (without capitalization and punctuation) as closely as possible.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input</h2>
<pre><code>thffcrrprtdthtblckdndcrfwhdbnrdrd
eoieeoeaaoaeaaueaeeoee
</code></pre>
<h2>Sample Output</h2>
<pre><code>the officer reported that a blockade and a curfew had been ordered
</code></pre>
<h1>Challenge Inputs</h1>
<h2>Challenge Input 1</h2>
<pre><code>thdcryptntmsbltdtrmnthtthplnsrnddfrtypftrnsprt
eeioeaiaeoeeieaeaaeieeoaeoao
</code></pre>
<h2>Challenge Input 2</h2>
<pre><code>nfcthblvdthrwsnthrcncptytbyndhmnndrstndngdtthmrvlscmplxtyndthclckwrkprcsnfthnvrs
iaeeieeeeaaoeoeeeouaueaiueoeaeouoeiaeooeiiooeuiee
</code></pre>
<h2>Challenge Input 3</h2>
<pre><code>thhmrthpthsthtnsnvnthblmngsndtrckllcnsprtnsrthtthtlftngrtrvlngbckthrtyyrstnsrhsprntsmtndltmtlymtcngvntsvntgnwbfrlydscrbdsclssc
euoeaoeeioeeeooiouaaoieoeueaeaeoaeeaeaeiaieaoeueiaeeeauiaeaeaieiiaeoeaieieaaai
</code></pre>
<h1>Note</h1>
<p>Thanks to <a href="/u/abecedarius">/u/abecedarius</a> for inspiring this week's challenges on <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a>!</p>
</div>
