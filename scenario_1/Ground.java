import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Ground extends Actor
{
    private int speed;
<<<<<<< HEAD
=======
    // private int size;
>>>>>>> FW
    
    public Ground(int speed)
    {
        
        GreenfootImage image = getImage();
<<<<<<< HEAD
        image.scale(image.getWidth() /10, image.getHeight() /16);
=======
        image.scale(image.getWidth() /8, image.getHeight() /16);
>>>>>>> FW
        setImage(image);
        this.speed = speed;
        
    }
    
    
    public void act() 
    {
        moveLeftRight();
        
<<<<<<< HEAD
        Actor jumper = getOneObjectAtOffset(0,-31,Jumper.class);
=======
        Actor jumper = getOneObjectAtOffset(0,-25,Jumper.class);
>>>>>>> FW
        if (jumper != null) {
            jumper.setLocation(jumper.getX() + speed, jumper.getY() );
        }
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
