package operatingSystem;

import java.util.ArrayList;
import java.util.List;

public class OperatingSystemCaretaker {
    private List<OperatingSystemMemento> mementos = new ArrayList<>();

    public void addMemento(OperatingSystemMemento operatingSystemMemento){
        mementos.add(operatingSystemMemento);
        System.out.println("Backup nr: " + operatingSystemMemento.getBackupNumber() + " added of " + operatingSystemMemento.getBackupDate()
                + " at index: " + (mementos.size() - 1));
    }

    public OperatingSystemMemento getMemento(int index){
        System.out.println("Loaded backup nr: " + mementos.get(index).getBackupNumber() + " saved of " + mementos.get(index).getBackupDate());
        return mementos.get(index);
    }


}
