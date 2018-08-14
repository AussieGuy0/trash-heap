# It's super effective!
<div class="md"><h1>Description</h1>
<p>In the popular Pokémon games all moves and Pokémons have types that determine how effective certain moves are against certain Pokémons.</p>
<p>These work by some very simple rules, a certain type can be super effective, normal, not very effective or have no effect at all against another type. These translate respectively to 2x, 1x, 0.5x and 0x damage multiplication. If a Pokémon has multiple types the effectiveness of a move against this Pokémon will be the product of the effectiveness of the move to it's types.</p>
<h1>Formal Inputs &amp; Outputs</h1>
<h2>Input</h2>
<p>The program should take the type of a move being used and the types of the Pokémon it is being used on.</p>
<p><strong>Example inputs</strong></p>
<pre><code> fire -&gt; grass
 fighting -&gt; ice rock
 psychic -&gt; poison dark
 water -&gt; normal
 fire -&gt; rock
</code></pre>
<h2>Output</h2>
<p>The program should output the damage multiplier these types lead to.</p>
<p><strong>Example outputs</strong></p>
<pre><code>2x
4x
0x
1x
0.5x
</code></pre>
<h1>Notes/Hints</h1>
<p>Since probably not every dailyprogrammer user is an avid Pokémon player that knows the type effectiveness multipliers by heart here is a <a href="http://pokemondb.net/type">Pokémon type chart</a>.</p>
<h1>Bonus 1</h1>
<p>Use the <a href="https://pokeapi.co">Pokémon api</a> to calculate the output damage.</p>
<p>Like</p>
<pre><code>http://pokeapi.co/api/v2/type/fire/
</code></pre>
<p>returns (skipped the long list)</p>
<pre><code>{  
    "name":"fire",
    "generation":{  
        "url":"http:\/\/pokeapi.co\/api\/v2\/generation\/1\/",
        "name":"generation-i"
    },
    "damage_relations":{  
        "half_damage_from":[  
            {  
                "url":"http:\/\/pokeapi.co\/api\/v2\/type\/7\/",
                "name":"bug"
            },
            {  
                "url":"http:\/\/pokeapi.co\/api\/v2\/type\/9\/",
                "name":"steel"
            },
            {  
                "url":"http:\/\/pokeapi.co\/api\/v2\/type\/10\/",
                "name":"fire"
            },
            {  
                "url":"http:\/\/pokeapi.co\/api\/v2\/type\/12\/",
                "name":"grass"
            },
            {  
                "url":"http:\/\/pokeapi.co\/api\/v2\/type\/15\/",
                "name":"ice"
            },
            {  
                "url":"http:\/\/pokeapi.co\/api\/v2\/type\/18\/",
                "name":"fairy"
            }
        ],
        "no_damage_from":[  

        ],
        "half_damage_to":[  
            {  
                "url":"http:\/\/pokeapi.co\/api\/v2\/type\/6\/",
                "name":"rock"
            },
            {  
                "url":"http:\/\/pokeapi.co\/api\/v2\/type\/10\/",
                "name":"fire"
            },
            {  
                "url":"http:\/\/pokeapi.co\/api\/v2\/type\/11\/",
                "name":"water"
            },
            {  
                "url":"http:\/\/pokeapi.co\/api\/v2\/type\/16\/",
                "name":"dragon"
            }
        ],
        "double_damage_from":[  
            {  
                "url":"http:\/\/pokeapi.co\/api\/v2\/type\/5\/",
                "name":"ground"
            },
            {  
                "url":"http:\/\/pokeapi.co\/api\/v2\/type\/6\/",
                "name":"rock"
            },
            {  
                "url":"http:\/\/pokeapi.co\/api\/v2\/type\/11\/",
                "name":"water"
            }
        ],
        "no_damage_to":[  

        ],
        "double_damage_to":[  
            {  
                "url":"http:\/\/pokeapi.co\/api\/v2\/type\/7\/",
                "name":"bug"
            },
            {  
                "url":"http:\/\/pokeapi.co\/api\/v2\/type\/9\/",
                "name":"steel"
            },
            {  
                "url":"http:\/\/pokeapi.co\/api\/v2\/type\/12\/",
                "name":"grass"
            },
            {  
                "url":"http:\/\/pokeapi.co\/api\/v2\/type\/15\/",
                "name":"ice"
            }
        ]
    },
    "game_indices":[  
       ...
    ],
    "move_damage_class":{  
        ...
    },
    "moves":[  
        ...
    ],
    "pokemon":[  
        ...
    ],
    "id":10,
    "names":[  
        ...
    ]
    }
</code></pre>
<p>If you parse this json, you can calculate the output, instead of hard coding it.</p>
<h1>Bonus 2</h1>
<p>Deep further into the api and give the multiplier for folowing </p>
<pre><code>fire punch -&gt; bulbasaur
wrap -&gt; onix
surf -&gt; dwegong
</code></pre>
<h2>side note</h2>
<p>the api replaces a space with a hypen (<code>-</code>)</p>
<h1>Finaly</h1>
<p>Special thanks to <a href="/u/Daanvdk">/u/Daanvdk</a> for posting the idea on <a href="/r/dailyprogrammer_ideas">/r/dailyprogrammer_ideas</a>.</p>
<p>If you also have a good idea, don't be afraid to put it over their.</p>
<p><strong>EDIT</strong>: Fixed link</p>
</div>
