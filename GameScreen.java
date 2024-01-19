import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main Game Screen. This is the city Jimmy Lives in.
 * 
 * @author Chem Ugochukwu
 * @version January 2024
 */
public class GameScreen extends World
{
    public int score = 0;
    Label scoreLabel;
    int level = 1;
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
    }
    
    /**
     * End game once furniture hits the floor
     */
    //change to when you lose 3 lives, so 3 instances of furniture hitting the floor
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over" , 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score%5 == 0)
        {
            level+=1;
        }
    }
    
    public void createFurn()
    {
        Furniture furn = new Furniture();
        furn.setSpeed(level);
        int x = Greenfoot.getRandomNumber(640);
        int y = 0;
        addObject(furn,x,y);
    }
}
