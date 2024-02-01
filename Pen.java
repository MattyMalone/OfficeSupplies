/**
 * Alex Chui
 * 1/2/2024
 */

public class Pen
{
    private String color;
    private double inkPercentage;
    private boolean on;
    
    
    /**
     * @param color the color of the pen
     * @param inkPercentage how much ink is left in the pen
     * @param on whether or not the pen is "on" or "off"
     */
    public Pen(String color)
    {
        this.color = color;
        this.inkPercentage = 100.0;
        this.on = false;
    }
    
    /**
     * @return the amount of Ink left in the pen
     */public double getInk()
    {
        return inkPercentage;
    }
    
    /**
     * @return the color of the pen
     */
    public String getColor()
    {
        return color;
    }
    
    /**
     * @return whether or not the pen is on
     */public boolean getOn()
    {
        return on;
    }
    
    /**
     * the click emethod turns the pen on/off
     * 
     */
    public void click()
    {
        if (on == false)
        {
            on = true;
        }
        else if (on == true)
        {
            on = false;
        }
    }
    
    /**
     * the use method uses the pen and depletes the amount of ink
     * 
     * precondition: amount of ink >= 5 %
     */
    public void use()
    {
        if(on)
        {
            inkPercentage -= 5;
        }
    }
    
}