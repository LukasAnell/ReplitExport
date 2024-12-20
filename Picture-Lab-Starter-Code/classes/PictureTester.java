/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test edgeDetect */
  public static void testEdgeDetect() {
      Picture blueMotorcycle = new Picture("blueMotorcycle.jpg");
      blueMotorcycle.explore();
      blueMotorcycle.edgeDetect();
      blueMotorcycle.explore();
  }
  
  /** Method to test pixelate */
  public static void testPixelate() {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.pixelate(10);
      beach.explore();
  }
  
  /** Method to test sineSeparation */
  public static void testSineSeparation() {
      Picture beach = new Picture("beach.jpg");
      Picture blueMotorcycle = new Picture("blueMotorcycle.jpg");
      beach.explore();
      beach.sineSeparation(blueMotorcycle);
      beach.explore();
  }
  
  /** Method to test flowerSeparation */
  public static void testFlowerSeparation() {
      Picture beach = new Picture("beach.jpg");
      Picture blueMotorcycle = new Picture("blueMotorcycle.jpg");
      beach.explore();
      beach.flowerSeparation(blueMotorcycle, 4);
      beach.explore();
  }
    
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue() {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.keepOnlyBlue();
      beach.explore();
  }
  
  /** Method to test negate */
  public static void testNegate() {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.negate();
      beach.explore();
  }
  
  /** Method to test grayscale */
  public static void testGrayscale() {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.grayscale();
      beach.explore();
  }
  
  /** Method to test fixUnderwater */
  public static void testFixUnderwater() {
      Picture water = new Picture("water.jpg");
      water.explore();
      water.fixUnderwater();
      water.explore();
  }
  
  /** Method to test mirrorVerticalRightToLeft */
  public static void testMirrorVerticalRightToLeft() {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.mirrorVerticalRightToLeft();
      beach.explore();
  }
  
  /** Method to test mirrorHorizontal */
  public static void testMirrorHorizontal() {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.mirrorHorizontal();
      beach.explore();
  }
  
  /** Method to test mirrorHorizontalBotToTop */
  public static void testMirrorHorizontalBotToTop() {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.mirrorHorizontalBotToTop();
      beach.explore();
  }
  
  /** Method to test mirrorDiagonal */
  public static void testMirrorDiagonal() {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.mirrorDiagonal();
      beach.explore();
      
      Picture robot = new Picture("robot.jpg");
      robot.explore();
      robot.mirrorDiagonal();
      robot.explore();
  }
  
  /** Method to test mirrorTrueDiagonal */
  public static void testMirrorTrueDiagonal() {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.mirrorTrueDiagonal();
      beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}