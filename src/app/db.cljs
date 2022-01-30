(ns app.db
  (:require [shadow.resource :as rc]
            [reagent.core :as r]))

(def db (r/atom {}))
