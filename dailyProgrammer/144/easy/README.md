# Nuts & Bolts
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Easy)</em>: Nuts &amp; Bolts</h1>
<p>You have just been hired at a local home improvement store to help compute the proper costs of inventory. The current prices are out of date and wrong; you have to figure out which items need to be re-labeled with the correct price.</p>
<p>You will be first given a list of item-names and their current price. You will then be given another list of the same item-names but with the correct price. You must then print a list of items that have changed, and by how much.</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>The first line of input will be an integer N, which is for the number of rows in each list. Each list has N-lines of two space-delimited strings: the first string will be the unique item name (without spaces), the second string will be the price (in whole-integer cents). The second list, following the same format, will have the same unique item-names, but with the correct price. Note that the lists may not be in the same order!</p>
<h2>Output Description</h2>
<p>For each item that has had its price changed, print a row with the item name and the price difference (in cents). Print the sign of the change (e.g. '+' for a growth in price, or '-' for a loss in price). Order does not matter for output.</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input 1</h2>
<pre><code>4
CarriageBolt 45
Eyebolt 50
Washer 120
Rivet 10
CarriageBolt 45
Eyebolt 45
Washer 140
Rivet 10
</code></pre>
<h2>Sample Output 1</h2>
<pre><code>Eyebolt -5
Washer +20
</code></pre>
<h2>Sample Input 2</h2>
<pre><code>3
2DNail 3
4DNail 5
8DNail 10
8DNail 11
4DNail 5
2DNail 2
</code></pre>
<h2>Sample Output 2</h2>
<pre><code>2DNail -1
8DNail +1
</code></pre>
</div>
