// tail start

var tailOne = new Arc(250, 900, 50, 8, 1, 1)
tailOne.stroke ("#FFBAE3", 10);
tailOne.attr({
  rotation: Math.PI/-2
});
tailOne.addTo(stage);

var tailTwo = new Arc(200, 920, 40, 8, 1, 1)
tailTwo.stroke ("#FFBAE3", 10);
tailTwo.attr({
  rotation: Math.PI/-2
});
tailTwo.addTo(stage);

var tailMid = new Arc(217, 901, 17, 8, 1, 1)
tailMid.stroke ("#FFBAE3", 10);
tailMid.attr({
  rotation: Math.PI/1.9
});
tailMid.addTo(stage);

// tail end

// legs start

var legOne = new Rect(700, 1000, 20, 120)
legOne.fill ("#FFBAE3");
legOne.stroke ("#FFBAE3");
legOne.addTo(stage)

var legTwo = new Rect(400, 1000, 20, 120)
legTwo.fill ("#FFBAE3");
legTwo.stroke ("#FFBAE3");
legTwo.addTo(stage);

// legs end

var armOne = new Rect(900, 620, 15, 250)
armOne.fill ("#FFBAE3");
armOne.stroke ("#FFBAE3");
armOne.attr({
  rotation: Math.PI/-2.8
});
armOne.addTo(stage);

// shoes start

var shoeOne = new Ellipse(735, 1120, 45, 20)
shoeOne.fill ("black");
shoeOne.stroke ("black");
shoeOne.addTo(stage);

var shoeTwo = new Ellipse(435, 1120, 45, 20)
shoeTwo.fill ("black");
shoeTwo.stroke ("black");
shoeTwo.addTo(stage);

// shoes end

// body start

var arcMommy = new Arc (575, 755, 300, -.1, 9.325, 1)
arcMommy.fill ("#ff8f5f");
arcMommy.stroke ('#ED7136', 5);
arcMommy.addTo(stage);

var rectangle = new Rect (275, 773, 600, 250, 6)
rectangle.fill ("#ff8f5f");
rectangle.stroke ('#ED7136', 5);
rectangle.addTo(stage);

// body end

var bodyOver = new Rect (282, 768, 585, 10, 6)
bodyOver.fill ("#ff8f5f");
bodyOver.stroke ("#ff8f5f");
bodyOver.addTo(stage);

var armTwo = new Rect(200, 620, 15, 250)
armTwo.fill ("#FFBAE3");
armTwo.stroke ("#FFBAE3");
armTwo.attr({
  rotation: Math.PI/3
});
armTwo.addTo(stage);

// head

var rightear = new Ellipse(500, 260, 70, 160)
rightear.fill('#FFB2E0')
rightear.stroke("#ED8FC6", 7);
rightear.addTo(stage);
rightear.attr({
 rotation: Math.PI/-10
});
rightear.addTo(stage);
 
var leftear = new Ellipse(650, 230, 70, 160)
leftear.fill('#FFB2E0')
leftear.stroke("#ED8FC6", 7);
leftear.addTo(stage);
leftear.attr({
 rotation: Math.PI/-10
});
leftear.addTo(stage);
 
var face = new Circle(600,400,250)
face.fill('#FFB2E0')
face.stroke("#ED8FC6", 7);
face.addTo(stage)
 
var mouth = new Arc(800,350,70,2,5.6,1)
mouth.fill('#FFB2E0')
mouth.stroke("#ED8FC6", 3);
mouth.addTo(stage);
 
var faceNose = new Ellipse(740, 290, 300, 150)
faceNose.fill('#FFB2E0');
faceNose.stroke("#ED8FC6", 7);
faceNose.attr({
 rotation: Math.PI/19
});
faceNose.addTo(stage);
 
var faceOverlap = new Circle(600,400,243)
faceOverlap.fill('#FFB2E0')
faceOverlap.addTo(stage)
 
var noseoverlap = new Ellipse(910, 310, 130, 120)
noseoverlap.fill('#FFB2E0');
noseoverlap.stroke("#ED8FC6", 7);
noseoverlap.attr({
 rotation: Math.PI/6
});
noseoverlap.addTo(stage);
 
var eye = new Circle(525,240,45)
eye.fill('#FFFFFF')
eye.stroke("#CB8FED", 9);
eye.addTo(stage);
 
var othereye = new Circle(645,220,45)
othereye.fill('#FFFFFF')
othereye.stroke("#CB8FED", 9);
othereye.addTo(stage);
 
var pupil = new Circle(540,240,15)
pupil.fill('#000000')
pupil.stroke("#000000", 7);
pupil.addTo(stage);
 
var otherpupil = new Circle(660,220,15)
otherpupil.fill('#000000')
otherpupil.stroke("#000000", 7);
otherpupil.addTo(stage);
 
var blush = new Circle(480,400,80)
blush.fill('#FF8DD2')
blush.stroke("#FF8DD2", 7);
blush.addTo(stage);
 
