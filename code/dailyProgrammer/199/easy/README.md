# Bank Number Banners Pt 1
<div class="md"><h1>Description</h1>
<p>You work for a bank, which has recently purchased an ingenious machine to assist in reading letters and faxes sent in by branch offices. The machine scans the paper documents, and produces a file with a number of entries which each look like this:</p>
<pre><code>    _  _     _  _  _  _  _
  | _| _||_||_ |_   ||_||_|
  ||_  _|  | _||_|  ||_| _| 
</code></pre>
<p>Each entry is 4 lines long, and each line has 27 characters. The first 3 lines of each entry contain an account number written using pipes and underscores, and the fourth line is blank. Each account number should have 9 digits, all of which should be in the range 0-9. </p>
<p>Right now you're working in the print shop and you have to take account numbers and produce those paper documents. </p>
<h1>Input</h1>
<p>You'll be given a series of numbers and you have to parse them into the previously mentioned banner format. This input...</p>
<pre><code>000000000
111111111
490067715
</code></pre>
<h1>Output</h1>
<p>...would reveal an output that looks like this</p>
<pre><code> _  _  _  _  _  _  _  _  _ 
| || || || || || || || || |
|_||_||_||_||_||_||_||_||_|


 |  |  |  |  |  |  |  |  |
 |  |  |  |  |  |  |  |  |

    _  _  _  _  _  _     _ 
|_||_|| || ||_   |  |  ||_ 
  | _||_||_||_|  |  |  | _|
</code></pre>
<h1>Notes</h1>
<p>Thanks to <a href="/u/jnazario">/u/jnazario</a> for yet another challenge!</p>
</div>
