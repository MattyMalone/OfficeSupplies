
import java.util.ArrayList;
public class PC
{
    private String cpu;
    private String gpu;
    private String psu;
    private int ram;
    private String Motherboard;
    private int storage;
    private double temp = 30.0;
    private ArrayList<String> programs;


    public PC(String cpu, String gpu, String psu, int ram, String Motherboard, int storage)
    {
        this.cpu = cpu;
        this.gpu = gpu;
        this.psu = psu;
        this.ram = ram;
        this.Motherboard = Motherboard;
        this.storage = storage;
        programs = new ArrayList<String>();
    }
    public void runProgram(String programName, int programDurationMinutes, int rigor) 
    {

        double temperatureIncreasePerMinute;
        assert rigor < 4;
        assert rigor > 0;
        
        if(rigor == 1)
        {
            temperatureIncreasePerMinute = 2.0;
        }
        else if(rigor == 2)
        {
            temperatureIncreasePerMinute = 4.0;
        }
        else
        {
            temperatureIncreasePerMinute = 8.0;
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
    public void idle(int idleDurationMinutes) 
    {
   
        double temperatureDecreasePerMinute = 20.0; 
        double minimumTemperature = 30.0; 

        for (int second = 1; second <= idleDurationMinutes; second++) 
        {
         
            temp -= temperatureDecreasePerMinute;

       
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
    public void download(String program, int size)
    {
        assert storage >= size;
        programs.add(program);
        storage -= size;
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
        return Motherboard;
    }

    public ArrayList<String> getPrograms()
    {
        return programs;
    }

    public void setStorage(int storage)
    {
        this.storage = storage;
    }

    public int getStorage()
    {
        return storage;
    }
    public double getTemp()
    {
        return temp;
    }
}

    
        
        
        
        
    
