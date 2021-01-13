(ns photon.main)

(js/console.log "aaa")

(let [yay (js/yayQuery)];;aca estamos llamando a la funcion que devuelve el objeto yay con un return
  (.sayHello yay (.getMessage yay)));;aca llamamos a la propiedad .sayHello de yay que a su vez es una
                                    ;;funcion que toma como argumento (.getMessage yay) que a su vez es
                                    ;;otra funcion sin argumentos que devuelve "Hello world"

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