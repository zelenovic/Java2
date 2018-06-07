
package computer;


public class Computer {
    
    private double processTact;
    private double memory;
    private int hardDrive;

    public double getProcessTact() {
        return processTact;
    }

    public void setProcessTact(double processTact) {
        this.processTact = processTact;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }
    
    public Computer() {
        this.processTact = 2.4;
        this.memory = 16.0;
        this.hardDrive = 1024;
    }
    
}
