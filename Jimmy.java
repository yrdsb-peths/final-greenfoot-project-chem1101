import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jimmy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jimmy extends Actor
{
    GreenfootSound jimmyTake = new GreenfootSound("equip.mp3");
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-2);
        }
        else if(Greenfoot.isKeyDown("Right"))
        {
            move(+2);
        }
        //Checking if Jimmy has caught furniture, remove furniture because jimmy caught it.
        take();
    }
    
    //Creates New Furniture and takes away old one if conditions are met (where to add changes
    // for lives code)
    /**
     * Jimmy takes his furniture then a new one appears
     */
    public void take()
    {
        if(isTouching(Furniture.class))
        {
            removeTouching(Furniture.class);
            jimmyTake.play();
            GameScreen game = (GameScreen) getWorld();
            game.createFurn();
            game.increaseScore();
        }
    }
}
