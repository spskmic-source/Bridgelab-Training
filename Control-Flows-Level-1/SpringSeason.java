public class SpringSeason {

    public static void main(String[] args) {

        // Check if two arguments are provided
        if (args.length < 2) {
            System.out.println("Not a Spring Season");
            return;
        }

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Spring Season: March 20 to June 20
        if ((month == 3 && day >= 20) ||
            (month == 4) ||
            (month == 5) ||
            (month == 6 && day <= 20)) {

            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
