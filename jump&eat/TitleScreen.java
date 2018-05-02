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
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 500, 1);
        Greenfoot.start();
        //String input = JOptionPane.showInputDialog("Please enter password");
        prepare();
    }

    public void act()
    {
        String input = JOptionPane.showInputDialog("Please enter password");
        if(input!=null){
            passcode(input);
            if (flag) Greenfoot.setWorld(new InstructionWorld());
        }
        else Greenfoot.setWorld(new TitleScreen());
        //if (Greenfoot.isKeyDown("space")) Greenfoot.setWorld(new JumpWorld());
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
    
    public void passcode(String input)
    {
        if (input.equals("1234")) flag = true;  
    }
}
