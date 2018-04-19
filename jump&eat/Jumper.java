import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

public class Jumper extends Mover implements Subject
{
    private int speed = 7;
    private int vSpeed = 0;
    private int acceleration = 2;
    private int jumpStrength = 16;
    private boolean jumping;
    private int direction;
    private List<Observer> observers = new ArrayList<>();
    
    
    public void act() 
    {
        
        checkFall();
        checkKeys();
        notifyObserver();
        checkGameOver();
        
        
    }
    
    public void registerObserver(Observer observer)
    {
        observers.add(observer);
    }
    public void removeObserver(Observer observer)
    {
        int index = observers.indexOf(observer);
        observers.remove(index);
    }
    public void notifyObserver()
    {
        for(Observer observer : observers)
        {
            observer.update(getX(), getY());
        }
        
    }
    
    private void checkKeys()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            setImage("jumper_left.png");
            moveLeft();
            direction = 180;
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            setImage("jumper_right.png");
            moveRight();
            direction = 0;
        }
        
        if(Greenfoot.isKeyDown("space") && jumping == false)
        {      
            jump();
            Greenfoot.playSound("nsmbwiiJump.wav");
        }
        
        if("s".equals(Greenfoot.getKey()))
        {      
            shoot();
            Greenfoot.playSound("nsmbwiiFireBall.wav");
        }
    }
    
    
    public void checkGameOver()
    {
        Actor enemy = getOneIntersectingObject(Enemy.class);
        if(getY() >= getWorld().getHeight() - 1 || enemy != null)
        {
            GameOver gameOver = new GameOver();
            
            getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
    }
   
    
    public void jump()
    {
        vSpeed = vSpeed - jumpStrength; 
        jumping = true;
        fall();
    }
    
    public void shoot()
    {
        Actor bullet = new Bullet();
        getWorld().addObject(bullet, getX(), getY());
        
        if("jumper_left.png".equals(getImage()))
        {
            bullet.setRotation(direction);
            
        }
        
        else
        {
            bullet.setRotation(direction);
            
        }
    }
    
    public void checkFall()
    {
        if(onGround())
        {
            vSpeed = 0;
        }
        else
        {
            fall();
        }
    }
    
    public boolean onGround()
    {
        int spriteHeight = getImage().getHeight();
        int yDistance = (int) (spriteHeight/2 + 5);
        
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight()/2, Ground.class);
        if(ground == null)
        {
            jumping = true;
            return false;
        }
        else
        {
            moveToGround(ground);
            return true;
        }
        
    }
    
    public void moveToGround(Actor ground)
    {
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
        jumping = false;
    }
    
    public void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        if(vSpeed <= 9)
        {
            vSpeed = vSpeed + acceleration;
        }
        jumping = true;
    }
    
    public void moveLeft()
    {
        
        setLocation(getX() - speed, getY());
    }
    
    public void moveRight()
    {
        
        setLocation(getX() + speed, getY());
    }
    
}

