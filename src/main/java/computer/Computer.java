package computer;

public class Computer {
    
    private String operatingSystem = "Linux";
    private double pocessTact = 2.4;
    private double memory = 16.0;
    private int hardDrive = 500;
    
    public String getOperatingSystem() {
        return this.operatingSystem;
    }
    
    public void setOperatingSystem(String newOperatingSystem) {
        this.operatingSystem = newOperatingSystem;
    }
    
    public double getProcessTact() {
        return this.pocessTact;
    }
    
    public void setProcessTact(double newProcessTact) {
        this.pocessTact = newProcessTact;
    }
    
    public double getMemory() {
        return this.memory;
    }
    
    public void setMemory(double newMemory) {
        this.memory = newMemory;
    }
    
    public int getHardDrive() {
        return this.hardDrive;
    }
    
    public void setHardDrive(int newHardDrive) {
        this.hardDrive = newHardDrive;
    }
    
    public Computer() {
        
    }
    
    public Computer(String operatingSystem, double processTact, double memory, int hardDrive) {
        this.operatingSystem = operatingSystem;
        this.pocessTact = processTact;
        this.memory = memory;
        this.hardDrive = hardDrive;
    }
    
}
