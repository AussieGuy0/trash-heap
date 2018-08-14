<div class="md"><p><a href="http://en.wikipedia.org/wiki/Huffman_coding">Huffman coding</a> is a compression algorithm. Implementing it is a good occasion to work with queues, trees and bits.</p>
<p>Say we have a string of characters, and we want to transmit it over a network. To that end, we're gonna compress it.</p>
<p>The idea of the Huffman encoding is to replace each character by a bit sequence whose length depends on the frequency of occurrence of the character in the string: if a character occurs very often, we want to represent it by a very short bit sequence to avoid wasting space, but if appears only once or twice, it doesn't really matter if the bit sequence is long.</p>
<p><strong>Exercise:</strong></p>
<ol>
<li><p>Write a function that takes a string and returns a Huffman tree, as described in the Wikipedia article.</p></li>
<li><p>Write an encoding function that takes a string and returns a sequence of bits that correspond to its Huffman encoding.</p></li>
<li><p>Write a decoding function that takes a sequence of bits and a Huffman tree, and reconstructs the original string.</p></li>
</ol>
<p>Notice that you need the tree to decode a message. Bonus points if you figure out a way to encode the tree along with the bit sequence.</p>
<p>Also, don't let the gigantic introduction in the Wikipedia article discourage you, an algorithm is explained <a href="http://en.wikipedia.org/wiki/Huffman_coding#Basic_technique">here</a>. There's even a cute animation!</p>
<p><em>(This challenge was posted to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> by <a href="/u/wicked-canid">/u/wicked-canid</a> -- thanks!)</em></p>
</div>
