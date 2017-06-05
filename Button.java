import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Buttom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private int fontSize;
    private String firstImage;
    private String secondImage;
    private GreenfootImage text1;
    private GreenfootImage text2;
    
    public Button( int fs, String f, String s, String t)
    {
        fontSize = fs;
        firstImage = f;
        secondImage = s;
        
        text1 = new GreenfootImage(t, fontSize, Color.WHITE, new Color(0, 0, 0, 0));
        text2 = new GreenfootImage(t, fontSize, Color.BLACK, new Color(0, 0, 0, 0));
        
        setImage(firstImage);
        getImage().drawImage(text1,(getImage().getWidth() - text1.getWidth())/2, (getImage().getHeight() - text1.getHeight())/2); 
    }
   
    public Button( String f, String s)
    {
        firstImage = f;
        secondImage = s;
        
        setImage(firstImage);
        getImage().drawImage(text1,(getImage().getWidth() - text1.getWidth())/2, (getImage().getHeight() - text1.getHeight())/2);
    }
    
    /**
     * Act - do whatever the Buttom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        handleMouseClicks();
    }
    
    /**
     * handleMouseClicks determines if the mouse is clicked or pressed to change the button image.
     * 
     * @param There are no parameters
     * @return Nothing is returned.
     */
    private void handleMouseClicks()
    {
        if(Greenfoot.mousePressed( this ) )
        {
            setImage( secondImage );
            
            getImage().drawImage(text2, (getImage().getWidth() - text2.getWidth())/2, (getImage().getHeight() - text2.getHeight())/2);
        }
        else if( Greenfoot.mouseClicked( this ) )
        {
            setImage( firstImage );
            
            getImage().drawImage(text1, (getImage().getWidth() - text1.getWidth())/2, (getImage().getHeight() - text1.getHeight())/2);
        }
    }
    
    private void clickedAction()
    {
        
    }
}
