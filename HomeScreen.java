import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * HomeScreen of Game, will have rules option and start game option
 * 
 * @author Chem
 * @version January 2024
 */
public class HomeScreen extends World
{
    //music that plays throughout the main game
    GreenfootSound mainMusic = new GreenfootSound("mainGameMusic.mp3");
    //Control variable for when music plays..?(couldnt code properly)
    public int total = 0;
    /**
     * Constructor for objects of class HomeScreen.
     * 
     */
    public HomeScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 360, 1);
        
        //idea:music status (if total > 0, no new music plays)
        total++;
        
        //Game title
        GameTitle title = new GameTitle();
        addObject(title,320,180);
        
        //Start Button on Home screen (takes you to main game)
        Button start = new Button("images/start.PNG",new GameScreen());
        addObject(start,180,300);
        
        //Rules Button on Home screen (takes you to rules page)
        Button rules = new Button("images/rules.PNG",new RuleScreen());
        addObject(rules,450,300);
    }
    /**
     * idea: Check's if music is currently playing then avoids 
     * aka only plays if total = 1(1 = music not playing)
     */
    public void playingMusic()
    {
        if(total == 1)
        {
            mainMusic.play();
            total++;
        }
    }
    
    public void act()
    {
        /*
         * starts playing music for the whole game when on HomeScreen
         * Continues playing music throughout the game
         * Glitch: Music repeats again everytime you revisit HomeScreen
         * ^ not sure how to fix.
         */
        playingMusic();
    }
}
