import java.util.Scanner;

public class RocketLaunch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int counter = sc.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        sc.close();
    }
}
