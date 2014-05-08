(def fib-seq
  ((fn rfib [a b]
     (lazy-seq (cons a (rfib b (+ a b)))))
   0 1)
)

(defn sum [ary]
  (reduce + ary)
)

(let [fibos (take-while (partial > 4000000) fib-seq)]
  (println (sum (filter even? fibos)))
)
