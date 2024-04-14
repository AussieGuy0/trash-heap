(ns robot-simulator)

(def bearings
  [:north :east :south :west])

(defn index-to-bearing
  [index]
  (nth bearings index))

(defn bearing-to-index
  [bearing]
  (case bearing
    :north 0
    :east 1
    :south 2
    :west 3))

(defn wrap-around
  [number]
  (cond
    (< number 0) 3
    (> number 3) 0
    :else number))

(defn new-bearing
  [current turn]
  (let [current-index (bearing-to-index current)]
    (case turn
      \R (index-to-bearing (wrap-around (inc current-index)))
      \L (index-to-bearing (wrap-around (dec current-index))))))

(defn robot-new-bearing
  [robot turn]
  (let [current-bearing (get robot :bearing)]
    (assoc robot :bearing (new-bearing current-bearing turn))))

(defn advance
  [current-coords bearing]
  (let [{current-x :x
         current-y :y} current-coords]
    (case bearing
      :north {:x current-x :y (inc current-y)}
      :east {:x (inc current-x) :y current-y}
      :south {:x current-x :y (dec current-y)}
      :west {:x (dec current-x) :y current-y})))

(defn robot-advance
  [robot]
  (let [{coordinates :coordinates
         bearing :bearing} robot]
    (assoc robot :coordinates (advance coordinates bearing))))

(defn robot
  [coords bearing]
  {:coordinates coords :bearing bearing})

(defn simulate
  [instructions robot]
  (reduce (fn [acc instruction] (case instruction \A (robot-advance acc)
                                      (robot-new-bearing acc instruction)))
          robot
          (seq instructions)))

(comment
  (simulate "AAAAR" {:coordinates {:x 1 :y 1} :bearing :north})
  (robot-advance {:coordinates {:x 1 :y 1} :bearing :north})
  (advance {:x 1 :y 1} :south)
  (robot-new-bearing {:coordinates {:x 1 :y 1} :bearing :north} "R")
  (wrap-around 4)
  (bearing-to-index :north)
  (new-bearing :west "R"))
