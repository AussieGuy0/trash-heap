# Cross Platform/Language Data Encoding part 1
<div class="md"><p>We will make a binary byte oriented encoding of data that is self describing and extensible, and aims to solve the following problems:</p>
<ul>
<li>portability between 32 and 64 (and any other) bit systems, and languages, and endian-ness.</li>
<li>type system independent of underlying language.<br/></li>
<li>Allow heterogeneous arrays (differing types of array elements) where the underlying language has poor support for them.</li>
<li>leverage power of homogeneous arrays in a language.</li>
<li>support records regardless of underlying language (array of records is homogeneous, even though a record is a heterogeneous list of fields)</li>
<li>Allow ragged arrays (a table where each row is a list, but the rows do not have a uniform size (or shape))</li>
<li>Provide basic in memory compression.  Allow deferred decoding of partial data.</li>
</ul>
<h1>1.  base64 encoding (used in later challenges)</h1>
<p>To read and write binary data on reddit, we will use base64 encoding, <a href="https://www.reddit.com/r/dailyprogrammer/comments/4xy6i1/20160816_challenge_279_easy_uuencoding/">https://www.reddit.com/r/dailyprogrammer/comments/4xy6i1/20160816_challenge_279_easy_uuencoding/</a></p>
<h1>2. Extendible byte base.</h1>
<p>Any size integer can be coded into a variable byte array by using the maximum byte value as a marker to add the next byte value to decode the total.  </p>
<p>This is useful for coding numbers that you think can be limited to around 255 or close to it, without being "hard constrained" by that limit.  "256 possible op codes (or characters) ought to be enough for everyone forever thinking" </p>
<p><strong>unsigned byte input</strong><br/>
12<br/>
255<br/>
256<br/>
510<br/>
512 44 1024</p>
<p>last input is a list of 3 integers to encode</p>
<p><strong>sample outputs</strong><br/>
12<br/>
255 0<br/>
255 1<br/>
255 255 0<br/>
255 255 2 44 255 255 255 255 4</p>
<p>every element that is not 255 marks the end of "that integer" in a list.  You should also write a decoder that transforms output into input.</p>
<h1>3. multibyte and variable byte encodings</h1>
<p>Instead of a single byte target encoding, 2,4,8 and variable defined byte sizes are also desirable to cover integers with larger ranges.  An account balance might have a 40 bit practical limit, but you might not guarantee it forever.  64 bits might not be enough for Zimbabwe currency balances for example.</p>
<p>For compressing a list of numbers, often it is useful to set the whole list to one "byte size".  Other choices include, </p>
<ul>
<li>setting an enum/table of possible byte size codings of 1 2 4 8  sizes, and then encoding, the number of elements, the table/enum size and definition, and then 2 lists (enum key, data items)</li>
<li>interleave bytesize, data</li>
</ul>
<p>The latter will often be longer for long lists, but does not encode the table so is simpler to encode/decode.</p>
<p><strong>Encoding format for table definition:</strong> </p>
<ol>
<li>4 bytes: first 30 bits - length of list.  last 2 bits: key into 1 2 4 8.  If first 30 bits are max value, then following 4 bytes are added to count until a non-max value is taken.  Similar to challenge #2.<br/></li>
<li>list of byte lengths defined by key in 1.  If last 2 bits of 1 are 3 (signifies up to 8 distinct integer sizes), then this list has 8 items.  If there only 6 distinct integer size codings, then the last 2 items in this list would be ignored and set to 0.  Values over 255 are encoded as in challenge 2.</li>
<li>list of ordered data encodings in boolean form, if there are more than 1.  1 bit for 2, 2 bits for 4, 3 bits for 8.</li>
<li>list of data elements. </li>
</ol>
<p><strong>challenges</strong><br/>
encode list of integers from 0 to 1025 using 8 or 16 bit variable encoding.  With the shortest encoding that will contain the number.  Just print the sum of all the bytes as result for output brevity.</p>
<p><strong>solution</strong> </p>
<ol>
<li>first 4 bytes are (1025 * 4) + 1 (leading 0 bytes for smaller than "full size" numbers)</li>
<li>2 byte list: 1  2</li>
<li>0 for first 256 bits, 1 for remaining bits (total 1032 bits long with padding)</li>
<li>256 + (769 * 2) bytes long encoding of the numbers.</li>
</ol>
<h1>4. balanced signed numbers</h1>
<p>Some numbers are negative.  The common computer encoding for signed number ranges is to subtract half the max power of 2 from the value.  A signed byte has range -128 to 127, where a 0 value corresponds to -128 (in our encoding).</p>
<p>For numbers outside this range encoded in a single byte, the process is to take the first byte to determine the sign, and then following bytes add or subtract up to 255 per byte until a non 255 value is reached.</p>
<h1>5. unbalanced signed numbers</h1>
<p>Instead of the midpoint marking 0, a byte can encode a value within any defined range.
Another important application is to use "negative" numbers as codes of some sort.  These include:</p>
<ul>
<li>An expectation that negative numbers are less frequent and smaller relative to 0</li>
<li>coding special values such as null, infinity, undeterminable (0/0)</li>
<li>Using codes to hint at extended byte encodings and sign of the number, or even data type</li>
</ul>
<p><strong>sample 0 index codes</strong> (for 16 reserved codes) (new paragraph for multiline explained codes)<br/>
Null<br/>
Infinity<br/>
Negative Infinity<br/>
Negative 1 byte<br/>
Negative 2 bytes<br/>
Negative 4 bytes<br/>
Negative 8 bytes<br/>
Negative custom byte length (value is encoded into 2 numbers.  First is byte length (in 255 terminated bytes, followed by that number of bytes to represent the number)  </p>
<p>Positive 1 byte (first number indicates range of 468 to 723).  467 could have been encoded as 255 254 without this special code.</p>
<p>Positive 2 byte<br/>
Positive 4 byte<br/>
Positive 8 byte<br/>
Positive 16 byte<br/>
Positive 64 byte<br/>
Positive custom byte length (3 to 262 excluding other defined lengths)
Positive custom 2 byte length (16 bit unsigned number defines byte length of number, followed by encoded number)</p>
<p><strong>sample inputs</strong><br/>
10<br/>
123123<br/>
-55<br/>
Null </p>
<p><strong>sample output</strong><br/>
26<br/>
9 123123<br/>
3 54 (minimum range value is -1)<br/>
0  </p>
<p><strong>challenge input</strong> </p>
<p>192387198237192837192837192387123817239182737 _44 981237123</p>
<p>array of 3 numbers (_44 is -44) to be encoded </p>
</div>
