import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * HomeScreen of Game, will have rules option and start game option
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HomeScreen extends World
{
    GreenfootSound mainMusic = new GreenfootSound("mainGameMusic.mp3");
    //trying to make music play once, i give up nothing is working.
    public int total = 0;
    //Change into title Image ex:
    //GreenfootImage gameTitle = new GreenfootImage("images/jimmy_idle.PNG");
    //Label titleLabel = new Label("Moving Day w Jimmy",50);
    /**
     * Constructor for objects of class HomeScreen.
     * 
     */
    public HomeScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 360, 1);
        
        total++;
        //music status
        
        //Game title
        GameTitle title = new GameTitle();
        addObject(title,320,180);
        
        //Start Button
        //StartButton start = new StartButton();
        Button start = new Button("images/start.PNG",new GameScreen());
        addObject(start,180,300);
        
        //Rules Button
        //RulesButton rules = new RulesButton();
        Button rules = new Button("images/rules.PNG",new RuleScreen());
        addObject(rules,450,300);
        
        
        //addObject(titleLabel,getWidth()/2,getHeight()/2);
        //addObject(gameTitle,getWidth()/2,(getHeight()/2)+50);
    }
    /**
     * the main world act loop
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
        playingMusic();
        //change to where they click button to start game
        //Not needed anymore
        /*if(Greenfoot.isKeyDown("space"))
        {
            GameScreen game = new GameScreen();
            Greenfoot.setWorld(game);
        }
        */
    }
}
