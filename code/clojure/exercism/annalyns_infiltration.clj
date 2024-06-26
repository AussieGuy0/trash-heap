(ns annalyns-infiltration)

(defn can-fast-attack?
  "Returns true if a fast-attack can be made, false otherwise."
  [knight-awake?]
  (not knight-awake?))

(defn can-spy?
  "Returns true if the kidnappers can be spied upon, false otherwise."
  [knight-awake? archer-awake? prisoner-awake?]
  (or knight-awake? archer-awake? prisoner-awake?))

(defn can-signal-prisoner?
  "Returns true if the prisoner can be signalled, false otherwise."
  [archer-awake? prisoner-awake?]
  (and (not archer-awake?) prisoner-awake?))

(defn can-free-prisoner?
  "Returns true if prisoner can be freed, false otherwise."
  [knight-awake? archer-awake? prisoner-awake? dog-present?]
  (or
   (and dog-present? (not archer-awake?))
   (and (not dog-present?) prisoner-awake? (not archer-awake?) (not knight-awake?))))

(comment
  (can-free-prisoner? false false true true) ; true
  (can-signal-prisoner? false true) ; true
  (can-spy? true true true) ; true
  (can-fast-attack? true) ; false
  ;
  )
