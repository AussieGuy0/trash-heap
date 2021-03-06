# Average Speed Cameras
<div class="md"><h1><a href="#IntermediateIcon"></a> <em>(Intermediate)</em>: Average Speed Cameras</h1>
<p>In the UK, a common safety measure on motorways is the so-called <a href="http://en.wikipedia.org/wiki/SPECS_%28speed_camera%29">average speed cameras</a>. These, unlike normal speed cameras which measure a vehicle's speed instantaneously, have several connected cameras at intervals along a motorway. The speed of a vehicle can be determined by dividing the distance between two cameras by the time it takes the vehicle to get from one to another. This can be used to stop vehicles breaking the speed limit over long stretches of roads, rather than allowing vehicles to speed up after they are out of range. The Home Office has contacted you to replace the aging software system in the cameras with something more up to date.</p>
<p>In this challenge, you will be given a number of speed cameras and their positions along a road, along with the speed limit. You will then be given the camera logs for each camera in turn. From this data, you will work out which vehicles are breaking the speed limit.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>The first section of the input will contain the speed limit and the position of the speed cameras. The speed limit may be in miles per hour or kilometres per hour. The lines will be in the format:</p>
<pre><code>Speed limit is &lt;limit&gt; mph.
</code></pre>
<p>OR</p>
<pre><code>Speed limit is &lt;limit&gt; km/h.
</code></pre>
<p>The lines describing the positions of the speed cameras will look like:</p>
<pre><code>Speed camera &lt;number&gt; is &lt;distance&gt; metres down the motorway.
</code></pre>
<p>Speed camera number 1 will always have a distance of 0.</p>
<p>After this, you will get logs for each speed camera, like this:</p>
<pre><code>Start of log for camera &lt;number&gt;:
Vehicle &lt;registration number&gt; passed camera &lt;number&gt; at &lt;time&gt;.
Vehicle &lt;registration number&gt; passed camera &lt;number&gt; at &lt;time&gt;.
...
</code></pre>
<p>Example inputs and outputs can be found below.</p>
<h2>Output Description</h2>
<p>For each vehicle that breaks the speed limit, print a line like so:</p>
<pre><code>Vehicle &lt;registration number&gt; broke the speed limit by &lt;amount&gt;.
</code></pre>
<p>Where <code>&lt;amount&gt;</code> is in the local units.</p>
<h1>Sample Inputs and Outputs</h1>
<h2>Sample Input</h2>
<pre><code>Speed limit is 60.00 mph.
Speed camera number 1 is 0 metres down the motorway.
Speed camera number 2 is 600 metres down the motorway.
Speed camera number 3 is 855 metres down the motorway.
Speed camera number 4 is 1355 metres down the motorway.
Start of log for camera 1.
Vehicle G122 IVL passed camera 1 at 09:36:12.
Vehicle H151 KEE passed camera 1 at 09:36:15.
Vehicle U109 FIJ passed camera 1 at 09:36:20.
Vehicle LO04 CHZ passed camera 1 at 09:36:23.
Vehicle I105 AEV passed camera 1 at 09:36:28.
Vehicle J828 EBC passed camera 1 at 09:36:29.
Vehicle WF EP7 passed camera 1 at 09:36:32.
Vehicle H108 KYL passed camera 1 at 09:36:33.
Vehicle R815 FII passed camera 1 at 09:36:34.
Vehicle QW04 SQU passed camera 1 at 09:36:34.
Start of log for camera 2.
Vehicle G122 IVL passed camera 2 at 09:36:42.
Vehicle LO04 CHZ passed camera 2 at 09:36:46.
Vehicle H151 KEE passed camera 2 at 09:36:51.
Vehicle QW04 SQU passed camera 2 at 09:36:53.
Vehicle J828 EBC passed camera 2 at 09:36:53.
Vehicle R815 FII passed camera 2 at 09:36:55.
Vehicle U109 FIJ passed camera 2 at 09:36:56.
Vehicle H108 KYL passed camera 2 at 09:36:57.
Vehicle I105 AEV passed camera 2 at 09:37:05.
Vehicle WF EP7 passed camera 2 at 09:37:10.
Start of log for camera 3.
Vehicle LO04 CHZ passed camera 3 at 09:36:55.
Vehicle G122 IVL passed camera 3 at 09:36:56.
Vehicle H151 KEE passed camera 3 at 09:37:03.
Vehicle QW04 SQU passed camera 3 at 09:37:03.
Vehicle J828 EBC passed camera 3 at 09:37:04.
Vehicle R815 FII passed camera 3 at 09:37:09.
Vehicle U109 FIJ passed camera 3 at 09:37:11.
Vehicle H108 KYL passed camera 3 at 09:37:12.
Vehicle I105 AEV passed camera 3 at 09:37:20.
Vehicle WF EP7 passed camera 3 at 09:37:23.
Start of log for camera 4.
Vehicle LO04 CHZ passed camera 4 at 09:37:13.
Vehicle QW04 SQU passed camera 4 at 09:37:24.
Vehicle J828 EBC passed camera 4 at 09:37:26.
Vehicle G122 IVL passed camera 4 at 09:37:28.
Vehicle R815 FII passed camera 4 at 09:37:28.
Vehicle H151 KEE passed camera 4 at 09:37:29.
Vehicle H108 KYL passed camera 4 at 09:37:36.
Vehicle I105 AEV passed camera 4 at 09:37:42.
Vehicle WF EP7 passed camera 4 at 09:37:44.
Vehicle U109 FIJ passed camera 4 at 09:37:45.
</code></pre>
<h2>Sample Output</h2>
<pre><code>Vehicle LO04 CHZ broke the speed limit by 3.4 mph.
Vehicle LO04 CHZ broke the speed limit by 2.1 mph.
Vehicle QW04 SQU broke the speed limit by 10.6 mph.
Vehicle R815 FII broke the speed limit by 3.9 mph.
</code></pre>
<h1>Challenge</h1>
<h2>Challenge Input</h2>
<p>A long pastebin containing a huge data set is <a href="https://gist.githubusercontent.com/Quackmatic/e75d61c1ecc319f721a2/raw/average-speed-cameras.txt">available here</a>, to stress-test your input if nothing else.</p>
<h1>Notes</h1>
<p>You may want to use regular expressions again for this challenge.</p>
</div>
