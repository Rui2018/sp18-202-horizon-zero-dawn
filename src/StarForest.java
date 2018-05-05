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
public class StarForest extends Star
{
    
    public void act() 
    {
        moveAround(5);
        disappear();
        // Add your action code here.
    }  
    
     //The star will rebound when it meets other objects
    public void moveAround(int n){
        move(n);
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
        Actor jumper = getOneIntersectingObject(Jumper.class);
        if(jumper != null){
            getWorld().removeObject(this);
            Greenfoot.playSound("nsmbwiiCoin.wav");
        }
        
    }
}
