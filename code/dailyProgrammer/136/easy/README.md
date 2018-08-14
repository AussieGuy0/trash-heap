# Student Management
<div class="md"><h1><a href="#EasyIcon"></a> <em>(Easy)</em>: Student Management</h1>
<p>You are a computer science professor at South Harmon Institute of Technology, and are in dire need of automatic grading! The good news is you have all of your student's assignments in an easy-to-read format, making automation easy!</p>
<p>You will be given a list of unique student names, and then a list of their assignment grades. All assignments are based on 20 points and are scored in whole-numbers (integers). All students have received the same number of assignments, so you don't have to worry about managing <a href="http://en.wikipedia.org/wiki/Iliffe_vector">jagged arrays</a>.</p>
<p><em>Author:</em> nint22</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input Description</h2>
<p>On standard console input, you will be given two space-delimited integers N and M: N is the number of students (which ranges from 1 to 60, inclusive), and M is the number of assignments (which ranges from 4 to 100, inclusive). This will be followed by N lines of text, each starting with an upper-case unique string being is your students name. This is then followed by M integers, which are the grades ranging from 0 to 20, inclusively.</p>
<h2>Output Description</h2>
<p>On the first line of output, print the class' average grade. Then, for each student, print their name and average grade (up to two decimal points precision).</p>
<h1>Sample Inputs &amp; Outputs</h1>
<h2>Sample Input 1</h2>
<pre><code>3 5
JON 19 14 15 15 16
JEREMY 15 11 10 15 16
JESSE 19 17 20 19 18
</code></pre>
<h2>Sample Output 1</h2>
<pre><code>15.93
JON 15.80
JEREMY 13.40
JESSE 18.60
</code></pre>
<h2>Sample Input 2</h2>
<pre><code>10 10
ABIGAIL 11 3 5 20 4 2 8 17 4 5
ALEXANDER 2 12 20 0 6 10 3 4 9 7
AVA 11 15 2 19 14 5 16 18 15 19
ETHAN 6 12 0 0 5 11 0 11 12 15
ISABELLA 16 0 10 7 20 20 7 2 0 1
JACOB 2 14 17 7 1 11 16 14 14 7
JAYDEN 10 10 3 16 15 16 8 17 15 3
MADISON 10 11 19 4 12 15 7 4 18 13
SOPHIA 5 17 14 7 1 17 18 8 1 2
WILLIAM 12 12 19 9 4 3 0 4 13 14
</code></pre>
<h2>Sample Output 2</h2>
<pre><code>9.50
ABIGAIL 7.90
ALEXANDER 7.30
AVA 13.40
ETHAN 7.20
ISABELLA 8.30
JACOB 10.30
JAYDEN 11.30
MADISON 11.30
SOPHIA 9.00
WILLIAM 9.00
</code></pre>
</div>
