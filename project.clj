(defproject recipes "0.1.0-SNAPSHOT"
  :url "https://github.com/eduardofcbg/recipes"
  :dependencies [[org.clojure/clojure "1.10.0"][hiccup "1.0.5"]]
  :main ^:skip-aot recipes.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :plugins [[lein-cljfmt "0.6.6"]])
