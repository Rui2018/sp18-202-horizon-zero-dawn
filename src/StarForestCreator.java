/**
 * Write a description of class StarForestCreator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StarForestCreator extends Creator 
{
    public Star getStars(){
        return new StarForest();
    }
}
