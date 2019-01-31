import greenfoot.*;

/**
 * Write a description of class title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class title extends World
{

    /**
     * Constructor for objects of class title.
     * 
     */
    public title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        this(10, 24);
    }
    
    public title(int cols, int rows) {
        super(cols < 9 ? 9 : cols, (rows < 10 ? 10 : rows) + 2, 20);
        showText("スペース押してね　",5,24);
    }
    
    public void act()
    {
        if( Greenfoot.isKeyDown( "space" ) ){
            World game = new TetrisWorld();
            Greenfoot.setWorld( game );
        }
    }
}
