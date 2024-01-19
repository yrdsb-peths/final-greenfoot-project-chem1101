import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jimmy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jimmy extends Actor
{
    /**
     * Act - do whatever the Jimmy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-2);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(2);
        }
        
        //Removing Furniture once it's touched
        takeFurn();
        
        //Removing Speed boost once it's touched
        takeSpeed();
    }
    
    //removes and spawns new furniture once caught by jimmy
    public void takeFurn()
    {
        if(isTouching(Furniture.class))
        {
            removeTouching(Furniture.class);
            TitleScreen game = (TitleScreen) getWorld();
            game.createFurn();
        }
    }
    
    public void takeSpeed()
    {
        if(isTouching(Speed.class))
        {
            removeTouching(Speed.class);
            TitleScreen game = (TitleScreen) getWorld();
            game.createSpeed();
        }
    }
}
