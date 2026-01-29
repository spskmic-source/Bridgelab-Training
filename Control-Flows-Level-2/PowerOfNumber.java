import java.util.Scanner;

public class PowerOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number and power
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power (positive integer): ");
        int power = sc.nextInt();

        if (power < 0) {
            System.out.println("Power must be a positive integer.");
        } else {
            int result = 1;

            // Multiply number 'power' times
            for (int i = 1; i <= power; i++) {
                result *= number;
            }

            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        sc.close();
    }
}
