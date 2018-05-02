import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Star extends Actor
{
    
    public void act() 
    {
<<<<<<< HEAD
        moveAround();
=======
        moveAround(0);
>>>>>>> FW
        disappear();
        
    }
    
<<<<<<< HEAD
    public void moveAround()
    {
        move(2);
=======
    public void moveAround(int n)
    {
        move(n);
>>>>>>> FW
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
    
<<<<<<< HEAD
=======
    
>>>>>>> FW
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
