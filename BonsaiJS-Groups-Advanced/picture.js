/* 
documentation for simple shapes using BonsaiJS:
http://docs.bonsaijs.org/overview/SimpleShapes.html
*/

// make a group to connect related objects
var rectangles = new Group();

// make 20 rectangles
for(var i = 0; i < 20; i++) {
  var rect = new Rect(i*25, 100, 20, 20);
  rect.fill("green");
  rect.stroke("black", 2);
  rect.addTo(rectangles);
}


// add the group to the stage after

rectangles.addTo(stage)

// doesn't work for color and stroke, but will work for location, opacity, rotation
var aAnim = new Animation('3s', { 
 
  fillColor: 'purple',
  strokeColor: 'red',
  rotation: -Math.PI/2,
  strokeWidth: 5,
  opacity: 0.0  // 0.0 is transparent, 1.0 opaque
}, {
  repeat: 2  // how many extra times to repeat
             // can also be Infinity
});

// this code gets all of the children of the rectangles group (each group member is called a child) and for every element it calls the animate function
// this allows for you to change colors and other things not changeable by a regular group, but won't make everything move together as a group
rectangles.children().forEach((element) => {
  element.animate(aAnim)
})

// this animates movement of the group
rectangles.animate('3s', {
  x: 50
}, {
  repeat: 2
})
 //rectangles.animate(aAnim)