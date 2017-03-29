# Base 64 compression
<div class="md"><p>You have probably heard of base 64 encoding.  Bytes (256 range of values) are encoded in 6 bits (but not compressed), where the primary aim is to encode data over a text (non-binary) channel.</p>
<p>Base 64 encoding increases the size of the source binary data by 25%</p>
<h1>Base X compression</h1>
<p>Base X compression maps from coded base numbers to codes with the hope that most codes map to the first page.  But the code corresponding to the largest number in base X is code to look at the next "base digit" to map from another code page.</p>
<p>ascii base 64 example:</p>
<pre><code>  44 47 55 68 126 indexes in the ascii table are:
</code></pre>
<p>,/7D~</p>
<p>in base 64, to get ascii indexes above 63, you encode the number 63 followed by the offset from the "next page" in the coding table.</p>
<pre><code>44 47 55 63 5 63 63 0 or packed 3183824205384728320 (decimal)
</code></pre>
<p>encodes the same "ascii" values using a base 64 page system.</p>
<p>Note that to achieve effective compression the most frequent characters/codes have to appear in the first page(s) of the possible alphabet</p>
<h1>1 easiest:  constant base 64 pages</h1>
<p>This is the fastest algorithm.  A constant base for all pages is used.  But the input format is the same as the next challenge</p>
<p>Compressor input has 2 lines.  </p>
<ol>
<li>The page sizes as integers</li>
<li>The alphabet codes in frequency order.</li>
</ol>
<p>Text to compress inputs are used to apply/test your compressor</p>
<p><strong>compressor input:</strong> (alphabet has leading space)</p>
<pre><code> 64 64
  abcdefghijklmnopqrstuvwxyz.,ABCDEFGHIJKLMNOPQRSTUVWXYZ-()"';:/?!1234567890@%+*^#&lt;&gt;{}[]&amp;_`|\
</code></pre>
<p><strong>input taxt</strong></p>
<pre><code> 44 47 55 68 126 indexes in the ascii table are:
</code></pre>
<p>use your derived compressor to generate either a large decimal number or binary packing or simplest of all, an official base 64 packing of the data for legible posting.</p>
<p>Also make a decompression function that takes your output and returns the input</p>
<h1>2 variable base encoding</h1>
<p>This page offers a frequency analysis of password characters:  <a href="http://reusablesec.blogspot.ca/2009/05/character-frequency-analysis-info.html">http://reusablesec.blogspot.ca/2009/05/character-frequency-analysis-info.html</a>, and offers ideas for "markov chain pages" where the page layout varies based on last character.</p>
<p>A quick full ascii list is derived from it.  Instead of a string alphabet, the input is a list of decimal ascii codes.</p>
<p>Variable base page codes of say <code>16 32 16 128 64 8</code> means first look at the first 4 bits of compressed stream.  If the value is under 15 then that is the decoded alphabet index.  If it is 15, then look at the next 5 bits.  If that is under 31, then the decoded alphabet index is 15 + it.  Otherwise look at the next 4 bits...</p>
<p>variable bases that are powers of 2 allow "integral bit" compression, but you may (next challenge) allow code that compresses with any base sacrificing some speed opportunities.</p>
<p>*<em>compressor input: *</em></p>
<pre><code> 32 32 64 128 4
 32 97 101 111 114 105 115 110 49 116 108 50 109 100 48 99 112 51 104 98 117 107 52 53 103 57 54 56 55 10 13 121 102 119 106 118 122 120 113 65 83 69 82 66 84 77 76 78 80 79 73 68 67 72 71 75 70 74 85 87 46 33 89 42 64 86 45 90 81 88 95 36 35 44 47 43 63 59 94 37 126 61 38 96 92 41 93 91 58 60 40 230 62 34 252 124 123 39 246 228 125 0 1 2 3 4 5 6 7 8 9 11 12 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 127 128 129 130 131 132 133 134 135 136 137 138 139 140 141 142 143 144 145 146 147 148 149 150 151 152 153 154 155 156 157 158 159 160 161 162 163 164 165 166 167 168 169 170 171 172 173 174 175 176 177 178 179 180 181 182 183 184 185 186 187 188 189 190 191 192 193 194 195 196 197 198 199 200 201 202 203 204 205 206 207 208 209 210 211 212 213 214 215 216 217 218 219 220 221 222 223 224 225 226 227 229 231 232 233 234 235 236 237 238 239 240 241 242 243 244 245 247 248 249 250 251 253 254 255
</code></pre>
<p><strong>input text</strong> (includes 1 LF)</p>
<pre><code>  Base X compression maps from coded base numbers to codes with the hope that most codes map to the first page. But the code corresponding to the largest number in base X is code to look at the next "base digit" to map from another code page.
  ascii base 64 example:
</code></pre>
<h1>3 Create a compression scheme taylored to a context</h1>
<p>For example compressing English paragraphs in essays.  Still depending on the context of the book/essay.   Numbers would be more frequent in history and math subjects than in fictional stories.</p>
<p>Note that the alphabet is not limited to 256 characters.  <code>the</code> might have its own code for example.  Formatting codes such as document/page, paragraph, and sentence separators might exists which then apply some user-customizable formatting actions for start of sentences/paragraphs...</p>
<p>The "markov page" concept alluded previously could apply custom pages based on begining of word, previous letter etc...</p>
<p>Bases that are not powers of 2 offer more compression flexibility.</p>
<p><a href="https://en.wikipedia.org/wiki/Letter_frequency#Relative_frequencies_of_letters_in_the_English_language">https://en.wikipedia.org/wiki/Letter_frequency#Relative_frequencies_of_letters_in_the_English_language</a></p>
</div>
