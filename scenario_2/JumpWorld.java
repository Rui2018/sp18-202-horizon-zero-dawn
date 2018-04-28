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
    private int totalStar = 5;
    private boolean corner = false;
    GreenfootSound sound = new GreenfootSound("nyan_cat.mp3");
    private int win_flag = 0; // 0 means ongoing, -1 means loose, 1 means win

    public JumpWorld()
    {    
        super(900, 500, 1); 
        addObject(this.jumper, 30, 30);
        addObject(this.score, 880, 15);
        createStars();
        createGround();
        createEnemy();
        createText();
        score.setScore(0);
        this.timer.mark();
        prepare();
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
            win_flag = 1;
            Greenfoot.stop();
        }
    }

    public void createGround()
    {
        addObject(new Ground(0), 20, 80);
        addObject(new Ground(2), 170, 140);
        addObject(new Ground(0), 310, 220);
        addObject(new Ground(0), 460, 300);
        addObject(new Ground(0), 610, 380);
        addObject(new Ground(0), 770, 450);
        addObject(new Ground(5), 100, 450);
        addObject(new Ground(10), 450, 450);
      

        
    }
    public void createStars()
    {

        for(int i = 0; i < totalStar; i++)
        {
            //int randX = Greenfoot.getRandomNumber(500) + 10;
            //int randY = Greenfoot.getRandomNumber(200) + 10;
            //addObject(new Star(), randX, randY);
            addObject(new Star(),(50 +100*i), (80+50*i));
        }
    }

    public void createEnemy() {
        Enemy enemy = new Enemy();
        addObject(enemy, 500, 320);
        //int x = corner? 0:900;
        //addObject(enemy, x, 500); 
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
        if(win_flag == 1) {
            Greenfoot.playSound("youwin.mp3");
        }
        else if(win_flag == -1){
            Greenfoot.playSound("gameover.wav");
        }
    }

    public void started(){
        sound.setVolume(50);
        sound.playLoop();
    }

    public void setLose(){
        win_flag = -1;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

    }
    
    public void createText(){
        String text1 = "Let's start!";
        Instructions Text1 = new Instructions(text1, 120, 30);
        addObject(Text1, 120, 30);
        this.jumper.registerObserver(Text1);
        
        String text2 = "The ground will move, be careful!";
        Instructions Text2 = new Instructions(text2, 300, 120);
        addObject(Text2, 300, 120);
        this.jumper.registerObserver(Text2);
        
        String text3 = "Enemy!";
        Instructions Text3 = new Instructions(text3, 450, 250);
        addObject(new Instructions(text3, 450, 250), 450, 250);
        this.jumper.registerObserver(Text3);
        
        String text4 = "Shoot them! Do not let them touch you!";
        Instructions Text4 = new Instructions(text4, 700, 320);
        addObject(new Instructions(text4, 700, 320), 700, 320);
        this.jumper.registerObserver(Text4);
        
        String text5 = "Well done!";
        Instructions Text5 = new Instructions(text5, 600, 350);
        addObject(new Instructions(text5, 600, 350), 600, 350);
        this.jumper.registerObserver(Text5);
        
        String text6 = "Collect all stars to win!";
        Instructions Text6 = new Instructions(text6, 165, 50);
        addObject(new Instructions(text6, 165, 50), 165, 50);
        this.jumper.registerObserver(Text6);
    }
}
