# Admin Schmadmin
<div class="md"><h1>Description</h1>
<p>"I'm sorry we had to call you in at such small notice but our last admin royally screwed us over. I don't suppose you can have a scout through the files and see if there's any remnants of that slimeball left in our system can you? Any leftover documents, programs, CV's, ANYTHING you can find about him, I need it so I can finish him."</p>
<p><em>A few weeks pass</em></p>
<p>...Congratulations! </p>
<p>You've been hired as a temp to do some administrative duties that involve digging through the records of the filesystem in search for any hints as to where the ex-employee may have fled to. But first, you'll need some training. I've assigned you a few simple tasks that should build your command line skills to that of an adequate admin. </p>
<h1>Formal Inputs &amp; Outputs</h1>
<p>For this task, you are given a tasklist of tasks to perform. Each task has a bulleted point and a summary. The bulleted point contains the dialogue of what the manager wants you to perform, the summary can be seen as a sort of 'technical overview' of what needs to be done.</p>
<h2>Input description</h2>
<p>As input, you are expected to execute commands into your terminal that correspond to the given task on the tasklist.</p>
<h2>Output description</h2>
<p>The program should output the expected output of your command.</p>
<h1>Tasklist</h1>
<p>"Okay employee, I've hired you now get to work! Listen carefully to what I have to say, I'm not going to say it twice!..."</p>
<ul>
<li>"Bring up that list of his most used files, let's see what that scumbag's been up to!"</li>
</ul>
<p>Summary : Get the 20 last used documents from the system and sort by the date they were modified.</p>
<hr/>
<ul>
<li>"Great, can you email that to me?"</li>
</ul>
<p>Summary : Output the above command to a .txt file. </p>
<hr/>
<ul>
<li>"Hmm, still nothing. Maybe the answer is right in front of us? Get the last commands he used on the console!"</li>
</ul>
<p>Summary : Retrieve the last 10 commands used on the console.</p>
<hr/>
<ul>
<li>"AHA, this looks good I'll just email it to my...what the? What's going on!..."  <em>10 minutes later</em> "He crashed our machine! I knew he had some software throttling our machines, find out what's causing it, and fix it!"</li>
</ul>
<p>Summary :  Get the 10 most CPU-heavy processes in descending order.</p>
<hr/>
<ul>
<li>"wait, wait, WAIT! Before you go any further. Let's look through the error logs! I won't be able to understand them and you don't have access to most of what's needed but if you could link them to my tech team, I'm sure they could figure it out!</li>
</ul>
<p>Summary : Retrieve the last 20 error logs/messages and output these as a formatted HTML table </p>
<hr/>
<ul>
<li>"Okay, now we're getting somewhere. Let's put the nail in the coffin. Bruteforce it. Search every file, every directory, every nook and cranny for any .txt files, any .pdf and any .exe files"</li>
</ul>
<p>Summary : Retrieve all txt/pdf/exe files on the machine (You do not need to do the whole machine, just 1 drive is enough, or less if your machine is struggling).</p>
<hr/>
<p>"Thanks kid, you saved our bacon! Now get out."</p>
<h1>Notes/Hints</h1>
<p>Beginners, consider using a shell environent for this. For windows I recommend Powershell. I'm not a Unix man but I hear the default shell is more than up to this task. Doing this in a programming language will prove to be a lot of work, choose a shell if you want your sanity.</p>
<h1>Finally</h1>
<p>Have a good challenge idea?</p>
<p>Consider submitting it to <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a></p>
<p>Remember to check out our IRC channel. Check the sidebar for a link --&gt;</p>
</div>
