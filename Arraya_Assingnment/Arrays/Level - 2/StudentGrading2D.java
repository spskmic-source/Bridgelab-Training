import java.util.Scanner;

public class StudentGrading2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // 2D Array: Rows = Students, Columns = 3 (0: Phys, 1: Chem, 2: Math)
        double[][] marksTable = new double[numStudents][3];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\n--- Student " + (i + 1) + " ---");
            String[] subjects = {"Physics", "Chemistry", "Maths"};

            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for " + subjects[j] + ": ");
                marksTable[i][j] = sc.nextDouble();

                // Validation for negative marks
                if (marksTable[i][j] < 0) {
                    System.out.println("Invalid input. Please enter positive marks.");
                    j--; // Repeat input for the current subject
                }
            }

            // Calculate percentage using the 2D array row
            percentages[i] = (marksTable[i][0] + marksTable[i][1] + marksTable[i][2]) / 3.0;

            // Determine Grade based on the table
            if (percentages[i] >= 80) grades[i] = 'A';
            else if (percentages[i] >= 70) grades[i] = 'B';
            else if (percentages[i] >= 60) grades[i] = 'C';
            else if (percentages[i] >= 50) grades[i] = 'D';
            else if (percentages[i] >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }

        // Display results
        System.out.println("\n" + "=".repeat(60));
        System.out.printf("%-10s %-8s %-8s %-8s %-12s %-6s\n", "Student", "Phys", "Chem", "Math", "Percentage", "Grade");
        System.out.println("-".repeat(60));
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d %-8.1f %-8.1f %-8.1f %-12.2f %-6c\n", 
                (i + 1), marksTable[i][0], marksTable[i][1], marksTable[i][2], percentages[i], grades[i]);
        }
    }
}