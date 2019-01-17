import greenfoot.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public gameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(453, 640, 1);
        
        addObject(new block1() ,200,0);
    }
}
