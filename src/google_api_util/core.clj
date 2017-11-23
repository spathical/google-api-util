(ns google-api-util.core
  (:gen-class)
  (:require [environ.core :refer [env]]
            [clojure.tools.cli :refer [parse-opts]]))

(defn make-google-client
  [maps-api-key {:keys [interpolate] :or {interpolate true}}]
  (let [options {:roads {:snap {:url "https://roads.googleapis.com/v1/snapToRoads"
                                :interpolate interpolate}}}]))

(def main-cmd-options
  [["-m" "--maps-api-key GOOGLE-API-KEY" "Google Maps API key"]])

(defn -main [& args]
  (let [{:keys [options arguments]} (parse-opts args main-cmd-options :in-order true)]
    )
