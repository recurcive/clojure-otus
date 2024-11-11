(ns clojure-otus.core
  (:require
   [clojure.string :as str]))

(def symbols (apply str (map char (concat (range 65 91) (range 97 123) (range 48 58)))))

(defn url-shorter [s]
  (apply str (take s (repeatedly #(rand-nth symbols)))))

(comment

  (= \a \a)
  (= (nth " " 0) \space)
  (= (nth "1 " 0) \space)

  (str/reverse (str/lower-case "а роза упала на лапу Азора"))
  (count "lalalal")
  (nth "шалаш" 1)
  (char \0)
  (int \9)
  (int \A)
  (int \Z)
  (int \z)
  (apply str (map char (range 65 91)))
  (apply str (map char (concat (range 65 91) (range 97 123) (range 48 58))))
  (count symbols)

  (url-shorter 19)
  )
