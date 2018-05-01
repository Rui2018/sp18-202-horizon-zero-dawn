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
    private int totalStar = 4;
    private boolean corner = false;
    GreenfootSound sound = new GreenfootSound("nyan_cat.mp3");
    private int win_flag = 0; // 0 means ongoing, -1 means loose, 1 means win
    
    public JumpWorld()
    {    
        super(900, 500, 1); 
        prepare();
       
    }

    private void PlayerInput (){
        if (Greenfoot.isKeyDown("enter")== true)
        {
            Greenfoot.setWorld(new JumpWorld());
        }
    }
    
    public void act() {
        //if(timer.millisElapsed() > 2000 ) {
           // createEnemy();
           // timer.mark();
        //}
        int count = getObjects(Star.class).size();
        score.setScore(totalStar - count);
        if(count == 0)
        {
            Win win = new Win();
            addObject(win, getWidth()/2, getHeight()/2);
            win_flag = 1;
            Greenfoot.stop();
        }else
        {
            PlayerInput();
        }
    }

    public void createGround()
    {
        addObject(new Ground(0), 20, 80);
        addObject(new Ground(0), 200, 300);
        addObject(new Ground(0), 380, 220);
        addObject(new Ground(0), 560, 290);
        addObject(new Ground(0), 740, 360);
    
    }
    public void createStars()
    {        
        addObject(new Star(), 200, 265);
        addObject(new Star(), 380, 185);
        addObject(new Star(), 560, 255);
        addObject(new Star(), 740, 325);
    }

   public void stopped() {
        sound.stop();
        if(win_flag == 1) {
            Greenfoot.playSound("youwin.mp3");
        }
        else if(win_flag == -1){
           Greenfoot.setWorld(new JumpWorld());
           Greenfoot.start();
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
        addObject(this.jumper, 30, 30);
        addObject(this.score, 880, 15);
        createStars();
        createGround();
        // createEnemy();
        createText();
        score.setScore(0);
        this.timer.mark();
    }
    
    public void createText(){
        String text1 = "Use left/right arrow key to move around";
        Instructions Text1 = new Instructions(text1, 200, 50);
        addObject(Text1, 200, 50);
        this.jumper.registerObserver(Text1);
       
        String text2 = "Press space bar to jump";
        Instructions Text2 = new Instructions(text2, 300, 300);
        addObject(Text2, 300, 300);
        this.jumper.registerObserver(Text2);
        
        
        String text3 = "Keep going!";
        Instructions Text3 = new Instructions(text3, 677, 280);
        addObject(Text3, 677, 280);
        this.jumper.registerObserver(Text3);
        
    }
    
   
}
