import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends Actor implements Observer
{
    /**
     * Act - do whatever the Instructions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int targetX;
    private int targetY;
    
    private int textX;
    private int textY;
    
    public Instructions(String instruction, int x, int y)
    {
        
        GreenfootImage newImage = new GreenfootImage(instruction, 18, Color.BLACK, 
                                                  new Color(0, 0, 0, 0));
        setImage(newImage);
        textX = x;
        textY = y;
    }
    
    public void act()
    {
        if (targetX > textX)
        {
            getWorld().removeObject(this);
        }
    }
    
    public void update(int x, int y)
    {
        targetX = x;
        targetY = y;
    }
}
