import greenfoot.*;  

/**
 * Write a description of class JumpWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instruction extends World 
{
    private SimpleTimer timer = new SimpleTimer();
    private Jumper jumper = new Jumper();
    private Score score = new Score();
    private int totalStar = 5;
    private boolean corner = false;
    // GreenfootSound sound = new GreenfootSound("nyan_cat.mp3");
    //private int win_flag = 0; // 0 means ongoing, -1 means loose, 1 means win
    
    
    public Instruction()
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

       Greenfoot.start();
    }

    public void act() {
        
        int count = getObjects(Star.class).size();
        score.setScore(totalStar - count);

        if(count == 3)
        {

            //Win win = new Win();
            //addObject(win, getWidth()/2, getHeight()/2);
            //win_flag = 1;
            Greenfoot.stop();
            Greenfoot.setWorld(new JumpWorld());
        }
    }

    public void createGround()
    {
        addObject(new Ground(0), 20, 80);
        addObject(new Ground(0), 170, 140);
        addObject(new Ground(0), 310, 220);
        addObject(new Ground(0), 460, 300);
        addObject(new Ground(2), 610, 380);
        addObject(new Ground(0), 770, 450);
        addObject(new Ground(5), 100, 450);
        addObject(new Ground(5), 450, 450);
        
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
    
        if(corner){
            corner = false;
        }
        else{
            corner = true;
        }
        this.jumper.registerObserver(enemy);
    }

    public void stopped() {

        if(State.lose() == -1){
           Greenfoot.setWorld(new Instruction());
           State.win_flag = 0;
           Greenfoot.start();
        }   
    }

    public void started(){
        State.startMusic();
    }

    
    public void createText(){
        String text1 = "Let's start!";
        Instructions Text1 = new Instructions(text1, 300, 50);
        addObject(Text1, 300, 50);
        this.jumper.registerObserver(Text1);
       
        String text2 = "The ground will move, be careful!";
        Instructions Text2 = new Instructions(text2, 610, 380);
        addObject(Text2, 610, 380);
        this.jumper.registerObserver(Text2);
       
        
        String text3 = "Enemy!";
        Instructions Text3 = new Instructions(text3, 677, 250); 
        addObject(Text3, 677, 250);
        this.jumper.registerObserver(Text3);
        
        
        String text4 = "Press 's' to shoot them! \nDo not let them touch you!";
        Instructions Text4 = new Instructions(text4, 677, 280);
        addObject(Text4, 677, 280);
        this.jumper.registerObserver(Text4);
       
        
        
        String text5 = "Well done!";
        Instructions Text5 = new Instructions(text5, 750, 350);
        addObject(Text5, 750, 350);
        this.jumper.registerObserver(Text5);
        
        
        String text6 = "Collect all stars to win!";
        Instructions Text6 = new Instructions(text6, 300, 80);
        addObject(Text6, 300, 80);
        this.jumper.registerObserver(Text6);
        
    }
    
   
}
