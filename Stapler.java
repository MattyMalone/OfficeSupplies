
/**
 * Write a description of class Stapler here.
 *
 * @author (Alex Chui)
 * @version (2024/2/5)
 */
public class Stapler
{
    // instance variables - replace the example below with your own
    private int staplesRemaining;
    private boolean jammed;
    private boolean opened;

    /**
     * @param staplesRemaining the amount of staples remaining in the stapler
     * @param jammed if the stapler is jammed
     * @param opened if the stapler is opened 
     */
    public Stapler()
    {
        jammed = false;
        opened = false;
        staplesRemaining = 100;
    }

    /**
     * @return the amount of staples remaining in the stapler
     */
    public int getStaplesRemaining()
    {
        return staplesRemaining;
    }
    
    /**
     * @return whether the stapler is jammed
     */
    public boolean getJammed()
    {
        return jammed;
    }
    
    /**
     * @return whether the stapler is open
     */
    public boolean getOpened()
    {
        return opened;
    }

    /**
     * staples a stack of paper 
     */
    public void staple()
    {
        if(jammed == false && opened == false)
        {
            staplesRemaining--;
        }
    }
    
    /**
     * unjams the stapler
     */
    public void unJam()
    {
        if(jammed == true)
        {
            jammed = false;
        }
    }
    
    /** jams the stapler (for testing purposes only)
     * 
     */public void jam()
    {
       jammed = true;
    }
    
    /**
     * refills stapler
     */
    public void refill()
    {
        if(!opened)
        {
            staplesRemaining = staplesRemaining;
        }
        else
        {
            staplesRemaining = 100;
        }
        
    }
    
    /**
     * opens stapler
     */public void open()
    {
        opened = true;
    }
    
    
    /**
     * closes stapler
     */
    public void close()
    {
        opened = false;
    }

}