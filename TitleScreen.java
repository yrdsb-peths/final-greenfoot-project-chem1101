import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main Game. This is where we play the actual game.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //super(1280, 720, 1);
        super(640,360,1);
        
        Jimmy jimmy = new Jimmy();
        addObject(jimmy,100,300);
        
        Furniture furniture1 = new Furniture();
        addObject(furniture1,300,0);
        
        Speed speed = new Speed();
        addObject(speed,200,0);
    }
}
