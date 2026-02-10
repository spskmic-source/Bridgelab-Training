import java.util.Scanner;

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // b. Create arrays to store marks, percentages, and grades
        double[] physics = new double[numStudents];
        double[] chemistry = new double[numStudents];
        double[] maths = new double[numStudents];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        // c. Take input for marks with validation
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\n--- Entering data for Student " + (i + 1) + " ---");

            // Physics input
            System.out.print("Enter Physics marks: ");
            physics[i] = sc.nextDouble();
            if (physics[i] < 0) {
                System.out.println("Invalid input. Please enter positive marks.");
                i--; // Decrement index to repeat input for this student
                continue;
            }

            // Chemistry input
            System.out.print("Enter Chemistry marks: ");
            chemistry[i] = sc.nextDouble();
            if (chemistry[i] < 0) {
                System.out.println("Invalid input. Please enter positive marks.");
                i--; 
                continue;
            }

            // Maths input
            System.out.print("Enter Maths marks: ");
            maths[i] = sc.nextDouble();
            if (maths[i] < 0) {
                System.out.println("Invalid input. Please enter positive marks.");
                i--; 
                continue;
            }

            // d. Calculate percentage (assuming max marks per subject is 100)
            percentages[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            // Calculate grade based on the provided table
            if (percentages[i] >= 80) {
                grades[i] = 'A'; // 80% and above
            } else if (percentages[i] >= 70) {
                grades[i] = 'B'; // 70-79%
            } else if (percentages[i] >= 60) {
                grades[i] = 'C'; // 60-69%
            } else if (percentages[i] >= 50) {
                grades[i] = 'D'; // 50-59%
            } else if (percentages[i] >= 40) {
                grades[i] = 'E'; // 40-49%
            } else {
                grades[i] = 'R'; // 39% and below
            }
        }

        // e. Display the marks, percentages, and grades
        System.out.println("\n" + "=".repeat(65));
        System.out.printf("%-10s %-8s %-8s %-8s %-12s %-8s\n", 
                          "Student", "Phys", "Chem", "Math", "Percentage", "Grade");
        System.out.println("-".repeat(65));

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("Student %-2d %-8.1f %-8.1f %-8.1f %-12.2f %-8c\n", 
                              (i + 1), physics[i], chemistry[i], maths[i], percentages[i], grades[i]);
        }
        System.out.println("=".repeat(65));
        
        sc.close();
    }
}