(ns docx.styles
  (:use 
    [docx write util]))

(defn styles
  [& style-specs]
  ["word/styles.xml"
   (prefix-keywords :w
     `[:styles
        {:xmlns:r "http://schemas.openxmlformats.org/officeDocument/2006/relationships",
         :xmlns:w "http://schemas.openxmlformats.org/wordprocessingml/2006/main"}
        [:docDefaults
         nil
         [:rPrDefault
          nil
          [:rPr
           nil
           [:rFonts {:asciiTheme "minorHAnsi", :eastAsiaTheme "minorHAnsi", :hAnsiTheme "minorHAnsi", :cstheme "minorBidi"}]
           [:sz {:val "22"}]
           [:szCs {:val "22"}]
           [:lang {:val "hu-HU", :eastAsia "en-US", :bidi "ar-SA"}]]]
         [:pPrDefault nil [:pPr nil [:ind {:firstLine "567"}]]]]
        [:latentStyles
         {:defLockedState "0",
          :defUIPriority "99",
          :defSemiHidden "1",
          :defUnhideWhenUsed "1",
          :defQFormat "0",
          :count "267"}
         [:lsdException {:name "Normal", :semiHidden "0", :uiPriority "0", :unhideWhenUsed "0", :qFormat "1"}]
         [:lsdException {:name "heading 1", :semiHidden "0", :uiPriority "9", :unhideWhenUsed "0", :qFormat "1"}]
         [:lsdException {:name "heading 2", :uiPriority "9", :qFormat "1"}]
         [:lsdException {:name "heading 3", :uiPriority "9", :qFormat "1"}]
         [:lsdException {:name "heading 4", :uiPriority "9", :qFormat "1"}]
         [:lsdException {:name "heading 5", :uiPriority "9", :qFormat "1"}]
         [:lsdException {:name "heading 6", :uiPriority "9", :qFormat "1"}]
         [:lsdException {:name "heading 7", :uiPriority "9", :qFormat "1"}]
         [:lsdException {:name "heading 8", :uiPriority "9", :qFormat "1"}]
         [:lsdException {:name "heading 9", :uiPriority "9", :qFormat "1"}]
         [:lsdException {:name "toc 1", :uiPriority "39"}]
         [:lsdException {:name "toc 2", :uiPriority "39"}]
         [:lsdException {:name "toc 3", :uiPriority "39"}]
         [:lsdException {:name "toc 4", :uiPriority "39"}]
         [:lsdException {:name "toc 5", :uiPriority "39"}]
         [:lsdException {:name "toc 6", :uiPriority "39"}]
         [:lsdException {:name "toc 7", :uiPriority "39"}]
         [:lsdException {:name "toc 8", :uiPriority "39"}]
         [:lsdException {:name "toc 9", :uiPriority "39"}]
         [:lsdException {:name "caption", :uiPriority "35", :qFormat "1"}]
         [:lsdException {:name "Title", :semiHidden "0", :uiPriority "10", :unhideWhenUsed "0", :qFormat "1"}]
         [:lsdException {:name "Default Paragraph Font", :uiPriority "1"}]
         [:lsdException {:name "Subtitle", :semiHidden "0", :uiPriority "11", :unhideWhenUsed "0", :qFormat "1"}]
         [:lsdException {:name "Strong", :semiHidden "0", :uiPriority "22", :unhideWhenUsed "0", :qFormat "1"}]
         [:lsdException {:name "Emphasis", :semiHidden "0", :uiPriority "20", :unhideWhenUsed "0", :qFormat "1"}]
         [:lsdException {:name "Table Grid", :semiHidden "0", :uiPriority "59", :unhideWhenUsed "0"}]
         [:lsdException {:name "Placeholder Text", :unhideWhenUsed "0"}]
         [:lsdException {:name "No Spacing", :semiHidden "0", :uiPriority "1", :unhideWhenUsed "0", :qFormat "1"}]
         [:lsdException {:name "Light Shading", :semiHidden "0", :uiPriority "60", :unhideWhenUsed "0"}]
         [:lsdException {:name "Light List", :semiHidden "0", :uiPriority "61", :unhideWhenUsed "0"}]
         [:lsdException {:name "Light Grid", :semiHidden "0", :uiPriority "62", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Shading 1", :semiHidden "0", :uiPriority "63", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Shading 2", :semiHidden "0", :uiPriority "64", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium List 1", :semiHidden "0", :uiPriority "65", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium List 2", :semiHidden "0", :uiPriority "66", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Grid 1", :semiHidden "0", :uiPriority "67", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Grid 2", :semiHidden "0", :uiPriority "68", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Grid 3", :semiHidden "0", :uiPriority "69", :unhideWhenUsed "0"}]
         [:lsdException {:name "Dark List", :semiHidden "0", :uiPriority "70", :unhideWhenUsed "0"}]
         [:lsdException {:name "Colorful Shading", :semiHidden "0", :uiPriority "71", :unhideWhenUsed "0"}]
         [:lsdException {:name "Colorful List", :semiHidden "0", :uiPriority "72", :unhideWhenUsed "0"}]
         [:lsdException {:name "Colorful Grid", :semiHidden "0", :uiPriority "73", :unhideWhenUsed "0"}]
         [:lsdException {:name "Light Shading Accent 1", :semiHidden "0", :uiPriority "60", :unhideWhenUsed "0"}]
         [:lsdException {:name "Light List Accent 1", :semiHidden "0", :uiPriority "61", :unhideWhenUsed "0"}]
         [:lsdException {:name "Light Grid Accent 1", :semiHidden "0", :uiPriority "62", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Shading 1 Accent 1", :semiHidden "0", :uiPriority "63", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Shading 2 Accent 1", :semiHidden "0", :uiPriority "64", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium List 1 Accent 1", :semiHidden "0", :uiPriority "65", :unhideWhenUsed "0"}]
         [:lsdException {:name "Revision", :unhideWhenUsed "0"}]
         [:lsdException {:name "List Paragraph", :semiHidden "0", :uiPriority "34", :unhideWhenUsed "0", :qFormat "1"}]
         [:lsdException {:name "Quote", :semiHidden "0", :uiPriority "29", :unhideWhenUsed "0", :qFormat "1"}]
         [:lsdException {:name "Intense Quote", :semiHidden "0", :uiPriority "30", :unhideWhenUsed "0", :qFormat "1"}]
         [:lsdException {:name "Medium List 2 Accent 1", :semiHidden "0", :uiPriority "66", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Grid 1 Accent 1", :semiHidden "0", :uiPriority "67", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Grid 2 Accent 1", :semiHidden "0", :uiPriority "68", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Grid 3 Accent 1", :semiHidden "0", :uiPriority "69", :unhideWhenUsed "0"}]
         [:lsdException {:name "Dark List Accent 1", :semiHidden "0", :uiPriority "70", :unhideWhenUsed "0"}]
         [:lsdException {:name "Colorful Shading Accent 1", :semiHidden "0", :uiPriority "71", :unhideWhenUsed "0"}]
         [:lsdException {:name "Colorful List Accent 1", :semiHidden "0", :uiPriority "72", :unhideWhenUsed "0"}]
         [:lsdException {:name "Colorful Grid Accent 1", :semiHidden "0", :uiPriority "73", :unhideWhenUsed "0"}]
         [:lsdException {:name "Light Shading Accent 2", :semiHidden "0", :uiPriority "60", :unhideWhenUsed "0"}]
         [:lsdException {:name "Light List Accent 2", :semiHidden "0", :uiPriority "61", :unhideWhenUsed "0"}]
         [:lsdException {:name "Light Grid Accent 2", :semiHidden "0", :uiPriority "62", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Shading 1 Accent 2", :semiHidden "0", :uiPriority "63", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Shading 2 Accent 2", :semiHidden "0", :uiPriority "64", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium List 1 Accent 2", :semiHidden "0", :uiPriority "65", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium List 2 Accent 2", :semiHidden "0", :uiPriority "66", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Grid 1 Accent 2", :semiHidden "0", :uiPriority "67", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Grid 2 Accent 2", :semiHidden "0", :uiPriority "68", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Grid 3 Accent 2", :semiHidden "0", :uiPriority "69", :unhideWhenUsed "0"}]
         [:lsdException {:name "Dark List Accent 2", :semiHidden "0", :uiPriority "70", :unhideWhenUsed "0"}]
         [:lsdException {:name "Colorful Shading Accent 2", :semiHidden "0", :uiPriority "71", :unhideWhenUsed "0"}]
         [:lsdException {:name "Colorful List Accent 2", :semiHidden "0", :uiPriority "72", :unhideWhenUsed "0"}]
         [:lsdException {:name "Colorful Grid Accent 2", :semiHidden "0", :uiPriority "73", :unhideWhenUsed "0"}]
         [:lsdException {:name "Light Shading Accent 3", :semiHidden "0", :uiPriority "60", :unhideWhenUsed "0"}]
         [:lsdException {:name "Light List Accent 3", :semiHidden "0", :uiPriority "61", :unhideWhenUsed "0"}]
         [:lsdException {:name "Light Grid Accent 3", :semiHidden "0", :uiPriority "62", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Shading 1 Accent 3", :semiHidden "0", :uiPriority "63", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Shading 2 Accent 3", :semiHidden "0", :uiPriority "64", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium List 1 Accent 3", :semiHidden "0", :uiPriority "65", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium List 2 Accent 3", :semiHidden "0", :uiPriority "66", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Grid 1 Accent 3", :semiHidden "0", :uiPriority "67", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Grid 2 Accent 3", :semiHidden "0", :uiPriority "68", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Grid 3 Accent 3", :semiHidden "0", :uiPriority "69", :unhideWhenUsed "0"}]
         [:lsdException {:name "Dark List Accent 3", :semiHidden "0", :uiPriority "70", :unhideWhenUsed "0"}]
         [:lsdException {:name "Colorful Shading Accent 3", :semiHidden "0", :uiPriority "71", :unhideWhenUsed "0"}]
         [:lsdException {:name "Colorful List Accent 3", :semiHidden "0", :uiPriority "72", :unhideWhenUsed "0"}]
         [:lsdException {:name "Colorful Grid Accent 3", :semiHidden "0", :uiPriority "73", :unhideWhenUsed "0"}]
         [:lsdException {:name "Light Shading Accent 4", :semiHidden "0", :uiPriority "60", :unhideWhenUsed "0"}]
         [:lsdException {:name "Light List Accent 4", :semiHidden "0", :uiPriority "61", :unhideWhenUsed "0"}]
         [:lsdException {:name "Light Grid Accent 4", :semiHidden "0", :uiPriority "62", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Shading 1 Accent 4", :semiHidden "0", :uiPriority "63", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Shading 2 Accent 4", :semiHidden "0", :uiPriority "64", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium List 1 Accent 4", :semiHidden "0", :uiPriority "65", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium List 2 Accent 4", :semiHidden "0", :uiPriority "66", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Grid 1 Accent 4", :semiHidden "0", :uiPriority "67", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Grid 2 Accent 4", :semiHidden "0", :uiPriority "68", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Grid 3 Accent 4", :semiHidden "0", :uiPriority "69", :unhideWhenUsed "0"}]
         [:lsdException {:name "Dark List Accent 4", :semiHidden "0", :uiPriority "70", :unhideWhenUsed "0"}]
         [:lsdException {:name "Colorful Shading Accent 4", :semiHidden "0", :uiPriority "71", :unhideWhenUsed "0"}]
         [:lsdException {:name "Colorful List Accent 4", :semiHidden "0", :uiPriority "72", :unhideWhenUsed "0"}]
         [:lsdException {:name "Colorful Grid Accent 4", :semiHidden "0", :uiPriority "73", :unhideWhenUsed "0"}]
         [:lsdException {:name "Light Shading Accent 5", :semiHidden "0", :uiPriority "60", :unhideWhenUsed "0"}]
         [:lsdException {:name "Light List Accent 5", :semiHidden "0", :uiPriority "61", :unhideWhenUsed "0"}]
         [:lsdException {:name "Light Grid Accent 5", :semiHidden "0", :uiPriority "62", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Shading 1 Accent 5", :semiHidden "0", :uiPriority "63", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Shading 2 Accent 5", :semiHidden "0", :uiPriority "64", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium List 1 Accent 5", :semiHidden "0", :uiPriority "65", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium List 2 Accent 5", :semiHidden "0", :uiPriority "66", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Grid 1 Accent 5", :semiHidden "0", :uiPriority "67", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Grid 2 Accent 5", :semiHidden "0", :uiPriority "68", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Grid 3 Accent 5", :semiHidden "0", :uiPriority "69", :unhideWhenUsed "0"}]
         [:lsdException {:name "Dark List Accent 5", :semiHidden "0", :uiPriority "70", :unhideWhenUsed "0"}]
         [:lsdException {:name "Colorful Shading Accent 5", :semiHidden "0", :uiPriority "71", :unhideWhenUsed "0"}]
         [:lsdException {:name "Colorful List Accent 5", :semiHidden "0", :uiPriority "72", :unhideWhenUsed "0"}]
         [:lsdException {:name "Colorful Grid Accent 5", :semiHidden "0", :uiPriority "73", :unhideWhenUsed "0"}]
         [:lsdException {:name "Light Shading Accent 6", :semiHidden "0", :uiPriority "60", :unhideWhenUsed "0"}]
         [:lsdException {:name "Light List Accent 6", :semiHidden "0", :uiPriority "61", :unhideWhenUsed "0"}]
         [:lsdException {:name "Light Grid Accent 6", :semiHidden "0", :uiPriority "62", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Shading 1 Accent 6", :semiHidden "0", :uiPriority "63", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Shading 2 Accent 6", :semiHidden "0", :uiPriority "64", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium List 1 Accent 6", :semiHidden "0", :uiPriority "65", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium List 2 Accent 6", :semiHidden "0", :uiPriority "66", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Grid 1 Accent 6", :semiHidden "0", :uiPriority "67", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Grid 2 Accent 6", :semiHidden "0", :uiPriority "68", :unhideWhenUsed "0"}]
         [:lsdException {:name "Medium Grid 3 Accent 6", :semiHidden "0", :uiPriority "69", :unhideWhenUsed "0"}]
         [:lsdException {:name "Dark List Accent 6", :semiHidden "0", :uiPriority "70", :unhideWhenUsed "0"}]
         [:lsdException {:name "Colorful Shading Accent 6", :semiHidden "0", :uiPriority "71", :unhideWhenUsed "0"}]
         [:lsdException {:name "Colorful List Accent 6", :semiHidden "0", :uiPriority "72", :unhideWhenUsed "0"}]
         [:lsdException {:name "Colorful Grid Accent 6", :semiHidden "0", :uiPriority "73", :unhideWhenUsed "0"}]
         [:lsdException {:name "Subtle Emphasis", :semiHidden "0", :uiPriority "19", :unhideWhenUsed "0", :qFormat "1"}]
         [:lsdException {:name "Intense Emphasis", :semiHidden "0", :uiPriority "21", :unhideWhenUsed "0", :qFormat "1"}]
         [:lsdException {:name "Subtle Reference", :semiHidden "0", :uiPriority "31", :unhideWhenUsed "0", :qFormat "1"}]
         [:lsdException {:name "Intense Reference", :semiHidden "0", :uiPriority "32", :unhideWhenUsed "0", :qFormat "1"}]
         [:lsdException {:name "Book Title", :semiHidden "0", :uiPriority "33", :unhideWhenUsed "0", :qFormat "1"}]
         [:lsdException {:name "Bibliography", :uiPriority "37"}]
         [:lsdException {:name "TOC Heading", :uiPriority "39", :qFormat "1"}]]
        [:style
         {:type "paragraph", :default "1", :styleId "Normal"}
         [:name {:val "Normal"}]
         [:qFormat nil]]
        [:style
         {:type "paragraph", :styleId "Heading1"}
         [:name {:val "heading 1"}]
         [:basedOn {:val "Normal"}]
         [:next {:val "Normal"}]
         [:link {:val "Heading1Char"}]
         [:uiPriority {:val "9"}]
         [:qFormat nil]
         [:pPr nil [:keepNext nil] [:keepLines nil] [:spacing {:before "480"}] [:outlineLvl {:val "0"}]]
         [:rPr
          nil
          [:rFonts
           {:asciiTheme "majorHAnsi", :eastAsiaTheme "majorEastAsia", :hAnsiTheme "majorHAnsi", :cstheme "majorBidi"}]
          [:b nil]
          [:bCs nil]
          [:color {:val "365F91", :themeColor "accent1", :themeShade "BF"}]
          [:sz {:val "28"}]
          [:szCs {:val "28"}]]]
        [:style
         {:type "character", :default "1", :styleId "DefaultParagraphFont"}
         [:name {:val "Default Paragraph Font"}]
         [:uiPriority {:val "1"}]
         [:semiHidden nil]
         [:unhideWhenUsed nil]]
        [:style
         {:type "table", :default "1", :styleId "TableNormal"}
         [:name {:val "Normal Table"}]
         [:uiPriority {:val "99"}]
         [:semiHidden nil]
         [:unhideWhenUsed nil]
         [:qFormat nil]
         [:tblPr
          nil
          [:tblInd {:w "0", :type "dxa"}]
          [:tblCellMar
           nil
           [:top {:w "0", :type "dxa"}]
           [:left {:w "108", :type "dxa"}]
           [:bottom {:w "0", :type "dxa"}]
           [:right {:w "108", :type "dxa"}]]]]
        [:style
         {:type "numbering", :default "1", :styleId "NoList"}
         [:name {:val "No List"}]
         [:uiPriority {:val "99"}]
         [:semiHidden nil]
         [:unhideWhenUsed nil]]
        [:style
         {:type "character", :customStyle "1", :styleId "Heading1Char"}
         [:name {:val "Heading 1 Char"}]
         [:basedOn {:val "DefaultParagraphFont"}]
         [:link {:val "Heading1"}]
         [:uiPriority {:val "9"}]
         [:rPr
          nil
          [:rFonts
           {:asciiTheme "majorHAnsi", :eastAsiaTheme "majorEastAsia", :hAnsiTheme "majorHAnsi", :cstheme "majorBidi"}]
          [:b nil]
          [:bCs nil]
          [:color {:val "365F91", :themeColor "accent1", :themeShade "BF"}]
          [:sz {:val "28"}]
          [:szCs {:val "28"}]]]
        [:style
         {:type "table", :styleId "TableGrid"}
         [:name {:val "Table Grid"}]
         [:basedOn {:val "TableNormal"}]
         [:uiPriority {:val "59"}]
         [:tblPr
          nil
          [:tblInd {:w "0", :type "dxa"}]
          [:tblBorders
           nil
           [:top {:val "single", :sz "4", :space "0", :color "000000", :themeColor "text1"}]
           [:left {:val "single", :sz "4", :space "0", :color "000000", :themeColor "text1"}]
           [:bottom {:val "single", :sz "4", :space "0", :color "000000", :themeColor "text1"}]
           [:right {:val "single", :sz "4", :space "0", :color "000000", :themeColor "text1"}]
           [:insideH {:val "single", :sz "4", :space "0", :color "000000", :themeColor "text1"}]
           [:insideV {:val "single", :sz "4", :space "0", :color "000000", :themeColor "text1"}]]
          [:tblCellMar
           nil
           [:top {:w "0", :type "dxa"}]
           [:left {:w "108", :type "dxa"}]
           [:bottom {:w "0", :type "dxa"}]
           [:right {:w "108", :type "dxa"}]]]]
        ~@style-specs])])
