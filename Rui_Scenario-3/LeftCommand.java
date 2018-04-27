/**
 * Write a description of class LeftCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeftCommand implements Command
{
    // instance variables - replace the example below with your own
    Jumper jumper;

    /**
     * Constructor for objects of class LeftCommand
     */
    public LeftCommand(Jumper jumper)
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
        jumper.moveLeft();
    }
}
