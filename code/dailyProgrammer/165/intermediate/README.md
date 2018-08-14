# ASCII Maze Master
<div class="md"><h1><a href="#IntermediateIcon"></a> <em>(Intermediate)</em>: ASCII Maze Master</h1>
<p>We're going to have a slightly more logical puzzle today. We're going to write a program that will find a path through a simple maze.</p>
<p>A simple maze in this context is a maze where all of the walls are connected to each other. Take this example maze segment.</p>
<pre><code># # ### #
# #      
# ### B #
#   # B #
# B # B #
# B   B #
# BBBBB #
#       #
#########
</code></pre>
<p>See how the wall drawn with <code>B</code>s isn't connected to any other walls? That's called a floating wall. A simple maze contains no floating walls - ie. there are no loops in the maze.</p>
<h1>Formal Inputs and Outputs</h1>
<h2>Input Description</h2>
<p>You will be given two numbers <strong>X</strong> and <strong>Y</strong>. After that you will be given a textual ASCII grid, <strong>X</strong> wide and <strong>Y</strong> tall, of walls <code>#</code> and spaces. In the maze there will be exactly one letter <code>S</code> and exactly one letter <code>E</code>. There will be no spaces leading to the outside of the maze - ie. it will be fully walled in.</p>
<h2>Output Description</h2>
<p>You must print out the maze. Within the maze there should be a path drawn with askerisks <code>*</code> leading from the letter <code>S</code> to the letter <code>E</code>. Try to minimise the length of the path if possible - don't just fill all of the spaces with <code>*</code>!</p>
<h1>Sample Inputs &amp; Output</h1>
<h2>Sample Input</h2>
<pre><code>15 15
###############
#S        #   #
### ### ### # #
#   #   #   # #
# ##### ##### #
#     #   #   #
# ### # ### ###
# #   # #   # #
# # ### # ### #
# # # # # #   #
### # # # # # #
#   #   # # # #
# ####### # # #
#           #E#
###############
</code></pre>
<h2>Sample Output</h2>
<pre><code>###############
#S**      #   #
###*### ### # #
#***#   #   # #
#*##### ##### #
#*****#   #   #
# ###*# ### ###
# #***# #   # #
# #*### # ### #
# #*# # # #***#
###*# # # #*#*#
#***#   # #*#*#
#*####### #*#*#
#***********#E#
###############
</code></pre>
<h1>Challenge</h1>
<h2>Challenge Input</h2>
<pre><code>41 41
#########################################
#   #       #     #           #         #
# # # ### # # ### # ####### ### ####### #
# #S#   # #   #   # #     #           # #
# ##### # ######### # # ############# # #
# #     # #         # #       #   #   # #
# # ##### # ######### ##### # # # # ### #
# #     #   #     #     #   # # # # # # #
# ##### ######### # ##### ### # # # # # #
#   #           #   #     #   # # #   # #
# ### ######### # ### ##### ### # ##### #
#   #   #     # # #   #       # #       #
# # ### # ### # ### ### ####### ####### #
# #     # #   #     #   # #     #     # #
# ####### # ########### # # ##### # ### #
#     # # #   #       #   # #   # #     #
##### # ##### # ##### ### # ### # #######
#   # #     # #   #   #   # #   #     # #
# ### ### ### ### # ### ### # ####### # #
#   #     #   #   # #   #   # #     #   #
### ##### # ### ### ### # ### # ### ### #
#       # #   # # #   # # #   # # #     #
# ####### ### # # ### ### # ### # #######
#       #   #   #   # #   #     #       #
# ##### ### ##### # # # ##### ### ### ###
#   # # #   #     # # #     # #     #   #
### # # # ### # ##### # ### # # ####### #
# #   #   #   # #     #   # # # #     # #
# ### ##### ### # ##### ### # # # ### # #
#   #       #   # # #   #   # # #   #   #
# # ######### ### # # ### ### # ### #####
# #     #   # # # #   #   # # #   #     #
# ##### # # # # # ### # ### # ######### #
# #   # # # # # #   # #   #             #
# # # # # # # # ### ### # ############# #
# # #     # # #   #   # #       #       #
# ######### # # # ### ### ##### # #######
#     #     # # #   #   # #     # #     #
# ### ####### ### # ### ### ##### # ### #
#   #             #   #     #       #E  #
#########################################
</code></pre>
<h1>Notes</h1>
<p>One easy way to solve simple mazes is to always follow the wall to your left or right. You will eventually arrive at the end.</p>
</div>
