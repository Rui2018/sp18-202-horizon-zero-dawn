import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SimpleTimer here.
 * A simple timer class that allows you to keep track of how much time has passed between events.
 * 
 * @Neil Brown 
 * @version (a version number or a date)
 */
public class SimpleTimer extends Actor
{
    private long lastMark = System.currentTimeMillis();
    /**
     * Marks the current time.
     */
    public void mark(){
        lastMark = System.currentTimeMillis();
    
    } 
    
     /**
     * Return the amount of ms that have elapsed since mark() last called.
     */
    public int millisElapsed(){
        return (int) (System.currentTimeMillis() - lastMark);
    }
}
