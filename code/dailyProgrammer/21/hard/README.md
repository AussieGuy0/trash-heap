<div class="md"><p>We'd like to write a list of people, ordered so that no one appears in the list before anyone he or she is less smart than.</p>
<p>The input will be a list of pairs of names, one pair per line, where the first element in a pair names a person smarter than the person named by the second element of the pair.   That is, each input line looks like:</p>
<p>smarter-person : less-smart-person</p>
<p>For example:</p>
<p>Einstein : Feynmann<br/>
Feynmann : Gell-Mann<br/>
Gell-Mann : Thorne<br/>
Einstein : Lorentz<br/>
Lorentz : Planck<br/>
Hilbert : Noether<br/>
Poincare : Noether</p>
<p>There is no limit to the number of lines of input.   Your output should be a list of all the distinct input names, without duplicates, one per line, ordered as described above.   For example, given the input shown above, one valid output would be:</p>
<p>Einstein<br/>
Feynmann<br/>
Gell-Mann<br/>
Thorne<br/>
Lorentz<br/>
Planck<br/>
Hilbert<br/>
Poincare<br/>
Noether</p>
<p>Note that the "smarter than" relation supplied as input will not, in general, specify a total order that would allow us to write out the desired list in strictly decreasing order of smartness.   For example, the following output is also valid for the input shown above:</p>
<p>Hilbert<br/>
Einstein<br/>
Feynmann<br/>
Gell-Mann<br/>
Poincare<br/>
Thorne<br/>
Lorentz<br/>
Planck<br/>
Noether</p>
<ul>
<li>from a programming contest</li>
</ul>
</div>
