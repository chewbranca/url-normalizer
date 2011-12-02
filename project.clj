(defproject url-normalizer "0.4.0"
  :description "Normalizes and standardizes URLs in a consistent manner."
  :min-lein-version "1.6.2"
  :warn-on-reflection true
  :java-source-path "src"
  :dependencies
    [[org.clojure/clojure "1.3.0"]
     [org.clojure/core.incubator "0.1.0"]
     [org.apache.abdera/abdera-i18n "1.1.1" :exclusions
       [commons-codec
        geronimo-activation]]
     [org.apache.httpcomponents/httpclient "4.1" :exclusions
       [commons-logging
        commons-codec]]]
  :dev-dependencies
    [[org.clojars.mmcgrana/lein-javac "1.2.1"]
     [org.clojars.weavejester/autodoc "0.9.0"]
     [lein-clojars "0.7.0"]
     [robert/hooke "1.1.0"]]
  :test-selectors
    {:default (fn [t] (not (:failing t)))
     :failing :failing
     :all (fn [_] true)})
