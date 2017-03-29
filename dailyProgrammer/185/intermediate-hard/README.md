# Roots of a Polynomial
<div class="md"><h1><a href="#HardIcon"></a> <strong>(Intermediate to Hard)</strong>: Roots of a Polynomial</h1>
<p>In mathematics, a polynomial is a form of expression. The type of polynomials we're dealing with today are called <em>univariate</em> polynomials, which means they only have one variable. For this challenge, this variable will be called <code>x</code>. You'll need to dig out your algebra textbooks if you're a bit rusty, though this challenge doesn't require you to use anything more than high school (A-level) mathematics.</p>
<p>The simplest type of polynomial is this:</p>
<pre><code>4
</code></pre>
<p>Fairly simple, right? Right. A constant value such as <code>4</code>, <code>0</code> or <code>-0.2</code> are polynomials of degree zero.  The next simplest type looks like this:</p>
<pre><code>4x+3
</code></pre>
<p>The equation for a straight-line graph is a polynomial of degree one. Again, fairly simple to work with. The good thing about polynomials is that we can visualise them using graphs. <a href="https://www.desmos.com/calculator/llczd44a8i">Here is the graph for <code>y=4x+3</code>, the polynomial above</a>. The next simplest is the quadratic equation, otherwise known as a polynomial of degree two (notice the pattern yet?). These are similar to linear equations, but they feature a multiple of x squared bolted onto the front. <a href="https://www.desmos.com/calculator/nmzbjtiqmf">Here is the graph of <code>y=x^2-6x+3</code></a>, <a href="https://www.desmos.com/calculator/2vjpjxxgwp">and here is the graph of <code>y=(-1/3)x^2-x+8</code></a>.</p>
<p>The cool thing about quadratics is that you can create them by multiplying together two linear polynomials. For example, <code>(3x-1)(x+7)</code> is the same as <code>3x^2+20x-7</code>, <a href="https://www.desmos.com/calculator/si0svfjmcj">as you can see here</a>. If we take a look at the graph of <code>y=3x-1</code>, <code>y=x+7</code> and <code>y=3x^2+20x-7</code> we notice something interesting. <a href="https://www.desmos.com/calculator/maw5tkik1p">Here you can see</a> the quadratic graph crosses the x-axis at the same point as where the linear graphs do. The point where a polynomial crosses the x=axis are called its <em>roots</em> - which is what we will be finding in today's challenge.</p>
<p>You can also do the reverse operation - given an equation, find its roots. For a linear equation, this is simple. A bit of algebraic jiggery-pokery gives us these steps. Remember, the graph will cross the x-axis where the height (y) is at zero, so we need to set <code>y=0</code>.</p>
<pre><code>y=ax+b and y=0
0=ax+b (replace the y in the first equation with 0, as y=0)
-b=ax (subtract b from both sides)
-b/a=x (divide both sides by a)
</code></pre>
<p>Therefore, we can see that if we have a linear equation <code>y=ax+b</code>, it crosses the x=axis at the point where its x value is <code>-b/a</code>. The same can be done for quadratic polynomials via a few methods, including using the <a href="https://en.wikipedia.org/wiki/Quadratic_formula">quadratic formula</a> or <a href="https://en.wikipedia.org/wiki/Completing_the_square">completing the square</a>. If all else fails you can just draw the graph of the expression to approximate its roots.</p>
<p>What happens when the plotted graph never crosses the x-axis? Simply, it has <em>no</em> roots (or no real roots). If you attempt to use the quadratic formula on an equation such as <code>x^2+x+4</code> you will end up square-rooting a negative number, which we ignore for today's challenge.</p>
<p>Things get a little awkward when you have 3rd-degree polynomials and above. They act the same and are treated the same as other polynomials but there is no simple formula to find the roots. The Babylonians could find the roots of quadratic polynomials, but it took mathematicians until the Renaissance to find a one-step formula to get the roots of a cubic polynomial.</p>
<p>Rather than bothering with the convoluted cubic formula you can instead use what are known as numerical methods. These methods are approximation methods, and rather than giving you an exact answer immediately they 'home in' on the roots like a heat-seeking missile. The benefits of these are that they can be used to find roots of almost any mathematical function, not only polynomils. They can also be used to find roots of very complex polynomials, where a one-step equation would be huge and ugly. The downsides are that they can often be slow to find the answer, they can only give you one root at a time and, sometimes, they never even find the root at all! There are several numerical methods to find polynomial roots, the most commonly used are these:</p>
<ul>
<li><a href="https://en.wikipedia.org/wiki/Bisection_method">Interval Bisection method</a>. This is a simple to understand, divide-and-conquer algorithm.</li>
<li><a href="https://en.wikipedia.org/wiki/Newton%27s_method">Newton-Raphson method</a>. More complex to understand but quicker at finding a root.</li>
<li><a href="https://en.wikipedia.org/wiki/Root-finding_algorithm#Interpolation_2">Other root finding algorithms</a> such as linear interpolation are also easy to understand.</li>
</ul>
<p>Your challenge is, given a polynomial expression of degree no higher than 7, find a root (if it exists) of the expression where it crosses the x-axis (equal to zero.)</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>You will accept a polynomial in the form used in this challenge description. That is:</p>
<ul>
<li><code>x</code> denotes the variable.</li>
<li><code>^...</code> denotes the exponent of a term.</li>
<li>A constant denotes the coefficient of a term.</li>
</ul>
<p>A valid input would be <code>x^3-5x^2+10x-44</code> or <code>-4x^5-7</code>, but not <code>2^x+3</code> (not a polynomial), <code>x^2+2xy+y^2</code> (more than one variable) or <code>x^11-6x^2-1</code> (no higher than 7th degree allowed; that is 11th degree).</p>
<h2>Output Description</h2>
<p>You are to output a root of the polynomial as a number (or an algebraic expression.. if you're crazy!)</p>
<h1>Sample Inputs and Outputs</h1>
<p>Here are some examples to get you going. You can create your own by <a href="http://www.wolframalpha.com/input/?i=x%5E2-7x%2B6">typing them in on Wolfram|Alpha</a>, which also plots it and tells you the roots, if any.</p>
<h2>Sample Inputs</h2>
<ol>
<li><code>4x^2-11x-3</code></li>
<li><code>4x-8</code></li>
<li><code>x^4-2x^3+7x^2-16x+4</code></li>
<li><code>x^2-7x+6</code></li>
</ol>
<h2>Sample Outputs</h2>
<ol>
<li><code>-0.25</code> or <code>3</code></li>
<li><code>2</code></li>
<li><code>2</code> or <code>0.2825..</code></li>
<li><code>1</code> or <code>6</code></li>
</ol>
<h1>Extension (Hard)</h1>
<p>You've found one root of the polynomial - now modify your solution to find <em>all</em> of the roots. This will require a divide-and-conquer algorithm of some sort.</p>
</div>
