import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main Game Screen. This is the city Jimmy Lives in.
 * 
 * @author Chem Ugochukwu
 * @version January 2024
 */
public class GameScreen extends World
{
    
    public GameScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 360, 1,false); 
        
        Jimmy jimmy = new Jimmy();
        addObject(jimmy,60,300);
        
        Furniture furn = new Furniture();
        addObject(furn,60,0);
    }
}
