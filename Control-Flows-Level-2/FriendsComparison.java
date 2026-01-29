import java.util.Scanner;

public class FriendsComparison {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input ages
        System.out.print("Enter age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter age of Anthony: ");
        int ageAnthony = sc.nextInt();

        // Input heights
        System.out.print("Enter height of Amar (in cm): ");
        double heightAmar = sc.nextDouble();
        System.out.print("Enter height of Akbar (in cm): ");
        double heightAkbar = sc.nextDouble();
        System.out.print("Enter height of Anthony (in cm): ");
        double heightAnthony = sc.nextDouble();

        // Find youngest
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend = "";
        if (youngestAge == ageAmar) {
            youngestFriend = "Amar";
        } else if (youngestAge == ageAkbar) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        // Find tallest
        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = "";
        if (tallestHeight == heightAmar) {
            tallestFriend = "Amar";
        } else if (tallestHeight == heightAkbar) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        // Display results
        System.out.println("The youngest friend is: " + youngestFriend + " (Age: " + youngestAge + ")");
        System.out.println("The tallest friend is: " + tallestFriend + " (Height: " + tallestHeight + " cm)");

        sc.close();
    }
}
