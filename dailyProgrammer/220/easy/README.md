# Mangling sentences
<div class="md"><h1>Description</h1>
<p>In this challenge, we are going to take a sentence and mangle it up by sorting the letters in each word. So, for instance, if you take the word "hello" and sort the letters in it, you get "ehllo". If you take the two words "hello world", and sort the letters in each word, you get "ehllo dlorw". </p>
<h1>Inputs &amp; outputs</h1>
<h2>Input</h2>
<p>The input will be a single line that is exactly one English sentence, starting with a capital letter and ending with a period</p>
<h2>Output</h2>
<p>The output will be the same sentence with all the letters in each word sorted. Words that were capitalized in the input needs to be capitalized properly in the output, and any punctuation should remain at the same place as it started. So, for instance, "Dailyprogrammer" should become "Aadegilmmoprrry" (note the capital A), and "doesn't" should become "denos't". </p>
<p>To be clear, only spaces separate words, not any other kind of punctuation. So "time-worn" should be transformed into "eimn-ortw", not "eimt-norw", and "Mickey's" should be transformed into "Ceikms'y", not anything else. </p>
<p><strong>Edit:</strong> It has been pointed out to me that this criterion might make the problem a bit too difficult for [easy] difficulty. If you find this version too challenging, you can consider every non-alphabetic character as splitting a word. So "time-worn" becomes "eimt-norw" and "Mickey's" becomes ""Ceikmy's". Consider the harder version as a Bonus. </p>
<h1>Sample inputs &amp; outputs</h1>
<h2>Input 1</h2>
<pre><code>This challenge doesn't seem so hard.
</code></pre>
<h2>Output 1</h2>
<pre><code>Hist aceeghlln denos't eems os adhr.
</code></pre>
<h2>Input 2</h2>
<pre><code>There are more things between heaven and earth, Horatio, than are dreamt of in your philosophy. 
</code></pre>
<h2>Output 2</h2>
<pre><code>Eehrt aer emor ghinst beeentw aeehnv adn aehrt, Ahioort, ahnt aer ademrt fo in oruy hhilooppsy.
</code></pre>
<h1>Challenge inputs</h1>
<h2>Input 1</h2>
<pre><code>Eye of Newt, and Toe of Frog, Wool of Bat, and Tongue of Dog.
</code></pre>
<h2>Input 2</h2>
<pre><code>Adder's fork, and Blind-worm's sting, Lizard's leg, and Howlet's wing. 
</code></pre>
<h2>Input 3</h2>
<pre><code>For a charm of powerful trouble, like a hell-broth boil and bubble.
</code></pre>
<h1>Notes</h1>
<p>If you have a suggestion for a problem, head on over to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and suggest it!</p>
</div>
