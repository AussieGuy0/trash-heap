# Get that URL!
<div class="md"><p><strong>Description:</strong></p>
<p><a href="http://en.wikipedia.org/wiki/Uniform_resource_locator">Website URLs</a>, or Uniform Resource Locators, sometimes embed important data or arguments to be used by the server. This entire string, which is a URL with a <a href="http://en.wikipedia.org/wiki/Query_string">Query String</a> at the end, is used to "<a href="http://en.wikipedia.org/wiki/GET_(HTTP">GET</a>#Request_methods)" data from a web server.</p>
<p>A classic example are URLs that declare which page or service you want to access. The Wikipedia log-in URL is the following:</p>
<pre><code>http://en.wikipedia.org/w/index.php?title=Special:UserLogin&amp;returnto=Main+Page
</code></pre>
<p>Note how the URL has the Query String "?title=..", where the value "title" is "Special:UserLogin" and "returnto" is "Main+Page"?</p>
<p>Your goal is to, given a website URL, validate if the URL is well-formed, and if so, print a simple list of the key-value pairs! Note that URLs only allow specific characters (<a href="http://en.wikipedia.org/wiki/Uniform_resource_locator#List_of_allowed_URL_characters">listed here</a>) and that a Query String must always be of the form "&lt;base-URL&gt;[?key1=value1[&amp;key2=value2[etc...]]]"</p>
<p><strong>Formal Inputs &amp; Outputs:</strong></p>
<p><em>Input Description:</em></p>
<p>String GivenURL - A given URL that may or may not be well-formed.</p>
<p><em>Output Description:</em></p>
<p>If the given URl is invalid, simply print "The given URL is invalid". If the given URL is valid, print all key-value pairs in the following format:</p>
<pre><code>key1: "value1"
key2: "value2"
key3: "value3"
etc...
</code></pre>
<p><strong>Sample Inputs &amp; Outputs:</strong></p>
<p>Given "<a href="http://en.wikipedia.org/w/index.php?title=Main_Page&amp;action=edit">http://en.wikipedia.org/w/index.php?title=Main_Page&amp;action=edit</a>", your program should print the following:</p>
<pre><code>title: "Main_Page"
action: "edit"
</code></pre>
<p>Given "<a href="http://en.wikipedia.org/w/index.php?title=">http://en.wikipedia.org/w/index.php?title=</a> hello world!&amp;action=é", your program should print the following:</p>
<pre><code>The given URL is invalid
</code></pre>
<p>(To help, the last example is considered invalid because space-characters and unicode characters are not valid URL characters)</p>
</div>
