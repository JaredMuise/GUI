import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Label here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Label extends Actor
{
    private String value;
    private int fontSize;
    private Color lineColor = Color.BLACK;
    private Color fillColor = Color.WHITE;
    
    
    private final Color TRANSPARENT = new Color(0, 0, 0, 0);
    
    public Label(String v, int fs)
    {
        value = v;
        fontSize = fs;
        
        updateImage();
    }
    
    public Label(int v, int fs)
    {
       this(Integer.toString(v), fs);
    }
    
    /**
     * setValue sets value to new string value and updates the image
     * 
     * @param newValue is a new string that will be shown by the value
     * @return Nothing is returned.
     */
    public void setValue(String newValue)
    {
        value = newValue;
        updateImage();
    }
    
     /**
     * setValue sets value to new interger value and updates the image
     * 
     * @param newValue is a new int that will be shown by the value
     * @return Nothing is returned.
     */
    public void setValue(int newValue)
    {
        value = Integer.toString(newValue);
        updateImage();
    }
    
    /**
     * setlineColor sets the line color with a new color and updates the image
     * 
     * @param newColor is newColor that will be shown by lineColor
     * @return Nothing is returned.
     */
    public void setlineColor(Color newColor)
    {
        lineColor = newColor;
        updateImage();
    }
    
    /**
     * setfillColor fills the color with a new color and updates the image
     * 
     * @param newColor is newColor that will be shown by fillColor
     * @return Nothing is returned.
     */
    public void setfillColor(Color newColor)
    {
        fillColor = newColor;
        updateImage();
    }
    
    /**
     * updateImage updates the image
     * 
     * @param There are no paramters 
     * @return Nothing is returned.
     */
    private void updateImage()
    {
        setImage( new GreenfootImage(value, fontSize, fillColor, TRANSPARENT, lineColor) );
    }
}