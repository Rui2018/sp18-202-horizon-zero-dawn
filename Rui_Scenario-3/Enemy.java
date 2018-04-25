import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * 
 * @ Rui Guo 
 * @version (a version number or a date)
 */
public class Enemy extends Actor implements Observer
{
    private int X;
    private int Y;
    private int speed = 1;
    /**
     * Act - the Enemies move towards to the jumper, disappears by meeting the bullet.
     */
    public void act() 
    {
        move();
        disappear();
        // Add your action code here.
    }
    
    public void move(){
        //upper-left
        if(getX() <= X && getY() >= Y){
            moveDown();
            moveRight();
        }
        //lower-left
        if(getX() <= X && getY() <= Y){
            moveUp();
            moveRight();
        }
        //upper-right
        if(getX() >= X && getY() >= Y){
            moveDown();
            moveLeft();
        }
        //lower-right
        if(getX() >= X && getY() <= Y){
            moveUp();
            moveLeft();    
        }
       
        
    }
    
    public void moveLeft(){
        setLocation(getX() - speed, getY());
    }
    
    public void moveRight(){
        setLocation(getX() + speed, getY());
    }
    
    public void moveUp(){
        setLocation(getX(), getY() + speed);
    }
    
    public void moveDown(){
        setLocation(getX(), getY() - speed);
    }
    
    public void disappear(){
        Actor bullet = getOneIntersectingObject(Bullet.class);
        if(bullet != null){
            getWorld().removeObject(bullet);
            getWorld().removeObject(this);
        }
    }
    public void update(int x, int y){
        X = x;
        Y = y;
    }
}
