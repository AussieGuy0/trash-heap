# Logo De-compactification
<div class="md"><h1><a href="#HardIcon"></a> <em>(Hard)</em>: Logo De-compactification</h1>
<p>After Wednesday's meeting, the board of executives drew up a list of several thousand logos for their company. Content with their work, they saved the logos in ASCII form (like below) and went home.</p>
<pre><code>ROAD    
  N B   
  I R   
NASTILY 
  E T O 
  E I K 
  DISHES
    H   
</code></pre>
<p>However, the "Road Aniseed dishes nastily British yoke" company execs forgot to actually save the name of the company associated with each logo. There are several thousand of them, and the employees are too busy with a Halo LAN party to do it manually. You've been assigned to write a program to decompose a logo into the words it is made up of.</p>
<p>You have access to <a href="https://gist.githubusercontent.com/Quackmatic/512736d51d84277594f2/raw/words">a word list</a> to solve this challenge; every word in the logos will appear in this word list.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Specification</h2>
<p>You'll be given a number <strong>N</strong>, followed by <strong>N</strong> lines containing the logo. Letters will all be in upper-case, and each line will be the same length (padded out by spaces).</p>
<h2>Output Description</h2>
<p>Output a list of all the words in the logo in alphabetical order (in no particular case). All words in the output must be contained within the word list.</p>
<h1>Sample Inputs and Outputs</h1>
<h2>Example 1</h2>
<h3>Input</h3>
<pre><code>8
ROAD    
  N B   
  I R   
NASTILY 
  E T O 
  E I K 
  DISHES
    H   
</code></pre>
<h3>Output</h3>
<pre><code>aniseed
british
dishes
nastily
road
yoke
</code></pre>
<h2>Example 2</h2>
<pre><code>9
   E
   T   D 
   A   N 
 FOURTEEN
   T   D 
   C   I 
   U   V 
   LEKCIN
   F   D    
</code></pre>
<p>Note that "fourteen" could be read as "four" or "teen". Your solution must read words greedily and interpret as the longest possible valid word.</p>
<h3>Output</h3>
<pre><code>dividend
fluctuate
fourteen
nickel
</code></pre>
<h2>Example 3</h2>
<h3>Input</h3>
<pre><code>9
COATING          
      R     G    
CARDBOARD   A    
      P   Y R    
     SHEPHERD    
      I   L E    
      CDECLENSION
          O      
          W      
</code></pre>
<p>Notice here that "graphic" and "declension" are touching. Your solution must recognise that "cdeclension" isn't a word but "declension" is.</p>
<h3>Output</h3>
<pre><code>cardboard
coating
declension
garden
graphic
shepherd
yellow
</code></pre>
<h1>Finally</h1>
<p>Some elements of this challenge resemble the <a href="/r/dailyprogrammer/comments/322hh0/20150410_challenge_209_hard_unpacking_a_sentence/">Unpacking a Sentence in a Box</a> challenge. You might want to re-visit your solution to that challenge to pick up some techniques.</p>
<p>Got any cool challenge ideas? Submit them to <a href="/r/DailyProgrammer_Ideas">/r/DailyProgrammer_Ideas</a>!</p>
</div>
