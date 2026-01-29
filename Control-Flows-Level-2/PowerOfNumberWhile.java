import java.util.Scanner;

public class PowerOfNumberWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number and power
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power (non-negative integer): ");
        int power = sc.nextInt();

        if (power < 0) {
            System.out.println("Power must be a non-negative integer.");
        } else {
            int result = 1;
            int counter = 0;

            // Multiply number 'power' times using while loop
            while (counter < power) {
                result *= number;
                counter++;
            }

            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        sc.close();
    }
}
