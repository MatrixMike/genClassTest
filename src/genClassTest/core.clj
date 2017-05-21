(ns genClassTest.core
    (:gen-class))

;; (compile 'genClassTest)   

(defn -main
  [greetee1 greetee2 ]
  (println (str "Hello " greetee1 " "  greetee2  "!"))
  
  )

;; this could help my sudoku quest {3 input words} - I obviously need to read up on some stuff here
;; could make more useful by detecting that the wrong number of arguments have been supplied and not crash