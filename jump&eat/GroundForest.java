import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GroundForest here.
 * The grounds move left and right.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GroundForest extends Actor
{
    private int speed;
    /**
     * Act - do whatever the GroundForest wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GroundForest(int speed){
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 3, image.getHeight() / 5);
        setImage(image);
        this.speed = speed; 
    }
    
    //The grounds move left and right.
    public void act() 
    {
        // Add your action code here.
        move();
        Actor jumper = getOneObjectAtOffset(0,-31,JumperForest.class);
        if (jumper != null){
            jumper.setLocation(jumper.getX() + speed, jumper.getY() );
        }
    }
    
    //When the ground meet the edge, turn. 
    public void move(){
         move(speed);
         if(getX() > getWorld().getWidth() - getImage().getWidth() || getX() <= 0){
             speed = -speed;
         }        
    }

        
}    
