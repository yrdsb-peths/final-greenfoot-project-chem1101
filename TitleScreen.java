import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main Game. This is where we play the actual game.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//Actual Game
public class TitleScreen extends World
{
    public int score = 0;
    Label scoreLabel;
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //super(1280, 720, 1);
        super(640,360,1,false);
        
        Jimmy jimmy = new Jimmy();
        addObject(jimmy,100,300);
        
        //Create a Label
        scoreLabel = new Label(0,60);
        addObject(scoreLabel,55,50);
        
        //Adding Lives
        Lives hearts1 = new Lives();
        addObject(hearts1,580,35);
        
        //Creating Furniture and speed boosts
        createFurn();
        createSpeed();
    }
    
    /**
     * End the game once 3 lives are gone
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("game Over",100);
        addObject(gameOverLabel,300,200);
    }
    
    /**
     * Create an a new furniture instance
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    public void createFurn()
    {
        Furniture furniture1 = new Furniture();
        int x = Greenfoot.getRandomNumber(640);
        int y = 0;
        addObject(furniture1,x,y);
    }
    
    /**
     * Add a speed boost into the world
     */
    public void createSpeed()
    {
        Speed speed = new Speed();
        int x = Greenfoot.getRandomNumber(640);
        int y = 0;
        addObject(speed,x,y);
    }

}
