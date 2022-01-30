(ns app.core
  (:require
    [reagent.dom :as rdom]
    [app.db :refer [db]]))

(defn app []
  [:main "Hello world!"])

;; start is called by init and after code reloading finishes
(defn ^:dev/after-load start []
  (rdom/render [app]
               (.getElementById js/document "app")))

(defn init []
  ;; init is called ONCE when the page loads
  ;; this is called in the index.html and must be exported
  ;; so it is available even in :advanced release builds
  (js/console.log "start")
  (start))

;; this is called before any code is reloaded
(defn ^:dev/before-load stop []
  (js/console.log "stop"))
