# Prime Factor Trees
<div class="md"><h1><a href="#IntermediateIcon"></a> <em>(Intermediate)</em>: Prime Factor Trees</h1>
<p>Every number can be represented as the product of its <a href="http://en.wikipedia.org/wiki/Prime_factor">prime factors</a>. These are all of the prime numbers which the number is divisible by - if a number has no prime factors except itself, then it is prime (because it cannot be divided by any other number.) Finding the prime factor representation of a number comes in handy in quite a few ways - one of which is being able to easily find the <a href="http://en.wikipedia.org/wiki/Greatest_common_divisor">Greatest Common Divisor</a>.</p>
<p>One of the first techniques schoolchildren learn to find a number's prime factors is a technique known as factor trees. To create a factor tree, write down the number you are factoring first.</p>
<pre><code>60
</code></pre>
<p>Then, find a number that divides this cleanly, and find the answer - 60 can be divided by 4 to get 15, for example. Once we've done that, write those two numbers under 60 on 'branches', like so:</p>
<pre><code>   60
    |
 4--+--15
</code></pre>
<p>Then, do the same for each of those numbers, too:</p>
<pre><code>    60
     |
  4--+--15
  |
2-+-2
</code></pre>
<p>And finally:</p>
<pre><code>    60
     |
  4--+--15
  |      |
2-+-2  3-+-5
</code></pre>
<p>Once a prime number (such as the bottom row) is created, you can't factor any further, so you stop.</p>
<p>Your challenge is, given a number, generate its factor tree.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>You will be given a number <strong>N</strong> which you are to generate a factor tree for.</p>
<h2>Output Description</h2>
<p>Print the factor tree in a similar format to the ones above.</p>
<h1>Challenge</h1>
<h2>Challenge Input</h2>
<pre><code>1767150
</code></pre>
<h2>Sample Challenge Output</h2>
<p>There are a lot of different ways to display a factor tree for some numbers. Here are some examples.</p>
<pre><code>           1767150          
            |               
   1309-----+-----1350      
     |             |        
  77-+--17    45---+---30   
  |            |        |   
 7+-11       9-+--5   6-+--5
             |        |     
            3+-3     2+-3 

           1767150          
               |            
       1350----+-----1309   
        |              |    
   45---+---30      77-+--17
   |         |      |       
 5-+-9     6-+--5  7+-11    
     |     |                
    3+-3  2+-3
</code></pre>
<h1>Notes</h1>
<p>If you're having trouble with the tree printing logic, that's fine - you can skip that if you want. Print it a different way that's easier to format.</p>
</div>
