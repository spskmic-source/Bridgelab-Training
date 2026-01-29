import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input salary and years of service
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        double bonus = 0.0;

        // Check if employee is eligible for bonus
        if (years > 5) {
            bonus = salary * 0.05; // 5% bonus
        }

        System.out.println("Bonus amount = " + bonus);

        sc.close();
    }
}
