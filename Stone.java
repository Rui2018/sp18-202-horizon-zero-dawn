import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stone here.
 * When meet the stone, the jumper will die.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stone extends Actor
{
    private int speed = 5;
    /**
     * Act - do whatever the Stone wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    //public Stone(int speed){
        //this.speed = speed;
    //}
    
    public void act() 
    {
        setRotation(90);
        move(speed);
        disappear();
        // Add your action code here.
    }  
    
    //when meet the jumper or the edge
    public void disappear(){
        if(getY() >= 495){
            getWorld().removeObject(this);
        }
        
        
    }    
}
