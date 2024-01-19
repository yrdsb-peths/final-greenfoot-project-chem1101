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
        //Making furniture fall downwards
        int x = getX();
        int y = getY() + 2;
        setLocation(x,y);
        
        //Remove furniture and draw game over when furniture hits the floor
        MainGame game = (MainGame) getWorld();
        if(getY() >= game.getHeight())
        {
            game.gameOver();
            game.removeObject(this);
        }
    }
}
