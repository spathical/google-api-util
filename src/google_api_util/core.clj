(ns google-api-util.core
  (:gen-class)
  (:require [environ.core :refer [env]]
            [clojure.tools.cli :refer [parse-opts]]))

(defn make-google-client
  [])

(def cli-options
  [["-m" "--maps-api GOOGLE-API-KEY" "Google Maps API key"]])

(defn -main [& args]
  (-> (parse-opts args cli-options)
      (prn)))
