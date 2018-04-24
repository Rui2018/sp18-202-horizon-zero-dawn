import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JumpWorld here.
 * There is 1 jumper, 5 stars, lots of enemies.
 * Move jumper to catch stars and shoot to destroy the enemies.
 * The jumper can stay on the grounds.
 * Win: the jumper catches all the stars.
 * GameOver: the jumper drop out or meets (touches) enemies.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JumpWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private int totalStars = 5;
    private int stoneSpeed = 5;
    private int bulletSpeed = 5;
    private Jumper jumper = new Jumper();
    private boolean flag = false;
    private int winFlag = 0;
    //0: ongoing, -1: lose, 1: win
    private SimpleTimer timer = new SimpleTimer();
    GreenfootSound bgmBackGround = new GreenfootSound("nyan_cat.mp3");
    
    public JumpWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(jumper, 30, 30);
        createStars();
        createStones();
        createGround();
        createEnemies();
        timer.mark();
        //bgmBackGround.setVolume(20);
        //bgmBackGround.playLoop();
        
    }
    
    public void act(){
        //bgmBackGround.setVolume(20);
        //bgmBackGround.playLoop();
        if(timer.millisElapsed() > 1500){
            createEnemies();
            timer.mark();
            
        }
        int count = getObjects(Star.class).size();
        if(count == 0){
            Win win = new Win();
            addObject(win, getWidth()/2, getHeight()/2);
            winFlag = 1;
            Greenfoot.stop();
        }
        
    
    }
    
    //Create stars at random position
    public void createStars(){
        for(int i = 0; i < totalStars; i++){
            addObject(new Star(), Greenfoot.getRandomNumber(300), Greenfoot.getRandomNumber(200));
        }
    }
    
    public void createEnemies(){
        Enemy enemy = new Enemy();
        int x;
        if(flag){
            x = 0;
        }
        else{
            x = 600;
        }
        addObject(enemy, x, 400);
        if(flag){
            flag = false;
        }
        else{
            flag = true;
        }
        jumper.registerO(enemy);
        
    }
    
    public void createStones(){
        //Stone stone = new Stone(stoneSpeed);
        for(int i = 0; i < 5; i++){
            addObject(new Stone(), Greenfoot.getRandomNumber(300), 0);
        }
        
    }
    
    public void createGround(){
        addObject(new Ground(0), 20, 80);
        addObject(new Ground(1), 550, 350);
        addObject(new Ground(-1), 50, 100);
    
    }
    
    public void createBullet(){
        addObject(new Bullet(), 100, 100);
        addObject(new Bullet(), 200, 200);
    
    }
    
    public void Lose(){
        winFlag = -1;
        
    }
    
    public void Victory(){
        winFlag = 1;
    }
    
    public void started(){
        bgmBackGround.play();
        bgmBackGround.playLoop();
    }
    
    public void stopped(){
        bgmBackGround.pause();
    }
    
}
