import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Ground extends Actor
{
    
    
    public Ground()
    {
        
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /10, image.getHeight() /10);
        setImage(image);
        
    }
    
    public void act() 
    {
        moveLeftRight(0);
    } 
    
    public void moveLeftRight(int speed)
    {
        move(speed);
        
        if(getX() >= getWorld().getWidth() - getImage().getWidth()/2 || getX() <= getImage().getWidth()/2)
        {
            turn(180);
        }
    }
            
}
