# Word snake
<div class="md"><h1>Description</h1>
<p>A word snake is (unsurprisingly) a snake made up of a sequence of words. </p>
<p>For instance, take this sequence of words: </p>
<pre><code>SHENANIGANS SALTY YOUNGSTER ROUND DOUBLET TERABYTE ESSENCE
</code></pre>
<p>Notice that the last letter in each word is the same as the first letter in the next word. In order to make this into a word snake, you simply snake it across the screen</p>
<pre><code>SHENANIGANS        
          A        
          L        
          T        
          YOUNGSTER
                  O
                  U
                  N
            TELBUOD
            E      
            R      
            A      
            B      
            Y      
            T      
            ESSENCE
</code></pre>
<p>Your task today is to take an input word sequence and turn it into a word snake. Here are the rules for the snake:</p>
<ul>
<li>It has to start in the top left corner</li>
<li>Each word has to turn 90 degrees left or right to the previous word</li>
<li>The snake can't intersect itself </li>
</ul>
<p>Other than that, you're free to decide how the snake should "snake around". If you want to make it easy for yourself and simply have it alternate between going right and going down, that's perfectly fine. If you want to make more elaborate shapes, that's fine too. </p>
<h1>Formal inputs &amp; outputs</h1>
<h2>Input</h2>
<p>The input will be a single line of words (written in ALL CAPS). The last letter of each word will be the first letter in the next.</p>
<h2>Output</h2>
<p>Your word snake! Make it look however you like, as long as it follows the rules.</p>
<h1>Sample inputs &amp; outputs</h1>
<p>There are of course many possible outputs for each inputs, these just show a sample that follows the rules</p>
<h2>Input 1</h2>
<pre><code>SHENANIGANS SALTY YOUNGSTER ROUND DOUBLET TERABYTE ESSENCE
</code></pre>
<h2>Output 1</h2>
<pre><code>SHENANIGANS       DOUBLET
          A       N     E
          L       U     R
          T       O     A
          YOUNGSTER     B
                        Y
                        T
                        ESSENCE
</code></pre>
<h2>Input 2</h2>
<pre><code>DELOREAN NEUTER RAMSHACKLE EAR RUMP PALINDROME EXEMPLARY YARD
</code></pre>
<h2>Output 2</h2>
<pre><code>D                                       
E                                       
L                                       
O                                       
R                                       
E            DRAY                       
A               R                           
NEUTER          A                           
     A          L                           
     M          P                           
     S          M                           
     H          E       
     A          X
     C PALINDROME
     K M
     L U
     EAR
</code></pre>
<h1>Challenge inputs</h1>
<h2>Input 1</h2>
<pre><code>CAN NINCOMPOOP PANTS SCRIMSHAW WASTELAND DIRK KOMBAT TEMP PLUNGE ESTER REGRET TOMBOY
</code></pre>
<h2>Input 2</h2>
<pre><code>NICKEL LEDERHOSEN NARCOTRAFFICANTE EAT TO OATS SOUP PAST TELEMARKETER RUST THINGAMAJIG GROSS SALTPETER REISSUE ELEPHANTITIS
</code></pre>
<h1>Notes</h1>
<p>If you have an idea for a problem, head on over to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and let us know about it!</p>
<p>By the way, I've set the sorting on this post to default to "new", so that late-comers have a chance of getting their solutions seen. If you wish to see the top comments, you can switch it back just beneath this text. If you see a newcomer who wants feedback, feel free to provide it!</p>
</div>
