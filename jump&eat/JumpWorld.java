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
            Win win = new Win();
            addObject(win, getWidth()/2, getHeight()/2);
            Greenfoot.stop();
        }
    }
    
    public void createGround()
    {
        addObject(new Ground(0), 20, 80);
        addObject(new Ground(0), 100, 450);
        addObject(new Ground(0), 400, 450);
        addObject(new Ground(0), 800, 450);
        addObject(new Ground(-2), 150, 400);
        addObject(new Ground(1), 150, 400);
        addObject(new Ground(1), 800, 350);
        addObject(new Ground(-1), 200, 300);
        addObject(new Ground(1), 30, 150);
        addObject(new Ground(-3), 150, 200);
        addObject(new Ground(1), 120, 200);
        addObject(new Ground(1), 200, 300);
        
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
        addObject(enemy, 900, 500);
        this.jumper.registerObserver(enemy);
    }
    
}
