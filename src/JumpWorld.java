import greenfoot.*;  

/**
 * Write a description of class JumpWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JumpWorld extends World
{
    private SimpleTimer timer = new SimpleTimer();
    private Jumper jumper = new Jumper();
    private Score score = new Score();
    private int totalStar = 10;
    private boolean corner = false;
    GreenfootSound sound = new GreenfootSound("nyan_cat.mp3");
    //private int win_flag = 0; // 0 means ongoing, -1 means loose, 1 means win
    
    
    public JumpWorld()
    {    
        super(900, 500, 1); 
        addObject(this.jumper, 30, 30);
        addObject(this.score, 880, 15);

        createStars();
        createGround();
        createEnemy();
        score.setScore(0);
        this.timer.mark();

        Greenfoot.start();
    }

    public void act() {
        if(timer.millisElapsed() > 2000 ) {
            createEnemy();
            timer.mark();
        }
        int count = getObjects(Star.class).size();
        score.setScore(totalStar - count);

        if(count == 0)
        {

            //Win win = new Win();
            //addObject(win, getWidth()/2, getHeight()/2);
            //win_flag = 1;
            Greenfoot.stop();
            Greenfoot.setWorld(new DesertWorld());
        }

    }

    public void createGround()
    {
        addObject(new Ground(0), 20, 80);
        addObject(new Ground(0), 100, 450);
        addObject(new Ground(0), 450, 450);
        addObject(new Ground(0), 800, 450);
        addObject(new Ground(-2), 150, 400);
        addObject(new Ground(1), 550, 400);
        addObject(new Ground(1), 800, 350);
        addObject(new Ground(-1), 200, 300);
        addObject(new Ground(1), 600, 300);
        addObject(new Ground(1), 420, 250);
        addObject(new Ground(-3), 500, 200);
        addObject(new Ground(1), 700, 150);

        
    }
    public void createStars()
    {

        for(int i = 0; i < totalStar; i++)
        {
            int randX = Greenfoot.getRandomNumber(881) + 10;
            int randY = Greenfoot.getRandomNumber(481) + 10;
            addObject(new Star(), randX, randY);
        }
    }

    public void createEnemy() {
        Enemy enemy = new Enemy();
        int x = corner? 0:900;
        addObject(enemy, x, 500); 
        if(corner){
            corner = false;
        }
        else{
            corner = true;
        }
        this.jumper.registerObserver(enemy);
    }

    public void stopped() {

        sound.stop();
        if(State.win_flag == -1){
            Greenfoot.playSound("gameover.wav");
        }
    }

    public void started(){
        //sound.setVolume(50);
        //sound.playLoop();
    }

}
