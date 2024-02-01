

public class pc
{
    private int watts;
    private String cpu;
    private String gpu;
    private String psu;
    private int ram;
    private String Motherboard;
    private int storage;
    private double temp;


    public pc(int watts, String cpu, String gpu, String psu, int ram, String Motherboard, int storage)
    {
        this.watts = watts;
        this.cpu = cpu;
        this.gpu = gpu;
        this.psu = psu;
        this.ram = ram;
        this.motherboard = motherboard;
        this.storage = storage;
    }
    public void runProgram(String programName, int programDurationMinutes, int rigor) 
    {

        double temperatureIncreasePerMinute;
        assert rigor < 4;
        assert rigor > 0;
        
        if(rigor == 1)
        {
            temperatureIncreasePerMinute = 0.3;
        }
        else if(rigor == 2)
        {
            temperatureIncreasePerMinute = 0.5;
        }
        else
        {
            temperatureIncreasePerMinute = 0.8;
        }
        
        double temperatureCap = 0.0;
        if(rigor == 1)
        {
            temperatureCap = 60.0;
        }
        else if(rigor == 2)
        {
            temperatureCap = 75.0;
        }
        else
        {
            temperatureCap = 100.0;
        }

        double crashTemperature = 100.0; 

        for (int minute = 1; minute <= programDurationMinutes; minute++) 
        {
           
            System.out.println("Minute " + minute + ": Program is running...");

            temp += temperatureIncreasePerMinute;

            if (temp > temperatureCap) 
            {
                temp = temperatureCap;
                System.out.println("Temperature capped at " + temperatureCap + " °C");
            }

            // Display temperature
            System.out.println("Temperature: " + temp + " °C");

            // Check for crashing (only for rigor 3)
            if (rigor == 3 && temp >= crashTemperature) 
            {
                System.out.println("PC has crashed due to excessive temperature!");
                break; 
            }

            try 
            {
                Thread.sleep(1000); 
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    
            System.out.println("Program execution complete. Total temperature increase: " + (temp - temperatureIncreasePerMinute) + " °C");
    }
    public void idle(int idleDurationSeconds) 
    {
   
        double temperatureDecreasePerSecond = 0.1; 
        double minimumTemperature = 30.0; 

        for (int second = 1; second <= idleDurationSeconds; second++) 
        {
         
            temp -= temperatureDecreasePerSecond;

       
            if (temp < minimumTemperature) 
            {
                temp = minimumTemperature;
                break; 
            }

            try 
            {
                Thread.sleep(1000); 
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }
    public int getWatts() 
    {
        return watts;
    }

    public void setWatts(int watts) 
    {
        this.watts = watts;
    }

    public String getCpu() 
    {
        return cpu;
    }

    public void setCpu(String cpu) 
    {
        this.cpu = cpu;
    }

    public String getGpu() 
    {
        return gpu;
    }

    public void setGpu(String gpu) 
    {
        this.gpu = gpu;
    }

    public String getPsu() {
        return psu;
    }

    public void setPsu(String psu) 
    {
        this.psu = psu;
    }

    public int getRam() 
    {
        return ram;
    }

    public void setRam(int ram) 
    {
        this.ram = ram;
    }

    public String getMotherboard() 
    {
        return motherboard;
    }
}

    
        
        
        
        
    
