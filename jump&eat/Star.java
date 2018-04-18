import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Star extends Actor
{
    
    public void act() 
    {
        moveAround();// Add your action code here.
    }
    
    public void moveAround()
    {
        move(2);
        if(Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if(getX() <= 5 || getX() >= getWorld().getWidth() - 5)
        {
            turn(180);
        }
        if(getY() <= 5 || getY() >= getWorld().getHeight() - 5)
        {
            turn(180);
        }
    }
}
