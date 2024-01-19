import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main Game Page: Place to actually play the game
 * 
 * @author Chem
 * @version January 2024
 */
public class MainGame extends World
{
    public int score = 0;
    Label scoreLabel;
    /**
     * Constructor for objects of class MainGame.
     * 
     */
    public MainGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 360, 1);
        
        //Adding Score Label
        scoreLabel = new Label(0,60);
        addObject(scoreLabel,40,40);
        
        //Adding Jimmy to the World
        Jimmy jimmy = new Jimmy();
        addObject(jimmy,50,300);
        
        //Adding furniture
        createFurn();
        
    }
    /**
     * Increases score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    /**
     * Create a new furniture to spawn in our world once previous one
     * was caught
     */
    public void createFurn()
    {
        Furniture furniture = new Furniture();
        int x = Greenfoot.getRandomNumber(640);
        int y = 0;
        addObject(furniture,x,y);
    }
}
