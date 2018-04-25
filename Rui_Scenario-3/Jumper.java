import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Jumper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jumper extends Actor implements Subject

{
    private int speed = 5; 
    private int vSpeed = 0;
    private int acceleration = 2;
    private int jumpHeight = 10;
    private int onGroundspeed;
    private List<Observer> observers = new ArrayList<>();
    Bullet bullet = new Bullet();
    private int oriention;
    
    
    /**
     * Act - do whatever the Jumper wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        ifFall();
        checkKey();
        notifyO();
        ifGameOver();
        //ifWin();
        
        // Add your action code here.
    } 
    
    public void ifFall(){
        if(onGround()){
            vSpeed = 0;    
        }
        else{
            fall();
        }
    }
    
    public void checkKey(){
        if(Greenfoot.isKeyDown("left")){
            setImage("jumper_left.png");
            moveLeft();
            oriention = 180;
        }
        if(Greenfoot.isKeyDown("right")){
            setImage("jumper_right.png");
            moveRight();
            oriention = 0;
        }
        if(Greenfoot.isKeyDown("space")){
            jump();
            /**
             * needs to add sound here
             */
            Greenfoot.playSound("Jump.wav");
        }
        if(Greenfoot.isKeyDown("s")){
            shoot();
            /**
             * needs to add sound here
             */
            Greenfoot.playSound("Shoot.wav");
        }
    }
    
    public void notifyO(){
        for(Observer observer : observers){
            observer.update(getX(), getY());
        }
    }
    
    public void ifGameOver(){
        Actor enemy = getOneIntersectingObject(Enemy.class);
        if(enemy != null){
            GameOver gameover = new GameOver();
            getWorld().addObject(gameover, getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            ((JumpWorld)getWorld()).Lose();
            Greenfoot.stop();
        }
        else if(getY() > getWorld().getHeight() - 10){
            GameOver gameover = new GameOver();
            getWorld().addObject(gameover, getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            ((JumpWorld)getWorld()).Lose();
            Greenfoot.stop();
        }
    }
    
    //public void ifWin(){
        //Actor star = getOneIntersectingObject(Star.class);
        //if(getObjects(Star.class).size() == 0){
           // Win win = new Win();
           // getWorld().addObject(win, getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            //((JumpWorld)getWorld()).Victory();
           // Greenfoot.stop();
       // }
   // }
    
    public boolean onGround(){
        Actor under = getOneObjectAtOffset(0, getImage().getHeight() / 2, Ground.class);
        return under != null;
    }
    
    public void fall(){
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    
    public void moveLeft(){
        setLocation(getX() - speed, getY());
    }
    
    public void moveRight(){
        setLocation(getX() + speed, getY());
    }
    
    public void jump(){
        vSpeed = - jumpHeight;
        fall();
    }
    
    public void shoot(){
       
        getWorld().addObject(bullet, 0, 0);
        bullet.setLocation(getX(), getY());
        if("jumper_right.png".equals(getImage())){
            bullet.setRotation(oriention);
        }
        else {
            bullet.setRotation(oriention);
        }
    
    }
    
    public void registerO(Observer observer){
        observers.add(observer);
    
    }
    
    public void removeO(Observer observer){
        int index = observers.indexOf(observer);
        observers.remove(index);
    
    }
    
    
    
}
