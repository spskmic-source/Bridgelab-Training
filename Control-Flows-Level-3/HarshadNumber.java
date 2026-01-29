import java.util.Scanner;

public class HarshadNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step b: Input number
        int number = sc.nextInt();
        int originalNumber = number;

        // Step c: Initialize sum
        int sum = 0;

        // Step d–e: While loop to get each digit and add to sum
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }

        // Step f–g: Check Harshad condition
        if (originalNumber % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }

        sc.close();
    }
}
