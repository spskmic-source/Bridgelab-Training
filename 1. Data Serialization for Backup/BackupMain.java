import java.io.*;

// Marker Interface (no methods)
interface Backup {
}

// Class marked for backup
class UserData implements Backup, Serializable {
    private String name;
    private int age;

    public UserData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Class NOT marked for backup
class TempData {
    private String data;

    public TempData(String data) {
        this.data = data;
    }
}

// Main Class
public class BackupMain {

    // Method to process backup
    public static void backupObject(Object obj) {

        if (obj instanceof Backup) {
            try {
                FileOutputStream file = new FileOutputStream("backup.ser");
                ObjectOutputStream out = new ObjectOutputStream(file);

                out.writeObject(obj);

                out.close();
                file.close();

                System.out.println("Backup successful!");
            } catch (Exception e) {
                System.out.println("Error during backup");
            }
        } else {
            System.out.println("Object not eligible for backup");
        }
    }

    public static void main(String[] args) {

        UserData u = new UserData("Rahul", 25);
        TempData t = new TempData("Temporary");

        backupObject(u); // will backup
        backupObject(t); // will not backup
    }
}