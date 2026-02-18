import java.util.Scanner;

public class RPSGame {

    static String computerChoice() {
        int n = (int)(Math.random() * 3);
        return n == 0 ? "rock" : n == 1 ? "paper" : "scissors";
    }

    static String winner(String u, String c) {
        if (u.equals(c)) return "Draw";
        if ((u.equals("rock") && c.equals("scissors")) ||
            (u.equals("paper") && c.equals("rock")) ||
            (u.equals("scissors") && c.equals("paper")))
            return "User";
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();
        int uw = 0, cw = 0;

        for (int i = 0; i < games; i++) {
            String user = sc.next();
            String comp = computerChoice();
            String win = winner(user, comp);

            if (win.equals("User")) uw++;
            if (win.equals("Computer")) cw++;

            System.out.println(user + " vs " + comp + " → " + win);
        }

        System.out.println("User Wins: " + uw);
        System.out.println("Computer Wins: " + cw);
    }
}
