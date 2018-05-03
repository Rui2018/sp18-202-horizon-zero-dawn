import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;

public class ProxyScreen extends World implements Proxy
{
    private TitleScreen s = new TitleScreen();
    public ProxyScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 500, 1); 
        Greenfoot.start();
        JOptionPane option = new JOptionPane();
        String input = JOptionPane.showInputDialog("Please enter password");
        if(input!=null)
        {
            if (passcode(input))
                Greenfoot.setWorld(s);
            else
                Greenfoot.setWorld(new ProxyScreen());
        }
        else{
            Greenfoot.stop();
        }
    }
    
    public void act()
    {   
        // Button s = new Button("Password incorrect", new ProxyScreen());
        // addObject(s, 500, 200);
    }
    
    public boolean passcode(String input)
    {
        if (input.equals("1234")) 
            return true; 
        else return false;
    }
}
