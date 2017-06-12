import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.List;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UIMainWorld extends World
{
    private boolean onSales;
    
    private SalesItem[] salesItem;
    
    private int numItemsAdded;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public UIMainWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        startScreen();
        
    }
    
    public void startScreen()
    {
        onSales = false;
        salesItem = new SalesItem[50];
        numItemsAdded = 0;
        
        Menu guiMenu = new Menu( "File", "New Sale...\nClose\nExit", 20, Color.BLUE, Color.WHITE, Color.BLUE, Color.WHITE, new FileCommands());
        clearScreen();
        addObject(guiMenu,100,20);
    }
    
    public void salesScreen()
    {
        onSales = true;
        Button timbitAdd = new Button(20, "button-blue.png", "button-green.png", "Add Timbit");
        Button doughnutAdd = new Button(20, "button-blue.png", "button-green.png","Add Doughnut");
        Button coffeeAdd = new Button(20, "button-blue.png", "button-green.png","Add Coffee");
        
        addObject(timbitAdd, 100, 100);
        addObject(doughnutAdd, 100, 200);
        addObject(coffeeAdd, 100, 300);
    }
    
    public void thankYou()
    {
        List objects = getObjects(null);
        onSales = false;
        if(objects != null)
        {
            removeObjects(objects);
        }
        showText("See You Soon", 300, 200);
        Greenfoot.stop();
    }
    
    public void act()
    {
        if(onSales == true)
        {
            calculateSale();
        }
    }
    
    public void calculateSale()
    {
        double finalPrice = 0;
        int numTimbits = 0;
        int numDoughnut = 0;
        int numSmall = 0;
        int numMed = 0;
        int numLarge = 0;
        String numOfItems;
        
        for( int i = 0;salesItem[i] != null && i < salesItem.length; i++ )
        {
            if( salesItem[i] instanceof Timbit )
            {
                numTimbits = salesItem[i].getNumOfItem();
            }
            else if( salesItem[i] instanceof Doughnut)
            {
                numDoughnut = salesItem[i].getNumOfItem();
            }
            else if( salesItem[i] instanceof Coffee)
            {
                if(salesItem[i].getNumOfItem() == 1)
                {
                    numSmall++;
                }
                else if(salesItem[i].getNumOfItem() == 2)
                {
                    numMed++;
                }
                else 
                {
                    numLarge++;
                }
            }
            
            finalPrice += salesItem[i].getFinalPrice();
        }
        
        numOfItems = "Timbits: " + numTimbits + "\nDoughnuts: " + numDoughnut + "\nSmall Coffee: " + numSmall + "\nMedium Coffee" + numMed + "\nLarge Coffee" + numLarge;
        showText(numOfItems + String.format("\nTotal Price: $%5.2f", finalPrice), 300, 200);
    }
    
    public void addItem(SalesItem si)
    {
        salesItem[numItemsAdded] = si;
        numItemsAdded++;
    }
    
    public void clearScreen()
    {
        showText("", 300, 200);
        List objects = getObjects(null);
        
        if( objects != null)
        {
            removeObjects(objects);
        }
    }
}
