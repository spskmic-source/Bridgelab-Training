import java.util.Scanner;

public class SumUntilZeroOrNegative {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize total
        double total = 0.0;

        while (true) {
            // Take user input
            double number = sc.nextDouble();

            // Break if 0 or negative number is entered
            if (number <= 0) {
                break;
            }

            // Add to total
            total += number;
        }

        // Display total
        System.out.println("Total = " + total);

        sc.close();
    }
}
