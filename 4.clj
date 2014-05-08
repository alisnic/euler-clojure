(defn palindrome? [n]
  (let [numstr (str n)]
    (= numstr (clojure.string/reverse numstr))
  )
)

(defn next-pair [x y]
  (if (= y 100)
    [(dec x) 999]
    [x (dec y)]
  )
)


(defn find-product [x y]
  (cond
    (and (= x 100) (= y 100)) "HUI"
    (palindrome? (* x y)) (* x y)
    :else (apply find-product (next-pair x y))
  )
)

;(println (next-pair 100 100))
(println (find-product 999 999))
