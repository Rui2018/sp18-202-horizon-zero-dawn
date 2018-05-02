import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Ground extends Actor
{
    private int speed;
    
    public Ground(int speed)
    {
        
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /10, image.getHeight() /16);
        setImage(image);
        this.speed = speed;
        
    }
    
    
    public void act() 
    {
        moveLeftRight();
    }
    
    
    public void moveLeftRight()
    {
         move(this.speed);
         if(getX() >= getWorld().getWidth() - getImage().getWidth()/2 || getX() <= getImage().getWidth()/2)
         {
             turn(180);
         }       
    }
           
}
