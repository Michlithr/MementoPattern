package operatingSystem;

import java.util.Date;

class OperatingSystemMemento {
    private int backupNumber;
    private Date backupDate;

    OperatingSystemMemento(int backupNumber, Date backupDate) {
        this.backupNumber = backupNumber;
        this.backupDate = backupDate;
    }

    public int getBackupNumber() {
        return backupNumber;
    }

    public Date getBackupDate() {
        return backupDate;
    }
}
