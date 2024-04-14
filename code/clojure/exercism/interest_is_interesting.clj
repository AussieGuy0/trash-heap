(ns interest-is-interesting)

(defn interest-rate
  "Returns the interest rate based on the specified balance."
  [balance]
  (cond
    (< balance 0) -3.213
    (< balance 1000) 0.5
    (< balance 5000) 1.621
    :else 2.475))

(defn determine-balance-change
  [balance rate]
  (* (abs balance) (/ (bigdec rate) 100M)))

(defn annual-balance-update
  "Returns the annual balance update, taking into account the interest rate."
  [balance]
  (let [rate (interest-rate balance)]
    (+ balance (determine-balance-change balance rate))))

(defn amount-to-donate
  "Returns how much money to donate based on the balance and the tax-free percentage."
  [balance tax-free-percentage]
  (let [payment ()]
    (cond
      (< balance 0) 0
      :else (int (* (* balance (/ (bigdec tax-free-percentage) 100M)) 2)))))

(comment
  (interest-rate 0)
  (determine-balance-change 0.123M -3.213)
  (annual-balance-update -0.123M)
  (amount-to-donate 550.5M 2.5))
