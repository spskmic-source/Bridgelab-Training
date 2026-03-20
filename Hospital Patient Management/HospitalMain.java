// Interface
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// Abstract Class
abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    // Sensitive data (encapsulation)
    private String diagnosis;

    // Constructor
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getters
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    protected void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    // Abstract Method
    public abstract double calculateBill();

    // Concrete Method
    public void getPatientDetails() {
        System.out.println("ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// InPatient Class
class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private String record;

    public InPatient(int id, String name, int age, int days) {
        super(id, name, age);
        this.daysAdmitted = days;
    }

    public double calculateBill() {
        return daysAdmitted * 2000; // per day charge
    }

    public void addRecord(String record) {
        this.record = record;
        setDiagnosis(record);
    }

    public void viewRecords() {
        System.out.println("InPatient Record: " + record);
    }
}

// OutPatient Class
class OutPatient extends Patient implements MedicalRecord {
    private String record;

    public OutPatient(int id, String name, int age) {
        super(id, name, age);
    }

    public double calculateBill() {
        return 500; // fixed consultation fee
    }

    public void addRecord(String record) {
        this.record = record;
        setDiagnosis(record);
    }

    public void viewRecords() {
        System.out.println("OutPatient Record: " + record);
    }
}

// Main Class
public class HospitalMain {

    // Polymorphism Method
    public static void processPatient(Patient p) {
        p.getPatientDetails();

        double bill = p.calculateBill();
        System.out.println("Bill: " + bill);

        if (p instanceof MedicalRecord) {
            MedicalRecord m = (MedicalRecord) p;
            m.viewRecords();
        }

        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        Patient p1 = new InPatient(1, "Rahul", 30, 3);
        Patient p2 = new OutPatient(2, "Aman", 25);

        // Add records
        ((MedicalRecord) p1).addRecord("Fever, Admitted");
        ((MedicalRecord) p2).addRecord("Cold, Checkup");

        Patient[] patients = {p1, p2};

        for (Patient p : patients) {
            processPatient(p); // polymorphism
        }
    }
}