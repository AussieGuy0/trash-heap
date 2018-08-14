# (Reading digital displays)
<div class="md"><p><a href="http://www.reddit.com/r/dailyprogrammer/comments/ywlvf/8272012_challenge_92_easy_digital_number_display/">Challenge #92 [easy]</a> involved converting a number to a seven segment display representation (of a variable size) using +, -, and |. Assume the font looks like this:</p>
<pre><code>   + +--+ +--+ +  + +--+ +--+ +--+ +--+ +--+ +--+ 
   |    |    | |  | |    |       | |  | |  | |  | 
   |    |    | |  | |    |       | |  | |  | |  | 
   + +--+ +--+ +--+ +--+ +--+    + +--+ +--+ +  + 
   | |       |    |    | |  |    | |  |    | |  | 
   | |       |    |    | |  |    | |  |    | |  | 
   + +--+ +--+    + +--+ +--+    + +--+ +--+ +--+
</code></pre>
<p>Write a program that reads such a string and converts it back into a number. (You'll have to deduce the size yourself.) The output for the above text would be <code>1234567890</code>.</p>
<p>As a bonus, have your program be able to read a file containing characters of different sizes, like this:</p>
<pre><code>+-+ +  + +-+
  | |  | |
+-+ |  | +-+
  | +--+   |
+-+    | +-+
       |
       +
</code></pre>
</div>
