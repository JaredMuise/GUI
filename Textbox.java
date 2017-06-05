import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Textbox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Textbox extends Actor
{
    private GreenfootImage img;
    private boolean border = false;
    private int fontSize;
    private Color foreground;
    private Color background;
    
    public Textbox(String message, int fs, boolean b, Color fg, Color bg )
    {
        fontSize = fs;
        border = b;
        foreground = fg;
        background = bg;
        
        img = new GreenfootImage(message, fontSize, foreground, background);
        
        display();
    }
   
    public Textbox(String message)
    {
        img = new GreenfootImage(message, fontSize, foreground, background);
        
        display();
    }
    
    /**
     * display will determine if boarder is true 
     * 
     * @param There are no parameters
     * @return Nothing is returned.
     */
    public void display()
    {
        setImage(img);
        
        if( border == true)
        {
            img.setColor( Color.BLACK );
            img.drawRect(0, 0, img.getWidth()-1, img.getHeight()-1);
            setImage(img);
        }
    }
}
