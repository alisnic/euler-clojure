(defn mul? [x y]
  (= (mod x y) 0)
)

(defn sum [ary] (reduce + ary))
(defn mul35 [x] (or (mul? x 3) (mul? x 5)))

(println (sum (filter mul35 (range 1 1000))))
