import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    //private Textbox password;

    private Boolean flag = false; 
    private Button txt1;
    private Button txt2;
    
    // private CommandReceiver newuser = new CommandReceiver(new InstructionWorld());
    // private CommandReceiver olduser = new CommandReceiver(new JumpWorld());

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 500, 1);
        CommandReceiver r1 = new CommandReceiver(new InstructionWorld());
        CommandReceiver r2 = new CommandReceiver(new JumpWorld());
        txt1 = new Button("New Player", r1);
        txt2 = new Button("Return Player", r2);
        addObject(txt1, 500, 200);
        addObject(txt2, 500, 300);
        

    }

    public void act()
    {

    }
        // Greenfoot.stop();
                // //State.startMusic();
                // // Greenfoot.setWorld(new InstructionWorld());
            // }
        // }
        // else
        // {
            // Greenfoot.stop();
        // }
        // else Greenfoot.setWorld(new TitleScreen());
        //if (Greenfoot.isKeyDown("space")) Greenfoot.setWorld(new JumpWorld());
   
    
}
