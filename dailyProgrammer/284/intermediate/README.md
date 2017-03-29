# Punch Card Creator
<div class="md"><h1>Description</h1>
<p>Punch (or punched) cards are an archaic form of recording instruction. Many people here may think of them from the early digital computing era, but they actually go back to fairground organs and textile mills in the 19th century! The format most of us are familiar with was originally patented by Hollerith, using stiff card stock. Over the years this format changed slightly and varied on this them, including a diagonal cut corner. For this challenge we'll focus on the tail end of punch cards with IBM, GE and UNIVAC type cards. </p>
<p>To use them, a program would be transcribed to the punch cards. Each column represented a single character, 80 columns to the card, 12 rows to the column. The zone rows can be used to have <em>two</em> punches per column. You can visualize it like this:</p>
<pre><code>                  ____________
                 /
          /  12 / O
  Zone rows  11|   O
          \/  0|    O
          /   1|     O
         /    2|      O
        /     3|       O
  Numeric     4|        O
  rows        5|         O
        \     6|          O
         \    7|           O
          \   8|            O
           \  9|             O
               |______________
</code></pre>
<p>Each card vendor would have an alphabet, an array of characters that are numerically represented by the punches. Here's an example of the DEC9 simple alphabet showing you the punch codes and the order in which they appear.</p>
<pre><code>DEC9 &amp;-0123456789ABCDEFGHIJKLMNOPQR/STUVWXYZ:#@'="[.&lt;(+^!$*);\],%_&gt;?
     ________________________________________________________________
    /&amp;-0123456789ABCDEFGHIJKLMNOPQR/STUVWXYZ:#@'="[.&lt;(+^!$*);\],%_&gt;?
12 / O           OOOOOOOOO                        OOOOOO
11|   O                   OOOOOOOOO                     OOOOOO
 0|    O                           OOOOOOOOO                  OOOOOO
 1|     O        O        O        O
 2|      O        O        O        O       O     O     O     O
 3|       O        O        O        O       O     O     O     O
 4|        O        O        O        O       O     O     O     O
 5|         O        O        O        O       O     O     O     O
 6|          O        O        O        O       O     O     O     O
 7|           O        O        O        O       O     O     O     O
 8|            O        O        O        O OOOOOOOOOOOOOOOOOOOOOOOO
 9|             O        O        O        O
  |__________________________________________________________________
</code></pre>
<p>You can see the first 12 characters are represented by a single punch, then the next 9 have two punches (with one in the upper zone), then the next 9 use the next zone as that second punch, the fourth 9 use the next zone as the second punch, then we start on the lower zone for the next sets of 6 with the upper zone punched increasingly.</p>
<p>For some more information, including from where some of this info was taken, please see <a href="http://homepage.cs.uiowa.edu/%7Ejones/cards/codes.html">http://homepage.cs.uiowa.edu/~jones/cards/codes.html</a> or Wikipedia <a href="http://en.wikipedia.org/wiki/Punched_card">http://en.wikipedia.org/wiki/Punched_card</a> . </p>
<p>So, given an alphabet array you should be able to encode a message in a punch card, right? Let's go back to the punch card! For this challenge, assume the same encoding methods as above given the character array at the top, they'll only differ in order of characters. </p>
<h1>Input Description</h1>
<p>On the first line you'll be given two words - the punched card identifier, and the alphabet in linear order. Then you'll be given <em>M</em>, a single integer on a line, telling you how many cshort messages to represent on that type of punch card. </p>
<h1>Output Description</h1>
<p>Your program should emit an ASCII art punchcard  in the format above, with the diagonal notch and everything, and the message across the top. </p>
<h1>Challenge Input</h1>
<pre><code>DEC9 &amp;-0123456789ABCDEFGHIJKLMNOPQR/STUVWXYZ:#@'="[.&lt;(+^!$*);\],%_&gt;?
3
Hello, world!
This is Reddit's r/dailyprogrammer challenge. 
WRITE (6,7) FORMAT(13H HELLO, WORLD) STOP END
</code></pre>
</div>
