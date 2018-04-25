import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //public Bullet(int speed){
       // this.speed = speed;
    
    //}
    
    public void act() 
    {
        move(10);
        disappear();
        // Add your action code here.
    }  
    
    public void disappear(){
        Actor enemy = getOneIntersectingObject(Enemy.class);
        if(enemy != null){
           getWorld().removeObject(enemy);
           getWorld().removeObject(this);
        }
        
        else if(getX() > getWorld().getWidth() - 1){
            getWorld().removeObject(this);
        }
        else if (getX() < 1){
            getWorld().removeObject(this);
        }
        else if(getY() > getWorld().getHeight() - 1){
            getWorld().removeObject(this);
        }
    
    }
}
