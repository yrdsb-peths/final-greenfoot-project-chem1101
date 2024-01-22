import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Used to create buttons with images that directs to different Worlds
 * 
 * @author Chem
 * @version January 2024
 */
public class Button extends Actor
{
    //variable to store world you want to return to
    private World link;
    
    /**
     * Constructor when making new Button objects
     * 
     * @Param image image that button will have when placed in World
     * @Param link World the button links to when clicked.
     */
    public Button(String image, World link)
    {
        setImage(new GreenfootImage(image));
        this.link = link;
    }
    
    /**
     * Action to perform once mouse clicks image.
     * Once mouse is clicked, you are sent to the World the button
     * is linked to.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(this.link);
        }
    }
}
