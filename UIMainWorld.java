import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UIMainWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public UIMainWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        testActors();
    }
    
   /**
     * testActors will add the objects to the world 
     * 
     * @param There are no parameters
     * @return Nothing is returned
     */
    public void testActors()
    {
        addObject( new Menu("file", "New\nOpen\nSave\nClose\nExit", 17, Color.BLACK, Color.WHITE, Color.BLACK, Color.WHITE, new FileCommands()), 100, 34 );
        addObject( new Button(20, "button-blue.png", "button-green.png", ""), 150, 34 );
        addObject( new Label("SSBKX20", 20), 250, 34 );
        addObject( new Textbox("Distructo Disc", 40, true, Color.BLACK, Color.RED), 395, 34 );
    }
}
