(ns docx.util
  (:use 
    [clojure test walk]))

(defn append
  [& vecs]
  (reduce into vecs))

(with-test
  (defn entry-map
    [coll]
    (reduce (fn [acc [k v]] (assoc acc k v)) {} coll))
  (is (= {1 2, 3 4}
         (entry-map [[1 2] [3 4]]))))

(with-test
  (defn find-substr
    [s find]
    (when (and s find)
      (let [pos (.indexOf s find)]
        (if (< pos 0) nil pos))))
  (is (= 1 (find-substr "foo" "o")))
  (is (= nil (find-substr nil "bar")))
  (is (= nil (find-substr "foo" "bar"))))

(with-test
  (defn prefix-keywords
    "Prefix each keyword if it's not already prefixed"
    ([prefix in]
      (postwalk
        #(if (and
               (keyword? %)
               (not (find-substr (name %) ":")))
           (keyword (str (name prefix) ":" (name %)))
           %)
        in)))
  (is (= [:x:foo :y:bar]
         (prefix-keywords :x [:foo :y:bar]))))

(with-test
  (defn make-val-attrs
    "A list containing a consecutive symbol and value become a special
    prxml tag like this
      ['sym 42] => [[:sym {:val 42}]]
    All other items are left unchanged.
    "
    [coll]
    (first
      (reduce
        (fn [[acc key] elem]
          (if key
            (let [new-acc (if elem
                            (conj acc [(keyword key) {:val elem}])
                            acc)]
              [new-acc nil])
            (if (symbol? elem)
              [acc elem]
              [(conj acc elem) nil])))
        [[] nil]  ; [result last-key]
        coll)))
  (is (= [:p :q]
         (make-val-attrs [:p :q])))
  (is (= [:p [:q {:val 42}]]
         (make-val-attrs [:p 'q 42])))
  (is (= [[:p {:val 42}] :q]
         (make-val-attrs ['p 42 :q])))
  (is (= [:p]
         (make-val-attrs [:p 'q nil]))))
