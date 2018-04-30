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
    private GreenfootImage img;
    private GreenfootImage img2;
    
    private int textX;
    private int textY;
    
    public Instructions(String instruction, int x, int y)
    {
        
        //newImage = new GreenfootImage(instruction, 18, 
                                                     //Color.BLACK, 
                                                     //new Color(0, 0, 0, 0));
        //setImage(newImage);
        img = new GreenfootImage(400, 60);
        img.setColor(new Color(0, 0, 0, 0));
        img.fill();
        img.setColor(new Color(0, 0, 0, 0));
        img.setFont(new Font("OptimusPrinceps", false, false , 20));
        img.drawString(instruction, 1, 18);
        setImage(img);
        textX = x;
        textY = y;
        
        img2 = new GreenfootImage(400, 60);
        img2.setColor(new Color(0, 0, 0, 0));
        img2.fill();
        img2.setColor(new Color(192, 230, 243));
        img2.setFont(new Font("OptimusPrinceps", false, false , 20));
        img2.drawString(instruction, 1, 18);
        
    }
    
    public void act()
    {
        if (targetX > (textX-220))
        {
            //getWorld().addObject(this, textX, textY);
            this.setImage(img2);
        }
        
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
