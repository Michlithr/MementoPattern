package operatingSystem;

import java.util.Date;

public class OperatingSystem {
    private int backupNumber = 0;
    private Date backupDate;

    public void createBackup(){
        backupNumber++;
        backupDate = new Date();
        System.out.println("Backup nr: " + backupNumber + " created at: " + backupDate);
    }

    public OperatingSystemMemento save(){
        return new OperatingSystemMemento(this.backupNumber, this.backupDate);
    }

    public void load(OperatingSystemMemento operatingSystemMemento){
        this.backupNumber = operatingSystemMemento.getBackupNumber();
        this.backupDate = operatingSystemMemento.getBackupDate();
    }
}
