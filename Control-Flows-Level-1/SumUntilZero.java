import java.util.Scanner;

public class SumUntilZero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize total
        double total = 0.0;

        // Variable to store user input
        double number = sc.nextDouble();

        // Loop until user enters 0
        while (number != 0) {
            total += number;
            number = sc.nextDouble();
        }

        // Display total
        System.out.println("Total = " + total);

        sc.close();
    }
}
