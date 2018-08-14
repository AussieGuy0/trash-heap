# Semantic Version Sort
<div class="md"><h1><a href="#EasyIcon"></a> <strong>(Easy)</strong>: Semantic Version Sort</h1>
<p>Semantic Versioning, or <em>Semver</em> as it's known on the streets, is an attempt to standardise the way that software versions are incrementally changed. In the world there are many different pieces of software whose developers have conflicting ideas about how software should be developed. For example, <a href="http://www.bay12games.com/dwarves/">Dwarf Fortress</a> is currently at version 0.40.13, whereas <a href="https://en.wikipedia.org/wiki/Google_Chrome">Google Chrome</a> (which has been around for 2 years <em>less</em> than Dwarf Fortress) is currently at version 37.0.2062.124. How can those version numbers even be compared? They both represent around the same progress of development but in totally different ways. Semantic versioning aims to solve this problem by splitting the version string into 3, 4 or 5 parts:</p>
<pre><code>&lt;major&gt;.&lt;minor&gt;.&lt;patch&gt;-&lt;label&gt;+&lt;metadata&gt;
</code></pre>
<ul>
<li><strong>major</strong>: Increased when your program changes in a way that makes it incompatible with older versions (major changes) - like the Python 2 to Python 3 change which, in order to make progress, broke a lot of existing programs.</li>
<li><strong>minor</strong>: Increased when you add functionality but keep compatibility and don't change existing bits of the API (minor changes) - for example, adding a new section of a standard library to a programming language.</li>
<li><strong>patch</strong>: Increased when you make minor functionality changes or bug fixes, like adding a new keyboard shortcut.</li>
<li><strong>label</strong>: Used to indicate pre-release program status, such as <em>beta</em>, <em>alpha</em> or <em>rc2</em> (release candidate 2.)</li>
<li><strong>metadata</strong>: Used to describe build metadata when a version is in the early development stages - this might include the build date of the program.</li>
</ul>
<p>For the purpose of this challenge, you will be sorting a list of Semantic Versions into chronological order, and you will do it like so:</p>
<ol>
<li><p>First, compare the major version.</p></li>
<li><p>If they are the same, compare the minor version.</p></li>
<li><p>If they are the same, compare the patch version.</p></li>
<li><p>If those are all the same, check if the version has a label - ignore the content of the label. A version with a label (prerelease) comes before one without a label (final release.)</p></li>
<li><p>Ignore the build metadata.</p></li>
</ol>
<p>If the semantic versions are still the same at this point, they can be considered the same version. For the purpose of this challenge we won't attempt to parse the label - but if you're feeling up to you can give it a try!</p>
<p>The full specification for Semantic Versioning <a href="http://semver.org/">can be found here</a>.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>You will first be given a number <strong>N</strong>. You will then be given <strong>N</strong> more lines, each one with a semantic version.</p>
<h2>Output Description</h2>
<p>You will print the versions in chronological order, as described by the rules above.</p>
<h1>Sample Inputs and Outputs</h1>
<h2>Sample Input</h2>
<pre><code>7
2.0.11-alpha
0.1.7+amd64
0.10.7+20141005
2.0.12+i386
1.2.34
2.0.11+i386
20.1.1+i386
</code></pre>
<h2>Sample Output</h2>
<pre><code>0.1.7+amd64
0.10.7+20141005
1.2.34
2.0.11-alpha
2.0.11+i386
2.0.12+i386
20.1.1+i386
</code></pre>
<h1>Tip</h1>
<p>If your chosen language supports it, create a <code>SemanticVersion</code> record/structure with the appropriate fields. If your language supports it, overload the comparison (<code>&lt;</code>, <code>&gt;</code>) operators to compare for you.</p>
<p>If your language does not support sorting of data structures by default, you could adjust your solution to <a href="/r/dailyprogrammer/comments/2ejl4x/">the Quicksort</a> challenge to work with this one.</p>
</div>
