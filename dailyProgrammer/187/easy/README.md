# A Flagon of Flags
<div class="md"><h1><a href="#EasyIcon"></a> <strong>(Easy)</strong>: A Flagon of Flags</h1>
<p>In the command-line world, programs are operated not with graphical user interfaces but with command line flags. These flags are what the operator uses to pass parameters to the program. The standard form of flag starts with a double hyphen <code>--</code> and consists of a word in <code>lower-case-separated-by-hyphens</code>. For example, to forcefully remove a directory recursively on Unix based systems, the command used may be:</p>
<pre><code>rm --recursive --force dir/
</code></pre>
<p>Here, the <code>recursive</code> and <code>force</code> flags have been enabled, which the program detects and changes its behaviour accordingly. Alternatively, many programs allow a <em>short-form</em> of command-line flag. These flags are one letter long andn start with a single hyphen <code>-</code>. For example, the above command can be reduced to:</p>
<pre><code>rm -r -f dir/
</code></pre>
<p>This is much shorter, so commonly used flags are often abbreviated as such. An even shorter form merges several of these flags into one flag. This is still separated by a hyphen but consists of multiple letters. For example, in the <code>tar</code> command on Unix based systems, the <code>-x -z -v</code> flags can be merged into <code>-xzv</code> with the exact same meaning. The above <code>rm</code> command looks like this:</p>
<pre><code>rm -rf dir/
</code></pre>
<p>This is even more convenient for a terminal operator to enter. Today, you will write a program which will accept a string of flags in the above formats and output which flags were activated.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>You will first input a number <strong>N</strong>. You will then accept <strong>N</strong> lines of input in the format:</p>
<pre><code>f:force
</code></pre>
<p>This is a <em>short-form definition</em>; this particular example denotes that the flag <code>-f</code> is equivalent to the flag <code>--force</code>. Lastly you are to accept one further line of input containing the flags and other parameters passed to the program. Remember that programs can accept parameters that are <em>not</em> flags. These don't start with a hyphen and there may be several of them. For example,</p>
<pre><code>-Q -rf --no-preserve-root directory1/ directory2/
</code></pre>
<p>In which the flags given are <code>-Q</code> <code>-rf</code> (same as <code>-r -f</code>) and <code>--no-preserve-root</code>, and the parameters are <code>directory1/</code> and <code>directory2/</code>. Remember the <code>Q</code>, <code>r</code> and <code>f</code> flags are defined in the short-form definition format above.</p>
<h2>Output Description</h2>
<p>You are to output a list of the <em>full names</em> of all of the flags entered (eg. <code>force</code> rather than <code>f</code>), as well as all of the parameters entered. Alternatively, if a short-form flag is entered that doesn't have a difinition, print an error.</p>
<h1>Sample Inputs and Outputs</h1>
<h2>Sample Input</h2>
<pre><code>4
a:all
f:force
n:networking
N:numerical-list
-aN 12 --verbose 192.168.0.44
</code></pre>
<p>(not all commands need a short-form expression; here, <code>verbose</code> only exists as the long-form.)</p>
<h2>Sample Output</h2>
<pre><code>flag: all
flag: numerical-list
parameter: 12
flag: verbose
parameter: 192.168.0.44
</code></pre>
<h1>Extension (Intermediate)</h1>
<p>Some flags may have a parameter. For example, a flag <code>output</code> may take a filename parameter. The long form of this would be:</p>
<pre><code>--output=log.txt
</code></pre>
<p>The short form of this would be:</p>
<pre><code>-o log.txt
</code></pre>
<p>The short form has no equals sign, but the long form does. The short form can still be used as a combination, like</p>
<pre><code>-rxo log.txt
</code></pre>
<p>Would activate the <code>r</code> and <code>x</code> flags, along with setting the value of <code>o</code> to <code>log.txt</code>. In this case, print the output like so:</p>
<pre><code>flag: output (value: log.txt)
</code></pre>
<p>To denote that a flag can take a parameter, its input short-form definition is prefixed with a star <code>*</code>, like so:</p>
<pre><code>*o:output
</code></pre>
<h2>Sample Extension Input</h2>
<pre><code>6
a:all
*A:address
f:force
n:networking
N:numerical-list
*o:output
-aNo output-dir/file.txt 12 --verbose --address=192.168.0.44
</code></pre>
<h2>Sample Extension Output</h2>
<pre><code>flag: all
flag: numerical-list
flag: output (value: output-dir/file.txt)
parameter: 12
flag: verbose
flag: address (value: 192.168.0.44)
</code></pre>
<h1>Notes and Further Reading</h1>
<p>Here is a <a href="http://stackoverflow.com/questions/2160083/what-is-the-general-syntax-of-a-unix-shell-command/2160165#2160165">StackOverflow post</a> describing the standard in greater detail for command line flags.</p>
<h1>Thanks</h1>
<p>The idea for the challenge comes from <strong>jnazario</strong>, <strong>XenophonOfAthens</strong> and <strong>savage884</strong>. Thank you very much! The original post by <strong>jnazario</strong> detailing the solution is <a href="http://www.reddit.com/r/dailyprogrammer_ideas/comments/2hwsue/easy_implement_a_command_line_argument_parser/">here</a>. It has some more reading material if you're interested. Check it out.</p>
<h1>Participate</h1>
<p>This subreddit needs <em>you</em>, the developer, to survive. Join our IRC channel on <code>irc.freenode.net</code> at <code>#Reddit-DailyProgrammer</code> and come and have a chat. Don't forget to submit any challenge ideas to <a href="/r/DailyProgrammer_Ideas">/r/DailyProgrammer_Ideas</a> - there's a chance we'll use it! If your challenge is used for a submission you will receive a gold medal for your flair, as the 3 original submitters have done today (well done!)</p>
</div>
