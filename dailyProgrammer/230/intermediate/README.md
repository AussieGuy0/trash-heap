# Word Compactification
<div class="md"><h1><a href="#IntermediateIcon"></a> <em>(Intermediate)</em>: Word Compactification</h1>
<p>Sam is trying to create a logo for his company, but the CEOs are fairly stingy and only allow him a limited number of <a href="https://en.wikipedia.org/wiki/Movable_type#Typesetting">metal letter casts</a> for the letter head, so as many letters should be re-used in the logo as possible. The CEOs also decided to use every single word that came up in the board meeting for the company name, so there might be a lot of words. Some puzzles such as crosswords work like this, by putting words onto a grid in such a way that words can share letters; in a crossword, this is an element of the puzzle. For example:</p>
<pre><code>       D
   L   N
 FOURTEEN
   F   D
   R   I
   O   V
  ALSATIAN
   O   D
   C
</code></pre>
<p>This reduces the total letter count by four, as there are four "crossings". Your challenge today is to take a list of words, and try to find a way to compact or pack the words together in crossword style while reducing the total letter count by as much as possible.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Specification</h2>
<p>You'll be given a set of words on one line, separated by commas. Your solution should be case insensitive, and treat hyphens and apostrophes as normal letters - you should handle the alphabet, <code>'</code> and <code>-</code> in words. </p>
<h2>Output Description</h2>
<p>Output the the compactified set of words, along with the number of crossings (ie. the number of letters you saved). Words may be touching, as long as all of the words present in the input are present in the output (the words may travel in any direction, such as bottom-to-top - the company's logo is <a href="/r/CrappyDesign">/r/CrappyDesign</a> material).</p>
<p><strong>There may be several valid outputs with the same number of crossings. Try to maximise the number of crossings.</strong></p>
<h1>Sample Inputs and Outputs</h1>
<h2>Example 1</h2>
<h3>Input</h3>
<pre><code>neat,large,iron
</code></pre>
<h3>Output</h3>
<pre><code>  NEAT
  O
LARGE
  I

Crossings: 2
</code></pre>
<h2>Example 2</h2>
<p>This corresponds to the example in the challenge description.</p>
<pre><code>colorful,dividend,fourteen,alsatian
</code></pre>
<h3>Output</h3>
<pre><code>       D
   L   N
 FOURTEEN
   F   D
   R   I
   O   V
  ALSATIAN
   O   D
   C

Crossings: 4
</code></pre>
<h2>Example 3</h2>
<h3>Input</h3>
<pre><code>graphic,yellow,halberd,cardboard,grass,island,coating
</code></pre>
<h3>Output</h3>
<pre><code>COATING
      R     G
CARDBOARD   A
      P   Y R
      HALBERD
      I   L E
      C ISLAND
          O 
          W

Crossings: 7
</code></pre>
<h2>Challenge Input</h2>
<pre><code>lightning,water,paper,cuboid,doesn't,raster,glare,parabolic,menagerie
</code></pre>
<h1>Finally</h1>
<p>With packing challenges like this, randomising the input order may yield better results.</p>
<p>Got any cool challenge ideas? Submit them to <a href="/r/DailyProgrammer_Ideas">/r/DailyProgrammer_Ideas</a>!</p>
</div>
