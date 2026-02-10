import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int tempNumber = number; // store original number

        // b. Find count of digits
        int count = 0;
        if (number == 0) {
            count = 1; // 0 has 1 digit
        } else {
            while (tempNumber != 0) {
                tempNumber = tempNumber / 10;
                count++;
            }
        }

        // c. Store digits in array
        int[] digits = new int[count];
        tempNumber = number; // reset tempNumber
        for (int i = 0; i < count; i++) {
            digits[i] = tempNumber % 10;
            tempNumber = tempNumber / 10;
        }

        // d & e. Display digits in reverse order
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }

        sc.close();
    }
}
