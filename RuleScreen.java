import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Page for recap of rules/ game's background story
 * 
 * @author Chem
 * @version January 2024
 */
public class RuleScreen extends World
{
    //Rule Screen comes first in game due to overall glitch in music
    /**
     * Constructs what the page of the RuleScreen looks like
     * 
     */
    public RuleScreen()
    {    
        super(640, 360, 1); 
        
        //Back Button to return back to homescreen
        BackButton back = new BackButton();
        addObject(back,50,320);
        
    }
    
    public void act()
    {
        
    }
}
