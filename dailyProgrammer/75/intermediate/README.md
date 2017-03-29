# (Build System)
<div class="md"><p>First off, I'd like to apologize for posting this 12 hours late, I'm a little new to my mod responsibilities.  However, with your forgiveness, we can go onward!</p>
<p>Everyone on this subreddit is probably somewhat familiar with the C programming language.
Today, all of our challenges are C themed!  Don't worry, that doesn't mean that you have to solve the challenge in C.</p>
<p>In C, that the compiler is usually invoked on each of the source files in a project to produce an object file for each source file.
Then, these object files are linked together to produce a binary or a dynamic or static library.  Usually, something like a Makefile or an IDE does this job.  By specifying
the source code and project settings in some kind of configuration file, the user tells the build system tools how to make the final executable from code.</p>
<p>Your job is to implement your own build system that will read a project description file and then build a project.  Use the simple build-system description language I've come up with below, and extend it as you see fit!  Here's how it works:</p>
<p>Each line of the input file is treated as a seperate command, where each command modifies or changes the build system in some way.  Trailing or leading whitespace or blank lines do not matter.  Commands are as follows:</p>
<p>Commands to set the target:</p>
<pre><code>exe &lt;file&gt;
lib &lt;file&gt;
</code></pre>
<p>This says that the current build target is an executable named &lt;file&gt;, or a static lib named &lt;file&gt;.  All subsequent commands affect this build target until it is changed.</p>
<p>Commands to set flags:</p>
<pre><code>ldflags &lt;flag1&gt; &lt;flag2&gt; &lt;flag3&gt; ... &lt;flagn&gt;
cflags &lt;flag1&gt; &lt;flag2&gt; &lt;flag3&gt; ... &lt;flagn&gt;
</code></pre>
<p>ldflags appends &lt;flags&gt; to the linker flags for the current build target
cflags appends &lt;flags&gt; to the compiler flags for the current build target</p>
<p>Commands to set dependencies:</p>
<pre><code>link &lt;file&gt;
</code></pre>
<p>This says to append &lt;file&gt; to the list of linked libraries for the current build target.  This is used for dependency resolution.</p>
<p>Commands to set source files.
If a line does not contain a command and is not blank, then that line is interpreted as the filename of a C source file to add to the current build target's source list.</p>
<p>Here is an example input file:</p>
<pre><code>lib libhello.a
    cflags -O3 -DHELLO_POSIX
    hello.c
    hello_win32.c
    hello_posix.c

exe hello
    cflags -O3
    hello_main.c
    link libhello.a
</code></pre>
<p>This should compile and link a library libhello.a from the three source files, with HELLO_POSIX as a compile definition, and then compile and link ./hello using that library.</p>
<p>BONUS POINTS:</p>
<p>You get major bonus points if your tool does minimal rebuilds...that is, if it only compiles out-of-date files and goes in dependency order instead of file layout order.</p>
</div>
