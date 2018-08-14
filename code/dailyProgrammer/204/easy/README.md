# Remembering your lines
<div class="md"><h1>Description</h1>
<p>I didn't always want to be a computer programmer, you know. I used to have dreams, dreams of standing on the world stage, being one of the great actors of my generation!</p>
<p>Alas, my acting career was brief, lasting exactly as long as one high-school production of Macbeth. I played old King Duncan, who gets brutally murdered by Macbeth in the beginning of Act II. It was just as well, really, because I had a terribly hard time remembering all those lines!</p>
<p>For instance: I would remember that Act IV started with the three witches brewing up some sort of horrible potion, filled will all sorts nasty stuff, but except for "Eye of newt", I couldn't for the life of me remember what was in it! Today, with our modern computers and internet, such a question is easy to settle: you simply open up <a href="https://gist.githubusercontent.com/Quackmatic/f8deb2b64dd07ea0985d/raw/macbeth.txt">the full text of the play</a> and press Ctrl-F (or Cmd-F, if you're on a Mac) and search for "Eye of newt". </p>
<p>And, indeed, here's the passage: </p>
<pre><code>Fillet of a fenny snake,
In the caldron boil and bake;
Eye of newt, and toe of frog,
Wool of bat, and tongue of dog,
Adder's fork, and blind-worm's sting,
Lizard's leg, and howlet's wing,—
For a charm of powerful trouble,
Like a hell-broth boil and bubble. 
</code></pre>
<p>Sounds delicious!</p>
<p>In today's challenge, we will automate this process. You will be given the full text of Shakespeare's Macbeth, and then a phrase that's used somewhere in it. You will then output the full passage of dialog where the phrase appears.</p>
<h1>Formal inputs &amp; outputs</h1>
<h2>Input description</h2>
<p>First off all, you're going to need a full copy of the play, which you can find here: <a href="https://gist.githubusercontent.com/Quackmatic/f8deb2b64dd07ea0985d/raw/macbeth.txt">macbeth.txt</a>. Either right click and save it to your local computer, or open it and copy the contents into a local file. </p>
<p>This version of the play uses consistent formatting, and should be especially easy for computers to parse. I recommend perusing it briefly to get a feel for how it's formatted, but in particular you should notice that all lines of dialog are indented 4 spaces, and only dialog is indented that far. </p>
<p>(edit: thanks to <a href="/u/Elite6809">/u/Elite6809</a> for spotting some formatting errors. I've replaced the link with the fixed version)</p>
<p>Second, you will be given a single line containing a phrase that appears exactly once somewhere in the text of the play. You can assume that the phrase in the input uses the same case as the phrase in the source material, and that the full input is contained in a single line. </p>
<h2>Output description</h2>
<p>You will output the line containing the quote, as well all the lines directly above and below it which are also dialog lines. In other words, output the whole "passage".</p>
<p>All the dialog in the source material is indented 4 spaces, you can choose to keep that indent for your output, or you can remove, whichever you want. </p>
<h1>Examples</h1>
<h2>Input 1</h2>
<pre><code>Eye of newt
</code></pre>
<h2>Output 1</h2>
<pre><code>Fillet of a fenny snake,
In the caldron boil and bake;
Eye of newt, and toe of frog,
Wool of bat, and tongue of dog,
Adder's fork, and blind-worm's sting,
Lizard's leg, and howlet's wing,—
For a charm of powerful trouble,
Like a hell-broth boil and bubble. 
</code></pre>
<h2>Input 2</h2>
<pre><code>rugged Russian bear
</code></pre>
<h2>Output 2</h2>
<pre><code>What man dare, I dare:
Approach thou like the rugged Russian bear,
The arm'd rhinoceros, or the Hyrcan tiger;
Take any shape but that, and my firm nerves
Shall never tremble: or be alive again,
And dare me to the desert with thy sword;
If trembling I inhabit then, protest me
The baby of a girl. Hence, horrible shadow!
Unreal mockery, hence!
</code></pre>
<h1>Challenge inputs</h1>
<h1>Input 1</h1>
<pre><code>break this enterprise
</code></pre>
<h1>Input 2</h1>
<pre><code>Yet who would have thought
</code></pre>
<h1>Bonus</h1>
<p>If you're itching to do a little bit more work on this, output some more information in addition to the passage: which act and scene the quote appears, all characters with speaking parts in that scene, as well as who spoke the quote. For the second example input, it might look something like this: </p>
<pre><code>ACT III
SCENE IV
Characters in scene: LORDS, ROSS, LADY MACBETH, MURDERER, MACBETH, LENNOX
Spoken by MACBETH:
    What man dare, I dare:
    Approach thou like the rugged Russian bear,
    The arm'd rhinoceros, or the Hyrcan tiger;
    Take any shape but that, and my firm nerves
    Shall never tremble: or be alive again,
    And dare me to the desert with thy sword;
    If trembling I inhabit then, protest me
    The baby of a girl. Hence, horrible shadow!
    Unreal mockery, hence!
</code></pre>
<h1>Notes</h1>
<p>As always, if you wish to suggest a problem for future consideration, head on over to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and add your suggestion there. </p>
<p>In closing, I'd like to mention that this is the first challenge I've posted since becoming a moderator for this subreddit. I'd like to thank the rest of the mods for thinking I'm good enough to be part of the team. I hope you will like my problems, and I'll hope I get to post many more fun challenges for you in the future!</p>
</div>
