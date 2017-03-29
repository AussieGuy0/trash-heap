# Text Markup
<div class="md"><p><strong>Description:</strong></p>
<p>Many technologies, notably user-edited websites, take a source text with a special type of mark-up and output HTML code. As an example, Reddit uses a special formatting syntax to turn user texts into bulleted lists, web-links, quotes, etc.</p>
<p>Your goal is to write a function that specifically implements the Reddit markup language, and returns all results in appropriate HTML source-code. The actual HTML features you would like to implement formatting (i.e. using CSS bold vs. the old &lt;b&gt; tag) is left up to you, though "modern-and-correct" output is highly desired!</p>
<p><a href="http://www.reddit.com/help/commenting">Reddit's markup description is defined here</a>. You are required to implement all 9 types found on that page's "Posting" reference table.</p>
<p><strong>Formal Inputs &amp; Outputs:</strong></p>
<p><em>Input Description:</em></p>
<p>String UserText - The source text to be parsed, which may include multiple lines of text.</p>
<p><em>Output Description:</em></p>
<p>You must print the HTML formatted output.</p>
<p><strong>Sample Inputs &amp; Outputs:</strong></p>
<p>The string literal <code>*Test*</code> should print &lt;b&gt;Test&lt;/b&gt; or &lt;div style="font-weight:bold;"&gt;Test&lt;/div&gt;</p>
</div>
