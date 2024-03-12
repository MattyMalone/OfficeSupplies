
/**
 * Write a description of class StaplerTester here.
 *
 * @author (Alex Chui)
 * @version (2024/2/5)
 */
public class StaplerTester
{
    public static void main(String[] args)
    {
        System.out.println("Initiating testing...");
        int testsPassed = 0;
        
        System.out.println("Checking new stapler object...");
        Stapler stapler = new Stapler();
        testsPassed++;
        System.out.println("Stapler created!");
        
        
        System.out.println("---------------");
        System.out.println("Checking initial amount of staples in the stapler...");
        if(stapler.getStaplesRemaining() == 100)
        {
            testsPassed++;
            System.out.println("Amount of 100 is correct!");
        }
        else
        {
            System.out.println("Amount of 100 not found. Test failed.");
        }
        
        
        System.out.println("---------------");
        System.out.println("Checking unJam method...");
        stapler.jam();
        stapler.unJam();
        if(stapler.getJammed() == false)
        {
            testsPassed++;
            System.out.println("Stapler unJammed correctly!");
        }
        else
        {
            System.out.println("Stapler not unJammed. Test failed.");
        }
        
        System.out.println("---------------");
        System.out.println("Checking Open method...");
        stapler.open();
        if(stapler.getOpened() == true)
        {
            testsPassed++;
            System.out.println("Stapler opened correctly!");
        }
        else
        {
            System.out.println("Stapler not opened. Test failed.");
        }
        
        
        System.out.println("---------------");
        System.out.println("Testing staple method...");
        stapler.close();
        stapler.staple();
        if(stapler.getStaplesRemaining() == 99)
        {
            testsPassed++;
            System.out.println("Amount of 99 is correct!");
        }
        else
        {
            System.out.println("Amount of 99 not found. Test failed.");
        }
        
    
        
        
        System.out.println("---------------");
        System.out.println("Jamming stapler...");
        stapler.jam();
        System.out.println("---------------");
        System.out.println("Testing staple method when stapler is jammed...");
        stapler.staple();
        if(stapler.getStaplesRemaining() == 99)
        {
            testsPassed++;
            System.out.println("Amount of 99 is correct!");
        }
        else
        {
            System.out.println("Percentage of 99 not found. Test failed.");
        }
        stapler.unJam();
        
        System.out.println("---------------");
        System.out.println("Opening stapler...");
        stapler.open();
        System.out.println("---------------");
        System.out.println("Testing staple method while stapler is open..");
        stapler.staple();
        if(stapler.getStaplesRemaining() == 99)
        {
            testsPassed++;
            System.out.println("Amount of 99 is correct!");
        }
        else
        {
            System.out.println("Percentage of 99 not found. Test failed.");
        }
        
        
        System.out.println("---------------");
        System.out.println("Testing refill method..");
        stapler.refill();
        if(stapler.getStaplesRemaining() == 100)
        {
            testsPassed++;
            System.out.println("Amount of 100 is correct!");
        }
        else
        {
            System.out.println("Percentage of 100 not found. Test failed.");
        }
        
        
        System.out.println("---------------");
        System.out.println("Closing stapler and stapling one time again..");
        stapler.close();
        stapler.staple();
        System.out.println(stapler.getStaplesRemaining());
        
        System.out.println("---------------");
        System.out.println("Testing refill method while stapler is closed..");
    
        stapler.refill();
        if(stapler.getStaplesRemaining() == 99)
        {
            testsPassed++;
            System.out.println("Amount of 99 is correct!");
        }
        else
        {
            System.out.println("Percentage of 99 not found. Test failed.");
        }
        
        
        
        
        System.out.println("---------------");
        System.out.println("Tests passed: " + testsPassed + "/9");
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> d48dd3449db403dabf6b023e7b22b5c2ccd797df
