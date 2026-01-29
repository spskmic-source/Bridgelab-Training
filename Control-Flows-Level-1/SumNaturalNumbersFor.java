import java.util.Scanner;

public class SumNaturalNumbersFor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        int n = sc.nextInt();

        if (n > 0) {  // Check if natural number
            // Compute sum using formula
            int formulaSum = n * (n + 1) / 2;

            // Compute sum using for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            // Print results
            System.out.println("Sum using formula = " + formulaSum);
            System.out.println("Sum using for loop = " + loopSum);

            System.out.println("Both computations are correct.");
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }

        sc.close();
    }
}
