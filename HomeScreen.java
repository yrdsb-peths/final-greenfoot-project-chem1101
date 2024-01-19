import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * HomeScreen of Game, will have rules option and start game option
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HomeScreen extends World
{
    //Change into title Image ex:
    //GreenfootImage gameTitle = new GreenfootImage("images/jimmy_idle.PNG");
    Label titleLabel = new Label("Moving Day w Jimmy",50);
    /**
     * Constructor for objects of class HomeScreen.
     * 
     */
    public HomeScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 360, 1);
        
        addObject(titleLabel,getWidth()/2,getHeight()/2);
        //addObject(gameTitle,getWidth()/2,(getHeight()/2)+50)
    }
    
    /**
     * the main world act loop
     */
    public void act()
    {
        //change to where they click button to start game
        if(Greenfoot.isKeyDown("space"))
        {
            GameScreen game = new GameScreen();
            Greenfoot.setWorld(game);
        }
    }
}
