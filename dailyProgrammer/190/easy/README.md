# Webscraping sentiments
<div class="md"><h1>Description</h1>
<p>Webscraping is the delicate process of gathering information from a website (usually) without the assistance of an API. Without an API, it often involves finding what ID or CLASS a certain HTML element has and then targeting it. In our latest challenge, we'll need to do this (you're free to use an API, but, where's the fun in that!?) to find out the overall sentiment of a sample size of people.</p>
<p>We will be performing very basic sentiment analysis on a YouTube video of your choosing.</p>
<h1>Task</h1>
<p>Your task is to scrape N (You decide but generally, the higher the sample, the more accurate) number of comments from a YouTube video of your choice and then analyse their sentiments based on a short list of happy/sad keywords</p>
<p>Analysis will be done by seeing how many Happy/Sad keywords are in each comment. If a comment contains more sad keywords than happy, then it can be deemed sad. </p>
<p>Here's a basic list of keywords for you to test against. I've ommited expletives to please all readers...</p>
<p>happy = ['love','loved','like','liked','awesome','amazing','good','great','excellent']</p>
<p>sad = ['hate','hated','dislike','disliked','awful','terrible','bad','painful','worst'] </p>
<p>Feel free to share a bigger list of keywords if you find one. A larger one would be much appreciated if you can find one.</p>
<h1>Formal inputs and outputs</h1>
<h2>Input description</h2>
<p>On console input, you should pass the URL of your video to be analysed.</p>
<h2>Output description</h2>
<p>The output should consist of a statement stating something along the lines of - </p>
<p>"From a sample size of" N "Persons. This sentence is mostly" [Happy|Sad] "It contained" X "amount of Happy keywords and" X "amount of sad keywords. The general feelings towards this video were" [Happy|Sad]</p>
<h1>Notes</h1>
<p>As pointed out by <a href="/u/pshatmsft">/u/pshatmsft</a> , YouTube loads the comments via AJAX so there's a slight workaround that's been posted by <a href="/u/threeifbywhiskey">/u/threeifbywhiskey</a> .</p>
<p>Given the URL below, all you need to do is replace FullYoutubePathHere with your URL</p>
<p><a href="https://plus.googleapis.com/u/0/_/widget/render/comments?first_party_property=YOUTUBE&amp;href=FullYoutubePathHere">https://plus.googleapis.com/u/0/_/widget/render/comments?first_party_property=YOUTUBE&amp;href=FullYoutubePathHere</a></p>
<p>Remember to append your url in full (<a href="https://www.youtube.com/watch?v=dQw4w9WgXcQ">https://www.youtube.com/watch?v=dQw4w9WgXcQ</a>  as an example)</p>
<h1>Hints</h1>
<p>The string for a Youtube comment is the following</p>
<pre><code>&lt;div class="CT"&gt;Youtube comment here&lt;/div&gt;
</code></pre>
<h1>Finally</h1>
<p>We have an IRC channel over at</p>
<p>webchat.freenode.net in #reddit-dailyprogrammer</p>
<p>Stop on by :D</p>
<p>Have a good challenge idea?</p>
<p>Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
</div>
