/* 
documentation for simple shapes using BonsaiJS:
http://docs.bonsaijs.org/overview/SimpleShapes.html
*/

// syntax: var cariableName
// declares a variable and the name should be descriptive

// new Rect() creates a rectangle object
// the = assigns that rectangle object
// to the variable myShape

// Rect is a class--a blueprint that defines how all Rectangles behave
// the blueprint says that all rectangles should remember their position and their dimensions

/*
var myShape = new Rect(10, 250, 200, 200);

// once a variable is declared, you can refer to that variable and call methods on it

// varName.methodName(arguments)
// calling the fill method on the myShape variable using "yellow" as the argument
myShape.fill ("yellow");
// stroke(color, thickness)
myShape.stroke("#f00", 2);  
myShape.addTo(stage);

*/

// let's make a happy face
//  eyes will be circles
// the mouth will be an arc
// the nose will be a star

// camelCase is when you make each new word
// a capital letter
// as opposed to snake_case
// SCREAMING_SNAKE_CASE
// kebab-case
var leftEye = new Circle(50, 50, 25);
leftEye.fill ("#F2A18F")
leftEye.stroke("#FF431B", 1);
leftEye.addTo(stage)

var rightEye = new Circle(125, 50, 25);
rightEye.fill ("#F2A18F")
rightEye.stroke("#FF431B", 1);
rightEye.addTo(stage)

var nose = new Star(88, 100, 15, 5);
nose.fill ("red");
nose.stroke("black",1);
nose.addTo(stage);

var mouth = new Arc(80, 165, 40, 2.4, 6, 1);
mouth.fill ("none");
mouth.stroke("black", 1);
mouth.addTo(stage);

var aRect2 = new Rect(0, 200, 150, 150);
aRect2.fill("green");
aRect2.stroke("black", 3);
aRect2.addTo(stage);

//pass Animation instance to animate
// {} in javascript can represent a list

var aAnim = new Animation('1s', {
  x: 150,
  y: -50,
  opacity: 1 // 1.0 is opague, 0.0 is transparent
  fillColor: "red",
  strokeColor: "blue",
  rotation: -Math.PI/2 // in radians
}, {
  repeat: 2
}

});
aRect2.animate(aAnim);