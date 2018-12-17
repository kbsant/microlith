(ns ashikasoft.microlith.core
  (:require
   [ring.adapter.jetty :as jetty]
   [clojure.string :as string])
  (:import java.util.Scanner)
  (:gen-class))

(defn hello-handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello world"})

;; nRepl -- don't enable this in prod!
#_ 
(do
  (require '[nrepl.server :refer [start-server stop-server]])
  (defonce server (start-server :port 7888)))

(defn control-server []
  (let [^Scanner scanner (Scanner. System/in)]
    (loop []
      (let [^String next-line (-> (.nextLine scanner)
                                  (or "")
                                  string/lower-case)]
        (when-not (= "quit" next-line)
          (recur))))))

(defn -main []
  (jetty/run-jetty hello-handler {:port 3000})
  (control-server))
