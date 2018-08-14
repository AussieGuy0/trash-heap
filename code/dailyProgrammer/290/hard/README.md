# Gophers and Robot Dogs
<div class="md"><h1>Description</h1>
<p>You're a farmer in the future. Due to some freak accident, all dogs were wiped out but gophers have multiplied and they're causing havoc in your fields. To combat this, you bought a robot dog. Only one problem - you have to program it to chase the gophers. </p>
<p>The robot dogs can run faster than the natural gophers. Assuming that the gopher starts running when it's been spotted by the dog, the gopher will run in as straight a line as it can towards the nearest hole. The dog can catch the little rascal by cutting off the gopher before it reaches the hole. Assume that if the dog is within a square of the gopher, it's got it capture (e.g. the dog may beat the gopher to a position, but it'll be able to snag it). If the gopher sees the dog waiting the gopher will change direction, so it will have to grab it on the run.</p>
<p>Your task today is to write a program that identifies the best route to run to catch the gopher. Remember - the gopher will run to the nearest hole in a straight line. The dog will run in a straight line, too, you just have to tell it where to go. </p>
<h1>Input Description</h1>
<p>You'll be given several lines. The first line tells you the dog's position and speed (in units per second) as three numbers: the x and y coordinates then the speed. The next line tells you the gopher's position as an x and y coordinate position and its speed (in units per second). The next line tells you how many additional lines <em>N</em> to read, these are the gopher holes. Each of the <em>N</em> lines tells you a gopher hole as an x and y coordinate. Example:</p>
<pre><code>10 10 1.0
1 10 0.25
2
0 0
10 0
</code></pre>
<h1>Output Description</h1>
<p>Your program should emit the position the dog should run in a straight line to catch the gopher. Example:</p>
<pre><code>1 7
</code></pre>
<p>The gopher will run to the hole at (0,0). The dog should run to position (1,7) to catch the gopher. </p>
<h1>Challenge Input</h1>
<pre><code>5 3 1.2
2 8 0.5
3
10 1
11 7
10 9
</code></pre>
<h1>Notes</h1>
<p>Added clarification that the dog will only catch the gopher on the run. </p>
<p>This challenge was inspired by a conversation with former moderator XenophonOfAthens.</p>
</div>
