/**
 * Write a description of class RightCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RightCommand implements Command
{
    // instance variables - replace the example below with your own
    Jumper jumper;

    /**
     * Constructor for objects of class RightCommand
     */
    public RightCommand(Jumper jumper)
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
        jumper.moveRight();
    }
}
