import greenfoot.*; 


public class Score extends Actor
{
    
    public Score()
    {
        GreenfootImage newImage = new GreenfootImage(100,50);
        setImage(newImage);
    }
    
    public void setScore(int score)
    {
        GreenfootImage newImage = getImage();
        newImage.clear();
        newImage.drawString("" + score, 30, 30);
        setImage(newImage);
    }
    
       
}
