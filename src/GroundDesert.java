import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GroundDesert here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GroundDesert extends Actor
{
    /**
     * Act - do whatever the GroundDesert wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed;
    
    public GroundDesert(int speed)
    {
        
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /10, image.getHeight() /16);
        setImage(image);
        this.speed = speed;
        
    }
    
    
    public void act() 
    {
        moveLeftRight();
        
        Actor jumper = getOneObjectAtOffset(0,-31,JumperDesert.class);
        if (jumper != null) {
            jumper.setLocation(jumper.getX() + speed, jumper.getY() );
        }
    }
    
    
    public void moveLeftRight()
    {
         move(this.speed);
         if(getX() >= getWorld().getWidth() - getImage().getWidth()/2 || getX() <= getImage().getWidth()/2)
         {
             speed = -speed;
         }       
    }

    public int getGroundSpeed(){
        return speed;
    }    
}
