import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
    ///////////////////// constructors //////////////////////////////////

    /**
     * Constructor that takes no arguments 
     */
    public Picture ()
    {
        /* not needed but use it to show students the implicit call to super()
         * child constructors always call a parent constructor 
         */
        super();  
    }

    /**
     * Constructor that takes a file name and creates the picture 
     * @param fileName the name of the file to create the picture from
     */
    public Picture(String fileName)
    {
        // let the parent class handle this fileName
        super(fileName);
    }

    /**
     * Constructor that takes the width and height
     * @param height the height of the desired picture
     * @param width the width of the desired picture
     */
    public Picture(int height, int width)
    {
        // let the parent class handle this width and height
        super(width,height);
    }

    /**
     * Constructor that takes a picture and creates a 
     * copy of that picture
     * @param copyPicture the picture to copy
     */
    public Picture(Picture copyPicture)
    {
        // let the parent class do the copy
        super(copyPicture);
    }

    /**
     * Constructor that takes a buffered image
     * @param image the buffered image to use
     */
    public Picture(BufferedImage image)
    {
        super(image);
    }

    ////////////////////// methods ///////////////////////////////////////

    /**
     * Method to return a string with information about this picture.
     * @return a string with information about the picture such as fileName,
     * height and width.
     */
    public String toString()
    {
        String output = "Picture, filename " + getFileName() + 
            " height " + getHeight() 
            + " width " + getWidth();
        return output;

    }
    
    /** Method to merge 2 images together with a sine wave separating them */
    public void sineSeparation(Picture secondPicture) {
        Pixel[][] pixels = this.getPixels2D(); // height: 480, width: 640
        Pixel[][] imageTwo = secondPicture.getPixels2D(); // height: 480, width: 640
        
        // y=sinx
        double degrees = 0;
        for(int r = 0; r < pixels.length; r++) {
            for(int c = 0; c < pixels[0].length; c++) {
                double yValue = pixels.length * Math.sin(Math.toRadians(degrees)) / 3;
                /*
                System.out.print("yValue: " + (pixels.length * Math.sin(Math.toRadians(degrees)) / 3));
                System.out.print(" casted yValue: " + yValue);
                System.out.println(" pixels.length / 2 + yValue: " + (pixels.length / 2 + yValue));
                */
                if(r > pixels.length / 2 + yValue) {
                    Pixel currentPixel = imageTwo[r][c];
                    pixels[r][c].setRed(currentPixel.getRed());
                    pixels[r][c].setGreen(currentPixel.getGreen());
                    pixels[r][c].setBlue(currentPixel.getBlue());
                }
                degrees += 0.5;
            }
            degrees = 0;
        }
    }
    
    /** Method to merge 2 images together in the overlaps of sin and cos graphs. */
    public void sinCosSeparation(Picture secondPicture) {
        Pixel[][] pixels = this.getPixels2D(); // height: 480, width: 640
        Pixel[][] imageTwo = secondPicture.getPixels2D(); // height: 480, width: 640
        
        // y = sinx
        // y = cosx
        double degrees = 0;
        for(int r = 0; r < pixels.length; r++) {
            for(int c = 0; c < pixels[0].length; c++) {
                double yValueSin = pixels.length * Math.sin(3 * Math.toRadians(degrees)) / 6;
                double yValueCos = pixels.length * Math.cos(3 * Math.toRadians(degrees)) / 6;
                /*
                System.out.print("yValue: " + (pixels.length * Math.sin(Math.toRadians(degrees)) / 3));
                System.out.print(" casted yValue: " + yValue);
                System.out.println(" pixels.length / 2 + yValue: " + (pixels.length / 2 + yValue));
                */
                if(r > pixels.length / 2 + yValueSin && r < pixels.length / 2 + yValueCos || r < pixels.length / 2 + yValueSin && r > pixels.length / 2 + yValueCos) {
                    Pixel currentPixel = imageTwo[r][c];
                    pixels[r][c].setRed(currentPixel.getRed());
                    pixels[r][c].setGreen(currentPixel.getGreen());
                    pixels[r][c].setBlue(currentPixel.getBlue());
                }
                degrees += 0.5;
            }
            degrees = 0;
        }
    }
    
    /** Method to merge 2 images together in a cotangent graph. */
    public void raySeparation(Picture secondPicture, int amount) {
        Pixel[][] pixels = this.getPixels2D(); // height: 480, width: 640
        Pixel[][] imageTwo = secondPicture.getPixels2D(); // height: 480, width: 640
        
        // y = cotx
        // x = arccot(y)
        
        int originX = pixels[0].length / 2;
        int originY = pixels.length / 2;
        for(int r = 0; r < pixels.length; r++) {
            for(int c = 0; c < pixels[0].length; c++) {
                int currentX = c - originX;
                int currentY = originY - r;
                double theta = Math.atan2(currentY, currentX);
                double yValueCot = pixels.length * (Math.tan(amount * theta));
                if(theta > 0 && theta < Math.PI) {
                    if(r > yValueCot) {
                        Pixel currentPixel = imageTwo[r][c];
                        pixels[r][c].setRed(currentPixel.getRed());
                        pixels[r][c].setGreen(currentPixel.getGreen());
                        pixels[r][c].setBlue(currentPixel.getBlue());
                    }
                }
                
                currentX = c - originX;
                currentY = originY - r;
                theta = Math.atan2(currentY, currentX);
                yValueCot = pixels.length * (Math.tan(amount * theta));
                if(r > yValueCot) {
                        Pixel currentPixel = imageTwo[r][c];
                        pixels[r][c].setRed(currentPixel.getRed());
                        pixels[r][c].setGreen(currentPixel.getGreen());
                        pixels[r][c].setBlue(currentPixel.getBlue());
                }
            }
        }
    }
    
    /** Method to merge 2 images with a spiral shape. */
    public void spiralSeparation(Picture secondPicture) {
        Pixel[][] pixels = this.getPixels2D(); // height: 480, width: 640
        Pixel[][] imageTwo = secondPicture.getPixels2D(); // height: 480, width: 640
        
        // r = theta
        int originX = pixels[0].length / 2;
        int originY = pixels.length / 2;
        for(int r = 0; r < pixels.length; r++) {
            for(int c = 0; c < pixels[0].length; c++) {
                int currentX = c - originX;
                int currentY = originY - r;
                double theta = Math.atan2(currentY, currentX);
                double radiusXY = Math.sqrt(Math.pow(currentX, 2) + Math.pow(currentY, 2));
                double radiusSpiral = Math.min(pixels.length, pixels[0].length) / 5 * theta;
                
                if(radiusXY < radiusSpiral) {
                    Pixel currentPixel = imageTwo[r][c];
                    pixels[r][c].setRed(currentPixel.getRed());
                    pixels[r][c].setGreen(currentPixel.getGreen());
                    pixels[r][c].setBlue(currentPixel.getBlue());
                }
            }
        }
    }
    
    /** Method to merge 2 images with the mandelbrot set. */
    public void mandelbrotSeparation(Picture secondPicture) {
        Pixel[][] pixels = this.getPixels2D(); // height: 480, width: 640
        Pixel[][] imageTwo = secondPicture.getPixels2D(); // height: 480, width: 640
        
        // z_(n + 1) = (z^2)_n + c
        int height = pixels.length;
        int width = pixels[0].length;
        int MAX_ITERATION = 1000;
        for(int r = 0; r < height; r++) {
            for(int c = 0; c < width; c++) {
                double currentX = (c - width + width / 5) * 2.5 / width;
                double currentY = (r - height / 2) * 2.5 / width;
                
                double x = 0;
                double y = 0;
                
                int iteration = 0;
                while(x * x + y * y < 4 && iteration < MAX_ITERATION) {
                    double tempX = x * x - y * y + currentX;
                    y = 2 * x * y + currentY;
                    
                    x = tempX;
                    iteration++;
                }
                
                if(iteration >= MAX_ITERATION) {
                    Pixel currentPixel = imageTwo[r][c];
                    pixels[r][c].setRed(currentPixel.getRed());
                    pixels[r][c].setGreen(currentPixel.getGreen());
                    pixels[r][c].setBlue(currentPixel.getBlue());
                }
            }
        }
    }
    
    /** Method to merge 2 images with a flower separating them. */
    public void flowerSeparation(Picture secondPicture, int petals) {
        Pixel[][] pixels = this.getPixels2D(); // height: 480, width: 640
        Pixel[][] imageTwo = secondPicture.getPixels2D(); // height: 480, width: 640
        
        // r=cos(petals * theta)
        int originX = pixels[0].length / 2;
        int originY = pixels.length / 2;
        for(int r = 0; r < pixels.length; r++) {
            for(int c = 0; c < pixels[0].length; c++) {
                int currentX = c - originX;
                int currentY = originY - r;
                double theta = Math.atan2(currentY, currentX);
                double radiusXY = Math.sqrt(Math.pow(currentX, 2) + Math.pow(currentY, 2));
                double radiusPetal = Math.min(pixels.length, pixels[0].length) / 2 * Math.cos(petals * theta);
                
                /*
                System.out.print("radiusXY: " + radiusXY);
                System.out.print(" radiusPetal: " + radiusPetal);
                System.out.print(" theta: " + theta);
                System.out.println(" row: " + r + " col: " + c);
                */
                
               if(radiusXY < radiusPetal) {
                    Pixel currentPixel = imageTwo[r][c];
                    pixels[r][c].setRed(currentPixel.getRed());
                    pixels[r][c].setGreen(currentPixel.getGreen());
                    pixels[r][c].setBlue(currentPixel.getBlue());
                } else {
                    Pixel currentPixel = pixels[r][c];
                    pixels[r][c].setRed(currentPixel.getRed());
                    pixels[r][c].setGreen(currentPixel.getGreen());
                    pixels[r][c].setBlue(currentPixel.getBlue());
                }
            }
        }
    }
    
    /** Method to detect edges */
    public void edgeDetect() {
        Pixel[][] pixels = this.getPixels2D();
        for(int row = 1; row < pixels.length - 1; row+=2) {
            for(int col = 0; col < pixels[0].length; col++) {
                Pixel currentPixel = pixels[row][col];
                Pixel topPixel = pixels[row - 1][col];
                Pixel botPixel = pixels[row + 1][col];
                int gradThreshold = 18;
                
                int topCurrentRDiff = Math.abs(topPixel.getRed() - currentPixel.getRed());
                int topCurrentGDiff = Math.abs(topPixel.getGreen() - currentPixel.getGreen());
                int topCurrentBDiff = Math.abs(topPixel.getBlue() - currentPixel.getBlue());
                
                int botCurrentRDiff = Math.abs(botPixel.getRed() - currentPixel.getRed());
                int botCurrentGDiff = Math.abs(botPixel.getGreen() - currentPixel.getGreen());
                int botCurrentBDiff = Math.abs(botPixel.getBlue() - currentPixel.getBlue());
                
                int rGrad = (topCurrentRDiff + botCurrentRDiff) / 2;
                int gGrad = (topCurrentGDiff + botCurrentGDiff) / 2;
                int bGrad = (topCurrentBDiff + botCurrentBDiff) / 2;
                System.out.println("rGrad: " + rGrad + " gGrad: " + gGrad + " bGrad: " + gGrad);
                
                if((rGrad + gGrad + bGrad) / 3 > gradThreshold) {
                    pixels[row][col].setRed(rGrad);
                    pixels[row][col].setGreen(gGrad);
                    pixels[row][col].setBlue(bGrad);
                }
            }
        }
        
        for(int col = 1; col < pixels[0].length - 1; col+=2) {
            for(int row = 0; row < pixels.length; row++) {
                Pixel currentPixel = pixels[row][col];
                Pixel leftPixel = pixels[row][col - 1];
                Pixel rightPixel = pixels[row][col + 1];
                int gradThreshold = 18;
                
                int leftCurrentRDiff = Math.abs(leftPixel.getRed() - currentPixel.getRed());
                int leftCurrentGDiff = Math.abs(leftPixel.getGreen() - currentPixel.getGreen());
                int leftCurrentBDiff = Math.abs(leftPixel.getBlue() - currentPixel.getBlue());
                
                int rightCurrentRDiff = Math.abs(rightPixel.getRed() - currentPixel.getRed());
                int rightCurrentGDiff = Math.abs(rightPixel.getGreen() - currentPixel.getGreen());
                int rightCurrentBDiff = Math.abs(rightPixel.getBlue() - currentPixel.getBlue());
                
                int rGrad = (leftCurrentRDiff + rightCurrentRDiff) / 2;
                int gGrad = (leftCurrentGDiff + rightCurrentGDiff) / 2;
                int bGrad = (leftCurrentBDiff + rightCurrentBDiff) / 2;
                // System.out.println("rGrad: " + rGrad + " gGrad: " + gGrad + " bGrad: " + gGrad);

                if((rGrad + gGrad + bGrad) / 3 > gradThreshold) {
                    pixels[row][col].setRed(rGrad);
                    pixels[row][col].setGreen(gGrad);
                    pixels[row][col].setBlue(bGrad);
                }
            }
        }
        this.grayscale();
        // this.blend();
    }
    
    /** Method to blend an image */
    public void blend() {
        Pixel[][] pixels = this.getPixels2D();
        for(int row = 0; row < pixels.length - 1; row+=2) {
            for(int col = 0; col < pixels[0].length - 1; col+=2) {
                Pixel currentPixel = pixels[row][col];
                Pixel rightPixel = pixels[row][col + 1];
                Pixel botPixel = pixels[row + 1][col];
                Pixel botRightPixel = pixels[row + 1][col + 1];
                
                int averageR = (rightPixel.getRed() + botPixel.getRed() + botRightPixel.getRed()) / 8;
                int averageG = (rightPixel.getGreen() + + botPixel.getGreen() + botRightPixel.getGreen()) / 8;
                int averageB = (rightPixel.getBlue() + botPixel.getBlue() + botRightPixel.getBlue()) / 8;
                
                currentPixel.setRed(averageR);
                currentPixel.setGreen(averageG);
                currentPixel.setBlue(averageB);
            }
        }
    }
    
    /** Method to pixelate an image based on an input value */
    public void pixelate(int degree) {
        Pixel[][] pixels = this.getPixels2D();
        for(int r = 0; r < pixels.length - degree; r+=degree) {
            for(int c = 0; c < pixels[0].length - degree; c+=degree) {
                int rSum = 0;
                int gSum = 0;
                int bSum = 0;
                
                for(int i = 0; i < degree; i++) {
                    for(int j = 0; j < degree; j++) {
                        rSum += pixels[r + i][c + j].getRed();
                        gSum += pixels[r + i][c + j].getGreen();
                        bSum += pixels[r + i][c + j].getBlue();
                    }
                }
                int rAverage = rSum / (int) Math.pow(degree, 2);
                int gAverage = gSum / (int) Math.pow(degree, 2);
                int bAverage = bSum / (int) Math.pow(degree, 2);
                for(int i = 0; i < degree; i++) {
                    for(int j = 0; j < degree; j++) {
                        pixels[r + i][c + j].setRed(rAverage);
                        pixels[r + i][c + j].setGreen(gAverage);
                        pixels[r + i][c + j].setBlue(bAverage);
                    }
                }
            }
        }
    }

    /** Method to set the blue to 0 */
    public void zeroBlue()
    {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setBlue(0);
            }
        }
    }

    /** Method to set green and red to 0 */
    public void keepOnlyBlue() {
        Pixel[][] pixels = this.getPixels2D();
        for(Pixel[] rowArray : pixels) {
            for(Pixel pixelObj : rowArray) {
                pixelObj.setRed(0);
                pixelObj.setGreen(0);
            }
        }
    }

    /** Method to negate all rgb values */
    public void negate() {
        Pixel[][] pixels = this.getPixels2D();
        for(Pixel[] rowArray : pixels) {
            for(Pixel pixelObj : rowArray) {
                pixelObj.setRed(255 - pixelObj.getRed());
                pixelObj.setGreen(255 - pixelObj.getGreen());
                pixelObj.setBlue(255 - pixelObj.getBlue());
            }
        }
    }

    /** Method to set rgb to grayscale */
    public void grayscale() {
        Pixel[][] pixels = this.getPixels2D();
        for(Pixel[] rowArray : pixels) {
            for(Pixel pixelObj : rowArray) {
                int average = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue()) / 3;
                pixelObj.setRed(average);
                pixelObj.setGreen(average);
                pixelObj.setBlue(average);
            }
        }
    }

    /** Method to fix water.jpg */
    public void fixUnderwater() {
        Pixel[][] pixels = this.getPixels2D();
        for(Pixel[] rowArray : pixels) {
            for(Pixel pixelObj : rowArray) {
                pixelObj.setBlue(pixelObj.getBlue() / 2);
                pixelObj.setGreen(pixelObj.getGreen() / 2);
                pixelObj.setRed(pixelObj.getRed() * 2);

            }
        }
    }

    /** Method to mirror vertically from right to left */
    public void mirrorVerticalRightToLeft() {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for(int row = 0; row < pixels.length; row++) {
            for(int col = 0; col < width / 2; col++) {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][width - 1 - col];
                leftPixel.setColor(rightPixel.getColor());
            }
        }
    }

    /** Method to mirror horizontally */
    public void mirrorHorizontal() {
        Pixel[][] pixels = this.getPixels2D();
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        int height = pixels.length;
        for(int col = 0; col < pixels[0].length; col++) {
            for(int row = 0; row < height; row++) {
                topPixel = pixels[row][col];
                bottomPixel = pixels[height - 1 - row][col];
                bottomPixel.setColor(topPixel.getColor());
            }
        }
    }

    /** Method to mirror horizontally bottom to top */
    public void mirrorHorizontalBotToTop() {
        Pixel[][] pixels = this.getPixels2D();
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        int height = pixels.length;
        for(int col = 0; col < pixels[0].length; col++) {
            for(int row = 0; row < height / 2; row++) {
                topPixel = pixels[row][col];
                bottomPixel = pixels[height - 1 - row][col];
                topPixel.setColor(bottomPixel.getColor());
            }
        }
    }

    /** Method to mirror diagonally */
    public void mirrorDiagonal() {
        Pixel[][] pixels = this.getPixels2D();
        Pixel bottomLeftPixel = null;
        Pixel topRightPixel = null;
        int height = pixels.length;
        int width = pixels[0].length;
        int smaller = Math.min(height, width);
        for(int row = 0; row < smaller; row++) {
            for(int col = row; col < smaller; col++) {
                bottomLeftPixel = pixels[row][col];
                topRightPixel = pixels[col][row];
                bottomLeftPixel.setColor(topRightPixel.getColor());
            }
        }
    }
    
    /** Method to mirror diagonally along true diagonal */
    public void mirrorTrueDiagonal() {
        Pixel[][] pixels = this.getPixels2D();
        Pixel bottomLeftPixel = null;
        Pixel topRightPixel = null;
        int height = pixels.length; // 480
        int width = pixels[0].length; //640
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        double slope = height / (double) width;
        System.out.println("Slope: " + slope);
        // y = slope * x + height
        // x = (y - height) / slope
        for(int row = 0; row < height; row++) {
            System.out.println("Row: " + row);
            int x = (int) ((height - row) / slope);
            System.out.println("x: " + x);
            System.out.println("abs(x - width): " + Math.abs(x - width));
            /**
            if(Math.abs(x - width) > height) {
                System.out.println("col: " + Math.abs(x - width) + " height: " + height);
            }
            */
            for(int col = Math.abs(x - width); col < width; col++) {
                System.out.println("Row: " + row + ", Col: " + col);
                bottomLeftPixel = pixels[row][col];
                topRightPixel = pixels[col][row];
                bottomLeftPixel.setColor(topRightPixel.getColor());
            }
            System.out.println();
        }
    }

    /** Method that mirrors the picture around a 
     * vertical mirror in the center of the picture
     * from left to right */
    public void mirrorVertical() {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; col < width / 2; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][width - 1 - col];
                rightPixel.setColor(leftPixel.getColor());
            }
        } 
    }

    /** Mirror just part of a picture of a temple */
    public void mirrorTemple()
    {
        int mirrorPoint = 276;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int count = 0;
        Pixel[][] pixels = this.getPixels2D();

        // loop through the rows
        for (int row = 27; row < 97; row++)
        {
            // loop from 13 to just before the mirror point
            for (int col = 13; col < mirrorPoint; col++)
            {

                leftPixel = pixels[row][col];      
                rightPixel = pixels[row]                       
                [mirrorPoint - col + mirrorPoint];
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }

    /** copy from the passed fromPic to the
     * specified startRow and startCol in the
     * current picture
     * @param fromPic the picture to copy from
     * @param startRow the start row to copy to
     * @param startCol the start col to copy to
     */
    public void copy(Picture fromPic, 
    int startRow, int startCol)
    {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = fromPic.getPixels2D();
        for (int fromRow = 0, toRow = startRow; 
        fromRow < fromPixels.length &&
        toRow < toPixels.length; 
        fromRow++, toRow++)
        {
            for (int fromCol = 0, toCol = startCol; 
            fromCol < fromPixels[0].length &&
            toCol < toPixels[0].length;  
            fromCol++, toCol++)
            {
                fromPixel = fromPixels[fromRow][fromCol];
                toPixel = toPixels[toRow][toCol];
                toPixel.setColor(fromPixel.getColor());
            }
        }   
    }

    /** Method to create a collage of several pictures */
    public void createCollage()
    {
        Picture flower1 = new Picture("flower1.jpg");
        Picture flower2 = new Picture("flower2.jpg");
        this.copy(flower1,0,0);
        this.copy(flower2,100,0);
        this.copy(flower1,200,0);
        Picture flowerNoBlue = new Picture(flower2);
        flowerNoBlue.zeroBlue();
        this.copy(flowerNoBlue,300,0);
        this.copy(flower1,400,0);
        this.copy(flower2,500,0);
        this.mirrorVertical();
        this.write("collage.jpg");
    }

    /** Method to show large changes in color 
     * @param edgeDist the distance for finding edges
     */
    public void edgeDetection(int edgeDist)
    {
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Pixel[][] pixels = this.getPixels2D();
        Color rightColor = null;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; 
            col < pixels[0].length-1; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][col+1];
                rightColor = rightPixel.getColor();
                if (leftPixel.colorDistance(rightColor) > 
                edgeDist)
                    leftPixel.setColor(Color.BLACK);
                else
                    leftPixel.setColor(Color.WHITE);
            }
        }
    }

    /* Main method for testing - each class in Java can have a main 
     * method 
     */
    public static void main(String[] args) 
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

} // this } is the end of class Picture, put all new methods before this
