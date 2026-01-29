import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input: Weight in kg and Height in cm
        System.out.println("--- BMI Calculator ---");
        System.out.print("Enter weight (in kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter height (in cm): ");
        double heightCm = sc.nextDouble();

        // 2. Calculation: Convert height to meters and calculate BMI
        // Formula: BMI = weight / (height in meters * height in meters)
        double heightM = heightCm / 100.0; 
        double bmi = weight / (heightM * heightM);

        // 3. Determine Status based on the table
        String status;

        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi < 25.0) { 
            // This covers the range 18.5 to 24.9
            status = "Normal";
        } else if (bmi < 40.0) { 
            // This covers the range 25.0 to 39.9
            status = "Overweight";
        } else {
            // This covers 40.0 and above
            status = "Obese";
        }

        // 4. Output: Show BMI and Status
        System.out.println("\n--- Result ---");
        // Printing BMI formatted to 2 decimal places for better readability
        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("Status: " + status);
        
        sc.close();
    }
}