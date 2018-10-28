(defproject codcheck-lint-demo "0.0.1"
  :description "Demo of codcheck linter"

  :url "https://github.com/FieryCod/codcheck-lint-demo"

  :license {:name "MIT"
            :url "https://opensource.org/licenses/MIT"}

  :dependencies [[org.clojure/clojure "1.10.0-beta4"]]

  :source-paths ["src"]

  :plugins [[lein-bikeshed "0.5.1"]
            [lein-kibit "0.1.6"]
            [lein-shell "0.5.0"]
            [jonase/eastwood "0.2.7"]]

  :aliases {"ci-check" ["do" ["kibit"] ["eastwood"] ["bikeshed"]]})
