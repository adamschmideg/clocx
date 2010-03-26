(ns docx.write
  (:use 
    [clojure test]
    [clojure.contrib prxml shell-out]
    [acc xml prxml]
    [docx empty util])
  (:require 
    [acc.zipfile :as zipfile]
    [clojure.zip :as zip]
    [clojure.xml :as xml]
    [clojure.walk :as walk]
    [clojure.contrib.str-utils2 :as string]
    [clojure.contrib.duck-streams :as io])
  (:import
    [java.io ByteArrayInputStream File IOException]
    [javax.xml XMLConstants]
    [javax.xml.parsers DocumentBuilderFactory]
    [javax.xml.transform.dom DOMSource]
    [javax.xml.validation Schema SchemaFactory]))

(defn docx-write
  "Write a docx file of entries, for example
    (docx \"/path/to/my-doc\" [\"word/document.xml\" \"<xml...\"])
    Or using document:
    (docx \"/path/to/my-doc\" (document [:p [:r [:t \"Hello\"]]]))
  "
  [file & entries]
  (let [raw-entries (merge *default-xml* (entry-map entries))
        contents (map #(if (vector? %)
                           (with-out-str
                             (prxml %))
                           %)
                      (vals raw-entries))
        all-entries (zipmap (keys raw-entries) contents)]
    (zipfile/write-zip
      (if-not (.endsWith file ".docx")
        (str file ".docx")
        file)
      all-entries)))

(with-test
  (defn rpr
    [& props]
    (vec
      (cons :rPr (make-val-attrs props))))
  (is (= [:rPr :b [:sz {:val 12}]]
         (rpr :b 'sz 12))))

(defn ppr
  [& props]
  (cons :pPr (make-val-attrs props)))
  
(defn para
  ([style content]
    [:p
      [:pPr [:pStyle {:val style}]]
      [:r [:t content]]])
  ([content]
    [:p [:r [:t content]]]))

(defn document
  [& content]
  ["word/document.xml"
    (prefix-keywords :w
      `[:document {:xmlns:w "http://schemas.openxmlformats.org/wordprocessingml/2006/main"}
          [:body
            ~@content
            [:sectPr
              [:pgSz {:w 11906 :h 16838}]
              [:pgMar {:top 1417 :right 1417 :bottom 1417 :left 1417 :header 708 :footer 708 :gutter 0}]
              [:cols {:space 708}]
              [:docGrid {:linePitch 360}]]]])])

(defn char-style
  ([style-name props] (char-style style-name nil props))
  ([style-name based-on props]
    (conj
      (make-val-attrs
        [:style {:type 'character :customStyle 1 :styleId (name style-name)}
            'name style-name 'basedOn based-on 'uiPriority 11])
      props)))

(defn para-style
  [style-name & spec]
  (let [[based-on props] (if (counted? (first spec)) 
                           [nil spec]
                           [(first spec) (rest spec)])]
    (append
      (make-val-attrs
        [:style {:type 'paragraph :customStyle 1 :styleId (name style-name)}
            'name style-name 'basedOn based-on 'uiPriority 11])
      props)))

(defn make-sample
  []
  (docx-write "sample"
    (document
      (para "Heading1" "first")
      (para "second"))))
