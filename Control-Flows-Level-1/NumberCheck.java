import java.util.Scanner;

public class NumberCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int number = sc.nextInt();

        // Check number type
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

        sc.close();
    }
}
