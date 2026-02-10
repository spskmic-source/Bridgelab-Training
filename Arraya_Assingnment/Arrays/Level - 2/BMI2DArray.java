import java.util.Scanner;

public class BMI2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Take input for a number of persons
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        // b. Create a multi-dimensional array to store weight, height and BMI
        // Rows = number of people
        // Columns = 3 (0: Weight, 1: Height, 2: BMI)
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // c. Take input for weight and height with validation
        for (int i = 0; i < number; i++) {
            System.out.println("\n--- Person " + (i + 1) + " ---");

            // Input Weight with Validation
            // We store weight directly into column 0
            do {
                System.out.print("Enter Weight (kg): ");
                personData[i][0] = scanner.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Error: Weight must be positive. Try again.");
                }
            } while (personData[i][0] <= 0);

            // Input Height with Validation
            // We store height directly into column 1
            do {
                System.out.print("Enter Height (m): ");
                personData[i][1] = scanner.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Error: Height must be positive. Try again.");
                }
            } while (personData[i][1] <= 0);

            // d. Calculate BMI and store in personData array (Column 2)
            // BMI = Weight / (Height * Height)
            // personData[i][0] is Weight, personData[i][1] is Height
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine Weight Status
            // We check the BMI stored in column 2 against the table
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // e. Display the height, weight, BMI and status
        System.out.println("\n===========================================================");
        System.out.printf("%-10s %-12s %-12s %-10s %-15s%n", 
                          "Person", "Height(m)", "Weight(kg)", "BMI", "Status");
        System.out.println("===========================================================");

        for (int i = 0; i < number; i++) {
            System.out.printf("%-10d %-12.2f %-12.2f %-10.2f %-15s%n",
                    (i + 1), 
                    personData[i][1], // Height
                    personData[i][0], // Weight
                    personData[i][2], // BMI
                    weightStatus[i]); // Status
        }

        scanner.close();
    }
}