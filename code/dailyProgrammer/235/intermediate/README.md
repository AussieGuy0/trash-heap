# Scoring a Bowling Game
<div class="md"><h1>Description</h1>
<p>The game of bowling is pretty simple: you have ten pins arranged in a triangle, and you roll a ball down a slick alley towards them and try and knock as many down as possible. In most frames (see below about the tenth frame) you get two attempts per "frame" before the remaining pins are cleared. </p>
<p>The bowler is allowed 10 frames in which to knock down pins, with frames one (1) through nine (9) being composed of up to two rolls. The tenth frame may be composed of up to three rolls: the bonus roll(s) following a strike or spare in the tenth (sometimes referred to as the eleventh and twelfth frames) are fill ball(s) used only to calculate the score of the mark rolled in the tenth.</p>
<p>Bowing scoring is a bit tricky (which is why this is an <em>intermediate</em> challenge). In addition to a gutter ball (which is 0 pins), you have strikes and spares as well as 1 to 9 pins being knocked down. Strikes and spares affect the next balls in different ways. </p>
<p>When all ten pins are knocked down with the first ball of a frame (called a strike and typically rendered as an "X" on a scoresheet), a player is awarded ten points, plus a bonus of whatever is scored with the next two balls. In this way, the points scored for the two balls after the strike are counted twice.</p>
<p>A "spare" is awarded when no pins are left standing after the second ball of a frame; i.e., a player uses both balls of a frame to clear all ten pins. A player achieving a spare is awarded ten points, plus a bonus of whatever is scored with the next ball (only the first ball is counted). It is typically rendered as a slash on scoresheets in place of the second pin count for a frame.</p>
<p>Your challenge today is to determine a bowling score from a score sheet.</p>
<h1>Input Description</h1>
<p>You'll be given a bowling sheet for a single person on a line, with the ten frames separated by a space. All scores are single characters: <code>-</code> for zero (aka a gutter ball), <code>1-9</code> for 1-9 pins knocked down, <code>/</code> for a spare, and <code>X</code> for a strike. If you see any two digit numbers (e.g. "63") that's actually the first and second ball scores (a six then a three). Example:</p>
<pre><code>X X X X X X X X X XXX  
</code></pre>
<h1>Output Description</h1>
<p>Your program should calculate the score for the sheet and report it. From our example:</p>
<pre><code>300
</code></pre>
<p>Aka a perfect game.</p>
<h1>Challenge Input</h1>
<pre><code>X -/ X 5- 8/ 9- X 81 1- 4/X
62 71  X 9- 8/  X  X 35 72 5/8
</code></pre>
<h1>Challenge Output</h1>
<pre><code>137
140
</code></pre>
<h1>Bonus ASCII Art</h1>
<pre><code>                         ! ! ! !
                      ." ! ! !  /
                    ."   ! !   /
                  ."     !    /
                ."           /
              ."     o      /
            ."             /
          ."              /
        ."               /
      ."      . '.      /
    ."      '     '    /
  ."                  / grh
."     0 |           /
       |/
      /|
      / |
</code></pre>
<h1>Credit</h1>
<p>This challenge was suggested by <a href="/u/firebolt0777">/u/firebolt0777</a>. If you have an idea for a challenge please share it over at <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and we may wind up using it!</p>
</div>
