# De-columnizing
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Easy/Intermediate)</em>: De-columnizing</h1>
<p>Often, column-style writing will put images and features to the left or right of the body of text, for example:</p>
<pre><code>24
This is an example piece of text. This is an exam-
ple piece of text. This is an example piece of
text. This is an example
piece of text. This is a +-----------------------+
sample for a challenge.  |                       |
Lorum ipsum dolor sit a- |       top class       |
met and other words. The |        feature        |
proper word for a layout |                       |
like this would be type- +-----------------------+
setting, or so I would
imagine, but for now let's carry on calling it an
example piece of text. Hold up - the end of the
                 paragraph is approaching - notice
+--------------+ the double line break for a para-
|              | graph.
|              |
|   feature    | And so begins the start of the
|   bonanza    | second paragraph but as you can
|              | see it's only marginally better
|              | than the other one so you've not
+--------------+ really gained much - sorry. I am
                 certainly not a budding author
as you can see from this example input. Perhaps I
need to work on my writing skills.
</code></pre>
<p>In order to fit into the column format, some words are hyphenated. For the purpose of the challenge, you may assume that any hyphens at the end of a line join a single un-hyphenated word together (for example, the <code>exam-</code> and <code>ple</code> in the above input form the word <code>example</code> and not <code>exam-ple</code>). However, hyphenated words that do not span multiple lines should retain their hyphens.  Side features will only appear at the far left or right of the input, and will always be bordered by the <code>+---+</code> style shown above. They will also never have 'holes' in them, like this:</p>
<pre><code>+--------------------+
|                    |
| Inside the feature |
|                    |
| +----------------+ |
| |                | |
| |     Outside    | |
| |                | |
| +----------------+ |
|                    |
+--------------------+
</code></pre>
<p>Paragraphs in the input are separated by double line breaks, like Reddit markdown. Your task today is to extract just the paragraph text from the input, removing the feature-boxes.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Specification</h2>
<p>You'll be given a number <strong>N</strong> on one line, followed by <strong>N</strong> further lines of input like the example in the description above.</p>
<h2>Output Description</h2>
<p>Output just the paragraph text, de-hyphenating words where appropriate (ie. a line of text ends with a hyphen).</p>
<h1>Sample Inputs and Outputs</h1>
<h2>Example 1</h2>
<p>This corresponds to the input given in the Description.</p>
<h3>Output</h3>
<p>This is an example piece of text. This is an example piece of text. This is an example piece of text. This is an example piece of text. This is a sample for a challenge. Lorum ipsum dolor sit amet and other words. The proper word for a layout like this would be typesetting, or so I would imagine, but for now let's carry on calling it an example piece of text. Hold up - the end of the paragraph is approaching - notice the double line break for a paragraph.</p>
<p>And so begins the start of the second paragraph but as you can see it's only marginally better than the other one so you've not really gained much - sorry. I am certainly not a budding author as you can see from this example input. Perhaps I need to work on my writing skills.</p>
<h2>Example 2</h2>
<h3>Input</h3>
<pre><code>22
+-------------+ One hundred and fifty quadrillion,
|             | seventy-two trillion, six hundred
| 150 072 626 | and twenty-six billion, eight hun-
| 840 312 999 | dred and fourty million, three
|             | hundred and thirteen thousand sub-
+-------------+ tract one is a rather large prime
                number which equals one to five if
calculated modulo two to six respectively.

However, one other rather more in- +-------------+
teresting number is two hundred    |             |
and twenty-one quadrillion, eight  | 221 806 434 |
hundred and six trillion, four     | 537 978 679 |
hundred and thirty-four billion,   |             |
five hundred and thirty-seven mil- +-------------+
million, nine hundred and seven-
                                ty-eight thousand,
