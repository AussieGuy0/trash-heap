# Sort my code
<div class="md"><h1>Description</h1>
<p>Keeping your code clean is one thing. But keeping it sorted is a whole other thing...</p>
<p>Today you will get sorted <code>C++</code> coded (literaly) like this:</p>
<pre><code>  std::cout &lt;&lt; "Hello world!" &lt;&lt; std::endl;
}
#include &lt;iostream&gt;
int main () {
</code></pre>
<p>And you have to unsort it into this:</p>
<pre><code>#include &lt;iostream&gt;

int main () {
  std::cout &lt;&lt; "Hello world!" &lt;&lt; std::endl;
}
</code></pre>
<p>There are some rules you have to follow:</p>
<ul>
<li>Lines with <code>#include</code> always shows on top.</li>
<li>Indentation consists out of 2 spaces</li>
<li>Whitespace lines are not obliged</li>
<li>variables have to be defined before used.</li>
<li>Every <code>{</code> must have a <code>}</code> on the same indentation level</li>
<li>Lines that belong to the same method and are of the same indentation, are in order. </li>
</ul>
<h1>Input Description</h1>
<p>You'll be given a program that was sorted</p>
<pre><code>    sum = i + sum;
  {
  }
  int sum = 0
  for (int i = 0; i &lt;= 100; ++i)
  std::cout &lt;&lt; sum;
  return 0;
{
}
#include &lt;iostream&gt;
int main()
</code></pre>
<h1>Output Description</h1>
<p>Your program should unsort the lines to something compilable by the compiler:</p>
<pre><code>#include &lt;iostream&gt;

int main()
{
  int sum = 0;
  for (int i = 0; i &lt;= 100; ++i)
  {
    sum = i + sum;
  }
  std::cout &lt;&lt; sum;
  return 0;
}
</code></pre>
<h1>Challenge Input</h1>
<pre><code>    sum = i + sum;
  {
  }
  int sum = 0
  for (int i = 0; i &lt;= 100; ++i)
  std::cout &lt;&lt; sum;
  return 0;
{
}
#include &lt;iostream&gt;
int main()
</code></pre>
<h1>Challenge Output</h1>
<pre><code>#include &lt;iostream&gt;
int main()
{
  int sum = 0;
  for (int i = 0; i &lt;= 100; ++i)
  {
    sum = i + sum;
  }
  std::cout &lt;&lt; sum;
  return 0;
}
</code></pre>
<h1>Bonus</h1>
<p>In C++ a method must be defined before you can use it.
That's why when having multiple methods you must sort those methods on top first.</p>
<p>When you have multiple possibilities, you can sort the methods alpabeticly</p>
<h1>Input</h1>
<pre><code>        sum += f(x);
    {
    }
    return ( 1.0 / ( y * y) );
    unsigned int start = 1;
    unsigned int end = 1000;
    double sum = 0;
    for( unsigned int x = start; x &lt;= end; ++x )
    std::cout &lt;&lt; "Sum of f(x) from " &lt;&lt; start &lt;&lt; " to " &lt;&lt; end &lt;&lt; " is " &lt;&lt; sum &lt;&lt; std::endl;
    return 0;
{
{
}
}
#include &lt;iostream&gt;
double f(double y)
int main()
</code></pre>
<h1>Output</h1>
<pre><code>#include &lt;iostream&gt;

double f(double y)
{
    return ( 1.0 / ( y * y) );
}

int main()
{
    unsigned int start = 1;
    unsigned int end = 1000;
    double sum = 0;

    for( unsigned int x = start; x &lt;= end; ++x )
    {
        sum += f(x);
    }
    std::cout &lt;&lt; "Sum of f(x) from " &lt;&lt; start &lt;&lt; " to " &lt;&lt; end &lt;&lt; " is " &lt;&lt; sum &lt;&lt; std::endl;
    return 0;
}
</code></pre>
<h1>Note</h1>
<p>I have made some adjustments to the challenge after the feedback of <a href="/u/jnd-au">/u/jnd-au</a></p>
<h1>Finaly</h1>
<p>Have a good challenge idea? Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and there's a good chance we'll use it.</p>
</div>
