import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step b: Input number
        int number = sc.nextInt();
        int sum = 0;
        int originalNumber = number;

        // Step c: While loop until originalNumber becomes 0
        while (originalNumber != 0) {

            // Step d: Get last digit
            int digit = originalNumber % 10;
            sum += digit * digit * digit;   // cube and add to sum

            // Step e: Remove last digit
            originalNumber = originalNumber / 10;
        }

        // Step f: Check Armstrong condition
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }

        sc.close();
    }
}
