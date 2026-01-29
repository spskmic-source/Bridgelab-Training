import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step a: Input number
        int number = sc.nextInt();

        // Step b: Initialize count
        int count = 0;

        // Handle zero case
        if (number == 0) {
            count = 1;
        } else {
            // Step c–e: Loop until number becomes 0
            while (number != 0) {
                number = number / 10;   // Step d: Remove last digit
                count++;               // Step e: Increase count
            }
        }

        // Step f: Display result
        System.out.println("Number of digits = " + count);

        sc.close();
    }
}
