import greenfoot.*;  

/**
 * Write a description of class InstructionWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionWorld extends World 
{
    private SimpleTimer timer = new SimpleTimer();

    private Jumper jumper = new Jumper();
    private Score score = new Score();
    private int totalStar = 4;
    private boolean corner = false;
    
    public InstructionWorld()
    {    
        super(900, 500, 1); 
        prepare();
       
    }
    
    public void act() {
        
        int count = getObjects(stillStar.class).size();
        score.setScore(totalStar - count);
        if(count == 0)
        {
            //Win win = new Win();
            //addObject(win, getWidth()/2, getHeight()/2);
            //win_flag = 1;
            Greenfoot.stop();
            Greenfoot.setWorld(new Instruction());
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
        addObject(new stillStar(), 200, 265);
        addObject(new stillStar(), 380, 185);
        addObject(new stillStar(), 560, 255);
        addObject(new stillStar(), 740, 325);
    }

   public void stopped() {
        
       
        if(State.lose() == -1){
           Greenfoot.setWorld(new InstructionWorld());
           State.win_flag = 0;
           Greenfoot.start();
        }     
        
    }

    public void started(){
        State.startMusic();
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
