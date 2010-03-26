
Read a docx file or a part of it as parsed xml.

Create xml (using prxml or pre-defined shortcuts) and write it as docx
file.  For example:

    (docx-write
      (document
        (para "Hello, world")))


You can try it executing

    (use 'docx.write)
    (make-sample)

You'll need adam-clojure-contrib to use this package.
