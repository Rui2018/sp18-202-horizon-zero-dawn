/**
 * Write a description of class ShootCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShootCommand implements Command
{
    // instance variables - replace the example below with your own
    Jumper jumper;

    /**
     * Constructor for objects of class ShootCommand
     */
    public ShootCommand(Jumper jumper)
    {
        this.jumper = jumper;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void execute(){
        jumper.shoot();
    }
}
