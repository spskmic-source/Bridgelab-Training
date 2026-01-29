import java.util.Scanner;

public class FactorsWhileLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("The number " + number + " is not a positive integer");
        } else {
            System.out.println("Factors of " + number + " are:");

            int i = 1; // counter
            while (i < number) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++; // increment counter
            }
        }

        sc.close();
    }
}
