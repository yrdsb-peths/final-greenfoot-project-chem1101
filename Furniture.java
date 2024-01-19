import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Furniture here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Furniture extends Actor
{
    /**
     * Act - do whatever the Furniture wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x = getX();
        int y = getY() + 2;
        setLocation(x,y);
        
        //Remove apple and draw a game over! CHange to switching to game Over screen
        GameScreen game = (GameScreen) getWorld();
        if(getY() >= game.getHeight())
        {
            game.gameOver();
            game.removeObject(this);
        }
    }
}
