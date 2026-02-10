import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take input for a number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        long temp = Math.abs(number);
        long original = temp;

        // b. Find the count of digits
        int count = String.valueOf(temp).length();

        // c. Store digits in an array
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = (int) (temp % 10);
            temp /= 10;
        }

        // d. Find frequency using an array of size 10 (0-9)
        int[] freq = new int[10];
        for (int digit : digits) {
            freq[digit]++;
        }

        // e. Display the frequency
        System.out.println("\nFrequency of digits in " + original + ":");
        System.out.println("Digit | Frequency");
        System.out.println("---------------");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) { // Only show digits that actually appear
                System.out.printf("  %d   |    %d\n", i, freq[i]);
            }
        }
        sc.close();
    }
}