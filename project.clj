(defproject elit/dynne "0.4.3"
  :description "A library for working with audio"
  :url "https://github.com/candera/dynne"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[com.googlecode.soundlibs/mp3spi "1.9.5.4"]
                 [hiphip-aot "0.1.2"]
                 [org.clojure/core.async "0.4.474"]
                 [org.clojure/clojure "1.9.0"]
                 [primitive-math "0.1.6"]]
  :java-source-paths ["src/java"]
  :source-paths ["src/clj"]
  :global-vars {*warn-on-reflection* true}
  :profiles {:dev {:source-paths ["dev"]
                   :dependencies [[org.clojure/tools.namespace "0.2.10"]]
                   ;; :jvm-opts ^:replace ["-Xdebug" "-Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=9900"]
                   :jvm-opts ^:replace []}})
