import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Furniture here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Furniture extends Actor
{
    int speed = 1;
    GreenfootImage[] newFurn = new GreenfootImage[6];
    
    GreenfootSound win = new GreenfootSound("win.mp3");
    GreenfootSound lose = new GreenfootSound("wompwomp.mp3");
    
    /**
     * Act - do whatever the Furniture wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Furniture()
    {
        for(int i = 0; i<newFurn.length; i++)
        {
            newFurn[i] = new GreenfootImage("images/furniture/furn"+ i+ ".PNG");
            newFurn[i].scale(60,60);
            //makes jimmy a bigger person
        }
        //animationTimer.mark();
        
        //idle.scale(95,105);
        int num = Greenfoot.getRandomNumber(6);
        setImage(newFurn[num]);
    }
    
    
    public void act()
    {
        /*for(int i = 0; i<newFurn.length; i++)
        {
            newFurn[i] = new GreenfootImage("images\furniture\furn" + i +".PNG");
            //makes jimmy a bigger person
            newFurn[i].scale(95,105);
        }
        int num = Greenfoot.getRandomNumber(6);
        
        setImage(newFurn[num]);
        */
        
        int x = getX();
        int y = getY() + speed;
        setLocation(x,y);
        
        //Remove apple and draw a game over! CHange to switching to game Over screen
        GameScreen game = (GameScreen) getWorld();
        if(getY() >= game.getHeight())
        {
            game.gameOver();
            game.removeObject(this);
            lose.play();
        }
        
        if(game.getScore()==100)
        {
            game.winner();
            game.removeObject(this);
            win.play();
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
    
    public int getSpeed()
    {
        return speed;
    }
}
