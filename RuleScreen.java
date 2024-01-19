import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RuleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RuleScreen extends World
{

    /**
     * Constructor for objects of class RuleScreen.
     * 
     */
    public RuleScreen()
    {    
        super(640, 360, 1); 
        
        Button back = new Button("images/back.png",new HomeScreen());
        addObject(back,180,300);
        
    }
}
