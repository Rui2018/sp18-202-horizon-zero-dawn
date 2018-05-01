import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ForestWorld here.
 * There is 1 jumper, 5 stars, lots of enemies.
 * Move jumper to catch stars and shoot to destroy the enemies.
 * The jumper can stay on the grounds.
 * Win: the jumper catches all the stars.
 * GameOver: the jumper drop out or meets (touches) enemies.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ForestWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private int totalStars = 5;
    //private int stoneSpeed = 5;
    private int bulletSpeed = 5;
    private int groundSpeed = 0;
    private JumperForest jumper = new JumperForest();
    private boolean flag = false;
    private int winFlag = 0;
    // 0 means ongoing, -1 means loose, 1 means win
    private SimpleTimer timer = new SimpleTimer();
    private Score score = new Score();
    GreenfootSound bgmBackGround = new GreenfootSound("nyan_cat.mp3");

    
    public ForestWorld()
    {    
       // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 500, 1);
        addObject(jumper, 30, 30);
        addObject(score, 830, 15);
        createStars();
        createGround();
        createEnemies();
        createStones();
        score.setScore(0);
        timer.mark();
        
    }
    public void act(){
        if(timer.millisElapsed() > 1500 ){
            createEnemies();
            createStones();
            timer.mark();
        }
        
        int count = getObjects(StarForest.class).size();
        score.setScore(count);
        //if(count == 0){
           // Win smell = new Win();
           // addObject(smell, getWidth()/2, getHeight()/2);
           // winFlag = 1;
           // Greenfoot.stop();
        //}
        if(count == 0){
            Greenfoot.setWorld(new ForestWorld());
            
        }
        
        
    }
    
   //Create stars at random position
    public void createStars(){
        for(int i = 0; i < totalStars; i++){
            addObject(new StarForest(), Greenfoot.getRandomNumber(300), Greenfoot.getRandomNumber(200));
        }
    }
    
    //Create enemies one by one
    public void createEnemies(){
        Enemy enemy = new Enemy();
        int x;
        if(flag){
            x = 0;
        }
        else{
            x = 900;
        }
        
        addObject(enemy, x, 500);
        if(flag){
            flag = false;
        }
        else{
            flag = true;
        }
        jumper.registerObserver(enemy);
        
    }
    
    //Create stones one by one.
    public void createStones(){
        addObject(new Stone(), Greenfoot.getRandomNumber(700) + 100, 0);
    }
    
    //Create 10 grounds, 4 static, 6 move
    public void createGround(){
        addObject(new GroundForest(0), 20, 70);
        addObject(new GroundForest(0), 400, 170);
        addObject(new GroundForest(0), 800, 320);
        addObject(new GroundForest(0), 300, 420);
       
      // addObject(new GroundForest(1), 200, 180);
        addObject(new GroundForest(2), 500, 220);
        addObject(new GroundForest(1), 650, 470);
        
        addObject(new GroundForest(-1), 80, 370);
        addObject(new GroundForest(-2), 600, 120);
        addObject(new GroundForest(-3), 150, 270); 
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
        if(winFlag == 1) {
            Greenfoot.playSound("youwin.mp3");
        }
        else if(winFlag == -1){
            Greenfoot.playSound("gameover.wav");
        }
    }
    
}
