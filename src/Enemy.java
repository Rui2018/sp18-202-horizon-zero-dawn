import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Enemy extends Mover implements Observer
{
    private int targetX;
    private int targetY;
    
    public void act() 
    {
        moveToJumper();
        die();
    }
    
    public void update(int x, int y)
    {
        targetX = x;
        targetY = y;
    }
    
    public void moveToJumper()
    {
        //Jumper jumper = (Jumper) getWorld().getObjects(Jumper.class).get(0);
        if(getX() < targetX)
        {
            setLocation(getX() + 1, getY());
        }
        if(getX() > targetX)
        {
            setLocation(getX() - 1, getY());
        }
        if(getY() < targetY)
        {
            setLocation(getX(), getY() + 1);
        }
        if(getY() > targetY)
        {
            setLocation(getX(), getY() - 1);
        }
    }
    
    
    public void die()
    {
        Actor bullet = getOneIntersectingObject(Bullet.class);
        if(bullet != null)
        {
            getWorld().removeObject(bullet);
            getWorld().removeObject(this);
            
        }
    }
        
}
