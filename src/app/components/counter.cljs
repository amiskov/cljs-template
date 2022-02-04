(ns app.components.counter
  (:require [re-frame.core :as rf]))

(defn counter []
  (let [c @(rf/subscribe [:counter])]
    [:div.mt-12.text-center
     [:h3.font-bold.text-xl "Counter"]
     [:p.mb-4 "(dummy re-frame state)"]
     [:button.btn {:on-click #(rf/dispatch [:update-counter -1])} "-1"]
     [:div.font-bold.inline-block.mx-3 c]
     [:button.btn {:on-click #(rf/dispatch [:update-counter 1])} "+1"]
     [:div.mt-2
      [:button.btn.text-red-500 {:on-click #(rf/dispatch [:reset-counter])} "reset"]]]))

(rf/reg-sub
  :counter
  (fn [db]
    (:counter db)))

(rf/reg-event-db
  :update-counter
  (fn [db [_ n]]
    (update db :counter (partial + n))))

(rf/reg-event-db
  :reset-counter
  (fn [db _]
    (assoc db :counter 0)))
