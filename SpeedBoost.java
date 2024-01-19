import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpeedBoost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpeedBoost extends Actor
{
    /**
     * Act - do whatever the SpeedBoost wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int speed = 1;
    public void act()
    {
        //Furniture furn = new Furniture();
        //int speed = furn.getSpeed();
        int x = getX();
        int y = getY() + speed;
        setLocation(x,y);
    }
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
