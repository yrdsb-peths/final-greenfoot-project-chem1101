import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Created because Button Class stopped working and was crashing game..?
 * Rules page came first due to glitch in music!
 * Class enables return to homeScreen.
 * 
 * @author Chem 
 * @version January 2024
 */
public class BackButton extends Actor
{
    public void act()
    {
        //If mouse clicks object, object returns to Home Screen page 
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new HomeScreen());
        }
    }
}
