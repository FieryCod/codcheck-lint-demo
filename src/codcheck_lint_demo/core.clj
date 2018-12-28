(ns codcheck-lint-demo.core)

(defn some-fn
  ([a b c]
   (if (and (not a) (not b) (not c))
     (println "Whooops!!...")
     nil)))

(defn some-fn
  ([a b c]
   (if (and (not a) (not b) (not c))
     (println "Whooops!!...")
     nil)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (some-fn true true true)
  (println "Hello, World!"))
