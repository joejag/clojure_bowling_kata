(ns kata2.core)

(def numerals
  {10 "X"
   9 "IX"
   5 "V"
   4 "IV"
   1 "I"})

(defn nearest-numeral
  "Find the nearest interesting roman numeral to a given number
   e.g. 8 => [6 VI]"
  [x]
  (first
   (filter (fn [[a _]] (>= x a)) numerals)))

(defn arabic->roman
  "Convert from an arabic number to roman numeral
   e.g. 8 => VIII"
  ([x]
   (arabic->roman "" x))
  ([s remainder]
   (if (zero? remainder)
     s
     (let [number-nearest (nearest-numeral remainder)
           arabic-numeral (first number-nearest)
           roman-numeral (second number-nearest)]
       (arabic->roman (str s roman-numeral) (- remainder arabic-numeral))))))
