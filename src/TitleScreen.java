import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World implements Proxy
{
    //private Textbox password;

    //private String input; 
    private Boolean flag = false; 
    // private GreenfootImage background = new GreenfootImage("title.jpg");
    // this.setBackground(img);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 500, 1);
        // setBackground(background);
        Greenfoot.start();
        //String input = JOptionPane.showInputDialog("Please enter password");
    }

    public void act()
    {
        
        JOptionPane option = new JOptionPane();
        String input = option.showInputDialog("Please enter password");
        if(input!=null){
            passcode(input);

            if (flag) {
                State.startMusic();
                Greenfoot.setWorld(new InstructionWorld());
            }
        }
        else
        {
            Greenfoot.stop();
        }
        // else Greenfoot.setWorld(new TitleScreen());
        //if (Greenfoot.isKeyDown("space")) Greenfoot.setWorld(new JumpWorld());
    }

    
    public void passcode(String input)
    {
        if (input.equals("1234")) flag = true;  
    }
}
