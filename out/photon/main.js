// Compiled by ClojureScript 1.10.758 {}
goog.provide('photon.main');
goog.require('cljs.core');
console.log("aaa");
var yay_528 = yayQuery();
yay_528.sayHello(yay_528.getMessage());
console.log(document.hasFocus());
photon.main.get_canvas_context_from_id = (function photon$main$get_canvas_context_from_id(){
var canvas = document.getElementById("canvas");
var ctx = canvas.getContext("2d");
var _ = ctx.drawImage(document.getElementById("img"),(0),(0));
var image = open_image(canvas,ctx);
var ___$1 = grayscale(image);
return putImageData(canvas,ctx,image);
});
photon.main.get_canvas_context_from_id.call(null);

//# sourceMappingURL=main.js.map
