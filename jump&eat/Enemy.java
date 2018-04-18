import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Enemy extends Actor
{
    
    public void act() 
    {
        moveToJumper();// Add your action code here.
    }
    
    public void moveToJumper()
    {
        Jumper jumper = (Jumper) getWorld().getObjects(Jumper.class).get(0);
        if(getX() < jumper.getX())
        {
            setLocation(getX() + 1, getY());
        }
        if(getX() > jumper.getY())
        {
            setLocation(getX() - 1, getY());
        }
        if(getY() < jumper.getY())
        {
            setLocation(getX(), getY() + 1);
        }
        if(getY() > jumper.getY())
        {
            setLocation(getX(), getY() - 1);
        }
    }
        
}
