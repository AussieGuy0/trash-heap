# March Madness Brackets
<div class="md"><h1><strong>Description:</strong></h1>
<p>It is that time of year again when across some of the lands you hear about March Madness and NCAA Basketball. People ask about your brackets and how you are doing in your predictions. Of course to those of us who perform the art of coding we always get a bit confused by this. </p>
<p>You see we think of brackets like [] or {} or () to use in our many wonderful languages. As it turns out in a bit of madness some messages got the rough bracket treatment. I am asking you to decode these messages by removing the brackets and decoding the message. The order of the message should be ordered for the deepest bracket strings to be displayed first then the next deepest and so forth.</p>
<h1><strong>Input:</strong></h1>
<p>(String of words with matching bracket sets in an order that can only be called mad)</p>
<h2>Example 1:</h2>
<p>((your[drink {remember to}])      ovaltine)</p>
<h2>Example 2:</h2>
<p>[racket for {brackets (matching) is a}      computers]</p>
<h2>Example 3:</h2>
<p>[can {and                   it(it (mix) up      )        } look silly]</p>
<h1><strong>Output:</strong></h1>
<p>The words separated by a single space in order from deepest to shallow on the ordering of matched brackets.</p>
<h2>Example 1:</h2>
<p>remember to drink your ovaltine</p>
<h2>Example 2:</h2>
<p>matching brackets is a racket for computers</p>
<h2>Example 3:</h2>
<p>mix it up and it can look silly</p>
<h1><strong>Notes:</strong></h1>
<p>Assume your input is error checked. </p>
<p>Bracket groups can be either [] or () or {} and there will be no mismatches. </p>
<p>The pattern of when and what brackets are used is random. You could see all () or () then a [] then a () again. Etc.</p>
<p>Every closing bracket will have an opening one that matches. So ] matches to a [ and ) matches to a ( and } matches to a {.</p>
<p>Whitespace can be random and you need to clean it up. Sometimes there are spaces between bracket symbols and sometimes not. Words will be separated clearly with at least 1 whitespace.</p>
<p>Bracket levels will not be broken up between words. For example you would not see it like this. </p>
<p>{years [four score] ago (and seven) our fathers}</p>
<p>The [four score] (and seven) are on the same level but broken up between words. You would see this as</p>
<p>{years(and seven (four score)) ago our fathers}</p>
<p>Have fun! And good luck with those brackets!</p>
<h1><strong>Extra Challenge:</strong></h1>
<p>Prior to handling the problem you will proof read your string and look for 2 errors.</p>
<p>1) Mismatch bracket -- ending a ( with a ] or a } for an example causes an error to be detected and reported.</p>
<p>2) Missing bracket having 3 starting brackets but only 2 closing brackets causes an error to be detected and reported.</p>
<h2>example:</h2>
<p>((your[drink {remember to)))      ovaltine)</p>
<p>Generates an error of "Mismatched bracket ) instead of } found"</p>
<h2>example:</h2>
<p>[can {and                   it(it (mix) up      )         look silly]</p>
<p>Generates an error "Missing closing bracket"</p>
<h2>example:</h2>
<p>[racket for brackets (matching) is a}      computers]</p>
<p>Generates an error "Missing opening bracket"</p>
<hr/>
<p>Also you can handle multiple sets on the same level broken up by words. </p>
<h2>example:</h2>
<p>{years [four score] ago (and seven) our fathers}</p>
<p>Generates the output:</p>
<p>four score and seven years ago our fathers</p>
<p>You would use left to right to give priority to which equal sets to output.</p>
</div>
