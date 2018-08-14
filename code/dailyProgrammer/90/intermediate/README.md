# (Scientific Units Calculator)
<div class="md"><p>In the SI system, measurements of scientific quantities are expressed in terms of 7 standard 'base' units for various quantities:</p>
<p>the "second" for time, the "meter" for length, "kilogram" for mass, the "ampere" for current, the "kelvin" for temperature, the "mole" for amount of substence, and the
"candela" for light intensity.</p>
<p>These base units and exponents of them fully describe any measurable quantity. For example, lets say we wanted to describe force.  Force is defined as mass * acceleration.
accelleration is defined as velocity per second.  velocity is defined as length per second.   Therefore, force is mass*length per second per second, so force is defined as 
m kg s<sup>-1</sup> s<sup>-1</sup> in SI units.</p>
<p>Write a program that can read in a units expression involving multiplying and dividing units and output the correct expression of those units in SI base units.  Furthermore, you should make it so that your program ALSO accepts SI derived units as well, such as "watts" or "pascals" (there is a list of SI derived units and their base definitions <a href="http://en.wikipedia.org/wiki/SI_derived_units">here</a>).  If you can, you should also include some simple aliases that aren't even base units, such as 'mass' is 'kg' and 'velocity' is m/s.</p>
<p>Examples (input,output):</p>
<pre><code>m/s*m*cd -&gt; s^-1 m^2 cd
newton/m -&gt; s^-2 kg
watt/velocity -&gt; s^-2 m kg
</code></pre>
<p>BONUS:  Make it so, when printing, if there is a simpler name for the quanity output than the base name, then it also prints that as well.  For example, s<sup>-2</sup> m kg is also
the definition of force in newtons, so when it prints watt/velocity it should output</p>
<pre><code>s^-2 m kg (Newtons)
</code></pre>
<p>SUPER BONUS:  Correctly parse and handle Metrix Prefixes, like giga,micro,nano, etc.  So we could have
     kilo-watt/mega-joule -&gt; kilo-second</p>
</div>
