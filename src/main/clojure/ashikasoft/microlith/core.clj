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
