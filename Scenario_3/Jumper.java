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
        ifWin();
        
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
            setImage("");
            moveLeft();
        }
        if(Greenfoot.isKeyDown("right")){
            setImage("");
            moveRight();
        }
        if(Greenfoot.isKeyDown("space")){
            jump();
            /**
             * needs to add sound here
             */
            Greenfoot.playSound("");
        }
        if(Greenfoot.isKeyDown("s")){
            shoot();
            /**
             * needs to add sound here
             */
            Greenfoot.playSound("");
        }
    }
    
    public void notifyO(){
        for(Observer observer : observers){
            observer.update(getX(), getY());
        }
    }
    
    public void ifGameOver(){
        Actor enemy = getOneIntersectingObject(Enemy.class);
        if(enemy != null || getY() > getWorld().getHeight() - 1){
            GameOver gameover = new GameOver();
            getWorld().addObject(gameover, getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            ((JumpWorld)getWorld()).Lose();
            Greenfoot.stop();
        }
    }
    
    public void ifWin(){
        Actor star = getOneIntersectingObject(Star.class);
        if(getObjects(Star.class).size() == 0){
            Win win = new Win();
            getWorld().addObject(win, getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            ((JumpWorld)getWorld()).Victory();
            Greenfoot.stop();
        }
    }
    
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
        Actor bullet = new Bullet();
        getWorld.addObject(bullet, getX(), getY());
        if(getImage() == ""){
            bullet.setRotation(0);
        }
        else{
            bullet.setRotation(180);
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
