import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Jimmy's Furniture
 * 
 * @author Chem
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
        setLocation(getX(),getY()+2);
        
        //Remove Furniture and draws game over when apple gets to bottom
        TitleScreen game = (TitleScreen) getWorld();
        if(getY() >= game.getHeight())
        {
            game.gameOver();
            game.removeObject(this);
        }
    }
}
