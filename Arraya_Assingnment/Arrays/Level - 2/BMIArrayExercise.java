import java.util.Scanner;

public class BMIArrayExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step A: Take input for the number of persons
        System.out.print("Enter number of persons: ");
        int n = scanner.nextInt();

        // Step B: Create arrays to store data for 'n' persons
        // We use double for numbers and String for text status
        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmiValues = new double[n];
        String[] status = new String[n];

        // Step C: Input loop - Fill the weight and height arrays
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Person " + (i + 1) + " ---");
            System.out.print("Enter Weight (kg): ");
            weights[i] = scanner.nextDouble(); // Store in weight array

            System.out.print("Enter Height (m): ");
            heights[i] = scanner.nextDouble(); // Store in height array
        }

        // Step D: Processing loop - Calculate BMI and determine Status
        for (int i = 0; i < n; i++) {
            // 1. Calculate BMI
            bmiValues[i] = weights[i] / (heights[i] * heights[i]);

            // 2. Determine Status based on the table in the image
            if (bmiValues[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmiValues[i] >= 18.5 && bmiValues[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmiValues[i] >= 25.0 && bmiValues[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Step E: Output loop - Display all array data
        System.out.println("\n=======================================================");
        System.out.printf("%-10s %-10s %-10s %-10s %-15s%n", 
                          "Person", "Height", "Weight", "BMI", "Status");
        System.out.println("=======================================================");

        for (int i = 0; i < n; i++) {
            // Accessing index 'i' from all arrays to print one person's full details
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-15s%n", 
                              (i + 1), heights[i], weights[i], bmiValues[i], status[i]);
        }

        scanner.close();
    }
}