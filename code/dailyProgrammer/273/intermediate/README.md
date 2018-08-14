# Twist up a message
<div class="md"><h2><strong>Description</strong></h2>
<p>As we know English uses Latin alphabet consisting of 26 characters, both upper- and lower-case:</p>
<pre><code>Aa Bb Cc Dd Ee Ff Gg Hh Ii Jj Kk Ll Mm Nn Oo Pp Qq Rr Ss Tt Uu Vv Ww Xx Yy Zz
</code></pre>
<p>However, many other languages use its modified version, with some of the letters removed and additional diacritics added to some of them. For instance, Czech alphabet has following additional characters:</p>
<pre><code>Áá Čč Ďď Éé Ěě Íí Ňň Óó Řř Šš Ťť Úú Ůů Ýý Žž
</code></pre>
<p>The worst of all is probably Vietnamese:</p>
<pre><code>Áá Àà Ãã Ảả Ạạ Ââ Ấấ Ầầ Ẫẫ Ẩẩ Ậậ Ăă Ắắ Ằằ Ẵẵ Ẳẳ Ặặ Đđ Éé Èè Ẽẽ Ẻẻ Ẹẹ Êê Ếế Ềề Ễễ Ểể Ệệ
Íí Ìì Ĩĩ Ỉỉ Ịị Óó Òò Õõ Ỏỏ Ọọ Ôô Ốố Ồồ Ỗỗ Ổổ Ộộ Ơơ Ớớ Ờờ Ỡỡ Ởở Ợợ
Úú Ùù Ũũ Ủủ Ụụ Ưư Ứứ Ừừ Ữữ Ửử Ựự Ýý Ỳỳ Ỹỹ Ỷỷ Ỵỵ
</code></pre>
<p>Your job is to write a method <code>twistUp</code> which "twists up" a string, making it as much filled with diacritics as possible.</p>
<h2><strong>Input</strong></h2>
<p>Your input will consist of one string of any letters of the English alphabet, digits and special characters. Characters that cannot be diactriticized should be returned in its original form.</p>
<h2><strong>Output</strong></h2>
<p>Output will consist of a modified text.</p>
<h2><strong>Sample input</strong></h2>
<pre><code>For, after all, how do we know that two and two make four? 
Or that the force of gravity works? Or that the past is unchangeable? 
If both the past and the external world exist only in the mind, 
and if the mind itself is controllable – what then?
</code></pre>
<h2><strong>Sample output</strong></h2>
<pre><code>Ƒǒṝ, āᶂťȅŗ ąľḷ, ħṓẃ ᶁớ ẅē ḵȵȭŵ ŧⱨąť ȶẁô ǎǹḍ ẗŵȫ ᶆầᶄĕ ḟõṵɍ? 
Ȯᵳ ƫẖẩť ṯħê ḟṑȑćẽ ỏᵮ ǧŗảᶌıⱦỳ ẘǒᵲᶄṧ? Ṍᵲ țḩᶏᵵ ⱦḥḙ ṗᶏşʈ ḯş ůǹḉḧẳṇģḕâɓƚė?
Ǐḟ Ƅȫţȟ țḧè ƥāṣț ặňḓ ŧħᶒ ḙxᵵęȑᶇȁȴ ẁőŕȴɗ ȩxĭʂƫ ǫȵľȳ ȋɳ ȶḥẽ ṁįƞḋ, 
ǡǹƌ ᵻḟ ṱȟë ḿīᵰᶑ ḭẗᵴḛɫᵮ ɨś čổɲȶṙŏłḹạɓɭḕ – ŵḫāṯ ƫḩḕñ?
</code></pre>
<h2><strong>Notes</strong></h2>
<ul>
<li>If your browser/compiler/console cannot display diacritics, switch encoding to UTF-8.</li>
<li>Other than diacritics, you can use similar-looking characters like Cyrillic<code>И</code> for <code>N</code></li>
</ul>
<h2><strong>Bonus challenges</strong></h2>
<p>Make your <code>twistUp</code> method take not only letters of English alphabet, but all the letters:</p>
<pre><code>Dżdżystym rankiem gżegżółki i piegże, zamiast wziąć się za dżdżownice,
nażarły się na czczo miąższu rzeżuchy i rzędem rzygały do rozżarzonej brytfanny.

Ɖẑɗɀỵŝțỳɱ ɾẵᶇḵīȩᵯ ĝʑẻğẑộḷǩᵻ î ƥỉëģźè, ʐậɱǐāʂţ ẅɀỉḁĉ ᶊīė ẑắ ḍɀḏźỏẉᵰiɕȅ,
ṋȧʑȧṝⱡý sïë ƞẩ čʐčʑỡ ɱᶖẵẕśẓǘ ᶉẕẻẓǚḉḣỷ ĩ ɼʑéɗḕᶆ ɼᵶỳǥäḷỵ ƌờ ᵳờẕɀăȓʐőȵḗʝ ɓṛŷṭƒằǹɳý.
</code></pre>
<p>Twisted up characters don't need to be the same every time!</p>
<pre><code>Boy, this challenge sure is fun.

Ƀɵƴ, ṫẖiŝ çħẳḽḻęńĝễ ṧụᵳẽ ìṧ ᵮựᵰ.
Ƌȍý, ṯḩįš çẖǎḹļȩᶇġẻ șùɼė īṧ ᶂǔṇ.
Ḇȏƴ, ţȟïš ȼḫẫḹŀẻᶇǧề ŝŭᶉē ìṣ ᵮǘń.
Ƀòý, ȶḥỉṩ ċħǡļḹệǹǥɇ ŝǖȓé ḭʂ ᶂǘǹ.
</code></pre>
<p>Write an additional <code>untwist</code> method which takes a twisted up text and converts its characters into plain Latin:</p>
<pre><code>Ṭħë ᶈṝộȱƒ țḣẵţ ƭĥề ɬıṭᵵḷḛ ᵱᵲíȵċɇ ɇxẛṣⱦėḏ ɨś ƫḥẳṯ ħė ẘắś ĉⱨȃṟḿíņğ, ƫħằṫ ĥḛ ᶅẫủᶃḩëᶑ,
áñɗ ţḥầť ḫẻ ẉâṧ łỗǫḳĩņğ ᶂờŕ ầ ᶊĥȅẹᵽ. Īḟ ǡɲÿɓộđʏ ẁȧṉȶȿ â ȿĥểêᵱ, ⱦḣąʈ ᵻṥ ȁ ᵱṟỗǒƒ ṫȟǟṭ ḫĕ ḕᶍĭṩťș.

The proof that the little prince existed is that he was charming, that he laughed, 
and that he was looking for a sheep. If anybody wants a sheep, that is a proof that he exists.
</code></pre>
<h1>bonus 2</h1>
<p>Find a creative way to generate the mapping scheme (with minimal "hand crafted" tables, and the most mappings.</p>
<hr/>
<p>thanks to <a href="/u/szerlok">/u/szerlok</a> for the challenge description.  We need more submissions at <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> </p>
</div>
