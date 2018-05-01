/**
 * Write a description of class SimpleTimer here.
 * A simple timer class that allows you to keep track of how much time has passed between events.
 * 
 * @author Neil Brown
 * @version 1.0
 */
public class SimpleTimer   
{
    private long lastMark = System.currentTimeMillis();
    
    /**
     * Marks the current time.  
     */
    public void mark(){
        lastMark = System.currentTimeMillis();
        
    }
    
    /**
     * Returns the amount of milliseconds that have elapsed since mark() last called.
     */
    public int millisElapsed(){
        return (int) (System.currentTimeMillis() - lastMark);
    }
}
