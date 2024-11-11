
(ns clojure-otus.homework-1
  (:require
   [clojure.string :as str]))

(defn is-palindrom-simple-ver
  "Простая версия функции проверки строка на палиндром"
  [s]
  (let [initial (str/replace (str/lower-case s) #"\s+" "")
        reversed (str/reverse initial)]
    (if (= initial reversed)
      true
      false)))


(defn is-palindrom-loop-ver
  "Рекурсивная версия функции проверки строка на палиндром"
  [raw]
  (let [last-index    (- (count raw) 1)
        processed-str (str/lower-case raw)]
    (loop [left 0 right last-index]
      ;; (println "left -> " left "right -> " right)
      (cond
        (> left right)                                            true
        (= left right)                                            true
        (= (nth processed-str left) \space)                       (recur (inc left) right)
        (= (nth processed-str right) \space)                      (recur left (dec right))
        (not= (nth processed-str left) (nth processed-str right)) false
        :else                                                     (recur (inc left) (dec right))))))

(comment
  (is-palindrom-simple-ver "")
  (is-palindrom-simple-ver "1")
  (false? (is-palindrom-simple-ver "123"))
  (is-palindrom-simple-ver "lala")
  (is-palindrom-simple-ver "шалаш")
  (is-palindrom-simple-ver "а роза упала на лапу Азора")

  (is-palindrom-loop-ver "шалаш1")
  (is-palindrom-loop-ver "шалаш")
  (is-palindrom-loop-ver "abba   ")
  (is-palindrom-loop-ver "abba")
  (is-palindrom-loop-ver "а роза упала на лапу Азора")
  (is-palindrom-loop-ver "а роза упала на лапу азора")

  (nth "  " 0)
)
