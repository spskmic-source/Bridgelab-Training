import java.util.Scanner;

public class SimpleGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Simple Input
        System.out.println("Enter marks for Physics, Chemistry, and Maths:");
        double phy = sc.nextDouble();
        double chem = sc.nextDouble();
        double math = sc.nextDouble();

        // 2. Simple Calculation (Average is the same as percentage out of 100)
        double average = (phy + chem + math) / 3;

        // Variables to hold the result
        String grade = "";
        String remarks = "";

        // 3. Logic based on the table
        if (average >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (average >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (average >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching standards";
        } else if (average >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (average >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // 4. Print the output simply
        System.out.println("-------------------------");
        System.out.println("Average Mark: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: (" + remarks + ")");
    }
}