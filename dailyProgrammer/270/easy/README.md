# Transpose the input text
<div class="md"><h1>Description</h1>
<p>Write a program that takes input text from standard input and outputs the text -- transposed.</p>
<p>Roughly explained, the transpose of a matrix</p>
<pre><code>A B C
D E F
</code></pre>
<p>is given by</p>
<pre><code>A D
B E
C F
</code></pre>
<p>Rows become columns and columns become rows. See <a href="https://en.wikipedia.org/wiki/Transpose">https://en.wikipedia.org/wiki/Transpose</a>. </p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input description</h2>
<p>One or more lines of text. Since the transpose is only valid for square matrices, append spaces to the shorter lines until they are of the same length. Characters may be multibyte (UTF-8) characters.</p>
<pre><code>Some
text.
</code></pre>
<h2>Output description</h2>
<p>The input text should be treated as a matrix of characters and flipped around the diagonal. I.e., the top right input character becomes the bottom left character of the output. Blank space at the end of output lines should be removed. Tab (\t) may be treated like any other character (don't replace it with spaces).</p>
<pre><code>St
oe
mx
et
 .
</code></pre>
<p>Note that the lower left character is a space in the output, but nothing in the input.</p>
<h2>Input</h2>
<pre><code>package main

import "fmt"

func main() {
    queue := make(chan string, 2)
    queue &lt;- "one"
    queue &lt;- "twoO"
    close(queue)
    for elem := range queue {
        fmt.Println(elem)
    }
}
</code></pre>
<h2>Output</h2>
<pre><code>p i f       }
a m u
c p n
k o c
a r  qqqcf }
g t muuulo
e   aeeeor
  " iuuus
m f neeeeef
a m (   (lm
i t ):&lt;&lt;qet
n "  =--um.
    {   e P
     m""u:r
     aote=i
     knw) n
     eeo rt
     ("O al
     c " nn
     h   g(
     a   ee
     n    l
         qe
     s   um
     t   e)
     r   u
     i   e
     n
     g   {
     ,

     2
     )
</code></pre>
<h1>Credit</h1>
<p>This challenge was suggeted by <a href="/u/Gommie">/u/Gommie</a>. Have a good challenge idea? Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> .</p>
</div>
