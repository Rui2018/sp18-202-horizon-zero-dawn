import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Jumper here.
 * The jumper can be controled by keyboard. It can move left and right, can jump and
 * shoot.
 * If the jumper fall, it will die.
 * If the jumoer meets(catch) the enemy, it will die. But it can shoot to kill enemy.
 * When the jumer catch all the stars, WIN!
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jumper extends Actor implements Subject
{
    private int speed = 5;
    private int vSpeed = 0;
    private int acceleration = 2;
    private int groundSpeed = 10;
    private int jumpHeight = 15;
    private int onGroundSpeed;
    private boolean jumping;
    private List<Observer> observers = new ArrayList<>();
    Bullet bullet = new Bullet();
    private int oriention;
    Command slot;
    
    /**
     * Act - do whatever the Jumper wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        ifFall();
        checkKeys();
        notifyObserver();
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
    
    private void checkKeys()
    {
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
        if(Greenfoot.isKeyDown("space") && jumping == false){      
            jump();
            Greenfoot.playSound("nsmbwiiJump.wav");
        }
        if("s".equals(Greenfoot.getKey())){      
            shoot();
            Greenfoot.playSound("nsmbwiiFireBall.wav");
        }
    }
    
     public void notifyObserver(){
        for(Observer observer : observers){
            observer.update(getX(), getY());
        }
        
    }
    
    public void ifGameOver(){
        Actor enemy = getOneIntersectingObject(Enemy.class);
        Actor stone = getOneIntersectingObject(Stone.class);
        if(enemy != null){
            GameOver gameover = new GameOver();
            getWorld().addObject(gameover, getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            ((JumpWorld)getWorld()).Lose();
            Greenfoot.stop();
        }
        else if(stone != null){
            GameOver gameover = new GameOver();
            getWorld().addObject(gameover, getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            ((JumpWorld)getWorld()).Lose();
            Greenfoot.stop();
        }
        else if(getY() >= getWorld().getHeight() - 10){
            GameOver gameover = new GameOver(); 
            getWorld().addObject(gameover, getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            ((JumpWorld)getWorld()).Lose();
            Greenfoot.stop();
        }
    }
    
    //public void ifWin(){
        //Actor star = getOneIntersectingObject(Star.class);
        //if(getObjects(Star.class).size() == 0){
            //Win win = new Win();
            //getWorld().addObject(win, getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            //((JumpWorld)getWorld()).Victory();
            //Greenfoot.stop();
        //}
    //}
    
    public boolean onGround(){
        int JumperHeight = getImage().getHeight();
        //int Y = (int) (JumperHeight/2 + 5);
        Actor under = getOneObjectAtOffset(0, getImage().getHeight() / 2, Ground.class);
        //return under != null;
        if(under == null){
            jumping = true;
            return false;
        }
        else{
            moveToGround(under);
            return true;
        }
    }
    
    public void moveToGround(Actor ground){
        int GroundHeight = ground.getImage().getHeight();
        int Y = ground.getY() - (GroundHeight + getImage().getHeight()) / 2;
        setLocation(getX(), Y);
        jumping = false;
    }
    
    public void fall(){
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
        jumping = true;
    }
    
    public void moveLeft(){
        setLocation(getX() - speed, getY());
    }
    
    public void moveRight(){
        setLocation(getX() + speed, getY());
    }
    
    public void jump(){
        vSpeed = - jumpHeight; 
        jumping = true;
        fall();
    }
    
    public void shoot(){
        Actor bullet = new Bullet();
        getWorld().addObject(bullet, getX(), getY());
        if("jumper_right.png".equals(getImage())){
            bullet.setRotation(oriention);
        }
        else{
            bullet.setRotation(oriention); 
        }
        
    }
    
    public void registerObserver(Observer observer){
        observers.add(observer);
        
    }
    
    public void removeObserver(Observer observer){
        int index = observers.indexOf(observer);
        observers.remove(index);
        
    }
   
}
