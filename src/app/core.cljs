(ns app.core
  (:require [reagent.dom :as rdom]
            [lambdaisland.fetch :as fetch]))

(defn- invoke-function
  []
  (-> (fetch/post "http://localhost:8888/.netlify/functions/api")
      (.then (fn [resp]
               (js/console.log resp)))))

(defn app
  []
  [:div.py-12.bg-white
    [:div.max-w-7xl.mx-auto.px-4
      [:div.text-center
        [:h2.text-base.text-indigo-600.font-semiboldy.tracking-wide.uppercase "Welcome"]
        [:p.mt-2.text-3xl.leading-8.font-extrabold.tracking-tight.text-gray-900 "Hello, ClojureScript!"]]
      [:div.py-5.text-center
        [:button.bg-indigo-500.hover:bg-indigo-700.text-white.font-bold.py-2.px-4.rounded {:on-click invoke-function} "Trigger Netlify Function"]]]])

(defn start []
  (rdom/render [app] (. js/document (getElementById "app"))))

(defn ^:export init []
  ;; init is called ONCE when the page loads
  ;; this is called in the index.html and must be exported
  ;; so it is available even in :advanced release builds
  (start))

(defn stop []
  ;; stop is called before any code is reloaded
  ;; this is controlled by :before-load in the config
  (js/console.log "stop"))