+-----------------------------+ six hundred and
|                             | seventy nine,
| Subscribe for more Useless  | which isn't prime
|      Number Facts(tm)!      | but is the 83rd
+-----------------------------+ Lucas number.
</code></pre>
<h3>Output</h3>
<p>One hundred and fifty quadrillion, seventy-two trillion, six hundred and twenty-six billion, eight hundred and fourty million, three hundred and thirteen thousand subtract one is a rather large prime number which equals one to five if calculated modulo two to six respectively.</p>
<p>However, one other rather more interesting number is two hundred and twenty-one quadrillion, eight hundred and six trillion, four hundred and thirty-four billion, five hundred and thirty-seven milmillion, nine hundred and seventy-eight thousand, six hundred and seventy nine, which isn't prime but is the 83rd Lucas number.</p>
<h2>Example 3</h2>
<h3>Input</h3>
<pre><code>16
+----------------+ Lorem ipsum dolor sit amet,
|                | consectetur adipiscing elit,
|  Aha, now you  | sed do eiusmod tempor incid-
|  are stumped!! | idunt ut labore et dolore
|                | magna aliqua. Ut enim ad mi-
|       +--------+ nim veniam, quis nostrud ex-
|  top  |          ercitation ullamco laboris
|  kek  | nisi ut aliquip ex.
|       |                       +-------------+
+-------+ Duis aute irure dolor |             |
in repre-henderit in voluptate  | Nothing to  |
velit esse cillum dolore eu fu- |  see here.  |
giat nulla pariatur. Excepteur  |             |
sint occaecat cupidatat non     +-------------+
proident, sunt in culpa qui of-
ficia deserunt mollit anim id est laborum.
</code></pre>
<h3>Output</h3>
<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex.</p>
<p>Duis aute irure dolor in repre-henderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
<h2><a href="#IntermediateIcon"></a> Extension (Intermediate)</h2>
<p>At the start of each paragraph in your output, list the text of each feature associated with that paragraph. A feature is "associated" with a paragraph if the top of the feature box (the <code>+--------+</code>) starts on or below the line that the paragraph starts on. For example, the outputs for the above three examples would be:</p>
<h3>Example 1 Output</h3>
<p>(top class feature) (feature bonanza) This is an example piece of text. This is an example piece of text. This is an example piece of text. This is an example piece of text. This is a sample for a challenge. Lorum ipsum dolor sit amet and other words. The proper word for a layout like this would be typesetting, or so I would imagine, but for now let's carry on calling it an example piece of text. Hold up - the end of the paragraph is approaching - notice the double line break for a paragraph.</p>
<p>And so begins the start of the second paragraph but as you can see it's only marginally better than the other one so you've not really gained much - sorry. I am certainly not a budding author as you can see from this example input. Perhaps I need to work on my writing skills.</p>
<h3>Example 2 Output</h3>
<p>(<strong>150 072 626 840 312 999</strong>) One hundred and fifty quadrillion, seventy-two trillion, six hundred and twenty-six billion, eight hundred and fourty million, three hundred and thirteen thousand subtract one is a rather large prime number which equals one to five if calculated modulo two to six respectively.</p>
<p>(<strong>221 806 434 537 978 679</strong>) (<strong>Subscribe for more Useless Number Facts(tm)!</strong>) However, one other rather more interesting number is two hundred and twenty-one quadrillion, eight hundred and six trillion, four hundred and thirty-four billion, five hundred and thirty-seven milmillion, nine hundred and seventy-eight thousand, six hundred and seventy nine, which isn't prime but is the 83rd Lucas number.</p>
<h3>Example 3 Output</h3>
<p>(<strong>Aha, now you are stumped! top kek</strong>) (<strong>Nothing to see here.</strong>) Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex.</p>
<p>Duis aute irure dolor in repre-henderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
<h1>Finally</h1>
<p>Got any cool challenge ideas? Submit them to <a href="/r/DailyProgrammer_Ideas">/r/DailyProgrammer_Ideas</a>!</p>
</div>
