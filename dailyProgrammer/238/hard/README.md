# Searching a Dungeon
<div class="md"><h1>Description</h1>
<p>Our hero is lost in a dungeon. You will be given ASCII maps of a few floors, her starting position, and her goal. On some floors there are holes in the ground/roof, so that you can move between floors. Some only open one way, so going up doesn't guarantee that you can thereafter go down.</p>
<p>Your goal is to paint the path the hero takes in the dungeon to go from their starting position to the goal.</p>
<h1>Input Description</h1>
<p>There are a few characters used to build the ASCII map.</p>
<p>'#' means wall. You cannot go here</p>
<p>' ' means empty. You can go here from adjacent positions on the same floor.</p>
<p>'S' means start. You start here</p>
<p>'G' means goal. You need to go here to find the treasure and complete the challenge!</p>
<p>'U' means up. You can go from floor 'n' to floor 'n+1' here.</p>
<p>'D' means down. You can go from floor 'n' to floor 'n-1' here.</p>
<p>Your output is the same as the input, but with '*' used to paint the route.</p>
<p>The route has to be the shortest possible route.</p>
<p>Lower floors are printed below higher floors</p>
<p>Example input:</p>
<pre><code>#####
#S# #
# # #
#D#G#
#####

#####
#  U#
# ###
#  ##
#####
</code></pre>
<h1>Output Description</h1>
<p>Your program should emit the levels of the dungeon with the hero's path painted from start to goal. </p>
<p>Example output:</p>
<pre><code>#####
#S#*#
#*#*#
#D#G#
#####

#####
#**U#
#*###
#* ##
#####
</code></pre>
<p>(It doesn't matter whether you paint over U and D or not)</p>
<h1>Challenge input</h1>
<p>(if you want to, you may use the fact that these floors are all 10x10 in size, as well as there being 4 floors, by either putting this at the top of your input file, or hardcoding it)</p>
<pre><code>##########
#S###    #
#   # ####
### # #D##
#   # # ##
#D# # # ##
###     ##
### ### ##
###     ##
##########

##########
#   #   D#
#     ####
###   # ##
#U#   # ##
# #    D##
##########
#       ##
#D# # # ##
##########

##########
#        #
# ########
# #U     #
# #      #
# ####   #
#    #####
#### ##U##
# D#    ##
##########

##########
#        #
# ###### #
# #    # #
# # ## # #
# #  #   #
# ## # # #
# ##   # #
#  #####G#
##########
</code></pre>
<h1>Credit</h1>
<p>This challenge was suggested by <a href="/u/Darklightos">/u/Darklightos</a>. If you have any challenge ideas, please share them on <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a> and there's a good chance we'll use it.</p>
</div>
