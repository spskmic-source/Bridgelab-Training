import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // a. Define integer array of 5 elements
        int[] num = new int[5];

        // Take user input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        // b & c. Check positive, negative, zero and even/odd
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) {
                if (num[i] % 2 == 0) {
                    System.out.println(num[i] + " is a positive even number");
                } else {
                    System.out.println(num[i] + " is a positive odd number");
                }
            } 
            else if (num[i] < 0) {
                System.out.println(num[i] + " is a negative number");
            } 
            else {
                System.out.println("Number is zero");
            }
        }

        // d. Compare first and last element
        if (num[0] == num[num.length - 1]) {
            System.out.println("First and last elements are equal");
        } 
        else if (num[0] > num[num.length - 1]) {
            System.out.println("First element is greater than last element");
        } 
        else {
            System.out.println("First element is less than last element");
        }

        sc.close();
    }
}
