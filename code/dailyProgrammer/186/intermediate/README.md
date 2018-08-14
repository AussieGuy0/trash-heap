# Syzygyfication
<div class="md"><h1><a href="#IntermediateIcon"></a> <strong>(Intermediate)</strong>: Syzygyfication</h1>
<p>In astronomical terms, a <em>syzygy</em> is when 3 or more objects line up in a straight line. The classic example of this is an <em>eclipse</em> (not the IDE, thankfully.) If the Sun, the Moon and the Earth (in that order) line up in a straight line, then the Moon is directly in-between the Sun and the Earth, meaning the view of the Sun is occluded - a solar eclipse. Another example of a syzygy is a <em>transit</em>. This is like an eclipse, but when a planet goes in front of the sun instead; for example, <a href="http://upload.wikimedia.org/wikipedia/commons/6/64/Mercury_transit_2.jpg">in this image</a>, the big yellow disc is (predictably) the Sun and the circular black spot in the middle is Mercury. It's like a mini-eclipse. Besides these two examples, syzygy can occur without the Sun. The dots in <a href="https://upload.wikimedia.org/wikipedia/commons/c/c2/Three_Planets_Dance_Over_La_Silla.jpg">this image here</a> are the planets Mercury, Venus and Jupiter. They do not form a perfect syzygy  - the chance of that occurring is next to nothing - but they line up close enough that they're within a few degrees of each other in the sky.</p>
<p>The Wikipedia page for syzygy is here: <a href="https://en.wikipedia.org/wiki/Syzygy_%28astronomy%29">en.wikipedia.org/wiki/Syzygy_(astronomy)</a></p>
<p>Today, you'll have two challenges. The first one is to pronounce <strong>syzygyfication</strong>. The second one will be to determine if a syzygy is occurring at a given time, for a given solar system.</p>
<h2>Simplification</h2>
<p>This challenge as stated would require a load of mathematics to solve. For this programming challenge, we will assume that the planets orbit the Sun in perfect circles on the same plane, that the Sun does not move at all, and the planets all start off with zero degrees rotation (ie. all in syzygy with each other.)</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Required Data</h2>
<p>You will need this data of the Solar system. An AU (astronomical unit) is the distance from the Earth to the Sun. The orbital period is the time it takes for the planet to complete its orbit; a value of eg. <code>2</code> means the planet completes an orbit around the Sun every 2 years.</p>
<table><thead>
<tr>
<th align="left">Object</th>
<th align="right">Orbit Radius (AU)</th>
<th align="right">Orbital Period (Earth year)</th>
</tr>
</thead><tbody>
<tr>
<td align="left">Sun</td>
<td align="right">0.000</td>
<td align="right"><em>n/a</em></td>
</tr>
<tr>
<td align="left">Mercury</td>
<td align="right">0.387</td>
<td align="right">0.241</td>
</tr>
<tr>
<td align="left">Venus</td>
<td align="right">0.723</td>
<td align="right">0.615</td>
</tr>
<tr>
<td align="left">Earth</td>
<td align="right">1.000</td>
<td align="right">1.000</td>
</tr>
<tr>
<td align="left">Mars</td>
<td align="right">1.524</td>
<td align="right">1.881</td>
</tr>
<tr>
<td align="left">Jupiter</td>
<td align="right">5.204</td>
<td align="right">11.862</td>
</tr>
<tr>
<td align="left">Saturn</td>
<td align="right">9.582</td>
<td align="right">29.457</td>
</tr>
<tr>
<td align="left">Uranus</td>
<td align="right">19.189</td>
<td align="right">84.017</td>
</tr>
<tr>
<td align="left">Neptune</td>
<td align="right">30.071</td>
<td align="right">164.795</td>
</tr>
</tbody></table>
<h2>Input Description</h2>
<p>You are to accept a number, which is a number of years after the starting time.</p>
<h2>Output Description</h2>
<p>You are to output which of the planets, <strong>or the Sun</strong>, are in syzygy at the given time (in no particular order). For example:</p>
<pre><code>Venus-Sun-Earth syzygy occurring.
</code></pre>
<p>A syzygy should be when the objects are within 1 degree of each other in the sky. Remember, syzygy can also occur when the Sun is in-between the two objects. In this case, this is called 'opposition'.</p>
<h1>Sample Inputs and Outputs</h1>
<p>An example 4-syzygy occurs at 3.30085 years, where Mercury, Earth, Mars and Jupiter line up. <a href="http://i.imgur.com/gkD863d.png">A visual example of this is here</a>. Some more syzygy occurrences are:</p>
<table><thead>
<tr>
<th align="right">Time (Earth year)</th>
<th align="left">Syzygy</th>
</tr>
</thead><tbody>
<tr>
<td align="right">3.30085</td>
<td align="left">Mercury-Earth-Mars-Jupiter</td>
</tr>
<tr>
<td align="right">9.12162</td>
<td align="left">Sun-Mercury-Mars, Mercury-Venus-Saturn</td>
</tr>
<tr>
<td align="right">18.0852</td>
<td align="left">Sun-Mars-Saturn, Mercury-Earth-Saturn-Neptune</td>
</tr>
<tr>
<td align="right">31.0531</td>
<td align="left">Sun-Earth-Saturn, Venus-Earth-Mars</td>
</tr>
<tr>
<td align="right">40.2048</td>
<td align="left">Sun-Venus-Mars, Mercury-Mars-Saturn, Earth-Mars-Uranus</td>
</tr>
<tr>
<td align="right">66.2900</td>
<td align="left">Sun-Venus-Earth-Uranus</td>
</tr>
</tbody></table>
<h1>Extension</h1>
<p>If your programming language supports it, draw a view of the Solar system at the given time, to show the objects in syzygy (like the image above.)</p>
</div>
