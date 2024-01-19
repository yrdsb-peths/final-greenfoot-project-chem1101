import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main Game Page: Place to actually play the game
 * 
 * @author Chem
 * @version January 2024
 */
public class MainGame extends World
{

    /**
     * Constructor for objects of class MainGame.
     * 
     */
    public MainGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 360, 1); 
        
        //Adding Jimmy to the World
        Jimmy jimmy = new Jimmy();
        addObject(jimmy,50,300);
        
        //Adding furniture
        Furniture furn1 = new Furniture();
        addObject(furn1, 50, 0);
    }
}
