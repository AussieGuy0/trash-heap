(ns card-games)

(defn rounds
  "Takes the current round number and returns
   a `list` with that round and the _next two_."
  [n]
  (let [second-round (+ 1 n)
        third-round (+ 2 n)]
    (list n second-round third-round)))

(defn concat-rounds
  "Takes two lists and returns a single `list`
   consisting of all the rounds in the first `list`,
   followed by all the rounds in the second `list`"
  [l1 l2]
  (concat l1 l2))

(defn contains-round?
  "Takes a list of rounds played and a round number.
   Returns `true` if the round is in the list, `false` if not."
  [l n]
  (boolean (some #(= n %) l)))

(defn card-average
  "Returns the average value of a hand"
  [hand]
  (float (/ (reduce + hand) (count hand))))

(defn median
  [hand]
  (nth hand (/ (count hand) 2)))

(defn start-end-avg
  [hand]
  (card-average (list (first hand) (last hand))))

(defn approx-average?
  "Returns `true` if average is equal to either one of:
  - Take the average of the _first_ and _last_ number in the hand.
  - Using the median (middle card) of the hand."
  [hand]
  (let [actual-avg (card-average hand)]
    (or (== actual-avg (median hand)) (== actual-avg (start-end-avg hand)))))

(defn avg-indexed-list
  [f indexed-hand]
  (->> indexed-hand
       (filter f)
       (map last)
       (card-average)))

(defn average-even-odd?
  "Returns true if the average of the cards at even indexes
   is the same as the average of the cards at odd indexes."
  [hand]
  (let [indexed (map-indexed list hand)]
    (= (avg-indexed-list #(odd? (first %)) indexed)
       (avg-indexed-list #(even? (first %)) indexed))))

(defn maybe-double-last
  "If the last card is a Jack (11), doubles its value
   before returning the hand."
  [hand]
  (if (= (last hand) 11) (flatten (list (butlast hand) 22)) hand))

(comment
  (maybe-double-last '(1 2 11))
  (average-even-odd? '(1 2 3 4))
  (start-end-avg '(1 2 4 5 8)) ; 4
  (median '(1 2 4 5 8)) ; 4
  (approx-average? '(1 2 4 5 8)) ; false
  (card-average '(1 2 3 3))
  (contains-round? '(1 2 3) 3) ; true
  (concat-rounds '(1 2 3) '(4 5 6)) ; '(1 2 3 4 5 6)
  (rounds 5) ; '(5 6 7)
         ;
  )
