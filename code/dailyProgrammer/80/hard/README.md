# (Multi-word anagrams)
<div class="md"><p>In <a href="http://www.reddit.com/r/dailyprogrammer/comments/x0v3e/7232012_challenge_80_easy_anagrams/">today's easy problem</a>, we investigated anagrams that were single words. However, as is clear in the "I am Lord Voldemort" and "Tom Marvolo Riddle" example, anagrams can also be several words long. </p>
<p>Your difficult task today is to write a program that given a word will generate all multi-word anagrams of that word. Use <a href="http://code.google.com/p/dotnetperls-controls/downloads/detail?name=enable1.txt">the same dictionary as in the easy problem</a>. </p>
<p>So, for instance, the word "PARLIAMENT" has (by my count) <del>6636</del> 8438 multi-word anagrams using that dictionary. Examples include "MENIAL PRAT", "INEPT ALARM", "EAT NIL PRAM" (most of them will not make any sense) and "PARLIAMENT" itself. Note that in this problem, if the difference between two permutation is only word order, they count as the same anagram. So "INEPT ALARM" and "ALARM INEPT" should just count as one anagram. </p>
<p>Also, if there are single-word anagrams of the input, they should be counted in the total. For instance, in the 63 (again, by my count) multi-word anagrams of "MARBLES", the words "AMBLERS", "BLAMERS", "LAMBERS" and "RAMBLES" are included, as well as "MARBLES" itself (a few examples of multi-word anagrams for "MARBLES" are "ARM BELS", "REM LABS" and "ELM BARS").</p>
<p>How many multi-word anagrams is there for "CARPENTER" and "INHERITANCE"?</p>
<p>EDIT: Thanks to Cosmologicon for corrections!</p>
</div>
