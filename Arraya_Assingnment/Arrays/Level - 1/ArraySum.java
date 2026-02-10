import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Array of 10 elements and total initialized
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // b. Infinite while loop
        while (true) {

            System.out.print("Enter a number: ");
            double value = sc.nextDouble();

            // c. Break if number is 0 or negative
            if (value <= 0) {
                break;
            }

            // d. Break if array size reaches 10
            if (index == 10) {
                break;
            }

            // e. Store value and increment index
            numbers[index] = value;
            index++;
        }

        // f. Calculate total using for loop
        for (int i = 0; i < index; i++) {
            System.out.println("Number: " + numbers[i]);
            total = total + numbers[i];
        }

        // g. Display total
        System.out.println("Total sum = " + total);

        sc.close();
    }
}
