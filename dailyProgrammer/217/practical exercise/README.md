# TeXSCII
<div class="md"><h1><a href="#PEIcon"></a> <em>(Practical Exercise)</em>: TeXSCII</h1>
<p>LaTeX is a typesetting utility based on the TeX typesetting and macro system which can be used to output mathematical formulae to display or print. For example, the LaTeX code <code>\frac{-b\pm\sqrt{b^{2}-4ac}}{2a}</code> will be transformed into <a href="http://latex.codecogs.com/gif.latex?%5Cdpi%7B200%7D%20%5Cfrac%7B-b%5Cpm%5Csqrt%7Bb%5E%7B2%7D-4ac%7D%7D%7B2a%7D">this</a> when typeset.</p>
<p>The syntax of LaTeX formulae is fairly simple; commands begin with a backslash <code>\</code>, followed by the command name, followed by its arguments in curly braces, such as <code>\sqrt{-1}</code> (square-root of -1) or <code>\frac{1}{3}</code> (1/3 as a fraction). Subscript and superscript are also supported, with the <code>_</code> and <code>^</code> characters respectively, followed by the script in curly braces - for example, <code>x^{2}</code> outputs x<sup>2</sup>. Everything else is output as plain text.</p>
<p>In today's challenge, you'll implement a simplified subset of LaTeX which outputs the resulting formula as ASCII.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Specification</h2>
<p>You'll be given a LaTeX equation on one line. The commands you need to support are:</p>
<ul>
<li><code>\frac{top}{bottom}</code>: A fraction with the given top and bottom pieces</li>
<li><code>\sqrt{content}</code>: A square-root sign</li>
<li><code>\root{power}{content}</code>: A root sign with an arbitrary power (eg. cube-root, where the power 3 is at the top-left of the radical symbol)</li>
<li><code>_{sub}</code>: Subscript</li>
<li><code>^{sup}</code>: Superscript</li>
<li><code>_{sub}^{sup}</code>: Subscript and superscript (one on top of the other)</li>
<li><code>\pi</code>: Output the greek symbol for pi</li>
</ul>
<p>Feel free to extend your solution to support any additional structures such as integral signs.</p>
<h2>Output Description</h2>
<p>Output the formula with ASCII symbols in the appropriate locations. You're free to pick the output style that looks most appropriate to you. One possible way might be something like this:</p>
<pre><code>  3_
  √x
y=--
  3 
</code></pre>
<h1>Sample Inputs and Outputs</h1>
<h2>Subscripts and Superscripts</h2>
<h3>Input</h3>
<pre><code>log_{e}(e^{x})=x
</code></pre>
<h3>Output</h3>
<pre><code>      x
log (e )=x
   e
</code></pre>
<h2>Stacked Scripts</h2>
<h3>Input</h3>
<pre><code>F_{21}^{3}=2^{5}*7^{3}-30
</code></pre>
<h3>Output</h3>
<pre><code> 3   5  3   
F  =2 *7 -30
 21         
</code></pre>
<h2>Fractions</h2>
<h3>Input</h3>
<pre><code>sin^{3}(\frac{1}{3}\pi)=\frac{3}{8}\sqrt{3}
</code></pre>
<h3>Output</h3>
<pre><code>   3 1   3 _
sin (-π)=-√3
     3   8  
</code></pre>
<h2>Quadratic Formula</h2>
<h3>Input</h3>
<pre><code>x=\frac{-b+\sqrt{b^{2}-4ac}}{2a}
</code></pre>
<h3>Output</h3>
<pre><code>       ______
      / 2    
  -b+√ b -4ac
x=-----------
     2a     
</code></pre>
<h2>Cubic Formula</h2>
<p>(I hope)</p>
<h3>Input</h3>
<pre><code>x=\frac{\root{3}{-2b^{3}+9abc-27a^{2}d+\sqrt{4(-b^{2}+3ac)^{3}+(-2b^{3}+9abc-27a^{2}d)^{2}}}}{3\root{3}{2}a} - \frac{b}{3a} - \frac{\root{3}{2}(-b^{2}+3ac)}{3a\root{3}{-2b^{3}+9abc-27a^{2}d+\sqrt{4(-b^{2}+3ac)^{3}+(-2b^{3}+9abc-27a^{2}d)^{2}}}}
</code></pre>
<h3>Output</h3>
<pre><code>    3________________________________________________                                                             
    /                  ______________________________                                                             
   /    3         2   /    2     3     3         2  2                             3_   2                          
  √  -2b +9abc-27a d+√ 4(-b +3ac) +(-2b +9abc-27a d)    b                         √2(-b +3ac)                     
x=--------------------------------------------------- - -- - -----------------------------------------------------
                          3_                            3a       3________________________________________________
                         3√2a                                    /                  ______________________________
                                                                /    3         2   /    2     3     3         2  2
                                                             3a√  -2b +9abc-27a d+√ 4(-b +3ac) +(-2b +9abc-27a d) 
</code></pre>
<h1>Notes and Further Reading</h1>
<p>Solutions have a recommended order of <em>new</em> again - feel free to change it back if you prefer <em>best</em>. If you want to play around some with LaTeX, try <a href="http://www.codecogs.com/latex/eqneditor.php">this online tool</a>.</p>
<p>Got any cool challenge ideas? Submit them to <a href="/r/DailyProgrammer_Ideas">/r/DailyProgrammer_Ideas</a>!</p>
</div>
