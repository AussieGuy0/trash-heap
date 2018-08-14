# Medal Management
<div class="md"><h1><a href="#HardIcon"></a> <em>(Hard)</em>: Medal Management</h1>
<p>The moderators of <a href="/r/DailyProgrammer">/r/DailyProgrammer</a> give out medals (either gold or silver) as community rewards / community achievements. Though everyone has the two medal icons next to their names, the actual amount you have are reflected as two integers (gold first, then silver). The side-bar to the right has a section titled "Achievements System", which describes how medals are earned.</p>
<p>The problem though is that mods have to use the sub-Reddit's administration page to add the basic flair to a user and to change the medal count in any way. Though not hard, it certainly isn't a simple process, so we would like your help in building a better solution!</p>
<p>Your goal is to write a single web-page in JavasScript that "wraps" these admin features together in a nice single form. Essentially it should be a page with <strong>minimal server-side code</strong> or <strong>you can ditch the idea of a page and just make a browser add-on (Chrome or FireFox please)</strong>, when given Reddit login credentials, allows:</p>
<ul>
<li>Loading a user's flair string and type</li>
<li>Saving a user's flair string and type</li>
<li>Allowing a one-click +1 Gold and +1 Silver for any given Reddit username</li>
<li>Load a user's <a href="/r/DailyProgrammer">/r/DailyProgrammer</a> post history for any given Reddit username</li>
</ul>
<p>Reddit provides an external API interface for these purposes: <a href="http://www.reddit.com/dev/api">learn more about the web-based API here</a>.</p>
<p><strong>Though this will be a typical [hard] level challenge, we <em>will</em> be giving out a gold medal <em>and</em> Reddit gold (3 months) for the person who gives a fully-featured solution. Note that solutions must be open-source (hey, we want to use your system!) and you will be given full credits to it in our sub-Reddit's side-bar. Starting from today (Friday), all solutions are due in exactly 7 days: the competition ends at 11:55pm, American pacific time, UTC−8. It'll take about day to confirm who wins.</strong></p>
<p>To help get started, check out these Reddit JavaScript APIs: (note that none are a "perfect" solution, and some heavy work will be required)</p>
<ul>
<li><a href="http://www.reddit.com/dev/api">Official Reddit API</a></li>
<li><a href="https://github.com/timisbusy/handson-reddit">Handson Reddit</a></li>
<li><a href="https://github.com/tommyvyo/reddit-js-client">Reddit JS Client</a></li>
</ul>
<p>This is quite a big challenge to take on, so I'll be much more involved with responding to questions and comments. Good luck, and have fun!</p>
<p><strong>Edit 1:</strong> Our awesome user <a href="http://www.reddit.com/r/dailyprogrammer/comments/1dk7c7/05213_challenge_121_hard_medal_management/c9r4obj">Skeeto</a> has pointed out that a pure client-side implementation is not possible for security reasons; my bad! I've updated the rules to allow minimal server-side code or the choice of just making all of this a browser add-on.</p>
</div>
