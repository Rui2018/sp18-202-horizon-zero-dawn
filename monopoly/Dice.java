import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dice extends Actor
{
    /**
     * Act - do whatever the dice wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static GreenfootImage[] images = {new GreenfootImage("dice1.jpg"),
    new GreenfootImage("dice2.jpg"),new GreenfootImage("dice3.jpg"),
    new GreenfootImage("dice4.jpg"),new GreenfootImage("dice5.jpg"),
    new GreenfootImage("dice6.jpg")};
    
    public Dice(){
        
        GreenfootImage image = getImage();
        image.scale(50,50);
        setImage(image);
    }
    
    public int roll(){
        int randNumber = 1 + Greenfoot.getRandomNumber(6);
        //setImage(new GreenfootImage(""+randNumber, 50, Color.WHITE, Color.BLACK));
        
        return randNumber;
    }
    public void act() 
    {
        GreenfootImage img = getImage();
        int value = roll();
      
        switch(value){
            
            case 1:
            img = new GreenfootImage("dice1.jpg");
            //img.scale(50,50);
            //setImage("dice1.jpg");
            break;
            case 2:
            img = new GreenfootImage("dice2.jpg");
            //img.scale(50,50);
            //setImage("dice2.jpg");
            break;
            case 3:
            img = new GreenfootImage("dice3.jpg");
            //img.scale(50,50);
            //setImage("dice3.jpg");
            break;
            case 4:
            img = new GreenfootImage("dice4.jpg");
            //setImage("dice4.jpg");
            break;
            case 5:
            img = new GreenfootImage("dice5.jpg");
            //setImage("dice5.jpg");
            break;
            case 6:
            img = new GreenfootImage("dice6.jpg");
            //setImage("dice6.jpg");
            break;
            
        }
        img.scale(50,50);
        setImage(img);
    
       
    }    
}
