import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Jimmy (Guy who's moving) main character/player of game
 * 
 * @author Chinechem Ugochukwu
 * @version January 2024
 */
public class Jimmy extends Actor
{
    GreenfootSound jimmyCaught = new GreenfootSound("equip.mp3");
    //GreenfootImage moving = new GreenfootImage("images/elephant_idle/idle0.png");
    
    //animation issues (cant load images)
    GreenfootImage[] moving = new GreenfootImage[10];
    
    /**
     * Act - do whatever the Jimmy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Jimmy()
    {
        for(int i = 0;i<moving.length;i++)
        {
            
        }
        setImage(moving[0]);
    }
    /**
     * Animating Jimmy Running
     */
    int imageIndex = 0;
    public void animateJimmy()
    {
        setImage(moving[imageIndex]);
        imageIndex = imageIndex + 1 % moving.length;
        
    }
    
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
        caughtFurn();
        
        //animating Jimmy
    }
    
    public void caughtFurn()
    {
        if(isTouching(Furniture.class))
        {
            removeTouching(Furniture.class);
            jimmyCaught.play();
            MainGame game = (MainGame) getWorld();
            game.createFurn();
            game.increaseScore();
        }
    }
}
