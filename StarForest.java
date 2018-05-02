import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StarForest here.
 * The star is the target for the jumper to eat. 
 * "Eat" means the jumper catches (touches) the star, then the star will disappear.
 * Stars motion are random.
 * When the stars meet (touch) the edge of the world, the ground, or the enemy, it 
 * will rebound.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StarForest extends Actor implements Stars
{
    private int speed = 5;
    /**
     * Act - do whatever the StarForest wants to do. This method is called whenever
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
        if(isAtEdge()){
            turn(Greenfoot.getRandomNumber(90));
        } 
        if(isTouching(Ground.class)){
            turn(180);
        }
        if(isTouching(Enemy.class)){
            turn(180);
        }
    }

    public void disappear(){
        //When neet the jumper, the star will disappear
        Actor jumper = getOneIntersectingObject(JumperForest.class);
        if(jumper != null){
            getWorld().removeObject(this);
            Greenfoot.playSound("nsmbwiiCoin.wav");
        }
        
    }
}
