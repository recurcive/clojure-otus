(ns clojure-otus.homework-1-test
  (:require [clojure.test :refer :all]
            [clojure-otus.homework-1 :refer :all]))

(deftest palidrom-simple-test
  (testing "not palidrom"
    (is (false? (is-palindrom-simple-ver "    is this palindrom? ")))
    (is (false? (is-palindrom-simple-ver "lala")))
    (is (false? (is-palindrom-simple-ver "а роза упала на лапу Барбоса")))
    )

  (testing "palindrom"
    (is (true? (is-palindrom-simple-ver "")))
    (is (true? (is-palindrom-simple-ver " шалаш  ")))
    (is (true? (is-palindrom-simple-ver "abba")))
    (is (true? (is-palindrom-simple-ver "а роза упала на лапу Азора")))
    )
  )


(deftest palidrom--test
  (testing "not palidrom"
    (is (false? (is-palindrom-loop-ver "шалаш1")))
    (is (false? (is-palindrom-loop-ver "alba")))
    (is (false? (is-palindrom-loop-ver "а роза упала на лапу Барбоса")))
    )

  (testing "palindrom"
    (is (true? (is-palindrom-loop-ver "шалаш")))
    (is (true? (is-palindrom-loop-ver "   abba ")))
    (is (true? (is-palindrom-loop-ver "а роза упала на лапу Азора")))
    (is (true? (is-palindrom-loop-ver "а роза упала на лапу азора")))
    )
  )
