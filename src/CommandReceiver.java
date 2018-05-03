import greenfoot.*;

public class CommandReceiver implements Command
{
    // instance variables - replace the example below with your own
    private World w;
    public CommandReceiver(World wd)
    {
        w = wd;
    }

    public void execute()
    {
        Greenfoot.setWorld(w);
    }
}
