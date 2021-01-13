(ns photon.main)

(js/console.log "aaa")

(let [yay (js/yayQuery)]
  (.sayHello yay (.getMessage yay)))

#_(defn get-canvas-context-from-id
  []
  (let [canvas (.getElementById js/document "canvas")
        ctx (.getContext canvas "2d")
        _ (.drawImage ctx (.getElementById js/document "img") 0 0)
        image (photon/open_image canvas ctx)
        _ (photon/grayscale image)]
    (photon/putImageData canvas ctx image)))

(js/console.log (. js/document hasFocus))


(defn get-canvas-context-from-id
  []
  (let [canvas (.getElementById js/document "canvas")
        ctx (.getContext canvas "2d")
        _ (.drawImage ctx (.getElementById js/document "img") 0 0)
        image (js/open_image canvas ctx)
        _ (js/grayscale image)]
    (js/putImageData canvas ctx image)))

(get-canvas-context-from-id)