import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Created because Button Class stopped working and was crashing game..?
 * rules page came first due to glitch in music!
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackButton extends Actor
{
    /**
     * Act - do whatever the BackButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new HomeScreen());
        }
    }
}
