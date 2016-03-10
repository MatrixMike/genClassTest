(ns genClassTest.core
    (:gen-class))

;; (compile 'genClassTest)   

(defn -main
  [greetee]
  (println (str "Hello " greetee "!")))

