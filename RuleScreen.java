import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RuleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RuleScreen extends World
{
    //Rule Screen came first due to glitch in Music
    /**
     * Constructor for objects of class RuleScreen.
     * 
     */
    public RuleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 360, 1); 
        Label home = new Label("Press spacebar to go back.", 30);
        addObject(home,175,320);
        
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            HomeScreen home = new HomeScreen();
            Greenfoot.setWorld(home);
        }
    }
}
