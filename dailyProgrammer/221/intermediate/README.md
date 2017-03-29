# Unravelling a word snake
<div class="md"><h1>Description</h1>
<p>As we saw on monday, a "word snake" is a snake made from words.</p>
<p>For instance, take this sequence of words:</p>
<p><code>SHENANIGANS SALTY YOUNGSTER ROUND DOUBLET TERABYTE ESSENCE</code></p>
<p>Notice that the last letter in each word is the same as the first letter in the next word. In order to make this into a word snake, you can simple snake it across the screen</p>
<pre><code> SHENANIGANS       DOUBLET
           A       N     E
           L       U     R
           T       O     A
           YOUNGSTER     B
                         Y
                         T
                   ECNESSE
</code></pre>
<p>Your task on monday was to take an input word sequence and turn it into a word snake. Your task today is to take an input word snake and turn it into a word sequence. The rules for wod snakes are the same as the previous problem, with one addition:</p>
<ul>
<li>The snake starts at the top left corner</li>
<li>Each word will turn 90 degrees left or right to the previous word</li>
<li>The snake will not intersect itself</li>
<li>The snake will be unambiguous</li>
</ul>
<p>The next letter in the snake's path will always be clear, here's an example of an ambiguous snake:</p>
<pre><code>CMYE
HLOG
IADN
LPEA
LALR
INSO
</code></pre>
<p>In this case it's unclear whether snake's inital direction is right or down solving this kind of ambiguous snake would require a dictionary.</p>
<p>Specifically, "unambiguous" means that every letter will only ever have two neighbors, except for the end-points, which will have only one. </p>
<h1>Formal inputs &amp; outputs</h1>
<h2>Input</h2>
<p>The input will first be a number specifying how many lines the snake will cover. After that follows the word snake (written in ALL CAPS).</p>
<p>Note that the word-snake will not have any trailing spaces on any line, so you can't assume that every line will be equally long. However, you can assume that no input will be wider than 80 characters. </p>
<h2>Output</h2>
<p>The resulting sequence of words from unraveling the word snake! Each word will be in all caps and each word will be separated by a space.</p>
<h1>Sample inputs &amp; outputs</h1>
<h2>Input 1</h2>
<pre><code>6
SNAKE
    A   DUSTY
    T   N   U
    SALSA   M
            M
            YACHTS
</code></pre>
<h2>Output 1</h2>
<pre><code>SNAKE EATS SALSA AND DUSTY YUMMY YACHTS
</code></pre>
<h2>Input 2</h2>
<pre><code>8
W    DINOSAUR
I    E      E
Z  CAR  Y   A
A  I    L   C
R  D    T  OT
D  R    B  V
R  O    U  A
YAWN    SGEL
</code></pre>
<h2>Ouput 2</h2>
<pre><code>WIZARDRY YAWN NORDIC CAR RED DINOSAUR REACT TO OVAL LEGS SUBTLY
</code></pre>
<h3>Challenge inputs</h3>
<h2>Input 1</h2>
<pre><code>8
NUMEROUS
       Y
LUXURY M
O    E B
B O  A O
M DAOR L
Y      I
SDRATSUC
</code></pre>
<h2>Input 2</h2>
<pre><code>10
R       TIGER
E       O   E
S       H   T  SO
I  GRAPES   U  N
G  A        R  R
NULL  GNIHTON  E
      R        T
      A        N
      N        A
      DELIGHTFUL
</code></pre>
<h1>Notes</h1>
<p>If you have an idea for a problem, head on over to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and let us know about it! </p>
<p>Huge thanks to <a href="/u/hutsboR">/u/hutsboR</a> for helping me prepare this challenge, and who did most of this write-up! For his good works he's been rewarded with a gold medal.</p>
</div>