var smile = new Arc(680,630,200,2,5.4,1)
smile.fill('#FB2E0')
smile.stroke("#D72783", 6);
smile.addTo(stage);
 
var nostril = new Circle(870,310,25)
nostril.fill('#D568A8')
nostril.stroke("#D568A8", 7);
nostril.addTo(stage);
 
var othernostril = new Circle(950,300,25)
othernostril.fill('#D568A8')
othernostril.stroke("#D568A8", 7);
othernostril.addTo(stage);

// end head

// eyelashes

var eyelashOne = new Rect(480, 180, 5, 35)
eyelashOne.fill ("black");
eyelashOne.stroke ("black");
eyelashOne.attr({
 rotation: Math.PI/-4
});
eyelashOne.addTo(stage);

var eyelashTwo = new Rect(500, 165, 5, 35)
eyelashTwo.fill ("black");
eyelashTwo.stroke ("black");
eyelashTwo.attr({
 rotation: Math.PI/-8
});
eyelashTwo.addTo(stage);

var eyelashThree = new Rect(530, 165, 5, 35)
eyelashThree.fill ("black");
eyelashThree.stroke ("black");
eyelashThree.attr({
 rotation: Math.PI/-20
});
eyelashThree.addTo(stage);


var eyelashFour = new Rect(600, 155, 5, 35)
eyelashFour.fill ("black");
eyelashFour.stroke ("black");
eyelashFour.attr({
 rotation: Math.PI/-4
});
eyelashFour.addTo(stage);

var eyelashFive = new Rect(630, 145, 5, 35)
eyelashFive.fill ("black");
eyelashFive.stroke ("black");
eyelashFive.attr({
 rotation: Math.PI/-9
});
eyelashFive.addTo(stage);

var eyelashSix = new Rect(665, 145, 5, 35)
eyelashSix.fill ("black");
eyelashSix.stroke ("black");
eyelashSix.attr({
 rotation: Math.PI/5.5
});
eyelashSix.addTo(stage);

var eyelashSeven = new Rect(500, 280, 5, 35)
eyelashSeven.fill ("black");
eyelashSeven.stroke ("black");
eyelashSeven.attr({
 rotation: Math.PI/12
});
eyelashSeven.addTo(stage);

var eyelashEight = new Rect(530, 280, 5, 35)
eyelashEight.fill ("black");
eyelashEight.fill ("black");
eyelashEight.attr({
  rotation: Math.PI/1
});
eyelashEight.addTo(stage)

var eyelashNine = new Rect(560, 270, 5, 35)
eyelashNine.fill ("black");
eyelashNine.stroke ("black");
eyelashNine.attr({
  rotation: Math.PI/-6
});
eyelashNine.addTo(stage)

var eyelashTen = new Rect(610, 250, 5, 35)
eyelashTen.fill ("black");
eyelashTen.stroke ("black");
eyelashTen.attr({
  rotation: Math.PI/8
});
eyelashTen.addTo(stage)

var eyelashEleven = new Rect(640, 265, 5, 35)
eyelashEleven.fill ("black");
eyelashEleven.stroke ("black");
eyelashEleven.attr({
  rotation: Math.PI/1
});
eyelashEleven.addTo(stage)

var eyelashTwelve = new Rect(670, 255, 5, 35)
eyelashTwelve.fill ("black");
eyelashTwelve.stroke ("black");
eyelashTwelve.attr({
  rotation: Math.PI/-6
});
eyelashTwelve.addTo(stage)

// end eyelashes

// start fingers

var fingerOne = new Rect(105, 800, 8, 30, 3)
fingerOne.fill ("#FFBAE3");
fingerOne.stroke ("#FFBAE3");
fingerOne.attr({
  rotation: Math.PI/1
});
fingerOne.addTo(stage);

var fingerTwo = new Rect(95, 795, 8, 30, 3)
fingerTwo.fill ("#FFBAE3");
fingerTwo.stroke ("#FFBAE3");
fingerTwo.attr({
  rotation: Math.PI/2.9
});
fingerTwo.addTo(stage);

var fingerThree = new Rect(100, 785, 8, 30, 3)
fingerThree.fill ("#FFBAE3");
fingerThree.stroke ("#FFBAE3");
fingerThree.attr({
  rotation: Math.PI/2
});
fingerThree.addTo(stage);

var fingerFour = new Rect(1010, 798, 8, 30, 3)
fingerFour.fill ("#FFBAE3");
fingerFour.stroke ("#FFBAE3");
fingerFour.attr({
  rotation: Math.PI/1.1
});
fingerFour.addTo(stage);

var fingerFive = new Rect(1020, 790, 8, 30, 3)
fingerFive.fill ("#FFBAE3");
fingerFive.stroke ("#FFBAE3");
fingerFive.attr({
  rotation: Math.PI/-2.7
});
fingerFive.addTo(stage);

var fingerSix = new Rect(1030, 780, 8, 30, 3)
fingerSix.fill ("#FFBAE3");
fingerSix.stroke ("#FFBAE3");
fingerSix.attr({
  rotation: Math.PI/2
});
fingerSix.addTo(stage);

// end fingers