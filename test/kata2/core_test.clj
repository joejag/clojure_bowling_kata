(ns kata2.core-test
  (:require [clojure.test :refer [deftest is]]
            [kata2.core :refer [arabic->roman]]))

(deftest conversion
  (is (= "I" (arabic->roman 1)))
  (is (= "II" (arabic->roman 2)))
  (is (= "III" (arabic->roman 3)))
  (is (= "IV" (arabic->roman 4)))
  (is (= "V" (arabic->roman 5)))
  (is (= "VI" (arabic->roman 6)))
  (is (= "VII" (arabic->roman 7)))
  (is (= "VIII" (arabic->roman 8)))
  (is (= "IX" (arabic->roman 9)))
  (is (= "X" (arabic->roman 10))))