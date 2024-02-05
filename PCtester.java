public class PCtester 
{
    public static void main(String[] args) 
    {
        // Create a PC
        PC myPC = new PC("Intel i7 12700k", "NVIDIA RTX 3080", "Corsair 750W", 16, "ASUS ROG Strix", 1000);

        // Test runProgram method
        System.out.println("Testing runProgram method:");
        myPC.runProgram("Video Editing Software", 40, 3);

        // Display PC information
        System.out.println("\nPC Information after running program:");
        displayPCInfo(myPC);

        // Test idle method
        System.out.println("\nTesting idle method:");
        myPC.idle(5);

        // Display PC information
        System.out.println("\nPC Information after idle state:");
        displayPCInfo(myPC);

        // Test download method
        System.out.println("\nTesting download method:");
        myPC.download("Game A", 50);

        // Display PC information
        System.out.println("\nPC Information after downloading Game A:");
        displayPCInfo(myPC);
    }

    // Helper method to display PC information
    private static void displayPCInfo(PC pc) 
    {
        System.out.println("PC Information:");
        System.out.println("CPU: " + pc.getCpu());
        System.out.println("GPU: " + pc.getGpu());
        System.out.println("PSU: " + pc.getPsu());
        System.out.println("RAM: " + pc.getRam() + " GB");
        System.out.println("Motherboard: " + pc.getMotherboard());
        System.out.println("Storage: " + pc.getStorage() + " GB");
        System.out.println("Temperature: " + pc.getTemp() + " °C");
        System.out.println("Programs installed: " + pc.getPrograms());
        System.out.println();
    }
}
