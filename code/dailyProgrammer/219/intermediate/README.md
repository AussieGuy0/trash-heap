# To-do list (Part 2)
<div class="md"><h1>Description</h1>
<p>Thanks for that list you made me, my thoughts are way more organised!</p>
<p>I've got a few problems though that I thought you might be able to help with?
Sometimes I put the wrong information in a list item. Maybe to prevent this I'd be able to modify/update the list item? That's not the only problem though, when there are 50+ items it gets kind of hard to work my way through. Do you think you could maybe add the ability to categorise my items? Obviously, if I have that, I'd also like to be able to view by category!</p>
<p>Oh and finally, a few of you were really great and did this last time but is there a way you can somehow make my list retain state so that I don't have to re-type it everytime I turn my computer on again?</p>
<p>The newest To-do list should be capable of the following functionality:</p>
<ul>
<li><p>Modifying an existing list item</p></li>
<li><p>Be able to give a list item a category. The list item should be able to take an arbitrary amount of categorys</p></li>
<li><p>View by category - All list items should be able to be sorted and output by category to make it easier to wade through submissions</p></li>
<li><p>Retain state</p></li>
</ul>
<p>Thanks!</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Output description</h2>
<p>Any output that is created should be user-friendly. When I'm viewing my to-do list, I should be able to easily discern one list item from another.</p>
<h1>Examples</h1>
<p>(don't take this too literally, do it how you would like to do it)</p>
<h2>Categorisation</h2>
<p>Input:</p>
<pre><code>addItem('Go to work','Programming'); //Item belongs to the Programming Category
addItem('Create Sine Waves in C', 'Music', 'Programming); //Belongs to 2 categories, 'Programming' and 'Music');
</code></pre>
<h2>Category Output</h2>
<p>Input:</p>
<pre><code>viewList('programming');
viewList('music');
viewList('music', 'programming');
</code></pre>
<p>Output:</p>
<pre><code>----PROGRAMMING----
- A pixel is not a pixel is not a pixel
- The Scheme Programming Language
- Memory in C
- Haskell's School of Music
- Algorithmic Symphonies from one line of code

----MUSIC----
- Modes in Folk Music
- The use of the Melodic Minor Scale
- Haskell's School of Music
- Algorithmic Symphonies from one line of code

----MUSIC &amp; PROGRAMMING----
- Haskell's School of Music
- Algorithmic Symphonies from one line of code
</code></pre>
<h2>Modifying an item</h2>
<pre><code>updateItem('Create Sine Waves in C', 'Create Sine Waves in Python');
//The item has now changed from 'Create Sine Waves in C' to 'Create Sine Waves in Python'. This should be reflected in the viewList function/method you have created.
</code></pre>
<h1>Finally</h1>
<p>Have a good challenge idea?</p>
<p>Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
</div>
