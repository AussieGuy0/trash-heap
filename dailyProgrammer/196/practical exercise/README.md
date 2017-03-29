# Ready... set... set!
<div class="md"><h1><a href="#PEIcon"></a> <strong>(Practical Exercise)</strong>: Ready... set... Set!</h1>
<p>The <a href="/r/dailyprogrammer/comments/2nr6c4/20141129_challenge_190_practical_exercise_the/">last practical exercise</a> was well-received so I'm going to make another one. This one is less complicated and, if you're still finding your feet with object-oriented programming, should be great practice for you. This should be doable in functional languages too.</p>
<p>The idea of a Set can be very math-y when you delve deeper but this post only skims the surface, so it shouldn't pose any issue!</p>
<h2>Background</h2>
<p>A <em>set</em> is a mathematical concept that represents a collection of other objects. Those other objects can be numbers, words, operations or even sets themselves; for the (non-extension) purposes of the challenge they are integers only. A <em>finite set</em> is a set with only a finite number of items (unlike, for example, the set of all real numbers <strong>R</strong> which has uncountably infinite members.)</p>
<p>A set is generally represented with curly brackets with the items separated by commas. So, for example, the set containing <code>-3</code>, <code>6</code> and <code>11</code> could be written as <code>{-3, 6, 11}</code>. This notation is called an <em>extensional definition</em>. </p>
<p>There are some distinctions between a set and the list/array data structure:</p>
<ul>
<li><p>Repeated items are ignored, so <code>{-3, 6, 11}</code> is exactly the same as <code>{-3, -3, 6, 11}</code>. To understand why this is so, think less of a set being a container of items, but rather the items are members of a set - much like how you can't be a subscriber on <a href="/r/DailyProgrammer">/r/DailyProgrammer</a> twice.</p></li>
<li><p>Order doesn't matter - <code>{-3, 6, 11}</code> is the same as <code>{6, 11, -3}</code> and so on. </p></li>
<li><p>Sets are generally seen as <em>immutable</em>, which means that rather than adding an item <strong>A</strong> to a set <strong>S</strong>, you normally create a new set with all the members of <strong>S</strong>, <em>and</em> <strong>A</strong>. Immutable data structures are quite a common concept so this will serve as an intro to them if you've not came across them already.</p></li>
<li><p>A set can be empty - <code>{}</code>. This is called the empty set, weirdly enough.</p></li>
</ul>
<p>Sets have 3 main operations.</p>
<ul>
<li><p>Union, with the symbol ∪. An item is a member of set <strong>S</strong>, where <strong>S</strong>=<strong>A</strong>∪<strong>B</strong>, if it's a member of set <strong>A</strong> or set <strong>B</strong>.<br/>
For example, let <strong>A</strong>=<code>{1, 4, 7}</code> and let <strong>B</strong>=<code>{-4, 7, 10}</code>. Then, <strong>A</strong>∪<strong>B</strong>=<code>{-4, 1, 4, 7, 10}</code>.</p></li>
<li><p>Intersection, with the symbol ∩. An item is a member of set <strong>S</strong>, where <strong>S</strong>=<strong>A</strong>∩<strong>B</strong>, if it is a member of set <strong>A</strong> <em>and</em> set <strong>B</strong>.<br/>
For example, let <strong>A</strong>=<code>{1, 4, 7}</code> and let <strong>B</strong>=<code>{-4, 7, 10}</code>. Then, <strong>A</strong>∩<strong>B</strong>=<code>{7}</code>, as only 7 is a member of both sets.</p></li>
<li><p>Complement, with the symbol '. An item is a member of set <strong>S</strong>, where <strong>S</strong>=<strong>A</strong>', if it's not a member of <strong>A</strong>.<br/>
For example, let <strong>A</strong>=<code>{1, 4, 7}</code>. Then, <strong>A</strong>' is <em>every integer</em> except 1, 4 and 7.</p></li>
</ul>
<h1>Specification</h1>
<p>You are to implement a class representing a set of integers.</p>
<ul>
<li><p>To hold its content, you can use an array, list, sequence or whatever fits the language best. Consider encapsulating this (making it <code>private</code>) if your language supports it.</p></li>
<li><p>The class should expose a method <code>Contains</code>, which accepts an integer and returns whether the set contains that integer or not.</p></li>
<li><p>The constructor of the class should accept a list/array of integers which are to be the content of the set. Remember to ignore duplicates and order. Consider making it a variadic constructor (variable number of arguments) if your language supports it.</p></li>
<li><p>The class should have static methods for <code>Union</code> and <code>Intersection</code>, which both accept two sets and return another set containing the union or intersection of those two sets respectively. Remember, our sets are <em>immutable</em>, so create a new set rather tham modifying an existing one. Consider making these as binary operators (eg. <code>+</code> for union and <code>*</code> for intersection) if your language supports it.</p></li>
<li><p>The class should have another static method for <code>Equals</code> or <code>equals</code>, which accepts two sets and returns a boolean value. This determines if the two sets contain the same items and nothing else.</p></li>
</ul>
<p>Finally, the set should be convertible to a string in some way (eg. <code>ToString</code>, <code>toString</code>, <code>to_s</code> depending on the language) which shows all items in the set. It should show them in increasing order for readability.</p>
<p>If your language already has a class for sets, ignore it. The purpose of this exercise is to learn from implementing the class, not use the pre-existing class (although in most cases you would use the existing one.)</p>
<h2>Making Use of your Language</h2>
<p>The main challenge of this exercise is knowing your language and its features, and adapting your solution to them. For example, in Ruby, you would not write a <code>ToString</code> method - you would write a <code>to_s</code> method, as that is the standard in Ruby. In C++ and C#, you would not necessarily write static <code>Union</code>, <code>Intersection</code> methods - you have the ability to overload operators, and you should do so if it produces <a href="http://en.wikipedia.org/wiki/Programming_idiom">idiomatic code</a>. The research for this is part of the task. You should also be writing clean, legible code. Follow the style guide for your language, and use the correct naming/capitalisation conventions, which differ from language to language.</p>
<h2>Extension 1 (Intermediate)</h2>
<p>If you are feeling up to it, change your class for a set of integers and create a <a href="http://en.wikipedia.org/wiki/Generic_programming">generic</a> set class (or, if your language has dynamic typing, a set of any comparable type.) Depending on your language you might need to specify that the objects can be equated - I know in C# this is by <code>IEquatable</code> but other language will differ. Some languages like Ruby don't even need to.</p>
<h2>Extension 2 (Hard)</h2>
<p>This will require some thinking on your end. Add a <code>Complement</code> static method to your class, which accepts a set and returns another set containing everything <em>except</em> what's in the accepted set.<br/>
Of course, you can't have an array of every integer ever. You'll need to use another method to solve this extension, and adapt the rest of the class accordingly. Similarly, for the string conversion, you can't print an infinite number of items. For this reason, a set containing everything containing everything except 3 and 5 should print something like <code>{3, 5}'</code> (note the <code>'</code>). You could similarly use an overloaded operator for this - I've picked <code>!</code> in my solution.</p>
<h2>Addendum</h2>
<p>Happy new year! I know <a href="/u/Coder_d00d">/u/Coder_d00d</a> has already wished you so, but now I do too. Have fun doing the challenge, help each other out and good luck for the new year.</p>
</div>
