# (Sleep sort)
<div class="md"><p>An anonymous user on world4ch's programming text board posted a thread in early 2011 in which he describes an ingenious <em>O(n)</em> sorting algorithm. This means it's, supposedly, more efficient than any sorting algorithm ever invented. Some bloggers picked up on it, and dubbed the algorithm <a href="http://beust.com/weblog/2011/06/15/sleep-sort/">sleep sort</a>:</p>
<pre><code>#!/bin/bash
function f() {
    sleep "$1"
    echo "$1"
}
while [ -n "$1" ]
do
    f "$1" &amp;
    shift 
done
wait
</code></pre>
<p>This program takes some command line arguments, like <code>./sleepsort.sh 3 1 4 1 5 9</code>, and starts a new <a href="http://en.wikipedia.org/wiki/Thread_(computing)">thread</a> for each number in the list, which first sleeps for <em>n</em> seconds, then prints <em>n</em>. After 1 second, both 1s are printed, then after 2 more seconds the 3 follows, etc. Because it only loops through the list of numbers once, the algorithm appears to run in linear time.</p>
<p>Your task is to <strong>re-implement sleep sort</strong> in a language of your choice (which might look trivial, but this challenge is all about learning how your language handles multithreading.)</p>
<p><strong>BONUS</strong>: at first glance, this algorithm appears to be <em>O(n)</em>. Can you prove this isn't true? (This bonus requires some knowledge of both algorithms and concurrency.)</p>
</div>
