import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Bullet extends Mover
{
    
    
    
    public void act() 
    {
        move(10);
        remove();
        //setLocation(getX() + 5, getY());
       
    } 
    
    
    
    
    
    public void remove()
    {
        if(getX() >= getWorld().getWidth() - 1)
        {
            getWorld().removeObject(this);
        }
        else if(getX() < 1)
        {
            getWorld().removeObject(this);
        }
        else if(getY() >= getWorld().getHeight() - 1)
        {
            getWorld().removeObject(this);
        }
        else if(getY() < 1)
        {
            getWorld().removeObject(this);
        }
    }
    
}
