
/**
 * This class represents a simple picture.
 * 
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)  ((a) modified 2015-08 by Garrett Shorr, (b) 2016-08 by Leon Montealegre, (c) 2018-08 by Garrett Shorr, (d) 2020-08 by Jared Guiou)
 * (a) added Rectangles
 * (b) added Transparency & Rotation
 * (c) added Ellipses
 * (d) adapted for repl.it
 */
public class Main {
    public static void main(String[] args) {
        Ellipse aubergineExtension = new Ellipse();
        aubergineExtension.changeColor("purple");
        aubergineExtension.changeSize(300, 150);
        aubergineExtension.rotate(-45);
        aubergineExtension.setX(420);
        aubergineExtension.setY(465);
        aubergineExtension.makeVisible();
        
        Triangle knifePoint = new Triangle();
        knifePoint.changeColor("silver");
        knifePoint.changeSize(70, 140);
        knifePoint.rotate(218);
        knifePoint.setX(655);
        knifePoint.setY(515);
        knifePoint.makeVisible();
        
        Rect knifeTop = new Rect();
        knifeTop.changeColor("silver");
        knifeTop.changeSize(60, 250);
        knifeTop.rotate(27);
        knifeTop.setX(409);
        knifeTop.setY(450);
        knifeTop.makeVisible();
        
        Ellipse knifeBlade = new Ellipse();
        knifeBlade.changeColor("silver");
        knifeBlade.changeSize(300, 100);
        knifeBlade.rotate(25);
        knifeBlade.setX(400);
        knifeBlade.setY(450);
        knifeBlade.makeVisible();
        
        Rect palm = new Rect();
        palm.changeColor("yellow");
        palm.changeSize(40, 130);
        palm.rotate(20);
        palm.setX(290);
        palm.setY(335);
        palm.makeVisible();
        
        Rect thumbTwo = new Rect();
        thumbTwo.changeColor("yellow");
        thumbTwo.changeSize(40, 25);
        thumbTwo.rotate(22);
        thumbTwo.setX(375);
        thumbTwo.setY(403);
        thumbTwo.makeVisible();
        
        Rect thumbKnuckle = new Rect();
        thumbKnuckle.changeColor("yellow");
        thumbKnuckle.changeSize(20, 25);
        thumbKnuckle.rotate(-10);
        thumbKnuckle.setX(367);
        thumbKnuckle.setY(427);
        thumbKnuckle.makeVisible();
        
        Rect thumbOne = new Rect();
        thumbOne.changeColor("yellow");
        thumbOne.changeSize(25, 40);
        thumbOne.rotate(22);
        thumbOne.setX(335);
        thumbOne.setY(420);
        thumbOne.makeVisible();
        
        Rect inBetweenThumbAndFingersOne = new Rect();
        inBetweenThumbAndFingersOne.changeColor("dark yellow");
        inBetweenThumbAndFingersOne.changeSize(7, 35);
        inBetweenThumbAndFingersOne.rotate(22);
        inBetweenThumbAndFingersOne.setX(338);
        inBetweenThumbAndFingersOne.setY(421);
        inBetweenThumbAndFingersOne.makeVisible();
        
        Rect inBetweenThumbAndFingersTwo = new Rect();
        inBetweenThumbAndFingersTwo.changeColor("dark yellow");
        inBetweenThumbAndFingersTwo.changeSize(10, 7);
        inBetweenThumbAndFingersTwo.rotate(22);
        inBetweenThumbAndFingersTwo.setX(382);
        inBetweenThumbAndFingersTwo.setY(423);
        inBetweenThumbAndFingersTwo.makeVisible();
        
        Rect inBetweenThumbAndFingersKnuckle = new Rect();
        inBetweenThumbAndFingersKnuckle.changeColor("dark yellow");
        inBetweenThumbAndFingersKnuckle.changeSize(10, 15);
        inBetweenThumbAndFingersKnuckle.rotate(-10);
        inBetweenThumbAndFingersKnuckle.setX(369);
        inBetweenThumbAndFingersKnuckle.setY(425);
        inBetweenThumbAndFingersKnuckle.makeVisible();
        
        Rect knifeHandle = new Rect();
        knifeHandle.changeColor("black");
        knifeHandle.changeSize(50, 180);
        knifeHandle.rotate(27);
        knifeHandle.setX(256);
        knifeHandle.setY(354);
        knifeHandle.makeVisible();
        
        Ellipse knifeHandleEnd = new Ellipse();
        knifeHandleEnd.changeColor("black");
        knifeHandleEnd.changeSize(40, 70);
        knifeHandleEnd.rotate(27);
        knifeHandleEnd.setX(250);
        knifeHandleEnd.setY(316);
        knifeHandleEnd.makeVisible();
        
        Ellipse knifeHandleWhitePart = new Ellipse();
        knifeHandleWhitePart.changeColor("silver");
        knifeHandleWhitePart.changeSize(20, 20);
        knifeHandleWhitePart.rotate(27);
        knifeHandleWhitePart.setX(280);
        knifeHandleWhitePart.setY(340);
        knifeHandleWhitePart.makeVisible();
        
        Rect pinky = new Rect();
        pinky.changeColor("yellow");
        pinky.changeSize(80, 20);
        pinky.rotate(20);
        pinky.setX(290);
        pinky.setY(315);
        pinky.makeVisible();
        
        Rect inBetweenPinkyAndRing = new Rect();
        inBetweenPinkyAndRing.changeColor("dark yellow");
        inBetweenPinkyAndRing.changeSize(80, 10);
        inBetweenPinkyAndRing.rotate(20);
        inBetweenPinkyAndRing.setX(310);
        inBetweenPinkyAndRing.setY(320);
        inBetweenPinkyAndRing.makeVisible();
        
        Rect ringFinger = new Rect();
        ringFinger.changeColor("yellow");
        ringFinger.changeSize(80, 20);
        ringFinger.rotate(20);
        ringFinger.setX(319);
        ringFinger.setY(324);
        ringFinger.makeVisible();
        
        Rect inBetweenRingAndMiddle = new Rect();
        inBetweenRingAndMiddle.changeColor("dark yellow");
        inBetweenRingAndMiddle.changeSize(80, 10);
        inBetweenRingAndMiddle.rotate(20);
        inBetweenRingAndMiddle.setX(337);
        inBetweenRingAndMiddle.setY(330);
        inBetweenRingAndMiddle.makeVisible();
        
        Rect middleFinger = new Rect();
        middleFinger.changeColor("yellow");
        middleFinger.changeSize(80, 20);
        middleFinger.rotate(20);
        middleFinger.setX(345);
        middleFinger.setY(337);
        middleFinger.makeVisible();
        
        Rect betweenMiddleAndIndex = new Rect();
        betweenMiddleAndIndex.changeColor("dark yellow");
        betweenMiddleAndIndex.changeSize(80, 10);
        betweenMiddleAndIndex.rotate(20);
        betweenMiddleAndIndex.setX(365);
        betweenMiddleAndIndex.setY(341);
        betweenMiddleAndIndex.makeVisible();
        
        Rect indexFinger = new Rect();
        indexFinger.changeColor("yellow");
        indexFinger.changeSize(80,20);
        indexFinger.rotate(20);
        indexFinger.setX(372);
        indexFinger.setY(348);
        indexFinger.makeVisible();
        
        Rect inBetweenCover = new Rect();
        inBetweenCover.changeColor("yellow");
        inBetweenCover.changeSize(20, 110);
        inBetweenCover.rotate(22);
        inBetweenCover.setX(297);
        inBetweenCover.setY(330);
        inBetweenCover.makeVisible();
        
        Rect thumbInBetweenTwo = new Rect();
        thumbInBetweenTwo.changeColor("dark yellow");
        thumbInBetweenTwo.changeSize(55, 7);
        thumbInBetweenTwo.rotate(21);
        thumbInBetweenTwo.setX(389);
        thumbInBetweenTwo.setY(372);
        thumbInBetweenTwo.makeVisible();
        
        
        Ellipse aubergineBase = new Ellipse();
        aubergineBase.changeColor("purple");
        aubergineBase.changeSize(180, 160);
        aubergineBase.setX(400);
        aubergineBase.setY(500);
        aubergineBase.makeVisible();
        
        Ellipse aubergineLeafOne = new Ellipse();
        aubergineLeafOne.changeColor("light green");
        aubergineLeafOne.changeSize(80, 35);
        aubergineLeafOne.rotate(-70);
        aubergineLeafOne.setX(620);
        aubergineLeafOne.setY(400);
        aubergineLeafOne.makeVisible();
        
        Triangle aubergineLeafTwo = new Triangle();
        aubergineLeafTwo.changeColor("light green");
        aubergineLeafTwo.changeSize(30, 60);
        aubergineLeafTwo.rotate(0);
        aubergineLeafTwo.setX(630);
        aubergineLeafTwo.setY(405);
        aubergineLeafTwo.makeVisible();
        
        Triangle aubergineLeafThree = new Triangle();
        aubergineLeafThree.changeColor("light green");
        aubergineLeafThree.changeSize(20, 60);
        aubergineLeafThree.rotate(-108);
        aubergineLeafThree.setX(673);
        aubergineLeafThree.setY(435);
        aubergineLeafThree.makeVisible();
        
        Rect aubergineLeafFour = new Rect();
        aubergineLeafFour.changeColor("light green");
        aubergineLeafFour.changeSize(20, 30);
        aubergineLeafFour.rotate(0);
        aubergineLeafFour.setX(630);
        aubergineLeafFour.setY(407);
        aubergineLeafFour.makeVisible();
        
    }
}