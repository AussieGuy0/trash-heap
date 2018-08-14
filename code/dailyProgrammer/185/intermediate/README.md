# Syntax Highlighting
<div class="md"><h1><a href="#IntermediateIcon"></a> <strong>(Intermediate)</strong>: Syntax Highlighting</h1>
<p><em>(sorry for the delay, an unexpected situation arose yesterday which meant the challenge could not be written.)</em></p>
<p>Nearly every developer has came into contact with syntax highlighting before. Most modern IDEs support it to some degree, and even some text editors such as Notepad++ and gedit support it too. Syntax highlighting is what turns this:</p>
<pre><code>using System;

public static class Program
{
    public static void Main(params string[] args)
    {
        Console.WriteLine("hello, world!");
    }
}
</code></pre>
<p>into <a href="http://i.imgur.com/DhfeU8D.png">something like this</a>. It's very useful and can be applied to almost every programming language, and even some markup languages such as HTML. Your challenge today is to pick any programming language you like and write a converter for it, which will convert source code of the language of your choice to a highlighted format. You have some freedom in that regard.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>The program is to accept a source code file in the language of choice.</p>
<h2>Output Description</h2>
<p>You are to output some format which allows formatted text display. Here are some examples for you to choose.</p>
<ul>
<li>You could choose to make your program output HTML/CSS to highlight the syntax. For example, a highlighted keyword <code>static</code> could be output as <code>&lt;span class="syntax-keyword"&gt;static&lt;/span&gt;</code> where the CSS <code>.syntax-keyword</code> selector makes the keyword bold or in a distinctive colour.</li>
<li>You could output an image with the text in it, coloured and styled however you like.</li>
<li>You could use a library such as <code>ncurses</code> (or another way, such as <code>Console.ForegroundColor</code> for .NET developers) to output coloured text to the terminal directly, siimlar to the style of complex editors such as vim and Emacs.</li>
</ul>
<h1>Sample Inputs and Outputs</h1>
<p>The exact input is up to you. If you're feeling meta, you could test your solution using... your solution. If the program can highlight its own source code, that's brilliant! Of course, this assumes that you write your solution to highlight the language it was written in. If you don't, don't worry - you can write a highlighter for Python in C# if you wish, or for C in Ruby, for example.</p>
<h1>Extension (Easy)</h1>
<p>Write an extension to your solution which allows you to toggle on and off the printing of comments, so that when it is disabled, comments are omitted from the output of the solution.</p>
<h1>Extension (Hard)</h1>
<p>If your method of output supports it, allow the collapsing of code blocks. <a href="http://gfycat.com/DefensiveLimpDore">Here is an example in Visual Studio</a>. You could achieve this using JavaScript if you output to HTML.</p>
</div>
