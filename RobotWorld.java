import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Background of the game. Zane Kegley
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class RobotWorld.
     * 
     */
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(new Robot(), 50, 50);
        addObject(new Wall(), 50, 150);
        addObject(new Wall(), 150, 150);
        addObject(new Wall(), 250, 150);
        addObject(new Block(), 405, 150);
        addObject(new Wall(), 555, 150);
        addObject(new Wall(), 655, 150);
        addObject(new Wall(), 755, 150);
        addObject(new Home(), 750, 550);
        addObject(new ScorePanel(), 75, 550);
        addObject(new Pizza(), 300, 50);
        addObject(new Pizza(), 600, 50);
        addObject(new Pizza(), 300, 400);
        addObject(new Pizza(), 600, 400);
        addObject(new Pizza(), 450, 550);
    }
}
