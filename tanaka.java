import greenfoot.*;

/**
 * Write a description of class tanaka here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tanaka extends Actor
{
    /**
     * Act - do whatever the tanaka wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(1);
       }
       if (Greenfoot.isKeyDown("up")){
        setRotation(270);
        move(4);}
       if (Greenfoot.isKeyDown("left")){
        setRotation(180);
        move(4);}
    }    
}
