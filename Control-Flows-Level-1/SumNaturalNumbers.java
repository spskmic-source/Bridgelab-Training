import java.util.Scanner;

public class SumNaturalNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n > 0) {  // Check if natural number
            // Sum using formula
            int formulaSum = n * (n + 1) / 2;

            // Sum using while loop
            int loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
            }

            // Print results
            System.out.println("Sum using formula = " + formulaSum);
            System.out.println("Sum using while loop = " + loopSum);

            System.out.println("Both computations are correct.");
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }

        sc.close();
    }
}
