# Tricky Stick Stacking
<div class="md"><h1><a href="#HardIcon"></a> <strong>(Hard)</strong>: Tricky Stick Stacking</h1>
<p>Similar to the previous <a href="/r/dailyprogrammer/comments/2m82yz/">hard challenge with the arrows</a>, this challenge will similarly require a hard degree of thought to solve (providing, of course, you develop the algorithm yourself,) while being relatively easy to understand.</p>
<p>Imagine you have a 2D plane, into which you can place sticks, <a href="http://i.imgur.com/mkt7n2D.png">like so</a>. All of the sticks are perfectly straight, and placed into this plane from the top (positive Y) down. The sticks will never overlap or cross over one another. Your task today is to simply determine in which order the sticks must be pulled out of the plane without hitting any other sticks.</p>
<p>There are a few rules for this:</p>
<ul>
<li><p>A stick is <a href="http://i.imgur.com/8eFNtwh.png">pulled out of the plane <em>directly upward (ie. along the positive Y axis)</em></a>, <a href="http://i.imgur.com/MpquP7S.png">like so</a>. This means that you can't pull a stick out <a href="http://i.imgur.com/zGQL5xV.png">sideward or at an angle</a> (for example, to avoid another stick.)</p></li>
<li><p>A stick cannot be pulled out if there's <a href="http://i.imgur.com/RWtPm05.png">another stick directly above it</a>.</p></li>
</ul>
<p>In some possible possible scenarios, there is only one possible order to pull the sticks out of the plane. <a href="http://i.imgur.com/16WBjSf.png">This scenario</a> only has one possible order: 1, 2, 4, 3. <a href="http://i.imgur.com/gSkKVIg.png">This scenario</a> however has two possible orders, as the last two remaining sticks are not interfering with one another's removal, so you can remove them in any order.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>Each stick is described by a number and the co-ordinates of its 2 ends, like so:</p>
<pre><code>n:x1,y1,x2,y2
</code></pre>
<p>Where the stick number <strong>n</strong> is between the points (x1, y1) and (x2, y2). You will first input a number <strong>S</strong> which is the number of sticks in the scenario. You will then take a further <strong>S</strong> lines of input in the above format. <strong>n</strong> must be an integer but the co-ordinates can be any real number.</p>
<h2>Output Description</h2>
<p>You are to output one possible order of removal of the sticks (where each stick is identified by its number <strong>n</strong>. There may be more than one.</p>
<h1>Sample Inputs and Outputs</h1>
<h2>Sample Input</h2>
<p><a href="http://i.imgur.com/nDpDJag.png">(Represents this scenario)</a></p>
<pre><code>4
1:0,3,4,5
2:2,3,8,1
3:4,0,5,1
4:1,3,4.2,1
</code></pre>
<h2>Sample Output</h2>
<pre><code>1, 2, 4, 3
</code></pre>
<h2>Sample Input</h2>
<p><a href="http://i.imgur.com/gSkKVIg.png">(Represents this scenario)</a></p>
<pre><code>5
1:3,3,8,1
2:11,2,15,2
3:6,3,12,4
4:10,5,10,10
5:9,11,18,12
</code></pre>
<h2>Sample Output</h2>
<p>This scenario has 2 possible outputs:</p>
<pre><code>5, 4, 3, 1, 2
</code></pre>
<p>or:</p>
<pre><code>5, 4, 3, 2, 1
</code></pre>
<h2>Sample Input</h2>
<p><a href="http://i.imgur.com/l8X9Tgg.png">(Represents this scenario)</a></p>
<pre><code>6
1:1,6,12,6
2:1,7,1,15
3:11,1,13,10
4:14,10,15,6
5:15,2,15,5
6:12,1,14,11
</code></pre>
<h2>Sample Output</h2>
<pre><code>2, 1, 3, 6, 4, 5
</code></pre>
<h2>Sample Input</h2>
<pre><code>5
1:2,2,2,8
2:1,1,11,2
3:10,1,15,3
4:5,5,13,8
5:6,4,9,3
</code></pre>
<h2>Sample Output</h2>
<p>(all 3 are valid)</p>
<pre><code>1, 4, 5, 2, 3
4, 1, 5, 2, 3
4, 5, 1, 2, 3
</code></pre>
<h2>Sample Input</h2>
<pre><code>6
1:6,2,14,7
2:12,10,15,9
3:12,3,12,6
4:3,1,17,2
5:4,3,11,2
6:3,10,12,12
</code></pre>
<h2>Sample Output</h2>
<p>(both are valid)</p>
<pre><code>6, 2, 1, 3, 5, 4
6, 2, 1, 5, 3, 4
</code></pre>
<h2>Sample Input</h2>
<pre><code>5
1:2,1,15,15
2:15,5,15,12
3:10,8,13,2
4:13,4,15,4
5:8,9,12,13
</code></pre>
<h2>Sample Output</h2>
<pre><code>5, 1, 2, 4, 3
</code></pre>
</div>
