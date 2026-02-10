import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Get integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Define array to store multiplication results (1 to 10)
        int[] table = new int[10];

        // b. Store results in array
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // c. Display multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }
}
