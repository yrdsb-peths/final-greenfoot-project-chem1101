import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Jimmy's furniture(stuff he needs to catch)
 * 
 * @author Chem 
 * @version January 2024
 */
public class Furniture extends Actor
{
    /**
     * Act - do whatever the Furniture wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //Making apple fall downwards
        setLocation(getX(),getY() + 1);
    }
}
