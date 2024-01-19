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
    //GreenfootImage running = new GreenfootImage("images/jimmy_run/idle0.PNG");
    GreenfootImage[] runningRight = new GreenfootImage[10];
    GreenfootImage[] runningLeft = new GreenfootImage[10];
    
    //Direction Jimmy is facing
    String facing = "right";
    /**
     * Constructor - The code that gets run one time when object is created
     */
    public Jimmy()
    {
        //part of animating jimmy running (when jimmy is created he's already running)
        for(int i = 0; i<runningRight.length; i++)
        {
            runningRight[i] = new GreenfootImage("images/jimmy_run/idle"+ i+ ".PNG");
            //makes jimmy a bigger person
            runningRight[i].scale(95,105);
        }
        
        for(int i = 0; i<runningLeft.length; i++)
        {
            runningLeft[i] = new GreenfootImage("images/jimmy_run/idle"+ i+ ".PNG");
            runningLeft[i].mirrorHorizontally();
            //makes jimmy a bigger person
            runningLeft[i].scale(95,105);
        }
        setImage(runningRight[0]);
    }
    
    //part of animating jimmy running
    int imageIndex = 0;
    public void animateRunJimmy()
    {
        if(facing.equals("right"))
        {
            setImage(runningRight[imageIndex]);
            //prevents from index getting too big that it surpasses the actual index
            imageIndex = (imageIndex + 1) % runningRight.length;
        }else
        {
            setImage(runningLeft[imageIndex]);
            //prevents from index getting too big that it surpasses the actual index
            imageIndex = (imageIndex + 1) % runningLeft.length;
        }
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-2);
            facing = "left";
        }
        else if(Greenfoot.isKeyDown("Right"))
        {
            move(+2);
            facing = "right";
        }
        //Checking if Jimmy has caught furniture, remove furniture because jimmy caught it.
        take();
        
        //ACTUALLY Animate Jimmy to make him RUn
        animateRunJimmy();
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
