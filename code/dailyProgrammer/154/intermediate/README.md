# Gorellian Alphabet Sort
<div class="md"><h1><strong>Description:</strong></h1>
<p>The Gorellians, at the far end of our galaxy, have discovered various samples of English text from our electronic transmissions, but they did not find the order of our alphabet. Being a very organized and orderly species, they want to have a way of ordering words, even in the strange symbols of English. Hence they must determine their own order.  </p>
<p>For instance, if they agree on the alphabetical order:  </p>
<p>UVWXYZNOPQRSTHIJKLMABCDEFG  </p>
<p>Then the following words would be in sorted order based on the above alphabet order:  </p>
<p>WHATEVER</p>
<p>ZONE</p>
<p>HOW</p>
<p>HOWEVER</p>
<p>HILL</p>
<p>ANY</p>
<p>ANTLER</p>
<p>COW</p>
<hr/>
<h1><strong>Input:</strong></h1>
<p>The input will be formatted to enter the number of words to sort and the new Alphabet ordering and a list of words to sort. n should be &gt; 0. The alphabet is assumed to be 26 letters with no duplicates and arranged in the new order. Also assumed there are n strings entered.</p>
<p>n (new alphabet ordering)</p>
<p>(word 1 of n)</p>
<p>(word 2 of n)</p>
<p>....</p>
<p>(word n of n)</p>
<h2>Example input 1:</h2>
<p>8 UVWXYZNOPQRSTHIJKLMABCDEFG</p>
<p>ANTLER</p>
<p>ANY</p>
<p>COW</p>
<p>HILL</p>
<p>HOW</p>
<p>HOWEVER</p>
<p>WHATEVER</p>
<p>ZONE</p>
<hr/>
<h1><strong>Output:</strong></h1>
<p>The list of words in sorted order based on the new order of the alphabet. The sort order should be based on the alphabet (case insensitive) and the words should be output to appear as the words were entered.</p>
<h2>Example of output for input 1:</h2>
<p>WHATEVER</p>
<p>ZONE</p>
<p>HOW</p>
<p>HOWEVER</p>
<p>HILL</p>
<p>ANY</p>
<p>ANTLER</p>
<p>COW</p>
<hr/>
<h1><strong>Notes:</strong></h1>
<p>The sorting should be case insensitive. Meaning that you do not sort it based on the ASCII value of the letters but by the letters. Your solution should handle an alphabet order that might be typed in upper/lower case. It will sort the words by this order and output the words as they were typed in.</p>
<h2>Example Input 2:</h2>
<p>5 ZYXWVuTSRQpONMLkJIHGFEDCBa</p>
<p>go</p>
<p>aLL</p>
<p>ACM</p>
<p>teamS</p>
<p>Go</p>
<h2>Example output 2:</h2>
<p>teamS</p>
<p>go</p>
<p>Go</p>
<p>aLL</p>
<p>ACM</p>
<hr/>
<h1><strong>Extra Challenge:</strong></h1>
<p>Error check the input.</p>
<hr/>
<p>If the alphabet is missing letters it returns an error message and listing letters missing.</p>
<h2>Input for this:</h2>
<p>4 abcdfghijklmnopsuvxz</p>
<p>error</p>
<p>checking</p>
<p>is</p>
<p>fun</p>
<h2>Output for this:</h2>
<p>Error! Missing letters: e q r t w y</p>
<hr/>
<p>If the alphabet has duplicate letters it returns an error message listing all the duplicate letters used in the alphabet.</p>
<h2>Input for this:</h2>
<p>4 abcdefaghijklmnoepqrstiuvwoxuyz</p>
<p>oh</p>
<p>really</p>
<p>yah</p>
<p>really</p>
<h2>Output for this:</h2>
<p>Error! Duplicate letters found in alphabet: a e i o u</p>
<hr/>
<h1><strong>Challenge Credit:</strong></h1>
<p>Based on the idea from <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> </p>
<p><a href="http://www.reddit.com/r/dailyprogrammer_ideas/comments/1yjruf/intermediate_sort_me/">(Link to Challenge idea)</a>
with some minor tweaks from me.</p>
<p>Thanks to <a href="/u/BlackholeDevice">/u/BlackholeDevice</a> for submitting the idea!</p>
<p>Good luck everyone and have fun!</p>
</div>
