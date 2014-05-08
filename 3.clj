(ns euler
  (:require clojure.contrib.math))

(defn divisible? [n d]
  (= (rem n d) 0)
)

(defn root-factors [n]
  (loop [candidate n divisor 2 result []]
    (if (= candidate divisor)
      (conj result divisor)
      (if (divisible? candidate divisor)
        (recur (quot candidate divisor) 2 (conj result divisor))
        (recur candidate (inc divisor) result)
      )
    )
  )
)

(reduce max (root-factors 600851475143))
