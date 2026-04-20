import java.util.*;

class Doctor {
    String name;
    String specialty;
    boolean weekendAvailable;

    public Doctor(String name, String specialty, boolean weekendAvailable) {
        this.name = name;
        this.specialty = specialty;
        this.weekendAvailable = weekendAvailable;
    }

    @Override
    public String toString() {
        return name + " | " + specialty;
    }
}

public class DoctorDemo {
    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
                new Doctor("Amit", "Cardiology", true),
                new Doctor("Ravi", "Dermatology", false),
                new Doctor("Neha", "Neurology", true)
        );

        doctors.stream()
               .filter(d -> d.weekendAvailable)
               .sorted(Comparator.comparing(d -> d.specialty))
               .forEach(System.out::println);
    }
}