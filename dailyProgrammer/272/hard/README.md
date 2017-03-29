# Air Pressure router valve - Part 1.
<div class="md"><p>Consider an air pressure system with a high pressure, and optionally, low pressure tanks. Air (or any fluid) will move from high pressure zone to low pressure if there is an open pathway.</p>
<p>There is a circular (donut tube) hub.  At the north end of the hub is an inlet tube that can only receive air from the high pressure tank (one way valve at the tank).</p>
<p>Inside the tubular donut are blocking metalic slugs that are controlled magnetically by up to 2 servo motors on top and bottom (in same plane as) of the donut.</p>
<p>Each servo can move an unlimited amount of slugs inside the hub, with each slug set at a fixed distance from each other, determined by magnetic attachments to the servo.  If there are 2 servos, the slugs they control may or may not interloc, but there is a restriction on combined positions, as slugs may not jump over each other.</p>
<p>The donut hub can be modeled as a straight line where coordinates wrap around from the 2 end-points.  At each integer position on the line, there may be an inlet/outlet tube with a fixed connection.  The legend for those tube states are: (# represents a digit/number)</p>
<p><code>H</code> - <strong>High Pressure</strong> input.  At least 1 inlet tube at position 0.  Likely never need for additional High pressure inputs into hub.</p>
<p><code>_</code>- <strong>No Port</strong>.  Permanently closed no inlet or outlet at that integer location.</p>
<p><code>#</code> <strong>Bypass loop</strong>:  connects to another port on the hub.  The number indicates the integer position on the hub that is connected to this port.</p>
<p><code>#M</code> - 3 data points:  First number is a motor id.  M indicates that this is an "<strong>open motor</strong>".  The motor exhausts to atmosphere.  An open motor is one that has (optionally) its own valves to control timing.  The generally provide "continuous directional force" <a href="https://www.youtube.com/watch?v=QDR40Eyuu7w">example</a> of valveless engine.</p>
<p><code>#F#</code> - <strong>Feedback motor</strong>.  Like an open motor but with exhaust connected back to the hub.  The extra trailing number indicates the hub port the exhaust is connected to.  The exhaust once into the hub would generally get routed to a Low Pressure outlet.</p>
<p><code>#B#</code> - <strong>Binary motor:</strong> Lead number is also motor id.  Trailing number is the actuator's exhaust port connection.  A binary motor is an actuator controlled by the hub.  When its inlet port is open, its outlet port (connected to trailing number) must be closed.  This setting fills the actuator allowing it to work.  When its outlet/exhaust is open and inlet closed, the actuator relaxes (through spring).</p>
<p><code>Li</code> - <strong>Low Pressure inlet</strong>  If present would feed low power to any motors that share its open path.</p>
<p><code>Lo</code> - <strong>Low Pressure outlet</strong>  If present, exhaust from <code>F</code> motors would route/path into these.  When low pressure inlet is blocked, then braking to the motor is applied while filling the low pressure tank with "stored energy"</p>
<p><code>i#</code> - Input from exhaust of any motor.  Trailing number connects to original F or B motor input.  An extra one way valve ensures that exhaust can only flow one way from motor.  To allow reverse flow, then use a <code>passtrhough (#)</code> port descriptor.</p>
<p><code>E</code> - <strong>Exhaust</strong>.  If present allows any air pressure in the "open hub path" that includes the Exhaust to go to 0.</p>
<p>'X' - <strong>Hub closure</strong> - hub simplification to prevent wrap around of air back to start.  Barrier inside the hub that permanently blocks air flow.</p>
<h1>motor states</h1>
<p>The challenge is to catalogue all possible motor states given a port layout, and a "slug lockring".  The <strong>basic motor states</strong> for each type:</p>
<p>M off 0 - outlet is blocked<br/>
M on 1 - outlet is open<br/>
B off 0 - outlet is blocked  OR exhaust is open<br/>
B on 1 - outlet is open AND (exhaust is closed) OR exhaust paths/routes to H.<br/>
F off 0 - outlet is blocked  OR (exhaust is blocked OR no free path from exhaust to E or Lo)<br/>
F on 1 - outlet is open   AND exhaust is open AND free path from exhaust to <code>E</code> or <code>Lo</code>)  </p>
<p>Note: all motors are off if H is blocked.  F motors are off if <code>Lo</code> is blocked.  </p>
<p><strong>special modes:</strong></p>
<p>B hold 2: outlet closed AND (exhaust closed OR no path/route to open Lo or E).<br/>
B passtrhough 3:  (basic off 0).  Outlet open AND exhaust open. (this creates an open path from H to exhaust node, which would typically wreck havoc with normal routing among multiple motors)  </p>
<p>F brake 2: ON and outlet open AND path/routed to <code>Lo</code> AND <code>Li</code> is blocked.<br/>
F brake hard 3: OFF AND (exhaust is blocked OR exhaust path to <code>Lo</code> is blocked)<br/>
F reverse 4:  H (High Pressure input) is blocked from input  AND input open and is path/routed to <code>E</code> AND exhaust is open and path/routed to <code>Li</code> </p>
<h1>input format</h1>
<p>2 (or 3) lines (with visual header)
Aligned boxes of hub index and port description at each index (visual sugar. doesn't need parsing)<br/>
a spaced delimited list of the port description at each hub index.<br/>
A space delimited list of slug intervals with 0 the first index.
An optional additional space delimited list of slug intervals if a 2nd servo-motor is being used.</p>
<h1>output format</h1>
<p>The challenges are to rotate dials (servo settings) to every integer position to determine the motor states of all motors connected to hub at each dial setting.</p>
<p><strong>basic output</strong> (one line per dial position)<br/>
dial setting (2 if 2 servos), motor state of  each motor (in motorid order).  Can also include  any exhaust, <code>Lo</code> or <code>E</code> flow access.   Its possible to output all state in this table needed to refine 2nd output stage below, getting the trickier path logic in that pass.</p>
<p><strong>exploration output</strong> (one line per motor id: state)<br/>
motorid state, dial settings that create that state for that motor combination (pair format of some kind if 2 dials)</p>
<p>(this format is useful to explore adding more slugs to a dial to enable more state combinations)</p>
<p><strong>summary output</strong><br/>
one line per unique motor state combination (likely fewer than dial settings) followed by count of lines, count of just basic states and count of special states.</p>
<h1>1. Basic states challenge</h1>
<p>for clarity the slug array input of <code>0 11 17</code> means that:</p>
<p>At dial position 0, the slugs block ports <code>0 11 17</code>.<br/>
At dial position 1, the slugs block ports <code>1 12 18</code>.<br/>
At dial position 2, the slugs block ports <code>2 13 19</code>.<br/>
At dial position 20, the slugs block ports <code>20 7 13</code>.  </p>
<p>There are 24 total dial positions on the hub.</p>
<pre><code>┌─┬─┬─┬─┬──┬─┬─┬────┬─┬─┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┐
│0│1│2│3│4 │5│6│7   │8│9│10│11│12│13│14│15│16│17│18│19│20│21│22│23│
├─┼─┼─┼─┼──┼─┼─┼────┼─┼─┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┤
│H│_│6│_│1M│_│2│2F12│_│_│_ │_ │i7│Lo│_ │Li│E │_ │_ │_ │_ │_ │_ │_ │
└─┴─┴─┴─┴──┴─┴─┴────┴─┴─┴──┴──┴──┴──┴──┴──┴──┴──┴──┴──┴──┴──┴──┴──┘

 H _ 6 _ 1M _ 2 2F12 _ _ _ _ i7 Lo _ Li E _ _ _ _ _ _ _
 0 11 17
</code></pre>
<p>An (tldr) explanation of input:<br/>
A slug on node 4, will block input to motor 1.  But the bypass loop from 2 to 6 will allow air to flow to motor 2 at node 7.<br/>
A slug on node 6 would let air into motor 1, but block all flow further down the tube.<br/>
A slug on node 8 would let air into both previous motors, and allow motor 2 to exhaust through node 9, and the air flow to continue further.</p>
<p><strong>output</strong><br/>
(as soon as I do it, but this system has all 4 basic state combinations along with regenerative and hard braking on motor2):  <strong>edit: posted in comments</strong></p>
<h1>2. simpler challenge</h1>
<p>3 non-feedback motors.  Can you figure out the dial setting to turn on motor 2M without the other 2 being on?  All 8 state combinations are possible.</p>
<pre><code>┌─┬─┬─┬─┬──┬─┬─┬─┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┬──┐
│0│1│2│3│4 │5│6│7│8 │9 │10│11│12│13│14│15│16│17│18│19│20│21│22│23│
├─┼─┼─┼─┼──┼─┼─┼─┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┼──┤
│H│_│6│_│1M│_│2│_│14│2M│_ │_ │3M│_ │8 │_ │_ │_ │_ │_ │_ │_ │_ │_ │
└─┴─┴─┴─┴──┴─┴─┴─┴──┴──┴──┴──┴──┴──┴──┴──┴──┴──┴──┴──┴──┴──┴──┴──┘

  H _ 6 _ 1M _ 2 _ 14 2M _  _ 3M  _ 8 _ _ _ _ _ _ _ _ _
  0 6 11
</code></pre>
<p>will let someone else spoil first.</p>
<p>__</p>
<p>bonuses are aimed at crafting input interactively with your function.  So it is advised to parse it from a string.  You are not expected to write a solver program (that will be part 2 of the challenge some other week)</p>
<p>outputs for bonuses are the input format.</p>
<h1>bonus 1</h1>
<p>Can you design a single servo controller for a car with left front motor, right front motor, and rear wheel drive motor.  With regenerative braking on the back, and skid steering on the front (steer by either hard braking one side, and/or having one motor on and other off).  Available states must include 3 motors on, but there doesn't need to be power to rear wheels when steering.</p>
<p>is a reverse gear possible?</p>
<h1>bonus 2</h1>
<p>Using only B type motors, can you make a 3 degree of freedom (DOF) robot arm?  4 DOF?  Each degree of freedom needs to have on off and hold states.  All 3 must have hold states while another B motor is either on/off, but they can go on/off one at a time.  So with a 3 DOF robot, there are only 7 needed state combinations:  All hold, and on/off for each while other 2 hold.</p>
</div>
