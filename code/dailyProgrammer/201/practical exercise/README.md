# Get Your Priorities Right!
<div class="md"><h1><a href="#PEIcon"></a> <strong>(Practical Exercise)</strong>: Get Your Priorities Right!</h1>
<p>A <a href="http://en.wikipedia.org/wiki/Priority_queue">priority queue</a> is a data structure similar to a standard queue, except that entries in the queue have a <em>priority</em> associated with them - such that, when removing items from the queue, the entry with the highest priority will be removed before ones with lower priority. This is similar to a hospital triage system: patients with more severe wounds get treated quicker, even if they arrived later than a patient with a smaller injury. Let's say I have a priority queue containing strings, where the priority value is a real number. I add these 3 objects to my priority queue, in no particular order:</p>
<table><thead>
<tr>
<th align="right">Patient</th>
<th align="left">Priority</th>
</tr>
</thead><tbody>
<tr>
<td align="right"><code>"David Whatsit"</code></td>
<td align="left">3.06</td>
</tr>
<tr>
<td align="right"><code>"Joan Smith"</code></td>
<td align="left">4.33</td>
</tr>
<tr>
<td align="right"><code>"Bob Testing"</code></td>
<td align="left">0.39</td>
</tr>
<tr>
<td align="right"><code>"Samuel Sample"</code></td>
<td align="left">1.63</td>
</tr>
</tbody></table>
<p>Here, if I was to <em>dequeue</em> four strings from the priority queue, the strings <code>"Joan Smith"</code>, <code>"David Whatsit"</code>, <code>"Samuel Sample"</code> and <code>"Bob Testing"</code> would come out, in that order.</p>
<p>But what if we could assign <em>two</em> priorities to each object? Imagine a hospital (to keep with the theme), that needs to keep a list of equipment supplies and their costs. It also needs to keep track of how long it will take to receive that item.</p>
<table><thead>
<tr>
<th align="right">Item</th>
<th align="left">Cost</th>
<th align="left">Shipping Time</th>
</tr>
</thead><tbody>
<tr>
<td align="right">Hyperion Hypodermic Needle</td>
<td align="left">£1.99</td>
<td align="left">3 days</td>
</tr>
<tr>
<td align="right">SuperSaver Syringe</td>
<td align="left">£0.89</td>
<td align="left">7 days</td>
</tr>
<tr>
<td align="right">InjectXpress Platinum Plated Needle</td>
<td align="left">£2.49</td>
<td align="left">2 days</td>
</tr>
</tbody></table>
<p>Here, when the hospital is at normal running conditions with good supply stock, it would want to buy the cheapest product possible - shipping time is of little concern. Thus, dequeueing by the <em>Lowest Cost</em> priority would give us the SuperSaver syringe. However, in a crisis (where supply may be strained) we want supplies as fast as possible, and thus dequeueing an item with the <em>Lowest Shipping Time</em> priority would give us the InjectXpress needle. This example isn't the best, but it gives an example of a priority queue that utilizes <em>two priority values</em> for each entry.</p>
<p>Your task today for the (non-extension) challenge will be to implement a two-priority priority queue for strings, where the priority is represented by a real number (eg. a floating-point value). The priority queue must be able to hold an unbounded number of strings (ie. no software limit). <strong>If your language of choice already supports priority queues with 1 priority, it might not be applicable to this challenge - read the specification carefully</strong>.</p>
<h1>Specification</h1>
<h2>Core</h2>
<p>Your priority queue must implement <em>at least</em> these methods:</p>
<ul>
<li><p><code>Enqueue</code>. This method accepts three parameters - a <strong>string</strong>, <strong>priority value A</strong>, and <strong>priority value B</strong>, where the priority values are <em>real numbers</em> (see above). The <strong>string</strong> is inserted into the priority queue with the given priority values <strong>A</strong> and <strong>B</strong> (how you store the queue in memory is up to you!)</p></li>
<li><p><code>DequeueA</code>. This method removes and returns the <strong>string</strong> from the priority queue with the highest <strong>priority A</strong> value. If two entries have the same A priority, return whichever was enqueued first.</p></li>
<li><p><code>DequeueB</code>. This method removes and returns the <strong>string</strong> from the priority queue with the highest <strong>priority B</strong> value. If two entries have the same B priority, return whichever was enqueued first.</p></li>
<li><p><code>Count</code>. This method returns the number of strings in the queue.</p></li>
<li><p><code>Clear</code>. This removes <em>all</em> entries from the priority queue.</p></li>
</ul>
<h2>Additional</h2>
<p>If you can, implement this method, too:</p>
<ul>
<li><code>DequeueFirst</code>. This removes and returns the <strong>string</strong> from the priority queue that was <strong>enqueued first</strong>, ignoring priority.</li>
</ul>
<p>Depending on how you implemented your priority queue, this may not be feasible, so don't get too hung up on this one.</p>
<h2>Extension</h2>
<p>Rather than making your priority queue only accept strings, make a <strong>generic</strong> priority queue, instead. A generic object is compatible with many types. In C++, this will involve the use of <a href="//en.wikipedia.org/wiki/Template_(C%2B%2B)">templates</a>. More reading resources <a href="//en.wikipedia.org/wiki/Generic_programming">here</a>. For example, in C#, your class name might look like <code>DualPriorityQueue&lt;TEntry&gt;</code>. Some dynamic languages such as Ruby or Python do not have static typing, so this will not be necessary.</p>
<h1>Notes</h1>
<h2>Making Use of your Language</h2>
<p>The main challenge of this exercise is knowing your language and its features, and adapting your solution to them. For example, in .NET-based languages, <code>Count</code> would be a property rather than a method, as that is more idiomatic in those languages. Similarly, in some languages such as Ruby, F# or other functional language, overloading operators may be more idiomatic than the usage of verbose <code>Enqueue</code> and <code>Dequeue</code> functions. How you do the specifics is up to you.</p>
<p>You should also be writing clean, legible code. Follow the style guide for your language, and use the correct naming/capitalisation conventions, which differ from language to language. Consider writing <a href="http://en.wikipedia.org/wiki/Unit_testing">unit tests</a> for your code, as an exercise in good practice!</p>
<h2>Tips and Reading Material</h2>
<p>If you are planning on using something like a heap for the priority queue, consider interleaving each item into two heaps to store both priorities. How you will handle the dequeueing is part of the fun! If the concept of a priority queue is new to you, here is some reading material.</p>
<ul>
<li><a href="http://pages.cs.wisc.edu/%7Evernon/cs367/notes/11.PRIORITY-Q.html">University of Wisconsin-Madison: priority queue</a></li>
<li><a href="http://www.oopweb.com/Java/Documents/ThinkCSJav/Volume/chap16.htm">Queues and Priority Queues</a></li>
</ul>
<p>Here's some more stuff on unit testing.</p>
<ul>
<li><a href="http://en.wikibooks.org/wiki/Introduction_to_Software_Engineering/Testing/Unit_Tests">Unit testing on WikiBooks</a></li>
<li><a href="https://msdn.microsoft.com/en-us/library/hh694602.aspx">MSDN: .NET unit tests</a></li>
<li><a href="https://developer.salesforce.com/page/How_to_Write_Good_Unit_Tests">Writing good unit tests</a></li>
</ul>
<h1>Finally...</h1>
<p>I wonder what this data structure would be called? A double priority queue?</p>
<p>Got a good idea for a challenge? Head on over to <a href="/r/DailyProgrammer_Ideas">/r/DailyProgrammer_Ideas</a> and tell us!</p>
</div>
