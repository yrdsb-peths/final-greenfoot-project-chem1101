import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main Game Screen. This is the city Jimmy Lives in.
 * 
 * @author Chem Ugochukwu
 * @version January 2024
 */
public class GameScreen extends World
{
    //used to track score
    public int score = 0;
    Label scoreLabel;
    
    //used to track level (increases speed of furniture ++ each level)
    int level = 1;
    //used to increase speed of Speed Boost
    int speedBar = 1;
    public GameScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 360, 1,false); 
        
        //Creates Jimmy
        Jimmy jimmy = new Jimmy();
        addObject(jimmy,60,300);
        
        //Creating a Score Label
        scoreLabel = new Label(0,55);
        addObject(scoreLabel,40,40);
        
        //Spawns Furniture/Creates Furniture
        createFurn();
        //Spawns SpeedBoost
        createSpeedBoost();
        
        
    }
    
    /**
     * Text for when you lose
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over" , 100);
        addObject(gameOverLabel, 300, 200);
    }
    /**
     * Text for when you win
     */
    public void winner()
    {
        Label gameOverLabel = new Label("YOU WIN" , 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    /**
     * Code to increase score + level + speed of speed boost.
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score%5 == 0)
        {
            level+=1;
        }
        
        if(score%2 == 0)
        {
            speedBar+=1;
        }
    }
    
    /**
     * Creates new furniture, sets speed of new furniture
     * + places furniture in random spot on the top
     * of the screen.
     */
    public void createFurn()
    {
        Furniture furn = new Furniture();
        furn.setSpeed(level);
        int x = Greenfoot.getRandomNumber(640);
        int y = 0;
        addObject(furn,x,y);
    }
    
    /**
     * Creates speed boost, sets speed of speed boost to level 
     * (instead of speedBar)
     */
    public void createSpeedBoost()
    {
        SpeedBoost speedy = new SpeedBoost();
        speedy.setSpeed(level);
        int x = Greenfoot.getRandomNumber(640);
        int y = 0;
        addObject(speedy,x,y);
    }
    
    /**
     * getter method for the variable int score
     */
    public int getScore()
    {
        return score;
    }
}
