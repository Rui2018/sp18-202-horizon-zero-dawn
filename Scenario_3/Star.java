import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The star is the target for the jumper to eat. 
 * "Eat" means the jumper catches (touches) the star, then the star will disappear.
 * Stars motion are random.
 * When the stars meet (touch) the edge of the world, the ground, or the enemy, it 
 * will rebound.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Star extends Actor
{
    private int speed = 5;
    /**
     * Act - do whatever the Star wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(speed);
        turn();
        disappear();
        // Add your action code here.
    }
   
    //The star will rebound when it meets other objects
    public void turn(){
        if(Greenfoot.getRandomNumber(100) < 5){
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if(getX() == 0 || getX() == getWorld().getWidth() - 1){
            setRotation(180 - getRotation());
        }
        if(getY() == 0 || getY() == getWorld().getHeight() - 1){
            setRotation(360 - getRotation());
        }
        
        /**
         * Need to add function for meeting other objects.
         */
        
        
    }
    
    public void disappear(){
        //When meet the jumper, the star will disappear
        Actor jumper = getOneIntersectingObject(Jumper.class);
        if(jumper != null){
            getWorld().removeObject(this);
            /**
             * Need to add a sound here.
             */
            Greenfoot.playSound("");
        }
        
    }
}
