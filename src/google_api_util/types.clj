(ns google-api-util.types
  (:require [google-api-util.protocols :refer [Maps]]
            [clj-http.client :as client]
            [clojure.string :as str]))

(deftype Google [api-key options]
  Maps
  (snap-to-road [path]
    {:pre [(not-empty path)]}
    (let [url (-> options :roads :url)
          interpolate (-> options :roads :interpolate)
          path (reduce #(str %1 "|" (str/join "," %2))
                       (str/join "," (first path)) (rest path))]
      (client/get url {:query-params {"key" api-key
                                      "path" path
                                      "interpolate" interpolate}}))))
