(defproject google-api-util "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main google-api-util.core
  :aot  [google-api-util.core]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [environ "1.1.0"]
                 [clj-http "3.7.0"]
                 [org.clojure/tools.cli "0.3.5"]])
