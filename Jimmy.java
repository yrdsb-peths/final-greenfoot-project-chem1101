import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Jimmy (Guy who's moving) main character/player of game
 * 
 * @author Chinechem Ugochukwu
 * @version January 2024
 */
public class Jimmy extends Actor
{
    /**
     * Act - do whatever the Jimmy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //moving Jimmy
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(+3);
        }
        
        //remove furniture if jimmy catches it
        caught();
    }
    
    public void caught()
    {
        if(isTouching(Furniture.class))
        {
            removeTouching(Furniture.class);
            MainGame game = (MainGame) getWorld();
            game.createFurn();
            game.increaseScore();
        }
    }
}
