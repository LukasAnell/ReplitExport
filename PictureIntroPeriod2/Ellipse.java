import java.awt.*;
import java.awt.geom.*;

/**
 * A circle that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.0  (15 July 2000)
 */

public class Ellipse
{
    private int xDiameter;
    private int yDiameter;
    private int xPosition;
    private int yPosition;
    private int rotation;
    private int transparency;
    private String color;
    private boolean isVisible;

    /**
     * Create a new blue ellipse 30px wide and 40px tall at (0, 0)
     */
    public Ellipse()
    {
        xDiameter = 30;
        yDiameter = 40;
        xPosition = 0;
        yPosition = 0;
        color = "blue";
        isVisible = false;
    }

    public Ellipse(int xDiameter, int yDiameter)
    {
        this.xDiameter = xDiameter;
        this.yDiameter = yDiameter;
        xPosition = 0;
        yPosition = 0;
        color = "blue";
        isVisible = false;
    }
    
    /**
     * Make this circle visible. If it was already visible, do nothing.
     */
    public void makeVisible()
    {
        isVisible = true;
        draw();
    }

    /**
     * Make this circle invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }

    /**
     * Move the circle to the x location.
     */
    public void setX(int x)
    {
        erase();
        xPosition = x;
        draw();
    }
    
    /**
     * Move the circle to the x location.
     */
    public void setY(int y)
    {
        erase();
        yPosition = y;
        draw();
    }
    
    /**
     * Move the circle a few pixels to the right.
     */
    public void moveRight()
    {
        moveHorizontal(20);
    }

    /**
     * Move the circle a few pixels to the left.
     */
    public void moveLeft()
    {
        moveHorizontal(-20);
    }

    /**
     * Move the circle a few pixels up.
     */
    public void moveUp()
    {
        moveVertical(-20);
    }

    /**
     * Move the circle a few pixels down.
     */
    public void moveDown()
    {
        moveVertical(20);
    }

    /**
     * Move the circle horizontally by 'distance' pixels.
     */
    public void moveHorizontal(int distance)
    {
        erase();
        xPosition += distance;
        draw();
    }

    /**
     * Move the circle vertically by 'distance' pixels.
     */
    public void moveVertical(int distance)
    {
        erase();
        yPosition += distance;
        draw();
    }

    /**
     * Slowly move the circle horizontally by 'distance' pixels.
     */
    public void slowMoveHorizontal(int distance)
    {
        int delta;

        if(distance < 0) 
        {
            delta = -1;
            distance = -distance;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distance; i++)
        {
            xPosition += delta;
            draw();
        }
    }

    /**
     * Slowly move the circle vertically by 'distance' pixels.
     */
    public void slowMoveVertical(int distance)
    {
        int delta;

        if(distance < 0) 
        {
            delta = -1;
            distance = -distance;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distance; i++)
        {
            yPosition += delta;
            draw();
        }
    }

    /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     */
    public void changeSize(int newXDiameter, int newYDiameter)
    {
        erase();
        xDiameter = newXDiameter;
        yDiameter = newYDiameter;
        draw();
    }

    /**
     * Change the color. Valid colors are "red", "yellow", "blue", "green",
     * "magenta" and "black".
     */
    public void changeColor(String newColor)
    {
        color = newColor;
        draw();
    }
    
    /**
     * Rotates the object by the given amount of degrees.
     */
    public void rotate(int degrees)
    {
        rotation += degrees;
    }
    
    /**
     * Slowly rotate the circle by 'angle'.
     */
    public void slowRotate(int angle)
    {
        int delta;

        if(angle < 0) 
        {
            delta = -1;
            angle = -angle;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < angle; i++)
        {
            rotation += delta;
            draw();
        }
    }
    
    /**
     * Returns the current rotation of the square.  
     */
    public int getRotation()
    {
        return rotation;
    }
    
    /**
     * Sets the current transparency of the object. Between 0 and 100.
     */
    public void setTransparency(int transparency)
    {
        this.transparency = transparency;
    }
    
    /**
     * Returns the current transparency of the object.
     */
    public int getTransparency()
    {
        return transparency;
    }

    /*
     * Draw the circle with current specifications on screen.
     */
    private void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color, new Ellipse2D.Double(xPosition, yPosition, 
                    xDiameter, yDiameter));
            canvas.wait(10);
        }
    }

    /*
     * Erase the circle on screen.
     */
    private void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}
