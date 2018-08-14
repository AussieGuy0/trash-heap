# Traveller Game Part 2 (Torchlight)
<div class="md"><h1>Description:</h1>
<p>For today's challenge you must do the <a href="http://www.reddit.com/r/dailyprogrammer/comments/2g1c80/9102014_challenge_179_intermediate_roguelike_the/">Intermediate Traveller Game</a> challenge from wednesday. If you have already done it then you have a head start.</p>
<p>We will modify our Traveller game by adding Torch light. Seeing the whole map is too easy. If you are limited in what you can see then you have a tougher time planning your moves.</p>
<p>You will modify your game the following ways.</p>
<ul>
<li>Add Torch view You only see 3 spaces away from your hero</li>
<li>Add 5 Random Wall barriers -- These are 3 walls in a row either vertical or horizontal. Or have a fixed map with hallways/wallls. Your choice.</li>
<li>Continue to generate random gold/goal spots for scoring.</li>
<li>Same Map size as the itnermediate.</li>
</ul>
<h1>Examples:</h1>
<p>Here are 3 examples of how the torchlight should work. </p>
<pre><code>    Full Sight
    %%%%%%%%%%
    %..$.....%
    %......$.%
    %...@....%
    %....$...%
    %.$......%
    %%%%%%%%%%

    Torch Level 3
       %
      $..
     .....
    ...@...
     ...$.
      ...
       %     

    Full Sight (corner case)
    %%%%%%%%%%
    %@.$.....%
    %......$.%
    %........%
    %....$...%
    %.$......%
    %%%%%%%%%%

    Torch Level 3
    %%%%
    %@.$.
    %...
    %..
    .

    Full Sight (Barrier case)
    %%%%%%%%%%
    %..$.....%
    %.%%...$.%
    %...@....%
    %.%%%%%%.%
    %.$......%
    %%%%%%%%%%

    Torch Level 3
       %
       ..
     %%...
    ...@...
     %%%%%
</code></pre>
<h1>Harder:</h1>
<p>Torches have a power of 5 instead of 3 -- every 2 Steps the Torch degenerates in power to 4 then 3 then 2 then 1 then none. In the room you will random place other "T" for torches or a light source which will refresh your torch power by +2 up to a max of 10. Again your Torch view will degenerate by 1 every 2 steps used (so if you can gain more than 5 torch power up to 10 but then it will degenerate 10-9-8 etc)</p>
<p>You will add 10 random pit traps. If the hero ends in the pit trap they die and game is over. </p>
</div>
