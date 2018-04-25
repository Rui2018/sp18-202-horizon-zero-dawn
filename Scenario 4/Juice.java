import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Juice extends Actor
{
    /**
     * Act - do whatever the Juice wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveAround();
        disappear();
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
    
    public void disappear()
    {
        Actor jumper = getOneIntersectingObject(Jumper.class);
        if(jumper != null)
        {
            getWorld().removeObject(this);
            Greenfoot.playSound("nsmbwiiCoin.wav");
        }
        
    }
}
