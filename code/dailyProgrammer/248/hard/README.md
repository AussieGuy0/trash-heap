# NotClick game
<div class="md"><p>Click games such as <a href="http://orteil.dashnet.org/cookieclicker/">http://orteil.dashnet.org/cookieclicker/</a> are resource games where, part of the game, is obtaining free resources limited by how  fast you can repeatedly click for them.</p>
<p>Today's challenge simulates these games with a constant 1 click per second, and a build order queue.  Allowing the game to be played in a console, and finish "instantly".</p>
<p>For our game, cookies is the name of the generated resources.</p>
<h1>setup</h1>
<p>for each line in this input, each word is:  </p>
<ol>
<li>Name of building (can be discarded or split into its own array for formatting use)<br/></li>
<li>Cost for first building purchase.<br/></li>
<li>Number of Cookies each building generates.<br/></li>
<li>Number of extra cookies the building generates on first upgrade.  (all subsequent upgrades double production)<br/></li>
<li>Cost of first upgrade.</li>
</ol>
<p><strong>setup input</strong></p>
<pre><code>cursor 12 0.1 0.1 100              
grandma 100 0.8 0.3 1000           
farm 500 4 1 10000                 
mine 1000 10 3 50000               
factory 5000 40 10 200000          
bank 100000 100 40 5000000         
temple 1000000 400 100 100000000   
city 300000000 5000 2000 1000000000
</code></pre>
<p>Not in input are 2 constants for each line.   </p>
<ol>
<li> The cost growth rate of each new building.  Fixed at 1.2 (20% cost growth per purchase of the same building)</li>
<li> The cost growth rate of each upgrade.  Fixed at 3 (200% cost increase for each upgrade of the same building)</li>
</ol>
<h2></h2>
<pre><code>┌────────┬─────────┬────┬──────┬────────────┬────────────┬────────────┐
│BUILDING│COST1    │PROD│BOOST1│UPGRADE_cOST│BCOST_GROWTH│UCOST_GROWTH│
├────────┼─────────┼────┼──────┼────────────┼────────────┼────────────┤
│cursor  │12       │0.1 │0.1   │100         │1.2         │3           │
├────────┼─────────┼────┼──────┼────────────┼────────────┼────────────┤
│grandma │100      │0.8 │0.3   │1000        │1.2         │3           │
├────────┼─────────┼────┼──────┼────────────┼────────────┼────────────┤
│farm    │500      │4   │1     │10000       │1.2         │3           │
├────────┼─────────┼────┼──────┼────────────┼────────────┼────────────┤
│mine    │1000     │10  │3     │50000       │1.2         │3           │
├────────┼─────────┼────┼──────┼────────────┼────────────┼────────────┤
│factory │5000     │40  │10    │200000      │1.2         │3           │
├────────┼─────────┼────┼──────┼────────────┼────────────┼────────────┤
│bank    │100000   │100 │40    │5000000     │1.2         │3           │
├────────┼─────────┼────┼──────┼────────────┼────────────┼────────────┤
│temple  │1000000  │400 │100   │100000000   │1.2         │3           │
├────────┼─────────┼────┼──────┼────────────┼────────────┼────────────┤
│city    │300000000│5000│2000  │1000000000  │1.2         │3           │
└────────┴─────────┴────┴──────┴────────────┴────────────┴────────────┘
</code></pre>
<h1>simulation</h1>
<p>Your challenge is to create a function that models resources after each turn.  It has 2 inputs:</p>
<ol>
<li>the number of iterations (turns) to run the simulation.</li>
<li>A queue of building and upgrade orders coded as 0-7, for a building order (0 = cursor, 1 = grandma etc...) and 100-107 for an upgrade (100 = upgrade cursor, 101 = upgrade grandma ...)</li>
</ol>
<p>The simulation order is:</p>
<ol>
<li>Add resources created from buildings.</li>
<li>Add automatic resources from turn:  These are from the 1 click per turn.  <strong>turn resources = 1 + resources from "cursors building"</strong></li>
<li>If there is enough resources to buy the first building or upgrade in queue, then it is bought, and the total number of owned buildings or upgrades of that type is increased by one, and the cost of the building or upgrade reduced from cash/cookie balance.  <strong>this can be done on same turn resources above came in</strong>.  Can only build one building per turn.</li>
</ol>
<p>Its recommended that you track <code>turns passed</code> <code>total resources collected</code></p>
<h1>sample input 1</h1>
<p>in J format with function name G, and iterations as left parameter, and build queue.  (table output formatting not needed)</p>
<p>20 iterations, and build queue 0 0 1 </p>
<pre><code>  20 G 0 0 1
┌─────┬────┬────┬─┬───────────────┬───────────────┬─────┐
│turns│gen │CASH│M│Builds         │Upgrades       │Queue│
├─────┼────┼────┼─┼───────────────┼───────────────┼─────┤
│20   │21.6│9.6 │1│1 0 0 0 0 0 0 0│0 0 0 0 0 0 0 0│0 1  │
└─────┴────┴────┴─┴───────────────┴───────────────┴─────┘
</code></pre>
<p>12 cookies generated after 12th turn.<br/>
cursor bought on 12th turn.<br/>
for remaining 8 turns, 8 more cookies generated + 1.6 from 1 cursor building that generates 0.1 per turn, but is special in that it also adds 0.1 to each of the 8 auto-clicks that occurred over the 8 turns the building existed.</p>
<p>The output shows that 1 cursor building is owned, and the queue still outstanding has 1 cursor and 1 grandma.</p>
<h1>sample input 2</h1>
<p>To play the game, you probably need to track the current costs of each purchase option as well as production rates of each option.  To choose which option has the highest ROI.</p>
<pre><code>       1000 G 0 0 0 1 0 0 0 100 0 0 0 2 0 100 0 0 1 0 0 100 0 0 100 0 0 0 3 3 0 3 1 1 4 3 2 3 4 2 4 3 2 4 0 1
┌───────┬───────┬───────┬──────┬───────┬───────┬──────┬──────┬────┬──────┬───────┬─────┬─────┬───────┬────┬──────┬────┐
│CPS    │cursor │grandma│farm  │mine   │factory│bank  │temple│city│cursor│grandma│farm │mine │factory│bank│temple│city│
├───────┼───────┼───────┼──────┼───────┼───────┼──────┼──────┼────┼──────┼───────┼─────┼─────┼───────┼────┼──────┼────┤
│308.2  │552.061│248.832│1036.8│2985.98│10368  │100000│1e6   │3e8 │8100  │1000   │10000│50000│200000 │5e6 │1e8   │1e9 │
├───────┼───────┼───────┼──────┼───────┼───────┼──────┼──────┼────┼──────┼───────┼─────┼─────┼───────┼────┼──────┼────┤
│1024.05│33.6   │4      │16    │60     │160    │0     │0     │0   │1.6   │0.8    │4    │10   │40     │100 │400   │5000│
└───────┴───────┴───────┴──────┴───────┴───────┴──────┴──────┴────┴──────┴───────┴─────┴─────┴───────┴────┴──────┴────┘
┌─────┬──────┬───────┬─┬────────────────┬───────────────┬─────┐
│turns│gen   │CASH   │M│Builds          │Upgrades       │Queue│
├─────┼──────┼───────┼─┼────────────────┼───────────────┼─────┤
│1000 │118484│71585.4│1│21 5 4 6 4 0 0 0│4 0 0 0 0 0 0 0│     │
└─────┴──────┴───────┴─┴────────────────┴───────────────┴─────┘
</code></pre>
<p>The 2nd table output is the same as sample input #1.<br/>
After 1000 turns, $71585 cash balance is generated, from 21 cursors, 5 grandmas 4 farms, 6 mines, and 4 factories, with cursors upgraded 4 times.  The queue has been emptied of all orders.</p>
<p>The first table, ommitting the first column, has buidling then upgrade info.  The first row is the cost of the next building or upgrade.  The 2nd row has the total production for each building type in the left half, and the per building production (by type) in the right half.</p>
<p>The first column <code>CPS</code> has in first row, total production rate per turn including special rules for cursors, and in 2nd row, an indicator formula I thought might be useful CPS + CASH / 100</p>
<h1>Challenge 0 (sample with output)</h1>
<p>What is the earliest turn you can build a farm (building 2)?</p>
<p><strong>output</strong>
The output is the function inputs, followed by the simulation results to show that the simulation results in the farm being built.  There is a better solution (ie fewer turns than 300) than this (<code>300 iterations</code> with queue <code>0 0 0 1 0 2</code>)that appears in a spoiler in the comments.</p>
<pre><code>  300 G 0 0 0 1 0 2
┌───────┬───────┬───────┬────┬────┬───────┬──────┬──────┬────┬──────┬───────┬─────┬─────┬───────┬────┬──────┬────┐
│CPS    │cursor │grandma│farm│mine│factory│bank  │temple│city│cursor│grandma│farm │mine │factory│bank│temple│city│
├───────┼───────┼───────┼────┼────┼───────┼──────┼──────┼────┼──────┼───────┼─────┼─────┼───────┼────┼──────┼────┤
│6.6    │24.8832│120    │600 │1000│5000   │100000│1e6   │3e8 │100   │1000   │10000│50000│200000 │5e6 │1e8   │1e9 │
├───────┼───────┼───────┼────┼────┼───────┼──────┼──────┼────┼──────┼───────┼─────┼─────┼───────┼────┼──────┼────┤
│6.60184│0.4    │0.8    │4   │0   │0      │0     │0     │0   │0.1   │0.8    │4    │10   │40     │100 │400   │5000│
└───────┴───────┴───────┴────┴────┴───────┴──────┴──────┴────┴──────┴───────┴─────┴─────┴───────┴────┴──────┴────┘
┌─────┬─────┬─────┬─┬───────────────┬───────────────┬─────┐
│turns│gen  │CASH │M│Builds         │Upgrades       │Queue│
├─────┼─────┼─────┼─┼───────────────┼───────────────┼─────┤
│300  │664.6│0.184│1│4 1 1 0 0 0 0 0│0 0 0 0 0 0 0 0│     │
└─────┴─────┴─────┴─┴───────────────┴───────────────┴─────┘
</code></pre>
<h1>Challenge 1</h1>
<p>Find a build queue that generates over 100000 cash in 1000 turns.</p>
<h1>Challenge 2</h1>
<p>Get enough cash to buy a city ($300M) in under 6300 turns.  (or close to it if you can't make it)</p>
<p>Its ok to use tools such as the above to handcraft solutions.  Solving this type of challenge automatically will be a later part 2 challenge.</p>
<h1>Bonus, TBD</h1>
<p><del>A bonus for this challenge will be added later today.  It involves adding special upgrades that interact with buildings/state in more comprehensive and intertwined manners.</del> </p>
<p>Medals awarded:  Gold to <a href="/u/fibonaci">u/fibonaci</a> and <a href="/u/godspiral">u/godspiral</a>.  Silvers to other solutions.</p>
</div>
