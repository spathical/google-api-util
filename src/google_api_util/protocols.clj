(ns google-api-util.protocols)

(defprotocol Maps
  ;; path is vector of lat lng pairs
  (snap-to-road [path]))
