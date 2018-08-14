# (Pokémon types)
<div class="md"><p>Ah, who doesn't remember the endless hours wasted playing Pokémon games on a Game Boy during long car rides? I sure do. Pokémon had an interesting battle system, and one of the nice mechanics was the type system.</p>
<p>For this challenge, you'll be writing a function, <code>type_effect</code>, that takes two string arguments -- the offending move's name and the defending Pokémon's name -- and returns a multiplier like <code>2.0</code> or <code>0.25</code>.</p>
<p>Generally, you take the offending move's type, look up the multipliers for all the defending Pokémon's types in the type chart, and multiply them together. As an example, we'll run through the calculations for <code>type_effect("Ice Beam", "Dragonite")</code>.</p>
<p>(Optionally, use <code>enum</code>s instead of strings, like <code>type_effect(M_ICE_BEAM, P_DRAGONITE)</code>).</p>
<ul>
<li><a href="http://bulbapedia.bulbagarden.net/wiki/Ice_Beam_(move)">Ice Beam</a> is an Ice move.</li>
<li><a href="http://bulbapedia.bulbagarden.net/wiki/Dragonite_(Pok%C3%A9mon)">Dragonite</a> has multiple types, Dragon and Flying.</li>
<li>According to the <a href="http://bulbapedia.bulbagarden.net/wiki/Type_chart">type chart</a>, Ice vs. Dragon has a 2.0× bonus, and Ice vs. Flying has a 2.0× bonus, too. Multiplying these together, you get 4.0×, so return <code>4.0</code>.</li>
</ul>
<p>Obviously, this challenge is all about collecting the data you need yourself and manipulating it, so <strong>don't steal each others' representations</strong> of the Type array, Pokémon's types, etc!</p>
</div>
