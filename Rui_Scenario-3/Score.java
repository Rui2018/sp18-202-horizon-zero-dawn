import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * Record how many stars left need to be catch.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Score()
    {
        GreenfootImage newImage = new GreenfootImage(100,50);
        setImage(newImage);
        // Add your action code here.
    }
    
    public void setScore(int score){
        GreenfootImage newImage = getImage();
        newImage.clear();
        newImage.drawString(score + " Score Left", 30, 30);
        setImage(newImage);
    }
}
