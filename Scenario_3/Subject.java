/**
 * Write a description of class Subject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface Subject  
{
    public void registerO(Observer observer);
    public void removeO(Observer observer);
    public void notifyO();
    
}
