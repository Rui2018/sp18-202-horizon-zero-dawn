import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JumpWorld here.
 * There is 1 jumper, 5 stars, lots of enemies.
 * Move jumper to catch stars and shoot to destroy the enemies.
 * The jumper can stay on the grounds.
 * Win: the jumper catches all the stars.
 * GameOver: the jumper drop out or meets (touches) enemies.
 * 
 * @ Rui Guo 
 * @ 04/20/2018
 */
public class JumpWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private int totalStars = 5;
    
    public JumpWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        createStars();
    }
    
    //Create stars at random position
    public void createStars(){
        for(int i = 0; i < totalStars; i++){
            addObject(new Star(), Greenfoot.getRandomNumber(300), Greenfoot.getRandomNumber(200));
        }
        
    }
}
