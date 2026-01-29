import java.util.Scanner;

public class VotingEligibility {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int age = sc.nextInt();

        // Check voting eligibility
        if (age >= 18) {
            System.out.println("Congratulation Your age is " + age + " and You can vote.");
        } else {
            System.out.println("Sorry... Your age is  " + age + " and you cannot vote.");
        }

        sc.close();
    }
}
