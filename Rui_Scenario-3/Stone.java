import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stone here.
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
    
   // public Stone(int speed){
        /**
         * Need to finish
         */
   // }
    
    public void act() 
    {
        // Add your action code here.
        setRotation(90);
        move(speed);
        disappear();
    }  
    
    //when meet the jumper or the edge
    public void disappear(){
        Actor jumper = getOneIntersectingObject(Jumper.class);
        if(jumper != null)
        {
            /**
             * Need sound here for gameover!
             */
            Greenfoot.playSound("");
        }
        else if(getY() >= 395){
            
            getWorld().removeObject(this);
        }
        
        
    
    }
}
