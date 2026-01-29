import java.util.Scanner;

public class AbundantNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step b: Input number
        int number = sc.nextInt();

        // Step c: Initialize sum
        int sum = 0;

        // Step d–f: For loop to find divisors and add to sum
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Step g–h: Check Abundant condition
        if (sum > number) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }

        sc.close();
    }
}
