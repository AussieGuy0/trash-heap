# Symbolic Link Resolution
<div class="md"><h1><a href="#EasyIcon"></a> <strong>(Easy)</strong>: Symbolic Link Resolution</h1>
<p>Many Unix-based systems support the concept of a <strong>symbolic link</strong>. This is where one directory name is transparently mapped to another. Before we look further at symbolic links, here's a brief primer on Unix paths.</p>
<ul>
<li><p>The root directory on a file-system is <code>/</code>. Everything is contained with in <code>/</code>. This is like <code>C:\</code> on Windows, but contains everything rather than just the system drive. Thus, all absolute paths begin with a <code>/</code> - if it doesn't, the path is assumed to be relative to the current location.</p></li>
<li><p>Successive nested directorys are joined with slashes, so a directory <code>a</code> in a directory <code>b</code> in a directory <code>c</code> in root is denoted <code>/c/b/a</code>.</p></li>
<li><p>To distinguish a directory from a file, a trailing slash can be added, so <code>/c/b/a</code> and <code>/c/b/a/</code> are equivalent assuming <code>a</code> is a directory and not a file.</p></li>
<li><p>Path names are case sensitive. <code>/bin/thing</code> is different from <code>/bin/Thing</code>.</p></li>
</ul>
<p>Now, symbolic links are the more general equivalent of Windows shortcuts. They can be used to 'redirect' one directory to another. For example, if I have a version of a program <code>thing</code> located at <code>/bin/thing-2</code>, then when thing upgrades to thing 3 then any programs referring to <code>/bin/thing-2</code> will break once it changes to <code>/bin/thing-3</code>. Thus, I might make a symbolic link <code>/bin/thing</code> which refers to <code>/bin/thing-2</code>. This means any attempt to visit a path beginning with <code>/bin/thing</code> will be silently redirected to <code>/bin/thing-2</code>. Hence, once the program updates, just change the symbolic link and everything is working still.</p>
<p>Symbolic links can have more to them, and you can in fact make them on Windows with some NTFS trickery, but this challenge focuses just on Unix style directories.</p>
<p>Our challenge is to resolve a given path name into its actual location given a number of symbolic links. Assume that symbolic links can point to other links.</p>
<h2>Input Description</h2>
<p>You will accept a number <strong>N</strong>. You will then accept <strong>N</strong> lines in the format:</p>
<pre><code>/path/of/link:/path/of/destination
</code></pre>
<p>Then you will accept a path of a directory to be fully expanded.</p>
<p>For example:</p>
<pre><code>4
/bin/thing:/bin/thing-3
/bin/thing-3:/bin/thing-3.2
/bin/thing-3.2/include:/usr/include
/usr/include/SDL:/usr/local/include/SDL
/bin/thing/include/SDL/stan
</code></pre>
<h2>Output Description</h2>
<p>Expand it into its true form, for example:</p>
<p>/usr/local/include/SDL/stan</p>
<h1>Sample Inputs and Outputs</h1>
<h2>Sample Input</h2>
<pre><code>1
/home/elite/documents:/media/mmcstick/docs
/home/elite/documents/office
</code></pre>
<h2>Sample Output</h2>
<pre><code>/media/mmcstick/docs/office
</code></pre>
<h2>Sample Input</h2>
<pre><code>3
/bin:/usr/bin
/usr/bin:/usr/local/bin/
/usr/local/bin/log:/var/log-2014
/bin/log/rc
</code></pre>
<h2>Sample Output</h2>
<pre><code>/var/log-2014/rc
</code></pre>
<h2>Sample Input</h2>
<pre><code>2
/etc:/tmp/etc
/tmp/etc/:/etc/
/etc/modprobe.d/config/
</code></pre>
<h2>Sample Output</h2>
<p>Program should hang - recursive loop.</p>
<p>(I know nested symlinks are restricted in practice, but we're livin' life on the edge in this subreddit.)</p>
<h1>Extension</h1>
<p>Extend your solution to resolve existing symlinks in the definition of successive symlinks. For example:</p>
<pre><code>4
/bin/thing:/bin/thing-3
/bin/thing-3:/bin/thing-3.2
/bin/thing/include:/usr/include
/bin/thing-3.2/include/SDL:/usr/local/include/SDL
/bin/thing/include/SDL/stan
</code></pre>
<p>Notice how the 3rd link relies on the first and second symlinks, and the 4th link relies on the 3rd link working.</p>
<p>This should resolve correctly into <code>/usr/local/include/SDL/stan</code>.</p>
</div>
