import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Robot extends Actor
{
    private GreenfootImage robotimage1= new GreenfootImage("man01.png");
    private GreenfootImage robotimage2= new GreenfootImage("man02.png");
    public void act() 
    {
        if (Greenfoot.isKeyDown("left"))
        {
            move (-3);
    }
        if (Greenfoot.isKeyDown("right"))
        {
            move (3);
    }
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation( getX(), getY() -3 );
    }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation( getX(), getY() +3 );
    }
    {
        if(isTouching(Wall.class))
        {
            removeTouching(Robot.class);
            setLocation( 50, 50);
            Greenfoot.playSound ("hurt.wav");
        }
    }
    {  
    if(isTouching(Block.class))
        {
            removeTouching(Robot.class);
            setLocation( 50, 50); 
            Greenfoot.playSound ("hurt.wav");
        }
    }
    {
        if(isTouching(Home.class))
        {
            removeTouching(Robot.class);
            setLocation( 50, 50);
            Greenfoot.playSound("yipee.wav");
        }
    }
    {
        if(isTouching(Pizza.class))
        {
            removeTouching(Pizza.class);
            Greenfoot.playSound("eat.wav");
        }
        
        
    
    {
        new GreenfootImage("man01.png");
        new GreenfootImage("man02.png");
        setImage ("man01.png");
    }
    }
    }
}   
