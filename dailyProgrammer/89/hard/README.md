# (Coloring the United States of America)
<div class="md"><p>On wikipedia, you can find <a href="http://en.wikipedia.org/wiki/File:Blank_US_Map.svg">this lovely blank map</a> of the United States. What makes it so lovely? Well, first off all, it's in the <a href="http://en.wikipedia.org/wiki/File:Blank_US_Map.svg">SVG format</a>, which means that you can download it and edit it quite easily, even with a computer program you write yourself (SVG is nothing but XML, after all).</p>
<p>Second, the kind mapmaker has gone to the extra trouble of labelling all the states in the code with their proper abbreviation (so "AR" for "Arkansas" and "MT" for "Montana"). For instance, look at the source file for that image, and you'll see that the first path that is defined has the id "HI", so we know it represents Hawaii. </p>
<p>By parsing that file, noting the "id" attributes of the various "path" tags, you can then change the color of a specific state by changing the "style" attribute. For instance, if we change Hawaii's style attribute from</p>
<pre><code>fill:#d3d3d3;stroke:#ffffff;stroke-opacity:1;stroke-width:0.75;stroke-miterlimit:4;stroke-dasharray:none
</code></pre>
<p>to</p>
<pre><code>fill:#ff0000;stroke:#ffffff;stroke-opacity:1;stroke-width:0.75;stroke-miterlimit:4;stroke-dasharray:none
</code></pre>
<p>then Hawaii will stand out as bright red. </p>
<p>Your task today is to write a program that will read in that SVG file, then assign colors to all the different US states, such that no states that share a border has the same color.  <a href="http://i.imgur.com/QN3sG.png">Here is an example</a>. You don't have to figure out what states border which other states from the SVG file, you can just put that as a table in your code, or use any other solution you can come up with. </p>
<p>If you finish, please upload your image, or a PNG of your image, to imgur, so the rest of us can see what it looks like!</p>
<p>Bonus: By the <a href="http://en.wikipedia.org/wiki/4-color_theorem">4-color theorem</a> all maps like this can be colored using at most 4 colors, so that no two regions that share a border have the same color. Color the map using only four different colors.</p>
<p><strong>NOTE:</strong> Look out for Michigan! Michigan is tricky. </p>
<hr/>
<p>Edit: to make it easier for everyone, <a href="http://pastebin.com/uNJAEfgr">here's a list of what states borders other states</a>. I compiled it myself, so I can't guarantee accuracy (though I'm fairly sure it's accurate, and it works fine in my program). To be clear, a line like</p>
<pre><code>ND &lt;- MN, SD, MT
</code></pre>
<p>Means that North Dakota borders Minnesota, South Dakota and Montana. </p>
</div>
