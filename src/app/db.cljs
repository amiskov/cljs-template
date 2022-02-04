(ns app.db
  (:require [re-frame.core :as rf]))

(def init-db {:counter 0})

(rf/reg-event-db
  :initialize-db
  (fn [_ _]
    init-db))
